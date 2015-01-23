package scapecraft.item;

import net.minecraft.item.Item;

public enum ScapecraftArmorMaterial
{
	SANTA(50000, new int[]{3, 1, 1, 1}, 10),
	PHAT(500000, new int[]{3, 1, 1, 1}, 10),
	WPHAT(500000, new int[]{3, 1, 1, 1}, 10),
	YPHAT(500000, new int[]{3, 1, 1, 1}, 10),
	GPHAT(500000, new int[]{3, 1, 1, 1}, 10),
	RPHAT(500000, new int[]{3, 1, 1, 1}, 10),
	PPHAT(500000, new int[]{3, 1, 1, 1}, 10),
	STONE(50000000, new int[]{1, 3, 2, 1}, 50),
	WHITE(60, new int[]{2, 4, 3, 2}, 10, 0, 6D),
	AHRIM(10000, new int[]{3, 7, 4, 3}, 30, 30, 30D),
	AKRISAE(10000, new int[]{3, 7, 4, 3}, 30, 30, 30D),
	BANDOS(10000, new int[]{3, 8, 7, 3}, 10, 30, 20D),
	BLACK(60, new int[]{2, 4, 3, 2}, 10, 0, 6D),
	BLACKD(100, new int[]{3, 6, 5, 2}, 20, 25, 14D),
	BLACKG(5000, new int[]{3, 7, 5, 2}, 30, 15, 16D),
	CDRAGON(90, new int[]{3, 7, 5, 3}, 10, 0, 24D),
	DHAROK(10000, new int[]{3, 9, 6, 3}, 30, 30, 30D),
	DRAGON(5000, new int[]{3, 9, 6, 3}, 30, 20, 30D),
	NEIT(8000, new int[]{3, 9, 6, 3}, 30, 20, 40D),
	DRAGONL(50000, new int[]{3, 8, 7, 3}, 50, 35, 38D),
	GRANITE(1500, new int[]{3, 8, 6, 3}, 20, 20, 25D),
	GREEND(60, new int[]{3, 5, 4, 2}, 10, 15, 8D),
	GUTHAN(10000, new int[]{3, 9, 6, 3}, 30, 30, 30D),
	KARIL(10000, new int[]{3, 7, 4, 3}, 30, 30, 30D),
	BRONZE(80, new int[]{2, 3, 3, 2}, 10, 0, 4D),
	MITH(190, new int[]{2, 6, 5, 2}, 10, 5, 10D),
	ADDY(250, new int[]{2, 7, 5, 2}, 10, 10, 14D),
	RUNE(290, new int[]{3, 7, 5, 3}, 10, 15, 20D),
	RUNEG(330, new int[]{3, 7, 5, 3}, 30, 15, 16D),
	TORAG(20000, new int[]{3, 9, 6, 3}, 30, 30, 30D),
	VERAC(10000, new int[]{3, 7, 6, 3}, 30, 30, 30D);

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	private int maxDamageFactor;
	private int[] damageReductionAmountArray;
	private int enchantability;
	private int minLevel;
	private double healthBoost;

	public Item customCraftingMaterial = null;

	ScapecraftArmorMaterial(int maxDamageFactor, int[] damageReductionAmountArray, int enchantability)
	{
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.minLevel = 0;
		this.healthBoost = 0D;
	}

	ScapecraftArmorMaterial(int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, int minLevel)
	{
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.minLevel = minLevel;
		this.healthBoost = 0D;
	}

	ScapecraftArmorMaterial(int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, int minLevel, double healthBoost)
	{
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.minLevel = minLevel;
		this.healthBoost = healthBoost;
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
	public double getHealthBoost()
	{
		return this.healthBoost;
	}
}
