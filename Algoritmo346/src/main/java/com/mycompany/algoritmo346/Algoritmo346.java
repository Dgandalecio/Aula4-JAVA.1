/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo346;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Algoritmo346 {

    public static void main(String[] args) {
        
        String frase;
        int op, x, tam;
        
        do{
        System.out.println("\n menu");
        
        System.out.println(" l - Imprime o comprimento da frase");
        
        System.out.println( "2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
        
        System.out.println(" 3 - Imprime a frase espelhada");
        
        System.out.println(" 4 -Termina o algoritmo");
        
        
        frase= JOptionPane.showInputDialog("Opcao");
        
        op= Integer.parseInt(frase);
        
       if(op==1){
           frase= JOptionPane.showInputDialog("Digite uma frase:");
           tam = frase.length();
           System.out.println(frase);
           System.out.println("numero de caracteres da frase:"+tam);
       }
       else if (op==2){
           frase= JOptionPane.showInputDialog("Digite uma frase:");
           System.out.println(frase);
           System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
           tam = frase.length();
           System.out.println("Os dois últimos caracteres: " + frase.substring(tam - 2));
               
       }
       else if (op==3){
           frase= JOptionPane.showInputDialog("Digite uma frase:");
           System.out.println(frase);
           String fraseInvertida="";
        for(x = frase.length() - 1; x >= 0; x--){
            fraseInvertida +=frase.charAt(x);
        }       
           System.out.println(fraseInvertida);
       }
       else if (op==4){
           System.out.println("Fim do algoritmo");}
       
             else {System.out.println("opcao nao disponivel");
             
       }System.out.println("\n\n");
    }while(op !=4);
}
}
    
    

