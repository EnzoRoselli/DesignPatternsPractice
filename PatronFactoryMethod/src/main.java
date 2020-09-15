import models.documents.DocumentFactory;
import models.documents.impl.PdfDocument;
import models.documents.impl.WordDocument;
import models.formats.Format;

public class main {

    public static void main(String[] args) {
        DocumentFactory df = new WordDocument();

        df.openDocument();
    }
}
