/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

public class Kata2 {

    static HashMap<Integer, Integer> vMap = new HashMap();

    public static void main(String[] args) {

        Person person1 = new Person("Javier", 25);
        int name;

        System.out.println(person1.getName());

        int[] v = {1, 4, 5, 1, 3, 1, 1, 0};

        for (int i = 0; i < v.length; i++) {
            vMap.put(v[i], getFrecuency(v[i]) + 1);
        }
        
        int numero = 0;
        int cantidad = 0;
        
        for (Integer value : vMap.keySet()) {
            if (vMap.get(value) > cantidad)
                cantidad = vMap.get(value);
                numero = vMap.get(cantidad);
        }

        System.out.println(vMap.get(1));
        System.out.println("El numero que mas aparece en el vector es el " + numero + " con " + cantidad + " repeticiones");

    }

    public static int getFrecuency(int valor) {
        if (vMap.containsKey(valor)) {
            return vMap.get(valor);
        }
        return 0;
    }
}
