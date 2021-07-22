package web.bosonit.perfiles.ejercicio_configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import web.bosonit.perfiles.ejercicio_configuracion.perfiles.Perfiles;


@SpringBootApplication

public class EjercicioConfiguracionApplication implements CommandLineRunner {

	@Autowired
    Perfiles perfil;


    public static void main(String[] args) {

        SpringApplication.run(EjercicioConfiguracionApplication.class,args);



    }

    public void run(String... arg0) {
        perfil.mifuncion();
    }

}
