package com.ejercicio.vehiculos.domains;

import com.ejercicio.vehiculos.domains.interfaces.*;

import java.time.LocalDate;

public class Vehiculo {
    private final IChasis chasis;
    private final IMotor motor;
    private final ICojineria cojineria;
    private final String color;
    private final LocalDate fechaEnsamblaje;
    private final String numeroEnsamblaje;

    public Vehiculo(IChasis chasis, IMotor motor, ICojineria cojineria, String color, LocalDate fechaEnsamblaje, String numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    // Getters
    public IChasis getChasis() {
        return chasis;
    }

    public IMotor getMotor() {
        return motor;
    }

    public ICojineria getCojineria() {
        return cojineria;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }
}