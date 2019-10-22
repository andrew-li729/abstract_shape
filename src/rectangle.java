public class rectangle extends Shape{
    public rectangle(double l, double w){
        super(l,w);
    }
    public double area(){
        double d1,d2,area;
        d1=getDim1();
        d2=getDim2();
        area=d1*d2;
        //area=getDim1()*getDim2();
        return area;
    }
}
