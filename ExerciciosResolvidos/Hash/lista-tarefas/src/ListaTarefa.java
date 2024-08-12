import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
  
  private Set<Tarefa> tarefaSet;

  public ListaTarefa() {
    this.tarefaSet = new HashSet<>();
  }

  public void adicionarTarefa(String tarefa) {
    tarefaSet.add(new Tarefa(tarefa));
  }

  public void removerTarefa(String tarefa) {
    Tarefa tarefaRemover = null;
    for (Tarefa t : tarefaSet) {
        if (t.getDescricaoTarefa() == tarefa) {
            tarefaRemover = t;
        }
    }
    if (tarefaRemover != null) tarefaSet.remove(tarefaRemover);
    else System.out.println("Objeto nao encontrado");
  }

  public void exibirTarefas() {
    System.out.println(tarefaSet);
  }

  public void contarTarefas() {
    int contador = 0;
    if (!tarefaSet.isEmpty()) {
        for (Tarefa t : tarefaSet) contador++;
        System.out.println("Total de Tarefas: " + contador++);
    } else {
        throw new RuntimeException("Nao existe nenhuma tarefa");
    }
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    if (!tarefaSet.isEmpty()) {
        for(Tarefa t : tarefaSet) {
            if (t.getTarefaConcluida() == true) tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    } else {
        throw new RuntimeException("Nao existe nenhuma tarefa");
    }
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    if (!tarefaSet.isEmpty()) {
        for(Tarefa t : tarefaSet) {
            if (t.getTarefaConcluida() == false) tarefasPendentes.add(t);
        }
        return tarefasPendentes;
    } else {
        throw new RuntimeException("Nao existe nenhuma tarefa");
    }
  }

  public void marcarTarefaConcluida(String tarefa) {
    for (Tarefa t : tarefaSet) {
        if (t.getDescricaoTarefa() == tarefa) t.setTarefa(true);
    }
  }

  public void marcarTarefaPendente(String tarefa) {
    for (Tarefa t : tarefaSet) {
        if (t.getDescricaoTarefa() == tarefa) t.setTarefa(false);
    }
  }

  public void limparLista() {
    if(tarefaSet.isEmpty()) System.out.println("Lista vazia");
    else tarefaSet.clear();
  }

  public static void main(String[] args) throws Exception {
    ListaTarefa listaTarefa = new ListaTarefa();

    listaTarefa.adicionarTarefa("Lavar louca");
    listaTarefa.adicionarTarefa("Estudar");
    listaTarefa.adicionarTarefa("Cortar Cabelo");
    listaTarefa.adicionarTarefa("Jogar");

    listaTarefa.exibirTarefas();

    listaTarefa.marcarTarefaConcluida("Jogar");
    listaTarefa.marcarTarefaConcluida("Cortar Cabelo");
    listaTarefa.marcarTarefaPendente("Cortar Cabelo");

    listaTarefa.removerTarefa("Estudar");

    listaTarefa.exibirTarefas();

    listaTarefa.adicionarTarefa("Estudar");

    listaTarefa.contarTarefas();

    System.out.println(listaTarefa.obterTarefasConcluidas());
    System.out.println(listaTarefa.obterTarefasPendentes());

    listaTarefa.limparLista();

    listaTarefa.exibirTarefas();

  }
}
