public class Main {
    public static String add(String x, String y) {
        String ans = x + y;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(add(add("10", "20"), add("30", "40")));
    }
}
