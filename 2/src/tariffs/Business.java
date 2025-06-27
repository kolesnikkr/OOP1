package tariffs;

public class Business extends Tariff {
    private final int numberOfLines;

    public Business(String name, double monthlyFee, int numberOfClients, int numberOfLines) {
        super(name, monthlyFee, numberOfClients);
        this.numberOfLines = numberOfLines;
    }

    @Override
    public String getDetails() {
        return "Бізнес тариф: " + getName() + ", Ліній: " + numberOfLines;
    }
}
