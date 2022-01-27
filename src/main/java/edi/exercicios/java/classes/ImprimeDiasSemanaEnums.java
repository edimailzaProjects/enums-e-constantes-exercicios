package edi.exercicios.java.classes;

import edi.exercicios.java.enums.DiasSemanaEnums;

public class ImprimeDiasSemanaEnums
{
    //Utiliza a classe Enum em vez de um número inteiro
    public static void ImprimeDiaSemanaEnums(DiasSemanaEnums diasSemanaEnums)
    {
        switch (diasSemanaEnums)
        {
        case SEGUNDA: //chama as constantes em vez do número inteiro
            System.out.println("Segunda-feira");
            break;
        case TERCA:
            System.out.println("Terça-feira");
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
            System.out.println("Sábado");
            break;
        case DOMINGO:
            System.out.println("Domingo");
            break;

        default:
            break;
        }

    }
}
