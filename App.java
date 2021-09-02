public class App {
    public static void main(String[] args){
        HelloWorld myHelloWorld = new HelloWorld();
        myHelloWorld.sayHello();

        Factorizer fact = new Factorizer();
        fact.Factor();

        InterestCalculator IC = new InterestCalculator();
        IC.calc();

        LuckySevens LS = new LuckySevens();
        LS.run();

        RPS rps = new RPS();
        rps.run();
    }
}
