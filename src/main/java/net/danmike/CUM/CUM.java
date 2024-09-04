package net.danmike.CUM;

import com.mojang.logging.LogUtils;
import net.danmike.CUM.blocks.BlockInit;
import net.danmike.CUM.items.ItemInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// This is Dan Edittt
@Mod(CUM.MOD_ID)
public class CUM
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "cum";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
  
    public CUM()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);

        ItemInit.register(eventBus);
        BlockInit.register(eventBus);
        CreativeTab.register(eventBus);


        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.debug("Hello from common");
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        
    }
}
