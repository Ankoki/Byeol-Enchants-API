package com.ankoki.byeolenchants.api.enchants;

import com.ankoki.byeolenchants.impl.EnchantBase;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * Class to extend to create a custom enchantment.
 */
public abstract class CustomEnchant extends EnchantBase {

	/**
	 * Creates a new custom enchant with the given name and version.
	 *
	 * @param name    the name of the enchant.
	 * @param version the version.
	 */
	public CustomEnchant(String name, String version) {
		super(name, version);
	}

	/**
	 * Gets the cost of this enchant based on the level given.
	 * This will not be valid for level 1, as starting cost will be given.
	 * This can be overridden to provide your own formula per enchant.
	 *
	 * @param level the new level.
	 * @return the cost.
	 */
	public double getCost(int level) {
		return this.getStartingCost() * (Math.pow(1.1, level));
	}

	/**
	 * Called when a block is broken with a tool/armour with a level greater than 0.
	 *
	 * @param event the block break event.
	 * @param level the level of the enchantment for the player in the event.
	 */
	public abstract void onBlockBreak(BlockBreakEvent event, int level);

}
