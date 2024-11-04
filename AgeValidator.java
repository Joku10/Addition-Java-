
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an age as a command line argument.");
            return;
        }

        try {
            int age = Integer.parseInt(args[0]);
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer for age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        }
    }

}
