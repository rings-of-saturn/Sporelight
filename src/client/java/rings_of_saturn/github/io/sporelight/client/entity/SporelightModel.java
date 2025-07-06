package rings_of_saturn.github.io.sporelight.client.entity;


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.sporelight.entity.custom.SporelightEntity;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SporelightModel<S extends SporelightEntity> extends EntityModel<SporelightEntity> {

	public static final EntityModelLayer LAYER = new EntityModelLayer(Identifier.of(MOD_ID, "assets/textures/entity/sporelight.png"), "main");

	private final ModelPart head;
	private final ModelPart bush;
	private final ModelPart shadow;
	private final ModelPart tendrils;
	private final ModelPart tendril1;
	private final ModelPart tendril2;
	private final ModelPart tendril3;
	private final ModelPart tendril4;
	private final ModelPart tendril5;
	private final ModelPart tendril6;
	private final ModelPart flower_crown;
	public SporelightModel(ModelPart root) {
		this.head = root.getChild("head");
		this.bush = this.head.getChild("bush");
		this.shadow = this.head.getChild("shadow");
		this.tendrils = this.head.getChild("tendrils");
		this.tendril1 = this.tendrils.getChild("tendril1");
		this.tendril2 = this.tendrils.getChild("tendril2");
		this.tendril3 = this.tendrils.getChild("tendril3");
		this.tendril4 = this.tendrils.getChild("tendril4");
		this.tendril5 = this.tendrils.getChild("tendril5");
		this.tendril6 = this.tendrils.getChild("tendril6");
		this.flower_crown = this.head.getChild("flower_crown");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 17.0F, -0.2F));

		ModelPartData bush = head.addChild("bush", ModelPartBuilder.create().uv(40, 0).cuboid(5.9292F, 2.3967F, -4.9019F, 0.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.2292F, -0.3967F, -0.0981F));

		ModelPartData cube_r1 = bush.addChild("cube_r1", ModelPartBuilder.create().uv(82, 0).cuboid(0.0F, -1.5F, -3.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-4.8882F, -3.4944F, -2.9019F, 0.9375F, -0.2489F, 0.4407F));

		ModelPartData cube_r2 = bush.addChild("cube_r2", ModelPartBuilder.create().uv(24, 20).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-4.8882F, -3.9944F, 0.0981F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r3 = bush.addChild("cube_r3", ModelPartBuilder.create().uv(0, 76).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-3.7882F, 0.6056F, -5.2019F, -2.1432F, 1.5413F, -0.5345F));

		ModelPartData cube_r4 = bush.addChild("cube_r4", ModelPartBuilder.create().uv(68, 39).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-0.1882F, -3.7944F, -5.2019F, -1.739F, 1.194F, -1.8498F));

		ModelPartData cube_r5 = bush.addChild("cube_r5", ModelPartBuilder.create().uv(0, 63).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.8118F, 5.1056F, -5.1019F, 1.6986F, 1.0666F, 1.5605F));

		ModelPartData cube_r6 = bush.addChild("cube_r6", ModelPartBuilder.create().uv(24, 34).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.8118F, 5.2056F, 6.0981F, -1.689F, 1.0212F, -1.7941F));

		ModelPartData cube_r7 = bush.addChild("cube_r7", ModelPartBuilder.create().uv(62, 69).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.3118F, 4.5056F, 0.4981F, -3.0415F, -0.1087F, 0.2159F));

		ModelPartData cube_r8 = bush.addChild("cube_r8", ModelPartBuilder.create().uv(22, 62).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(3.7118F, -4.9944F, 0.2981F, -3.1225F, -0.0459F, -1.4405F));

		ModelPartData cube_r9 = bush.addChild("cube_r9", ModelPartBuilder.create().uv(62, 0).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-3.6882F, -4.8944F, -0.5019F, -3.1034F, -0.0319F, -1.9206F));

		ModelPartData cube_r10 = bush.addChild("cube_r10", ModelPartBuilder.create().uv(42, 69).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(5.3118F, -4.4944F, 0.4981F, -2.9945F, 0.0128F, -0.694F));

		ModelPartData cube_r11 = bush.addChild("cube_r11", ModelPartBuilder.create().uv(68, 13).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(5.1118F, 0.3056F, 5.3981F, 1.8461F, -0.6417F, -0.1883F));

		ModelPartData cube_r12 = bush.addChild("cube_r12", ModelPartBuilder.create().uv(88, 9).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.8882F, 2.6056F, -3.5019F, 1.2121F, 0.0309F, -0.2777F));

		ModelPartData cube_r13 = bush.addChild("cube_r13", ModelPartBuilder.create().uv(84, 61).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.8882F, 2.6056F, 1.4981F, 1.9539F, 0.0309F, -0.2777F));

		ModelPartData cube_r14 = bush.addChild("cube_r14", ModelPartBuilder.create().uv(88, 17).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-5.8882F, -4.3944F, 4.0981F, 2.0669F, 0.6682F, 0.0334F));

		ModelPartData cube_r15 = bush.addChild("cube_r15", ModelPartBuilder.create().uv(20, 75).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(4.5118F, 1.6056F, -5.2019F, -1.667F, -1.178F, 3.1382F));

		ModelPartData cube_r16 = bush.addChild("cube_r16", ModelPartBuilder.create().uv(68, 26).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-4.4882F, 1.6056F, -4.9019F, 1.8456F, -0.5172F, -0.1458F));

		ModelPartData cube_r17 = bush.addChild("cube_r17", ModelPartBuilder.create().uv(64, 56).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-4.4882F, 1.6056F, 5.0981F, 2.0133F, 0.7999F, 0.2024F));

		ModelPartData cube_r18 = bush.addChild("cube_r18", ModelPartBuilder.create().uv(0, 20).cuboid(0.0F, -1.5F, -7.0F, 0.0F, 3.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(1.8118F, -3.8944F, 5.2981F, 0.9814F, 1.3349F, 1.0153F));

		ModelPartData cube_r19 = bush.addChild("cube_r19", ModelPartBuilder.create().uv(44, 56).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-2.1882F, -3.3944F, 5.3981F, 1.1145F, 1.2961F, 0.7082F));

		ModelPartData cube_r20 = bush.addChild("cube_r20", ModelPartBuilder.create().uv(46, 14).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-4.3708F, 5.8967F, 0.0981F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r21 = bush.addChild("cube_r21", ModelPartBuilder.create().uv(64, 82).cuboid(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-5.2708F, -4.1033F, 5.0981F, -1.3059F, -1.0189F, -1.8973F));

		ModelPartData cube_r22 = bush.addChild("cube_r22", ModelPartBuilder.create().uv(84, 52).cuboid(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-5.2708F, -2.9033F, 5.6981F, -2.2771F, -0.0573F, -2.1779F));

		ModelPartData cube_r23 = bush.addChild("cube_r23", ModelPartBuilder.create().uv(52, 82).cuboid(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.9292F, -5.1033F, 1.7981F, -1.1064F, -0.1405F, -0.3306F));

		ModelPartData cube_r24 = bush.addChild("cube_r24", ModelPartBuilder.create().uv(82, 69).cuboid(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-2.1708F, 0.8967F, -5.8019F, 0.7104F, 1.2563F, 2.1385F));

		ModelPartData cube_r25 = bush.addChild("cube_r25", ModelPartBuilder.create().uv(76, 82).cuboid(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(5.8292F, -3.1033F, -3.6019F, -1.9199F, 0.48F, 0.0F));

		ModelPartData cube_r26 = bush.addChild("cube_r26", ModelPartBuilder.create().uv(40, 82).cuboid(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(5.3292F, -0.1033F, -4.2019F, -1.0472F, 0.48F, 0.0F));

		ModelPartData cube_r27 = bush.addChild("cube_r27", ModelPartBuilder.create().uv(46, 28).cuboid(0.0F, -1.5F, -5.0F, 0.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(5.3292F, -0.1033F, -4.2019F, -1.5708F, 0.48F, 0.0F));

		ModelPartData shadow = head.addChild("shadow", ModelPartBuilder.create().uv(0, 110).cuboid(-4.0F, -5.0F, -4.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.4F, -0.9F, -0.3491F, 0.0F, 0.0F));

		ModelPartData tendrils = head.addChild("tendrils", ModelPartBuilder.create(), ModelTransform.of(0.0F, 6.1F, -0.9F, -0.2618F, 0.0F, 0.0F));

		ModelPartData tendril1 = tendrils.addChild("tendril1", ModelPartBuilder.create().uv(40, 14).cuboid(0.0F, 6.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 88).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(24, 88).cuboid(0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData tendril2 = tendrils.addChild("tendril2", ModelPartBuilder.create().uv(88, 25).cuboid(0.0F, 6.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(28, 88).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 30).cuboid(0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -3.0F, 1.0F, 0.0F, -0.3491F, 0.0F));

		ModelPartData tendril3 = tendrils.addChild("tendril3", ModelPartBuilder.create().uv(32, 88).cuboid(0.0F, 6.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 35).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(36, 88).cuboid(0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -3.0F, 4.0F, 0.0F, -1.2654F, 0.0F));

		ModelPartData tendril4 = tendrils.addChild("tendril4", ModelPartBuilder.create().uv(88, 40).cuboid(0.0F, 6.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 45).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 78).cuboid(0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7F, -3.0F, -1.0F, 0.0F, -1.9635F, 0.0F));

		ModelPartData tendril5 = tendrils.addChild("tendril5", ModelPartBuilder.create().uv(88, 83).cuboid(0.0F, 6.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(88, 88).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 89).cuboid(0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.3F, -3.0F, -2.6F, 0.0F, -0.829F, 0.0F));

		ModelPartData tendril6 = tendrils.addChild("tendril6", ModelPartBuilder.create().uv(4, 89).cuboid(0.0F, 6.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(8, 89).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(12, 89).cuboid(0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.6F, -3.0F, 3.5F, 0.0F, -1.8762F, 0.0F));

		ModelPartData flower_crown = head.addChild("flower_crown", ModelPartBuilder.create().uv(0, 34).cuboid(5.8F, -2.0F, -1.3F, 0.0F, 5.0F, 11.0F, new Dilation(0.0F))
				.uv(46, 41).cuboid(-5.2F, -2.0F, -1.3F, 0.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.8F, -5.4F, -3.6F, 0.0F, 0.0436F, 0.3054F));

		ModelPartData cube_r28 = flower_crown.addChild("cube_r28", ModelPartBuilder.create().uv(22, 47).cuboid(-5.5F, -4.5F, -5.5F, 0.0F, 5.0F, 11.0F, new Dilation(0.0F))
				.uv(0, 48).cuboid(5.5F, -4.5F, -5.5F, 0.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.3F, 2.5F, 4.2F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		head.yaw += 135;
		head.pitch *= -1;
		head.render(matrices, vertices, light, overlay, color);
	}

	@Override
	public void setAngles(SporelightEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.head.pitch = headPitch * (float) (Math.PI / 180.0);
		this.head.yaw = headYaw * (float) (Math.PI / 180.0);
	}
}