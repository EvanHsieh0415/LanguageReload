package org.hiedacamellia.languagereload.core.interfaces;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public interface IAdvancementsScreen {
    void languagereload_recreateWidgets();
}
