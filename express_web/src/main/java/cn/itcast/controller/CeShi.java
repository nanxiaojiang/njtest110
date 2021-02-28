package cn.itcast.controller;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 南江
 * @Description: ${todo}
 * @date 2019/4/23 10:42
 */
public class CeShi {


    public static void main(String[] args) throws Throwable {
        long time = new Date().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(time);
        System.out.println(format);
        //java时间字符串去空格、冒号和横杠
//      format.replaceAll("[[\\s-:punct:]]","");
        //将时间戳中间的大写换为大写T
        format = format.replaceAll("[[\\spunct]]","T");
        System.out.println(format);


       dayForWeek("2015-02-25");
    }


    @Test
    public static int dayForWeek(String pTime) throws Throwable {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date tmpDate = format.parse(pTime);
        Calendar cal = new GregorianCalendar();
        cal.set(tmpDate.getYear(), tmpDate.getMonth(), tmpDate.getDay());
        return cal.get(Calendar.DAY_OF_WEEK);
    }
}
