public class UnderflowDemo {
    public static void main(String[] args) {
        int num = -2147483648;
        System.out.println("Before underflow: " + num);
        num = num - 1;
        System.out.println("After underflow: " + num);
    }
}