import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.print("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Insira a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Insira a quarta nota: ");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;
        String resultadoFormatado = String.format("%.2f", media);
        System.out.println("A média do aluno foi: " +resultadoFormatado);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >=5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}