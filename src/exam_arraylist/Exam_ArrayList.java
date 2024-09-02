package exam_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------o0 MENU 0o---------");
            System.out.println("1. Nhap du lieu");
            System.out.println("2. Xuat du lieu");
            System.out.println("3. Tim gia tri lon thu 2");
            System.out.println("4. Xoa cac phan tu le");
            System.out.println("5. Thoat");
            System.out.println("--------------------------");

            int choice = 0;
            System.out.print("Your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Vui long nhap so.");
                scanner.next(); 
                continue;
            }

            switch (choice) {
                case 1:
                    NumberExercise.EnterData(numbers);
                    break;
                case 2:
                    NumberExercise.DisplayData(numbers);
                    break;
                case 3:
                    int max2 = NumberExercise.findMax2(numbers);
                    if (max2 != -1) {
                        System.out.println("Gia tri lon thu 2 la: " + max2);
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    System.out.println("Da xoa cac phan tu le.");
                    break;
                case 5:
                    System.out.println("Goodbye! See u.");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
    }

}
