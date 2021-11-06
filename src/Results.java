import java.util.Scanner;

public class Results {

//the second function is defined to get the amount
    static double getAmount() {
        System.out.println("enter your amount");
        Scanner b = new Scanner(System.in);
        return b.nextDouble();
    }
//the third function is defined to get the reaction of the user if he wants another converting.
   static Boolean getYesNo(){
       System.out.println("do you want to start over?");
       Scanner b = new Scanner(System.in);
       return b.next().equals("y");



   }
//the first function  that is defined to get the coin.i call it after in the main.
    static Coin getCoin() throws Exception {
        int option;



        System.out.println("“Please choose an option (1/2):”\n" +
                "“1. Dollars to Shekels”\n" +
                "“2. Shekels to Dollars”");

        Scanner b = new Scanner(System.in);
        option = b.nextInt();

        ILS ILS1 = new ILS();
        USD USD1 = new USD();

        Coins coinsType = Coins.values()[option - 1];
        Coin coin = null;
        switch (coinsType) {
            case ILS:
                coin = ILS1;
                break;
            case USD:
                coin = USD1;
                break;
        }
        return coin;
    }

    public static void main(String[] args) {
//from next i call the methods and run the project
        do {
            System.out.println("Welcome  to currency converter");

            // Get Coin part
            Coin coin = null;
            do {
                try {
                    coin = getCoin();
                } catch (Exception e) {
                    System.out.println("Invalid Choice, please try again");
                }
            } while (coin == null);

            // Claculate value part
            boolean isOk = false;
            do {
                try {
                    double value = getAmount();
                    double result = coin.calculate(value);
                    System.out.println(result);
                    isOk = true;
                } catch (Exception e) {
                    System.out.println("Invalid Choice, please try again");
                }
            } while (!isOk);

            //?
            Boolean shouldContinue = Boolean.FALSE;
            try {
                shouldContinue=getYesNo();
            } catch (Exception e) {
                System.out.println("assuming N");
            }

            if (!shouldContinue) {
                break;
            }
        } while(true);

//        {
//            System.out.println("Invalid choice please try again");
//            }
//
//            System.out.println("enter your amount");
//            double input = b.nextDouble();
//            double value = coin.calculate(input);
//            System.out.println(value);
//            System.out.println("do you want to start over?");
//           boolean repeat=b.next().equals("y");}
//
//
//
//            }catch (ConvertExeception e){
//            System.out.println(e.getMessage());
//
//        }
//
//        } while (repeat);
//
//        //System.out.println("please type amount to convert");
//
//

//        Coins coinsType = Coins.values() [option] ;
//        Coin coin = null;
//        switch (coinsType){
//            case ILS:
//                coin = ILS1;1
//          break;
//            case USD:
//                coin = USD1;
//          break;
//        }

//        System.out.println("please type amount to convert");
//        double input = b.nextDouble();
//        double value = coin.calculate(input);
//        System.out.println(value);

//Results2.repeat();


    }
}

//[choice - 1]

//else{
//        System.out.println("enter your amount");
//        double input = b.nextDouble();
//        double value = coin.calculate(input);
//        System.out.println(value);
//        System.out.println("do you want to start over?");
//        boolean repeat=b.next().equals("y");}