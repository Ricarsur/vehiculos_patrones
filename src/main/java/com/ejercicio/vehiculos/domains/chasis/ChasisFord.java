package com.ejercicio.vehiculos.domains.chasis;

import com.ejercicio.vehiculos.domains.interfaces.IChasis;

public class ChasisFord implements IChasis {
    @Override
    public int getNoEjes() {
        return 5;
    }

    @Override
    public int getNoPieza() {
        return 10;
    }

    @Override
    public String getTipoTransmision() {
        return "Automática";
    }
}
