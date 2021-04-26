/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tcpclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MERT
 */
public class Client {

    public Socket socket;
    public ObjectInputStream cInput;
    public ObjectOutputStream cOutput;

    public String serverIp;
    public int serverPort;

    public void Connect(String serverIp, int serverPort) {

        try {
            this.serverIp = serverIp;
            this.serverPort = serverPort;
            this.socket = new Socket(this.serverIp, this.serverPort);
            this.cOutput = new ObjectOutputStream(this.socket.getOutputStream());
            this.cInput = new ObjectInputStream(this.socket.getInputStream());
            String bas="SelamınAleyküm";
            this.cOutput.writeObject(bas);
            
            Object msg=cInput.readObject();
            System.out.println(msg.toString());
            
            
            

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
