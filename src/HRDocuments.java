public class HRDocuments extends Document implements ChangeStatus{
    /**
     * Приказы на прием и увольнение относятся к кадровым документам и должны иметь следующие реквизиты:
     - сотрудник
     - текст приказа
     - статус

     * Поле сотрудник присваивается в момент создания кадрового документа и не может быть изменено в дальнейшем.

     * Реквизит статус может принимать следующие значения:
     - CREATED_BY
     - EXECUTED
     */

    private Employee employee;
    private String textHRDocument;
    private Status status;

    public HRDocuments(int numberDocument, String nameDocument, Employee employee, String textDocument) {
        super(numberDocument, nameDocument);
        this.employee = employee;
        status = Status.СОЗДАН;
        this.textHRDocument = textDocument;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTextHRDocument() {
        return textHRDocument;
    }

    public void setTextHRDocument(String textHRDocument) {
        this.textHRDocument = textHRDocument;
    }

    public Status getStatus() {
        return status;
    }


    @Override
    public void setStatus(){
        if (status.equals(Status.ИСПОЛНЕН)) {
            System.out.println("Статус кадрового документа № "  + getNumberDocument() +  " " + "\"" + getNameDocument() + "\"" + " \"" + Status.ИСПОЛНЕН + "\"" + " , поэтому данный документ не может быть перевед в статус " + "\"" + Status.СОЗДАН + "\"");
        }
        else {
            this.status = Status.ИСПОЛНЕН;
            System.out.println("Статус документа №" + getNumberDocument() +  " " + "\"" + getNameDocument() + "\"" + " изменен на " + this.status);
        }
    }

    @Override
    public void printDisplay (){
        System.out.println("Документ №" + getNumberDocument());
        System.out.println(getNameDocument());
        System.out.println("ФИО: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        System.out.println("Статус приказа: " + status);
        System.out.println(textHRDocument);
    }
}

enum Status {
    СОЗДАН,
    ИСПОЛНЕН
}
