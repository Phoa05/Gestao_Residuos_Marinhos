package br.fiap.gs.service;

import br.fiap.gs.model.PontoColeta;

import java.util.HashMap;
import java.util.Map;

public class AnaliseDados {

    /**
     * Agrupa os pontos de coleta por tipo de resíduos.
     * @return Um mapa com o tipo de resíduos como chave e a quantidade de pontos como valor.
     */
    public Map<String, Integer> agruparPontosPorTipo() {
        PontoColeta[] pontos = PontoColeta.listarPontosColeta();
        Map<String, Integer> agrupamentoPorTipo = new HashMap<>();
        for (PontoColeta ponto : pontos) {
            agrupamentoPorTipo.put(ponto.getTipoResiduos(), agrupamentoPorTipo.getOrDefault(ponto.getTipoResiduos(), 0) + 1);
        }
        return agrupamentoPorTipo;
    }

    /**
     * Calcula a quantidade média de resíduos por ponto de coleta.
     * @return A quantidade média de resíduos em quilogramas.
     */
    public double calcularMediaResiduos() {
        PontoColeta[] pontos = PontoColeta.listarPontosColeta();
        double total = PontoColeta.calcularTotalResiduos();
        return total / pontos.length;
    }

    /**
     * Gera um relatório de análise de dados de resíduos marinhos.
     */
    public void gerarRelatorioAnalise() {
        Map<String, Integer> agrupamentoPorTipo = agruparPontosPorTipo();
        double mediaResiduos = calcularMediaResiduos();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Relatório de Análise de Dados de Resíduos Marinhos:");
        System.out.println("Agrupamento por Tipo de Resíduos:");
        for (Map.Entry<String, Integer> entry : agrupamentoPorTipo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " pontos de coleta");
        }
        System.out.println("Quantidade média de resíduos por ponto de coleta: " + mediaResiduos + " kg");
        System.out.println("----------------------------------------------------------------------------");
    }
}
