public class Main {
    public static void main(String[] args) {
        Time t = new Time(2, 30,3);

        Time t2 = new Time(2, 30, 30);

        // Time t3 = t.add(t2);

        Time t4 = t.subtract(t2);

        // System.out.println(t3.display());
        System.out.println(t4.display());
    }
}
