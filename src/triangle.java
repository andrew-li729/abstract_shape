public class triangle extends Shape {
    public triangle(double b,double h){
        super(b,h);
    }

    public double area(){
        double area;
        area=(getDim1()*getDim2())/2;
        return area;
    }
}
