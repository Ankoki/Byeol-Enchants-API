package com.ankoki.byeolenchants.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * The base for loading and reading a YamlConfiguration.
 * This will handle creating, reloading, saving, and validating keys against the local resources.
 */
public abstract class ConfigBase {

	/**
	 * Creates a new configuration base.
	 * This will automatically copy the default resource matching the parameter name, and call
	 * the {@link ConfigBase#loadFile()} method.
	 *
	 * @param name the file name in resources, including the file extension.
	 * @param plugin the plugin which owns this configuration.
	 */
	public ConfigBase(@NotNull String name, @NotNull Plugin plugin) {}

	/**
	 * This method will reload the configuration files.
	 */
	public void reload() {}

	/**
	 * Validates the compiled keys against the ones that are already stored.
	 * If any keys have been removed or added locally, they will be removed or added to the stored.
	 *
	 * @return true if any changes have been made.
	 */
	public boolean validateKeys() {
		return false;
	}

	/**
	 * Gets the name of this configuration.
	 *
	 * @return the name.
	 */
	public String getName() {
		return null;
	}

	/**
	 * Gets the owning plugin of this config.
	 *
	 * @return the plugin.
	 */
	@NotNull
	public Plugin getPlugin() {
		return null;
	}

	/**
	 * Gets the config object linked to this base.
	 *
	 * @return the file configuration.
	 */
	@NotNull
	public FileConfiguration getConfig() {
		return null;
	}

	/**
	 * Gets the file where this configuration is stored.
	 *
	 * @return the file.
	 */
	@NotNull
	public File getFile() {
		return null;
	}

	/**
	 * Saves the current configuration to the file.
	 * This will not throw an exception if one is caught.
	 * To control this, see {@link ConfigBase#saveConfig(boolean)}.
	 *
	 * @return whether the saving was successful or not.
	 */
	public boolean saveConfig() {
		return false;
	}

	/**
	 * Saves the current configuration to the file.
	 *
	 * @param throwException whether to print the exception (if thrown) or not.
	 * @return true if no exceptions were thrown.
	 */
	public boolean saveConfig(boolean throwException) {
		return false;
	}

	/**
	 * Loads all the values in your configuration file.
	 */
	public abstract void loadFile();

}
