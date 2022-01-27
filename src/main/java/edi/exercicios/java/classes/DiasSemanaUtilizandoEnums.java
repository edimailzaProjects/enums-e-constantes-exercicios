package edi.exercicios.java.classes;

import edi.exercicios.java.enums.DiasSemanaEnums;

public class DiasSemanaUtilizandoEnums
{
    public static void usandoEnums() {
        //Declara a classe Enum em vez do tipo inteiro
        DiasSemanaEnums segunda = DiasSemanaEnums.SEGUNDA;
        DiasSemanaEnums terca = DiasSemanaEnums.TERCA;
        DiasSemanaEnums quarta = DiasSemanaEnums.QUARTA;
        DiasSemanaEnums quinta = DiasSemanaEnums.QUINTA;
        DiasSemanaEnums sexta = DiasSemanaEnums.SEXTA;
        DiasSemanaEnums sabado = DiasSemanaEnums.SABADO;
        DiasSemanaEnums domingo = DiasSemanaEnums.DOMINGO;  
        
        System.out.println("Teste utilizando Enums no Java");
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(segunda);
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(terca);
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(quarta);
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(quinta);
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(sexta);
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(sabado);
        ImprimeDiasSemanaEnums.ImprimeDiaSemanaEnums(domingo);
        
    }

}
