import java.util.Scanner;
public class calculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        // peso div (altura * altura)
        System.out.print("Digite seu peso: ");
        float peso = leitorTeclado.nextFloat();
        System.out.print("Digite sua altura: ");
        float altura = leitorTeclado.nextFloat();

        float resultado = peso / (altura * altura);

        System.out.println("O imc para o peso" + peso + ", e altura" + altura + "é" + resultado);

        leitorTeclado.close();
    }
}
