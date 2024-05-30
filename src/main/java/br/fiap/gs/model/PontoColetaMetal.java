package br.fiap.gs.model;

public class PontoColetaMetal extends PontoColeta {
    public PontoColetaMetal(String localizacao, double quantidadeResiduos) {
        super(localizacao, "Metal", quantidadeResiduos);
    }

    @Override
    public String toString() {
        return "Ponto de Coleta de Metal - " + super.toString();
    }
}