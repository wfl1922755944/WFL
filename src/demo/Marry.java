package demo;

import java.util.Scanner;

public class Marry {
    public static boolean matchString(String target, String mode) {
        String newTarget = "x" + target;
        String newMode = 'x' + mode;
        int[] K = calculateK(mode);
        int i = 1;
        int j = 1;
        while (i <= target.length() && j <= mode.length()) {
            if (j == 0 || newTarget.charAt(i) == newMode.charAt(j)) {
                i++;
                j++;
            } else {
                j = K[j];
            }
        }
        if (j > mode.length()) {
            return true;
        }
        return false;
    }
    private static int[] calculateK(String mode) {
        String newMode = "x" + mode;
        int[] K = new int[newMode.length()];
        int i = 1;
        K[1] = 0;
        int j = 0;
        while (i < mode.length()) {
            if (j == 0 || newMode.charAt(i) == newMode.charAt(j)) {
                i++;
                j++;
                K[i] = j;
            } else {
                j = K[j];
            }
        }
        return K;
    }
    public static void main(String[] args) {
        String s1, s2;
        boolean b;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串1：");
        s1 = input.nextLine();
        System.out.println("请输入字符串2：");
        s2 = input.nextLine();
        b = Marry.matchString(s1, s2);
        System.out.println("匹配是否成功：" + b);

    }

}