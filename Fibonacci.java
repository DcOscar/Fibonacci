/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Oscar
 */
public class Fibonacci {

    public long numeroFibonacci(int indice) {
        ArrayList<Long> sucesionFibo = new ArrayList<Long>();
        long numero1=0;
        long numero2=1;
        sucesionFibo.add(numero1);
        sucesionFibo.add(numero2);
        if (indice <= 2) {
            return sucesionFibo.get(indice);
        } else {
            for (int i = 0; i < indice; i++) {
                sucesionFibo.add(sucesionFibo.get(i) + sucesionFibo.get(i + 1));
            }
        }
        return sucesionFibo.get(indice);
    }
     public long numeroFibonacci2(int indice) {
        Map<Integer,Long> sucesionFibo = new HashMap<Integer,Long>();
        long numero1=0;
        long numero2=1;
        sucesionFibo.put(0, numero1);
         sucesionFibo.put(1, numero2);
        if (indice <= 2) {
            return sucesionFibo.get(indice);
        } else {
            for (int i = 0; i < indice; i++) {
                sucesionFibo.put(i+2,sucesionFibo.get(i)+sucesionFibo.get(i+1));
            }
        }
        return sucesionFibo.get(indice);
    }

}
