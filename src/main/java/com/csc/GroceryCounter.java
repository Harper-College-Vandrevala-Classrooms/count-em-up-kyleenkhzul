package com.csc;
public class GroceryCounter {
  Integer[] digits = {0,0,0,0};
  int overflow = 0;

  // This function increments the tens place everytime it is called
  public void tens() {
    if(digits[0] >= 10) {
      overflow++;
      number_of_overflows();
      digits[0] = 0;
    }
    digits[0] += 1;
  }

  // This function increments the ones place everytime it is called
  public void ones() {
    if(digits[1] >= 10) {
      overflow++;
      number_of_overflows();
      digits[1] = 0;
    }
    digits[1] += 1;
  }

  // This function increments the tenths place everytime it is called
  public void tenths() {
    if(digits[2] >= 10) {
      overflow++;
      number_of_overflows();
      digits[2] = 0;
    }
    digits[2] += 1;
  }
  
  // This function increments the hundreths place everytime it is called
  public void hundreths(){
    if(digits[3] >= 10) {
      overflow++;
      number_of_overflows();
      digits[3] = 0;
    }
    digits[3] += 1;
  }

  // This function neatly prints out the monetary total
  public void total() {
    System.out.println("The total amount is $" + digits[0] + digits[1] + "." + digits[2] + digits[3]);
  }

  // This function returns the number of overflows
  public int number_of_overflows() {
    return overflow;
  }

  // This function clears the counter. 
  public void clear() {
    overflow = 0;
    for(int i = 0; i < digits.length; i++) {
      digits[i] = 0;
    }
  }
}
