package br.fiap.calculadora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar")
    public int somar(int a, int b) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(int a, int b) {
        return a - b;
    }

    @GetMapping("/multiplicar")
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @GetMapping("/dividir")
    public double dividir(int a, int b) {
        if(b == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não existe divisão por zero");
        }
        return (double) a / b;
    }
}
