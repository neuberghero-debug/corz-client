package gg.corz;

import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_5603;
import net.minecraft.class_5606;
import net.minecraft.class_5607;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_630;

public final class lilIIlIiiilIIlIi {
   private static final int liIliiiiil = -724500;
   private static final int IiIliiiiil = 64;
   private static final int IIlliiiiil = -3924434;
   private static final int lIlliiiiil = -6679518;
   private static final int iiIliiiiil = -2501428;
   public static final float ilIliiiiil = 0.88F;
   private static boolean iIlliiiiil;
   static final class_2960 llIliiiiil = class_2960.method_60655(
      iliIiiliiiii<"iliIiiliiiii","VZb6QbqUdWkBwdZ+qL9XNlJ0fLIDLZw5qhWe8I56B86jLS8DdyI=">(),
      iliIiiliiiii<"iliIiiliiiii","y7ojS76I9Wl6Fa2hL2SYl17Nz+b1usr+Y6QS58907gzEOL+rxOQxFynH9vHW">()
   );

   private static void iIlIlllllill(class_1011 img, int base, int y0, int shade, int w, int h, int x0) {
      long var11 = 8762578084858199115L;
      long var13 = 590498502384450984L;
      var11 ^= ((long)y0 << 32 ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < y0 + w) {
         for (var11 ^= ((long)base ^ var11) & -1L >>> 32; (int)var11 < base + shade; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var17 = var13 ^ ((long)((int)var11 * 73856093 ^ (int)(var11 >>> 32) * 19349663) << 32 ^ var13) & -1L << 32;
            var13 = var17 ^ ((long)(((int)(var17 >>> 32) ^ (int)(var17 >>> 32) >>> 13) * 1540483477) << 32 ^ var17) & -1L << 32;
            float var10 = (float)((int)(var13 >>> 32) >>> 8 & 0xFF) / 255.0F * 0.35F;
            img.method_61941((int)var11, (int)(var11 >>> 32), IilliliilIIi(h, x0, var10));
         }

         var11 += 4294967296L;
      }
   }

   private static int IilliliilIIi(int a, int t, float b) {
      long var6 = 7790914671356282394L;
      long var8 = -962812471217149087L;
      var6 ^= ((long)((int)((float)(a >> 16 & 0xFF) + (float)((t >> 16 & 0xFF) - (a >> 16 & 0xFF)) * b)) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)((int)((float)(a >> 8 & 0xFF) + (float)((t >> 8 & 0xFF) - (a >> 8 & 0xFF)) * b)) ^ var6) & -1L >>> 32;
      var8 ^= ((long)((int)((float)(a & 0xFF) + (float)((t & 0xFF) - (a & 0xFF)) * b)) << 32 ^ var8) & -1L << 32;
      return 0xFF000000 | (int)(var6 >>> 32) << 16 | (int)var6 << 8 | (int)(var8 >>> 32);
   }

   public static class_630 IliIlllilIi() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      class_5610 var2 = var1.method_32117(
         iliIiiliiiii<"iliIiiliiiii","6x+GLdXBaGjJ0/tSatHp7yT5hJAKPppjY2BbTnPiXw==">(),
         class_5606.method_32108()
            .method_32101(0, 0)
            .method_32097(-4.5F, -10.75F, -4.5F, 9.0F, 2.0F, 9.0F)
            .method_32101(0, 11)
            .method_32097(-4.0F, -13.5F, -4.0F, 8.0F, 3.0F, 8.0F),
         class_5603.field_27701
      );
      class_5610 var3 = var2.method_32117(
         iliIiiliiiii<"iliIiiliiiii","CzqvY5CbaBYPMevMjZeF2B4LUuXIKJ8hjKcUEFot3Q==">(),
         class_5606.method_32108().method_32101(0, 22).method_32097(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F),
         class_5603.method_32091(0.4F, -13.2F, 0.0F, 0.0F, 0.0F, 0.22F)
      );
      class_5610 var4 = var3.method_32117(
         iliIiiliiiii<"iliIiiliiiii","/AQb4w8rpf1mzJomUeE0LDfuSbR7QSdZBcMG9C+L4Q==">(),
         class_5606.method_32108().method_32101(0, 31).method_32097(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F),
         class_5603.method_32091(0.6F, -2.7F, 0.0F, 0.0F, 0.0F, 0.48F)
      );
      var4.method_32117(
         iliIiiliiiii<"iliIiiliiiii","IYJ8Z6IyVKKZi8CSMKYIKdI6bvAfi6SBgMxgddDgXA==">(),
         class_5606.method_32108().method_32101(40, 0).method_32097(-1.5F, -2.6F, -1.5F, 3.0F, 3.0F, 3.0F),
         class_5603.method_32091(0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.35F)
      );
      return class_5607.method_32110(var0, 64, 64).method_32109().method_32086(iliIiiliiiii<"iliIiiliiiii","6x+GLdXBaGjJ0/tSatHp7yT5hJAKPppjY2BbTnPiXw==">());
   }

   private lilIIlIiiilIIlIi() {
   }

   public static class_2960 liiiIIllIl(class_310 mc) {
      if (!iIlliiiiil) {
         class_1011 var1 = new class_1011(64, 64, true);
         iIlIlllllill(var1, 0, 0, 36, 11, -724500, -2501428);
         iIlIlllllill(var1, 40, 0, 12, 6, -724500, -2501428);
         iIlIlllllill(var1, 0, 11, 32, 11, -3924434, -6679518);
         iIlIlllllill(var1, 0, 22, 24, 9, -3924434, -6679518);
         iIlIlllllill(var1, 0, 31, 16, 7, -3924434, -6679518);
         mc.method_1531()
            .method_4616(llIliiiiil, new class_1043(() -> iliIiiliiiii<"iliIiiliiiii","kajHcMA4nFZiAYnqS5O7tAGNR/GQLpoIc/mbwnhd6Uwrwj9BTcNMqgp4">(), var1));
         iIlliiiiil = true;
      }

      return llIliiiiil;
   }
}
