/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import main.java.br.com.alura.tdd.modelo.Desempenho;
import main.java.br.com.alura.tdd.modelo.Funcionario;

/**
 *
 * @author 99030499
 */
class ReajusteService {

    void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        //Deixando a responsabilidae da porcentar por avaliação para o enum
        BigDecimal percentual = desempenho.reajusteAvaliado();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajustarSalario(reajuste); 

//        if (desempenho == Desempenho.A_DESEJAR) {
//        BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
//        funcionario.reajustarSalario(reajuste);
//        } else if (desempenho == Desempenho.BOM) {
//        BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
//        funcionario.reajustarSalario(reajuste);
//        } else {
//        BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
//        funcionario.reajustarSalario(reajuste);
//        }
    }

}
