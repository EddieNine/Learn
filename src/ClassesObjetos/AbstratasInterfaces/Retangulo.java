package ClassesObjetos.AbstratasInterfaces;

// Subclasse Retangulo que herda de FormaGeometrica
class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    // Construtor para inicializar largura e altura do retângulo
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método calcularArea para o retângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    // Implementação do método calcularPerimetro para o retângulo
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
