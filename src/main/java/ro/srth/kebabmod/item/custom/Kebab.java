package ro.srth.kebabmod.item.custom;

import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Kebab extends Item {
    public Kebab(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public boolean isEnchantable(ItemStack p_41456_) {
        return true;
    }
    @Override
    public int getItemStackLimit(ItemStack stack) {
        return 1;
    }
}
