package web.bosonit.perfiles.ejercicio_configuracion.datos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Profile("perfil2")
@PropertySource("miconfiguracion.properties")
@Component
public class Segunda implements Datos{

    @Value("${valor1}")
    String valor1;
    @Value("${valor2}")
    String valor2;


    public String mostrar() {
        return "Clase segunda,Valores:" + valor1 + "," + valor2;
    }
}

