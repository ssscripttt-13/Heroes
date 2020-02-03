public class Main {

    public static void main(String[] args) {
    	King king = new King("Наруто");
    	Wizard wizard = new Wizard("Анаальф");
    	Dragon dragon =new Dragon("Саске");
    	Knight knight = new Knight("БОРОДАЧ");

    	king.setWritter(wizard);
    	king.setGuard(knight);

	    king.saySomething();
	    king.saySomething();
	    king.callSecurity();


	    Point p = new Point(2, 5);
	    king.moveTo(p);
    }
}
