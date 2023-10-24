package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas {

    public void comemorar(){
        System.out.println("RECEBAAAAA, toma esssa !!!!!!!");
    }

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJogador(){
        System.out.println("Informe o Nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe o Apelido: ");
        super.setApelido(scanner.nextLine());
        System.out.println("Informe sua Idade: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();

    }
}
