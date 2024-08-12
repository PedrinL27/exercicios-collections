import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

  private List<Numero> numeroList;

  public SomaNumeros() {
    this.numeroList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeroList.add(new Numero(numero));
  }

  public int calcularSoma() {
    int acumulador = 0;
    if(!numeroList.isEmpty()) {
        for (Numero n : numeroList) {
            acumulador += n.getNumero();
        } 
    } else {
        System.out.println("A lista esta vazia!");
    }
    return acumulador;
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = 0;
    if (!numeroList.isEmpty()) {
        maiorNumero = numeroList.get(0).getNumero();
        for (Numero n : numeroList) {
            if (n.getNumero() > maiorNumero) {
                maiorNumero = n.getNumero();
            }
        }
    } else {
        System.out.println("A lista esta vazia!");
    }
    return maiorNumero;
  }

  public int encontrarMenorNumero() {
    int menorNumero = 0;
    if (!numeroList.isEmpty()) {
        menorNumero = numeroList.get(0).getNumero();
        for (Numero n : numeroList) {
            if (n.getNumero() < menorNumero) {
                menorNumero = n.getNumero();
            }
        }
    } else {
        System.out.println("A lista esta vazia!");
    }
    return menorNumero;
  }

  public void listaNumeros() {
    if (!numeroList.isEmpty()) {
        int posicao = 0;
        for (Numero n : numeroList) {
            System.out.println("Posicao: " + posicao +  " Numero: " + n.getNumero());
            posicao++;
        }
    } else {
        System.out.println("A lista esta vazia!");
    }
  }


  public static void main(String[] args) throws Exception {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(12);
    somaNumeros.adicionarNumero(32);
    somaNumeros.adicionarNumero(15);
    somaNumeros.adicionarNumero(67);
    somaNumeros.adicionarNumero(5);

    System.out.println("A soma: " + somaNumeros.calcularSoma() + " Maior Numero: " + somaNumeros.encontrarMaiorNumero() + " Menor Numero: " + somaNumeros.encontrarMenorNumero());
    somaNumeros.listaNumeros();
  }
}
