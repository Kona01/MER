package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;

public class ItemDough extends Item {

    public ItemDough() {
        setUnlocalizedName(Reference.ModItems.DOUGH.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DOUGH.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
