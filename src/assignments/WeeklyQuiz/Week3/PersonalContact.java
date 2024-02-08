package assignments.WeeklyQuiz.Week3;

public class PersonalContact extends Contact {
    private String relationShip;

    public PersonalContact(String name, String phoneNumber, String relationShip) {
        super(name, phoneNumber);
        this.relationShip = relationShip;
    }
    public String getRelationShip() {return relationShip;}
}
