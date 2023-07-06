# CurrencyConverter2023
Mid year project for AP Computer Science A.

# Contents
* Purpose
* Set Up
* Map
* Bugs

# Purpose
This project was a mid-year AP Computer Science Project. It was designed to exemplify course skills such as, program orgnaization, inheritance, object-oriented programming, and many more skills. The premise of this program is to convert between 10 different currencies, the most popular currenices in the world as of 2023. This program also converts the value of currency through time, and compares the affordability of living in different countries.

# Set Up
This program was orginially programmed in replit. The progrm requires Java 18 and the updated java.util.*.

# Map
Main.java
 /* public static void main */
 * Takes user input
 * Calls the corresponding function

 /* public static void diffCur
   public static void priorDec
   public static void FindNaCurr
   public static void comAfford
   public static void diffAfford 
 */
 * Takes user input
 * Constructs a currency object
 * Calls the corresponding method call to perform operation

BurgerIndex.java
 /* public double affordability */
 * Returns the cost of a McDonald's burger in the country
 /* further Val*/
 * Returns the comparision of the difference in afforabilty in different countries

Currency.java
  * Overlodaded contructor for mulitple uses
  /* public double convert */
 * Returns the conversion between different currencies
 * Changes the currency and the country parameter variables

CurrencyConverter.java
 /* 
 public static double USDDec
 public static double EURDec
 public static double GBPDec
 public static double INRDec
 public static double AUDDec
 public static double CADDec
 public static double SGDDec
 public static double CHFDec
 public static double MYRDec
 public static double JYPDec
 public static double CYNDec
 */
 * Return the value of the currency in the current decade compared to value of currency in prior decade
   
/* public static double  functionCall */
* Determines the appropriate function for converting through time

Express Currency Value
 /* public static double expressInUSD */
 * Returns conversion of one currency unit to USD
   
 /*
 public static String getAbb
 public static String getName
*/
* Conversion between name of currency and abbreviation
  
/* public static String getCurrency */
* returns the currency when given the country

#Bugs
* Returns incorrect value when converting between currencies
* Needs an updated interface

