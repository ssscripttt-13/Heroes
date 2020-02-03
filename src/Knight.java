public class Knight extends Unit implements Guard {

    public Knight(String name) {
        super(name);
    }

    public String getName(String name) {
        return name;
    }

    public void attack() {
        System.out.println("Получай,сука!");

    }
    public void deffend(){


    }


    public void drunk() {

    }

    public void follow(Point p) {
        super.moveTo(p);
        System.out.println("Сесуриту прибыло");

    }

    public void kick() {

    }


}
