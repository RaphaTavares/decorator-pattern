package com.company;

public class Musculacao extends FichaAcademiaDecorator{

    public Musculacao(FichaAcademia fichaAcademia){
        super(fichaAcademia);
    }

    public float getQtdCalorias(){
        return 100;
    }

    public float getQtdFlexibilidade(){
        return 5;
    }

    public float getQtdHipertrofia(){
        return 200;
    }

    public String getNomeEstrutura(){
        return "Musculação";
    }
}
