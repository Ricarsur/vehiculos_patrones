package com.ejercicio.vehiculos.domains.factories;

import com.ejercicio.vehiculos.domains.interfaces.*;

public interface IVehicleFactory {
    IChasis crearChasis();
    IMotor crearMotor();
    ICojineria crearCojineria();
}
