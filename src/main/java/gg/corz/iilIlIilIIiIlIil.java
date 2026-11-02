package gg.corz;

import java.util.Arrays;

public record iilIlIilIIiIlIil(double[] along, double[] lateral, double speed, double melee, double expl, double air, int n) {
   private final double lliIIIlIil;
   private final double IliIIIlIil;
   private final double[] IIiIIIlIil;
   private final double[] iilIIIlIil;
   private final double iIiIIIlIil;
   private final int iliIIIlIil;
   private final double lIiIIIlIil;

   @Override
   public int hashCode() {
      long var2 = 8512453842873102389L;
      var2 ^= ((long)Arrays.hashCode(this.iilIIIlIil) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Arrays.hashCode(this.IIiIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.lIiIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.iIiIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.IliIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.lliIIIlIil)) << 32 ^ var2) & -1L << 32;
      return 31 * (int)(var2 >>> 32) + this.iliIIIlIil;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else {
         return !(o instanceof iilIlIilIIiIlIil var2)
            ? false
            : Arrays.equals(this.iilIIIlIil, var2.iilIIIlIil)
               && Arrays.equals(this.IIiIIIlIil, var2.IIiIIIlIil)
               && Double.compare(this.lIiIIIlIil, var2.lIiIIIlIil) == 0
               && Double.compare(this.iIiIIIlIil, var2.iIiIIIlIil) == 0
               && Double.compare(this.IliIIIlIil, var2.IliIIIlIil) == 0
               && Double.compare(this.lliIIIlIil, var2.lliIIIlIil) == 0
               && this.iliIIIlIil == var2.iliIIIlIil;
      }
   }

   public double iIlIlllllill() {
      return this.lIiIIIlIil;
   }

   public double[] IliIlllilIi() {
      return this.iilIIIlIil;
   }

   public iilIlIilIIiIlIil(double[] along, double[] lateral, double speed, double melee, double expl, double air, int n) {
      this.iilIIIlIil = along;
      this.IIiIIIlIil = lateral;
      this.lIiIIIlIil = speed;
      this.iIiIIIlIil = melee;
      this.IliIIIlIil = expl;
      this.lliIIIlIil = air;
      this.iliIIIlIil = n;
   }

   public double lIiiIiIlilli() {
      return this.IliIIIlIil;
   }

   public int IIIllIIliIIl() {
      return this.iliIIIlIil;
   }

   public double[] liiiIIllIl() {
      return this.IIiIIIlIil;
   }

   public double IilliliilIIi() {
      return this.iIiIIIlIil;
   }

   @Override
   public String toString() {
      return IlIlllIlilIl<"IlIlllIlilIl","4om2MOMNtU4izEn8TH2ZE7/tui/eVfyviXKPWF2wG1E6RVB4dvSeFA==">()
         + Arrays.toString(this.iilIIIlIil)
         + IlIlllIlilIl<"IlIlllIlilIl","3EPmaX2wrdwb1dzQ1dRJUxSVI2683bjl2mmwWsVTLvuOWzeZAWc=">()
         + Arrays.toString(this.IIiIIIlIil)
         + IlIlllIlilIl<"IlIlllIlilIl","DFyhtTNkLUOaatpTpmxo7URwf2Q9+ynrgpbyO/CxkvI+qVB/">()
         + this.lIiIIIlIil
         + IlIlllIlilIl<"IlIlllIlilIl","eYdgWno4ei/mTLH1LLhaBtaUerAFy/oRlHRBz5U2WENb7Q4v">()
         + this.iIiIIIlIil
         + IlIlllIlilIl<"IlIlllIlilIl","UHM3mLYexeNvDIL+AcQ7DcKb/DKW5xkgT2V+Fa8QKelJ4OQ=">()
         + this.IliIIIlIil
         + IlIlllIlilIl<"IlIlllIlilIl","FDr3rTPdX7HwVPzNoGCS0xYKg0GhPdSzlHX1Cs/KgX1agQ==">()
         + this.lliIIIlIil
         + IlIlllIlilIl<"IlIlllIlilIl","kS50aFFP887ncSnVecQBvX0MoKmqW5YTOBZRhmB3mlk=">()
         + this.iliIIIlIil
         + IlIlllIlilIl<"IlIlllIlilIl","AMwymhEol8vgs4cB3tdJbV7PYHIzBfnpwkBNNe0=">();
   }

   public double iliIiiliiiii() {
      return this.lliIIIlIil;
   }
}
