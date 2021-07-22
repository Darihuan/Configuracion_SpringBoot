package web.bosonit.perfiles.ejercicio_configuracion.perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("perfil2")
@Component
public class Perfil2  implements Perfiles{
    String perfil="perfil2";
    @Override
    public String mifuncion() {
        return "texto del "+perfil;

    }
}
