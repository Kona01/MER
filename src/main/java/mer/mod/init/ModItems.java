package mer.mod.init;

import mer.mod.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item.ToolMaterial trumptool = EnumHelper.addToolMaterial("trump", 10, 2000, 15F, 15F, 10);
    public static ItemArmor.ArmorMaterial trumparmor = EnumHelper.addArmorMaterial("trump", "mer:trump", 35, new int[]{3, 6, 8, 3}, 20, null, 3.0F);

    public static Item trumpsword;
    public static Item trumpaxe;
    public static Item trumpgem;
    public static Item trumphelmet;
    public static Item trumpleggings;
    public static Item trumpboots;
    public static Item trumpchestplate;
    public static Item trumphoe;
    public static Item trumpspade;
    public static Item trumppickaxe;
    public static Item perogie;
    public static Item dough;

    public static void init() {
        trumpsword = new ItemTrumpSword(trumptool);
        trumpaxe = new ItemTrumpAxe(trumptool, 8, 1.2F);
        trumpspade = new ItemTrumpSpade(trumptool);
        trumpgem = new ItemTrumpGem();
        trumphoe = new ItemTrumpHoe(trumptool);
        trumphelmet = new ItemTrumpHelmet(trumparmor, 1, EntityEquipmentSlot.HEAD);
        trumpboots = new ItemTrumpBoots(trumparmor, 1, EntityEquipmentSlot.FEET);
        trumpchestplate = new ItemTrumpChestplate(trumparmor, 1, EntityEquipmentSlot.CHEST);
        trumpleggings = new ItemTrumpLeggings(trumparmor, 2, EntityEquipmentSlot.LEGS);
        trumppickaxe = new ItemTrumpPickaxe(trumptool);
        perogie = new ItemPerogie();
        dough = new ItemDough();
    }
    public static void register() {
        GameRegistry.register(trumpsword);
        GameRegistry.register(trumpaxe);
        GameRegistry.register(trumpgem);
        GameRegistry.register(trumphoe);
        GameRegistry.register(trumphelmet);
        GameRegistry.register(trumpleggings);
        GameRegistry.register(trumpchestplate);
        GameRegistry.register(trumpboots);
        GameRegistry.register(trumpspade);
        GameRegistry.register(trumppickaxe);
        GameRegistry.register(perogie);
        GameRegistry.register(dough);
    }

    public static void registerRenders() {
        registerRender(trumpsword);
        registerRender(trumpaxe);
        registerRender(trumpgem);
        registerRender(trumphoe);
        registerRender(trumphelmet);
        registerRender(trumpchestplate);
        registerRender(trumpleggings);
        registerRender(trumpboots);
        registerRender(trumpspade);
        registerRender(trumppickaxe);
        registerRender(perogie);
        registerRender(dough);
    }


    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}

