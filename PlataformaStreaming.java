import java.util.ArrayList;
import java.util.List;

// Jose Eduardo Afonso - 2151324
import java.util.ArrayList;
import java.util.List;

public class PlataformaStreaming implements Gerenciavel {
    private List<Conteudo> conteudos;

    public PlataformaStreaming() {
        conteudos = new ArrayList<>();
    }

    @Override
    public void adicionarConteudo(Conteudo conteudo) {
        if (conteudo == null) {
            System.out.println("Erro: Conteúdo não pode ser nulo.");
            return;
        }

        // Verificação adicional: valida campos essenciais do conteúdo
        if (conteudo.getTitulo() == null || conteudo.getTitulo().isEmpty() ||
            conteudo.getGenero() == null || conteudo.getGenero().isEmpty() ||
            conteudo.getDuracao() <= 0) {
            System.out.println("Erro: O conteúdo possui campos inválidos.");
            return;
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
