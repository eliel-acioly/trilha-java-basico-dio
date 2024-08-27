import java.util.Scanner;

public class Titulo {
    public static void main(String[] args) throws Exception{
         // Implementando método scanner
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o número da sua conta de quatro dígitos: ");
    int numeroConta = scanner.nextInt();
    
    System.out.println("Digite o número da sua agência de quatro dígitos: ");
    String agencia = scanner.next();
    
    System.out.println("Digite seu nome");
    String nomeCliente = scanner.next();
    
    System.out.println("digite seu saldo");
    double saldo = scanner.nextDouble();
    
    System.out.println("Olá " +nomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é: " + agencia+ " , conta: " + numeroConta + " e seu saldo: " + saldo+ " já está disponível para saque!");
    }
}
