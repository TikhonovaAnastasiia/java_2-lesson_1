package Homework_gb;

public class Wall extends Obstacle {
    private int number;
    private int height;

    public Wall(String number, int height) {
        super(number);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean move(Action action) {
        System.out.println(super.getName() + " height " + this.height);
        action.run();
        if (getHeight() <= action.getJump()) {
            System.out.println("successfully");
            return true;
        } else {
            System.out.println("unsuccessfully");
            return false;
        }
    }
}
