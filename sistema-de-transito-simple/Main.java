import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

    int optionMenu = 0;

    while (optionMenu != 9) {

      // Rece a opção do menu
      optionMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "|MENU ESTATÍSTICA\n" + //
          "----------------------------------------------------------------\n" + //
          "| Estatísticas de acidentes em 2020\n" + //
          "| 1 - Cadastro Estatística\n" + //
          "| 2 - Consulta por quantidade de acidentes\n" + //
          "| 3 - Consulta por estatísticas de acidentes\n" + //
          "| 4 - Acidentes acima da média das 10 cidades\n" + //
          "| 5 - Mostrar todas as cidades\n" + //
          "| 9 - Finaliza\n" + //
          "----------------------------------------------------------------\n" + //
          ""));

      // Verifico a opççao escolhida
      switch (optionMenu) {
        case 1:
          EstatisticaMethods.FCADRASTRAESTATISTICA();
          break;
        case 2:
          EstatisticaMethods.PQTDACIDENTES();
          break;
        case 3:
          EstatisticaMethods.PCONSULTARESTATISTICAS();
          break;
        case 4:
          EstatisticaMethods.PACIMA();
          break;
        case 5:
          EstatisticaMethods.PMOSTRARTODASCIDADES();
          break;
        case 9:
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção Inválida.");
          break;
      }
    }
  }
}
