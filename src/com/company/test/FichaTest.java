package com.company.test;

import com.company.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FichaTest {

    @Test
    void deveRetornarEstruturaComAlongamentoAerobicoMusculacao(){
        FichaAcademia fichaAcademia = new Musculacao(new Aerobico(new Alongamento(new Ficha())));

        assertEquals("Ficha:/Alongamento/Aeróbico/Musculação", fichaAcademia.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComAlongamentoAerobico(){
        FichaAcademia fichaAcademia = new Aerobico(new Alongamento(new Ficha()));

        assertEquals("Ficha:/Alongamento/Aeróbico", fichaAcademia.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComAlongamentoCalistenia(){
        FichaAcademia fichaAcademia = new Calistenia(new Alongamento(new Ficha()));

        assertEquals("Ficha:/Alongamento/Calistenia", fichaAcademia.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComMusculacao(){
        FichaAcademia fichaAcademia = new Musculacao(new Ficha());

        assertEquals("Ficha:/Musculação", fichaAcademia.getEstrutura());
    }

    @Test
    void deveRetornarStatusFichaSimples(){
        FichaAcademia fichaAcademia = new Ficha(50, 50, 50);

        assertEquals(50, fichaAcademia.getCaloriasTotal());
        assertEquals(50, fichaAcademia.getHipertrofiaTotal());
        assertEquals(50, fichaAcademia.getFlexibilidadeTotal());
    }

    @Test
    void deveRetornarStatusFichaMusculacao(){
        FichaAcademia fichaAcademia = new Musculacao(new Ficha());

        assertEquals(200, fichaAcademia.getHipertrofiaTotal());
        assertEquals(100, fichaAcademia.getCaloriasTotal());
        assertEquals(5, fichaAcademia.getFlexibilidadeTotal());
    }

    @Test
    void deveRetornarStatusFichaAlongamentoAerobico(){
        FichaAcademia fichaAcademia = new Alongamento(new Aerobico(new Ficha(100, 100, 100)));

        assertEquals(230, fichaAcademia.getFlexibilidadeTotal());
        assertEquals(110, fichaAcademia.getHipertrofiaTotal());
        assertEquals(315, fichaAcademia.getCaloriasTotal());
    }

    @Test
    void deveRetornarStatusTreinoAlongamentoAerobicoMusculacaoCalistenia(){
        FichaAcademia fichaAcademia = new Calistenia(new Musculacao(new Aerobico(new Alongamento(new Ficha()))));

        assertEquals(160, fichaAcademia.getFlexibilidadeTotal());
        assertEquals(330, fichaAcademia.getHipertrofiaTotal());
        assertEquals(435, fichaAcademia.getCaloriasTotal());
    }
}
