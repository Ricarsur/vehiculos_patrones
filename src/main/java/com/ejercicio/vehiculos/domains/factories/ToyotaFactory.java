package com.ejercicio.vehiculos.domains.factories;

import com.ejercicio.vehiculos.domains.chasis.ChasisToyota;
import com.ejercicio.vehiculos.domains.cojineria.CojineriaToyota;
import com.ejercicio.vehiculos.domains.interfaces.IChasis;
import com.ejercicio.vehiculos.domains.interfaces.ICojineria;
import com.ejercicio.vehiculos.domains.interfaces.IMotor;
import com.ejercicio.vehiculos.domains.motor.MotorToyota;

public class ToyotaFactory implements IVehicleFactory {
    @Override
    public IChasis crearChasis() {
        return new ChasisToyota();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorToyota();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaToyota();
    }
}
