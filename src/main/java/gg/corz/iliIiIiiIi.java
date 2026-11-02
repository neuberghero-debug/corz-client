package gg.corz;

import java.util.function.LongPredicate;

public final class iliIiIiiIi {
   public static iIiIIIliIliIIIli IliIlllilIi(long to, long from, LongPredicate passable, LongPredicate standable) {
      long var17 = -8517689005528160051L;
      long var19 = -5221385308540576212L;
      long var21 = -4859664273916913194L;
      long var23 = 2700911524926396464L;
      long var25 = -8756039062568863273L;
      long var27 = -692163224992156596L;
      var17 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(to) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(to) ^ var17) & -1L >>> 32;
      var19 ^= ((long)llIiIiililIiIiil.Illlllllilll(to) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(from) ^ var19) & -1L >>> 32;
      var21 ^= ((long)llIiIiililIiIiil.Illlllllilll(from) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)((int)(var17 >>> 32) + Integer.signum((int)var19 - (int)(var17 >>> 32))) ^ var21) & -1L >>> 32;
      var23 ^= ((long)((int)(var19 >>> 32) + Integer.signum((int)(var21 >>> 32) - (int)(var19 >>> 32))) << 32 ^ var23) & -1L << 32;
      var23 ^= (
            (long)(
                  passable.test(llIiIiililIiIiil.IIIllIIliIIl((int)(var17 >>> 32), (int)var17 + 1, (int)(var19 >>> 32)))
                        && passable.test(llIiIiililIiIiil.IIIllIIliIIl((int)(var17 >>> 32), (int)var17 + 2, (int)(var19 >>> 32)))
                     ? 1
                     : 0
               )
               ^ var23
         )
         & -1L >>> 32;
      var25 ^= (0L ^ var25) & -1L << 32;

      for (var25 ^= (1L ^ var25) & -1L >>> 32; (int)var25 <= 2; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         if (standable.test(llIiIiililIiIiil.IIIllIIliIIl((int)var21, (int)var17 - (int)var25, (int)(var23 >>> 32)))) {
            var25 ^= (4294967296L ^ var25) & -1L << 32;
            break;
         }
      }

      var25 ^= ((long)((int)(var25 >>> 32) != 0 && !standable.test(llIiIiililIiIiil.IIIllIIliIIl((int)var21, (int)var17, (int)(var23 >>> 32))) ? 1 : 0) ^ var25)
         & -1L >>> 32;

      for (long var40 = var27 ^ (0L ^ var27) & -1L << 32; (int)(var40 >>> 32) <= 2; var40 += 4294967296L) {
         var25 ^= (
               (long)(
                     (int)var25
                        & (
                           passable.test(llIiIiililIiIiil.IIIllIIliIIl((int)var21, (int)var17 + (int)(var40 >>> 32), (int)(var23 >>> 32)))
                                 && passable.test(llIiIiililIiIiil.IIIllIIliIIl((int)var19, (int)var17 + (int)(var40 >>> 32), (int)(var21 >>> 32)))
                              ? 1
                              : 0
                        )
                  )
                  ^ var25
            )
            & -1L >>> 32;
      }

      return new iIiIIIliIliIIIli((boolean)((int)var23), (boolean)((int)var25));
   }

   private iliIiIiiIi() {
   }
}
