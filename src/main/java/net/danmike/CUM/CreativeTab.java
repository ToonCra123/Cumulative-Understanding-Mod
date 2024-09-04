package net.danmike.CUM;

import net.danmike.CUM.blocks.BlockInit;
import net.danmike.CUM.items.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CUM.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MY_FUCKING_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ItemInit.SHIT_ASS.get())).title(Component.translatable("creativetab.example_tab")).displayItems((display, output) -> {
                output.accept(ItemInit.SHIT_ASS.get());
                output.accept(BlockInit.SHIT_ASS_BLOCK.get());
            }).build());

    public static void register(IEventBus event) {
        CREATIVE_MODE_TABS.register(event);
    }
}
