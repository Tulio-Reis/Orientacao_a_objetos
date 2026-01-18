import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avaliacoes(2);
        meuFilme.avaliacoes(9.5);
        meuFilme.avaliacoes(8.9);
        meuFilme.exibeFichaTecnica();
        System.out.print("Qual sua nota para o filme?");
        double avaliacoes =  notas.nextDouble();


    }
}




