public class JobOrder extends HRDocuments{

    public JobOrder(int numberDocument, String nameDocument, Employee employee, String textHRDocument) {
        super(numberDocument, nameDocument, employee, textHRDocument);
    }

    @Override
    public String toString() {
        return "Приказ на прием " + super.toString();
    }
}
