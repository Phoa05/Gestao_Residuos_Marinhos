package br.fiap.gs.model;

public class PontoColetaMetal extends PontoColeta {
    public PontoColetaMetal(String localizacao, double quantidadeResiduos) {
        super(localizacao, "Metal", quantidadeResiduos);
    }

    public void separarMetaisFerroso() {
        System.out.println("Separando metal ferroso...");
    }

    @Override
    public String toString() {
        return "Ponto de Coleta de Metal - " + super.toString();
    }
}
