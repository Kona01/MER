package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.ItemFood;

public class ItemPerogie extends ItemFood {

    public ItemPerogie() {
        super(8, 0.2F, true);
        setUnlocalizedName(Reference.ModItems.PEROGIE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.PEROGIE.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
