package ex_02;

import java.util.Date;
import java.util.Map;


public class Venda {

   private Date data;
   private Cliente cliente;
   private ItemVenda[] itens;

    public Venda(Cliente cliente,Map<Produto,Integer> itens) {
        this.cliente = cliente;
        this.itens = new ItemVenda[itens.size()];       
        
        int index = 0;
        for(Produto p : itens.keySet()){
            this.itens[index] = new ItemVenda(p,itens.get(p));
            index++;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItemVenda[] getItens() {
        return itens;
    }
       
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
