/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algortimo351;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Algortimo351 {

    public static void main(String[] args) {
      
        int L, num;
        String[] nome = new String[5];

        for (L = 0; L <= 4; L++) {
            String nomes = JOptionPane.showInputDialog("Nome " + (L + 1) + ":");
            nome[L] = nomes;
        }

        String pessoa;
        do {
            pessoa = JOptionPane.showInputDialog("Digite o numero da pessoa");
            num = Integer.parseInt(pessoa);
            System.out.println(num);

            if (num < 1 || num > 5) {
                System.out.println("Numero fora do intervalo");
            }
        } while (num < 1 || num > 5);

        System.out.println(nome[num - 1]);
    }
}