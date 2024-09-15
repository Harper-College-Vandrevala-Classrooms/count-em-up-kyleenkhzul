package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGroceryCounter {

  GroceryCounter counter;

  @BeforeEach
  void setUp() {
    counter = new GroceryCounter();
  }

  @Test
  void itWorksForANewCounterGroceryCounterObject() {
    assertEquals(counter.total(), "The total amount is $0.00");
  }

  @Test
  void itWorksForCallingHundrethsFunction() {
    counter.hundreths();
    assertEquals(counter.total(), "The total amount is $0.01");
  }

  @Test
  void itWorksForCallingTenthsFunction() {
    counter.tenths();
    assertEquals(counter.total(), "The total amount is $0.10");
  }

  @Test
  void itWorksForCallingOnesFunction() {
    counter.ones();
    assertEquals(counter.total(), "The total amount is $1.00");
  }

  @Test
  void itWorksForCallingTensFunction() {
    counter.tens();
    assertEquals(counter.total(), "The total amount is $10.00");
  }

  @Test
  void itWorksForTwentyDollarsAndOneCent() {
    counter.tens();
    counter.tens();
    counter.hundreths();
    assertEquals(counter.total(), "The total amount is $20.01");
  }

  @Test 
  void itWorksForOverflowing() {
    for(int i = 0; i < 10; i++) {
      counter.tens();
    }
    assertEquals(counter.number_of_overflows(), 1);
  }

  @Test
  void itWorksForTwoOverFlowingAndTwentyDollarsAndFiftyCents() {
    for(int i = 0; i < 5; i++) {
      counter.tenths();
    }
    counter.tens();
    counter.tens();
    for(int i = 0; i < 20; i++) {
      counter.tens();
    }
    assertEquals(counter.number_of_overflows(), 2);
    assertEquals(counter.total(), "The total amount is $20.50");
  }

  @Test
  void itWorksForClearing() {
    counter.ones();
    counter.tens();
    counter.hundreths();
    counter.tenths();
    counter.clear();
    assertEquals(counter.total(), "The total amount is $0.00");
  }
}
