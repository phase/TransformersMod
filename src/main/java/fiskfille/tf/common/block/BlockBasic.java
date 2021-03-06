package fiskfille.tf.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import fiskfille.tf.TransformersMod;

public class BlockBasic extends Block
{
    public BlockBasic(Material material)
    {
        super(material);
        this.setCreativeTab(TransformersMod.tabTransformers);
    }
    
    public Block setHarvestLvl(String tool, int level)
    {
    	this.setHarvestLevel(tool, level);
    	return this;
    }
    
    public Item getItemDropped(int p_149650_1_, Random rand, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
    	blockIcon = iconRegister.registerIcon(TransformersMod.modid + ":" + getUnlocalizedName().substring(5));
    }
}