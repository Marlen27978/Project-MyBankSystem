package com.company;

import java.io.*;
import java.net.*;
import java.util.Date;


public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 6000);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Input your name: ");
            String name = reader.readLine();
            while(true){
                String message = reader.readLine();
                Date date = new Date();
                output.writeObject(name+" at "+ date+": "+message);
                String fromServer = (String)input.readObject();
                System.out.println(fromServer);
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
