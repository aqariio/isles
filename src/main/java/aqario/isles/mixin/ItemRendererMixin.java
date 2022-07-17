package aqario.isles.mixin;

import aqario.isles.IslesClient;
import aqario.isles.client.model.AquariusEntityModel;
import aqario.isles.client.model.ShurikenEntityModel;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.entity.BannerBlockEntity;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BannerBlockEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.DyeColor;
import net.minecraft.util.registry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(BuiltinModelItemRenderer.class)
public class ItemRendererMixin {
    /*private ShurikenEntityModel modelShuriken;
    private EntityModelLoader entityModelLoader;

    @Inject(method = "reload", at = @At("HEAD"))
    private void reloadInject(CallbackInfo info) {
        this.modelShuriken = new ShurikenEntityModel(this.entityModelLoader.getModelPart(IslesClient.SHURIKEN));
    }
    @Inject(method = "render", at = @At("HEAD"))
    private void renderInject(CallbackInfo info, ItemStack stack, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(Items.TRIDENT)) {
            matrices.push();
            matrices.scale(1.0f, -1.0f, -1.0f);
            VertexConsumer vertexConsumer2 = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.modelShuriken.getLayer(AquariusEntityModel.TEXTURE), false, stack.hasGlint());
            this.modelShuriken.render(matrices, vertexConsumer2, light, overlay, 1.0f, 1.0f, 1.0f, 1.0f);
            matrices.pop();
        }
    }*/
}