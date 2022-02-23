package com.rayssa.rest.movies;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

//    @GetMapping("/movies")
//    @ResponseBody
//        List<Movie> all() {
//            return repository.findAll();
//    }
//
//    // Get single movie
//    @GetMapping("/movies/{id}")
//    Movie one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new MovieNotFoundException(id));
//    }
//
//    @PostMapping("/movies")
//    @ResponseBody
//    public Movie addNewMovie(@RequestBody Movie addNewMovie) {
//        return repository.save(addNewMovie);
//    }
//
//    @PutMapping("/movies/{id}")
//    @ResponseBody
//    Movie updateMovie(@RequestBody Movie updateMovie, @PathVariable Long id) {
//        return repository.findById(id)
//                .map(movie -> {
//                    movie.setName(newMovie.getName());
//                    movie.setColor(newMovie.getColor());
//                    return repository.save(movie);
//                });
//    }
//
//    @DeleteMapping("/movies/{id}")
//    @ResponseBody
//    void deleteMovie(@PathVariable Long id) {
//        repository.deleteById(id);
//    }



}
