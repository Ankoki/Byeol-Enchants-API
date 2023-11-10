package com.ankoki.byeolenchants.api.currency;

import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public class CurrencyHandler {

	/**
	 * Loads a player's currency from storage.
	 *
	 * @param player the player to load.
	 */
	public void loadPlayer(Player player) {}

	/**
	 * Gets the amount of currency that the player has.
	 *
	 * @param player the player to check.
	 * @return the amount of currency they have.
	 */
	public double getCurrency(OfflinePlayer player) {
		return 0.0D;
	}

	/**
	 * Sets the currency of the player.
	 *
	 * @param player the player to set it for.
	 * @param amount the amount.
	 */
	public void setCurrency(OfflinePlayer player, double amount) {}

	/**
	 * Sets the currency of the player.
	 *
	 * @param player the player to set it for.
	 * @param amount the amount.
	 * @param log whether to log this transaction in console.
	 */
	public void setCurrency(OfflinePlayer player, double amount, boolean log) {}

	/**
	 * Sets the currency of the player.
	 *
	 * @param player the player to set it for.
	 * @param amount the amount.
	 * @param log whether to log this transaction in console.
	 * @param executor the player who changed this, or null if console.
	 */
	public void setCurrency(OfflinePlayer player, double amount, boolean log, @Nullable Player executor) {}

	/**
	 * Adds to the currency of the player.
	 *
	 * @param player the player to add to.
	 * @param amount the amount to add.
	 */
	public void addCurrency(OfflinePlayer player, double amount) {}

	/**
	 * Adds to the currency of the player.
	 *
	 * @param player the player to add to.
	 * @param amount the amount to add.
	 * @param log whether to log this transaction in console.
	 */
	public void addCurrency(OfflinePlayer player, double amount, boolean log) {}

	/**
	 * Adds to the currency of the player.
	 *
	 * @param player the player to add to.
	 * @param amount the amount to add.
	 * @param log whether to log this transaction in console.
	 * @param executor the player who changed this, or null if console.
	 */
	public void addCurrency(OfflinePlayer player, double amount, boolean log, @Nullable Player executor) {}

	/**
	 * Removes from the currency of the player.
	 *
	 * @param player the player to remove from.
	 * @param amount the amount to remove.
	 */
	public void removeCurrency(OfflinePlayer player, double amount) {}

	/**
	 * Removes from the currency of the player.
	 *
	 * @param player the player to remove from.
	 * @param amount the amount to remove.
	 * @param log whether to log this transaction in console.
	 */
	public void removeCurrency(OfflinePlayer player, double amount, boolean log) {}

	/**
	 * Removes from the currency of the player.
	 *
	 * @param player the player to remove from.
	 * @param amount the amount to remove.
	 * @param log whether to log this transaction in console.
	 * @param executor the player who changed this, or null if console.
	 */
	public void removeCurrency(OfflinePlayer player, double amount, boolean log, @Nullable Player executor) {}

	/**
	 * Gets a configuration file from a player.
	 *
	 * @param player the player to look for.
	 * @param create whether to create it if not found.
	 * @return the configuration, or null if it doesn't exist.
	 */
	@Nullable
	private FileConfiguration getConfigFrom(OfflinePlayer player, boolean create) {
		return null;
	}

}
