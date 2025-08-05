package BI3.Aulas;

public class Triangulo {
    public double A;
    public double B;
    public double C;

    public double  calcularArea(){
        double p = (A+B+C)/2;
        double area = Math.sqrt(p*(p-A)*(p-B)*(p-C));
        return area;
    }
}
