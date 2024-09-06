package net.danmike.CUM.blocks.entities;

import net.danmike.CUM.CUM;
import net.danmike.CUM.blocks.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CUM.MOD_ID);

    public static final RegistryObject<BlockEntityType<SigmaBlockEntity>> SIGMA_BLOCK_ENTITY = BLOCK_ENTITIES.register("sigma_block_entity", () -> BlockEntityType.Builder.of(SigmaBlockEntity::new, BlockInit.SIGMA_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
