package br.metodista.ads5;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação I
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  21/08/2018 - 15:00
 */
public class Cliente {
    private String nome;
    private int cnpj;
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cnpj=" + cnpj + '}';
    }

     public static class Builder {
            private  Cliente cliente;
            public Builder(){
            this.cliente = new Cliente();
        }
        public Builder comNome(String nome){
              this.cliente.nome = nome;
              return this;         
        } 
        public Builder comCnpj(int cnpj){
               this.cliente.cnpj = cnpj;
               return this;         
        }
        Cliente Builder() {
       return this.cliente;
       }
    }
}

