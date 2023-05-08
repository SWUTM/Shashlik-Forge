package net.swutm.shashlik.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.shashlik.shashlik;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, shashlik.MOD_ID);

    public static final RegistryObject<Item> MEAT = ITEMS.register("meat21",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MEAT)));

    public static final RegistryObject<Item> MEAT1 = ITEMS.register("meat1",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MEAT1)));

    public static final RegistryObject<Item> MUSHROOM = ITEMS.register("mushroom",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MUSHROOM)));

    public static final RegistryObject<Item> MUSHROOM1 = ITEMS.register("mushroom1",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MUSHROOM1)));

    public static final RegistryObject<Item> SKEWERS = ITEMS.register("skewers",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
