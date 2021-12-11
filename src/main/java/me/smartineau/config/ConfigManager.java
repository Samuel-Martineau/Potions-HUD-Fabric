package me.smartineau.config;

import me.smartineau.PotionsHUDMod;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ConfigManager {
    public SimpleConfig CONFIG;
    
    public final int X_OFFSET;
    public final int Y_OFFSET;
    
    public ConfigManager() {
        CONFIG = SimpleConfig.of("Potions-HUD").provider(this::provider).request();
    
        X_OFFSET = CONFIG.getOrDefault("x-offset", 3);
        Y_OFFSET = CONFIG.getOrDefault("y-offset", 3);
    }
    
    private String provider(String filename) {
        InputStream in = PotionsHUDMod.class.getClassLoader().getResourceAsStream("assets/potions_hud_fabric/Potions-HUD.properties");
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        
        return input.lines().collect(Collectors.joining("\n"));
    }
}