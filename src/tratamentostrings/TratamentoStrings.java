/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentostrings;

import java.util.Scanner;
/**
 *
 * @author Augusto Kussema
 */
public class TratamentoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Obtendo o comprimento da string
        int comprimento = frase.length();
        System.out.println("Comprimento da string: " + comprimento);

        // Obtendo um caractere em uma posição específica
        char primeiroCaractere = frase.charAt(0);
        System.out.println("Primeiro caractere: " + primeiroCaractere);

        // Verificando se a string contém um determinado texto
        boolean contemTexto = frase.contains("mundo");
        System.out.println("Contém a palavra 'mundo'? " + contemTexto);

        // Substituindo parte da string
        String novaFrase = frase.replace("Olá", "Oi");
        System.out.println("Nova frase: " + novaFrase);

        // Dividindo a string em substrings usando um separador
        String[] palavras = frase.split(" ");
        System.out.println("Palavras na frase:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        // Convertendo a string para maiúsculas e minúsculas
        String maiusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("Em maiúsculas: " + maiusculas);
        System.out.println("Em minúsculas: " + minusculas);
    }
    
}
