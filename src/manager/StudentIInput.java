import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentIDInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usedIds = new HashSet<>(); // Sử dụng Set để lưu trữ ID đã sử dụng

        String studentId = getString(scanner, "Nhập ID sinh viên: ", usedIds);
        System.out.println("ID sinh viên đã nhập: " + studentId);

        // Thêm các bước xử lý tiếp theo ở đây
    }

    public static String getString(Scanner scanner, String prompt, Set<String> usedIds) {
        String value = "";
        boolean isValid = false;

        do {
            System.out.print(prompt);
            value = scanner.nextLine();

            // Kiểm tra xem ID đã tồn tại chưa
            if (usedIds.contains(value)) {
                System.out.println("Lỗi! ID đã tồn tại, vui lòng nhập lại.");
            } else {
                usedIds.add(value); // Thêm ID vào Set nếu không trùng lặp
                isValid = true;
            }

        } while (!isValid);

        return value;
    }
}
