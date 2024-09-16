package ProgramacaoFuncional;

public class LambdaExample {
    public static void main(String[] args) {
        // Usando lambda para criar uma implementação de Runnable
        Runnable runnable = () -> System.out.println("Executando uma thread!");
        new Thread(runnable).start();
    }
}
