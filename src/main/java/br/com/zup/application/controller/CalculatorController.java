package br.com.zup.application.controller;

import br.com.zup.application.facade.CalculatorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorFacade calculatorFacade;

    @GetMapping("/sum")
    public ResponseEntity<Integer> sum(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculatorFacade.sum(a, b));
    }

    @GetMapping("/subtract")
    public ResponseEntity<Integer> subtract(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculatorFacade.subtract(a, b));
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculatorFacade.multiply(a, b));
    }

    @GetMapping("/divide")
    public ResponseEntity<Integer> divide(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculatorFacade.divide(a, b));
    }

    @GetMapping("/sum-and-multiply")
    public ResponseEntity<Integer> sumAndMultiply(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        return ResponseEntity.ok(this.calculatorFacade.sumAndMultiply(a, b, c));
    }

}
