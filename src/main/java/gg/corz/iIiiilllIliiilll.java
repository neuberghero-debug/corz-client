package gg.corz;

import net.minecraft.class_2338;

public record iIiiilllIliiilll(boolean feasible, class_2338 cell, boolean glowstone, float gain, int prepTicks) {
   private final float iIiiIllill;
   private final int IliiIllill;
   private final boolean lIiiIllill;
   public static final iIiiilllIliiilll lliiIllill = new iIiiilllIliiilll(false, null, false, 0.0F, 0);
   private final class_2338 IIiiIllill;
   private final boolean iiliIllill;

   public iIiiilllIliiilll(boolean feasible, class_2338 cell, boolean glowstone, float gain, int prepTicks) {
      this.iiliIllill = feasible;
      this.IIiiIllill = cell;
      this.lIiiIllill = glowstone;
      this.iIiiIllill = gain;
      this.IliiIllill = prepTicks;
   }

   public boolean iIlIlllllill() {
      return this.lIiiIllill;
   }

   public class_2338 liiiIIllIl() {
      return this.IIiiIllill;
   }

   public boolean IliIlllilIi() {
      return this.iiliIllill;
   }

   public float IilliliilIIi() {
      return this.iIiiIllill;
   }

   public int lIiiIiIlilli() {
      return this.IliiIllill;
   }
}
