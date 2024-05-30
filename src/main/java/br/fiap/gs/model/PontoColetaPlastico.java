package br.fiap.gs.model;

public class PontoColetaPlastico extends PontoColeta {
    public PontoColetaPlastico(String localizacao, double quantidadeResiduos) {
        super(localizacao, "Plástico", quantidadeResiduos);
    }

    @Override
    public String toString() {
        return "Ponto de Coleta de Plástico - " + super.toString();
    }
}

