package tostring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String str = sdf.format(date);
        System.out.println(str);
        String str1 = "2021-10-11";
        try {
            Date date2 =sdf.parse(str1);
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
