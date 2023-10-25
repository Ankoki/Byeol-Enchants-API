package com.ankoki.byeolenchants.impl;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class EnchantBase {

	/**
	 * Creates a new custom enchant with the given name and version.
	 *
	 * @param name    the name of the enchant.
	 * @param version the version.
	 */
	public EnchantBase(String name, String version) {}

	/**
	 * Creates a new custom enchant with the given name and version.
	 *
	 * @param name    the name of the enchant.
	 * @param version the version.
	 * @param config  whether to create the config ourselves or not. If this is true you must call <code>super.reloadConfig();</code> after.
	 */
	public EnchantBase(String name, String version, boolean config) {}

	/**
	 * Gets the name of this enchant.
	 *
	 * @return the name.
	 */
	public String getName() {
		return "";
	}

	/**
	 * Gets the version of this enchantment.
	 *
	 * @return the version.
	 */
	public String getVersion() {
		return "";
	}

	/**
	 * Gets the starting cost of this enchantment (0 - 1).
	 *
	 * @return the starting cost.
	 */
	public double getStartingCost() {
		return 0.0D;
	}

	/**
	 * Gets the max level of this enchant.
	 *
	 * @return the max level of this enchant.
	 */
	public int getMaxLevel() {
		return 0;
	}

	/**
	 * Whether this enchant uses allowed-materials or disallowed-enchants.
	 *
	 * @return true if allowed-enchants.
	 */
	public boolean useAllowed() {
		return false;
	}

	/**
	 * Gets the allowed materials this enchantment can go on.
	 *
	 * @return the allowed enchants.
	 */
	public List<Material> getAllowedMaterials() {
		return null;
	}

	/**
	 * Gets the disallowed materials this enchantment can go on.
	 *
	 * @return the disallowed enchants.
	 */
	public List<Material> getDisallowedMaterials() {
		return null;
	}

	/**
	 * Gets a list containing the name of worlds this enchant will not be triggered in.
	 *
	 * @return a list of the worlds.
	 */
	public List<String> getBlockedWorlds() {
		return null;
	}

	/**
	 * Initiates the configuration.
	 */
	private void reloadConfig() {}

	/**
	 * Loads the configuration of this enchant/
	 * This will be found in /plugins/Byeol-Enchants/enchants/$name.yml
	 * Please note all spaces will be removed for the name of the yml.
	 * If you would like to add your own configuration options, you will need to create the file before we do, containing all the necessary default options.
	 * If you do override this method, please call <code>super.loadConfig()</code> as well, so we can get the default options.
	 */
	public void loadConfig() {}

	/**
	 * Gets the configuration object of this enchant.
	 *
	 * @return the config.
	 */
	public FileConfiguration getConfig() {
		return null;
	}

	/**
	 * Checks if we can enchant the given item with this enchant.
	 *
	 * @param item the item to check.
	 * @return true if enchantable.
	 */
	public boolean canEnchant(ItemStack item) {
		return false;
	}

	/**
	 * Enchants the item with this enchant and the given level.
	 *
	 * @param item  the item to enchant.
	 * @param level the level.
	 * @return the modified ItemStack.
	 */
	public ItemStack enchant(ItemStack item, int level) {
		return null;
	}

	/**
	 * Gets the level of this enchantment across the player's current tool and armour.
	 *
	 * @param player the player.
	 * @return the total level of the enchantment across pieces, or 0 if none found.
	 */
	public int getLevel(Player player) {
		return 0;
	}

	/**
	 * Gets the level of an enchantment on an item.
	 *
	 * @param item the item to check on.
	 * @return the level of this enchant.
	 */
	public int getLevel(ItemStack item) {
		return 0;
	}

	/**
	 * Validates the compiled keys against the ones that are already stored.
	 * If any keys have been removed or added locally, they will be removed or added to the stored.
	 *
	 * @return true if any changes have been made.
	 */
	private boolean validateKeys() {
		return false;
	}

}
