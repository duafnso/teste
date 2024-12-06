import java.util.ArrayList;
import java.util.List;

// Jose Eduardo Afonso - 2151324
public class PlataformaStreaming implements Gerenciavel {
    private List<Conteudo> conteudos;

    public PlataformaStreaming() {
        conteudos = new ArrayList<>();
    }

    @Override
    public void adicionarConteudo(Conteudo conteudo) {
        if (conteudo == null) {
            throw new ConteudoInvalidoException("Conteúdo não pode ser nulo.");
        }
        conteudos.add(conteudo);
        System.out.println("Conteúdo adicionado com sucesso!");
    }

    @Override
    public void listarConteudos() {
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo disponível.");
        } else {
            for (Conteudo conteudo : conteudos) {
                System.out.println(conteudo);
            }
        }
    }
}
