public class ExpressCurrencyValue{
  public static void main (String[] args){
    
  }

  public static double expressInUSD(String name){
    //USD conversion rate
    double returnval = 0;
    if (name.equals("EUR"))
        returnval =  1.09;
    else if (name.equals("GBP"))
        returnval =  1.23;
    else if (name.equals("INR"))
        returnval = 0.01;
    else if (name.equals("AUD"))
        returnval = 0.70;
    else if (name.equals("CAD"))
        returnval = 0.74;
    else if (name.equals("SGD"))
        returnval = 0.75;
    else if (name.equals("CHF"))
        returnval = 1.08;
    else if (name.equals("MYR"))
        returnval = 0.23;
    else if (name.equals("JPY"))
        returnval = 0.01;
    else if (name.equals("CYN"))
        returnval = 0.15;
    else if (name.equals("USD"))
        returnval = 1.0;
    
    return returnval;
    
    
  }

  public static String getAbb(String currency){
    //Switch to find the abbreviation
    //when given the name
    switch(currency){
      case "EURO":
        return "EUR";
      case "BRITISH POUND":
        return "GBP";
      case "INDIAN RUPEE":
        return "INR";
      case "AUSTRAILIAN DOLLAR":
        return "AUD";
      case "CANADIAN DOLLAR":
        return "CAD";
      case "SINGAPORE DOLLAR":
        return "SGD";
      case "SWITZERLAND FRANC":
        return "CHF";
      case "MALAYSIAN RINGGIT":
        return "MYR";
      case "JAPANESE YEN":
        return "JYP";
      case "CHINESE YUAN RENMIBI":
        return "CYN";
      case "UNITED STATES DOLLAR":
        return "USD";
      default:
        return "";
        
    }
  }

  public static String getName(String abb){
    //Switch to find the name when
    //given the abbreviation
    switch(abb){
      case "EUR":
        return "EURO";
      case "GBP":
        return "BRITISH POUND";
      case "INR":
        return "INDIAN RUPEE";
      case "AUD":
        return "AUSTRAILIAN DOLLAR";
      case "CAD":
        return "CANADIAN DOLLAR";
      case "SGD":
        return "SINGAPORE DOLLAR";
      case "CHF":
        return "SWITZERLAND FRANC";
      case "MYR":
        return "MALAYSIAN RINGGIT";
      case "JYP":
        return "JAPANESE YEN";
      case "CYN":
        return "CHINESE YUAN RENMIBI";
      case "USD":
        return "UNITED STATES DOLLAR";
      default:
        return "";
      
    }
  }
  
  public static String getCurrency(String x){
    //x is a country name
    //Find the currency
    //of a country
    x = x.toUpperCase();
    String[] euros = {"GERMANY", "ITALY", "SPAIN", "FRANCE", "PORTUGA","AUSTRIA", "BELGIUM", "NETHERLANDS", "GREECE", "IRELAND", "FINALND", "SLOVAKIA", "LITHUANIA", "MALTA", "CYPRS", "MONACO", "LUXEMBOURG", "KOSOVO", "MONTENEGRO", "VATICAN CITY", "ESTONIA", "SLOVENIA", "LAVTIA", "ANDORRA", "SAN MARINO", "REUINION", "MARINIQUE", "GUADELOUPE", "SAINT BARTHELEMY", "MAYOTTE", "ALAND ISLANDS", "SAINT PIERRE AND MIQUELON", "CARIBEAN NETHERLANDS", "KINGDOM OF THE NETHERLANDS", "SAINT MARTIN"};

    String[] pounds = {"UNITED KINGDOM", "ENGLAND", "SCOTLAND", "JERSEY", "WALES", "GIBRALTAR", "NORTHERN IRELAND", "ISLE OF MAN", "GUERNSEY", "SOUTERN GEORGIA AND THE SOUTH SANDWICH ISLANDS", "SAINT HELENA ASCENSION AND TRISTAIN DA CUNHA"};

    String[] rupee = {"INDIA", "BHUTAN"};

    String[] austro = {"AUSTRIALIA", "TUVALU", "NAURU", "KIRIBATI", "CHRISTMAS ISLANDS", "NORFOLK ISLANDS", "COCOS (KEELING) ISLANDS"};

    String[] can = {"CANDA"};

    String[] sing = {"SINGAPORE"};
  
    String[] swiss = {"SWITZERLAND", "LIECHTENSTEIN"};

    String[] mala = {"MALAYSIA"};

    String[] japan = {"JAPAN"};

    String[] chinese = {"CHINA"};

    String[] USD = {"UNITED STATES", "ECUADOR", "PUERTO RICO", "ZIBABWE", "EL SALVADOR", "PANAMA", "SOMALIA", "GUAM", "TURKS AND CAICOS ISLANDS", "U.S. VIRGIN ISLANDS", "TIMROR-LESTE", "PALAU", "MARSHALL ISLANDS", "MICRONESIA", "BRITISH VIRGIN ISLANDS", "AMERICAN SAMOA", "BONAIRE", "NORTHERN MARIANA ISLANDS", "CARIBEEAN NETHERLANDS" };

    String returnval = "";
    
    for (String e : euros) {
      if (e.equals(x)) {
        return "EURO";
      }
    }
    
    for (String e : pounds) {
      if (e.equals(x)) {
        return "BRITISH POUND";
      }
    }

    for (String e : rupee) {
      if (e.equals(x)) {
        return "INDIAN RUPEE";
      }
    }

    for (String e : austro) {
      if (e.equals(x)) {
        return "AUSTRALIAN DOLLAR";
      }
    }

    for (String e : can) {
      if (e.equals(x)) {
        return "CANADA";
      }
    }

    for (String e : sing) {
      if (e.equals(x)) {
        return "SINGAPORE";
      }
    }

    for (String e : swiss) {
      if (e.equals(x)) {
        return "SWITZERLAND FRANC";
      }
    }

    for (String e : mala) {
      if (e.equals(x)) {
        return  "MALAYASIAN RINGGIT";
      }
    }

    for (String e : japan) {
      if (e.equals(x)) {
        return "JAPANESE YEN";
      }
    }

    for (String e : chinese) {
      if (e.equals(x)) {
        return "CHINESE YUAN RENMIBI";
      }
    }

    for (String e : USD) {
      if (e.equals(x)) {
        return "UNITED STATES DOLLAR";
      }
    }
    
    return returnval;
  }

  
}