/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.alura.tdd.modelo;

import java.math.BigDecimal;

/**
 *
 * @author 99030499
 */
public enum Desempenho {
    A_DESEJAR {
        @Override
        public BigDecimal reajusteAvaliado() {
            return new BigDecimal("0.03");
        }
    }, BOM {
        @Override
        public BigDecimal reajusteAvaliado() {
            return new BigDecimal("0.15");
        }
    }, OTIMO {
        @Override
        public BigDecimal reajusteAvaliado() {
            return new BigDecimal("0.2");
        }
    }, ESPETACULA {
        @Override
        public BigDecimal reajusteAvaliado() {
            return new BigDecimal("0.4");
        }
    };

    public abstract BigDecimal reajusteAvaliado();
}
