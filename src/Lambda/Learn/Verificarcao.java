package Lambda.Learn;

interface Verificador {
    boolean verificar(int n);
}

public class Verificarcao {
    public static void main(String[] args) {
        Verificador verificador = n -> n % 2 == 0;
        System.out.println(verificador.verificar(4));
    }
}
