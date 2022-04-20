package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateAllSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateAllSales(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxMonth() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxMonth(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMinMonth() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinMonth(managerSales);
        assertEquals(expected,actual);
    }

    @Test
    void findAvgSales(){
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvgSales(managerSales);
        assertEquals(expected,actual);
    }

    @Test
    void findAmountMonthUnderAvgSales(){
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findAmountMonthUnderAvgSales(managerSales);
        assertEquals(expected,actual);

    }
    @Test
    void findAmountMonthOverAvgSales(){
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findAmountMonthOverAvgSales(managerSales);
        assertEquals(expected,actual);

    }
}