package edi.exercicios.java.tests;

import edi.exercicios.java.enums.Prioridade;

public class TestePrioridade
{
    public static void main(String[] args)
    {
        // não é possível instanciar uma classe enum
        // pois seu construtor é privado
        // Os únicos objetos possíveis da classe enum são Min, Normal e Max

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        // imprimirá seus nomes
        System.out.println(pMin.name());
        System.out.println(pMax.name());

        // imprimirá seus valores
        System.out.println(pMin.ordinal()); // vale 0 porque foi declarado primeiro
        System.out.println(pMax.ordinal()); // vale 2 porque dos três, foi o último a ser declarado

        // Como personalizei na classe enum, agora ele imprimirá os valores padrão
        System.out.println("Enum personalizado MIN: " + pMin.getValor());
        System.out.println("Enum personalizado MAX: " + pMax.getValor());
        
        //ONDE UTILIZAR ENUMS?
        //onde se tem constantes!!
        //Status de botão por exemplo, poderia ser utilizado como ligado e desligado
        //Estações do ano
        //E também
        //Status de um pedido processado, exemplo, na classe Thread possui status
        // Thread.State.BLOCKED;
    }
}
