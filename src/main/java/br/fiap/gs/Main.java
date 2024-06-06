package br.fiap.gs;

import br.fiap.gs.model.PontoColeta;
import br.fiap.gs.model.PontoColetaMetal;
import br.fiap.gs.model.PontoColetaPlastico;
import br.fiap.gs.service.AnaliseDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar Ponto de Coleta");
            System.out.println("2. Listar Pontos de Coleta");
            System.out.println("3. Gerar Relatório de Coleta");
            System.out.println("4. Gerar Relatório de Análise de Dados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a localização: ");
                    String localizacao = scanner.nextLine();
                    System.out.print("Escolha o tipo de resíduos (1. Plástico, 2. Metal, 3. Outros): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite a quantidade de resíduos (kg): ");
                    double quantidade = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipo == 1) {
                        PontoColeta.adicionarPontoColeta(new PontoColetaPlastico(localizacao, quantidade));
                    } else if (tipo == 2) {
                        PontoColeta.adicionarPontoColeta(new PontoColetaMetal(localizacao, quantidade));
                    } else {
                        System.out.print("Digite o tipo de resíduos: ");
                        String tipoResiduos = scanner.nextLine();
                        PontoColeta.adicionarPontoColeta(new PontoColeta(localizacao, tipoResiduos, quantidade));
                    }
                    break;
                case 2:
                    PontoColeta[] pontos = PontoColeta.listarPontosColeta();
                    for (PontoColeta ponto : pontos) {
                        System.out.println(ponto);
                    }
                    break;
                case 3:
                    PontoColeta.gerarRelatorio();
                    break;
                case 4:
                    AnaliseDados analiseDados = new AnaliseDados();
                    analiseDados.gerarRelatorioAnalise();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
