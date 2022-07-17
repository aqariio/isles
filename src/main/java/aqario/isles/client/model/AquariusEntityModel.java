package aqario.isles.client.model;

import aqario.isles.Isles;
import aqario.isles.entity.AquariusEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class AquariusEntityModel extends EntityModel<AquariusEntity> {
	public static final Identifier TEXTURE = new Identifier(Isles.MODID, "textures/entity/aquarius.png");
	private final ModelPart trident;
	public AquariusEntityModel(ModelPart root) {
		this.trident = root.getChild("trident");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData trident = modelPartData.addChild("trident", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, 24.0F, 8.0F));

		ModelPartData head = trident.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(3, 23).cuboid(-16.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 23).cuboid(-15.0F, -10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 20).cuboid(-14.0F, -10.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 16).cuboid(-13.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 23).cuboid(-12.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 19).cuboid(-16.0F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-15.0F, -15.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-14.0F, -15.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 21).cuboid(-13.0F, -12.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 22).cuboid(-12.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(21, 7).cuboid(-11.0F, -10.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-13.0F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 21).cuboid(-12.0F, -14.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(21, 13).cuboid(-11.0F, -13.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(-10.0F, -11.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(-11.0F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 3).cuboid(-10.0F, -15.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-9.0F, -14.0F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 10).cuboid(-8.0F, -10.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData handle = trident.addChild("handle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = handle.addChild("cube_r2", ModelPartBuilder.create().uv(20, 0).cuboid(-8.0F, -8.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 5).cuboid(-7.0F, -8.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 9).cuboid(-6.0F, -7.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 8).cuboid(-5.0F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 0).cuboid(-4.0F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 12).cuboid(-3.0F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 4).cuboid(-2.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 12).cuboid(-1.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 11).cuboid(0.0F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 15).cuboid(2.0F, 1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 7).cuboid(3.0F, 2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 15).cuboid(4.0F, 3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 0).cuboid(5.0F, 4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(17, 14).cuboid(6.0F, 5.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 18).cuboid(7.0F, 6.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 4).cuboid(8.0F, 7.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 18).cuboid(9.0F, 8.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 10).cuboid(10.0F, 9.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 0).cuboid(11.0F, 10.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 18).cuboid(12.0F, 11.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 5).cuboid(13.0F, 11.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 17).cuboid(14.0F, 13.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 22).cuboid(15.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.7854F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(AquariusEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		trident.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}