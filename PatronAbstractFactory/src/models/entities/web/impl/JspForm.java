package models.entities.web.impl;

import models.entities.web.IWeb;

public class JspForm implements IWeb {
    @Override
    public void show() {
        System.out.println("Showing JspForm");
    }

    @Override
    public void timeOut() {

    }
}
