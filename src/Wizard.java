public class Wizard extends Unit implements Writter, Guard {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void write() {
        double r = Math.random();
       if(r>0.5){
           System.out.println("Опять писать");
       }
       else System.out.println("Нормально сказал,дядя");
    }

    public void follow(Point p) {
        super.moveTo(p);
        System.out.println("АСТАНАВИСЬ");

    }


    public void attack() {
        System.out.println("");

    }
    public void deffend(){
        System.out.println("Галина стоп!");

    }


    public void drunk() {

    }


    public void kick() {

    }
}
