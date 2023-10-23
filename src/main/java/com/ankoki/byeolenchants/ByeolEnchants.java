package com.ankoki.byeolenchants;

import com.ankoki.byeolenchants.api.ByeolEnchantsAPI;
import com.ankoki.byeolenchants.config.impl.Config;
import com.ankoki.byeolenchants.config.impl.Messages;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main JavaPlugin class for Byeol-Enchants.
 */
public class ByeolEnchants extends JavaPlugin {

	private Config config;
	private Messages messages;
	private String version;
	private ByeolEnchantsAPI api;

	private static ByeolEnchants instance;

	/**
	 * Gets the instance of Byeol-Enchants.
	 *
	 * @return the current instance.
	 */
	public static ByeolEnchants getInstance() {
		return ByeolEnchants.instance;
	}

	/**
	 * Gets the API for Byeol-Enchants.
	 *
	 * @return the API.
	 */
	public ByeolEnchantsAPI getAPI() {
		return api;
	}

	/**
	 * Gets the config of the plugin.
	 *
	 * @return the configuration.
	 */
	public Config getConfiguration() {
		return this.config;
	}

	/**
	 * Gets the messages of the plugin.
	 *
	 * @return the messages.
	 */
	public Messages getMessages() {
		return this.messages;
	}

	/**
	 * Gets the minecraft version of the server.
	 *
	 * @return the minecraft version.
	 */
	public String getMinecraftVersion() {
		return "";
	}

	/**
	 * Gets the version of this plugin.
	 *
	 * @return the Byeol-Enchants version.
	 */
	public String getVersion() {
		return "";
	}

}
