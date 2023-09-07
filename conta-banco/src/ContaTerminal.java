import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("-------------------- Abertura de Conta --------------------");

        System.out.println("Digite o seu nome:");
        String nome = scan.next();

        System.out.println("Escolha o tipo de conta: 1 = Conta Corrente | 2 = Poupança ");
        int tipoConta = scan.nextInt();
        String tConta = Integer.toString(tipoConta);

        switch(tipoConta){
            case (1):
            tConta = "Conta Corrente";
            break;
            case (2):
            tConta = "Conta Poupança";
            break;
        }
        
        System.out.println("Digite a agência:");
        String agencia = scan.next();

        System.out.println("Digite o número da conta:");
        int numeroConta = scan.nextInt();

        System.out.println("Informe o deposito inicial:");
        double deposito = scan.nextDouble();

        System.out.println("Conta Bancária criada com Sucesso!");
        System.out.println("Obrigado " + nome + " por criar uma conta em nosso banco.");
        System.out.println("---------- Dados da Conta ----------");
        System.out.println("Nome do Cliente = " + nome);
        System.out.println("Tipo de Conta = " + tConta);
        System.out.println("Número da agência = " + agencia);
        System.out.println("Número da conta = " + numeroConta);
        System.out.println("Saldo inicial = R$ " + deposito);
        System.out.println("-------------------------------------");
    }
}
