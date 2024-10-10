package com.ejercicio.vehiculos.domains.chasis;

import com.ejercicio.vehiculos.domains.interfaces.IChasis;

public class ChasisToyota implements IChasis {
    @Override
    public int getNoEjes() {
        return 4;
    }

    @Override
    public int getNoPieza() {
        return 2;
    }

    @Override
    public String getTipoTransmision() {
        return "Automática";
    }
}
