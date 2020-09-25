/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserversidektpc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author TATIS
 */
public class Addition extends UnicastRemoteObject
        implements IAddition {

    public Addition() throws RemoteException {
    }

    @Override
    public int Add(int a, int b) throws RemoteException {
        int result = a + b;
        return result;
    }

}
