package hanburgueria;

public abstract class HamburguerDecorator implements Hamburguer {
    private Hamburguer hamburguer;
    public String ingredientes;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getAdicionalPreco();

    public float getPreco() {
        return this.hamburguer.getPreco() + this.getAdicionalPreco();
    }

    public abstract String getNomeIngrediente();

    public String getIngredientes() {
        return this.hamburguer.getIngredientes() + ", " + this.getNomeIngrediente();
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}