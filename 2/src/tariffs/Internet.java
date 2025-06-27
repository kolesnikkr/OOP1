package tariffs;

public class Internet extends Tariff {
    private final int dataLimit;

    public Internet(String name, double monthlyFee, int numberOfClients, int dataLimit) {
        super(name, monthlyFee, numberOfClients);
        this.dataLimit = dataLimit;
    }

    @Override
    public String getDetails() {
        return "Інтернет-тариф: " + getName() + ", Ліміт даних: " + dataLimit + " ГБ";
    }
}