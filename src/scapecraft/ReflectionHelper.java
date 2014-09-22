package scapecraft;
import java.lang.reflect.Field;

import net.minecraft.item.ItemArmor;

public class ReflectionHelper
{
	@SuppressWarnings("rawtypes")
	public static void changeFinal(Class originClass, Object changeObject, Object newValue, String unobfuscatedField, String obfuscatedField)
	{
		//Reflection to change final field
		try
		{
			Field field = null;
			try
			{
				field = ItemArmor.class.getDeclaredField(obfuscatedField);
			} catch (NoSuchFieldException e) {
				field = ItemArmor.class.getDeclaredField(unobfuscatedField);
			}
			field.setAccessible(true);
			field.set(changeObject, newValue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
