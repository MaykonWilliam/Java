import javax.swing.JOptionPane;

public class EstatisticaMethods {

  public static void FCADRASTRAESTATISTICA() {

    int i;
    Estatistica estatistica = new Estatistica();
    Estatistica[] estatisticas = new Estatistica[10];

    // Loop para criar as 10 cidades
    for (i = 0; i < estatisticas.length; i++) {

      // Crio uma instancia da class Estatistica
      estatistica = new Estatistica();
      estatistica.codigoCidade = i + 1;
      estatistica.nomeCidade = "Cidade " + (i + 1);
      estatistica.quantidadeAcidadentes = (int) (Math.random() * 10000);

      // Passo a classe para o vetor de classes
      estatisticas[i] = estatistica;
    }

    // Grava os dados no arquivo
    try {
      DB.gravar(estatisticas);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo:\n" + e.getMessage());
    }
    System.out.println("Cidades cadastradas com sucesso!.\n##");

  }

  public static void PQTDACIDENTES() {
    int i;
    Estatistica[] estatisticas = new Estatistica[10];

    try {
      estatisticas = DB.ler();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo:\n" + e.getMessage());
    }

    System.out.println("Quantidade de cidades > 100 e <500 Acidentes.\n##");
    for (i = 0; i < estatisticas.length; i++) {

      if (estatisticas[i].quantidadeAcidadentes > 100 && estatisticas[i].quantidadeAcidadentes < 500) {
        System.out.println(estatisticas[i].nomeCidade + ": " + estatisticas[i].quantidadeAcidadentes + "Acidentes");
        break;
      }
    }
    System.out.println("#########################################");
  }

  public static void PMAIORQTDACIDENTES() {
    int i;
    int maior = 0;
    int j = 0;

    Estatistica[] estatisticas = new Estatistica[10];
    try {
      estatisticas = DB.ler();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo:\n" + e.getMessage());
    }

    for (i = 0; i < estatisticas.length; i++) {
      if (estatisticas[i].quantidadeAcidadentes > maior || i == 0) {
        maior = estatisticas[i].quantidadeAcidadentes;
        j = i;
      }
    }
    System.out.println("Cidade com o maior numero de acidentes.\n##");
    System.out.println(estatisticas[j].nomeCidade + ": " + estatisticas[j].quantidadeAcidadentes);
    System.out.println("#########################################");
  }

  public static void PMENORQTDACIDENTES() {
    int i;
    int menor = 0;
    int j = 0;

    Estatistica[] estatisticas = new Estatistica[10];
    try {
      estatisticas = DB.ler();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo:\n" + e.getMessage());
    }

    for (i = 0; i < estatisticas.length; i++) {
      if (estatisticas[i].quantidadeAcidadentes < menor || i == 0) {
        menor = estatisticas[i].quantidadeAcidadentes;
        j = i;
      }
    }
    System.out.println("Cidade com o menor numero de acidentes.\n##");
    System.out.println(estatisticas[j].nomeCidade + ": " + estatisticas[j].quantidadeAcidadentes);
    System.out.println("#########################################");
  }

  public static void PCONSULTARESTATISTICAS() {
    String inputSubMenu = "";
    int optionSubMenu = 0;

    while (optionSubMenu != 9) {
      inputSubMenu = JOptionPane.showInputDialog(null, "|CONSULTAR POR ESTATÍSTICAS\n" + //
          "----------------------------------------------------------------\n" + //
          "| 1 - Menor número de acidentes\n" + //
          "| 2 - Maior número de acidentes\n" + //
          "| 9 - ◀ Voltar ao Menu Anterior\n" + //
          "----------------------------------------------------------------\n" + //
          "");
      if (inputSubMenu == null) {
        JOptionPane.showMessageDialog(null, "Selecione ao menos uma das opções de menu.");
      } else {

        try {
          optionSubMenu = Integer.parseInt(inputSubMenu);
          switch (optionSubMenu) {
            case 1:
              EstatisticaMethods.PMENORQTDACIDENTES();
              break;
            case 2:
              EstatisticaMethods.PMAIORQTDACIDENTES();
              break;
            case 9:
              break;
            default:
              JOptionPane.showMessageDialog(null, "Opção Inválida.");
              break;
          }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Opção Inválida.");
        }
      }
    }
  }

  public static void PACIMA() {
    int i;
    int media = 0;

    Estatistica[] estatisticas = new Estatistica[10];
    try {
      estatisticas = DB.ler();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo:\n" + e.getMessage());
    }

    for (i = 0; i < estatisticas.length; i++) {
      media += estatisticas[i].quantidadeAcidadentes;
    }

    media = media / estatisticas.length;

    for (i = 0; i < estatisticas.length; i++) {

      if (estatisticas[i].quantidadeAcidadentes > media) {
        System.out.println(estatisticas[i].nomeCidade);
      }

    }
  }

  public static void PMOSTRARTODASCIDADES() {
    int i = 0;

    Estatistica[] estatisticas = new Estatistica[10];
    try {
      estatisticas = DB.ler();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo:\n" + e.getMessage());
    }

    for (i = 0; i < estatisticas.length; i++) {
      System.out.println(estatisticas[i].nomeCidade);
    }
  }

}
