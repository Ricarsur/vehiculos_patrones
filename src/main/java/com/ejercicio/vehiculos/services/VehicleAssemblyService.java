package com.ejercicio.vehiculos.services;

import com.ejercicio.vehiculos.domains.Vehiculo;
import com.ejercicio.vehiculos.domains.VehiculoRequest;
import com.ejercicio.vehiculos.domains.factories.IVehicleFactory;
import com.ejercicio.vehiculos.domains.factories.*;
import com.ejercicio.vehiculos.domains.interfaces.*;
import org.springframework.stereotype.Service;

@Service
public class VehicleAssemblyService {

    public Vehiculo ensamblarVehiculo(VehiculoRequest request) {
        IVehicleFactory factory;

        switch (request.getMarca().toLowerCase()) {
            case "toyota":
                factory = new ToyotaFactory();
                break;
            case "ford":
                factory = new FordFactory();
                break;
            case "mazda":
                factory = new MazdaFactory();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }

        IChasis chasis = factory.crearChasis();
        IMotor motor = factory.crearMotor();
        ICojineria cojineria = factory.crearCojineria();

        return new Vehiculo(chasis, motor, cojineria, request.getColor(), request.getFechaEnsamblaje(), request.getNumeroEnsamblaje());
    }
}
