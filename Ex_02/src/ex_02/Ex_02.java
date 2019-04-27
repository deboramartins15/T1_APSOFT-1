
package ex_02;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;



public class Ex_02 {

    
    public static void main(String[] args) {
        FactoryVenda fv = new FactoryVenda();
        
        Cliente c = new Cliente("Cliente");       
        Map<Produto,Integer> itens = new HashMap<>();
        
        for(int i=0;i<3;i++){             
            Produto p = new Produto("Produto"+i,BigDecimal.valueOf(i));
            ItemVenda item = new ItemVenda(p,i);
            itens.put(item.getProduto(),item.getQuantidade());
        }
        
        Venda v = fv.newVenda(c, itens);
    }
    
}
