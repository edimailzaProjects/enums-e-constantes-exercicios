package edi.exercicios.java.classes;

public class ImprimeDiasSemanaConstantes
{
    //Utiliza inteiros em vez da classe enum como par�metro
    public static void imprimeDiaSemanaConstantes(int dia)
    {
        switch (dia)
        {
        case 1: //chama o inteiro em vez da constante
            System.out.println("Segunda-feira");
            break;
        case 2:
            System.out.println("Ter�a-feira");
            break;
        case 3:
            System.out.println("Quarta-feira");
            break;
        case 4:
            System.out.println("Quinta-feira");
            break;
        case 5:
            System.out.println("Sexta-feira");
            break;
        case 6:
            System.out.println("S�bado");
            break;
        case 7:
            System.out.println("Domingo");
            break;

        default:
            break;
        }

    }
}
