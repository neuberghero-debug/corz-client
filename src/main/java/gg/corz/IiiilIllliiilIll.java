package gg.corz;

import net.minecraft.class_243;

record IiiilIllliiilIll(
   IlIlilIillIlilIi c,
   int idx,
   iilIIlIlIIiIIlIl kind,
   double value,
   double expo,
   float dmg,
   boolean pops,
   boolean kills,
   float selfCost,
   double margin,
   class_243 feet,
   int[] times
) {
   private final double IliIllilll;
   private final iilIIlIlIIiIIlIl illIllilll;
   private final int lllIllilll;
   private final boolean lIiIllilll;
   private final boolean IIiIllilll;
   private final float iilIllilll;
   private final int[] iliIllilll;
   private final double lilIllilll;
   private final IlIlilIillIlilIi IllIllilll;
   private final float iIiIllilll;
   private final double IilIllilll;
   private final class_243 lliIllilll;

   public int[] Iilllilliill() {
      return this.iliIllilll;
   }

   public double IilliliilIIi() {
      return this.IilIllilll;
   }

   public boolean IlIlllIlilIl() {
      return this.lIiIllilll;
   }

   public IlIlilIillIlilIi IliIlllilIi() {
      return this.IllIllilll;
   }

   public int liiiIIllIl() {
      return this.lllIllilll;
   }

   public float iliIiiliiiii() {
      return this.iilIllilll;
   }

   private IiiilIllliiilIll(
      IlIlilIillIlilIi c,
      int idx,
      iilIIlIlIIiIIlIl kind,
      double value,
      double expo,
      float dmg,
      boolean pops,
      boolean kills,
      float selfCost,
      double margin,
      class_243 feet,
      int[] times
   ) {
      this.IllIllilll = c;
      this.lllIllilll = idx;
      this.illIllilll = kind;
      this.IilIllilll = value;
      this.lilIllilll = expo;
      this.iilIllilll = dmg;
      this.IIiIllilll = pops;
      this.lIiIllilll = kills;
      this.iIiIllilll = selfCost;
      this.IliIllilll = margin;
      this.lliIllilll = feet;
      this.iliIllilll = times;
   }

   public iilIIlIlIIiIIlIl iIlIlllllill() {
      return this.illIllilll;
   }

   public boolean IIIllIIliIIl() {
      return this.IIiIllilll;
   }

   public double lIiiIiIlilli() {
      return this.lilIllilll;
   }

   public float IiIlliIliiIl() {
      return this.iIiIllilll;
   }

   public class_243 Illlllllilll() {
      return this.lliIllilll;
   }

   public double IIlllIlliIll() {
      return this.IliIllilll;
   }
}
