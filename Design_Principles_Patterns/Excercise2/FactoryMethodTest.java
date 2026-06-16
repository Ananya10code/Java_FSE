package Design_Principles_Patterns.Excercise2;

public class FactoryMethodTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();
    }
}
