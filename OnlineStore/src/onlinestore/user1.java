package onlinestore ;

import static onlinestore.DataBase.sc;

public class user1 extends DataBase {

    static String passUser;
    static String usernameUser;
    DataBase m = new DataBase();

    public static void userPrint() {
        while (userPrintLoop) {
            System.out.println("enter user name and password");
            System.out.print("username: ");
            usernameUser = sc.nextLine();
            System.out.print("enter password: ");
            passUser = sc.nextLine();
            if (passUser.equals(getUserPass()) && usernameUser.equals(getUserName())) {
                System.out.println("login succecfully\n*************************************************\nyou can do those thing");
                while (userCaseLoop) {
                    System.out.println("1.buing\n2.add mony\n3.sell\n4.see last update\n5.stop");
                    chose = sc.nextLine();
                    switch (chose) {
                        case "1":
                            caseItmLoop = true;
                            while (caseItmLoop) {
                                System.out.println("you can buy : \nps5 = " + ps5Price + " $\ntv = " + tvPrice + " $\nback\nwhat you like to buy?");
                                String itm = sc.nextLine();
                                switch (itm) {
                                    case "ps5":
                                        if (money < ps5Price) {
                                            System.out.println("your money is less than prize");
                                        } else {
                                            System.out.print("how much? :");
                                            numofitm = s.nextInt();
                                            newMoney = money - (numofitm * ps5Price);
                                            if (newMoney < (numofitm * ps5Price)) {
                                                System.out.println("you cant buy this number of item try cheaper\n\n");
                                            } else {
                                                System.out.println("you bought " + numofitm + " ps5 , your money now is " + newMoney + "$\n");
                                                numItm += numofitm;
                                            }
                                        }
                                        break;
                                    case "tv":
                                        if (money < tvPrice) {
                                            System.out.println("your money less than prize\n");
                                        } else {
                                            System.out.print("how much? :");
                                            numofitm = s.nextInt();
                                            newMoney = money - (numofitm * tvPrice);
                                            if (newMoney < numofitm * tvPrice) {
                                                System.out.println("you cant buy this number of itm try cheaper\n");
                                            } else {
                                                System.out.println("you bought " + numofitm + " tv , your money now is " + newMoney + "$\n");
                                                numItm += numofitm;
                                            }

                                        }
                                        break;
                                    case "back":
                                        System.out.println("back to main list \n********************************");
                                        caseItmLoop = false;
                                        break;
                                    default:
                                        System.out.println("wrong chose , try again1");
                                }
                            }
                            break;
                        case "2":
                            System.out.print("you can add money\nplease enter mony:");
                            add = s.nextInt();
                            money = newMoney + add;
                            System.out.println("your money now is:" + money + "$\n********************************");
                            break;
                        case "3":
                            System.out.print("enter your name: ");
                            soldname = sc.nextLine();
                            System.out.print("you can sell your item \nwhat you like to sell: ");
                            solditm = sc.nextLine();
                            System.out.print("enter price: ");
                            soldprice = s.nextDouble();
                            System.out.println("you have " + solditm + " to sell with " + soldprice + "$\nyour item uploded\n\n*******************************");
                            break;
                        case "4":
                            double para1 = newMoney;
                            showdetaile(para1, numItm);
                            break;
                        case "5":
                            System.out.println("do you want send feedback before logout yes or no");
                            chfeedback = sc.nextLine();
                            if (chfeedback.equals("yes")) {
                                System.out.print("enter your name:");
                                nameFb = sc.nextLine();
                                System.out.print("enter your email:");
                                emailFb = sc.nextLine();
                                System.out.print("write your feedback:");
                                fedback = sc.nextLine();
                                System.out.println("your feedback send succesfully wait for review");
                            }
                            System.out.println("you loged out as user\n\n********************\nyou want login again\n");
                            run();
                            break;
                        default:
                            System.out.println("wrong choese , try again");
                    }
                }
            } else {
                System.out.println("your password or user name is wrong\ntry again");
            }
        }
    }
}
