package co.edu.eci.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/driver")
public class DriverController {
    @GetMapping("/{driverId}")
    public String getDriverById(@PathVariable("driverId") String driverId) {
        return "Driver with id: " + driverId;
    }

    @PostMapping
    public String createDriver() {
        return "Driver created";
    }

    @PutMapping("/{driverId}/status")
    public String updateDriverStatus(@PathVariable("driverId") String driverId) {
        return "Driver with id: " + driverId + " status updated";
    }
}
