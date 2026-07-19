public class OverflowDemo {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println("Before overflow: " + num);
        num = num + 1;
        System.out.println("After overflow: " + num);
    }
}