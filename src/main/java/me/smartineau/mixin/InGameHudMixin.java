package me.smartineau.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(InGameHud.class)
@Environment(EnvType.CLIENT)
public class InGameHudMixin {
    /**
     * @author Samuel-Martineau
     * @reason Prevents the default status effects overlay from being rendered
     */
    @Overwrite()
    public void renderStatusEffectOverlay(MatrixStack matrixStack) {
    }
}
