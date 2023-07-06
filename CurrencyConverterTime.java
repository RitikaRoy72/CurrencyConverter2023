public class CurrencyConverterTime{
  public static void main(String[] args){
    
  }

  //Methods to approximate the value of
  //currency in a different time, note
  //that this is based off of the data
  //given from a source, with different
  // hard coded piece-wise approximation 
  // lines through each
  public static double USDDec(int decade){
    //USD statistica- data from 1635 - 2023
    double returnval = 0;
    // if (decade >= 1900 && decade <= 1920){
    //   returnval = -0.75*(decade-1900)+30;
    // } else if (decade > 1920 && decade <= 1930){
    //   returnval = 0.5*(decade - 1920) + 15;
    // } else if (decade > 1930 && decade <= 1950){
    //   returnval = -0.5*(decade - 1930) + 20;
    // } else 
    if (decade > 1950 && decade < 2023){
      returnval = -0.125*(decade - 1950) + 10;
    } else{
      System.out.println("Out of bounds");
    }
    return returnval;
  }

  public static double EURDec(int decade){
    //Euro statistica- data from 2000 to 2020
    double returnval = 0;
    if (decade >= 2000 && decade <= 2013){
      returnval = -0.025*(decade - 2000) + 1.39;
    } else if (decade > 2013 && decade <= 2017){
      returnval = 1.06;
    } else if (decade > 2017 && decade <= 2023){
      returnval = -0.02*(decade-2017)+1.06;
    }else {
      System.out.println("Out of bounds");
    }
    return returnval;
  }
  public static double GBPDec(int decade){
    //British pound statiscia- data from 1209 to 2023
    double returnval = 0;
    // if (decade >= 1900 && decade <= 1915){
    //   returnval = -0.5*(decade-1900)+123;
    // } else if (decade > 1915 && decade <= 1920){
    //   returnval = -14.2*(decade - 1915) + 116;
    // } else if (decade > 1920 && decade <= 1933){
    //   returnval = 2.08*(decade - 1920) + 45;
    // } else if(decade > 1933 && decade < 1977){
    //   returnval = -1.5*(decade - 1933) + 71;
    // } else 
    if (decade >= 1950 && decade <= 2023){
      returnval = -0.1*(decade - 1977) + 6;
    } else {
      System.out.println("Out of bounds");
    }
    return returnval;
    
    
  }
  public static double INRDec(int decade){
    //Indian rupee
    //https://www.in2013dollars.com/india/inflation
    double returnval = 0;
    if (decade >= 1950 && decade <= 1975){
      returnval = -0.36*(decade - 1958)+100;
    }else if (decade > 1975 && decade <= 2023){
      returnval = -0.5*(decade - 1975) + 30;
    } else {
      System.out.println("Out of bounds");
    }
    return returnval;
    
    
  }
  public static double AUDDec(int decade){
    //Austrialian dollar
    double returnval = 0;
    if(decade >= 1966 && decade <= 1976){
      returnval = -0.7*(decade - 1966)+13;
    } else if (decade >= 1976 && decade <= 1986){
      returnval = -0.4*(decade - 1976)+6;
    } else if (decade >= 1986 && decade <= 2023){
      returnval = -0.04*(decade - 1986) + 2;
    } else {
      System.out.println("Out of bounds");
    }
    return returnval;
    
  }
  public static double CADDec(int decade){
    //Canadian dollar
    //https://www.in2013dollars.com/Canada-inflation#:~:text=The%20Canadian%20dollar%20has%20lost%2096%25%20its%20value%20since%201915&text=%24100%20in%201915%20is%20equivalent,cumulative%20price%20increase%20of%202%2C367.68%25.
    double returnval = 0;
    // if (decade >= 1915 && decade <= 1920){
    //   returnval = -4.8*(decade - 1915) + 100;
    // } else if (decade > 1920 && decade <= 1923){
    //   returnval = 2.67*(decade - 1920) + 52;
    // } else if (decade > 1923 && decade <= 1930){
    //   returnval = 65;
    // } else if(decade > 1930 && decade <= 1933){
    //   returnval = 6.3*(decade - 1930) + 65;
    // } else if (decade > 1933 && decade <= 1952){
    //   returnval = -2.2*(decade - 1933) + 84;
    // } else 
    if (decade > 1950 && decade < 1980){
      returnval = -1.14*(decade - 1952) + 42;
    } else if (decade > 1980 && decade <= 2023){
      returnval = -0.16*(decade - 1980)+10;
    } else{
      System.out.println("Out of bounds");
    }
    return returnval;
    
  }
  public static double SGDDec(int decade){
    //Singapore dollar
    //https://tradingeconomics.com/singapore/currency
    double returnval = 0;
    if (decade >= 1984 && decade <=  1995){
      returnval = -0.9*(decade - 1984)+2.2;
    } else if (decade > 1995 && decade <= 1998){
      returnval = -0.13*(decade - 1995) + 1.3;
    } else if (decade > 1998 && decade <= 2002){
      returnval = 0.02*(decade - 1998) + 1.7;
    } else if (decade > 2002 && decade <= 2011){
      returnval = -0.07*(decade - 2002) + 1.8;
    } else if (decade > 2011 && decade <= 2023){
      returnval = 0.01*(decade - 2011) + 1.1;
    } else {
      System.out.println("Out of bounds");
    }
    return returnval;
    
  }
  public static double CHFDec(int decade){
    //Swiss franc
    //https://www.in2013dollars.com/switzerland/inflation
    double returnval = 0;
    if (decade >= 1950 && decade <= 1994){
      returnval = 0.92*(-1.9*(decade - 1956) + 100)/100;
    } else if (decade > 1994 && decade <= 2023){
      returnval = 0.92*(0.14*(returnval - 1956) + 16);
    } else{
      System.out.println("Out of bounds");
    }
    return returnval;
  }
  public static double MYRDec(int decade){
    //Mayalsian Ringgit
    //https://fred.stlouisfed.org/series/PPPTTLMYA618NUPN
    double returnval = 0;
    if (decade >= 1950 && decade <= 1981){
      returnval = -0.088*(decade - 1955)+3.1;
    } else if (decade > 1981 && decade <= 2023){
      returnval = 0.004*(decade - 1981) + 1.7;
    } else{
      System.out.println("Out of bounds");
    }
    return returnval;
  }
  public static double JYPDec(int decade){
    //Japanese yen
    //https://fred.stlouisfed.org/series/PPPTTLJPA618NUPN
    double returnval = 0;
    if (decade >= 1950 && decade <= 1975){
      returnval = 0.0077*(-5.56*(decade - 1950))+120;
    } else if (decade >= 1975 && decade <= 2023){
      returnval = 0.0077*(-2.91*(decade - 1975))+249;
    } else {
      System.out.println("Out of bounds");
    }
    return returnval;
  }
  public static double CYNDec(int decade){
    //chinese yuan
    double returnval = 0;
    if (decade >= 1950 && decade <= 1967){
      returnval = 3.7;
    } else if (decade > 1967 && decade <= 1984){
      returnval = 0.33*(-2.4*(decade - 1967)+3.7);
    } else if (decade > 1984 && decade <= 2023){
      returnval = 0.33*(0.09*(decade - 1984)+1.3);
    } else{
      System.out.println("Out of bounds");
    }
    return returnval;
  }

  public static double  functionCall(String abb, int year){
    if (abb.equals("USD")) return CurrencyConverterTime.USDDec(year);
    else if (abb.equals("EUR")) return CurrencyConverterTime.EURDec(year);
    else if (abb.equals("GBP")) return CurrencyConverterTime.GBPDec(year);
    else if (abb.equals("INR")) return CurrencyConverterTime.INRDec(year);
    else if (abb.equals("AUDDec")) return CurrencyConverterTime.AUDDec(year);
    else if (abb.equals("CAD")) return CurrencyConverterTime.CADDec(year);
    else if (abb.equals("SGD")) return CurrencyConverterTime.SGDDec(year);
    else if (abb.equals("CHF")) return CurrencyConverterTime.CHFDec(year);
    else if (abb.equals("MYR")) return CurrencyConverterTime.MYRDec(year);
    else if (abb.equals("JYP")) return CurrencyConverterTime.JYPDec(year);
    else if (abb.equals("CYN")) return CurrencyConverterTime.CYNDec(year);
    else return 0;
  }
}