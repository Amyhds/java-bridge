package bridge;

public class Validator {

    public static void validateNumber(String userInput) {
        for (int index = 0; index < userInput.length(); index++) {
            if (!Character.isDigit(userInput.charAt(index))) {
                System.out.println(ErrorMessage.NUMBER_ERROR.getMessage());
                throw new IllegalArgumentException();
            }
        }
    }

    public static void validateRange(int bridgeNumber) {
        if (bridgeNumber < 3 || bridgeNumber > 20) {
            System.out.println(ErrorMessage.RANGE_ERROR.getMessage());
            throw new IllegalArgumentException();
        }
    }

    public static void validateLength(String userInput) {
        if (userInput.length() != 1) {
            System.out.println(ErrorMessage.LENGTH_ERROR.getMessage());
            throw new IllegalArgumentException();
        }
    }

    public static void validateMoving(char moving) {
        if (moving != 'U' && moving != 'D') {
            System.out.println(ErrorMessage.MOVING_ERROR.getMessage());
            throw new IllegalArgumentException();
        }
    }

    public static void validateGameCommand(char gameCommand) {
        if (gameCommand != 'R' && gameCommand != 'Q') {
            System.out.println(ErrorMessage.GAMECOMMAND_ERROR.getMessage());
            throw new IllegalArgumentException();
        }
    }
}
