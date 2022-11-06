package onlinestore ;

public class admin extends DataBase {

    static String adminUserInput;
    static String adminPassInput;

    public static void adminPrint() {
        AdminLoop = true;
        adminPrintLoop = true;
        adminCaseLoop = true;
        adminPrintLoop = true;
        while (adminPrintLoop) {
            System.out.println("enter username and password");
            System.out.print("username: ");
            adminUserInput = sc.nextLine();
            System.out.print("enter password: ");
            adminPassInput = sc.nextLine();
            if (adminPassInput.equals(getEmpPass()) && adminUserInput.equals(getEmpName())) {
                while (adminCaseLoop) {
                    System.out.println("*************************************************\nyou can do those thing\n1.discount\n2.see last update\n3.user item to sell \n4.view feedback\n5.stop");
                    System.out.println("");
                    
                    chose = sc.nextLine();
                  
                    switch (chose) {
                        case "1":
                            System.out.println("you can discount for clint\nenter number of discount");
                            discount = s.nextInt();
                            tvPrice = tvPrice - (tvPrice * (discount / 100));
                            ps5Price = ps5Price - (ps5Price * (discount / 100));

                            System.out.println("discount item succesfuly\n***********************************************\nnew price\ntv = " + tvPrice + "\nps5 = " + ps5Price);
                   
                            break;
                       
                        case "2":
                            System.out.println("newest update\n");
                            showdetaile(discount, tvPrice, NewPs5Price);
                            System.out.println("********************************************");
                            break;
                        case "3":
                           if(soldname!=null&&solditm!=null&&soldprice!=0.0){
                            System.out.println("the last item was uploded\nuser: " + soldname + "\nitem:" + solditm + "\nprice: " + soldprice + "$\n************************************\n");
                           }else{
                               System.out.println("no one added their item to sell");
                           }
                            break;
                        case "4":
                            System.out.println("if there is a feedback ,do you want to see?");
                            sfeedback = sc.nextLine();
                            if (sfeedback.equals("yes")) {
                                 if(fedback!=null){
                                System.out.println("user:" + nameFb + "\nemail address: " + emailFb + "\nfeedback: " + fedback + "\n*************************************\n");
                                 }else{
                                     System.out.println("there is no feedback");
                                 }
                            }
                            break;
                        case "5":
                            adminCaseLoop = false;
                            adminPrintLoop = false;
                            System.out.println("you logout as employee \n*************************************\n");
                            
                            run();
                            break;
                        default: System.out.println("please correct chose ");
                            
                           
                    }
                }
            } else {
                System.out.println("your password or user name is wrong , try again");

            }
       
        }
    } 
}
