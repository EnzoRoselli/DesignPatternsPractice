package models.automovil;

public abstract class AutomovilTM {

    /*importante que sea final*/
    public final void desplazar(){

        acelerar();
        cambiarMarcha();
        frenar();
    }

    void acelerar(){
        System.out.println("El auto esta acelerando");
    };

    protected abstract void cambiarMarcha();

    void frenar(){
        System.out.println("El auto esta frenando");
    }

}
