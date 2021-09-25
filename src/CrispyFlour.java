import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate nowDay=LocalDate.now();
        if(getExpiryDate().isBefore(nowDay.plusMonths(2))||getExpiryDate().isEqual(nowDay.plusMonths(2))){
            return getAmount()*60/100;
        }else if(getExpiryDate().isBefore(nowDay.plusMonths(4))||getExpiryDate().isEqual(nowDay.plusMonths(4))) {
            return getAmount()*80/100;
        }else {
            return getAmount()*95/100;
        }
    }
}
