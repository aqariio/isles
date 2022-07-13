package aqario.isles;

import aqario.isles.entity.ShurikenEntity;
import aqario.isles.item.ShurikenItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Isles implements ModInitializer {
	public static final String MODID = "isles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


	// Items
	public static final Item SHURIKEN = registerItem("shuriken", new ShurikenItem(ToolMaterials.NETHERITE, -3, -1.5f, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

	// Register
	private static Item registerItem(String id, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Isles.MODID, id), item);
	}


	// Entities
	public static final EntityType<ShurikenEntity> SHURIKEN_ENTITY = Registry.register(
			Registry.ENTITY_TYPE, new Identifier(MODID, "shuriken"),
			FabricEntityTypeBuilder.<ShurikenEntity>create(SpawnGroup.MISC, ShurikenEntity::new)
					.dimensions(EntityDimensions.fixed(0.5F, 0.5F))
					.trackRangeBlocks(4).trackedUpdateRate(20)
					.build());


	// Sounds
	public static SoundEvent ITEM_SHURIKEN_HIT = new SoundEvent(new Identifier(MODID, "item.shuriken.hit"));

	@Override
	public void onInitialize() {
	}
}
