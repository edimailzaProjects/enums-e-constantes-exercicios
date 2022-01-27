package edi.exercicios.java.classes;

import edi.exercicios.java.constants.DiasSemanaConstantes;

public class DiasSemanaUtilizandoConstantes
{
    public static void usandoConstantes()
    {
        //declara o tipo inteiro em vez da classe Enum 
        int segunda = DiasSemanaConstantes.SEGUNDA;
        int terca = DiasSemanaConstantes.TERCA;
        int quarta = DiasSemanaConstantes.QUARTA;
        int quinta = DiasSemanaConstantes.QUINTA;
        int sexta = DiasSemanaConstantes.SEXTA;
        int sabado = DiasSemanaConstantes.SABADO;
        int domingo = DiasSemanaConstantes.DOMINGO;
        
        System.out.println("Teste utilizando constantes no Java ");
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(segunda);
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(terca);
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(quarta);
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(quinta);
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(sexta);
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(sabado);
        ImprimeDiasSemanaConstantes.imprimeDiaSemanaConstantes(domingo);
    }

}
