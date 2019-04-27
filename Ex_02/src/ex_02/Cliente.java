package ex_02;

public class Cliente {

    private String nome;
    private Endereco endereco;
    private CPF cpf;
    private Telefone telefone;

    public Cliente(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }
    
    
    
}
