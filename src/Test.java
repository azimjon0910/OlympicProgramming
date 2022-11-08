public class Test {
    public static void main(String[] args) {
        String s = "30°W, Hiposgpisp";
        System.out.println(s.matches("\\d{1,3}°.*"));
    }
}
