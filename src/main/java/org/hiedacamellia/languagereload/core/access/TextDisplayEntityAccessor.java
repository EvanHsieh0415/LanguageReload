package org.hiedacamellia.languagereload.core.access;


import net.minecraft.world.entity.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Display.TextDisplay.class)
public interface TextDisplayEntityAccessor {
    @Accessor("clientDisplayCache")
    void languagereload_setTextLines(Display.TextDisplay.CachedInfo textLines);
}
