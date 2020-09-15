package models.entities.desktop.impl;

import models.entities.desktop.IDesktop;

public class WinForm implements IDesktop {
    @Override
    public void show() {
        System.out.println("Showing WinForm");
    }

    @Override
    public boolean isModal() {
        return false;
    }
}
