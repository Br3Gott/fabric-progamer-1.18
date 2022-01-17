package net.hasse.progamer.sounds;


import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.hasse.progamer.ProGamer;

public class ModSounds {
    public static SoundEvent BLACK_MUSIC = registerSoundEvent("black_music");
    public static SoundEvent HASSE_MUSIC = registerSoundEvent("hasse_music");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ProGamer.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering ModSounds for " + ProGamer.MOD_ID);
    }
}
