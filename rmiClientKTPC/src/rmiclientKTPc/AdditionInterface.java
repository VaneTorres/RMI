/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclientKTPc;

import java.rmi.RemoteException;

/**
 *
 * @author TATIS
 */
public interface AdditionInterface {
       public int Add(int a,int b) throws RemoteException;
}
