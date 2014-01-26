package nl.defacto.pastel;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WSPastelColor {
	private PastelColor pastel = new PastelColor();
	
	@WebMethod
	public float getHue(String value) {
		return pastel.getHue(value);
	}
	
	@WebMethod
	public float getSaturation(String value) {
		return pastel.getSaturation(value);
	}
	
	@WebMethod
	public float getLightness(String value) {
		return pastel.getLightness(value);
	}
	
	@WebMethod
	public int getRGB(String value) {
		return pastel.getRGB(value);
	}
	
	@WebMethod
	public int getRed(String value) {
		return pastel.getRed(value);
	}
	
	@WebMethod
	public int getGreen(String value) {
		return pastel.getGreen(value);
	}
	
	@WebMethod
	public int getBlue(String value) {
		return pastel.getBlue(value);
	}
	
	@WebMethod
	public int getAlpha(String value) {
		return pastel.getAlpha(value);
	}
}
