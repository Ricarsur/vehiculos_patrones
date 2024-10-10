package com.ejercicio.vehiculos.domains.cojineria;

import com.ejercicio.vehiculos.domains.interfaces.ICojineria;

public class CojineriaMazda implements ICojineria {
    @Override
    public int getNoPieza() {
        return 4;
    }

    @Override
    public String getMaterial() {
        return "Sintético";
    }
}
