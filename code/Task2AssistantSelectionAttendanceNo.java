import java.util.Scanner;

public class Task2AssistantSelectionAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the student active? (true/false): ");
        boolean isActiveStudent = sc.nextBoolean();
        System.out.print("Is the student currently under academic sanction? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            System.out.print("Enter Basic Programming grade: ");
            double programmingGrade = sc.nextDouble();
            System.out.print("Does the student have a programming competency certificate? (true/false): ");
            boolean hasCertificate = sc.nextBoolean();

            if (programmingGrade >= 80 || hasCertificate) {
                System.out.println("-> The student meets the requirements and is called for an interview.");
                System.out.print("Enter interview score: ");
                double interviewScore = sc.nextDouble();

                if (interviewScore >= 75) {
                    System.out.println("Selection Result: Accepted as a lab assistant.");
                } else {
                    System.out.println("Selection Result: Failed (interview score is below 75).");
                }
            } else {
                System.out.println("Selection Result: Failed (Basic Programming grade is below 80 and does not possess a programming competency certificate).");
            }
        } else {
            if (!isActiveStudent && isSanctioned) {
                System.out.println("Selection Result: Failed (student status is not active and currently under academic sanction).");
            } else if (!isActiveStu
                        dent) {
                System.out.println("Selection Result: Failed (student status is not active).");
            } else {
                System.out.println("Selection Result: Failed (student is currently under academic sanction).");
            }
        }
                        
    }
}
