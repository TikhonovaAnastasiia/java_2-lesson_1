package Homework_gb;

public class Track extends Obstacle {
    private int number;
    private int length;
    public Track(String number, int length) {
        super(number);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean move(Action action) {
        System.out.println(super.getName() + " length " + this.length);
        action.run();
        if (getLength() <= action.getRun()) {
            System.out.println("successfully");
            return true;
        } else {
            System.out.println("unsuccessfully");
            return false;
        }
    }
}
