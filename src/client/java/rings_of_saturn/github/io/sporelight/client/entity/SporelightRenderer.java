package rings_of_saturn.github.io.sporelight.client.entity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import rings_of_saturn.github.io.sporelight.entity.custom.SporelightEntity;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

public class SporelightRenderer extends MobEntityRenderer<SporelightEntity, SporelightModel<SporelightEntity>> {
	public static final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/entity/sporelight.png");

	public SporelightRenderer(EntityRendererFactory.Context context) {
		super(context, new SporelightModel<>(context.getPart(SporelightModel.LAYER)), 0f);
	}

	@Override
	public void render(SporelightEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
		super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
	}

	@Override
	protected @Nullable RenderLayer getRenderLayer(SporelightEntity entity, boolean showBody, boolean translucent, boolean showOutline) {
		return RenderLayer.getEntityTranslucent(TEXTURE);
	}

	@Override
	public Identifier getTexture(SporelightEntity entity) {
		return TEXTURE;
	}

	@Override
	protected float getShadowRadius( SporelightEntity mobEntity) {
		return 0;
	}
}