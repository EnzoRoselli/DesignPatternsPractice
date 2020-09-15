package models.automovil.impl;

import models.automovil.AutomovilTM;

public class AutomovilCajaAutomatica extends AutomovilTM {
    @Override
    protected void cambiarMarcha() {
        System.out.println("Cambiando de marcha automaticamente");
    }
}
