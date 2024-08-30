package net.purejosh.puresmores.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ModItemGroups {
    public static void init() {
        // ModItems sorting
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.CAKE.getDefaultStack(), ModItems.CHOCOLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.CHOCOLATE.getDefaultStack(), ModItems.GRAHAM_CRACKER.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.GRAHAM_CRACKER.getDefaultStack(), ModItems.MARSHMALLOW.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.MARSHMALLOW.getDefaultStack(), ModItems.SMORE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.SMORE.getDefaultStack(), ModItems.TOASTED_MARSHMALLOW.getDefaultStack()));
    }
}
