package hanburgueria;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getAdicionalPreco() {
        return 3.0f; // Preço adicional do bacon
    }

    public String getNomeIngrediente() {
        return "Bacon";
    }
}