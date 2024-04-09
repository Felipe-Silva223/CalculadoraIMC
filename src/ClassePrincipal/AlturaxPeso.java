package ClassePrincipal;

public class AlturaxPeso {

    private Double altura;

    private Double peso;

    
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void alturaPeso(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;

    }

    public double retornarResultado() {
        double imc = peso / (altura * altura);
        return imc;
    }

}
