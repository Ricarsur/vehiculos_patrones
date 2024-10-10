package com.ejercicio.vehiculos.domains.factories;

import com.ejercicio.vehiculos.domains.chasis.ChasisFord;
import com.ejercicio.vehiculos.domains.cojineria.CojineriaFord;
import com.ejercicio.vehiculos.domains.interfaces.*;
import com.ejercicio.vehiculos.domains.motor.MotorFord;

public class FordFactory implements IVehicleFactory {
    @Override
    public IChasis crearChasis() {
        return new ChasisFord();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorFord();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaFord();
    }
}