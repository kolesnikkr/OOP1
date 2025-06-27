package tariffs;

public class Basic extends Tariff {
    private final int callMinutes;

    public Basic(String name, double monthlyFee, int numberOfClients, int callMinutes) {
        super(name, monthlyFee, numberOfClients);
        this.callMinutes = callMinutes;
    }

    @Override
    public String getDetails() {
        return "Базовий тариф: " + getName() + ", Хвилин дзвінків: " + callMinutes;
    }
}