
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.puresmores.init;

import net.purejosh.puresmores.procedures.MarshmallowStickLivingEntityIsHitWithItemProcedure;
import net.purejosh.puresmores.procedures.MarshmallowStickItemInHandTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PuresmoresModProcedures {
	public static void load() {
		new MarshmallowStickItemInHandTickProcedure();
		new MarshmallowStickLivingEntityIsHitWithItemProcedure();
	}
}
