public class Sample3_7 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);
    }
}

class Car {
    int num;
    double gas;

    void setNumGas(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + this.num + "，將汽油量設為" + this.gas);
    }

    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}