import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {
    public static void main(String[] args) throws ParseException {


        //date to String

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd= new SimpleDateFormat( "dd/MM/yyyy");
        String str = sd.format(date);
        System.out.print(str);

        //String to Date

        String datestr = "17/01/2023";
        SimpleDateFormat sd1= new SimpleDateFormat("dd/MM/yyyy");
        Date dt = sd1.parse(datestr);
        System.out.print(dt);
    }
}
