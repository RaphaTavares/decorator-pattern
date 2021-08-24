package com.company;

public class Calistenia extends FichaAcademiaDecorator{

    public Calistenia(FichaAcademia fichaAcademia){
        super(fichaAcademia);
    }

    public float getQtdCalorias(){
        return 120;
    }

    public float getQtdFlexibilidade(){
        return 25;
    }

    public float getQtdHipertrofia(){
        return 120;
    }

    public String getNomeEstrutura(){
        return "Calistenia";
    }
}
