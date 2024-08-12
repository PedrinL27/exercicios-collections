import java.util.ArrayList;
import java.util.List;

public class ListaCarrinhoDeCompras {
  private List<Item> itemList;

  public ListaCarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
    }

  public void adicionarItem(String nome, double preco, int quantidade){
    itemList.add(new Item(nome, preco, quantidade));
    }

  public void removerItem(String nome) {
    List<Item> itemParaRemover = new ArrayList<>();
    if(!itemList.isEmpty()) {
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    } else {
        System.out.println("A lista ta vazia!");
    }
}
  
  public int obterNumeroTotalItens() {
    return itemList.size();
  }

  public void exibirItens() {
    if (!itemList.isEmpty()) {
        for(Item i : itemList) {
            i.descricao();
        }
    } else {
        System.out.println("A lista ta vazia!");
    }
  }

  public double somarItens() {
    if (!itemList.isEmpty()) {
        double acumulador = 0;

        for (Item i : itemList) {
            acumulador += (i.getPreco()*i.getQuantidade());
        }

        return acumulador;
    } else {
        System.out.println("A lista ta vazia!");
        return 0;
    }
  }

  public static void main(String[] args) {
    ListaCarrinhoDeCompras listaItem = new ListaCarrinhoDeCompras();

    listaItem.adicionarItem("Leite", 3.5, 10);
    listaItem.adicionarItem("Monster", 10, 10);

    listaItem.exibirItens();
    System.out.println("A soma do carrinho: " + listaItem.somarItens());
  }

}
