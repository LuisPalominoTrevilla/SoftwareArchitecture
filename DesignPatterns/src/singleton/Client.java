package singleton;

public class Client {
	public static void main(String[] args) {
		Preferences pref = null;
		pref = new Preferences();
		pref.setShareInfo(true);
		System.out.println(pref.toString());
	}
}
