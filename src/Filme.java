public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluiNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;
    int mediaDasAvaliacoes;


    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Média das avaliações: " + mediaDasAvaliacoes());
    }
        void avaliacoes (double nota) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacao ++;
        }

        double mediaDasAvaliacoes() {
            return somaDasAvaliacoes / totalDeAvaliacao;

        }
        }

