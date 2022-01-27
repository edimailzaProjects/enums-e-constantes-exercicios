package edi.exercicios.java.classes;

import edi.exercicios.java.enums.DiasSemanaEnums;

public class ImprimeDiasSemanaEnums
{
    //Utiliza a classe Enum em vez de um n�mero inteiro
    public static void ImprimeDiaSemanaEnums(DiasSemanaEnums diasSemanaEnums)
    {
        switch (diasSemanaEnums)
        {
        case SEGUNDA: //chama as constantes em vez do n�mero inteiro
            System.out.println("Segunda-feira");
            break;
        case TERCA:
            System.out.println("Ter�a-feira");
            break;
        case QUARTA:
            System.out.println("Quarta-feira");
            break;
        case QUINTA:
            System.out.println("Quinta-feira");
            break;
        case SEXTA:
            System.out.println("Sexta-feira");
            break;
        case SABADO:
            System.out.println("S�bado");
            break;
        case DOMINGO:
            System.out.println("Domingo");
            break;

        default:
            break;
        }

    }
}
