package rings_of_saturn.github.io.sporelight.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.particle.TotemParticle;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import rings_of_saturn.github.io.sporelight.block.ModBlocks;
import rings_of_saturn.github.io.sporelight.client.entity.SporelightModel;
import rings_of_saturn.github.io.sporelight.client.entity.SporelightRenderer;
import rings_of_saturn.github.io.sporelight.entity.ModEntities;
import rings_of_saturn.github.io.sporelight.particle.ModParticles;

public class SporelightClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ParticleFactoryRegistry.getInstance().register(ModParticles.MOSS, TotemParticle.Factory::new);

        EntityRendererRegistry.register(ModEntities.SPORELIGHT, SporelightRenderer::new);

        EntityRendererRegistry.register(ModEntities.MOSS_BALL, FlyingItemEntityRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSS_LAYERS, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(SporelightModel.LAYER, SporelightModel::getTexturedModelData);
    }
}
