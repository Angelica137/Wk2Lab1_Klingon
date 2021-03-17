
/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author Angelica Beristain
 * @version 17 March 2021
 */

// Import the Scanner class
import java.util.*;

public class KlingonShip {
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;

	// Put the displayKlingonDetails()and getDangerLevel() methods below.
	public void displayKlingonDetails() {
		// displays class attributes
		System.out.println(photonPower);
		System.out.println(threatFactor);
		System.out.println(cosmicProximity);
		System.out.println(getDangerLevel());

	}

	public double getDangerLevel() {
		// returns the danger level
		double dangerLevel;
		dangerLevel = (photonPower * threatFactor) / cosmicProximity;
		return dangerLevel;

	}

	public void promptSettings() {
		// promot for PhotonPower, threatFactor, cosmicProximity
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter photon power: ");
		photonPower = sc.nextDouble();
	}

}
