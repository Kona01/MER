package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemTrumpSword  extends ItemSword {

    public ItemTrumpSword(Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPSWORD.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPSWORD.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
