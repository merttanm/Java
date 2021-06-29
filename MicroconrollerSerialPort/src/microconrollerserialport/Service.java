/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microconrollerserialport;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
 
public class Service {
     public static void main(String[] args) throws Exception {
// Create a server, specify the port as 10012
            ServerSocket server = new ServerSocket(10012);
            byte[] msg = new byte[50];
 System.out.println("Server is ready...");
 // Receive the client object connected to the server
            Socket client = server.accept();
 //Define a data input stream and receive messages sent by 8266
            InputStream in = new DataInputStream(client.getInputStream());
 //Set to an endless loop, you can receive data sent by 8266 indefinitely
            boolean accept = true;
            while (accept) {
 //Input stream to read data
                in.read(msg);
                System.out.println(new String(msg));
            }
            in.close();
            client.close();
            server.close();
        }

    
}
