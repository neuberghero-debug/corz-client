package gg.corz;

import net.minecraft.class_1058;
import net.minecraft.class_1087;
import net.minecraft.class_10889;
import net.minecraft.class_11515;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2464;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2682;
import net.minecraft.class_324;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_4696;
import net.minecraft.class_5819;

final class IilIiIIililIiIIi {
   private final int[] IilIlliiil = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
   final int IIlIlliiil;
   final boolean llIIlliiil;
   final int iiIIlliiil;
   final float[] IllIlliiil;
   final class_1087 lIlIlliiil;
   final boolean liIIlliiil;
   final IlIliIilllIliIil illIlliiil;
   static final IilIiIIililIiIIi iIIIlliiil = new IilIiIIililIiIIi();
   final boolean iIlIlliiil;
   final boolean IiIIlliiil;
   final boolean ilIIlliiil;
   final class_2680 IlIIlliiil = class_2246.field_10124.method_9564();
   final class_1058 lllIlliiil;

   private static float iliIiiliiiii(double v) {
      return (float)(v < 0.0 ? 0.0 : (v > 1.0 ? 1.0 : v));
   }

   private static boolean iIlIlllllill(class_1087 m, class_5819 random) {
      long var8 = -3198895296494708940L;

      try {
         random.method_43052(42L);

         for (class_10889 var3 : m.method_68512(random)) {
            if (!var3.method_68509(null).isEmpty()) {
               return true;
            }

            class_2350[] var4 = IiIlllllliIlllll.lIlIIiIill;
            var8 ^= ((long)var4.length << 32 ^ var8) & -1L << 32;

            for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
               class_2350 var7 = var4[(int)var8];
               if (!var3.method_68509(var7).isEmpty()) {
                  return true;
               }
            }
         }
      } catch (Throwable var10) {
      }

      return false;
   }

   private static class_1058 lIiiIiIlilli(class_1087 env, class_2680 m, IllliIIilllliIIi st) {
      try {
         class_1058 var3 = env.method_68511();
         if (var3 != null) {
            return var3;
         }
      } catch (Throwable var5) {
      }

      try {
         return st.iIlIlllllill().method_3339(m);
      } catch (Throwable var4) {
         return null;
      }
   }

   int IliIlllilIi(int index, class_324 colors) {
      long var5 = 2754254498710785846L;
      if (index >= 0 && index < this.IilIlliiil.length && this.IilIlliiil[index] != Integer.MIN_VALUE) {
         return this.IilIlliiil[index];
      } else {
         try {
            var5 ^= ((long)colors.method_1697(this.IlIIlliiil, null, null, index) << 32 ^ var5) & -1L << 32;
         } catch (Throwable var7) {
            var5 ^= (-4294967296L ^ var5) & -1L << 32;
         }

         var5 ^= ((long)((int)(var5 >>> 32) == -1 ? 16777215 : (int)(var5 >>> 32) & 16777215) ^ var5) & -1L >>> 32;
         if (index >= 0 && index < this.IilIlliiil.length) {
            this.IilIlliiil[index] = (int)var5;
         }

         return (int)var5;
      }
   }

   private static int liiiIIllIl(class_2680 st) {
      try {
         class_3610 var1 = st.method_26227();
         if (var1 == null || var1.method_15769()) {
            return 0;
         }

         if (var1.method_15767(class_3486.field_15517)) {
            return 1;
         }

         if (var1.method_15767(class_3486.field_15518)) {
            return 2;
         }
      } catch (Throwable var2) {
      }

      return 0;
   }

   private static float[] IilliliilIIi(class_2680 st) {
      long var6 = 2299273555744152000L;

      try {
         class_265 var1 = st.method_26218(class_2682.field_12294, class_2338.field_10980);
         if (var1 != null && !var1.method_1110()) {
            class_238 var2 = var1.method_1107();
            float[] var3 = new float[]{
               iliIiiliiiii(var2.field_1323),
               iliIiiliiiii(var2.field_1322),
               iliIiiliiiii(var2.field_1321),
               iliIiiliiiii(var2.field_1320),
               iliIiiliiiii(var2.field_1325),
               iliIiiliiiii(var2.field_1324)
            };

            for (long var9 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var9 >>> 32) < 3; var9 += 4294967296L) {
               if (var3[(int)(var9 >>> 32) + 3] - var3[(int)(var9 >>> 32)] < 0.0625F) {
                  float var5 = (var3[(int)(var9 >>> 32)] + var3[(int)(var9 >>> 32) + 3]) * 0.5F;
                  var3[(int)(var9 >>> 32)] = Math.max(0.0F, var5 - 0.03125F);
                  var3[(int)(var9 >>> 32) + 3] = Math.min(1.0F, var3[(int)(var9 >>> 32)] + 0.0625F);
               }
            }

            return var3;
         } else {
            return IiIlllllliIlllll.lilIIiIill;
         }
      } catch (Throwable var8) {
         return IiIlllllliIlllll.lilIIiIill;
      }
   }

   IilIiIIililIiIIi(class_2680 random, IllliIIilllliIIi env, class_5819 st) {
      long var8 = -537388296806103081L;
      super();
      this.IilIlliiil = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      this.IlIIlliiil = random;
      this.llIIlliiil = false;
      this.ilIIlliiil = random.method_26216();
      this.iiIIlliiil = random.method_26213();
      this.IIlIlliiil = liiiIIllIl(random);
      var8 ^= ((long)(random.method_26217() != class_2464.field_11455 ? 1 : 0) << 32 ^ var8) & -1L << 32;
      class_1087 var5 = null;
      if ((int)(var8 >>> 32) != 0) {
         try {
            var5 = env.iIlIlllllill().method_3335(random);
         } catch (Throwable var11) {
         }
      }

      this.lIlIlliiil = var5;
      this.IiIIlliiil = var5 != null;

      class_11515 var6;
      try {
         var6 = class_4696.method_23679(random);
      } catch (Throwable var10) {
         var6 = class_11515.field_60923;
      }

      this.liIIlliiil = var6 == class_11515.field_60926 || var6 == class_11515.field_60927;
      var8 ^= ((long)(var5 != null && !iIlIlllllill(var5, st) ? 1 : 0) ^ var8) & -1L >>> 32;
      this.iIlIlliiil = (boolean)((int)var8);
      this.IllIlliiil = (int)var8 != 0 ? IilliliilIIi(random) : IiIlllllliIlllll.lilIIiIill;
      this.lllIlliiil = (int)var8 != 0 ? lIiiIiIlilli(var5, random, env) : null;
      this.illIlliiil = (int)var8 != 0 && env.IIIllIIliIIl() != null ? env.IIIllIIliIIl().liiiIIllIl(random) : null;
   }

   private IilIiIIililIiIIi() {
      this.llIIlliiil = true;
      this.ilIIlliiil = false;
      this.IiIIlliiil = false;
      this.liIIlliiil = false;
      this.iiIIlliiil = 0;
      this.IIlIlliiil = 0;
      this.lIlIlliiil = null;
      this.iIlIlliiil = false;
      this.IllIlliiil = IiIlllllliIlllll.lilIIiIill;
      this.lllIlliiil = null;
      this.illIlliiil = null;
   }
}
