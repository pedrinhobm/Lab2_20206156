package com.example.lab2_20206156.Model;

public class ConfiguracionJuego {
    private int  tamanhoTarjeta;
    private int  numeroTarjeta;

    public int getTamanhoTarjeta() {
        return tamanhoTarjeta;
    }

    public void setTamanhoTarjeta(int tamanhoTarjeta) {
        this.tamanhoTarjeta = tamanhoTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public ConfiguracionJuego(int tamanhoTarjeta, int numeroTarjeta) {
        this.tamanhoTarjeta = tamanhoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
    }
}
