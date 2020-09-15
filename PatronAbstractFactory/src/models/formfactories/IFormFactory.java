package models.formfactories;

import models.entities.desktop.IDesktop;
import models.entities.web.IWeb;

public interface IFormFactory {

    IDesktop createDesktop();
    IWeb createWeb();
}
