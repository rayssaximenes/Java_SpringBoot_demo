package com.rayssa.rest.cars;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class CarsController {

    private final CarRepository repository;

    CarsController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cars")
    @ResponseBody
    List<Car> all() {
        return repository.findAll();
    }

    // Get single item
    @GetMapping("/cars/{id}")
    @ResponseBody
    Car one(@PathVariable Long id) throws CarNotFoundException {

        return repository.findById(id)
                .orElseThrow(() -> new CarNotFoundException());
    }

    @PostMapping("/cars")
    @ResponseBody
    public Car addNewCar(@RequestBody Car addNewCar) {
        return repository.save(addNewCar);
    }

    @PutMapping("/cars/{id}")
    @ResponseBody
    Optional<Car> updateCar(@RequestBody Car updateCar, @PathVariable Long id) {
        return repository.findById(id)
                .map(car -> {
                    car.setName(updateCar.getName());
                    car.setColor(updateCar.getColor());
                    return repository.save(car);
                });
    }

    @DeleteMapping("/cars/{id}")
    @ResponseBody
    void deleteCar(@PathVariable Long id) {
        repository.deleteById(id);
    }

}


