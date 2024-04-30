/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.purejosh.puresmores;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.purejosh.puresmores.init.PuresmoresModSounds;
import net.purejosh.puresmores.init.PuresmoresModProcedures;
import net.purejosh.puresmores.init.PuresmoresModItems;

import net.fabricmc.api.ModInitializer;

public class PuresmoresMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "puresmores";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PuresmoresMod");

		PuresmoresModItems.load();

		PuresmoresModProcedures.load();

		PuresmoresModSounds.load();

	}
}
