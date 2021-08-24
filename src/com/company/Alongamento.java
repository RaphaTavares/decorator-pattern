package com.company;

public class Alongamento extends FichaAcademiaDecorator{

    public Alongamento(FichaAcademia fichaAcademia){
        super(fichaAcademia);
    }

    public float getQtdCalorias(){
        return 15;
    }

    public float getQtdFlexibilidade(){
        return 110;
    }

    public float getQtdHipertrofia(){
        return 0;
    }

    public String getNomeEstrutura(){
        return "Alongamento";
    }
}
