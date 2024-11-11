public class Sample3_8 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);

        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + car1.getNum() + "，汽油量是" + car1.getGas());
    }
}

class Car {
    int num;
    double gas;

    int getNum() {
        System.out.println("調查車號");
        return this.num;
    }

    double getGas() {
        System.out.println("調查汽油量");
        return this.gas;
    }

    void setNumGas(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + this.num + "，將汽油量設為" + this.gas);
    }
}