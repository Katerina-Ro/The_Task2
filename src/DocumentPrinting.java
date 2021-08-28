public class DocumentPrinting {
    public static void main (String [] args){
        if (args.length > 0 && args[0].equals("simple")) {
            Document document = new Document(4,"Приказ");
            document.printDisplay();
        }
        else {
            DismissalOrder dismissalOrder = new DismissalOrder(1, "Приказ на увольнение", new Employee("Сидоров", "Петр", "Петрович"), "здесь текст приказа", "поступило лучшее предложение");
            dismissalOrder.printDisplay();
            System.out.println();

            HRDocuments jobOrder = new JobOrder(2, "Приказ на прием", new Employee("Петров", "Петр", "Петрович"), "здесь текст приказа на прием");
            jobOrder.printDisplay();
            System.out.println();

            Letter letter = new Letter(3, "Письмо","Васечкину" , "Пупкина", "здесь находится текст письма");
            letter.printDisplay();
            System.out.println();

            dismissalOrder.setStatus();
            System.out.println();

            jobOrder.setStatus();
            System.out.println();

            dismissalOrder.printDisplay();
            System.out.println();
            jobOrder.printDisplay();
        }
    }
}
