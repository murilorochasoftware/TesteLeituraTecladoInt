import java.util.Scanner;

public class TesteLeituraTecladoInt {

    public static void main(String[] args) {
        int dadoIntDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo int e aperte a tecla enter:");
        dadoIntDigitado = scanner.nextInt();

        System.out.printf("O dado do tipo int digitado foi: %d", dadoIntDigitado);

    }
}
