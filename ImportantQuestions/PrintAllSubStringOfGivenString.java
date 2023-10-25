package ImportantQuestions;

public class PrintAllSubStringOfGivenString {
    static void printSubstrings(char arr[], int strLength) {
        for(int i = 1; i <= strLength; i++) {

            for(int start = 0; start <= strLength - i; start++) {

                int end = start + i - 1;

                for(int index = start; index <= end; index++) {
                    System.out.print(arr[index] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        printSubstrings(arr, arr.length);
    }
}
