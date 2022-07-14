package org.csci132.summer.week3.lecture4;

/**
 * @author : Adiesha
 * @created : 7/14/2022, Thursday
 **/
public class StringExperimentalDemo {

    public static void main(String[] args) {
        int inputsize = Integer.parseInt(args[0]);
        long start, end;
        String result;

        // method 1
        start = System.currentTimeMillis();
        result = repeat1('*', inputsize);
        end = System.currentTimeMillis();

        System.out.println("Elapsed time for method 1 -> " + (end - start));

        // method 2
        start = System.currentTimeMillis();
        result = repeat2('*', inputsize);
        end = System.currentTimeMillis();

        System.out.println("Elapsed time for method 2 -> " + (end - start));
    }

    public static String repeat1(char c, int n) {
        String answer = "";
        for (int j = 0; j < n; j++)
            answer += c;
        return answer;
    }

    public static String repeat2(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++)
            sb.append(c);
        return sb.toString();
    }
}
