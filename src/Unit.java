public class Unit {
    private String name;
    private int health;
    private int power;
    private Point position;

    public Unit(String name, Point p) {
        this.name = name;
        position = p;
    }

    public Unit(String name) {
        this(name, new Point(1, 1));
    }

    public Unit() {
        this("Неопознанный чужестранец");
    }

    public String getName() {
        return name;
    }

    public void moveTo(Point p) {
        System.out.println(String.format("%s перемещается на %s", this.getName(), p));
    }
}
