package net.hasse.progamer;

import net.fabricmc.api.ModInitializer;
import net.hasse.progamer.registry.ModItems;
import net.hasse.progamer.sounds.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProGamer implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("modid");

	public static final String MOD_ID = "progamer";

	@Override
	public void onInitialize() {

		ModItems.registerItems();

		ModSounds.registerSounds();

		LOGGER.info("Hello Fabric world!");


	}
}
