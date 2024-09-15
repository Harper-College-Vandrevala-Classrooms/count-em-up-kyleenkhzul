package com.csc;
public class GroceryCounter {
  Integer[] digits = {0,0,0,0};
  int overflow = 0;

  // This function increments the tens place everytime it is called
  public void tens() {
    if(digits[0] >= 10) {
      number_of_overflows();
      digits[0] = 0;
    }
    digits[0] += 1;
  }

  // This function increments the ones place everytime it is called. If it exceeds 9, it adds 1 to the tens place. 
  public void ones() {
    if(digits[1] >= 10) {
      digits[1] = 0;
      digits[0] += 1;
    }
    digits[1] += 1;
    number_of_overflows();
  }

  // This function increments the tenths place everytime it is called. If it exceeds 9, it adds 1 to the ones place. 
  public void tenths() {
    if(digits[2] >= 10) {
      digits[2] = 0;
      digits[1] += 1;
    }
    digits[2] += 1;
    number_of_overflows();
  }
  
  // This function increments the hundreths place everytime it is called. If it exceeds 9, it adds 1 to the tenths place. 
  public void hundreths(){
    if(digits[3] >= 10) {
      digits[3] = 0;
      digits[2] += 1;
    }
    digits[3] += 1;
    number_of_overflows();
  }

  // This function neatly prints out the monetary total
  public String total() {
    if(digits[0] == 0) {
      return ("The total amount is $" + digits[1] + "." + digits[2] + digits[3]);
    }
    else {
    return ("The total amount is $" + digits[0] + digits[1] + "." + digits[2] + digits[3]);
    }
  }

  // This function returns the number of overflows
  public int number_of_overflows() {
    if(digits[0] >= 10) {
      digits[0] %= 10;
      overflow++;
    }
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
