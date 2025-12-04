package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Crear un monitor
        Monitor monitor = new Monitor("LG", 27.0, true, 144, BigDecimal.valueOf(2500_000), "2560x1440");
        
        // Crear una PC con el monitor
        PC pc = new PC("Dell", 16, true, BigDecimal.valueOf(3500_000), LocalDate.now(), monitor);
        
        // Crear un teclado
        Teclado teclado = new Teclado("Corsair", true, 104, "USB", LocalDate.of(2023, 5, 15), 900.5);
        
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
    }
}
