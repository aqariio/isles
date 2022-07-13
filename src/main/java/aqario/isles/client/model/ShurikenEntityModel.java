package aqario.isles.client.model;

import aqario.isles.entity.ShurikenEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ShurikenEntityModel extends EntityModel<ShurikenEntity> {
	private final ModelPart shuriken;
	public ShurikenEntityModel(ModelPart root) {
		this.shuriken = root.getChild("shuriken");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData shuriken = modelPartData.addChild("shuriken", ModelPartBuilder.create().uv(0, 2).cuboid(6.0F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 4).cuboid(5.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 17).cuboid(4.0F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 10).cuboid(3.0F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(13, 12).cuboid(2.0F, -0.5F, -6.0F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(1.0F, -0.5F, -7.0F, 1.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(0.0F, -0.5F, -6.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 5).cuboid(-1.0F, -0.5F, -5.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.0F, -0.5F, -4.0F, 1.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(13, 0).cuboid(-3.0F, -0.5F, -3.0F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(19, 22).cuboid(-4.0F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(13, 0).cuboid(-6.0F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-7.0F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(ShurikenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		shuriken.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}