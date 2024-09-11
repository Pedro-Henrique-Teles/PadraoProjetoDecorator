package hanburgueria;

public class HamburguerSimples implements Hamburguer {
    public float preco;

    public HamburguerSimples() {
        this.preco = 10.0f; // Preço base de um hambúrguer simples
    }

    public float getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return "Pão, Carne";
    }
}
