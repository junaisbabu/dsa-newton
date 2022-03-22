package OwnEffect;

public class StringMutability {

    public static void main(String[] args) {
//        String s = "Junais";
//
//        s = s.concat(" Babu");
//
//        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("Junais");

        stringBuilder.append(" Babu");

        System.out.println(stringBuilder);

    }


}
