package Inicio.Operadores;

public class Main4 {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 20;

        System.out.println("(a > b) e (b > c): " + (a > b && b > c));
        System.out.println("(a < b) e (b < c): " + (a < b && b < c));
        System.out.println("Inverso de (a > b): " + !(a > b));
    }
}
