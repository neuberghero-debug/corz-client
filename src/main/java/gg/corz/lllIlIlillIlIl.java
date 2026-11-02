package gg.corz;

import net.minecraft.class_1921;

public final class lllIlIlillIlIl {
   public final class_1921 IiIlIIIllliIlIIIll;
   public final class_1921 llIlIIIllilIlIIIll;
   private final iIiiliIiIliiliIi[] iiIlIIIllIIllIIIll;

   lllIlIlillIlIl(class_1921 glowLayer, class_1921 layer, iIiiliIiIliiliIi[] parts) {
      this.llIlIIIllilIlIIIll = glowLayer;
      this.IiIlIIIllliIlIIIll = layer;
      this.iiIlIIIllIIllIIIll = parts;
   }

   public iIiiliIiIliiliIi IliIlllilIi(int i) {
      return i >= 0 && i < this.iiIlIIIllIIllIIIll.length ? this.iiIlIIIllIIllIIIll[i] : null;
   }

   public boolean liiiIIllIl(int i) {
      iIiiliIiIliiliIi var2 = this.IliIlllilIi(i);
      return this.IiIlIIIllliIlIIIll != null && var2 != null && var2.IliIlllilIi();
   }
}
