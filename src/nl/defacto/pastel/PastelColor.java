package nl.defacto.pastel;

import java.awt.Color;
import java.util.Random;

public class PastelColor {
	private float hue, saturation, lightness;
	
	private Color getColor(String value) {
		Random rand = new Random(value.hashCode());
		
		hue = rand.nextFloat();
		saturation = (rand.nextInt(2000) + 1000) / 10000f;
		lightness = 0.9f;
		
		return Color.getHSBColor(hue, saturation, lightness);
	}
	
	public float getHue(String value) {
		getColor(value);
		return hue;
	}
	
	public float getSaturation(String value) {
		getColor(value);
		return saturation;
	}
	
	public float getLightness(String value) {
		getColor(value);
		return lightness;
	}
	
	public int getRGB(String value) {
		Color c = getColor(value);
		return c.getRGB();
	}
	
	public int getRed(String value) {
		Color c = getColor(value);
		return c.getRed();
	}
	
	public int getGreen(String value) {
		Color c = getColor(value);
		return c.getGreen();
	}
	
	public int getBlue(String value) {
		Color c = getColor(value);
		return c.getBlue();
	}
	
	public int getAlpha(String value) {
		Color c = getColor(value);
		return c.getAlpha();
	}
}
