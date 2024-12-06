// Jose Eduardo Afonso - 2151324
public class Serie extends Conteudo {
    private int temporadas;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temporadas: " + temporadas;
    }
}
