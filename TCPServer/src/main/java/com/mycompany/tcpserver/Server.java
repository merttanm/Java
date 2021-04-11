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
public class Server {

    public ServerSocket socket;
    public ListenThread ListenThread;
    public int port;

    public Server(int port) {

        try {
            this.port = port;
            this.socket = new ServerSocket(port);
            this.ListenThread=new ListenThread(this.socket);
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Listen() {
      this.ListenThread.start();
    }
}

class ListenThread extends Thread {

    private ServerSocket socket;

    public ListenThread(ServerSocket socket) {
            this.socket = socket;
    }
    @Override
    public void run() {

        while (!this.socket.isClosed()) {
            try {
                System.out.println("Listening");
                Socket nSocket = this.socket.accept();     
                SClient nClient= new SClient(nSocket);
                nClient.Listen();
                
                /*ObjectOutputStream cOutput = new ObjectOutputStream(nSocket.getOutputStream());
                ObjectInputStream cInput = new ObjectInputStream(nSocket.getInputStream());

                Object obj = cInput.readObject();
                System.out.println(obj.toString());
*/
             

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } /*catch (ClassNotFoundException ex) {
                Logger.getLogger(ListenThread.class.getName()).log(Level.SEVERE, null, ex);
            } */
            /*catch (ClassNotFoundException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }*/

        }
    }

}
