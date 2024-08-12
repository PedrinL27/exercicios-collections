import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

  private HashSet<Aluno> alunoSet;

  public GerenciadorAlunos() {
    this.alunoSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, int matricula, double nota) {
    alunoSet.add(new Aluno(nome, matricula, nota));
  }

  public void removerAluno(int matricula) {
    Aluno alunoRemover = null;
    for (Aluno a : alunoSet) {
        if (a.getMatricula() == matricula) {
            alunoRemover = a;
        }
    }
    if (alunoRemover!=null) alunoSet.remove(alunoRemover);
    else System.out.println("Nao existe essa matricula");
  }

  public Set<Aluno> ordenarPorNome() {
    Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
    return alunoPorNome;
  }

  public Set<Aluno> ordenarPorNota() {
    Set<Aluno> alunoPorNota = new TreeSet<>(new comparatorPorNota());
    alunoPorNota.addAll(alunoSet);
    return alunoPorNota;
  }

  public void exibirAlunos() {
    System.out.println(alunoSet);
  }


  public static void main(String[] args) throws Exception {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    gerenciadorAlunos.adicionarAluno("Joao", 0213, 8.5);
    gerenciadorAlunos.adicionarAluno("Maria", 0214, 7.5);
    gerenciadorAlunos.adicionarAluno("Daniel", 0414, 10);

    gerenciadorAlunos.exibirAlunos();

    System.out.println(gerenciadorAlunos.ordenarPorNome());
    System.out.println(gerenciadorAlunos.ordenarPorNota());

    gerenciadorAlunos.removerAluno(268);

    gerenciadorAlunos.exibirAlunos();
        
  }
}
