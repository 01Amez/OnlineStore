

package onlinestore ;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OnlineStore extends DataBase {

    static {
        Date dNow = new Date();
        System.out.println("\t\t\t\t***********************************************");
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");
        System.out.println("\t\t\t\t* " + "Current Date: " + ft.format(dNow) + " *");
        System.out.println("\t\t\t\t***********************************************");
        System.out.println(" |_________________________________________________________________________________________________________|");
        System.out.println(" |&&&&&&&&&                      Hello welcome to Room 27 Online Store                            &&&&&&&&&|");
        System.out.println(" |_________________________________________________________________________________________________________|\n\n");
    }

    public static void main(String[] args) {
        run();
    }
}
