package com.ejercicio.vehiculos.domains.factories;

import com.ejercicio.vehiculos.domains.chasis.ChasisMazda;
import com.ejercicio.vehiculos.domains.cojineria.CojineriaMazda;
import com.ejercicio.vehiculos.domains.interfaces.*;
import com.ejercicio.vehiculos.domains.motor.MotorMazda;

public class MazdaFactory implements IVehicleFactory {
    @Override
    public IChasis crearChasis() {
        return new ChasisMazda();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorMazda();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaMazda();
    }
}
