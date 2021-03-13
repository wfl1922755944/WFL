package tostring;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ToStringDemo {
    public static void main(String[] args) {
        //获取当前系统时间
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//        //
 //       Date date = new Date();
//        System.out.println(date);
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.get(Calendar.DATE));
        rightNow.add(Calendar.DATE,48);
        rightNow.add(Calendar.DATE,-7);
        rightNow.set(rightNow.DAY_OF_WEEK,5);
        Date date1 = rightNow.getTime();
        System.out.println(date1);

    }
}
