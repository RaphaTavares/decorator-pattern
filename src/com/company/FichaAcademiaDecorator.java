package com.company;

public abstract class FichaAcademiaDecorator implements FichaAcademia{

    private FichaAcademia ficha;
    public String estrutura;

    public FichaAcademiaDecorator(FichaAcademia fichaAcademia){
        this.ficha = fichaAcademia;
    }

    public FichaAcademia getFicha(){
        return ficha;
    }

    public void setFicha(FichaAcademia fichaAcademia){
        this.ficha = fichaAcademia;
    }

    public abstract float getQtdCalorias();

    public float getCaloriasTotal(){
        return (this.ficha.getCaloriasTotal() + this.getQtdCalorias());
    }

    public abstract float getQtdFlexibilidade();

    public float getFlexibilidadeTotal(){
        return (this.ficha.getFlexibilidadeTotal() + this.getQtdFlexibilidade());
    }

    public abstract float getQtdHipertrofia();

    public float getHipertrofiaTotal(){
        return (this.ficha.getHipertrofiaTotal() + this.getQtdHipertrofia());
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura(){
        return this.ficha.getEstrutura() + '/' + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura){
        this.estrutura = estrutura;
    }

}
