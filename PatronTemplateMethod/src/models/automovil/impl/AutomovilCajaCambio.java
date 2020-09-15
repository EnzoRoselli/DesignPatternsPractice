package models.automovil.impl;

import models.automovil.AutomovilTM;

public class AutomovilCajaCambio extends AutomovilTM {
    @Override
    protected void cambiarMarcha() {
        System.out.println("Cambiando de marcha con la caja de cambios");
    }
}
