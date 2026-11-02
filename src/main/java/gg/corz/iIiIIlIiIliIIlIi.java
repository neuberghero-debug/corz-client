package gg.corz;

import net.minecraft.class_332;

public final class iIiIIlIiIliIIlIi {
   private static final int lIiliiiiil = 5;
   private static final int ililiiiiil = -14473682;
   private static final int Ililiiiiil = -7629919;
   public static final int IIiliiiiil = 10;
   public static final int iilliiiiil = 22;
   private static final int lliliiiiil = -854534;
   private static final int iIiliiiiil = -14012614;

   public static int IliIlllilIi() {
      return 22;
   }

   private iIiIIlIiIliIIlIi() {
   }

   public static int lIiiIiIlilli(int accent, double progress) {
      return iIillliIlillli.Iiiiliiiiiii(accent, progress, -7629919, -854534, -14473682);
   }

   public static void IIIllIIliIIl(class_332 rowY, int rowH, int rightEdge, int progress, int ctx, double alpha, double padRight, double hover) {
      IilliliilIIi(rowY, rowH - ctx - 22, rightEdge + (progress - 10) / 2, alpha, padRight, hover);
   }

   public static int liiiIIllIl() {
      return 10;
   }

   private static double IiIlliIliiIl(double v) {
      return v < 0.0 ? 0.0 : (v > 1.0 ? 1.0 : v);
   }

   public static void iliIiiliiiii(class_332 ctx, int progress, int rowY, int padRight, int rowH, double rightEdge, double hover) {
      IIIllIIliIIl(ctx, progress, rowY, padRight, rowH, rightEdge, hover, 1.0);
   }

   public static void iIlIlllllill(class_332 progress, int ctx, int hover, double trackX, double trackY) {
      IilliliilIIi(progress, ctx, hover, trackX, trackY, 1.0);
   }

   public static boolean IlIlllIlilIl(double my, double padRight, int mx, int margin, int rowY, int rightEdge, int rowH) {
      long var11 = 2974156013161558782L;
      var11 ^= ((long)(mx - rightEdge - 22) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(margin + (rowY - 10) / 2) ^ var11) & -1L >>> 32;
      return my >= (double)((int)(var11 >>> 32) - rowH)
         && my <= (double)((int)(var11 >>> 32) + 22 + rowH)
         && padRight >= (double)((int)var11 - rowH)
         && padRight <= (double)((int)var11 + 10 + rowH);
   }

   public static void IilliliilIIi(class_332 alpha, int trackX, int ctx, double trackY, double progress, double hover) {
      long var23 = -4247986203452926697L;
      long var25 = 7150438882993626055L;
      float var9 = (float)IiIlliIliiIl(hover);
      if (!(var9 <= 0.004F)) {
         double var10 = IiIlliIliiIl(trackY);
         double var12 = IiIlliIliiIl(progress);
         var23 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl << 32 ^ var23) & -1L << 32;
         var23 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-14012614, (int)(var23 >>> 32), var10) ^ var23) & -1L >>> 32;
         if (var12 > 0.004) {
            var23 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)var23, -1, 0.1 * var12) ^ var23) & -1L >>> 32;
         }

         IIIiiIillIIiiIil.lIiiIiIlilli(alpha, trackX, ctx, 22, 10, 5, iIillliIlillli.IlIillIiilIi((int)var23, var9));
         var25 ^= (51539607552L ^ var25) & -1L << 32;
         float var17 = (float)(trackX + 5) + (float)((double)((int)(var25 >>> 32)) * var10);
         float var18 = (float)ctx + 5.0F;
         var25 ^= ((long)lIiiIiIlilli((int)(var23 >>> 32), var10) ^ var25) & -1L >>> 32;
         float var20 = 4.0F;
         float var21 = iIillliIlillli.liiiIIllIl((iIillliIlillli.IIiilIiiiIii((int)(var23 >>> 32)) - 0.62F) / 0.08F);
         float var22 = (float)Math.min(1.0, Math.max(0.0, (var10 - 0.5) * 2.0)) * var21;
         if (var22 > 0.004F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(
               alpha,
               var17 - var20,
               var18 - var20,
               var20 * 2.0F,
               var20 * 2.0F,
               var20,
               iIillliIlillli.IlIillIiilIi(iIillliIlillli.iliIiiliiiii((int)var25, 1509949440, var22), var9)
            );
            IIIiiIillIIiiIil.IlIlllIlilIl(
               alpha,
               var17 - var20 + 1.0F,
               var18 - var20 + 1.0F,
               (var20 - 1.0F) * 2.0F,
               (var20 - 1.0F) * 2.0F,
               var20 - 1.0F,
               iIillliIlillli.IlIillIiilIi((int)var25, var9)
            );
         } else {
            IIIiiIillIIiiIil.IlIlllIlilIl(alpha, var17 - var20, var18 - var20, var20 * 2.0F, var20 * 2.0F, var20, iIillliIlillli.IlIillIiilIi((int)var25, var9));
         }
      }
   }
}
