
package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread{
    Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String message = "";
            while( (message = (String)input.readObject())!= null ){
                System.out.println(message);
                String responce = reader.readLine();
                output.writeObject("Answer from Server: "+responce);
            }
            output.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
