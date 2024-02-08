package assignments.WeeklyQuiz.Week3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int selectNum = 0;

        while(true) {

            System.out.println("===========================");
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 연락처 삭제");
            System.out.println("6. 종료");
            System.out.println("===========================");

            System.out.print("번호를 입력하세요(1 ~ 6): ");

            try {
                selectNum = scanner.nextInt();
            }
            catch (InputMismatchException e) { // int 외의 값을 입력 받을 시, 예외 처리
                scanner.next(); // 위에서 int를 입력 받고 엔터가 버퍼에 남아서 버퍼 처리
                System.out.println("숫자를 입력해주세요!");
            }

            if (selectNum == 1) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.print("회사명을 입력하세요: ");
                String company = scanner.next();

                Contact contact = new BusinessContact(name, phoneNumber, company);

                addressBook.addContact(contact);
            }
            else if (selectNum == 2) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.print("관계를 입력하세요: ");
                String relationShip = scanner.next();

                Contact contact = new PersonalContact(name, phoneNumber, relationShip);

                addressBook.addContact(contact);
            }
            else if (selectNum == 3) {
                addressBook.displayAllContatcs();
            }
            else if (selectNum == 4) {
                System.out.print("검색할 이름을 입력하세요: ");
                String name = scanner.next();

                addressBook.searchContact(name);
            }
            else if (selectNum == 5) {
                addressBook.removeAllContact();
            }
            else if (selectNum == 6) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("1 ~ 5까지의 숫자를 입력해주세요.");
            }
        }
    }
}
