import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
    
        // Criamos o scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        // Passe todas as informações a serem inseridas nas variaveis
        
        System.out.println("Por favor, digite o número da agência: formato(XXX-X)");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome completo: ");
        //nextLine é usado para ser possivel escrever o nome completo dando espaço em apenas uma variavel, sem a necessidade de criar uma variavel "sobrenome" e concatenar
        // OBS: é preciso usar dois nextLine() pois o primeiro pega a quebra de linha do input anterior, resultando em uma variavel com o valor vazio.
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        

        System.out.println("Digite o valor do depósito inicial: ");
        
        Double saldo = scanner.nextDouble();

        // Exiba a mensagem com todas as informações
        System.out.println("Olá "  + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
