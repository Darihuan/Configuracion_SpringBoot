package web.bosonit.perfiles.ejercicio_configuracion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import web.bosonit.perfiles.ejercicio_configuracion.perfiles.Perfiles;

@RestController
public class Perfil {
    @Autowired
    Perfiles perfiles;
    @GetMapping("perfil")
    public ResponseEntity<?> dimePerfil(){
        return ResponseEntity.status(HttpStatus.OK).body(perfiles.mifuncion());
    }



}
