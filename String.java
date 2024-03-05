import java.util.Scanner;


public class String{
    // make function 
    static void currencyConverter(int value){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how much dollar you have..");
        int dollarValue = sc.nextInt();

        switch (value) {
            case 1:
                System.out.println("Euro(EUR) value of " + dollarValue+" dollar is "+(dollarValue*0.92));
                break;
            case 2:
                System.out.println("Pound sterling (GBP) value of " + dollarValue+" dollar is "+(dollarValue*0.79));
                break;
            case 3:
                System.out.println("Australian dollar (AUD) value of " + dollarValue+" dollar is "+(dollarValue*1.54));
                break;
            case 4:
                System.out.println("Canadian dollar (CAD) value of " + dollarValue+" dollar is "+(dollarValue*1.36));
                break;
            case 5:
                System.out.println("Swiss franc (CHF) value of " + dollarValue+" dollar is "+(dollarValue*0.89));
                break;
            case 6:
                System.out.println("Indian Rupee (INR) value of " + dollarValue+" dollar is "+(dollarValue*82.88));
                break;

            default:
               System.out.println("Enter valid input...");
                break;
        }
    }


    public static void main(java.lang.String[] args){
        System.out.println("Currency Conveter.....\n");

        @SuppressWarnings("resource")
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Select option.....");
        System.out.println("1.Dollar to Euro (EUR)");
        System.out.println("2.Doller to Pound sterling (GBP)");
        System.out.println("3.Doller to Australian dollar (AUD)");
        System.out.println("4.Doller to Canadian dollar (CAD)");
        System.out.println("5.Doller to Swiss franc (CHF)");
        System.out.println("6.Doller to Indian Rupee (INR)\n");

        System.out.println("Enter a give chioce");
        int userInput = sc1.nextInt();
        System.out.println("\n");

        currencyConverter(userInput);
        System.out.println("\n");
        System.out.println("Thanks.....");

    }
}