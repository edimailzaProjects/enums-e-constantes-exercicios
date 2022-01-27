package edi.exercicios.java.tests;

import edi.exercicios.java.enums.DisparaAutomacaoEnums;

public class TesteDisparaAutomacao
{
    public static void main(String[] args)
    {
        DisparaAutomacaoEnums disparaAutomacaoSim = DisparaAutomacaoEnums.SIM;
        DisparaAutomacaoEnums disparaAutomacaoNao = DisparaAutomacaoEnums.NAO;

        System.out.println(disparaAutomacaoSim.ordinal());
        System.out.println(disparaAutomacaoNao.ordinal());

        System.out.println(disparaAutomacaoSim.getNumero());
        System.out.println(disparaAutomacaoNao.getNumero());

        System.out.println(disparaAutomacaoSim.disparar(2));
        System.out.println(disparaAutomacaoNao.disparar(1));
        System.out.println(disparaAutomacaoNao.disparar(3));
    }

}
