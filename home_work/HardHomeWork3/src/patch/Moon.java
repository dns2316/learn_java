package patch;

/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Moon implements IPlanet {
	static String MOON = "moon";
	private static MOON moon;

	public static MOON getInstance() {
		if (moon == null){
			moon = new MOON();
		}
		return moon;
	}

	private MOON() {
	}
}
