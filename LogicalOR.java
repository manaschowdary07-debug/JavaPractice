public class LogicalOR {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a || b = " + (a || b));
        System.out.println("a || false = " + (a || false));
        System.out.println("false || false = " + (false || false));
    }
}