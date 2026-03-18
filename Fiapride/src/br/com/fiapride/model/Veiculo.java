package br.com.fiapride.model;

public class Veiculo {

    private String individuo;
    private String placa;
    private double gasolina;

    public Veiculo(String individuo, String placa, double gasolina) {
        this.individuo = individuo;
        this.placa = placa;

        if (gasolina >= 0) {
            this.gasolina = gasolina;
        } else {
            this.gasolina = 0;
        }
    }

    public String getIndividuo() {
        return individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void adicionar(double valor) {
        gasolina += valor;
    }

    public void gastar(double valor) {
        if (gasolina - valor >= 0) {
            gasolina -= valor;
        }
    }
}
