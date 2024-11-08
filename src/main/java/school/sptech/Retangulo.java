package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }
}
