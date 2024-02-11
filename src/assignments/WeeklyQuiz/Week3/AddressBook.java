package assignments.WeeklyQuiz.Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class  AddressBook {
    private final int FIRST_NUM = 4;
    private final int SECOND_NUM = 4;
    private List<Contact> list;
    public AddressBook() {
        list = new ArrayList<>();
    }

    public void addContact(Contact contact) {

        int num = searchContactByNumber(contact);

        if (num == 2) {
            list.add(contact);

            // Contact의 name필드를 기준으로 객체를 정렬.
            Collections.sort(list, new Comparator<Contact>() {
                @Override
                public int compare(Contact o1, Contact o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

        }
        else if (num == 1) {
            printFormat("올바른 형식의 전화번호가 아닙니다. 다시 등록해주세요.");
        }
        else if (num == 0) {
            printFormat("이미 존재하는 번호입니다. 다시 등록해주세요.");
        }
    }

    public void removeContact(Contact contact) {
        list.remove(contact);

        printFormat("연락처를 삭제했습니다.");
    }

    public void removeAllContact() {

        for (Contact contact : list) {
            list.remove(contact);
        }
        printFormat("모든 연락처를 삭제했습니다.");
    }

    private void printNumber(String pNumber) {
        System.out.print(" 전화번호: 010" );

        int i;
        System.out.print("-");
        for (i = 0; i < FIRST_NUM; i++) {
            System.out.print(pNumber.charAt(i));
        }

        System.out.print("-");
        for (int j = 0; j < SECOND_NUM; j++) {
            System.out.print(pNumber.charAt(i + j));
        }
    }

    public void displayContact(Contact contact) {

        String pNumber = contact.getPhoneNumber();

        if (contact instanceof BusinessContact) {
            System.out.print("이름: " + contact.getName() + " 회사명: " + ((BusinessContact) contact).getCompany());
            printNumber(pNumber);
        }
        else if (contact instanceof PersonalContact) {
            System.out.print("이름: " + contact.getName() + " 관계: " + ((PersonalContact) contact).getRelationShip());
            printNumber(pNumber);
        }
    }

    public void displayAllContatcs() {

        if (list.isEmpty()) {
            printFormat("연락처가 비어있습니다.");
            return;
        }

        System.out.println();
        for (Contact c : list) {
            displayContact(c);
            System.out.println();
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

    public Contact searchContact(String name) {
        Contact contact = searchContactByName(name);
        if (contact == null) {
            printFormat("존재하지 않는 이름입니다!");
        } else {
            displayContact(contact);
        }
        return contact;
    }

    private int searchContactByNumber(Contact searchContact) {

        String pNumber;
        String searchNumber = searchContact.getPhoneNumber();

        for (Contact contact : list) {
            pNumber = contact.getPhoneNumber();

            if (searchNumber.equals(pNumber)) {
                return 0;
            }
        }

        if (isNumber(searchNumber) || searchNumber.length() != FIRST_NUM + SECOND_NUM) {
            return 1;
        }

        return 2;
    }

    private static boolean isNumber(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) <= 48 || string.charAt(i) >= 57) { // 아스키 코드 사용 해서 숫자 인지 판별.
                return true;
            }
        }
        return false;
    }

    private static void printFormat(String str) {
        System.out.println();
        System.out.println(str);
        System.out.println();
    }
}
