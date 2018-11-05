package com.pojo;

public class Num2Rmb {
    private String[] hanArr = {"零", "壹"};
    private String[] unitArr = {"十", "百", "千"};

    private String[] divide(double num) {
        long zheng = (long) num;
        long xiao = Math.round((num - zheng) * 100);
        return new String[]{zheng + "", String.valueOf(xiao)};
    }

    private String toHanStr(String numStr) {
        String result = "";


        int numLen = numStr.length();

        for (int i = 0; i < numLen; i++) {

            int num = numStr.charAt(i) - 48;

            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            } else {
                result += hanArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Num2Rmb nr = new Num2Rmb();
        System.out.println(nr.divide(23675.123));
        for (String str : nr.divide(23675.123)) {
            System.out.println(str);
        }
    }
}