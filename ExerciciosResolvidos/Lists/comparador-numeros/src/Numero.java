

public class Numero implements Comparable<Numero> {
  private int numero;

  public Numero(int numero) {
    this.numero = numero;
    }

  @Override
  public int compareTo(Numero n) {
    return Integer.compare(numero, n.getNumero());
  }

  public int getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return "{" + numero + "}";
  }
}
