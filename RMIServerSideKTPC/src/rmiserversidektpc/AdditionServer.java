/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserversidektpc;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

/**
 *
 * @author TATIS
 */
public class AdditionServer {

    public static void main(String[] argv) {
        try {
            System.setSecurityManager(new RMISecurityManager());

            Addition Hello = new Addition();

            Naming.rebind("rmi://192.168.56.1/myabc", Hello);
            System.out.println("Addition Server is ready.");
        } catch (MalformedURLException | RemoteException e) {
            System.out.println("Addition Server failed: " + e);
        }
    }
}
