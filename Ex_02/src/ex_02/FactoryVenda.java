/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_02;

import java.util.Map;

public class FactoryVenda {
    public Venda newVenda(Cliente c,Map<Produto,Integer> itens){
        return new Venda(c,itens);
    }
}
