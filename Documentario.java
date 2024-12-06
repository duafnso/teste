// Jose Eduardo Afonso - 2151324
public class Documentario extends Conteudo {
    private String narrador;

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    @Override
    public String toString() {
        return super.toString() + ", Narrador: " + narrador;
    }
}
