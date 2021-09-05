public abstract class Document {
    /**
     * Все виды документов должны иметь обязательные реквизиты:
     * - номер
     * - название
     * Номер документа присваивается ему в момент создания и не может быть изменен в дальнейшем.
     */

    private final int numberDocument;
    private String nameDocument;

    public Document(int numberDocument, String nameDocument) {
        this.numberDocument = numberDocument;
        this.nameDocument = nameDocument;
    }

    public int getNumberDocument() {
        return numberDocument;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public void printDocument() {
        System.out.println("Номер документа №" + numberDocument);
        System.out.println(nameDocument);
    }
}

