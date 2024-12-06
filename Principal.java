import java.util.Scanner;

// Nome: Seu Nome
public class Principal {
    public static void main(String[] args) {
        PlataformaStreaming plataforma = new PlataformaStreaming();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Conteúdo");
            System.out.println("2. Listar Conteúdos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de conteúdo (Filme/Serie/Documentario): ");
                    String tipo = scanner.nextLine();
                    Conteudo conteudo = null;

                    if (tipo.equalsIgnoreCase("Filme")) {
                        conteudo = new Filme();
                        System.out.print("Digite o título: ");
                        conteudo.setTitulo(scanner.nextLine());
                        System.out.print("Digite o gênero: ");
                        conteudo.setGenero(scanner.nextLine());
                        System.out.print("Digite a duração (minutos): ");
                        conteudo.setDuracao(scanner.nextInt());
                        scanner.nextLine(); // Limpar o buffer
                        System.out.print("Digite o diretor: ");
                        ((Filme) conteudo).setDiretor(scanner.nextLine());
                    } else if (tipo.equalsIgnoreCase("Serie")) {
                        conteudo = new Serie();
                        System.out.print("Digite o título: ");
                        conteudo.setTitulo(scanner.nextLine());
                        System.out.print("Digite o gênero: ");
                        conteudo.setGenero(scanner.nextLine());
                        System.out.print("Digite a duração (minutos): ");
                        conteudo.setDuracao(scanner.nextInt());
                        scanner.nextLine(); // Limpar o buffer
                        System.out.print("Digite o número de temporadas: ");
                        ((Serie) conteudo).setTemporadas(scanner.nextInt());
                    } else if (tipo.equalsIgnoreCase("Documentario")) {
                        conteudo = new Documentario();
                        System.out.print("Digite o título: ");
                        conteudo.setTitulo(scanner.nextLine());
                        System.out.print("Digite o gênero: ");
                        conteudo.setGenero(scanner.nextLine());
                        System.out.print("Digite a duração (minutos): ");
                        conteudo.setDuracao(scanner.nextInt());
                        scanner.nextLine(); // Limpar o buffer
                        System.out.print("Digite o narrador: ");
                        ((Documentario) conteudo).setNarrador(scanner.nextLine());
                    } else {
                        System.out.println("Tipo de conteúdo inválido.");
                        continue;
                    }

                    try {
                        plataforma.adicionarConteudo(conteudo);
                    } catch (ConteudoInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    plataforma.listarConteudos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}