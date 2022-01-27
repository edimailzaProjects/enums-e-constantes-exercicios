package edi.exercicios.java.enums;

public enum DiasSemanaEnums
{
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    int dia;

    DiasSemanaEnums(int dia)
    {
        this.dia = dia;
    }
    
    public int getDia()
    {
        return this.dia;
    }
}
