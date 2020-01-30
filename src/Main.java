public class Main {

    public static void main(String[] args) {
    	King king = new King("Кимарк");
    	Wizard wizard = new Wizard("Пендальф");

    	king.setWritter(wizard);

	    king.saySomething();
	    king.saySomething();
	    king.callSecurity();

	    Point p = new Point(2, 5);
	    king.moveTo(p);
    }
}
