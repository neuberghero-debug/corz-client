package gg.corz;

import net.minecraft.class_1799;
import net.minecraft.class_332;

public final class llllIIlilllIIl {
   public static final float lIillliIliIillliIl = 0.55F;
   private static final float IlillliIlllillliIl = 0.8F;

   public static void iIlIlllllill(class_332 ctx, class_1799 y, int x, int size, int stack) {
      float var5 = IliiIilliiIi.IIIllIIliIIl();
      if (var5 >= 0.999F) {
         ctx.method_51427(y, x, size);
      } else if (!(var5 < 0.55F)) {
         float var6 = (var5 - 0.55F) / 0.45F;
         float var7 = 0.8F + 0.19999999F * var6;
         float var8 = (float)x + (float)stack / 2.0F;
         float var9 = (float)size + (float)stack / 2.0F;
         ctx.method_51448().pushMatrix();

         try {
            ctx.method_51448().translate(var8, var9);
            ctx.method_51448().scale(var7, var7);
            ctx.method_51448().translate(-var8, -var9);
            ctx.method_51427(y, x, size);
         } finally {
            ctx.method_51448().popMatrix();
         }
      }
   }

   public static void IliIlllilIi(class_332 y1, int x1, int y2, int argb, int x2, int ctx) {
      long var7 = 7611137474149884541L;
      var7 ^= ((long)IliiIilliiIi.IlIlllIlilIl(ctx) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) >>> 24 != 0) {
         y1.method_25294(x1, y2, argb, x2, (int)(var7 >>> 32));
      }
   }

   public static void liiiIIllIl(class_332 ctx, int y1, int bottom, int top, int y2, int x1, int x2) {
      long var9 = -3227588081031352889L;
      var9 ^= ((long)IliiIilliiIi.IlIlllIlilIl(x1) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)IliiIilliiIi.IlIlllIlilIl(x2) ^ var9) & -1L >>> 32;
      if ((int)(var9 >>> 32) >>> 24 != 0 || (int)var9 >>> 24 != 0) {
         ctx.method_25296(y1, bottom, top, y2, (int)(var9 >>> 32), (int)var9);
      }
   }

   public static void IilliliilIIi(class_332 ctx, class_1799 y, int x, int stack) {
      iIlIlllllill(ctx, y, x, stack, 16);
   }

   private llllIIlilllIIl() {
   }
}
