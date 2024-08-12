import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OredenacaoNumeros {

  private List<Numero> numeroList;

  public OredenacaoNumeros() {
    this.numeroList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeroList.add(new Numero(numero));
  }

  public List<Numero> ordenarCrescente() {
    List<Numero> numeroCrescente = new ArrayList<>(this.numeroList);
    if (!numeroList.isEmpty()) {
        Collections.sort(numeroCrescente);
        return numeroCrescente;
    } else {
        System.out.println("A lista esta vazia");
        return null;
    }
  }

  public List<Numero> ordenarDecrescente() {
    List<Numero> numeroDecrescente = new ArrayList<>(this.numeroList);
    if (!numeroList.isEmpty()) {
        Collections.sort(numeroDecrescente);
        Collections.reverse(numeroDecrescente);
        return numeroDecrescente;
    } else {
        System.out.println("A lista esta vazia");
        return null;
    }
  }


  public static void main(String[] args) throws Exception {
    OredenacaoNumeros oredenacaoNumeros = new OredenacaoNumeros();

    oredenacaoNumeros.adicionarNumero(15);
    oredenacaoNumeros.adicionarNumero(32);
    oredenacaoNumeros.adicionarNumero(43);
    oredenacaoNumeros.adicionarNumero(101);
    oredenacaoNumeros.adicionarNumero(157);
    oredenacaoNumeros.adicionarNumero(2);

    System.out.println(oredenacaoNumeros.numeroList);
    System.out.println(oredenacaoNumeros.ordenarCrescente());
    System.out.println(oredenacaoNumeros.ordenarDecrescente());
  }
}
