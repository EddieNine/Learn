package Lambda.Learn.Exemplos.OperacoesMatematicas;

public class calculadora {
    public static void main(String[] args) {
        OperacaoMatematica somar = (a , b) -> a + b;
        OperacaoMatematica subtrair = (a, b) -> a - b;
        OperacaoMatematica mutiplicar = (a,b ) -> a * b;

        // Corrigindo a divisão parar tratar o caso de divisão pro zero
        OperacaoMatematica dividir = (a, b) -> {
            if(b == 0) {
                System.out.println("Erro! Divisão por zero");
                return 0; // Retorna um valor padrão quando há divisão por zero
            }
            return (double) a / b; // Retorna a divisão
        };
        System.out.println("Soma: " + somar.calcular(5,3));
        System.out.println("Substração: " + subtrair.calcular(5,3));
        System.out.println("Multiplicação: " + mutiplicar.calcular(5,3));
        System.out.println("Divisão: " + dividir.calcular(5,0)); // Aqui será tratado o erro de divisão por zero
    }
}
