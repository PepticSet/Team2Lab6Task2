package ee.ut.math.tvt.Team2;

import org.apache.log4j.Logger;

public class Intro {
	private static final Logger log = Logger.getLogger(Intro.class);

	public static void main(String args[]) {
		final IntroUI ui = new IntroUI();
		ui.setVisible(true);

		log.info("SalesSystem started");
	}
}
