/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonsenseproject;

import org.apache.thrift.TException;
// import code generated by Apache Thrift compiler
import nonsenseproject.*;

/**
 *
 * @author QuyTN
 */
public class NonsenseHandler implements NonsenseService.Iface {
    
    public NonsenseHandler() {
        
    }
    
    @Override
    public void log(String filename) {
        System.out.println("Write log to " + filename);
    } ;

    @Override
    public String NonsenseFunction(String nonsenseString) {
        return "This is a nonsense service";
    }

    public int get_log_size(String filename) {
        System.out.println("Size of " + filename + " is ...");
        return 0;
    }
    
}