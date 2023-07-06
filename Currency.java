public class Currency{

  private String name;
  private String country;
  private String abbreviation;
  private double baseValue;
  private double amount;

  //Different constructors for different types
  //of implementation
  public Currency(String name, String country, String abbreviation, double baseValue, double amount){
    this.name = name;
    this.country = country;
    this.abbreviation = abbreviation;
    this.baseValue = baseValue;
    this.amount = amount;
  }
    
  public Currency(String country, double amount){
    this.country = country.toUpperCase();
    this.name = ExpressCurrencyValue.getCurrency(this.country.toUpperCase());
    this.abbreviation = ExpressCurrencyValue.getAbb(this.name);
    this.amount = amount;
    this.baseValue = ExpressCurrencyValue.expressInUSD(abbreviation);
  }

  public Currency(String abb, String country){
    this.country = country.toUpperCase();
    this.name =  ExpressCurrencyValue.getCurrency(this.country.toUpperCase());
    this.baseValue = ExpressCurrencyValue.expressInUSD(abb);
    this.abbreviation = abb;
    this.amount = 1;
  }

  public Currency(double amount, String abb, String name){
    this.country = "";
    this.name =  name.toUpperCase();
    this.baseValue = ExpressCurrencyValue.expressInUSD(abb);
    this.abbreviation = abb;
    this.amount = amount;
  }
  

  public Currency(String name, String country, double amount){
    this.name = name.toUpperCase();
    this.country = country.toUpperCase();
    this.abbreviation = ExpressCurrencyValue.getAbb(this.name);
    this.amount = amount;
    this.baseValue = ExpressCurrencyValue.expressInUSD(this.abbreviation);
  }

  public Currency(String abbreviation, double amount, String country){
    this.name = ExpressCurrencyValue.getName(abbreviation);
    this.country = country.toUpperCase();
    this.baseValue = ExpressCurrencyValue.expressInUSD(this.abbreviation);
    this.abbreviation = abbreviation;
    this.amount = amount;
  }
  

  //Data encapsulation 
  //getters and setters
  public void setName(String name){
    this.name = name;
  }

  public void setCountry(String country){
    this.country = country.toUpperCase();
  }

  public void setAmount(double amount){
    this.amount = amount;
  }
  
  public String getName(){
    return name;
  }

  public String getCountry(){
    return country;
  }

  public String getAbb(){
    return abbreviation;
  }
  
  public double getAmount(){
    return amount;
  }

  public double getUSDValue(){
    return baseValue;
  }

  //A conversion method
  public double convert(String otherCurrency){
    Currency cal = new Currency(1, otherCurrency,  ExpressCurrencyValue.getName(otherCurrency));
    double thisUSDVal = this.getAmount()*this.getUSDValue();
    double otherVal = thisUSDVal * (1/cal.getUSDValue());
    return otherVal*10;
  }

}