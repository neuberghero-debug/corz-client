package gg.corz;

import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2902.class_2903;

public final class illIIiIlIilIIiIl {
   public static lliIiIililiIiIil iIlIlllllill(IIiIIlilIiIIli body) {
      return (ey, az, ay, ez, bodyx, ex) -> body.Iiiiliiiiiii(
               new class_243(ey, az, ay), new class_2338(ez, bodyx, ex), Double.longBitsToDouble(6024705916909846354L ^ 1409079248808509266L)
            )
            != null;
   }

   public static boolean IliIlllilIi(lIilIiliIilIil c, int y, int z, int x) {
      long var7 = 2611797854706107829L;
      long var9 = -7965195538276792607L;
      var7 ^= ((long)c.IliIlllilIi(y, z - 1, x) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)c.IliIlllilIi(y, z, x) ^ var7) & -1L >>> 32;
      var9 ^= ((long)c.IliIlllilIi(y, z + 1, x) << 32 ^ var9) & -1L << 32;
      if (lIilIiliIilIil.IilliliilIIi((int)(var7 >>> 32)) && lIilIiliIilIil.iIlIlllllill((int)var7) && lIilIiliIilIil.iIlIlllllill((int)(var9 >>> 32))) {
         return lIilIiliIilIil.liiiIIllIl(
               (int)var7 | (int)(var9 >>> 32), ((1805459654 >>> 31 | 1805459654 << 1) >>> 23 | (1805459654 >>> 31 | 1805459654 << 1) << 9) ^ 1954748592
            )
            ? false
            : !lIilIiliIilIil.IIIllIIliIIl(c, y, z, x) && !IiIliillliIliill.lIiiIiIlilli(c, y, z, x);
      } else {
         return false;
      }
   }

   public static class_2338 liiiIIllIl(lIilIiliIilIil c, class_1937 x, int w, int z) {
      long var5 = 3308690438440830955L;
      if (x != null && x.method_8398().method_21730(w >> 4, z >> 4) != null) {
         var5 ^= ((long)x.method_8624(class_2903.field_13203, w, z) << 32 ^ var5) & -1L << 32;
         return IliIlllilIi(c, w, (int)(var5 >>> 32), z) ? new class_2338(w, (int)(var5 >>> 32), z) : null;
      } else {
         return null;
      }
   }

   public static IiIilIIiliIilIIi IilliliilIIi(lIilIiliIilIil c) {
      return (z, x, cx) -> lIiiIiIlilli(c, z, x, cx);
   }

   private illIIiIlIilIIiIl() {
   }

   public static int lIiiIiIlilli(lIilIiliIilIil nearY, int x, int z, int c) {
      for (int var4 = c + 1; var4 >= c - 3 - 1; var4--) {
         int var5 = nearY.IliIlllilIi(x, var4, z);
         int var6 = nearY.IliIlllilIi(x, var4 + 1, z);
         int var7 = nearY.IliIlllilIi(x, var4 - 1, z);
         if (lIilIiliIilIil.liiiIIllIl(var5 | var6 | var7, 256)) {
            return Integer.MIN_VALUE;
         }

         if (lIilIiliIilIil.iIlIlllllill(var5) && lIilIiliIilIil.iIlIlllllill(var6)) {
            if (lIilIiliIilIil.liiiIIllIl(var5 | var6, 10)) {
               return -2147483647;
            }

            if (!lIilIiliIilIil.liiiIIllIl(var5, 4)) {
               if (lIilIiliIilIil.liiiIIllIl(var7, 1)) {
                  if (lIilIiliIilIil.liiiIIllIl(var7, 26)) {
                     return -2147483647;
                  }

                  return var4;
               }

               if (lIilIiliIilIil.liiiIIllIl(var7, 2)) {
                  return -2147483647;
               }
            } else {
               int var8 = 0;

               while (var8 < 3 && lIilIiliIilIil.liiiIIllIl(nearY.IliIlllilIi(x, var4 - var8, z), 4)) {
                  var8++;
               }

               if (var8 > 1) {
                  return -2147483646;
               }

               int var9 = nearY.IliIlllilIi(x, var4 - 1, z);
               if (lIilIiliIilIil.liiiIIllIl(var9, 10)) {
                  return -2147483647;
               }

               if (lIilIiliIilIil.liiiIIllIl(var9, 1)) {
                  return var4;
               }
            }
         }
      }

      return Integer.MIN_VALUE;
   }
}
