package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class llIlillilIlill {
   public static List<liIIIiiiIIIi> liiiIIllIl(List<liIIIiiiIIIi> yaw, float candidates, float pitch, String material, String face) {
      long var19 = 5306210764430979468L;
      ArrayList var5 = new ArrayList(yaw);
      ArrayList var6 = new ArrayList();
      long var7 = Long.MIN_VALUE;

      while (!var5.isEmpty()) {
         var19 ^= (9223372032559808512L ^ var19) & -1L << 32;

         for (liIIIiiiIIIi var11 : var5) {
            var19 ^= ((long)Math.min((int)(var19 >>> 32), var11.liiilliiiiiillii) << 32 ^ var19) & -1L << 32;
         }

         liIIIiiiIIIi var21 = null;
         double var22 = Double.MAX_VALUE;

         for (liIIIiiiIIIi var14 : var5) {
            if (var14.liiilliiiiiillii == (int)(var19 >>> 32)) {
               double var15 = var7 == Long.MIN_VALUE
                  ? 0.0
                  : (double)(
                     Math.abs(llIiIiililIiIiil.IiIlliIliiIl(var7) - llIiIiililIiIiil.IiIlliIliiIl(var14.IIlilliilIlillii))
                        + Math.abs(llIiIiililIiIiil.Illlllllilll(var7) - llIiIiililIiIiil.Illlllllilll(var14.IIlilliilIlillii))
                  );
               double var17 = (double)Math.abs(IliIlllilIi(candidates, var14.iililliiIIiillii))
                  + 0.6 * (double)Math.abs(pitch - var14.lIiilliiiIiillii)
                  + (double)(material != null && !material.equals(var14.lllilliiillillii) ? 240 : 0)
                  + (double)(face != null && !face.equals(var14.Iililliililillii) ? 30 : 0)
                  + (double)(var14.iliilliiIiiillii ? 0 : 120)
                  + (double)(var14.Iliilliilliillii ? 4 : 0)
                  + var15 * 4.0;
               if (var17 < var22 || var17 == var22 && (var21 == null || var14.IIlilliilIlillii < var21.IIlilliilIlillii)) {
                  var21 = var14;
                  var22 = var17;
               }
            }
         }

         var6.add(var21);
         var5.remove(var21);
         candidates = var21.iililliiIIiillii;
         pitch = var21.lIiilliiiIiillii;
         material = var21.lllilliiillillii;
         face = var21.Iililliililillii;
         var7 = var21.IIlilliilIlillii;
      }

      return List.copyOf(var6);
   }

   public static List<lIiliiIliIiliiIl> iIlIlllllill(List<liIIIiiiIIIi> ordered) {
      long var7 = -9219916281932771589L;
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      liIIIiiiIIIi var3 = null;

      for (liIIIiiiIIIi var5 : ordered) {
         var7 ^= (
               (long)(
                        var3 != null
                              && Math.abs(llIiIiililIiIiil.IiIlliIliiIl(var5.IIlilliilIlillii) - llIiIiililIiIiil.IiIlliIliiIl(var3.IIlilliilIlillii))
                                    + Math.abs(llIiIiililIiIiil.Illlllllilll(var5.IIlilliilIlillii) - llIiIiililIiIiil.Illlllllilll(var3.IIlilliilIlillii))
                                 == 1
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
         if (var3 != null
            && (
               (int)(var7 >>> 32) == 0
                  || var5.iIlilliiIllillii != var3.iIlilliiIllillii
                  || !var5.lllilliiillillii.equals(var3.lllilliiillillii)
                  || !var5.Iililliililillii.equals(var3.Iililliililillii)
            )) {
            var1.add(new lIiliiIliIiliiIl(var3.iIlilliiIllillii, var3.lllilliiillillii, var3.Iililliililillii, List.copyOf(var2)));
            var2.clear();
         }

         var2.add(var5);
         var3 = var5;
      }

      if (var3 != null) {
         var1.add(new lIiliiIliIiliiIl(var3.iIlilliiIllillii, var3.lllilliiillillii, var3.Iililliililillii, List.copyOf(var2)));
      }

      return List.copyOf(var1);
   }

   public static float IliIlllilIi(float a, float b) {
      float var2 = (b - a) % 360.0F;
      return var2 >= 180.0F ? var2 - 360.0F : (var2 < -180.0F ? var2 + 360.0F : var2);
   }
}
