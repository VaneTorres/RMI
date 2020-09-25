/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclientKTPc;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 *
 * @author TATIS
 */
public class AdditionClient {
  
    public static void main (String[] args) {
		AdditionInterface hello;
		try {
  		        System.setSecurityManager(new RMISecurityManager());
			hello = (AdditionInterface)Naming.lookup("rmi://192.168.56.1/myabc");
			int result=hello.Add(9,10);
			System.out.println("Result is :"+result);
 
			}catch (Exception e) {
				System.out.println("HelloClient exception: " + e);
				}
		}
}
