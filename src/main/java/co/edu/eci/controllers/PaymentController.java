package co.edu.eci.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {
    @PostMapping
    public String createPayment() {
        return "Payment created";
    }

    @GetMapping("/{paymentId}")
    public String getPaymentById(@PathVariable("paymentId") String paymentId) {
        return "Payment with id: " + paymentId;
    }

    @PutMapping("/{paymentId}/status")
    public String updatePaymentStatus(@PathVariable("paymentId") String paymentId) {
        return "Payment with id: " + paymentId + " status updated";
    }
}
