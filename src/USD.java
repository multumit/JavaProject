public class USD extends Coin  {


    private double value=3.52;

    @Override
    public double getvalue(){
        return value;
    }


    @Override
    public double calculate(double userinput){
        return userinput*getvalue();
    }




}
