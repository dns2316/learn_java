/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Moon implements IPlanet {
	static String EARTH = "earth";
	private static EARTH earth;

	public static EARTH getInstance() {
		if (earth == null){
			earth = new EARTH();
		}
		return earth;
	}

	private EARTH() {
	}
}
