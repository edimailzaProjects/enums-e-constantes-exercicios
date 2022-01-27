package edi.exercicios.java.tests;

public class TestePrioridadeThread
{
    public static void main(String[] args)
    {
        //Aqui devolve um inteiro, logo, aqui, foi utilizado um ENUM
        System.out.println(Thread.MAX_PRIORITY);
        
        Thread tread = new Thread(() -> System.out.println("Rodando..."));
        
        tread.start();
        
        //para isso, estabeleço a prioridade
        tread.setPriority(Thread.MIN_PRIORITY);
    }

}
