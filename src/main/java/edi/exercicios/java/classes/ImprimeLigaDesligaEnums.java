package edi.exercicios.java.classes;

import edi.exercicios.java.enums.LigaDesligaEnums;

public class ImprimeLigaDesligaEnums
{
    public static void ligaDesliga(LigaDesligaEnums interruptor)
    {
        switch (interruptor)
        {
        case LIGA:
            System.out.println("Ligando....");
            System.out.println("Ligado!");
            break;
        case DESLIGA:
            System.out.println("Desligando....");
            System.out.println("Desligado!");
            break;
        default:
            break;
        }
    }
}
