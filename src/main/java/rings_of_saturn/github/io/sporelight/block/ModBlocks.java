package rings_of_saturn.github.io.sporelight.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.sporelight.block.custom.MossLayersBlock;

import static rings_of_saturn.github.io.sporelight.Sporelight.MOD_ID;

public class ModBlocks {

    public static final Block MOSS_LAYERS = Registry.register(Registries.BLOCK,
            Identifier.of(MOD_ID, "moss_layers"),
            new MossLayersBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .replaceable()
                            .noCollision()
                            .strength(0.2F)
                            .sounds(BlockSoundGroup.MOSS_CARPET)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );



    public static void registerBlocks(){

    }
}
