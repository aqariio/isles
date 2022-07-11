package aqario.isles;

import aqario.isles.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Isles implements ModInitializer {
	public static final String MODID = "isles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ItemInit.init();
	}
}
