package com.company;

public class Aerobico extends FichaAcademiaDecorator{

    public Aerobico(FichaAcademia fichaAcademia){
        super(fichaAcademia);
    }

    public float getQtdCalorias(){
        return 200;
    }

    public float getQtdFlexibilidade(){
        return 20;
    }

    public float getQtdHipertrofia(){
        return 10;
    }

    public String getNomeEstrutura(){
        return "Aeróbico";
    }
}
