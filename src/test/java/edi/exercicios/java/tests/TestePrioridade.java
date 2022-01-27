package edi.exercicios.java.tests;

import edi.exercicios.java.enums.Prioridade;

public class TestePrioridade
{
    public static void main(String[] args)
    {
        // n�o � poss�vel instanciar uma classe enum
        // pois seu construtor � privado
        // Os �nicos objetos poss�veis da classe enum s�o Min, Normal e Max

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        // imprimir� seus nomes
        System.out.println(pMin.name());
        System.out.println(pMax.name());

        // imprimir� seus valores
        System.out.println(pMin.ordinal()); // vale 0 porque foi declarado primeiro
        System.out.println(pMax.ordinal()); // vale 2 porque dos tr�s, foi o �ltimo a ser declarado

        // Como personalizei na classe enum, agora ele imprimir� os valores padr�o
        System.out.println("Enum personalizado MIN: " + pMin.getValor());
        System.out.println("Enum personalizado MAX: " + pMax.getValor());
        
        //ONDE UTILIZAR ENUMS?
        //onde se tem constantes!!
        //Status de bot�o por exemplo, poderia ser utilizado como ligado e desligado
        //Esta��es do ano
        //E tamb�m
        //Status de um pedido processado, exemplo, na classe Thread possui status
        // Thread.State.BLOCKED;
    }
}
