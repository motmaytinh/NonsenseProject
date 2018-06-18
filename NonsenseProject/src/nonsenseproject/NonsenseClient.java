/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonsenseproject;

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

    public static void main(String[] args) throws TTransportException, TException {
        TTransport transport = new TSocket("localhost", 8080);
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        NonsenseService.Client client = new NonsenseService.Client(protocol);
        // call remote functions
        client.log("logfile.log");
        System.out.println(client.NonsenseFunction("Abc"));
        transport.close();
    }
}
