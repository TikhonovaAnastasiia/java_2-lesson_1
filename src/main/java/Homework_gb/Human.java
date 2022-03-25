package Homework_gb;

public class Human implements Action {
    private String name;
    private int distanceRun;
    private int distanceJump;

    public Human(String name, int distanceRun, int distanceJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceJump = distanceJump;
    }

    @Override
    public void run() {
        System.out.println(this.name + " running " + this.distanceRun + " km.");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " jumping " + this.distanceRun + " m.");
    }

    @Override
    public int getRun() {
        return this.distanceRun;
    }

    @Override
    public int getJump() {
        return this.distanceJump;
    }
}
