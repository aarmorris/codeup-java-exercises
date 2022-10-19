package util;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        input.getInteger(1,85);
        System.out.println(input.yesNo());
        System.out.println(input.getInt());
//        System.out.println(input.getDouble(12.4, 78.773));
    }
}
