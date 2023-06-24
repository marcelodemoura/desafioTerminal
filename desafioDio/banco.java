package desafioDio;

import java.util.Scanner;

public class banco{
/**
 * @param args
 */
public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int conta;
    short agencia;
    String nome;
    Double saldo;

    
    System.out.print(" Informe sua conta! ");
    conta = s.nextInt();

    System.out.print(" Informe sua Agencia! ");
    agencia = s.nextShort();

    System.out.print(" Informe valor! ");
    saldo = s.nextDouble();

     System.out.print(" Informe seu nome completo! ");
    nome = s.next();
    
    s.close();

    System.out.println(" Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua Agencia é "
     +agencia +" conta "+ conta +" seu saldo " + saldo +" ja esta disponivel para saque");



    }
}