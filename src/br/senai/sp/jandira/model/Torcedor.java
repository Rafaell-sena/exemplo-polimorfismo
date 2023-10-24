package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Torcedor extends  Pessoas {

    Scanner scanner = new Scanner(System.in);

    public void comemorar (){
        System.out.println("BORAAAAAA, BORAAAAAAA !!!!!!!!!!");
    }

    public void cadastrarJogador (){
        System.out.println("Qual o seu nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Qual o Apelido: ");
        super.setApelido(scanner.nextLine());
        System.out.println("Informe sua Idade: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
    }

}
