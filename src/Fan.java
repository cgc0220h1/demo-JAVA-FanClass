public class Fan {
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.status;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        if (this.status) {
            return this.speed + " " + this.color + " " + this.radius;
        } else {
            return  this.color + " " + this.radius + " " + "fan is off";
        }
    }
}
