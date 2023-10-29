package com.ankoki.byeolenchants.api.enchants;

import com.ankoki.byeolenchants.impl.EnchantBase;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

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
		this(name, version, true);
	}

	/**
	 * Creates a new custom enchant with the given name and version.
	 *
	 * @param name    the name of the enchant.
	 * @param version the version.
	 * @param config  whether to create the config ourselves or not.
	 */
	public CustomEnchant(String name, String version, boolean config) {
		super(name, version, config, EnchantPriority.LOW);
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
	 * Called when a block is broken with a tool/armour equipped with a level greater than 0.
	 *
	 * @param event the block break event.
	 * @param level the level of the enchantment for the player in the event.
	 */
	public void onBlockBreak(BlockBreakEvent event, int level) {}

	/**
	 * Called when an entity is hurt with armour equipped with a level greater than 0.
	 *
	 * @param event the entity damage event.
	 * @param level the level of the enchantment for the entity in the event.
	 */
	public void onEntityDamage(EntityDamageEvent event, int level) {}

	/**
	 * Called when an entity is hurt with a tool/armour equipped with a level greater than 0.
	 * This method is called when the attacker has armour or tool.
	 *
	 * @param event the entity damage by entity event.
	 * @param level the level of the enchantment for the entity in the event.
	 */
	public void onEntityDamageByEntityAttacker(EntityDamageByEntityEvent event, int level) {}

	/**
	 * Called when an entity is hurt with a tool/armour equipped with a level greater than 0.
	 * This method is called when the victim has the armour equipped.
	 *
	 * @param event the entity damage by entity event.
	 * @param level the level of the enchantment for the entity in the event.
	 */
	public void onEntityDamageByEntityVictim(EntityDamageByEntityEvent event, int level) {}

}
