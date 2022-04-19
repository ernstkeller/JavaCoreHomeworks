package Lesson1;

public class Barrier extends Obstacle {
    private int height;

    public Barrier(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
