package aqario.isles.client.renderer;


import aqario.isles.Isles;
import aqario.isles.IslesClient;
import aqario.isles.client.model.AquariusEntityModel;
import aqario.isles.client.model.ShurikenEntityModel;
import aqario.isles.entity.AquariusEntity;
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

public class AquariusEntityRenderer
        extends EntityRenderer<AquariusEntity> {
    public static final Identifier TEXTURE = new Identifier(Isles.MODID, "textures/entity/aquarius.png");
    private final AquariusEntityModel model;

    public AquariusEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new AquariusEntityModel(context.getPart(IslesClient.AQUARIUS));
    }

    @Override
    public void render(AquariusEntity aquariusEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(MathHelper.lerp(g, aquariusEntity.prevYaw, aquariusEntity.getYaw()) - 90.0f));
        matrixStack.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(MathHelper.lerp(g, aquariusEntity.prevPitch, aquariusEntity.getPitch()) + 90.0f));
        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, this.model.getLayer(this.getTexture(aquariusEntity)), false, aquariusEntity.isEnchanted());
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.pop();
        super.render(aquariusEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(AquariusEntity aquariusEntity) {
        return TEXTURE;
    }
}
