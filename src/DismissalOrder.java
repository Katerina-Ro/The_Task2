public class DismissalOrder extends HRDocuments{
    private String reasonForDismissal;

    public DismissalOrder(int numberDocument, String nameDocument, Employee employee, String textHRDocument, String reasonForDismissal) {
        super(numberDocument, nameDocument, employee, textHRDocument);
        this.reasonForDismissal = reasonForDismissal;
    }

    public void printDismissalOrder () {
        System.out.println("Документ №" + getNumberDocument());
        System.out.println(getNameDocument());
        System.out.println("ФИО: " + getEmployee().getSurname() + " " + getEmployee().getName() + " " + getEmployee().getPatronymic());
        System.out.println("Статус приказа: " + getStatus());
        System.out.println(getTextHRDocument());
        System.out.println("Причина увольнения: " + reasonForDismissal);
    }

    @Override
    public String toString() {
        return "Приказ на увольнение " +
                "Причина увольнения - '" + reasonForDismissal;
    }
}
