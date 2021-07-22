package web.bosonit.perfiles.ejercicio_configuracion.datos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile("perfil1")
@Component
public class Url implements Datos{
    @Value("${url:pordefecto}")
    String url;
    @Value("${password}")
    String password;
    @Value("${var1}")
    String variable;

    public String mostrar() {
        return "Clase ulr,Valores:" + url + "," + password + "," + variable;
    }
}
