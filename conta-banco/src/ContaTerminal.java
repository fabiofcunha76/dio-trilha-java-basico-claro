import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta = 0;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor informe a sua agência:  ");
        agencia = scanner.nextLine();

        System.out.print("Favor informe o número da sua conta bancária: ");
        numeroConta = scanner.nextInt();

        System.out.print("Por favor informe o saldo da sua conta: ");
        saldo = scanner.nextBigDecimal();

        System.out.println();

        System.out.println("Olá " + nomeCliente + "!"
                + " Obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo " + saldo.toString()
                + " já está disponível para saque.");
    }
}
