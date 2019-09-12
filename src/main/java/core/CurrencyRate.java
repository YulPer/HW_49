package core;

import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CurrencyRate {
	
	static String currencyRate (String pair_code) throws IOException, ParseException{
		String url_currconv = "http://free.currconv.com/api/v7/convert";
		String api_key = "233a24569b07a5404e59";
		JSONObject json = new JSONObject();
		JSONParser jp = new JSONParser();
		URL rate_url = new URL(url_currconv + "?q=" + pair_code + "&compact=ultra&apiKey=" + api_key );
		
		json = (JSONObject) jp.parse(new BufferedReader(
		new InputStreamReader(rate_url.openConnection().getInputStream())));
		return json.get(pair_code).toString();
	}


	public static void main(String[] args) throws IOException, ParseException {
		System.out.println("USD_EUR" + currencyRate("USD_EUR"));
		System.out.println("USD_CNY" + currencyRate("USD_CNY"));
		System.out.println("USD_GBP" + currencyRate("USD_GBP"));
		System.out.println("USD_UAH" + currencyRate("USD_UAH"));
		System.out.println("USD_RUB" + currencyRate("USD_RUB"));
		
	}
}
