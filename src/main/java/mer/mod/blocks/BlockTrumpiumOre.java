package mer.mod.blocks;

import mer.mod.MER;
import mer.mod.Reference;
import mer.mod.init.ModBlocks;
import mer.mod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockTrumpiumOre extends Block {

    public BlockTrumpiumOre(){
        super(Material.ROCK);
        setHardness(60);
        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMORE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMORE.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }

    @Nullable

    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return this == ModBlocks.trumpiumore ? ModItems.trumpgem :  Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random){
        return this == ModBlocks.trumpiumore ? 2 + random.nextInt(5) : 1;
    }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
}
