package com.ejercicio.vehiculos.domains.motor;

import com.ejercicio.vehiculos.domains.interfaces.IMotor;

public class MotorToyota implements IMotor {
    @Override
    public int getPotenciaMaxima() {
        return 300;
    }

    @Override
    public int getNoPieza() {
        return 8;
    }

    @Override
    public String getTecnologia() {
        return "Eléctrico";
    }
}
