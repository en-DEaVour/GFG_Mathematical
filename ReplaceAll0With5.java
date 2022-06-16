package GFG_Mathematical;

public class ReplaceAll0With5 {
    public static void main(String[] args) {

        System.out.println(convertfive(1004));
    }
    static int convertfive(int num) {
        // Your code here

        String s;
        s = Integer.toString(num);
        String r = s.replace("0", "5");
        int result = Integer.parseInt(r);
        return result;

    }
}

