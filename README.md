# Sistema de Gerenciamento de Resíduos Marinhos

## Descrição

Este projeto é um sistema de gerenciamento de resíduos marinhos, desenvolvido em Java. O sistema permite registrar, listar e analisar dados sobre pontos de coleta de resíduos, com funcionalidades específicas para diferentes tipos de resíduos, como plástico e metal.

## Funcionalidades

1. **Adicionar Ponto de Coleta**: Registra novos pontos de coleta especificando a localização, tipo e quantidade de resíduos.
2. **Listar Pontos de Coleta**: Exibe todos os pontos de coleta registrados no sistema com detalhes sobre localização, tipo de resíduos, quantidade e data/hora da coleta.
3. **Gerar Relatório de Coleta**: Gera um relatório detalhado contendo o número de pontos de coleta e a quantidade total de resíduos coletados.
4. **Gerar Relatório de Análise de Dados**: Realiza a análise dos dados coletados, agrupando pontos de coleta por tipo de resíduos e calculando a quantidade média de resíduos por ponto.
5. **Métodos Específicos por Tipo de Resíduo**: Inclui métodos específicos para pontos de coleta de plástico (compactação) e metal (separação de metais ferrosos).

## Estrutura do Projeto

O projeto está estruturado em pacotes conforme a seguir:

- `br.fiap.gs`: Contém a classe principal do sistema.
- `br.fiap.gs.model`: Contém as classes de modelo que representam os pontos de coleta e suas subclasses.
- `br.fiap.gs.service`: Contém a classe de serviço para análise de dados.

## Diagrama de Classes UML
![image](https://github.com/Phoa05/Gestao_Residuos_Marinhos/assets/127457510/48de1c0d-26cd-4995-a546-fbb64265d04d)

## Integrantes 
- Guilherme Brazioli – rm98237
- Danilo Urze – rm99465
-	Pedro Henrique – rm550689


