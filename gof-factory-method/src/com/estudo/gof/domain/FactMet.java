package com.estudo.gof.domain;

public class FactMet {
    
    public static void main(String [] args) {
    	construir();
    }
    
    public static void construir() {
        GMCriador gm = new GMCriadorConcreto();
        Veiculo vectra = gm.factoryVectra();
        Veiculo opala = gm.factoryOpala();
    }
    
}