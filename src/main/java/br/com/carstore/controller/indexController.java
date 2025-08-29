package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        car.setColor("verde");

     return ResponseEntity.ok(car);
    }

    @PostMapping("/api/create-car")
    public ResponseEntity<Car> createCar(@RequestBody Car car){

        System.out.println("Car name: " + car.getName());
        System.out.println("Car color: " + car.getColor());

        return ResponseEntity.ok(car);
    }

}
