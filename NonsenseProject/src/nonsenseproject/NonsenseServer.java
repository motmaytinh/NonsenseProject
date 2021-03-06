/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonsenseproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

// import code generated by Apache Thrift compiler
import org.apache.thrift.transport.TTransportException;

/**
 *
 * @author QuyTN
 */
public class NonsenseServer {

    public static NonsenseHandler handler;

    public static NonsenseService.Processor processor;

    public static void mynonsenseserver(NonsenseService.Processor processor) throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(8080);

        TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
        System.out.println("Server is running ...");
        server.serve();
    }

    // main function
    public static void main(String[] args) {
        handler = new NonsenseHandler();
        processor = new NonsenseService.Processor(handler);
        Runnable server = new Runnable() {
            public void run() {
                try {
                    mynonsenseserver(processor);
                } catch (TTransportException ex) {
                    Logger.getLogger(NonsenseServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        new Thread(server).start();
    }

}
