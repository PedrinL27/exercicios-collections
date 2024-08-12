public class Tarefa {
  private String descricaoTarefa;
  private boolean tarefaConcluida;

  public Tarefa(String descricaoTarefa) {
    this.descricaoTarefa = descricaoTarefa;
    this.tarefaConcluida = false;
  }

  public void setTarefa(boolean tarefa) {
    this.tarefaConcluida = tarefa;
  }

  public String getDescricaoTarefa() {
    return descricaoTarefa;
  }

  public boolean getTarefaConcluida() {
    return tarefaConcluida;
  }

  @Override
  public String toString() {
    return "Tarefa: " + descricaoTarefa + 
    " Concluida: " + tarefaConcluida;
  }
}
