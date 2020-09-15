package models.documents;

import models.formats.Format;

public abstract class DocumentFactory {

    public void openDocument(){
        Format format = createFormat();

        System.out.println("Opening a " + format.getName() + " document");
    }
    public void closeDocument(String name){
        System.out.println("Closing document " + name);
    }
    public void saveDocument(String name){
        System.out.println("Saving document " + name);
    }

    public abstract Format createFormat();
}
