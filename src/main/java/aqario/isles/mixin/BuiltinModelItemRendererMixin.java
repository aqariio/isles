package aqario.isles.mixin;

import aqario.isles.IslesClient;
import aqario.isles.client.model.ShurikenEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BuiltinModelItemRenderer.class)
public class BuiltinModelItemRendererMixin {
    private ShurikenEntityModel modelShuriken;
    private EntityModelLoader entityModelLoader;

    @Inject(method = "reload", at = @At("HEAD"))
    private void injectMethod(CallbackInfo info) {
        this.modelShuriken = new ShurikenEntityModel(this.entityModelLoader.getModelPart(IslesClient.SHURIKEN));
    }
}