package aqario.isles;

import aqario.isles.client.model.AquariusEntityModel;
import aqario.isles.client.model.ShurikenEntityModel;
import aqario.isles.client.renderer.AquariusEntityRenderer;
import aqario.isles.client.renderer.ShurikenEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class IslesClient implements ClientModInitializer {

    public static final EntityModelLayer AQUARIUS = new EntityModelLayer(new Identifier(Isles.MODID, "aquarius"),"aquarius");
    public static final EntityModelLayer SHURIKEN = new EntityModelLayer(new Identifier(Isles.MODID, "shuriken"),"shuriken");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Isles.AQUARIUS_ENTITY, AquariusEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(AQUARIUS, AquariusEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(Isles.SHURIKEN_ENTITY, ShurikenEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(SHURIKEN, ShurikenEntityModel::getTexturedModelData);
    }
}
