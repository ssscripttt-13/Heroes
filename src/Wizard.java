public class Wizard extends Unit implements Writter {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void write() {
        double r = Math.random();
        String text = (Math.random() > 0.5) ? "Хм..., видимо важно, запишу." : "WTF!";
        System.out.println(getName() + ": " + text);
    }

    @Override
    public void follow() {
        //...
    }
}
