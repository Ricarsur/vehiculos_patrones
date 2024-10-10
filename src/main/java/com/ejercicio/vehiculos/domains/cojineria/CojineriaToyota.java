package com.ejercicio.vehiculos.domains.cojineria;

import com.ejercicio.vehiculos.domains.interfaces.ICojineria;

public class CojineriaToyota implements ICojineria {
    @Override
    public int getNoPieza() {
        return 2;
    }

    @Override
    public String getMaterial() {
        return "Cuero";
    }
}
