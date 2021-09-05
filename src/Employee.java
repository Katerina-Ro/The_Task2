public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Employee(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "Имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                ", Отчество ='" + patronymic;
    }
}
