package gg.corz;

import net.minecraft.class_2338;

public record lIlIiiIliIlIiiIl(IlliIlillliIli kind, class_2338 base, int crystalId, float targetDamage, float selfCost, boolean pops, double value) {
   private final float IiliiIIlll;
   private final double IIiiiIIlll;
   private final float liliiIIlll;
   private final IlliIlillliIli IlliiIIlll;
   private final int illiiIIlll;
   private final class_2338 llliiIIlll;
   private final boolean iiliiIIlll;

   public float IilliliilIIi() {
      return this.IiliiIIlll;
   }

   public lIlIiiIliIlIiiIl(IlliIlillliIli kind, class_2338 base, int crystalId, float targetDamage, float selfCost, boolean pops, double value) {
      this.IlliiIIlll = kind;
      this.llliiIIlll = base;
      this.illiiIIlll = crystalId;
      this.IiliiIIlll = targetDamage;
      this.liliiIIlll = selfCost;
      this.iiliiIIlll = pops;
      this.IIiiiIIlll = value;
   }

   public float lIiiIiIlilli() {
      return this.liliiIIlll;
   }

   public IlliIlillliIli IliIlllilIi() {
      return this.IlliiIIlll;
   }

   public class_2338 liiiIIllIl() {
      return this.llliiIIlll;
   }

   public double IIIllIIliIIl() {
      return this.IIiiiIIlll;
   }

   public int iIlIlllllill() {
      return this.illiiIIlll;
   }

   public boolean iliIiiliiiii() {
      return this.iiliiIIlll;
   }
}
