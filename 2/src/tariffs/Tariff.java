package tariffs;

public abstract class Tariff {
    private final String name;
    private final double monthlyFee;
    private final int numberOfClients;

    public Tariff(String name, double monthlyFee, int numberOfClients) {
        this.name = name;
        this.monthlyFee = monthlyFee;
        this.numberOfClients = numberOfClients;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return name + " Абонплата: " + monthlyFee + " грн. Клієнтів: " + numberOfClients;
    }
}