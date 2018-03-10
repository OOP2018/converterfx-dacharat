package converter;

/**
 * Collect all length unit and value that meter is medium value.
 * 
 * @author Dacharat Pankong
 *
 */
public enum Length {
	METER(1),
	CENTIMETER(0.01),
	KILOMETER(1000),
	MILE(1609.344),
	FOOT(0.3048),
	WA(2),
	AU(149597870700.0);
	
	public final double value;
	
	/**
	 * Initialize Length.
	 * 
	 * @param value of Length unit.
	 */
	private Length(double value) {
		this.value = value;
	}
	
	/**
	 * Return value of Length unit.
	 * 
	 * @return value of Length unit.
	 */
	public double getValue() {
		return value;
	}
	
}
