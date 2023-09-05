/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo360;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Algoritmo360 {

    public static void main(String[] args) {
      int data, i, dia, mes;
      
        Valores4 sig = new Valores4();
        
        for( i=0; i<12; i++){
            
            String nome= JOptionPane.showInputDialog("Digite o Signo ");
            sig.signo[i]= nome;
            System.out.println(sig.signo[i]);
            
            String day = JOptionPane.showInputDialog("Digite o ultimo dia ");
            sig.ultdia[i]=Integer.parseInt(day);
        }
        data = Integer.parseInt( JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar; "));
        System.out.println(data);
        
        while(data!= 9999){
            dia = data/100;
            mes = data%100;
            mes--;
            
            if (dia> sig.ultdia[mes]){
                 mes = (mes + 1) % 12;   
            }
             System.out.println("Signo: " + sig.signo[mes]);

             data = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a data no formato ddmm ou 9999 para terminar: ")); 
            
          
        }
    }
    }
    

