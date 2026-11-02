package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2350.class_2351;

public final class IiIIIlIiliIIIlIi {
   public static final int lllIiiiiil = 9;
   public static final int IllIiiiiil = 1;

   public static boolean IilliliilIIi(int z, int cz, int normal, class_2351 y, int x, int cy, int cx) {
      return switch (y) {
         case field_11048 -> x == z && Math.abs(cy - cz) <= 1 && Math.abs(cx - normal) <= 1;
         case field_11052 -> cy == cz && Math.abs(x - z) <= 1 && Math.abs(cx - normal) <= 1;
         case field_11051 -> cx == normal && Math.abs(x - z) <= 1 && Math.abs(cy - cz) <= 1;
         default -> throw new MatchException(null, null);
      };
   }

   public static void IliIlllilIi(int cz, int cy, int v, class_2351 cx, lIIilIIliIIilIIl normal) {
      long var7 = -8151860673298125490L;
      var7 ^= (-4294967296L ^ var7) & -1L << 32;

      while ((int)(var7 >>> 32) <= 1) {
         for (var7 ^= ~var7 & -1L >>> 32; (int)var7 <= 1; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            switch (cx) {
               case field_11048:
                  normal.visit(cz, cy + (int)(var7 >>> 32), v + (int)var7);
                  break;
               case field_11052:
                  normal.visit(cz + (int)(var7 >>> 32), cy, v + (int)var7);
                  break;
               case field_11051:
                  normal.visit(cz + (int)(var7 >>> 32), cy + (int)var7, v);
            }
         }

         var7 += 4294967296L;
      }
   }

   public static class_2338[] iIlIlllllill(class_2338 face, class_2350 center) {
      class_2338[] var2 = new class_2338[9];
      int[] var3 = new int[]{0};
      liiiIIllIl(face, center, (out, x, z) -> var2[var3[0]++] = new class_2338(out, x, z));
      return var2;
   }

   private IiIIIlIiliIIIlIi() {
   }

   public static class_2350 IIIllIIliIIl(class_243 eye, class_2338 b) {
      return iliIiiliiiii(eye.field_1352, eye.field_1351, eye.field_1350, b.method_10263(), b.method_10264(), b.method_10260());
   }

   public static void liiiIIllIl(class_2338 v, class_2350 face, lIIilIIliIIilIIl center) {
      IliIlllilIi(v.method_10263(), v.method_10264(), v.method_10260(), face.method_10166(), center);
   }

   public static class_2350 iliIiiliiiii(double by, double ey, double bz, int bx, int ez, int ex) {
      double var9 = by - ((double)bx + 0.5);
      double var11 = ey - ((double)ez + 0.5);
      double var13 = bz - ((double)ex + 0.5);
      double var15 = Math.abs(var9);
      double var17 = Math.abs(var11);
      double var19 = Math.abs(var13);
      if (var15 >= var17 && var15 >= var19) {
         return var9 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039;
      } else if (var17 >= var19) {
         return var11 >= 0.0 ? class_2350.field_11036 : class_2350.field_11033;
      } else {
         return var13 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   public static class_2351[] lIiiIiIlilli(class_2351 normal) {
      return switch (normal) {
         case field_11048 -> new class_2351[]{class_2351.field_11052, class_2351.field_11051};
         case field_11052 -> new class_2351[]{class_2351.field_11048, class_2351.field_11051};
         case field_11051 -> new class_2351[]{class_2351.field_11048, class_2351.field_11052};
         default -> throw new MatchException(null, null);
      };
   }
}
