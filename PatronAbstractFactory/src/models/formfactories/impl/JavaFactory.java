package models.formfactories.impl;

import models.entities.desktop.IDesktop;
import models.entities.desktop.impl.JavaForm;
import models.entities.web.IWeb;
import models.entities.web.impl.JspForm;
import models.formfactories.IFormFactory;

public class JavaFactory implements IFormFactory {
    @Override
    public IDesktop createDesktop() {
        return new JavaForm();
    }

    @Override
    public IWeb createWeb() {
        return new JspForm();
    }
}
