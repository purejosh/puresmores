
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.puresmores.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PuresmoresModSounds {
	public static SoundEvent MARSHMALLOW_COOKING = SoundEvent.createVariableRangeEvent(new ResourceLocation("puresmores", "marshmallow_cooking"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("puresmores", "marshmallow_cooking"), MARSHMALLOW_COOKING);
	}
}
