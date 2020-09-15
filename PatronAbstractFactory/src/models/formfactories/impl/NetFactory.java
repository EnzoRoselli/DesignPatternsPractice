package models.formfactories.impl;

import models.entities.desktop.IDesktop;
import models.entities.desktop.impl.WinForm;
import models.entities.web.IWeb;
import models.entities.web.impl.AspForm;
import models.formfactories.IFormFactory;

public class NetFactory implements IFormFactory {
    @Override
    public IDesktop createDesktop() {
        return new WinForm();
    }

    @Override
    public IWeb createWeb() {
        return new AspForm();
    }
}
