package net.thet.juiceandproduces.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {

    public static final RegistryObject<Item> MELON_JUICE = Registration.ITEMS.register("melon_juice", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));

    static void register() {}

}
