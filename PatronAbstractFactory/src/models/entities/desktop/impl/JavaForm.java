package models.entities.desktop.impl;

import models.entities.desktop.IDesktop;

public class JavaForm implements IDesktop {
    @Override
    public void show() {
        System.out.println("Showing a JspForm");
    }

    @Override
    public boolean isModal() {
        return false;
    }
}
