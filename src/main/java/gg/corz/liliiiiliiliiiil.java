package gg.corz;

import net.minecraft.class_2338;

public record liliiiiliiliiiil(IlIIllllllIIllll kind, class_2338 cell, boolean glowstone, double ev) {
   private final class_2338 lIIIliIiil;
   private final double IlIIliIiil;
   private final IlIIllllllIIllll IIIIliIiil;
   private final boolean iIIIliIiil;
   public static final liliiiiliiliiiil llIIliIiil = new liliiiiliiliiiil(IlIIllllllIIllll.liilllIill, null, false, 0.0);

   public boolean iIlIlllllill() {
      return this.iIIIliIiil;
   }

   public double IilliliilIIi() {
      return this.IlIIliIiil;
   }

   public liliiiiliiliiiil(IlIIllllllIIllll kind, class_2338 cell, boolean glowstone, double ev) {
      this.IIIIliIiil = kind;
      this.lIIIliIiil = cell;
      this.iIIIliIiil = glowstone;
      this.IlIIliIiil = ev;
   }

   public class_2338 liiiIIllIl() {
      return this.lIIIliIiil;
   }

   public IlIIllllllIIllll IliIlllilIi() {
      return this.IIIIliIiil;
   }
}
