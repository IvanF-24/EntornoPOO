package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Crear un monitor
        Monitor monitor = new Monitor("LG", 27.0, true, 144, BigDecimal.valueOf(2500_000), "2560x1440");
        Monitor monitor2 = new Monitor("Samsung", 24.0, false, 75, BigDecimal.valueOf(1500_000), "1920x1080");

        // Crear una PC con el monitor
        PC pc = new PC("Dell", 16, true, BigDecimal.valueOf(3500_000), LocalDate.now(), monitor);
        PC pc2 = new PC("HP", 8, false, BigDecimal.valueOf(2000_000), LocalDate.of(2024, 6, 1), monitor2);

        // Crear un teclado
        Teclado teclado = new Teclado("Corsair", true, 104, "USB", LocalDate.of(2023, 5, 15), 900.5);
        Teclado teclado2 = new Teclado("Logitech", false, 87, "Inalámbrico", LocalDate.of(2022, 3, 10), 450.0);

        
        
        // Mostrar información
        System.out.println("=== INFORMACIÓN DEL SISTEMA ===");
        System.out.println("PC: " + pc.getMarca());
        System.out.println("RAM: " + pc.getRamGB() + " GB");
        System.out.println("Tiene SSD: " + pc.isTieneSSD());
        System.out.println("Precio: $" + pc.getPrecio());
        System.out.println("Fecha de compra: " + pc.getFechaCompra());
        
        System.out.println("\n=== MONITOR ===");
        System.out.println("Marca: " + monitor.getMarca());
        System.out.println("Tamaño: " + monitor.getTamanoPulgadas() + " pulgadas");
        System.out.println("Frecuencia: " + monitor.getFrecuenciaHz() + " Hz");
        System.out.println("Resolución: " + monitor.getResolucion());
        
        System.out.println("\n=== TECLADO ===");
        System.out.println("Marca: " + teclado.getMarca());
        System.out.println("Es mecánico: " + teclado.isEsMecanico());
        System.out.println("Número de teclas: " + teclado.getNumeroTeclas());
        System.out.println("Tipo de conexión: " + teclado.getTipoConexion());

        System.out.println("\n=== INSTANCIA ADICIONAL (PC) ===");
        System.out.println("PC: " + pc2.getMarca());
        System.out.println("RAM: " + pc2.getRamGB() + " GB");
        System.out.println("Tiene SSD: " + pc2.isTieneSSD());
        System.out.println("Precio: $" + pc2.getPrecio());
        System.out.println("Fecha de compra: " + pc2.getFechaCompra());

        System.out.println("\n=== INSTANCIA ADICIONAL (MONITOR) ===");
        System.out.println("Marca: " + monitor2.getMarca());
        System.out.println("Tamaño: " + monitor2.getTamanoPulgadas() + " pulgadas");
        System.out.println("Frecuencia: " + monitor2.getFrecuenciaHz() + " Hz");
        System.out.println("Resolución: " + monitor2.getResolucion());

        System.out.println("\n=== INSTANCIA ADICIONAL (TECLADO) ===");
        System.out.println("Marca: " + teclado2.getMarca());
        System.out.println("Es mecánico: " + teclado2.isEsMecanico());
        System.out.println("Número de teclas: " + teclado2.getNumeroTeclas());
        System.out.println("Tipo de conexión: " + teclado2.getTipoConexion());
    }
}
