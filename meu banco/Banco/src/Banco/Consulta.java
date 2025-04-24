package Banco;

import java.util.Scanner;

public class Consulta {

    public static void main(String[] args) {

      int contaCorrente;
      String agencia;
      String nomeCliente;
      double saldo;

        Scanner scan = new Scanner (System.in);
        
        System.out.println("digite o numero da sua conta corrente: ");

        contaCorrente = scan.nextInt();

        System.out.println("numero da agencia bancaia:");

        agencia = scan.nextLine();

        System.out.println("nome do cliente:");

        nomeCliente = scan.nextLine();

        System.out.println("saldo:");

        saldo = scan.nextDouble();

        System.out.println("-dados do cliente-" + "\n" + "Sr(a):" +nomeCliente +"\n" + "conta corrente: " + contaCorrente + "numero da agencia:"+ "\n" + agencia + "saldo na conta: " + saldo);



  
    }
    
}
