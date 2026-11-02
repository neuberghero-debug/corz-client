package gg.corz;

public record llliiiilliii(
   int tick, boolean sneaking, int sneakTicks, boolean exactRay, boolean dirtPresent, boolean targetReplaceable, boolean supportPreserved
) {
   private final boolean IliIlIiIllliIlIiIl;
   private final boolean liiIlIiIliiiIlIiIl;
   private final int iilIlIiIlIIiIlIiIl;
   private final int lllIlIiIlillIlIiIl;
   private final boolean iliIlIiIlIiiIlIiIl;
   private final boolean lIiIlIiIliIiIlIiIl;
   private final boolean IilIlIiIllilIlIiIl;

   public boolean lIiiIiIlilli() {
      return this.IliIlIiIllliIlIiIl;
   }

   public llliiiilliii(int tick, boolean sneaking, int sneakTicks, boolean exactRay, boolean dirtPresent, boolean targetReplaceable, boolean supportPreserved) {
      this.lllIlIiIlillIlIiIl = tick;
      this.IilIlIiIllilIlIiIl = sneaking;
      this.iilIlIiIlIIiIlIiIl = sneakTicks;
      this.lIiIlIiIliIiIlIiIl = exactRay;
      this.IliIlIiIllliIlIiIl = dirtPresent;
      this.iliIlIiIlIiiIlIiIl = targetReplaceable;
      this.liiIlIiIliiiIlIiIl = supportPreserved;
   }

   public boolean iliIiiliiiii() {
      return this.iliIlIiIlIiiIlIiIl;
   }

   public boolean liiiIIllIl() {
      return this.IilIlIiIllilIlIiIl;
   }

   public boolean IIIllIIliIIl() {
      return this.liiIlIiIliiiIlIiIl;
   }

   public int iIlIlllllill() {
      return this.iilIlIiIlIIiIlIiIl;
   }

   public boolean IilliliilIIi() {
      return this.lIiIlIiIliIiIlIiIl;
   }

   public int IliIlllilIi() {
      return this.lllIlIiIlillIlIiIl;
   }
}
