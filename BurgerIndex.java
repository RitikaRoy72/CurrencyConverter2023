public class BurgerIndex extends Currency{

  //Determine affordability through 
  //the McDonald's Burger Index
  //This indicates how much the same product
  //costs in different countries through their
  //USD price equivalent

  //Use inheritance
  public BurgerIndex(String name, String country, String abbreviation, double baseValue, double amount){
    super(name, country, abbreviation, baseValue, amount);
  }
  public static void main(String[] args){
    
  }
  public double affordability(){
    //Data from statistia
//https://www.statista.com/statistics/274326/big-mac-index-global-prices-for-a-big-mac/
    String name = this.getName();
    switch (name){
      case "EURO":
        return 4.77;
      case "BRITISH POUND":
        return 4.44;
      case "INDIAN RUPEE":
        return 2.39;
      case "AUSTRALIAN DOLLAR":
        return 4.63;
      case "CANADIAN DOLLAR":
        return 5.52;
      case "SINGAPORE DOLLAR":
        return 4.42;
      case "SWITZERLAND FRANC":
        return 6.71;
      case "MALAYSIAN RINGGIT":
        return 2.45;
      case "JAPANESE YEN":
        return 2.83;
      case "CHINESE YUAN RENMIBI":
        return 3.56;
      case "UNITED STATES DOLLAR":
        return 5.15;
      default:
        return 0;
    }
  }

  //Compare to American price
  public double convertCurrency(){
    return 5.15/this.affordability();
      
  }

  //Find out the difference between the American
  //price and the price in the other country
  public double furtherVal(){
    double multVal = this.convertCurrency();
    double returnval =  (this.getAmount() * multVal) - this.getAmount();
    return returnval;
  }
}
  
