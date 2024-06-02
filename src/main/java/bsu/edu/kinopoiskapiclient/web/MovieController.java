package bsu.edu.kinopoiskapiclient.web;

import bsu.edu.kinopoiskapiclient.entity.Movie;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/movies-api")
public class MovieController {

    private KinopoiskApiClient kinopoiskApiClient;

    @Operation(summary = "Gets movie by id")
    @GetMapping("/{id}")
    public Movie getById(@PathVariable("id") Long id) {
        return kinopoiskApiClient.findById(id);
    }

    @Operation(summary = "Gets movies list by page")
    @GetMapping("")
    public List<Movie> getByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit
    ) {
        return kinopoiskApiClient.findByPage(page, limit);
    }

    @Operation(summary = "Gets movie by name")
    @GetMapping("/search")
    public Movie getByName(
            @RequestParam(value = "name") String name
    ) {
        return kinopoiskApiClient.findByName(name);
    }

    @Operation(summary = "Gets movies list by page and name")
    @GetMapping("/searchList")
    public List<Movie> getByPageByName(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "name") String name
    ) {
        return kinopoiskApiClient.findByPageByName(page, limit, name);
    }
}

