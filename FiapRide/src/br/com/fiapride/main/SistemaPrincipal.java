package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", 10);

        v1.adicionar(50);
        v1.gastar(30);

        System.out.println(
            "Dono: " + v1.getIndividuo() +
            " | Placa: " + v1.getPlaca() +
            " | Gasolina: " + v1.getGasolina()
        );

        Veiculo v2 = new Veiculo("João", "DEF-5678", 100);

        v2.adicionar(50);
        v2.gastar(120);

        System.out.println(
            "Dono: " + v2.getIndividuo() +
            " | Placa: " + v2.getPlaca() +
            " | Gasolina: " + v2.getGasolina()
        );
    }
}