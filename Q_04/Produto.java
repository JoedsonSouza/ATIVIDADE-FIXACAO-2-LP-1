package Q_04;

public class Produto {
    private String nome;
    private double preco;
    private int quantEstoque;

    //MÉTODO CONSTRUTOR
    public Produto(String nome, double preco, int quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    //MÉTODOS GETs and SETs

    /* --- nome --- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /* --- preco --- */
    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    /* --- quantEstoque --- */
    public int getEstoque(){
        if(quantEstoque < 0){
            quantEstoque = 0;
            return quantEstoque;
        }
        else
        return quantEstoque;
    }

    public void setEstoque(int qtd){
        this.quantEstoque = qtd;
    }

    //MÉTODOS PERSONALIZADOS
    public void exNomePreco(){
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
    }

    public void comprar(int qtc){
        quantEstoque -= qtc;
    }

}
