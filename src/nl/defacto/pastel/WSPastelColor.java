package nl.defacto.pastel;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WSPastelColor {
	private PastelColor pastel = new PastelColor();
	
	/**
	 * Get the HSB values of the color associated with the string value.
	 * @param value
	 * @return HSB
	 */
	@WebMethod
	public float[] getHSB(String value) {
		float[] hsb = new float[3];
		
		pastel.generateColor(value);
		hsb[0] = pastel.getHue() * 360;
		hsb[1] = pastel.getSaturation() * 100;
		hsb[2] = pastel.getLightness() * 100;
		
		return hsb;
	}
	
	/**
	 * Get the RGB values of the color associated with the string value.
	 * @param value
	 * @return RGB
	 */
	@WebMethod
	public int[] getRGB(String value) {
		int[] rgb = new int[3];
		
		pastel.generateColor(value);
		rgb[0] = pastel.getRed();
		rgb[1] = pastel.getGreen();
		rgb[2] = pastel.getBlue();
		
		return rgb;
	}
}
