public class Main {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println("fan1 is: " + fan1.toString());
        System.out.println("fan2 is: " + fan2.toString());
    }
}
