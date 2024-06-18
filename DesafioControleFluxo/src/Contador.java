import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int numeroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int numeroDois = terminal.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segunda parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(null);
        }

        int contagem = parametroDois - parametroUm;
        for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprimindo o número: " + contador);
        }
    }
}