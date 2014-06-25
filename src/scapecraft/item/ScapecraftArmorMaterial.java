package scapecraft.item;

import net.minecraft.item.Item;

public enum ScapecraftArmorMaterial
{
	SANTA(50000, new int[]{4, 1, 1, 1}, 10),
	PHAT(500000, new int[]{4, 1, 1, 1}, 10),
	WPHAT(500000, new int[]{4, 1, 1, 1}, 10),
	YPHAT(500000, new int[]{4, 1, 1, 1}, 10),
	GPHAT(500000, new int[]{4, 1, 1, 1}, 10),
	RPHAT(500000, new int[]{4, 1, 1, 1}, 10),
	PPHAT(500000, new int[]{4, 1, 1, 1}, 10),
	ADDY(250, new int[]{2, 7, 5, 2}, 10, 10, 34D),
	AHRIM(10000, new int[]{3, 7, 4, 3}, 30, 30, 50D),
	AKRISAE(10000, new int[]{3, 7, 4, 3}, 30, 30, 50D),
	BANDOS(10000, new int[]{3, 8, 0, 4}, 10, 30, 40D),
	BLACK(60, new int[]{2, 4, 3, 2}, 10, 0, 26D),
	BLACKD(100, new int[]{3, 6, 5, 2}, 20, 25, 34D),
	BLACKG(5000, new int[]{3, 7, 5, 2}, 30, 15, 36D),
	CDRAGON(90, new int[]{3, 7, 5, 3}, 10, 0, 44D),
	DHAROK(10000, new int[]{3, 9, 6, 3}, 30, 30, 50D),
	DRAGON(5000, new int[]{3, 9, 6, 3}, 30, 20, 50D),
	DRAGONL(50000, new int[]{3, 8, 7, 3}, 50, 35, 58D),
	GRANITE(1500, new int[]{3, 8, 6, 3}, 20, 20, 45D),
	GREEND(60, new int[]{3, 5, 4, 2}, 10, 15, 28D),
	GUARD(80, new int[]{2, 3, 5, 2}, 10),
	GUTHAN(10000, new int[]{3, 9, 6, 3}, 30, 30, 50D),
	KARIL(10000, new int[]{3, 7, 4, 3}, 30, 30, 50D),
	MITH(190, new int[]{2, 6, 5, 2}, 10, 0, 30D),
	RUNE(290, new int[]{3, 7, 5, 3}, 10, 15, 40D),
	RUNEG(330, new int[]{3, 7, 5, 3}, 30, 15, 36D),
	STONE(50000000, new int[]{1, 3, 2, 1}, 50),
	TORAG(20000, new int[]{3, 9, 6, 3}, 30, 30, 50D),
	VERAC(10000, new int[]{3, 7, 6, 3}, 30, 30, 50D),
	WHITE(60, new int[]{2, 4, 3, 2}, 10, 0, 26D);

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	private int maxDamageFactor;
	private int[] damageReductionAmountArray;
	private int enchantability;
	private int minLevel;
	private double maxHealth;

	public Item customCraftingMaterial = null;

	ScapecraftArmorMaterial(int maxDamageFactor, int[] damageReductionAmountArray, int enchantability)
	{
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.minLevel = 0;
		this.maxHealth = 20D;
	}

	ScapecraftArmorMaterial(int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, int minLevel)
	{
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.minLevel = minLevel;
		this.maxHealth = 20D;
	}

	ScapecraftArmorMaterial(int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, int minLevel, double maxHealth)
	{
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.minLevel = minLevel;
		this.maxHealth = maxHealth;
	}

	/**
	 * Returns the durability for a armor slot of for this type.
	 */
	public int getDurability(int par1)
	{
		return maxDamageArray[par1] * this.maxDamageFactor;
	}

	/**
	 * Return the damage reduction (each 1 point is a half a shield on gui) of the piece index passed (0 = helmet, 1
	 * = plate, 2 = legs and 3 = boots)
	 */
	public int getDamageReductionAmount(int par1)
	{
		return this.damageReductionAmountArray[par1];
	}

	/**
	 * Return the enchantability factor of the material.
	 */
	public int getEnchantability()
	{
		return this.enchantability;
	}

	/**
	 * Return minimum combat level required to wear armor of this material
	 */
	public int getMinLevel()
	{
		return this.minLevel;
	}

	/**
	 * Return max health when full equipped with this armor
	 */
	public double getMaxHealth()
	{
		return this.maxHealth;
	}
}
