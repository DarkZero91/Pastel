package nl.defacto.pastel;

import java.awt.Color;
import java.util.Random;

public class PastelColor {
	private float hue, saturation, lightness;
	private Color color;
	
	public void generateColor(String value) {
		// HashCode is consistent: http://stackoverflow.com/questions/785091/consistency-of-hashcode-on-a-java-string
		// (unless the JVM running the webservice is running Java < v1.2, which is a bad idea in general)
		Random rand = new Random(value.hashCode());
		
		hue = rand.nextFloat();
		saturation = (rand.nextInt(2000) + 1000) / 10000f;
		lightness = 0.9f;
		
		color = Color.getHSBColor(hue, saturation, lightness);
	}
	
	// HSB
	
	public float getHue() {
		return hue;
	}
	
	public float getSaturation() {
		return saturation;
	}
	
	public float getLightness() {
		return lightness;
	}
	
	// RGB
	
	public int getRed() {
		return color.getRed();
	}
	
	public int getGreen() {
		return color.getGreen();
	}
	
	public int getBlue() {
		return color.getBlue();
	}
}
