package statement.control;

public class test {

    static int changeValue(int x) {
        x = 50;
        return x;

    }

    public static void main(String[] args) {
        int a = 10;
        a = changeValue(a);

        System.out.println(a);  // Output: 10
    }

}
