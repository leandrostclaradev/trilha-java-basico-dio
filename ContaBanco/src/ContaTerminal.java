import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Importar a classe Scanner

        // Exibir mensagens para o usuario
        
        // Obter valores digitados dos usuarios via terminal

        //Exibir a mensagem da conta criada com as informações recebidas

        Scanner scanner = new Scanner (System.in);
        
        System.out.printf("Infome seu nome : ");
        String nome = scanner.nextLine();

        System.out.printf("Informe sua agência : ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o numero da conta : ");
        int conta = scanner.nextInt();

        System.out.println("Informe seu saldo : ");
        float saldo = scanner.nextFloat();

        System.out.println("\n\n Conta aberta com Sucesso !");
        System.out.println("\n -- INFORMAÇÕES DA CONTA --");
        System.out.println("\n\nNome: " + nome);
        System.out.println("\n\nAgência: " + agencia);
        System.out.println("\n\nConta: " + conta);
        System.out.println("\n\nSaldo: " + saldo);

    }
}
