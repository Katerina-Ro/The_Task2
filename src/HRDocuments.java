public abstract class HRDocuments extends Document implements ChangeStatus{
    /**
     * Приказы на прием и увольнение относятся к кадровым документам и должны иметь следующие реквизиты:
     - сотрудник
     - текст приказа
     - статус

     * Поле сотрудник присваивается в момент создания кадрового документа и не может быть изменено в дальнейшем.

     * Реквизит статус может принимать следующие значения:
     - СОЗДАН
     - ИСПОЛНЕН
     */

    private final Employee employee;
    private String textHRDocument;
    private String status;

    public HRDocuments(int numberDocument, String nameDocument, Employee employee, String textDocument) {
        super(numberDocument, nameDocument);
        this.employee = employee;
        status = Status.CREATED_BY.getType_status();
        this.textHRDocument = textDocument;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getTextHRDocument() {
        return textHRDocument;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(){
        if (status.equals(Status.EXECUTED.getType_status())) {
            System.out.println("Статус кадрового документа № "  + getNumberDocument() +  " " + "\"" + getNameDocument() + "\"" + " \"" + Status.EXECUTED.getType_status() + "\"" + " , поэтому данный документ не может быть перевед в статус " + "\"" + Status.CREATED_BY.getType_status() + "\"");
        }
        else {
            this.status = Status.EXECUTED.getType_status();
            System.out.println("Статус документа № " + getNumberDocument() +  " " + "\"" + getNameDocument() + "\"" + " изменен на " + this.status);
        }
    }

    public void printHRDocument (){
        System.out.println("Документ №" + getNumberDocument());
        System.out.println(getNameDocument());
        System.out.println("ФИО: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        System.out.println("Статус приказа: " + status);
        System.out.println(textHRDocument);
    }
}


