abstract class Shape {
    private double dim1;
    private double dim2;

    public Shape(double base, double height){
        dim1=base;
        dim2=height;

    }
    public void display(){
        System.out.println("Base: "+dim1+" Height: "+dim2);
    }
    abstract double area(); //abstract method so no definition
    public double getDim1(){
        return dim1;
    }
    public double getDim2(){
        return dim2;
    }
}
