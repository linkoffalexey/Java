package ru.example.lesson04;

public class Robot {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private Direction direction;
    private int x;
    private int y;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public Direction getDirection() {
        //System.out.println(direction);
        return direction;
    }

    public int getX() {
        // System.out.println(x);
        return x;
    }

    public int getY() {
        //System.out.println(y);
        return y;
    }

    public void turnLeft() {
        if (direction == Direction.UP) {
            direction = Direction.LEFT;

        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP;

        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;

        } else {
            direction = Direction.DOWN;
        }

    }

    public void turnRight() {
        if (direction == Direction.UP) {
            direction = Direction.RIGHT;

        } else if (direction == Direction.RIGHT) {
            direction = Direction.DOWN;

        } else if (direction == Direction.DOWN) {
            direction = Direction.LEFT;

        } else {
            direction = Direction.UP;
        }

    }

    public void stepForward() {
        if (direction == Direction.UP) {
            y = y + 1;

        } else if (direction == Direction.RIGHT) {
            x = x + 1;

        } else if (direction == Direction.DOWN) {
            y = y - 1;

        } else {
            x = x - 1;
        }


    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        robot.direction = Direction.UP;

        if (robot.getX() < toX) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }


    public static void main(String[] args) {
        Robot robot = new Robot(5, 5, Direction.DOWN);
        System.out.println("Текущее направление робота " + robot.getDirection());
        System.out.println("Координаты робота: " + "Х= " + robot.getX() + " Y= " + robot.getY());
        robot.stepForward();
        System.out.println("Текущее направление робота " + robot.getDirection());
        System.out.println("Координаты робота: " + "Х= " + robot.getX() + " Y= " + robot.getY());
        robot.turnRight();
        robot.stepForward();
        System.out.println("Текущее направление робота " + robot.getDirection());
        System.out.println("Координаты робота: " + "Х= " + robot.getX() + " Y= " + robot.getY());
        moveRobot(robot,-10,-10);
        System.out.println("Текущее направление робота " + robot.getDirection());
        System.out.println("Координаты робота: " + "Х= " + robot.getX() + " Y= " + robot.getY());

    }

}
