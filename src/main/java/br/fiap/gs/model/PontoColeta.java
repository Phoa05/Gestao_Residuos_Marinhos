package br.fiap.gs.model;

import java.time.LocalDateTime;
import java.util.Arrays;

public class PontoColeta {
    private String localizacao;
    private String tipoResiduos;
    private double quantidadeResiduos;
    private LocalDateTime dataHora;

    private static final int MAX_PONTOS = 100;
    private static PontoColeta[] pontosColeta = new PontoColeta[MAX_PONTOS];
    private static int count = 0;

    public PontoColeta(String localizacao, String tipoResiduos, double quantidadeResiduos) {
        this.localizacao = localizacao;
        this.tipoResiduos = tipoResiduos;
        this.quantidadeResiduos = quantidadeResiduos;
        this.dataHora = LocalDateTime.now();
    }

    // Método com sobrecarga
    public PontoColeta(String localizacao, double quantidadeResiduos) {
        this(localizacao, "Desconhecido", quantidadeResiduos);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getTipoResiduos() {
        return tipoResiduos;
    }

    public double getQuantidadeResiduos() {
        return quantidadeResiduos;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    /**
     * Adiciona um novo ponto de coleta ao array de pontos de coleta.
     * @param ponto O ponto de coleta a ser adicionado.
     */
    public static void adicionarPontoColeta(PontoColeta ponto) {
        if (count < MAX_PONTOS) {
            pontosColeta[count++] = ponto;
        } else {
            System.out.println("Capacidade máxima de pontos de coleta atingida!");
        }
    }

    /**
     * Lista todos os pontos de coleta cadastrados.
     * @return Um array de pontos de coleta.
     */
    public static PontoColeta[] listarPontosColeta() {
        return Arrays.copyOf(pontosColeta, count);
    }

    /**
     * Calcula a quantidade total de resíduos coletados.
     * @return A quantidade total de resíduos em quilogramas.
     */
    public static double calcularTotalResiduos() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += pontosColeta[i].getQuantidadeResiduos();
        }
        return total;
    }

    /**
     * Gera um relatório de gestão de resíduos.
     */
    public static void gerarRelatorio() {
        PontoColeta[] pontos = listarPontosColeta();
        double totalResiduos = calcularTotalResiduos();
        System.out.println("Relatório de Gestão de Resíduos Marinhos:");
        System.out.println("Número de pontos de coleta: " + pontos.length);
        System.out.println("Quantidade total de resíduos coletados: " + totalResiduos + " kg");
        for (PontoColeta ponto : pontos) {
            System.out.println(ponto);
        }
    }

    public void compactarPlasticos() {
        if (this instanceof PontoColetaPlastico) {
            ((PontoColetaPlastico) this).compactarPlasticos();
        } else {
            System.out.println("Este ponto de coleta não compacta plásticos.");
        }
    }

    public void separarMetaisFerroso() {
        if (this instanceof PontoColetaMetal) {
            ((PontoColetaMetal) this).separarMetaisFerroso();
        } else {
            System.out.println("Este ponto de coleta não separa metais ferrosos.");
        }
    }

    @Override
    public String toString() {
        return "Localização: " + localizacao + ", Tipo de Resíduos: " + tipoResiduos + ", Quantidade: " + quantidadeResiduos + " kg, Data/Hora: " + dataHora;
    }
}
