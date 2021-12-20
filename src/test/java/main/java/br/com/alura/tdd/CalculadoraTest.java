/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.alura.tdd;
import org.junit.Test;
import org.junit.*;
/**
 *
 * @author 99030499
 */
public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumeroPositovos() {
        Calculadora cal = new Calculadora();
        int soma = cal.somar(3, 7);
        Assert.assertEquals(10, soma);

//        soma = cal.somar(0, 0);
//        Assert.assertEquals(0, soma);
//        soma = cal.somar(3, 0);
//        Assert.assertEquals(3, soma);
//        soma = cal.somar(3, -1);
//        Assert.assertEquals(2, soma);
    }

}
