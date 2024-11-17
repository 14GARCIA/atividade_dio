package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component
public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        if (comportamento != null) {
            comportamento.mover();
        } else {
            System.out.println("Nenhum comportamento definido.");
        }
    }
}
