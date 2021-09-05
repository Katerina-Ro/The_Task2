public class Letter extends Document{
    private String to_whom;
    private String from_whom;
    private String textletter;

    public Letter(int numberDocument, String nameDocument, String to_whom, String from_whom, String textLetter) {
        super(numberDocument, nameDocument);
        this.to_whom = to_whom;
        this.from_whom = from_whom;
        this.textletter = textLetter;
    }

    public void printLetter (){
        System.out.println("Документ №" + getNumberDocument());
        System.out.println(getNameDocument());
        System.out.println("кому: " + to_whom + ", от кого: " + from_whom);
        System.out.println(textletter);
    }
}
