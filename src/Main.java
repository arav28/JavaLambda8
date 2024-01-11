public class Main {

    public void greet(Greeting greeting){
            greeting.perform();
    }
    public static void main(String[] args) {
        Main main = new Main();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        BooWorldGreeting booWorldGreeting = new BooWorldGreeting();
        main.greet(helloWorldGreeting);
        Greeting lambdaGreet = () -> System.out.println("lambda");
        main.greet(booWorldGreeting);

       lambdaGreet.perform();
    }
}