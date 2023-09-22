/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.puresmores.init;

import net.purejosh.puresmores.item.ToastedMarshmallowItem;
import net.purejosh.puresmores.item.SmoreItem;
import net.purejosh.puresmores.item.MarshmallowItem;
import net.purejosh.puresmores.item.GrahamCrackerItem;
import net.purejosh.puresmores.item.ChocolateItem;
import net.purejosh.puresmores.PuresmoresMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PuresmoresModItems {
	public static Item GRAHAM_CRACKER;
	public static Item CHOCOLATE;
	public static Item MARSHMALLOW;
	public static Item TOASTED_MARSHMALLOW;
	public static Item SMORE;

	public static void load() {
		GRAHAM_CRACKER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PuresmoresMod.MODID, "graham_cracker"), new GrahamCrackerItem());
		CHOCOLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PuresmoresMod.MODID, "chocolate"), new ChocolateItem());
		MARSHMALLOW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PuresmoresMod.MODID, "marshmallow"), new MarshmallowItem());
		TOASTED_MARSHMALLOW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PuresmoresMod.MODID, "toasted_marshmallow"), new ToastedMarshmallowItem());
		SMORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PuresmoresMod.MODID, "smore"), new SmoreItem());
	}

	public static void clientLoad() {
	}
}
