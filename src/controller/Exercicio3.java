package controller;

import util.Teclado;

public class Exercicio3 {

    /*
    * Fazer um programa que peça um valor em doláres e converta  para reais: U$1,00 = R$5,42
    */

    public static void main(String[] args) {
        //variavel
        double dollar, real;

        //entrada de dados
        dollar = Teclado.lerDouble("Informe um valor em Dólares: ");

        //processamento
        real = dollar * 5.42;

        //saida (modifiquei essa parte do código para mostrar só as casas decimais relevantes)
        System.out.printf("O valor em reais é: R$%.2f",  real);  //erro concertado

        //ALERTA: NÃO USAR PRINTF COM '+'

        //%.2f limita as casas decimais em dois
        //%n passa para prox linha
    }
}
