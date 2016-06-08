/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Sun implements IPlanet {
	static String SUN = "sun";
	private static Sun ourInstance;

	public static Sun getInstance() {
		if (ourInstance == null){
			ourInstance = new Sun();
		}
		return ourInstance;
	}

	private Sun() {
	}
}
