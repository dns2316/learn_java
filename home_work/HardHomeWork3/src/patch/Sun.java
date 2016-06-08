package patch;

/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Sun implements IPlanet {
	static String SUN = "sun";
	private static SUN sun;

	public static SUN getInstance() {
		if (sun == null){
			sun = new SUN();
		}
		return sun;
	}

	private SUN() {
	}
}
