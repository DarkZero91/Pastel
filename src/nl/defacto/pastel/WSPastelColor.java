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
	public int[] getHSB(String value) {
		int[] hsb = new int[3];
		
		pastel.generateColor(value);
		hsb[0] = Math.round(pastel.getHue() * 360);
		hsb[1] = Math.round(pastel.getSaturation() * 100);
		hsb[2] = Math.round(pastel.getLightness() * 100);
		
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
	
	/**
	 * Get the Hex value of the color associated with the string value.
	 * @param value
	 * @return Hex
	 */
	@WebMethod
	public String getHex(String value) {
		pastel.generateColor(value);
		return pastel.getHex();
	}
}
