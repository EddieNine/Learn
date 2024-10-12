package Lambda.Learn;

interface Somador {
    int somar(int a, int b);
}

public class Soma {
    public static void main(String[] args) {
        Somador somador = (a, b) -> a + b;
        System.out.println(somador.somar(5, 3)); // Saída: 8
    }
}
