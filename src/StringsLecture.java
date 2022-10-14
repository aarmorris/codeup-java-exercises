import java.util.Scanner;
public class StringsLecture {
    public static void main(String[] args) {
     String aaron = "Aaron";

        System.out.println(Integer.toHexString((System.identityHashCode(aaron))));

     String alsoAaron = "Aaron";

        System.out.println(Integer.toHexString(System.identityHashCode(alsoAaron)));

     aaron = aaron  + " Morris";
     alsoAaron = aaron;



        System.out.println(alsoAaron);
        System.out.println(aaron);
        System.out.println(Integer.toHexString(System.identityHashCode(aaron)));
        System.out.println(Integer.toHexString(System.identityHashCode(alsoAaron)));

        String letsTryThis = "Aaron";
        System.out.println(Integer.toHexString(System.identityHashCode(letsTryThis)));

        String theOriginalAaron = "Aaron";
        System.out.println(letsTryThis == theOriginalAaron);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scanner.next();
        System.out.println(theOriginalAaron == userName);
        System.out.println(theOriginalAaron.equals(userName));

    }
}
