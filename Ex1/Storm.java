public class Storm {

    protected int intensity;

    public Storm(int i) {
	setIntensity(i);
    }

    public int getIntensity() {
	return intensity;
    }

    public void setIntensity(int i) {
	if (i > 10)
	    i = 10;
	else if (i < 0)
	    i = 0;
	intensity = i;
    }

    public String toString() {
	return "Storm: " + getIntensity();
    }

    public static void main(String[] args) {
	Storm a = new Storm(5);
	System.out.println("Should be \"Storm: 5\"      " + a);
	a.setIntensity(3);
	System.out.println("Should be \"Storm: 3\"      " + a);
	a.setIntensity(20);
	System.out.println("Tried setIntensity(20). Should be \"Storm: 10\"    " + a);
    }
    
}
