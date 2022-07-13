package aqario.isles.client.renderer;


import aqario.isles.Isles;
import aqario.isles.IslesClient;
import aqario.isles.client.model.ShurikenEntityModel;
import aqario.isles.entity.ShurikenEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;

public class ShurikenEntityRenderer
        extends EntityRenderer<ShurikenEntity> {
    public static final Identifier TEXTURE = new Identifier(Isles.MODID, "textures/entity/shuriken.png");
    private final ShurikenEntityModel model;

    public ShurikenEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new ShurikenEntityModel(context.getPart(IslesClient.SHURIKEN));
    }

    @Override
    public void render(ShurikenEntity shurikenEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(MathHelper.lerp(g, shurikenEntity.prevYaw, shurikenEntity.getYaw()) - 90.0f));
        matrixStack.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(MathHelper.lerp(g, shurikenEntity.prevPitch, shurikenEntity.getPitch()) + 90.0f));
        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, this.model.getLayer(this.getTexture(shurikenEntity)), false, shurikenEntity.isEnchanted());
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.pop();
        super.render(shurikenEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(ShurikenEntity shurikenEntity) {
        return TEXTURE;
    }
}
