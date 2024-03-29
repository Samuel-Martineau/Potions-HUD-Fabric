package me.smartineau;

import me.smartineau.config.ConfigManager;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Environment(EnvType.CLIENT)
public class PotionsHUDMod implements ModInitializer {

    public static final String MOD_ID = "potions_hud_fabric";
    public static final String MOD_NAME = "Potions HUD (Fabric)";
    public static Logger LOGGER = LogManager.getLogger();
    
    public static ConfigManager CONFIG_MANAGER;

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        CONFIG_MANAGER = new ConfigManager();
    }

}