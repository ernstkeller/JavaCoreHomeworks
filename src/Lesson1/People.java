package Lesson1;

public class People implements Competitor {
    protected String name;

    protected int maxJumpHeight;

    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public People(String name, int maxJumpHeight) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул(а) через барьер");
        } else {
            System.out.println(name + " не смог(ла) перепрыгнуть через барьер и выбыл(а) из соревнования");
            active = false;
        }
    }

       @Override
    public void result() {
        System.out.println(name + ": " + active);
    }
}
