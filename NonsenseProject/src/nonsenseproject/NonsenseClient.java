/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonsenseproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.Scanner;
import nonsenseproject.*;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

/**
 *
 * @author QuyTN
 */
public class NonsenseClient {

    public static void main(String[] args) throws TTransportException, TException, IOException {
        TTransport transport = new TSocket("localhost", 8080);
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        NonsenseService.Client client = new NonsenseService.Client(protocol);
        
        // call remote functions
        perform(client);
        
        transport.close();
    }
    
    private static void perform(NonsenseService.Client client) throws TException, IOException {
        String filePath = "/home/cpu10745/Desktop/workspace/test.txt";
        byte[] bFile = Files.readAllBytes(new File(filePath).toPath());
        
        ByteBuffer buf = ByteBuffer.wrap(bFile);
        file fupload = new file("test.txt", filetype.TXT, buf);
        
        client.upload(fupload);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("You: ");
            String question = scanner.nextLine();
            
            if (question.equals("quit")) break;
            
            answer ans = client.ask(question);
            System.out.println("Bot:" + ans.getAnswer());
        } while (true); //!inputString.equals("n")
    }
}
