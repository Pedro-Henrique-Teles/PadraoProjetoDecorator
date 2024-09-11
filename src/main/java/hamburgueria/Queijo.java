package hanburgueria;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getAdicionalPreco() {
        return 2.5f; // Preço adicional do queijo
    }

    public String getNomeIngrediente() {
        return "Queijo";
    }
}