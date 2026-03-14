import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
            } 
            else if (choice == 2) {
                System.out.println("Tasks:");
                for (String t : tasks) {
                    System.out.println("- " + t);
                }
            }

        } while (choice != 3);
    }
}
