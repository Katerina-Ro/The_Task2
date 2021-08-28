public class DismissalOrder extends HRDocuments{
    private String reasonForDismissal;

    public DismissalOrder(int numberDocument, String nameDocument, Employee employee, String textHRDocument, String reasonForDismissal) {
        super(numberDocument, nameDocument, employee, textHRDocument);
        this.reasonForDismissal = reasonForDismissal;
    }

    public String getReasonForDismissal() {
        return reasonForDismissal;
    }

    public void setReasonForDismissal(String reasonForDismissal) {
        this.reasonForDismissal = reasonForDismissal;
    }

    @Override
    public void printDisplay () {
        System.out.println("Документ №" + getNumberDocument());
        System.out.println(getNameDocument());
        System.out.println("ФИО: " + getEmployee().getSurname() + " " + getEmployee().getName() + " " + getEmployee().getPatronymic());
        System.out.println("Статус приказа: " + getStatus());
        System.out.println(getTextHRDocument());
        System.out.println("Причина увольнения: " + reasonForDismissal);
    }

    @Override
    public String toString() {
        return "DismissalOrder{" +
                "Причина увольнения - '" + reasonForDismissal + '\'' +
                '}';
    }
}
