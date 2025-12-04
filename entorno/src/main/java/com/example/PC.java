package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PC {

    private String marca;
    private int ramGB;
    private boolean tieneSSD;
    private BigDecimal precio;
    private LocalDate fechaCompra;
    private Monitor monitor; // Objeto propio

    // Constructor vacío (por defecto)
    public PC() {
        this.marca = "Sin marca";
        this.ramGB = 8;
        this.tieneSSD = true;
        this.precio = BigDecimal.valueOf(1500_000);
        this.fechaCompra = LocalDate.now();
        this.monitor = new Monitor(); // Inicializa un monitor básico
    }

    // Constructor con parámetros usando setters
    public PC(String marca, int ramGB, boolean tieneSSD, BigDecimal precio,
              LocalDate fechaCompra, Monitor monitor) {
        setMarca(marca);
        setRamGB(ramGB);
        setTieneSSD(tieneSSD);
        setPrecio(precio);
        setFechaCompra(fechaCompra);
        setMonitor(monitor);
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

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        if (ramGB <= 0 || ramGB > 256) {
            throw new IllegalArgumentException("RAM inválida (1-256 GB).");
        }
        this.ramGB = ramGB;
    }

    public boolean isTieneSSD() {
        return tieneSSD;
    }

    public void setTieneSSD(boolean tieneSSD) {
        this.tieneSSD = tieneSSD;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(BigDecimal.valueOf(10000000)) > 0) {
            throw new IllegalArgumentException("Precio inválido: debe estar entre 1 y 10 millones.");
        }
        this.precio = precio;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        if (fechaCompra == null || fechaCompra.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser futura.");
        }
        if (fechaCompra.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("La fecha no puede ser anterior a 2010.");
        }
        this.fechaCompra = fechaCompra;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        if (monitor == null) {
            throw new IllegalArgumentException("El monitor no puede ser nulo.");
        }
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "marca='" + marca + '\'' +
                ", ramGB=" + ramGB +
                ", tieneSSD=" + tieneSSD +
                ", precio=" + precio +
                ", fechaCompra=" + fechaCompra +
                ", monitor=" + monitor +
                '}';
    }
}
