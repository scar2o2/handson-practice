package financialForecaster;

public class FinancialForecast {
    public static double forecastValue(double currentValue,double growthRate,int years) {
        if (years == 0)return currentValue;
        return forecastValue(currentValue, growthRate, years - 1)* (1 + growthRate);
    }
    public static void main(String[] args) {
        double initialInvestment = 10000;
        double growthRate = 0.08;
        int years = 5;
        double futureValue = forecastValue(initialInvestment,growthRate,years);
        System.out.printf("Future value after %d years: ₹%.2f",years,futureValue);
    }
}