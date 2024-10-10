package com.ejercicio.vehiculos.domains.motor;

import com.ejercicio.vehiculos.domains.interfaces.IMotor;

public class MotorFord implements IMotor {
    @Override
    public int getPotenciaMaxima() {
        return 230;
    }

    @Override
    public int getNoPieza() {
        return 7;
    }

    @Override
    public String getTecnologia() {
        return "Térmico";
    }
}
