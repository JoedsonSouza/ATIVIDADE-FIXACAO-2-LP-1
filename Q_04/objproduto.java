package Q_04;

public class objproduto {
    public static void main(String[] args) {
        //Instanciar um objeto Produto com nome, preço e quantidade disponível no estoque igual a 10
        Produto produto = new Produto("Arroz", 5, 10);

        //Mostrar na tela o nome e o preço do produto
        produto.exNomePreco();

        //Comprar um produto
        produto.comprar(1);

        //Mostrar na tela a quantidade de produtos no estoque
        System.out.println("Quantidade em estoque: " + produto.getEstoque());

        //Comprar um produto
        produto.comprar(1);

        //Mostrar na tela a quantidade de produtos no estoque
        System.out.println("\nQuantidade em estoque: " + produto.getEstoque());

        //Comprar 9 produtos
        produto.comprar(9);

        // Mostrar na tela a quantidade de produtos no estoque
        System.out.println("\nQuantidade em estoque: " + produto.getEstoque());

    }
}
