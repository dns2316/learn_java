/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Moon implements IPlanet {
	private static Moon ourInstance = new Moon();

	public static Moon getInstance() {
		return ourInstance;
	}

	private Moon() {
	}
}
