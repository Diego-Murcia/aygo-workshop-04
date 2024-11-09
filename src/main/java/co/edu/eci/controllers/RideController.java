package co.edu.eci.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rides")
public class RideController {
    @PostMapping
    public String createRide() {
        return "Ride created";
    }

    @GetMapping("/{rideId}")
    public String getRideById(@PathVariable("rideId") String rideId) {
        return "Ride with id: " + rideId;
    }

    @PutMapping("/{rideId}/status")
    public String updateRideStatus(@PathVariable("rideId") String rideId) {
        return "Ride with id: " + rideId + " status updated";
    }
}
