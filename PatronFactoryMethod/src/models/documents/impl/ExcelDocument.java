package models.documents.impl;

import models.documents.DocumentFactory;
import models.formats.Format;
import models.formats.impl.ExcelFormat;

public class ExcelDocument extends DocumentFactory {
    @Override
    public Format createFormat() {
        return new ExcelFormat();
    }
}
