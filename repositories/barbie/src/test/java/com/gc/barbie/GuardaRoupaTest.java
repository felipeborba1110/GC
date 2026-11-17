package com.gc.barbie;

import com.gc.barbie.exceptions.DescontoMaiorQue100;
import com.gc.barbie.exceptions.DescontoNegativo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GuardaRoupaTest {
    GuardaRoupa guardaRoupa;

    @BeforeEach
    void setup(){
        guardaRoupa = new GuardaRoupa(500);
    }

    @Test
    void precoComDescontoPositivo() throws DescontoMaiorQue100, DescontoNegativo {
        double result = guardaRoupa.precoComDesconto(200,10);

        assertEquals(180, result, 0.01);
    }

    @Test
    void precoComDescontoNegativo() {
        assertThrows(DescontoNegativo.class, () -> guardaRoupa.precoComDesconto(200,-10));
    }

    @Test
    void precoComDescontoMaiorQue100() {
        assertThrows(DescontoMaiorQue100.class, () -> guardaRoupa.precoComDesconto(200,110));
    }

    @Test
    void cabeNoOrcamentoMaiorQuePreco(){
        boolean result = guardaRoupa.cabeNoOrcamento(200);

        assertTrue(result);
    }

    @Test
    void cabeNoOrcamentoMenorQuePreco(){
        boolean result = guardaRoupa.cabeNoOrcamento(600);

        assertFalse(result);
    }

    @Test
    void cabeNoOrcamentoIgualAoPreco(){
        boolean result = guardaRoupa.cabeNoOrcamento(500);

        assertTrue(result);
    }

    @Test
    void ehDeGalaMenorQue200(){
        boolean result = guardaRoupa.ehDeGala(190);

        assertFalse(result);
    }

    @Test
    void ehDeGalaMaiorQue200(){
        boolean result = guardaRoupa.ehDeGala(220);

        assertTrue(result);
    }

    @Test
    void ehDeGalaIgualA200(){
        boolean result = guardaRoupa.ehDeGala(200);

        assertTrue(result);
    }
}
