import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DB {

  public static void gravar(Estatistica[] estatisticas) throws IOException {

    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("ArquivoEstatistica.txt"));
      // Loop para gravar o arquivo
      for (int i = 0; i < estatisticas.length; i++) {

        writer.write(estatisticas[i].codigoCidade + "|" + estatisticas[i].nomeCidade + "|"
            + estatisticas[i].quantidadeAcidadentes);
        writer.newLine();
      }

      // Finaliza a gravacao
      writer.close();
      System.out.println("Cidades cadastradas com sucesso!.\n##");
    } catch (IOException dadosDoErro) {
      JOptionPane.showMessageDialog(null, dadosDoErro.getMessage());
    }
  }

  public static Estatistica[] ler() throws IOException {
    int i = 0;

    Estatistica estatistica;
    Estatistica[] estatisticas = new Estatistica[10];

    String[] dados;

    try {
      // Abre o arquivo para Leitura
      BufferedReader reader = new BufferedReader(new FileReader("ArquivoEstatistica.txt"));

      // Lê a primeira linha
      String conteudo = reader.readLine();

      while (conteudo != "" && conteudo != null) {

        // Separa os dados usando como indice o |
        dados = conteudo.split("\\|");

        // Cria uma nova instancia de Estatistica
        estatistica = new Estatistica();
        estatistica.codigoCidade = Integer.parseInt(dados[0]);
        estatistica.nomeCidade = dados[1];
        estatistica.quantidadeAcidadentes = Integer.parseInt(dados[2]);

        // Passar o objeto Estatistica para dentro do vetor
        estatisticas[i] = estatistica;

        // Leitura da proxima linha
        conteudo = reader.readLine();
        i++;

      }

      // Fecha o arquivo
      reader.close();
      System.out.println("Arquivo lido com sucesso!.\n##");
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }

    // Retorna o conteudo Lido
    return estatisticas;
  }
}
