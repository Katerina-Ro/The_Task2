

public class DocumentPrinting {
    public static void main (String [] args){
        if (args.length > 0 && args[0].equals("-simple")) {
            Document dismissalOrder = new DismissalOrder(1, "Приказ на увольнение", new Employee("Сидоров", "Петр", "Петрович"), "здесь текст приказа", "поступило лучшее предложение");
            dismissalOrder.printDocument();

            Document jobOrder = new JobOrder(2, "Приказ на прием", new Employee("Петров", "Петр", "Петрович"), "здесь текст приказа на прием");
            jobOrder.printDocument();

            Letter letter = new Letter(3, "Письмо","Васечкину" , "Пупкина", "здесь находится текст письма");
            letter.printDocument();
        }
        else {
            DismissalOrder dismissalOrder = new DismissalOrder(1, "Приказ на увольнение", new Employee("Сидоров", "Петр", "Петрович"), "здесь текст приказа", "поступило лучшее предложение");
            dismissalOrder.printDismissalOrder();
            System.out.println();

            JobOrder jobOrder = new JobOrder(2, "Приказ на прием", new Employee("Петров", "Петр", "Петрович"), "здесь текст приказа на прием");
            jobOrder.printHRDocument();
            System.out.println();

            Letter letter = new Letter(3, "Письмо","Васечкину" , "Пупкина", "здесь находится текст письма");
            letter.printLetter();
            System.out.println();

            dismissalOrder.setStatus();
            System.out.println();

            jobOrder.setStatus();
            System.out.println();

            dismissalOrder.printDismissalOrder();
            System.out.println();
            jobOrder.printHRDocument();
        }
    }
}
