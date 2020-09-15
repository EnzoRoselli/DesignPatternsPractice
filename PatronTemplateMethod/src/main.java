import models.automovil.AutomovilTM;
import models.automovil.impl.AutomovilCajaAutomatica;
import models.automovil.impl.AutomovilCajaCambio;

public class main {

    public static void main(String[] args) {

        AutomovilTM autoAutomatico = new AutomovilCajaAutomatica();
        autoAutomatico.desplazar();

        AutomovilTM autoManual = new AutomovilCajaCambio();
        autoManual.desplazar();
    }
}

