package net.purejosh.puresmores.component.type;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();
    public static final FoodComponent GRAHAM_CRACKER = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();
    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SMORE = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.8f)
            .alwaysEdible()
            .build();
    public static final FoodComponent TOASTED_MARSHMALLOW = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();
}