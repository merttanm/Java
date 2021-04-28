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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MERT
 */
public class SClient {
    
    public static int idCount;
    public Server server;
    public int id;
    public Socket socket;
    public ObjectInputStream cInput;
    public ObjectOutputStream cOutput;
    public ClientListenThread listenThread;

    public SClient(Socket socket, Server server) throws IOException {
        this.id=idCount;
        idCount++;
        this.socket = socket;
        this.cOutput = new ObjectOutputStream(this.socket.getOutputStream());
        this.cInput = new ObjectInputStream(this.socket.getInputStream());
        this.listenThread = new ClientListenThread(this);
        System.out.println("Clint Connection...");
    }

    public void sendMessage(Object msg) {

        if (this.socket.isConnected()) {
            try {

                cOutput.writeObject(msg);
            } catch (IOException ex) {
                Logger.getLogger(SClient.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void Listen() {
        this.listenThread.start();
        System.out.println("Clint listining...");

    }

}

class ClientListenThread extends Thread {

    private SClient client;

    public ClientListenThread(SClient client) {
        this.client = client;
    }

    @Override
    public void run() {

        while (!this.client.socket.isClosed()) {

            try {
                System.out.println("Waiting message from clint");
                Object msg = this.client.cInput.readObject();
                System.out.println(msg.toString());
                FrmServer.clintMessageModel.addElement(msg);
                
            } catch (IOException ex) {
                this.client.server.RemoveClint(client);
                Logger.getLogger(ClientListenThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                this.client.server.RemoveClint(client);
                Logger.getLogger(ClientListenThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
