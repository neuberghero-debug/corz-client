package gg.corz;

import java.util.Arrays;

public final class lIiIIIiiIiIIIi {
   public static final int lIiilIiliiIiilIili = 256;
   public static final int iililIiliIIiilIili = 16;

   private lIiIIIiiIiIIIi() {
   }

   public static int IliIlllilIi(boolean[] b, int[] sink, int[] used, int[] a, boolean[] mask, lliiiiIliliiiiIl c) {
      long var17 = 5650457065368054507L;
      long var19 = -4118467659235024214L;
      long var21 = -3001766398809702954L;
      long var23 = -5588502189386581885L;
      long var15 = -2365572232909948088L;
      Arrays.fill(mask, 0, 256, false);
      var15 ^= (0L ^ var15) & -1L << 32;

      for (var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < 16; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         var17 ^= (0L ^ var17) & -1L << 32;

         while ((int)(var17 >>> 32) < 16) {
            var17 ^= ((long)((int)var15 * 16 + (int)(var17 >>> 32)) ^ var17) & -1L >>> 32;
            if (b[(int)var17] && !mask[(int)var17]) {
               var19 ^= (4294967296L ^ var19) & -1L << 32;

               while ((int)(var17 >>> 32) + (int)(var19 >>> 32) < 16 && liiiIIllIl(b, sink, used, a, mask, (int)var17, (int)var17 + (int)(var19 >>> 32))) {
                  var19 += 4294967296L;
               }

               label62:
               for (var19 ^= (1L ^ var19) & -1L >>> 32; (int)var15 + (int)var19 < 16; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                  var21 ^= ((long)((int)var17 + (int)var19 * 16) << 32 ^ var21) & -1L << 32;

                  for (var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var19 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                     if (!liiiIIllIl(b, sink, used, a, mask, (int)var17, (int)(var21 >>> 32) + (int)var21)) {
                        break label62;
                     }
                  }
               }

               var21 ^= (0L ^ var21) & -1L << 32;

               while ((int)(var21 >>> 32) < (int)var19) {
                  var21 ^= ((long)((int)var17 + (int)(var21 >>> 32) * 16) ^ var21) & -1L >>> 32;

                  for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)(var19 >>> 32); var23 += 4294967296L) {
                     mask[(int)var21 + (int)(var23 >>> 32)] = true;
                  }

                  var21 += 4294967296L;
               }

               c.rect((int)(var17 >>> 32), (int)var15, (int)(var19 >>> 32), (int)var19, (int)var17);
               var15 += 4294967296L;
            }

            var17 += 4294967296L;
         }
      }

      return (int)(var15 >>> 32);
   }

   private static boolean liiiIIllIl(boolean[] a, int[] ref, int[] c, int[] other, boolean[] used, int b, int mask) {
      return a[mask] && !used[mask] && ref[mask] == ref[b] && c[mask] == c[b] && other[mask] == other[b];
   }
}
