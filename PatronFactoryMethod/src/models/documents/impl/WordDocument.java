package models.documents.impl;

import models.documents.DocumentFactory;
import models.formats.Format;
import models.formats.impl.WordFormat;

public class WordDocument extends DocumentFactory {
    @Override
    public Format createFormat() {
        return new WordFormat();
    }
}
