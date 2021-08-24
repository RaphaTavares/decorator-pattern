package com.company;

public class Ficha implements FichaAcademia{

    public float calorias;

    public float hipertrofia;

    public float flexibilidade;

    public Ficha(){

    }

    public Ficha(float calorias, float hipertrofia, float flexibilidade){
        this.calorias = calorias;
        this.hipertrofia = hipertrofia;
        this.flexibilidade = flexibilidade;
    }

    public float getCaloriasTotal(){
        return this.calorias;
    }

    public float getHipertrofiaTotal() {
        return hipertrofia;
    }

    public float getFlexibilidadeTotal() {
        return flexibilidade;
    }

    public String getEstrutura() { return "Ficha:"; }
}
