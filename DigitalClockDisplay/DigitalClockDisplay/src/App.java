public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ClockDisplay clock = new ClockDisplay();

        for (int i = 0; i < 2*60; i++){
            System.out.println("The time is: " + clock.getTimeDisplay());
            clock.tick();
        }
    }
}
