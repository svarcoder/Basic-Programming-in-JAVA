public class SwapWithout3rd {
    public static void main(String args[]) {
        int a = 1, b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(+a);
        System.out.println(+b);
    }
}
