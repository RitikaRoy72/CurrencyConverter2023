import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Currency Calculator!\nNote that this calculator only works with the top 10 most common currencies as of 2023.");
    //Repeat operation until user breaks
    while (true){
        System.out.println("Choose from the following:\n(1) Convert to a different curerncy\n(2) Find a value from a prior decade\n(3) Find National Currency\n(4) Compare affordability\n(5) Find Amount Affordability Difference\n(6) Exit");
        try{
          Scanner scan = new Scanner(System.in);
          int opt = scan.nextInt();
          if (opt == 1){ 
            diffCur();
          } else if (opt == 2){
            priorDec();
          } else if (opt == 3){
            FindNaCurr();
          } else if (opt == 4){
            comAfford();
          } else if (opt == 5){
            diffAfford();
          } else if (opt == 6){
            break;
          } else {
            int u = 0 / 4;
          }
        } catch(Exception e){
          System.out.println("Bad input.\nPlease reenter.");
          
        }
      }
  }

  //Handeling for different situations
  public static void diffCur(){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a currency (abbreviation): ");
    String currency = scan.nextLine();
    
    System.out.print("Enter your country: ");
    String country = scan.nextLine();
    
    System.out.print("Enter an amount: ");      String amount = scan.nextLine();
    
    System.out.print("Enter the currency you would like to convert to (Abbreviation): ");
    String other = scan.nextLine();
    Currency val = new Currency(1, currency, country);
    // if (val.convert(other).isInfinite()){
    //   System.out.println("Error");
    // } else 
    System.out.println(val.convert(other));
    System.out.println("\n");
  }

  public static void priorDec(){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a currency (abbreviation): ");
    String currency = scan.nextLine();
    
    System.out.print("Enter your country: ");
    String country = scan.nextLine();
    
    System.out.print("Enter an amount: ");
    double amount = scan.nextInt();
    
    Currency value = new Currency(amount, currency, country);
    //continue here, prior decade
    System.out.println("Note that all data starts from (1950), with the exception of \nthe EURO (2000) \nthe Austrialian Dollar (1966) \nthe Singapore Dollar (1984).");
    System.out.print("Enter a year: ");
    int decade = scan.nextInt();
    double currVal = CurrencyConverterTime.functionCall(value.getAbb(), decade);
    double timeVal = currVal * value.getAmount();
    
    if (timeVal == 0) System.out.println("Try again");
    else System.out.println("At the time, this amount was worth roughly " + timeVal + " " + value.getAbb());
    System.out.println("\n");
    
  }

  public static void FindNaCurr(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your country: ");
    String country = scan.nextLine();
    
    Currency value = new Currency(country, 1);
    
    System.out.println("The national currency is " + value.getAbb() + " offically writtern as " + value.getName());
    System.out.println("\n");
  }

  public static void comAfford(){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a currency (abbreviation): ");
    String currency = scan.nextLine();
    
    System.out.print("Enter your country: ");
    String country = scan.nextLine();
    
    
    Currency values = new Currency( currency, country);
    BurgerIndex com = new BurgerIndex(values.getName(), values.getCountry(), values.getAbb(), values.getUSDValue(), values.getAmount());
    System.out.println("With" + values.getAbb() + " in " + values.getCountry() + " your purchasing power is " + com.convertCurrency() + " times that of USD.");
    //continue here, burger index
    System.out.println("\n");
  }

  public static void diffAfford(){
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a currency (abbreviation): ");
    String currency = scan.nextLine();
    
    System.out.print("Enter your country: ");
    String country = scan.nextLine();
    
    
    Currency values = new Currency( currency, country);
    BurgerIndex com = new BurgerIndex(values.getName(), values.getCountry(), values.getAbb(), values.getUSDValue(), values.getAmount());
    System.out.println("With " + values.getAmount() + " in " + values.getAbb() + " you have " + com.furtherVal() + " more value compared to the equivalent amount of USD in the United States.");
    //continue here, burger index
    System.out.println("\n");
  }
}