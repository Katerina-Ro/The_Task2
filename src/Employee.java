public class Employee {
    private String surname;
    private String name;
    private String patronymic;

    public Employee(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void printDisplay () {
        System.out.println("ФиО работника: " + surname + " " + name + " " + patronymic);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                ", Отчество ='" + patronymic + '\'' +
                '}';
    }
}
