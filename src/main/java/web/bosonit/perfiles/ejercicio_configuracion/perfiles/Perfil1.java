package web.bosonit.perfiles.ejercicio_configuracion.perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("perfil1")
@Component
public class Perfil1 implements Perfiles{
    String perfil="perfil1";

    public String mifuncion() {
        return "texto del "+perfil;


    }
}
