package DesafiosExtras.HashMap;

import java.util.HashMap;
import java.util.Map;

public class AppSettings {
    public static void main(String[] args) {
        Map<String, String> settings = new HashMap<>();
        settings.put("theme","dark");
        settings.put("language","English");
        settings.put("notifications","enabled");
        
        // Acessar uma configuração
        System.out.println("Current theme: " + settings.get("theme"));
    }
}
