import java.util.HashMap;
import java.util.Map;

public class Dicionario {

  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definacao) {
    dicionarioMap.put(palavra, definacao);
  }

  public void removerPalavra(String palavra) {
    if(!dicionarioMap.isEmpty()) {
        dicionarioMap.remove(palavra);
    } else {
        throw new RuntimeException("A Lista esta vazia");
    }
  }

  public void exibirPalavras() {
    if(!dicionarioMap.isEmpty()) {
        System.out.println(dicionarioMap);
    } else {
        throw new RuntimeException("A Lista esta vazia");
    }
  }

  public String pesquisarPorPalavra(String palavra) {
    if(!dicionarioMap.isEmpty()) {
        String definicao = null; 
        definicao = dicionarioMap.get(palavra);
        if (definicao == null) System.out.println("Palavra nao encontrada");
        return definicao;
    } else {
        throw new RuntimeException("A Lista esta vazia");
    }
  }


  public static void main(String[] args) throws Exception {
    Dicionario dicionarioMap = new Dicionario();

    dicionarioMap.adicionarPalavra("Cafe", "Bebida Quente");
    dicionarioMap.adicionarPalavra("Carteira", "Guarda Dinheiro");
    dicionarioMap.adicionarPalavra("Fio", "Passa Informacao");

    dicionarioMap.exibirPalavras();

    dicionarioMap.removerPalavra("Cafe");

    dicionarioMap.exibirPalavras();

    System.out.println(dicionarioMap.pesquisarPorPalavra("Fio"));
  }
}
