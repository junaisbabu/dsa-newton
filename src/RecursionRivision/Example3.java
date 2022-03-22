package RecursionRivision;


// For a given string, count the number of times 'x' comes in the string
// Ex: I/P: input = "xydjk"
// O/P: count = 1


public class Example3 {

    public static int numberX(String input){
        if(input.isEmpty())
            return 0;

        if(input.charAt(0) == 'x')
            return numberX(input.substring(1))+1;
        else
            return numberX(input.substring(1));
    }

    public static void main(String[] args) {
        String input = "xnx";

        System.out.println(numberX(input));
    }



}
