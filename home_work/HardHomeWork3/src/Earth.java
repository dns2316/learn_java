/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Earth implements IPlanet {
	private static Earth ourInstance = new Earth();

	public static Earth getInstance() {
		return ourInstance;
	}

	private Earth() {
	}
}
