import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta por favor: ");

        var numeroConta = sc.nextInt();

        System.out.println("Digite o numero da agencia por favor: ");

        var agencia = sc.next();

        System.out.println("Qual o seu nome: ");

        var nomeCliente = sc.next();

        System.out.println("Qual seu saldo em caixa: ");

        var saldo = sc.nextDouble();

        var conta = new Conta(numeroConta, agencia, nomeCliente, saldo);

        System.out.println(conta);

    }
}