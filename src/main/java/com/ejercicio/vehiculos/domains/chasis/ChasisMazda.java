package com.ejercicio.vehiculos.domains.chasis;

import com.ejercicio.vehiculos.domains.interfaces.IChasis;

public class ChasisMazda implements IChasis {
    @Override
    public int getNoEjes() {
        return 6;
    }

    @Override
    public int getNoPieza() {
        return 5;
    }

    @Override
    public String getTipoTransmision() {
        return "Mecánica";
    }
}
