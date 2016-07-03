/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [03/07/2016, 19:31:01 (GMT)]
 */
package vazkii.quark.base.block;

import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.quark.base.item.IItemColorProvider;

public interface IBlockColorProvider extends IItemColorProvider {

	@SideOnly(Side.CLIENT)
	public IBlockColor getBlockColor();
	
}