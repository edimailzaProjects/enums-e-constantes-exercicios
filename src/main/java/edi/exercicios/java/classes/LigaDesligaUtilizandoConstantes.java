package edi.exercicios.java.classes;

import edi.exercicios.java.constants.LigaDesligaConstantes;

public class LigaDesligaUtilizandoConstantes
{
    public static void apertaInterruptor()
    {
        boolean liga = LigaDesligaConstantes.LIGA;
        boolean desliga = LigaDesligaConstantes.DESLIGA;
        
        ImprimeLigaDesligaConstantes.ligaDesliga(liga);
        ImprimeLigaDesligaConstantes.ligaDesliga(desliga);
    }

}
