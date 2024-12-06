// Nome: Seu Nome
public class Filme extends Conteudo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diretor: " + diretor;
    }
}