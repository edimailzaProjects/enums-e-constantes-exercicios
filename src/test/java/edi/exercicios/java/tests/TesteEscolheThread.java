package edi.exercicios.java.tests;

public class TesteEscolheThread
{
    public static void main(String[] args)
    {
        //thread é uma linha de execução
        Thread tread1 = new Thread(() -> System.out.println("tread1 - Rodando..."));
        Thread tread2 = new Thread(() -> System.out.println("tread2 - Rodando..."));
        Thread tread3 = new Thread(() -> System.out.println("tread3 - Rodando..."));
        
        //é possível definir a prioridade de qual linha de execução de quer rodar
        tread1.start();
        tread2.start();
        tread3.start();
        
        //para isso, estabeleço a prioridade
        tread1.setPriority(Thread.MIN_PRIORITY);
        tread2.setPriority(Thread.MAX_PRIORITY);
        tread3.setPriority(Thread.NORM_PRIORITY);
        
    }
}
