public class Sample3_15 {
    public static void main(String[] args) {
        Car.showSum();

        Car car1;
        car1 = new Car();
        car1.setCar(1234, 20.5);

        Car.showSum();

        Car car2;
        car2 = new Car();
        car2.setCar(4567, 30.5);
    }
}

class Car {
    public static int sum = 0;

    private int num;
    private double gas;

    public Car() {
        this.num = 0;
        this.gas = 0.0;
        sum++;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    public static void showSum() {
        System.out.println("車子總共有" + Car.sum + "台");
    }
}