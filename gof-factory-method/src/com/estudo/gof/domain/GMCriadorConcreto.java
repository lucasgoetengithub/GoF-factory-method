package com.estudo.gof.domain;

public class GMCriadorConcreto extends GMCriador {
    public Opala factoryOpala() {
        return new Opala();
    }
    public Vectra factoryVectra() {
        return new Vectra();
    }
}
