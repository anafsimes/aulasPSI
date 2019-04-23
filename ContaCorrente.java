/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6_m9;

import java.util.Scanner;

/**
 *
 * @author al.anasimoes
 */
public class ContaCorrente {
    Scanner sc = new Scanner(System.in);
    double atual, atual1;
    double saldo;
    String agencia, numero;
    boolean especial;

    void realizarLevantamento(){
        System.out.println("Quanto dinheiro deseja levantar ");
        int quantia=sc.nextInt();
        if(quantia<saldo){
            atual= saldo-quantia;
            System.out.println("O levantamento foi efetuado com sucesso " +atual);
        }else
            System.out.println("Não tem saldo sufeciente " );     
    }
        
    void depositarDinheiro(){
        System.out.println("Quanto dinheiro quer depositar");
        double deposito=sc.nextDouble();
        atual1=saldo+deposito;
        
    }
    
    void consultarSaldo(){
       System.out.println("O saldo atual da conta é " +atual
       );
    }
}
