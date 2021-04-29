/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tcpserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MERT
 */
public class Server {

    public ServerSocket socket;
    public ListenThread ListenThread;
    public int port;
    public ArrayList<SClient> clients;

    public Server(int port) {

        try {
            this.port = port;
            this.socket = new ServerSocket(port);
            this.clients = new ArrayList<SClient>();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Listen() {
        this.ListenThread = new ListenThread(this);
        this.ListenThread.start();
    }

    public void SendBoardCaseMessage(Object msg) {
        for (SClient client : clients) {

            client.sendMessage(msg);

        }
    }

    public void SendClintBoardCase(Object msg, int id) {

        for (SClient client : clients) {
            if (id == client.id) {
                client.sendMessage(msg);
                break;
            }

        }
    }

    public void RemoveClint(SClient client) {
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).id == client.id) {
                this.clients.get(i).cloase();
                this.clients.remove(i);
                break;
            }
        }
        this.UpdateClientList();

    }

    public void UpdateClientList() {

        FrmServer.clintConnectinMessageModel.removeAllElements();
        for (SClient client : clients) {
            FrmServer.clintConnectinMessageModel.addElement(client.id);
        }
    }

    public void MessageReceived(Object msg) {

        FrmServer.clintConnectinMessageModel.addElement(msg.toString());

    }

}

class ListenThread extends Thread {

    private Server server;

    public ListenThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {

        while (!this.server.socket.isClosed()) {
            try {
                System.out.println("Listening");
                Socket nSocket = this.server.socket.accept();

                SClient nClient = new SClient(nSocket, this.server);
                nClient.Listen();
                this.server.clients.add(nClient);
                FrmServer.clintConnectinMessageModel.addElement(nClient.id);

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
