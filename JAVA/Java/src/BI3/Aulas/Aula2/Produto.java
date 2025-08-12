package BI3.Aulas.Aula2;

public class Produto {
    public String nome;
    public double preco;
    public int qtd;



    public double totalValorEstoque(){
        return qtd * preco;
    }

    public void addProduto(int qtd){
        this.qtd += qtd;
    }
    public void removeProduto(int qtd){
        this.qtd -= qtd;
    }
    
    @Override
    public String toString(){
        return  String.format(
                                "Produto: %s" +
                                "\nPreco: R$ %.2f" +
                                "\nQuantidade: %d" +
                                "\nValor total em estoque: R$ %.2f",

                                nome, preco, qtd, totalValorEstoque()
                            );
    }

}



