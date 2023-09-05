/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo356t;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Algoritmo356T {

    public static void main(String[] args) {
       int L, C, T;

        Valores2 notas = new Valores2();

        for (L = 0; L <= 14; L++) {
            String nome = JOptionPane.showInputDialog("Digite o " + (L + 1) + "º nome:");
            notas.nomes[L] = nome;
            System.out.println(notas.nomes[L]);

            while (notas.nomes[L].length() > 30) {
                System.out.println("Nomes com até 30 caracteres são permitidos.");
                nome = JOptionPane.showInputDialog("Digite o " + (L + 1) + "º nome:");
                notas.nomes[L] = nome;
                System.out.println(notas.nomes[L]);
            }

            T = 30 - notas.nomes[L].length();

            for (C = 1; C <= T; C++) {
                notas.nomes[L] += " ";
            }

            String nota1 = JOptionPane.showInputDialog("Digite a 1ª nota:");
            notas.pr1[L] = Float.parseFloat(nota1);
            System.out.println(notas.pr1[L]);

            String nota2 = JOptionPane.showInputDialog("Digite a 2ª nota:");
            notas.pr2[L] = Float.parseFloat(nota2);
            System.out.println(notas.pr2[L]);

            notas.media[L] = (int) ((notas.pr1[L] + notas.pr2[L]) / 2 + 0.0001);

            if (notas.media[L] >= 5) {
                notas.sit[L] = "AP";
            } else {
                notas.sit[L] = "RP";
            }
        }

        System.out.print("\n\n\n\t\t\t\tRelação Final\n");

        for (L = 0; L <= 14; L++) {
            System.out.println(" \n" + (L + 1) + " - " + notas.nomes[L] + "\t" + notas.pr1[L] + "\t" + notas.pr2[L] + "\t" + notas.media[L] + "\t" + notas.sit[L]);
        }
    }
}