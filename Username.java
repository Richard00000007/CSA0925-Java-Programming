import java.util.Scanner;
 class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is not valid.");
        }
    }
    public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        char firstChar = username.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return false;
        }
        return true;
    }
}
