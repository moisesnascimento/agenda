package com.github.moisesnascimento.agenda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Agenda p = new Agenda();
        p.adicionarPessoa("Maria", 60, 1.80);
        p.adicionarPessoa("Faustao", 56, 1.43);
        p.imprimirAgenda();
        p.imprimePessoa(0);
    }
}
