package com.example;

import java.time.LocalDate;

public class Teclado {

    private String marca;
    private boolean esMecanico;
    private int numeroTeclas;
    private String tipoConexion; // USB / Inalámbrico
    private LocalDate fechaFabricacion;
    private double pesoGramos;

    // Constructor vacío
    public Teclado() {
        this.marca = "Genérico";
        this.esMecanico = false;
        this.numeroTeclas = 104;
        this.tipoConexion = "USB";
        this.fechaFabricacion = LocalDate.of(2020, 1, 1);
        this.pesoGramos = 550.0;
    }

    // Constructor con parámetros
    public Teclado(String marca, boolean esMecanico, int numeroTeclas,
                   String tipoConexion, LocalDate fechaFabricacion, double pesoGramos) {

        setMarca(marca);
        setEsMecanico(esMecanico);
        setNumeroTeclas(numeroTeclas);
        setTipoConexion(tipoConexion);
        setFechaFabricacion(fechaFabricacion);
        setPesoGramos(pesoGramos);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida.");
        }
        this.marca = marca;
    }

    public boolean isEsMecanico() {
        return esMecanico;
    }

    public void setEsMecanico(boolean esMecanico) {
        this.esMecanico = esMecanico;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        if (numeroTeclas < 60 || numeroTeclas > 150) {
            throw new IllegalArgumentException("Número de teclas inválido.");
        }
        this.numeroTeclas = numeroTeclas;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        if (!(tipoConexion.equalsIgnoreCase("USB") ||
              tipoConexion.equalsIgnoreCase("Inalámbrico"))) {
            throw new IllegalArgumentException("Tipo de conexión inválido.");
        }
        this.tipoConexion = tipoConexion;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        if (fechaFabricacion == null ||
            fechaFabricacion.isAfter(LocalDate.now()) ||
            fechaFabricacion.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("Fecha inválida.");
        }
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        if (pesoGramos < 100 || pesoGramos > 3000) {
            throw new IllegalArgumentException("Peso inválido (100-3000g).");
        }
        this.pesoGramos = pesoGramos;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marca='" + marca + '\'' +
                ", esMecanico=" + esMecanico +
                ", numeroTeclas=" + numeroTeclas +
                ", tipoConexion='" + tipoConexion + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", pesoGramos=" + pesoGramos +
                '}';
    }
}
