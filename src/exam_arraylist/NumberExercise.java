package exam_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberExercise {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu:");
        int n = scanner.nextInt();
        numbers.clear(); 
        System.out.println("Nhap phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i+1) + "]=");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("Danh sach can it nhat 2 phan tu.");
            return -1; 
        }

        Integer max1 = null;
        Integer max2 = null;

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (max1 == null || num > max1) {
                max2 = max1;
                max1 = num;
            } else if ((max2 == null || num > max2) && num < max1) {
                max2 = num;
            }
        }

        if (max2 == null) {
            System.out.println("Khong tim thay gia tri lon thu hai.");
            return -1; 
        }

        return max2;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--; 
            }
        }
    }
}

