package net.hasse.progamer.registry;

import net.hasse.progamer.ProGamer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HASSE = new Item(new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ProGamer.MOD_ID, "hasse"), HASSE);
    }

}
