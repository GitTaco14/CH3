public class Sample3_24 {
    public static void main(String[] args) {
        Car[] car1;
        car1 = new Car[3];

        for (int i = 0; i < 3; i++)
            car1[i] = new Car();

        car1[0].setCar(1234, 20.5);
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);

        for (int i = 0; i < 3; i++)
            car1[i].show();
    }
}

class Car {

    private int num;
    private double gas;

    public Car() {
        this.num = 0;
        this.gas = 0.0;
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
}