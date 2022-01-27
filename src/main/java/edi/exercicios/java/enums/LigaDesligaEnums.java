package edi.exercicios.java.enums;

public enum LigaDesligaEnums
{
    LIGA(true), DESLIGA(false);

    private boolean interruptor;

    private LigaDesligaEnums(boolean interruptor)
    {
        this.interruptor = interruptor;
    }

    public boolean isInterruptor()
    {
        return interruptor;
    }

}
