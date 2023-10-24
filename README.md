# Byeol-Enchants-API
The front-facing API for Byeol-Enchants.

Byeol-Enchants is a Custom Enchantment plugin, allowing you to create your own custom enchants for Minecraft.  
Currently, these are only able to be added to the tool through the API, commands, or Skript, however support for enchantment tables is planned for the future.

## Skript Integration  
Byeol-Enchants will automatically hook into [Skript](https://www.github.com/SkriptLang/Skript) if found on the server and the configuration option `enable-skript-hook` is set to true.  
Skript documentation will be found on the [skUnity documentation](https://docs.skunity.com) once this plugin is live.  

## API Usage  

## Import
This repo contains the API, with empty methods.  
You **should not** implement this API into your plugin, as it will not work and cause issues.  
You can either clone this repo and add the compiled jar to your build path, or use either Maven or Gradle as follows.  
### GRADLE  
```gradle
repositories {
    mavenCentral()
    maven { url 'https://hat.lordoftherin.gs/releases/' }
}

dependencies {
    compileOnly 'com.ankoki:Byeol-Enchants-API:1.0'
}
```
### MAVEN  
```xml
<repository>
    <id>Byeol-Enchants-API</id>
    <url>https://hat.lordoftherin.gs/releases/</url>
</repository>
```
```xml
<dependency>
    <groupId>com.ankoki</groupId>
    <artifactId>Byeol-Enchants-API</artifactId>
    <version>1.0</version>
    <scope>provided</scope>
</dependency>
```  
## Usage  
Creating your own custom enchant is super simple. I know every API says this, but I actually mean this.  
You only need to extend `com.ankoki.byeolenchants.api.enchants.CustomEnchant`, and you're all set!  
```java
package com.ankoki.benchants;

import com.ankoki.byeolenchants.api.enchants.CustomEnchant;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.NotNull;

public class Information extends CustomEnchant {

	public Information() {
		// Call to super using the name of the enchant, and the version.
		// The version is mainly useless, however it is a safety net for if you have registered the same enchant twice.
		super("Information", "1.0");
		// The call to super has registered the enchant for you, no need to do anything else!
	}

	@Override
	public void onBlockBreak(BlockBreakEvent event, int level) {
		assert level >= 1; // This only gets called if the player's tool has the enchant, no need to check yourself! No need to assert, this is just for demonstration.
		event.setCancelled(true);
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Material type = event.getBlock().getType();
		player.sendMessage("§e§l৺ §7Block Information:");
		player.sendMessage("§e§l | §7Type: " + type);
		if (level >= 2)
			player.sendMessage("§e§l | §7Location: " + this.format(block.getLocation()));
		if (level >= 3)
			player.sendMessage("§e§l | §7Light Level: " + block.getLightLevel());
	}

	private String format(@NotNull Location location) {
		return location.getX() + ", " + location.getY() + ", " + location.getZ() + ", " + location.getWorld().getName();
	}

}
```
This is a very simple example, however you can do anything you like here!  
There are also other things you can override and edit.  
```java
public double getCost(int level) {
    return this.getStartingCost() * Math.pow(1.1D, (double) level);
}
```
This is the cost to upgrade to the level given. You can override this and provide your own equation to get the cost.  
### CONFIGURATION  
These are all provided in the enchant configuration which is created for your enchant, however you can edit it at runtime if wanted.  
  
The starting cost of an enchant.
```java
public double getStartingCost();  
```
The maximum level of an enchant.  
```java
public int getMaxLevel();  
```
Whether to use allowed materials or disallowed materials.  
```java
public boolean useAllowed();  
```
The materials allowed to be enchanted.  
```java
public List<Material> getAllowedMaterials();
```
The materials that aren't allowed to be enchanted.  
```java
public List<Material> getDisallowedMaterials();
```
Names of worlds this enchant cannot be used in.  
```java
public List<String> getBlockedWorlds();
```
There are more methods provided, however we recommend you don't override them as they use unaccessible classes.  
