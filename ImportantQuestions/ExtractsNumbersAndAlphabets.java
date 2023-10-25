package ImportantQuestions;

public class ExtractsNumbersAndAlphabets {
    public static void main(String[] args) {
        String input = "1234JunaisBabu5678";

        System.out.println(input);

        System.out.println(input.replaceAll("[0-9]", ""));
        System.out.println(input.replaceAll("[^0-9]", ""));
    }
}
