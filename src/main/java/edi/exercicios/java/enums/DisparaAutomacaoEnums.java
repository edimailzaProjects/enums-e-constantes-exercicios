package edi.exercicios.java.enums;

public enum DisparaAutomacaoEnums
{
    NAO(1), SIM(2);

    int numero;

    DisparaAutomacaoEnums(int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    public DisparaAutomacaoEnums disparar(int num)
    {
        if (num ==1)
        {
            
            return DisparaAutomacaoEnums.NAO;
        }else if (num == 2)
        {
            return DisparaAutomacaoEnums.SIM;
        }
        else
            System.out.println("Modo não encontrado, executando o modo 2");
            return DisparaAutomacaoEnums.NAO;
    }
    
    

}
