package com.ejercicio.vehiculos.controllers;

import com.ejercicio.vehiculos.domains.Vehiculo;
import com.ejercicio.vehiculos.domains.VehiculoRequest;
import com.ejercicio.vehiculos.services.VehicleAssemblyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ensamblar")
public class VehicleController {

    private final VehicleAssemblyService vehicleAssemblyService;

    public VehicleController(VehicleAssemblyService vehicleAssemblyService) {
        this.vehicleAssemblyService = vehicleAssemblyService;
    }

    @PostMapping
    public Vehiculo ensamblarVehiculo(@RequestBody VehiculoRequest request) {
        return vehicleAssemblyService.ensamblarVehiculo(request);
    }

}
