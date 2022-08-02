package ro.srth.kebabmod.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import ro.srth.kebabmod.KebabMod;
import ro.srth.kebabmod.item.custom.Kebab;

import java.util.List;

public class KebabModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KebabMod.MOD_ID);

    public static final RegistryObject<Item> KEBAB = ITEMS.register("kebab",
            () -> new Kebab(new Item.Properties().food(new FoodProperties.Builder().nutrition(20).saturationMod(0.5f).build())){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    if(Screen.hasControlDown())
                    {
                        pTooltipComponents.add(new TranslatableComponent(("tooltip.kebabmod.kebab")));
                    }
                    else
                    {
                        pTooltipComponents.add(new TranslatableComponent(("tooltip.kebabmod.default")));
                    }
                }
            });
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
