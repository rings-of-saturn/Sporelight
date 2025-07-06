package rings_of_saturn.github.io.sporelight.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

public class ModParticles {
    public static final SimpleParticleType MOSS = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "moss"), MOSS.getType());
    }

}
