package com.ejercicio.vehiculos.domains.cojineria;

import com.ejercicio.vehiculos.domains.interfaces.ICojineria;

public class CojineriaFord implements ICojineria {
    @Override
    public int getNoPieza() {
        return 3;
    }

    @Override
    public String getMaterial() {
        return "Cuero";
    }
}
