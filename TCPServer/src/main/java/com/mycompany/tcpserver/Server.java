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

    public void SendBoardCase(Object msg) {
        for (SClient client : clients) {

            try {
                client.cOutput.writeObject(msg);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
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
                
                SClient nClient = new SClient(nSocket);
                nClient.Listen();
                this.server.clients.add(nClient);

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
