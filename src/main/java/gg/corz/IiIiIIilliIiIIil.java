package gg.corz;

public final class IiIiIIilliIiIIil {
   private final double iIIiilIIil;
   private double llIiilIIil;
   private final double IlIiilIIil;
   private double ilIiilIIil;

   public int iIlIlllllill(int counts, double unit) {
      long var5 = -6830240262030225768L;
      var5 ^= ((long)IilliliilIIi(counts, unit, this.IlIiilIIil - this.ilIiilIIil) << 32 ^ var5) & -1L << 32;
      this.ilIiilIIil = this.ilIiilIIil + (double)Math.abs((int)(var5 >>> 32)) * unit;
      return (int)(var5 >>> 32);
   }

   private static int IilliliilIIi(int counts, double roomDegrees, double unit) {
      long var8 = -3485731875062037278L;
      if (counts != 0 && roomDegrees > 0.0 && !(unit <= 0.0)) {
         long var5 = (long)Math.floor(unit / roomDegrees + 1.0E-9);
         var8 ^= ((long)((int)Math.min(Math.abs((long)counts), Math.max(0L, var5))) << 32 ^ var8) & -1L << 32;
         return counts < 0 ? -((int)(var8 >>> 32)) : (int)(var8 >>> 32);
      } else {
         return 0;
      }
   }

   public IiIiIIilliIiIIil(double maxPitchDegrees, double maxYawDegrees) {
      this.iIIiilIIil = maxPitchDegrees;
      this.IlIiilIIil = maxYawDegrees;
   }

   public int liiiIIllIl(int counts, double unit) {
      long var5 = -735594130666147144L;
      var5 ^= ((long)IilliliilIIi(counts, unit, this.iIIiilIIil - this.llIiilIIil) << 32 ^ var5) & -1L << 32;
      this.llIiilIIil = this.llIiilIIil + (double)Math.abs((int)(var5 >>> 32)) * unit;
      return (int)(var5 >>> 32);
   }

   public void IliIlllilIi() {
      this.llIiilIIil = 0.0;
      this.ilIiilIIil = 0.0;
   }
}
