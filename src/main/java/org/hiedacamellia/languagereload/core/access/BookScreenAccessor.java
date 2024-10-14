package org.hiedacamellia.languagereload.core.access;


import net.minecraft.client.gui.screens.inventory.BookViewScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BookViewScreen.class)
public interface BookScreenAccessor {
    @Accessor("cachedPage")
    void languagereload_setCachedPageIndex(int cachedPageIndex);
}