package StructuralDesignPattern.FlyWeightPattern;
import java.util.HashMap;
import java.util.Map;
class FontFactory {
    private Map<String, Font> fonts = new HashMap<>();

    public Font getFont(String name, int size, boolean bold, boolean italic) {
        String key = name + size + bold + italic; // Unique key for each font
        if (!fonts.containsKey(key)) {
            fonts.put(key, new ConcreteFont(name, size, bold, italic));
        }
        return fonts.get(key);
    }
}
