package assignments.WeeklyQuiz.Week3;

import java.util.ArrayList;
import java.util.List;


public class  AddressBook {

    private List<Contact> list;
    public AddressBook() {
        list = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        list.add(contact);
    }

    public void removeContact() {

    }

    public void removeAllContact() {

        if (list.isEmpty()) {
            System.out.println("연락처가 비었습니다!");
            return;
        }

        System.out.println("기능 구현중.....");
    }

    public void displayContact(Contact contact) {
        if (contact instanceof BusinessContact) {
            System.out.println("이름: " + contact.getName() + " 전화번호: " + contact.getPhoneNumber() + " 회사명: " + ((BusinessContact) contact).getCompany());
        }
        else if (contact instanceof PersonalContact) {
            System.out.println("이름: " + contact.getName() + " 전화번호: " + contact.getPhoneNumber() + " 관계: " + ((PersonalContact) contact).getRelationShip());
        }
    }

    public void displayAllContatcs() {

        if (list.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }

        System.out.println();
        for (Contact c : list) {
            displayContact(c);
        }
        System.out.println();
    }

    public Contact searchContactByName(String name) {

        for (Contact c : list) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public void searchContact(String name) {
        Contact contact = searchContactByName(name);
        if (contact == null) System.out.println("존재하지 않는 이름입니다!");
        else displayContact(contact);
    }
}
