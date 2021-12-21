/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 99030499
 */
public class BonusServiceTest {

    public BonusServiceTest() {
    }

    /**
     * Test of calcularBonus method, of class BonusService.
     */
    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
//        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));

        try {
            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
            fail("Não deu a exception!");
        } catch (Exception e) {
            assertEquals("Funcionario com salario do que R$10000 não pode receber bonus!", e.getMessage());
        }

    }

    @Test
    public void bonusDeveriaSer10PorcentoDoSalario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonusComValorDe10Mil() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
