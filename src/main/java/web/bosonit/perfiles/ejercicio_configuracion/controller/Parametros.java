package web.bosonit.perfiles.ejercicio_configuracion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import web.bosonit.perfiles.ejercicio_configuracion.datos.Datos;

@RestController

public class Parametros {
    @Autowired
    Datos datos;

    @GetMapping("/parametros")
    public ResponseEntity<?> devolverParamentrso(){
        return ResponseEntity.status(HttpStatus.OK).body(datos.mostrar());
    }
}
