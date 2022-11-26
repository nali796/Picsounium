public static class Modeljunglemask extends ModelBase {
	private final ModelRenderer mask;
	private final ModelRenderer bone;

	public Modeljunglemask() {
		textureWidth = 64;
		textureHeight = 32;

		mask = new ModelRenderer(this);
		mask.setRotationPoint(0.0F, 0.0F, 0.0F);
		mask.cubeList.add(new ModelBox(mask, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, true));
		mask.cubeList.add(new ModelBox(mask, 49, 24, -4.0F, -17.0F, -3.0F, 8, 8, 0, 0.5F, true));
		mask.cubeList.add(new ModelBox(mask, 24, 0, -1.0F, -2.0F, -8.0F, 2, 2, 4, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		mask.addChild(bone);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mask.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}