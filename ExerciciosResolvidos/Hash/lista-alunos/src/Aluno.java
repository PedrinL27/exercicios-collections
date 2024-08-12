import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
  private String nome;
  private int matricula;
  private double nota;

  public Aluno(String nome, int matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  } 

  @Override
  public int compareTo(Aluno a) {
    return nome.compareToIgnoreCase(a.getNome());
  }

  public int getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }

  @Override
  public String toString() {
    return "Matricula: " + matricula 
    + " Nome: " + nome
    + " Nota: " + nota;
  }

}

class comparatorPorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getNota(), a2.getNota());
  }

}
