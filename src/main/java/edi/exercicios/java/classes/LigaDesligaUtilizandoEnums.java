package edi.exercicios.java.classes;

import edi.exercicios.java.enums.LigaDesligaEnums;

public class LigaDesligaUtilizandoEnums
{
    public static void apertaInterruptor()
    {
        LigaDesligaEnums liga = LigaDesligaEnums.LIGA;
        LigaDesligaEnums desliga = LigaDesligaEnums.DESLIGA;
        
        ImprimeLigaDesligaEnums.ligaDesliga(liga);
        ImprimeLigaDesligaEnums.ligaDesliga(desliga);
    }
}
