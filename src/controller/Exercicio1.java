package controller;

import util.Teclado;

import java.util.Scanner;

public class Exercicio1 {

    /*
    *   Desenvolver um programa que pergunta nome, sexo e retorna os dados
     */

    public static void main(String[] args) {



        //variavel
        String nome, sexo;

        //entrada de dados
        nome = Teclado.lerTexto("Informe seu nome completo: ");
        sexo = Teclado.lerTexto("Informe o seu sexo: ");
        //processamento

        //saida
        System.out.println("O nome informado foi: " + nome + " e o sexo informado foi: " + sexo);

    }

}
