package PackagePlanets;

public class Star extends StarSystem{
	
	double brightness;
	double radius;
	String starName;
	
	
	//Star - returns the name of the star, the radius, the brightness of the glow
	
	public void setStarInfo(double brightness, double radius, String name) {
		this.brightness = brightness;
		this.radius = radius;
		this.starName = name;
	}
	
	public void getStarInfo(double brightness, double radius, String name) {
		System.out.println(brightness + " " + radius + " " + name);
	}
	
	public void setStarName(String starName) {
		this.starName = starName;
	}

	public String getStarName() {
		return starName;
	}
	
	public String getSystemName() {
		return super.systemName;
	}
	
	/*Один из классов на выбор должен содержать перегруженные 
	 * связанные друг с другом конструкторы и создаваться с их помощью.
	 */
	

    public Star (double brightness, double radius, String starName) {
		this(starName);
    	this.brightness = brightness;
		this.radius = radius;
	}
    
    public Star (String starName) {
    	this.starName = starName;
		
	}

	@Override
	public void ufo() {
		System.out.println("Piu-piu! UFO planted on the star!");
		
	}

	@Override
	public double sphereArea() {
		return radius*radius*3.14*4;
	}
}
