package CollectionsGenerics.ListasIteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(15);
        numeros.add(12);
        numeros.add(5);
        numeros.add(6);
        numeros.add(10);
        numeros.add(4);
        numeros.add(20);

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()){
            Integer numero = iterator.next();
            if(numero < 10) {
                iterator.remove();
            }
        }

        System.out.println("Numeros maiores do que 10: " + numeros);
    }
}
