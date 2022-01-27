package edi.exercicios.java.enums;

//note que a classe começa com enum em vez de class
public enum Prioridade
{
    // cada valor desse é uma instância da classe prioridade
    // MIN, NORMAL, MAX;
    // eu posso declarar os valores destes enums

    MIN(1), NORMAL(5), MAX(10); // ao declarar enum personalizado aqui, ele chamará um constutor por baixo dos panos

    private int valor;

    // eu posso declarar métodos numa classe enum
    // mas não faz sentido este método aqui abaixo, pois já existe o getname
    // private String getNome()
    // {
    // return "Prioridade";
    // }

    // PERSONALIZANDO A PRIORIDADE
    // Isso se faz por meio de um construtor

    Prioridade(int valor)
    {
        this.valor = valor;
    }

    public int getValor()
    {
        return this.valor;
    }

}
