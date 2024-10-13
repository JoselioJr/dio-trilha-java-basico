import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scan.next();

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scan.next();

        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo R$"+saldo+" já está disponível para saque.");
    }
}