package com.example;

import java.math.BigDecimal;

public class Monitor {

    private String marca;
    private double tamanoPulgadas;
    private boolean esCurvo;
    private int frecuenciaHz;
    private BigDecimal precio;
    private String resolucion; // Ej: 1920x1080

    // Constructor vacío
    public Monitor() {
        this.marca = "Genérico";
        this.tamanoPulgadas = 24.0;
        this.esCurvo = false;
        this.frecuenciaHz = 60;
        this.precio = BigDecimal.valueOf(600_000);
        this.resolucion = "1920x1080";
    }

    // Constructor con parámetros usando setters
    public Monitor(String marca, double tamanoPulgadas, boolean esCurvo,
                   int frecuenciaHz, BigDecimal precio, String resolucion) {

        setMarca(marca);
        setTamanoPulgadas(tamanoPulgadas);
        setEsCurvo(esCurvo);
        setFrecuenciaHz(frecuenciaHz);
        setPrecio(precio);
        setResolucion(resolucion);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("La marca no puede ser vacía.");
        }
        this.marca = marca;
    }

    public double getTamanoPulgadas() {
        return tamanoPulgadas;
    }

    public void setTamanoPulgadas(double tamanoPulgadas) {
        if (tamanoPulgadas < 10 || tamanoPulgadas > 60) {
            throw new IllegalArgumentException("Tamaño inválido (10-60 pulgadas).");
        }
        this.tamanoPulgadas = tamanoPulgadas;
    }

    public boolean isEsCurvo() {
        return esCurvo;
    }

    public void setEsCurvo(boolean esCurvo) {
        this.esCurvo = esCurvo;
    }

    public int getFrecuenciaHz() {
        return frecuenciaHz;
    }

    public void setFrecuenciaHz(int frecuenciaHz) {
        if (frecuenciaHz < 30 || frecuenciaHz > 360) {
            throw new IllegalArgumentException("Frecuencia inválida (30-360 Hz).");
        }
        this.frecuenciaHz = frecuenciaHz;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0.");
        }
        this.precio = precio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        if (resolucion == null || !resolucion.matches("\\d{3,4}x\\d{3,4}")) {
            throw new IllegalArgumentException("Resolución inválida (ej: 1920x1080).");
        }
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", tamanoPulgadas=" + tamanoPulgadas +
                ", esCurvo=" + esCurvo +
                ", frecuenciaHz=" + frecuenciaHz +
                ", precio=" + precio +
                ", resolucion='" + resolucion + '\'' +
                '}';
    }
}
