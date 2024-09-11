package CollectionsGenerics.ListasIteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIteratorRemove {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(12);
        numeros.add(3);
        
        // Criando um iterador para a lista de numeros
        Iterator<Integer> iterator = numeros.iterator();
        
        // Removendo todos os números menores que 10
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if(numero < 10) {
                iterator.remove(); // Removendo o número da lista
            }
        }
        
        // imprimindo a lista atualizada
        System.out.println("Números maiores ou iguais a 10: " + numeros);
    }
}
