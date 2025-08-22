package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping
    public String index(){
     return "<h1>MadaFuckkkk</h1>";
    }

    @GetMapping("/car")
    public ResponseEntity<Car> home(){

        Car car = new Car();
        car.setName("Fusca");
        car.setColor("sla");

     return ResponseEntity.ok(car);
    }

}
