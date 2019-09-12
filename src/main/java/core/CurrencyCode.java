package core;

import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CurrencyCode {
	static String getGeoValue(String ip, String name) throws Exception{
		
		String geo_url = "http://www.geoplugin.net/json.gp";
		JSONParser jp = new JSONParser();
		URL json = new URL (geo_url + "?ip=" + ip);
		BufferedReader in = new BufferedReader(new 
		InputStreamReader(json.openConnection().getInputStream()));
		JSONObject jo = (JSONObject) jp.parse(in);
		return (String) jo.get(name);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Country: \t\t" + 		getGeoValue("88.191.179.56","geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" + getGeoValue("88.191.179.56","geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t" + getGeoValue("88.191.179.56","geoplugin_currencySymbol_UTF8"));
		
		System.out.println("Country: \t\t" + 		getGeoValue("61.135.248.220","geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" + getGeoValue("61.135.248.220","geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t" + getGeoValue("61.135.248.220","geoplugin_currencySymbol_UTF8"));
		
		System.out.println("Country: \t\t" + 		getGeoValue("92.40.254.196","geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" + getGeoValue("92.40.254.196","geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t" + getGeoValue("92.40.254.196","geoplugin_currencySymbol_UTF8"));
		
		System.out.println("Country: \t\t" + 		getGeoValue("93.183.203.67","geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" + getGeoValue("93.183.203.67","geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t" + getGeoValue("93.183.203.67","geoplugin_currencySymbol_UTF8"));
		
		System.out.println("Country: \t\t" + 		getGeoValue("213.87.141.36","geoplugin_countryName"));
		System.out.println("Currency Code: \t\t" + getGeoValue("213.87.141.36","geoplugin_currencyCode"));
		System.out.println("Currency Symbol: \t" + getGeoValue("213.87.141.36","geoplugin_currencySymbol_UTF8"));
	}
}
