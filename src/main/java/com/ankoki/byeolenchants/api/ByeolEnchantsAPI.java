package com.ankoki.byeolenchants.api;

import com.ankoki.byeolenchants.api.enchants.CustomEnchant;
import com.ankoki.byeolenchants.api.currency.CurrencyHandler;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ByeolEnchantsAPI {

	/**
	 * Gets the level of an enchantment across the player's current tool and armour.
	 *
	 * @param enchant the name of the enchant to search for.
	 * @param player the player.
	 * @return the total level of the enchantment across pieces, or 0 if none found.
	 */
	public abstract int getLevel(String enchant, Player player);

	/**
	 * Enchants the item with the enchant and level.
	 *
	 * @param item the item to enchant.
	 * @param enchant the name of the enchant.
	 * @param level the level.
	 * @return the modified ItemStack.
	 */
	public abstract ItemStack enchant(ItemStack item, String enchant, int level);

	/**
	 * Withdraws an amount of currency from a player's balance and converts it into a redeemable item.
	 *
	 * @param player the player to withdraw from.
	 * @param amount the amount to withdraw.
	 * @return the item, or null if the player doesn't have enough currency.
	 */
	@Nullable
	public abstract ItemStack withdraw(Player player, double amount);

	/**
	 * Gets all the registered enchants.
	 *
	 * @return the enchants.
	 */
	public abstract CustomEnchant[] getRegisteredEnchants();

	/**
	 * Registers your custom enchant with Byeol-Enchants.
	 * This must be done every startup.
	 *
	 * @param enchant the enchant to register.
	 * @return the registration response.
	 */
	public abstract RegistrationResponse registerEnchant(CustomEnchant enchant);

	/**
	 * Gets an enchant by its name.
	 *
	 * @param name the name of the enchant to look for.
	 * @return the enchant object, or null if not found.
	 */
	@Nullable
	public abstract CustomEnchant getEnchant(String name);

	/**
	 * Gets all registered enchants.
	 *
	 * @return the registered enchants.
	 */
	public abstract CustomEnchant[] getEnchants();

	/**
	 * Gets the currency handler of the plugin.
	 *
	 * @return the currency handler.
	 */
	@NotNull
	public abstract CurrencyHandler getCurrencyHandler();

	/**
	 * Gets the plugin that owns this API object.
	 * This is so developers can use a JavaPlugin instance without declaring their own.
	 *
	 * @return the java plugin.
	 */
	public abstract JavaPlugin getOwningPlugin();

	/**
	 * Wipes the current API instance of enchants.
	 * Used for reloading.
	 *
	 * @param command true if ran by a command. This is used so we don't wipe skript registered enchants.
	 */
	public abstract void wipe(boolean command);

	/**
	 * The responses for enchantment registration.
	 */
	public enum RegistrationResponse {
		/**
		 * Already registered, cannot be updated.
		 */
		ALREADY_REGISTERED,
		/**
		 * Already registered, however the version is newer and was replaced.
		 */
		DIFFERENT_VERSION_ALLOWED,
		/**
		 * Already registered, however the version is older than the current one.
		 */
		DIFFERENT_VERSION_DENIED,
		/**
		 * Allowed to be registered.
		 */
		ALLOWED;
	}

}
