package slideDeckChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Example14MapTranslator {

	public static void main(String[] args) {

		Map<String, String> translator = new HashMap<String, String>();
		
		translator.put("Hello", "Hola");
		translator.put("Thanks", "Gracias");
		translator.put("Bye", "Adios");
		translator.put("Good Morning", "Buenos dias");
		
		System.out.println(translator.keySet());
		
		System.out.println(translator.get("Thanks"));
		System.out.println(translator.get("Hello"));
		
		System.out.println();
		System.out.println("No official set");
		System.out.println();
		
		for (String key : translator.keySet()) {
			System.out.println(key + " - " + translator.get(key));
		}
		
		System.out.println();
		System.out.println("Set created");
		System.out.println();
		
		Set<String> keysSet = translator.keySet();
		
		for (String key : keysSet) {
			System.out.println(key + " - " + translator.get(key));
		}
		
		
		
	}

}
