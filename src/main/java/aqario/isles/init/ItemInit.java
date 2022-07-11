package aqario.isles.init;

import aqario.isles.Isles;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final Item SHURIKEN = registerItem("shuriken", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Register
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Isles.MODID, id), item);
    }

    public static void init() {
    }

}
