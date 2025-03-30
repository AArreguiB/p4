package com.example.API_recetas.controllers;

import com.example.API_recetas.models.Receta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RecetaController {

    private final Map<String, Receta> recetas = new HashMap<>();
    //Aqui se guardaran las recetas. Se guardaran en memoria, si queremos que se guarden de forma persistente habría que crear un repositorio

    @PostMapping("/api/recetas")
    @ResponseStatus(HttpStatus.CREATED)
    public Receta crea(@RequestBody Receta RecetaNueva) {
        recetas.put(RecetaNueva.getNombre(), RecetaNueva);
        return RecetaNueva;
    }
    @GetMapping("/api/recetas")//Devuelve todas las recetas
    public Collection<Receta> obtenerTodasRecetas() {
        return recetas.values();
    }

    @GetMapping("/api/recetas/{nombre}")
    public Receta ObtenerReceta(@PathVariable String nombre) {
        return recetas.get(nombre);
    }

    @PutMapping("api/recetas/{nombre}/incremento/{incremento}")
    public Receta incrementarReceta(@PathVariable String nombre, @PathVariable int incremento) {
        Receta recetaActual = recetas.get(nombre);
        recetaActual.setCocineros(recetaActual.getCocineros() + incremento);
        recetas.put(nombre, recetaActual);
        return recetaActual;

    }

    @DeleteMapping("/api/recetas/{nombre}")
    public ResponseEntity<Void> elimina(@PathVariable String nombre) {
        if (recetas.containsKey(nombre)) {
            recetas.remove(nombre);
            return ResponseEntity.noContent().build(); // 204 No Content si se elimina correctamente
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found si no existe
        }
    }
}
