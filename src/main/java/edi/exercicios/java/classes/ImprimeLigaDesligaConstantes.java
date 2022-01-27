package edi.exercicios.java.classes;

public class ImprimeLigaDesligaConstantes
{
    public static void ligaDesliga(boolean interruptor)
    {
        if (interruptor)
        {
            System.out.println("Ligando...");
            System.out.println("Ligado.");
        }
        else
        {
            System.out.println("Desligando...");
            System.out.println("Desligado.");
        }
    }
}
