package gg.corz;

import net.minecraft.class_332;
import net.minecraft.class_4587;

final class iiilIillIIIiIill {
   static final int iilllilill = -12966890;
   static final int lilllilill = 859843098;
   static final int Iilllilill = -150996754;

   private iiilIillIIIiIill() {
   }

   static void IliIlllilIi(class_332 right, String ay, float ctx, float ax, float scale, float text, boolean alpha, float pop) {
      long var23 = 6163067433094882513L;
      if (!(text <= 0.01F) && ay != null && !ay.isEmpty()) {
         float var8 = llilliilililliil.IiIIlliIIl(ay, scale);
         float var9 = llilliilililliil.IIiilIiiiIii().IilliliilIIi() * scale;
         float var10 = 5.5F;
         float var11 = 3.2F;
         float var12 = 5.0F;
         float var13 = var8 + var10 * 2.0F;
         float var14 = var9 + var11 * 2.0F;
         float var15 = alpha ? ctx - 7.0F : ctx - var13 + 7.0F;
         float var16 = ax - var14 - var12;
         class_4587 var17 = IIIiiIillIIiiIil.liiiIIllIl();
         var17.method_22903();
         var17.method_46416(ctx, ax, 0.0F);
         var17.method_22905(pop, pop, 1.0F);
         var17.method_46416(-ctx, -ax, 0.0F);
         float var18 = IliiIilliiIi.IilliliilIIi(text);

         try {
            IilIliillilIliil.IliIlllilIi();
            var23 ^= ((long)IliiIilliiIi.IlIlllIlilIl(-150996754) << 32 ^ var23) & -1L << 32;
            var23 ^= ((long)IliiIilliiIi.IlIlllIlilIl(859843098) ^ var23) & -1L >>> 32;
            float var21 = alpha ? var15 + 7.0F : var15 + var13 - 13.0F;
            IilIliillilIliil.IlIlllIlilIl(
               var21 - 0.6F, var16 + var14 - 0.8F, (int)var23, var21 + 6.6F, var16 + var14 - 0.8F, (int)var23, ctx, ax + 0.6F, (int)var23
            );
            IilIliillilIliil.liiiIIllIl();
            IIIiiIillIIiiIil.Ililllililil(right, var15, var16, var13, var14, Math.min(var14 / 2.0F, 6.0F), -150996754, 859843098);
            IilIliillilIliil.IliIlllilIi();
            IilIliillilIliil.IlIlllIlilIl(
               var21 + 0.4F,
               var16 + var14 - 0.45F,
               (int)(var23 >>> 32),
               var21 + 5.6F,
               var16 + var14 - 0.45F,
               (int)(var23 >>> 32),
               ctx,
               ax - 0.6F,
               (int)(var23 >>> 32)
            );
            IilIliillilIliil.liiiIIllIl();
            llilliilililliil.lIlIliIlIl(ay, var15 + var10, llilliilililliil.IllIllllIl(var16, var14, scale), scale, -12966890);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var18);
            var17.method_22909();
         }
      }
   }
}
