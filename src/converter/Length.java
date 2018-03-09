package converter;

public enum Length {
	METER(1),
	CENTIMETER(0.01),
	KILOMETER(1000),
	MILE(1609.344),
	FOOT(0.3048),
	WA(2),
	AU(1495978707E2);
	
	public final double value;
	
	private Length(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
}
