package ClassesObjetos.AbstratasInterfaces;

// Subclasse Circulo que herda de FormaGeometrica
class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor para inicializar o raio do círculo
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea para o círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Implementação do método calcularPerimetro para o círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
