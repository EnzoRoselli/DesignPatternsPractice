package models.documents.impl;

import models.documents.DocumentFactory;
import models.formats.Format;
import models.formats.impl.PdfFormat;

public class PdfDocument extends DocumentFactory {
    @Override
    public Format createFormat() {
        return new PdfFormat();
    }
}
