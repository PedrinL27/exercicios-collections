import java.util.HashSet;
import java.util.Set;

public class PalavraUnica {
  
  private Set<Palavra> palavraSet;

  public PalavraUnica() {
    this.palavraSet = new HashSet<>();
  }

  public void adiocionarPalavra(String palavra) {
    palavraSet.add(new Palavra(palavra));
  }

  public void removerPalavra(String palavra) {
    Palavra palavraRemover = null;
    for (Palavra p: palavraSet) {
        if(p.getPalavra() == palavra) {
            palavraRemover = p;
            break;
        }
    }
    palavraSet.remove(palavraRemover);
  }

  public void verificarPalavra(String palavra) {
    Palavra verificarPalavra = null;
    for (Palavra p: palavraSet) {
        if(p.getPalavra() == palavra) {
            verificarPalavra = p;
            System.out.println("Palavra Encontrada");
            System.out.println(verificarPalavra);
            break;
        } 
    }
    if (verificarPalavra == null) {
        System.out.println("Palavra Nao Encontrada");
    }
    
  }

  public void exibirPalavra() {
    if (!palavraSet.isEmpty()) {
        System.out.println(palavraSet);
    } else {
        throw new RuntimeException("A lista deve conter algum item");
    }
  }

  public static void main(String[] args) throws Exception {

    PalavraUnica palavraUnica = new PalavraUnica();

    palavraUnica.adiocionarPalavra("Xicara");
    palavraUnica.adiocionarPalavra("Teclado");
    palavraUnica.adiocionarPalavra("Monitor");
    palavraUnica.adiocionarPalavra("Garrafa");

    palavraUnica.exibirPalavra();

    palavraUnica.removerPalavra("Teclado");

    palavraUnica.exibirPalavra();

    palavraUnica.verificarPalavra("Xicara");
    palavraUnica.verificarPalavra("Teclado");

  }
}
