package sourceMap;

import java.util.Map;
import java.util.HashMap;

public class HashMapSource {

    //este método agrega las entradas necesarias para los simbolo de la interfaz
    public static Map<String, Integer> initHMap() {
        Map<String, Integer> asciiMap = new HashMap<>();
        
        //key= symbol || value=Ascii Code
        asciiMap.put("ñ", 164);
        asciiMap.put("Ñ", 165);
        asciiMap.put("@", 64);
        asciiMap.put("¿", 168);
        asciiMap.put("?", 63);
        asciiMap.put("¡", 173);
        asciiMap.put("!", 33);
        asciiMap.put(":", 58);
        asciiMap.put("/", 47);
        asciiMap.put("\\", 92);
        asciiMap.put(",", 44);
        asciiMap.put("'", 39);
        asciiMap.put("(", 40);
        asciiMap.put(")", 41);
        asciiMap.put("[", 91);
        asciiMap.put("]", 93);
        asciiMap.put("{", 123);
        asciiMap.put("}", 125);
        asciiMap.put("«", 174);
        asciiMap.put("»", 175);
        asciiMap.put("*", 42);
        asciiMap.put("^", 94);
        asciiMap.put("&", 38);
        asciiMap.put("#", 35);
        asciiMap.put("|", 124);
        asciiMap.put("°", 167);
        asciiMap.put("´", 239);
        asciiMap.put("¨", 249);
        asciiMap.put("-", 45);
        asciiMap.put("_", 95);
        asciiMap.put("$", 36);
        asciiMap.put("%", 37);
        asciiMap.put("=", 61);
        asciiMap.put(",,", 44);
        asciiMap.put(";", 59);
        asciiMap.put("`", 96);
        asciiMap.put("\"", 34);

        return asciiMap;
    }

}
