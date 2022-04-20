package ru.netology.stats;

public class StatsService {


    public int calculateAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvgSales(int[] sales) {
        return calculateAllSales(sales) / sales.length;
    }

    public int findMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int findMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int findAmountMonthUnderAvgSales(int[] sales) {
        int amountMonth = 0;
        for (int sale : sales) {
            if (sale < findAvgSales(sales)) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int findAmountMonthOverAvgSales(int[] sales) {
        int amountMonth = 0;
        for (int sale : sales) {
            if (sale > findAvgSales(sales)) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}







