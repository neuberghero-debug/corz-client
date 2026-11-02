package gg.corz;

import java.util.function.LongPredicate;

public final class iIIIIliIlIIIli {
   public static final int lIlllliiiiIlllliii = 3;
   public static final int illllliiiIilllliii = 3;
   public static final int Illllliiilllllliii = 2;

   public static iIIIIiIlIlIIIiIl IliIlllilIi(iiiiIlIIIIll s) {
      if (s.liiiIIllIl() > 0) {
         return iIIIIiIlIlIIIiIl.iIlIlIiIll;
      } else if (s.lIiiIiIlilli() <= 0) {
         return iIIIIiIlIlIIIiIl.IilIlIiIll;
      } else if (s.iIlIlllllill()) {
         return iIIIIiIlIlIIIiIl.IllIlIiIll;
      } else {
         return s.IilliliilIIi() ? iIIIIiIlIlIIIiIl.lllIlIiIll : iIIIIiIlIlIIIiIl.illIlIiIll;
      }
   }

   public static int lIiiIiIlilli(Iterable<Long> componentContains, LongPredicate missingNear) {
      long var9 = 9215837715588460537L;
      long var11 = -2654456756494079250L;
      var9 ^= (0L ^ var9) & -1L << 32;

      for (long var4 : componentContains) {
         var9 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var4) ^ var9) & -1L >>> 32;
         var11 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var4) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)llIiIiililIiIiil.Illlllllilll(var4) ^ var11) & -1L >>> 32;
         if (iliIiiliiiii((int)var9, (int)(var11 >>> 32), (int)var11, missingNear)) {
            var9 += 4294967296L;
         }
      }

      return (int)(var9 >>> 32);
   }

   private iIIIIliIlIIIli() {
   }

   public static boolean liiiIIllIl(iIIIIiIlIlIIIiIl v) {
      return v == iIIIIiIlIlIIIiIl.IllIlIiIll || v == iIIIIiIlIlIIIiIl.lllIlIiIll || v == iIIIIiIlIlIIIiIl.illIlIiIll;
   }

   public static boolean IilliliilIIi(int dz, int dy, int dx) {
      return Math.abs(dz) <= 3 && Math.abs(dx) <= 3 && dy >= -2 && dy <= 3;
   }

   public static boolean iIlIlllllill(iIIIIiIlIlIIIiIl v) {
      return v == iIIIIiIlIlIIIiIl.IllIlIiIll || v == iIIIIiIlIlIIIiIl.lllIlIiIll;
   }

   public static boolean iliIiiliiiii(int y, int componentContains, int z, LongPredicate x) {
      long var7 = 8109185399383942573L;
      long var9 = -7902826439027493624L;
      var7 ^= (-12884901888L ^ var7) & -1L << 32;

      while ((int)(var7 >>> 32) <= 2) {
         for (var7 ^= (-3L ^ var7) & -1L >>> 32; (int)var7 <= 3; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            for (var9 ^= (-12884901888L ^ var9) & -1L << 32; (int)(var9 >>> 32) <= 3; var9 += 4294967296L) {
               if (x.test(llIiIiililIiIiil.IIIllIIliIIl(y + (int)var7, componentContains + (int)(var7 >>> 32), z + (int)(var9 >>> 32)))) {
                  return true;
               }
            }
         }

         var7 += 4294967296L;
      }

      return false;
   }
}
