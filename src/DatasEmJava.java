import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.getYear()+1900);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(data));
    }
}
