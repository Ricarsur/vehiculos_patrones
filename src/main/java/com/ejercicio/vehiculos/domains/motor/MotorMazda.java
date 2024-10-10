package com.ejercicio.vehiculos.domains.motor;

import com.ejercicio.vehiculos.domains.interfaces.IMotor;

public class MotorMazda implements IMotor {
    @Override
    public int getPotenciaMaxima() {
        return 190;
    }

    @Override
    public int getNoPieza() {
        return 5;
    }

    @Override
    public String getTecnologia() {
        return "Híbrido";
    }
}
