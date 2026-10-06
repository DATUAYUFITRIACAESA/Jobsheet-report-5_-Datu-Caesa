import java.util.Scanner;

public class NestedLabAccess06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;

        System.out.println("Is the user an active student? (true/false): ");
        isActiveStudent = sc.nextBoolean();
        System.out.println("Is the user sanctioned? (true/false): ");
        isSanctioned = sc.nextBoolean();
        System.out.println("Does the user have a lecturer permit? (true/false): ");
        hasLecturerPermit = sc.nextBoolean();
        System.out.println("Is the user a lab assistant? (true/false): ");
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirement");
        }
    }
}