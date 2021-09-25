import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate nowDay=LocalDate.now();
        if(getExpiryDate().isAfter(nowDay.plusDays(3))||getExpiryDate().isEqual(nowDay.plusDays(3))){
            return getAmount()*50/100;
        }else if(getExpiryDate().isAfter(nowDay.plusDays(5))||getExpiryDate().isEqual(nowDay.plusDays(5))) {
            return getAmount()*70/100;
        }else {
            return getAmount()*90/100;
        }
    }
}
