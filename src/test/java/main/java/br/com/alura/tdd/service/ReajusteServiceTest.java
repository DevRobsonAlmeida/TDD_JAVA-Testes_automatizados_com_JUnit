/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import main.java.br.com.alura.tdd.modelo.Desempenho;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author 99030499
 */
public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @Before
    public void inicializar() {
        System.out.println("Inicializar");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }
    
    @After
    public void finalizar(){
        System.out.println("Fim");
    }
    
    @BeforeClass
    public static void antesDeTodos(){
        System.out.println("ANTES DE TODOS");
    }
    
    @AfterClass
    public static void DepoisDeTodos(){
        System.out.println("DEPOIS DE TODOS");
    }

    @Test
    public void avaliadoComoADesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void avaliadoComoBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void avaliado() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
