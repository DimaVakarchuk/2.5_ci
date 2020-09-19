package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;
    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

@Test
  void findMin() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {15, 7, 8, 4, 5, 25, 8, 6, 17, 11, 15};
    long expected = 25;
    assertEquals(25, service.findMax(incomesInBillions));
  }
}