/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Nov 1, 2014, 6:22:54 PM (GMT)]
 */
package vazkii.botania.api.brew;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import scala.actors.threadpool.Arrays;
import vazkii.botania.api.BotaniaAPI;

/**
 * The class for a Brew definition, each one is a singleton.
 */
public class Brew {

	String key;
	String name;
	int color;
	int cost;
	List<PotionEffect> effects;
	
	/**
	 * @param name The unlocalized name of this potion.
	 * @param color The color for the potion to be rendered in the bottle, note that it will get
	 * changed a bit when it renders (for more or less brightness) to give a fancy effect.
	 * @param cost The cost, in Mana for this brew.
	 * @param effects A list of effects to apply to the player when they drink it.
	 */
	public Brew(String key, String name, int color, int cost, PotionEffect... effects) {
		this.key = key;
		this.name = name;
		this.color = color;
		this.effects = new ArrayList(Arrays.asList(effects));
	}
	
	/**
	 * Returns the key for this brew, for it to be found in the map in the API.
	 * This should ALWAYS return the same result.
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Gets the insensitive unlocalized name. This is used for the lexicon.
	 */
	public String getUnlocalizedName() {
		return name;
	}
	
	/**
	 * Gets the unlocalized name for the ItemStack passed in.
	 */
	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName();
	}
	
	/**
	 * Gets the display color for the ItemStack passed in. Note that for
	 * the lexicon, this passes in a botania Managlass Flask at all times.
	 */
	public int getColor(ItemStack stack) {
		return color;
	}
	
	/**
	 * Gets the insensitive unlocalized mana cost. This is used for the lexicon.
	 */
	public int getManaCost() {
		return cost;
	}
	
	/**
	 * Gets the mana cost for the ItemStack passed in.
	 */
	public int getManaCost(ItemStack stack) {
		return getManaCost();
	}
	
	/**
	 * Gets the list of potion effects for the ItemStack passed in.
	 * Note that for the lexicon, this passes in a botania Managlass 
	 * Flask at all times.
	 */
	public List<PotionEffect> getPotionEffects(ItemStack stack) {
		return effects;
	}
	
}