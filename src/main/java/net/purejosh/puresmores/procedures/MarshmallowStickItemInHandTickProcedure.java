package net.purejosh.puresmores.procedures;

import net.purejosh.puresmores.init.PuresmoresModSounds;
import net.purejosh.puresmores.init.PuresmoresModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class MarshmallowStickItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(
				new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity)).getBlockPos().getX(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity)).getBlockPos().getY(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity)).getBlockPos().getZ())))
				.is(TagKey.create(Registries.BLOCK, new ResourceLocation("puresmores:heat_source")))) {
			itemstack.getOrCreateTag().putDouble("timeHeated", (itemstack.getOrCreateTag().getDouble("timeHeated") + 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), PuresmoresModSounds.MARSHMALLOW_COOKING, SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(RandomSource.create(), 0.6, 1));
				} else {
					_level.playLocalSound(x, y, z, PuresmoresModSounds.MARSHMALLOW_COOKING, SoundSource.PLAYERS, (float) 0.5, (float) Mth.nextDouble(RandomSource.create(), 0.6, 1), false);
				}
			}
			if (itemstack.getOrCreateTag().getDouble("timeHeated") == 120) {
				itemstack.shrink(1);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PuresmoresModItems.TOASTED_MARSHMALLOW);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.STICK);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			}
		}
	}
}
