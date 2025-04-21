package Aleatorio.SintaxeBasica;

public class Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10;
        int b = 3;

        int soma = a + b; // soma: 10 + 3 = 13
        int subtracao = a - b; // subtracao: 10 - 3 = 7
        int multiplicacao = a * b; // multiplicação: 10 * 3 = 30
        int divisao = a / b; // divisão inteira: 10 / 3 = 3
        int resto = a % b; // resto da divisão: 10 % 3 = 1

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;

        boolean resultadoE = x && y; // falso, pois x é true e y é false
        boolean resultadoOu = x || y; // verdadeiro, pois x é true
        boolean resultadoNao = !x; // falso, pois x é true e a negação de true é false
    }
}
