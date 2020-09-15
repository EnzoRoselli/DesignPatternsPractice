package models.entities.web.impl;

import models.entities.web.IWeb;

public class AspForm implements IWeb {
    @Override
    public void show() {
        System.out.println("Showing AspForm");
    }

    @Override
    public void timeOut() {

    }
}
