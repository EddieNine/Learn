package FuncoesMetodos;

public class AreaCalculator {

    public double areaRetangulo(double largura, double altura){
        return largura * altura;
    }

    public double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public double areaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Área de um retângulo: " + calc.areaRetangulo(5, 10));
        System.out.println("Área de um círculo: " + calc.areaCirculo(5));
        System.out.println("Área de um triângulo: " + calc.areaTriangulo(5, 10));
    }


}
