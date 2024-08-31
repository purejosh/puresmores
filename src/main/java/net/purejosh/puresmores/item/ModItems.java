package net.purejosh.puresmores.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.purejosh.puresmores.PureSmores;
import net.purejosh.puresmores.component.type.ModFoodComponents;

public class ModItems {

	public static final Item GRAHAM_CRACKER = register("graham_cracker", new Item(new Item.Settings()
			.food(ModFoodComponents.GRAHAM_CRACKER)));
	public static final Item CHOCOLATE = register("chocolate", new Item(new Item.Settings()
			.food(ModFoodComponents.CHOCOLATE)));
	public static final Item MARSHMALLOW = register("marshmallow", new Item(new Item.Settings()
			.food(ModFoodComponents.MARSHMALLOW)));
	public static final Item TOASTED_MARSHMALLOW = register("toasted_marshmallow", new Item(new Item.Settings()
			.food(ModFoodComponents.TOASTED_MARSHMALLOW)));
	public static final Item SMORE = register("smore", new Item(new Item.Settings()
			.food(ModFoodComponents.SMORE)));

	// Helper method for registering an item.
	public static Item register(String id, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(PureSmores.MOD_ID, id), item);
	}

	// Class initializer called from the entrypoint.
	public static void init() {
	}
}
