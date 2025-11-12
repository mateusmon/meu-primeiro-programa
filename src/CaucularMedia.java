import java.util.Scanner;

public class CaucularMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro trimestre: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a nota do segundo trimestre: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);

        teclado.close();
    }
}





