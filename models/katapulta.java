// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class katapulta extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public katapulta() {
		textureWidth = 36;
		textureHeight = 36;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 30).addBox(-15.0F, -5.0F, 0.0F, 14.0F, 1.0F, 30.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-15.0F, -4.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-4.0F, -4.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-4.0F, -4.0F, 27.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-15.0F, -4.0F, 27.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 6).addBox(-5.0F, -15.0F, 12.0F, 1.0F, 10.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 6).addBox(-14.0F, -15.0F, 12.0F, 1.0F, 10.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 2).addBox(-4.0F, -14.0F, 14.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 2).addBox(-15.0F, -14.0F, 14.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 21).addBox(-13.0F, -14.0F, -1.0F, 8.0F, 1.0F, 22.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-13.0F, -15.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-13.0F, -15.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 5).addBox(-6.0F, -15.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(0, 5).addBox(-13.0F, -15.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(-11.0F, -17.0F, 1.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}