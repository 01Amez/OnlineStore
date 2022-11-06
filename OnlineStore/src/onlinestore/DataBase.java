package onlinestore ;

import java.util.*;
import static onlinestore.admin.adminPrint;
import static onlinestore.user1.userPrint;

public class DataBase {

    static Scanner s = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static String chose;
    private static final String UserName = "u";
    private static final String UserPass = "u";
    private static final String adminUsername = "a";
    private static final String adminPass = "a";

    public static String getEmpPass() {
        return adminPass;
    }

    public static String getEmpName() {
        return adminUsername;
    }
    static double money = 10000;
    static double newMoney;
    static int numofitm = 1;
    static double NewPs5Price;
    static double add;
    static int numItm;
    static double discount;
    static String job;
    //feedback
    static String chfeedback;
    static String nameFb;
    static String emailFb;
    static String fedback;
    static String sfeedback;
    //sellitm
    static String solditm;
    static double soldprice;
    static String soldname;
    //while
    static boolean RunLoop = true;
    static boolean userCaseLoop = true;
    static boolean AdminLoop;
    static boolean userPrintLoop = true;
    static boolean caseItmLoop = true;
    static boolean UserLopp;
    static boolean adminPrintLoop;
    static boolean adminCaseLoop = true;
    static double para = 10000;
    static double ps5Price = 200;
    static double tvPrice = 300;

    public static String getUserPass() {
        return UserPass;
    }

    public static String getUserName() {
        return UserName;
    }

    public static void showdetaile(double mony, int buied) {
        System.out.println("last update\nyour mony = " + mony + "$" + "\nbuied itm = " + buied);
    }

    public static void showdetaile(double yourdiscount, double newnrxps5, double newnrxtv) {
        System.out.println("after discounting\nyour limt = " + yourdiscount + "\nnew ps5 value = " + newnrxps5 + "$" + "\n new tv value=" + newnrxtv + "$");
    }
 
    public static void run() {
        while (RunLoop) {
            System.out.println("You want login with\n*******\nadmin\n******* \nuser\n******* \nexit\n*******");
            job = sc.nextLine();
            switch (job) {
                case "user":
                    do {
                        userPrint();
                    } while (UserLopp);
                case "admin":
                    do {
                        adminPrint();
                    } while (AdminLoop);
                    break;
                case "exit":
                    System.out.println("you stoped the process");
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong chose!");
                    break;
            }
        }
    }
}
