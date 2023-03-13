package controller;

import util.Teclado;

public class Exercicio2 {

    /*
    * Fazer um programa que pede 4 valores inteiros e apresenta 2 resultados: resultado de adição e outro
    * de multiplicação
    *  */

    public static void main(String[] args) {

        //variavel
        int n1, n2, n3, n4, soma, multip;

        //entrada de dados
        n1 = Teclado.lerInt("Informe o primeiro numero: ");
        n2 = Teclado.lerInt("Informe agora o segundo: ");
        n3 = Teclado.lerInt("informe o terceiro: ");
        n4 = Teclado.lerInt("Informe o quarto: ");

        //processamento
        soma = n1 + n2 + n3 + n4;
        multip = n1 * n2 * n3 * n4;

        //saida
        System.out.println("A soma entre os numeros é: "+soma);
        System.out.println("A multiplicação entre ele é: "+multip);


    }
}
