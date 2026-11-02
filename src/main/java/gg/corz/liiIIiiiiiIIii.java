package gg.corz;

public final class liiIIiiiiiIIii {
   public static final int lIliillIIl = 3;

   public static Illillllil IliIlllilIi(Illillllil base, llIIIiIlilIIIiIl flow) {
      return new Illillllil() {
         @Override
         public boolean liiiIIllIl(int x, int z, int y) {
            return base.liiiIIllIl(x, z, y);
         }

         @Override
         public boolean solid(int x, int y, int z) {
            return flow.has(x, y, z) || base.solid(x, y, z);
         }

         @Override
         public boolean IilliliilIIi(int z, int y, int x) {
            return base.IilliliilIIi(z, y, x);
         }

         @Override
         public boolean IliIlllilIi(int y, int x, int z) {
            return !flow.has(y, x, z) && base.IliIlllilIi(y, x, z);
         }
      };
   }

   public static boolean liiiIIllIl(Illillllil x, llIIIiIlilIIIiIl flow, int z, int y, int base) {
      long var7 = -6691855693871290075L;
      Illillllil var5 = IliIlllilIi(x, flow);
      var7 ^= (171798691840L ^ var7) & -1L << 32;
      return iIlilIilIllilIil.IlIlllIlilIl(x, z, y, base, (int)(var7 >>> 32)) >= (int)(var7 >>> 32)
            && iIlilIilIllilIil.IlIlllIlilIl(var5, z, y, base, (int)(var7 >>> 32)) < (int)(var7 >>> 32)
         || iIlilIilIllilIil.IIlilIliiIli(x, var5, z, y, base);
   }

   public static boolean IilliliilIIi(boolean finalCleanup, int otherOwnedTemps) {
      return finalCleanup && otherOwnedTemps == 0;
   }

   public static boolean iIlIlllllill(boolean refusalsSoFar, int otherSources, int cutsOff) {
      return refusalsSoFar && otherSources > 0 && cutsOff < 3;
   }

   private liiIIiiiiiIIii() {
   }
}
