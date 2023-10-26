package com.ankoki.byeolenchants.api.events;

import com.ankoki.byeolenchants.api.enchants.CustomEnchant;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.NotNull;

public class EnchantBlockBreakEvent extends BlockBreakEvent {

	private final CustomEnchant enchant;
	private final int level;

	/**
	 * Creates a new BlockBreakEvent with custom enchant linked.
	 *
	 * @param theBlock the block broken.
	 * @param player the player who broke it.
	 * @param level the level of the enchant.
	 */
	public EnchantBlockBreakEvent(@NotNull Block theBlock, @NotNull Player player, CustomEnchant enchant, int level) {
		super(theBlock, player);
		this.enchant = enchant;
		this.level = level;
	}

	/**
	 * Gets the enchant used to break this block.
	 *
	 * @return the enchant.
	 */
	public CustomEnchant getEnchant() {
		return enchant;
	}

	/**
	 * Gets the level of the enchant that broke this block.
	 *
	 * @return the level of the enchant.
	 */
	public int getLevel() {
		return level;
	}

}
