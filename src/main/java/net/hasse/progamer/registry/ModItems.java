package net.hasse.progamer.registry;

import net.hasse.progamer.ProGamer;
import net.hasse.progamer.items.HasseMusicItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.hasse.progamer.sounds.ModSounds;

public class ModItems {

    public static final HasseMusicItem HASSE = new HasseMusicItem(1, ModSounds.HASSE_MUSIC, new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item BLACK_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE).fireproof());
    public static final HasseMusicItem BLACK_MUSIC_DISC = new HasseMusicItem(1, ModSounds.BLACK_MUSIC, new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.EPIC).maxCount(1));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ProGamer.MOD_ID, "hasse"), HASSE);
        Registry.register(Registry.ITEM, new Identifier(ProGamer.MOD_ID, "black_diamond"), BLACK_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(ProGamer.MOD_ID, "black_music_disc"), BLACK_MUSIC_DISC);
    }

}
