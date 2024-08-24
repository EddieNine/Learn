package ClassesObjetos.AbstratasInterfaces;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Circulo
        FormaGeometrica circulo = new Circulo(5.0);
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        // Criando uma instância de Retangulo
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
    }
}
