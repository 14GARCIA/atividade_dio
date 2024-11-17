package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component
public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
