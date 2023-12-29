package ru.mirea.lab4.circle;

public class Circle {
    private double diametr = 0;
    private double radius = 0;
    private double CDlina = 0;
    private double Spl = 0;

    public Circle(){}
    public Circle(double diametr){
        this.diametr = diametr;
        this.radius = diametr/2;
        this.CDlina = 2*3.14*radius;
        this.Spl = 3.14*Math.pow(radius, 2);
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Диаметр = "+diametr+"\nРадиус = "+radius+"\nДлина окружности = "+CDlina+"\nПлощадь окружности = "+Spl;
    }
}
