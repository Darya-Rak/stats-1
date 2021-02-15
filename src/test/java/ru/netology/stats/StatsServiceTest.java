package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

   @Test
   void shouldSum() {
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      StatsService service = new StatsService();
      int expected = 180;
      int actual = service.sum(sales);
      assertEquals(expected, actual);
   }


   @Test
   void shouldAverage() {
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      StatsService service = new StatsService();

      assertEquals(15, service.evg(sales));
   }

   @Test
   void shouldReturnMonthWithMax() {
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      StatsService service = new StatsService();

      assertEquals(8, service.monthWithMax(sales));
   }

   @Test
   void shouldReturnMonthWithMin() {
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      StatsService service = new StatsService();

      assertEquals(9, service.monthWithMin(sales));


   }

   @Test
   void shouldReturnMonthWithLessThanAverage() {
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      StatsService service = new StatsService();

      assertEquals(5, service.monthCountLessThanAverage(sales));
   }

   @Test
   void shouldReturnMonthWithMoreThanAverage() {
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      StatsService service = new StatsService();

      assertEquals(5, service.monthCountMoreThanAverage(sales));
   }
}