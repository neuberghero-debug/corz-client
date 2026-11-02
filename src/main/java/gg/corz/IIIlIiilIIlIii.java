package gg.corz;

import net.minecraft.class_2338;

record IIIlIiilIIlIii(iiliiIIiIIiiiIIi kind, int fire, float damage, boolean kill, float selfBound, class_2338 cell, boolean airborne) {
   private final float IiliillIIl;
   private final int IlliillIIl;
   private final class_2338 liliillIIl;
   private final iiliiIIiIIiiiIIi iIliillIIl;
   private final float llliillIIl;
   private final boolean iiliillIIl;
   private final boolean illiillIIl;

   public int liiiIIllIl() {
      return this.IlliillIIl;
   }

   public float iIlIlllllill() {
      return this.llliillIIl;
   }

   public iiliiIIiIIiiiIIi IliIlllilIi() {
      return this.iIliillIIl;
   }

   public class_2338 iliIiiliiiii() {
      return this.liliillIIl;
   }

   public boolean IilliliilIIi() {
      return this.illiillIIl;
   }

   public float lIiiIiIlilli() {
      return this.IiliillIIl;
   }

   public boolean IIIllIIliIIl() {
      return this.iiliillIIl;
   }

   private IIIlIiilIIlIii(iiliiIIiIIiiiIIi kind, int fire, float damage, boolean kill, float selfBound, class_2338 cell, boolean airborne) {
      this.iIliillIIl = kind;
      this.IlliillIIl = fire;
      this.llliillIIl = damage;
      this.illiillIIl = kill;
      this.IiliillIIl = selfBound;
      this.liliillIIl = cell;
      this.iiliillIIl = airborne;
   }
}
