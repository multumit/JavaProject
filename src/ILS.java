public class ILS extends Coin {

   final private double value = 0.28;

    @Override
    public double getvalue() {
        return value;
    }


    @Override
    public double calculate(double input) {
        return input * getvalue();
    }


}
