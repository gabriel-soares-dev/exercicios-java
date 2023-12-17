import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class ValidDate 
{
    public static void main( String[] args )
    {
        //yyyy-mm-dd
        String value =  "20210906000000";
        String value2 = "        235959";
        String data = value2.substring(0,8);
        String hora = value2.substring(8,13);
        if (data.trim().equals("")) {
            data = null;
        }else{
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            try {
                Date date = format.parse(value2);
                System.out.println(date);
                System.out.println(date.getTime()); // save database with java.sql.Date(date.getTime())
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
