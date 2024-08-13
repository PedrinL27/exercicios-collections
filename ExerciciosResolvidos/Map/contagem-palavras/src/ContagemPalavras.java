import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  
  private Map<String, Integer> contagemPalavraMap;

  public ContagemPalavras() {
    this.contagemPalavraMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    contagemPalavraMap.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    if(!contagemPalavraMap.isEmpty()) {
        contagemPalavraMap.remove(palavra);
    } else {
        throw new RuntimeException("A lista esta vazia");
    }
  }

  public void exibirPalavra() {
    if(!contagemPalavraMap.isEmpty()) {
        System.out.println(contagemPalavraMap);
    } else {
        throw new RuntimeException("A lista esta vazia");
    }
  }

  public int exibirContagemPalavras() {
    int contagemTotal = 0;
    for (int contagem : contagemPalavraMap.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }

  public String encontrarPalavrasMaisFrequente() {
    String palavraFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        palavraFrequente = entry.getKey();
      }
    }
    return palavraFrequente;
  }

  public static void main(String[] args) throws Exception {
    ContagemPalavras contagemPalavras = new ContagemPalavras();

    contagemPalavras.adicionarPalavra("Pera", 10);
    contagemPalavras.adicionarPalavra("Celular", 15);
    contagemPalavras.adicionarPalavra("Mesa", 30);
    contagemPalavras.adicionarPalavra("Garrafa", 5);

    contagemPalavras.exibirPalavra();
    System.out.println("A contagem total: " + contagemPalavras.exibirContagemPalavras());
    System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavrasMaisFrequente());

  }
}
