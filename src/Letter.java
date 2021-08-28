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

    public String getTo_whom() {
        return to_whom;
    }

    public void setTo_whom(String to_whom) {
        this.to_whom = to_whom;
    }

    public String getFrom_whom() {
        return from_whom;
    }

    public void setFrom_whom(String from_whom) {
        this.from_whom = from_whom;
    }

    @Override
    public void printDisplay (){
        System.out.println("Документ №" + getNumberDocument());
        System.out.println(getNameDocument());
        System.out.println("кому: " + to_whom + ", от кого: " + from_whom);
        System.out.println(textletter);
    }
}
