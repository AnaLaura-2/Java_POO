package exe1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    // associação com vetor
    private List<CarItem> itens;

    public ShoppingCart() {
        //  aloca espaço na memoria para vetor
        this.itens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id) {
        this.id = id;
        //  aloca espaço na memoria para vetor
        this.itens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarItem> getItens() {
        return itens;
    }

    public void setItens(List<CarItem> itens) {
        this.itens = itens;
    }

    public void addCarItem(int quantify, Product product) {
        // adicione item no ArrayList
        this.itens.add(new CarItem(quantify, product));
        System.out.println("Item de carrinho adicionado com sucesso!");
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", itens=" + itens +
                '}';
    }

    // Criar metodo que calcula o valor total do carrinho de compras
    public void valorTotal(){
        float total = 0;
        // para cada CarItem do vetor
        // a variavel item repsente um item do vetor
        for (CarItem item : itens) {
            total += item.getQuantify() * item.getProduct().getPrice();
        }
        System.out.println("Total do carrinho: " + total);
    }
    // remove um item do carrinho
    public void removeCarItem(int quantify, Product product) {
        // tentar encontrar solução para remoção

        boolean resposta = this.itens.remove(new  CarItem(quantify, product));
        if(resposta){
            System.out.println("Item de carrinho removido com sucesso!");
        }
        else System.out.println("Item de carrinho não foi removido!");
    }
}