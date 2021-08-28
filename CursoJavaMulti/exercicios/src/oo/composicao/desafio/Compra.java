package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    String cliente;

    ArrayList<Item> itens = new ArrayList<Item>();

    // receber o item que contem a caixa de leite

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    /*
     * // obter o valor total aqui? double obterValorTotal() { double total = 0;
     * 
     * 
     * for (Item item : itens) { //total += item.quantidade * produto.preco; }
     * 
     * // enviar a compra para o Cliente return total;
     * 
     * }
     */

}
