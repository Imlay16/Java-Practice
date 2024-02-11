package assignments.WeeklyQuiz.Week3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int selectNum = 0;

        while(true) {

            // 연락처 검색 후 삭제하는 기능!
            System.out.println("===========================");
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 모든 연락처 삭제");
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
                System.out.print("뒷자리 번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.print("회사명을 입력하세요: ");
                String company = scanner.next();

                addressBook.addContact(new BusinessContact(name, phoneNumber, company));
            }
            else if (selectNum == 2) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.print("뒷자리 번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.print("관계를 입력하세요: ");
                String relationShip = scanner.next();

                addressBook.addContact(new PersonalContact(name, phoneNumber, relationShip));
            }
            else if (selectNum == 3) {
                addressBook.displayAllContatcs();
            }
            else if (selectNum == 4) {
                System.out.print("검색할 이름을 입력하세요: ");

                Contact contact = addressBook.searchContact(scanner.next());

                // 검색 후 삭제하는 기능
                if (contact != null) {
                    while (true) {
                        System.out.print("삭제하시겠습니까? (y/n): ");
                        String answer = scanner.next();

                        if (answer.equals("y") || answer.equals("Y")) {
                            addressBook.removeContact(contact);
                            break;
                        }
                        else if (answer.equals("n") || answer.equals("N")) {
                            break;
                        }
                        else {
                            System.out.println("y 또는 n으로 대답해주세요.");
                        }
                    }
                }
            }
            else if (selectNum == 5) {
                System.out.print("정말로 모든 연락처를 삭제하시겠습니까? (y/n): ");

                while (true) {
                    String answer = scanner.next();
                    if (answer.equals("y") || answer.equals("Y")) {
                        addressBook.removeAllContact();
                        break;
                    }
                    else if (answer.equals("n") || answer.equals("N")) {
                        break;
                    }
                    else {
                        System.out.println("y 또는 n으로 대답해주세요.");
                    }
                }
            }
            else if (selectNum == 6) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("1 ~ 6까지의 숫자를 입력해주세요.");
            }
        }
    }
}
