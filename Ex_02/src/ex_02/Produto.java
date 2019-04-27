package ex_02;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Produto {

    private String nome;
    private BigDecimal precoUnitario;

    public Produto(String nome, BigDecimal precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrecoUnitario() {
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        return formato.format(precoUnitario);
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
