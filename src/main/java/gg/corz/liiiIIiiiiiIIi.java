package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;

public class liiiIIiiiiiIIi extends ilIllIiIll {
   private boolean IIiilIIiilIiilIIii;
   private final liIliIliiIliIl lililIIiiiililIIii;
   private static final float IiiIlIIiiliiIlIIii = 0.92F;
   private final liIliIliiIliIl IllilIIiilllilIIii;
   private final liIliIliiIliIl IiIilIIiiliIilIIii;
   private Color iilIiIIiiIIiIiIIii;
   private boolean iIiilIIiiIliilIIii;
   private static final Color lIillIIiiiIillIIii = new Color(-7630437, true);
   private final liIliIliiIliIl illilIIiiIililIIii;
   private int lliilIIiiiliilIIii;
   private static final String llIIlIIiiilIIlIIii = "totems";
   private static final float ilIllIIiiIiIllIIii = 8.0F;
   private static final int lIIllIIiiiIIllIIii = 1021659213;
   private String iiiilIIiiIIIIiIIii;
   private int IilIiIIiililIiIIii;
   private int lllIiIIiiillIiIIii;
   private final liIliIliiIliIl llIilIIiiilIilIIii;
   private float ilIIiIIiiIiIIiIIii;
   private IIliiIlllIliiIll lIIIiIIiiiIIIiIIii;
   private static final float iIlllIIiiIllllIIii = 12.0F;
   private static final String[] IilllIIiililllIIii = new String[]{
      IliIlllilIi<"IliIlllilIi","7Cq9ZZQ/ao+uXj92Nl7Q/yUHufOcPLsTmwIhx2U=">(),
      IliIlllilIi<"IliIlllilIi","dBsKnGaMlk1Bb6Hycx+/GSiTsjfF+HCoEhZFsqo=">(),
      IliIlllilIi<"IliIlllilIi","FZIdyEEaT8zdW7ie/1c/1WXaJlI5udLypakkPio=">(),
      IliIlllilIi<"IliIlllilIi","uNb0sgSeGFpVxmKBbipORl0w4N67Zp1cNnRd94o=">(),
      IliIlllilIi<"IliIlllilIi","jof2YOaZiF9yZFgjQv1rQi7hE8DQJAFvGTVhF/8=">(),
      IliIlllilIi<"IliIlllilIi","YQ4RvWtVdprNV6Fj82vlwqHME6j8Sw6BHUGg+x4=">(),
      IliIlllilIi<"IliIlllilIi","TsOpN0ej//pYgMeOaY8QVN5rEEDNUx0wE8rX6po=">(),
      IliIlllilIi<"IliIlllilIi","7ryCJuQr7IXqe1BZNB2yuSY/sCEpkO0Vw5oCEY0=">(),
      IliIlllilIi<"IliIlllilIi","uN9gVsZRJ8INKqUtB1zOs6fYeOkrqJ1cA+DqOB8=">(),
      IliIlllilIi<"IliIlllilIi","8NcQFIppwdSFAt7T7v9jbohBFyhJrWmztYJt1W8=">()
   };
   private final liIliIliiIliIl lIlilIIiiiIlilIIii;
   private static final float lilIlIIiiiilIlIIii = 0.95F;
   private final liIliIliiIliIl iiIilIIiiIIlilIIii;
   private final iiIiiilIIliiil liillIIiiiiillIIii;
   private final iiIiiilIIliiil ilillIIiiIiillIIii;
   private static final float iIiIlIIiiIliIlIIii = 0.15F;
   private static final float liIllIIiiiiIllIIii = 5.0F;
   private final liIliIliiIliIl iIIilIIiiIlIilIIii;
   private static final float lIlIlIIiiiIlIlIIii = 5.0F;
   private static final String lllllIIiiillllIIii = "TOTEMS";
   private static final float lliIlIIiiiliIlIIii = 0.22F;
   private final class_4587 IIIilIIiilIIilIIii;
   private final lliliIIiililiIIi IlillIIiillillIIii = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","ogbjzyw5yoUtb4xdpWNB7IntafQNP9Dpxb+w1+wHx/Oc">(),
      IliIlllilIi<"IliIlllilIi","6+FJe1dF+d2ukokXY2l6uvybMUrfPYI6naz1600N8JERIKlSbM1Y2DimnpTzl8mu4qWZJqUqpcBDM1JiPxVudSuhbdLZYkOc50DN6huAAtdGLD6YEnQmdw==">(),
      IliIlllilIi<"IliIlllilIi","sJCfgT+0n5G9gkfNSL0317YhbtRlNfVOJm1iFruIVqQ=">(),
      IliIlllilIi<"IliIlllilIi","sJCfgT+0n5G9gkfNSL0317YhbtRlNfVOJm1iFruIVqQ=">(),
      IliIlllilIi<"IliIlllilIi","xY8N2ILkw9Jzk6j13ge+E03uNCEGzuHfbTCTEmeFQWxpAQ==">(),
      IliIlllilIi<"IliIlllilIi","ge1cZhTjwQSfip+iNaQOu6pfmTY9H5TrD/SPK9Mz0V8AdL4=">()
   );
   private static final float iiIIlIIiiIIlIlIIii = 6.0F;
   private float iIlIiIIiiIllIiIIii;
   private static final float IlIllIIiillIllIIii = 20.0F;
   private static final class_1799 iilllIIiiIIillIIii = new class_1799(class_1802.field_8288);
   private final float[] IlIIiIIiillIIiIIii;
   private static final float IIiIlIIiilIiIlIIii = 0.7F;
   private float IIlIiIIiilIlIiIIii;
   private String IiiilIIiiliiilIIii;
   private static final float iiiIlIIiiIIIllIIii = 140.0F;
   private static final float IllIlIIiilllIlIIii = 6.0F;
   private static final float IiIIlIIiiliIIlIIii = 16.0F;
   private static final float illIlIIiiIilIlIIii = 8.0F;
   private float liIIiIIiiiiIIiIIii;
   private static final float IIlllIIiilIlllIIii = 12.0F;

   private static void iIlllIllll(class_4587 s, float cy, float cx, float ms) {
      s.method_22903();
      s.method_46416(cy, cx, 0.0F);
      s.method_22905(ms, ms, 1.0F);
      s.method_46416(-cy, -cx, 0.0F);
   }

   private void IIllllIlll(IIliiIlllIliiIll f) {
      if (f != this.lIIIiIIiiiIIIiIIii) {
         this.lIIIiIIiiiIIIiIIii = f;
         float var2 = 0.0F;

         for (int var3 = 0; var3 < 10; var3++) {
            this.IlIIiIIiillIIiIIii[var3] = f.iIlIlllllill(IilllIIiililllIIii[var3]) * 0.95F;
            var2 = Math.max(var2, this.IlIIiIIiillIIiIIii[var3]);
         }

         this.ilIIiIIiiIiIIiIIii = (float)Math.ceil((double)var2);
         this.liIIiIIiiiiIIiIIii = f.iIlIlllllill(IliIlllilIi<"IliIlllilIi","6g1x3I2T9UcC2d5MIxD1U3EOCKrhYgGvUQz72zPhWiyRDw==">()) * 0.7F;
         this.IIlIiIIiilIlIiIIii = llilliilililliil.IllIllllIl(0.0F, 16.0F, 0.95F);
         this.iIlIiIIiiIllIiIIii = llilliilililliil.IllIllllIl(0.0F, 16.0F, 0.7F);
         this.lllIiIIiiillIiIIii = 0;
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      this.lIIlliIIll();
   }

   private void lIilliIill(IIliiIlllIliiIll y, String c, float s, float scale, float f, Color x) {
      this.IIIilIIiilIIilIIii.method_22903();

      try {
         this.IIIilIIiilIIilIIii.method_22905(f, f, 1.0F);
         y.IliIlllilIi(c, s / f, scale / f, x);
      } finally {
         this.IIIilIIiilIIilIIii.method_22909();
      }
   }

   private void iilllIIill(IIliiIlllIliiIll c, String x, float y, float s, Color f) {
      this.IIIilIIiilIIilIIii.method_22903();

      try {
         this.IIIilIIiilIIilIIii.method_22905(0.95F, 0.95F, 1.0F);

         for (int var6 = 0; var6 < x.length(); var6++) {
            int var7 = x.charAt(var6) - '0';
            if (var7 >= 0 && var7 <= 9) {
               c.IliIlllilIi(IilllIIiililllIIii[var7], (y + (this.ilIIiIIiiIiIIiIIii - this.IlIIiIIiillIIiIIii[var7]) / 2.0F) / 0.95F, s / 0.95F, f);
               y += this.ilIIiIIiiIiIIiIIii;
            }
         }
      } finally {
         this.IIIilIIiilIIilIIii.method_22909();
      }
   }

   private static float liIlliiIll(int tgtScale) {
      long var2 = -5500138103200322533L;
      var2 ^= ((long)Math.max(1, Math.round(8.0F * (float)tgtScale / 16.0F)) << 32 ^ var2) & -1L << 32;
      return 16.0F * (float)((int)(var2 >>> 32)) / (float)tgtScale;
   }

   public void IlIllllIll(class_332 ctx) {
      if (Iiiilllliiilll.field_1724 != null && ctx != null) {
         if (this.lliilIIiiiliilIIii < 0) {
            this.lIIlliIIll();
         }

         if (this.lliilIIiiiliilIIii >= 0) {
            CorzClient.fontManager.iIlIlllllill(this.IIIilIIiilIIilIIii);
            IIIiiIillIIiiIil.IliIlllilIi(this.IIIilIIiilIIilIIii);
            double var2 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var4 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var5 = (float)((double)var4 / var2);
            boolean var6 = Math.abs(var5 - 1.0F) > 1.0E-4F;
            int var7 = Iiiilllliiilll.method_22683().method_4486();
            int var8 = Iiiilllliiilll.method_22683().method_4502();
            int var9 = var6 ? Math.round((float)var7 / var5) : var7;
            int var10 = var6 ? Math.round((float)var8 / var5) : var8;
            if (var6) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var9;
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)var10;
            }

            try {
               float var11 = IIililillIililil.ilIllIiIll();
               if (var11 < 0.004F) {
                  return;
               }

               String var12 = this.IlillIIiillillIIii.Iilllilliill();
               boolean var13 = IliIlllilIi<"IliIlllilIi","ge1cZhTjwQSfip+iNaQOu6pfmTY9H5TrD/SPK9Mz0V8AdL4=">().equals(var12)
                  || IliIlllilIi<"IliIlllilIi","sJCfgT+0n5G9gkfNSL0317YhbtRlNfVOJm1iFruIVqQ=">().equals(var12) && !IIililillIililil.liIlliiIll();
               if (var13 != this.iIiilIIiiIliilIIii) {
                  this.iIiilIIiiIliilIIii = var13;
                  this.IIiilIIiilIiilIIii = true;
               }

               if (!var13) {
                  if (this.IIiilIIiilIiilIIii) {
                     this.IIiilIIiilIiilIIii = false;
                     this.illilIIiiIililIIii.IilliliilIIi(0.0);
                     this.illilIIiiIililIIii.lIiiIiIlilli(1.0);
                     this.lililIIiiiililIIii.IilliliilIIi(0.0);
                     this.lililIIiiiililIIii.lIiiIiIlilli(1.0);
                  }

                  float var30 = IliiIilliiIi.IilliliilIIi(var11 * (float)this.illilIIiiIililIIii.iIlIlllllill());

                  try {
                     this.Iillllilll(ctx, var9, var5, var4, var8);
                     return;
                  } finally {
                     IliiIilliiIi.lIiiIiIlilli(var30);
                  }
               }

               float var14 = IliiIilliiIi.IilliliilIIi(var11);

               try {
                  this.ilIllIiIll(ctx, var9, var5, var8, this.iiiIlIIIll());
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var14);
               }
            } finally {
               if (var6) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            }
         }
      }
   }

   private void Iillllilll(class_332 ctx, int realH, float tgtScale, int sw, int factor) {
      IIliiIlllIliiIll var6 = CorzClient.fontRenderer();
      this.IIllllIlll(var6);
      boolean var7 = this.ilillIIiiIiillIIii.Iilllilliill();
      boolean var8 = this.liillIIiiiiillIIii.Iilllilliill();
      float var9 = liIlliiIll(sw);
      int var10 = this.IiiilIIiiliiilIIii.length();
      double var11 = var7 ? 1.0 : 0.0;
      double var13 = var8 && this.lliilIIiiiliilIIii == 0 ? 1.0 : 0.0;
      double var15 = var8 && this.lliilIIiiiliilIIii == 1 ? 1.0 : 0.0;
      int var17 = Math.round(6.0F + var9 + 5.0F + (float)var10 * this.ilIIiIIiiIiIIiIIii + (var7 ? 6.0F + this.liIIiIIiiiiIIiIIii : 0.0F) + 6.0F);
      if (this.lllIiIIiiillIiIIii == 0) {
         this.IiIilIIiiliIilIIii.IilliliilIIi((double)var17);
         this.iiIilIIiiIIlilIIii.IilliliilIIi(var11);
         this.lIlilIIiiiIlilIIii.IilliliilIIi(var13);
         this.IllilIIiilllilIIii.IilliliilIIi(var15);
         this.lllIiIIiiillIiIIii = var17;
      } else if (var17 != this.lllIiIIiiillIiIIii) {
         this.IiIilIIiiliIilIIii.lIiiIiIlilli((double)var17);
         this.lllIiIIiiillIiIIii = var17;
      }

      if (this.iiIilIIiiIIlilIIii.IiIlliIliiIl() != var11) {
         this.iiIilIIiiIIlilIIii.lIiiIiIlilli(var11);
      }

      if (this.lIlilIIiiiIlilIIii.IiIlliIliiIl() != var13) {
         this.lIlilIIiiiIlilIIii.lIiiIiIlilli(var13);
      }

      if (this.IllilIIiilllilIIii.IiIlliIliiIl() != var15) {
         this.IllilIIiilllilIIii.lIiiIiIlilli(var15);
      }

      float var18 = (float)this.IiIilIIiiliIilIIii.iIlIlllllill();
      float var19 = ((float)factor - 22.0F) / tgtScale - IIililillIililil.iilllIIill();
      float var20 = (float)Math.round((float)(realH - var17) / 2.0F);
      float var21 = var19 - Math.max(16.0F, IIililillIililil.iIiIilIliIil() + 6.0F) - 16.0F;
      float var22 = IIililillIililil.IiiiIlliiiIl(IliIlllilIi<"IliIlllilIi","S0u629yYzQ1NxEU4X8uplQReCvfRvwmLfU9xIxnk/mhPUg==">());
      float var23 = IIililillIililil.iiiiIlIIIIll(IliIlllilIi<"IliIlllilIi","S0u629yYzQ1NxEU4X8uplQReCvfRvwmLfU9xIxnk/mhPUg==">());
      iiIliiiIIlliii var24 = IIililillIililil.ilIIllIiIIll(
         IliIlllilIi<"IliIlllilIi","S0u629yYzQ1NxEU4X8uplQReCvfRvwmLfU9xIxnk/mhPUg==">(), var20 + var22, var21 + var23, (float)var17, 16.0F
      );
      float var25 = var20 + (float)Math.round(var22) + ((float)var17 - var18) / 2.0F;
      float var26 = var21 + (float)Math.round(var23);
      float var27 = var25 + var18 / 2.0F;
      float var28 = var26 + 8.0F;
      float var29 = 0.92F + 0.07999998F * (float)this.lililIIiiiililIIii.iIlIlllllill();
      boolean var30 = Math.abs(var29 - 1.0F) > 5.0E-4F;
      if (var24 != null) {
         var24.IilliliilIIi(this.IIIilIIiilIIilIIii);
      }

      if (var30) {
         iIlllIllll(this.IIIilIIiilIIilIIii, var27, var28, var29);
      }

      try {
         float var31 = (float)this.lIlilIIiiiIlilIIii.iIlIlllllill();
         float var32 = (float)this.IllilIIiilllilIIii.iIlIlllllill();
         llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.iIIlIlIiIl, var25, var26, var18, 16.0F, 1.0F);
         if (var31 > 0.004F) {
            llliIlIlilliIlIl.IIillIiliIil(var25, var26, var18, 16.0F, 8.0F, IIIiiIillIIiiIil.Illlllllilll(), llliIlIlilliIlIl.iliIiiliiiii(1021659213, var31));
         }

         float var33 = var25 + 6.0F;
         float var34 = var26 + (16.0F - var9) / 2.0F;
         float var35 = 1.0F + 0.22F * (1.0F - (float)this.llIilIIiiilIilIIii.iIlIlllllill());
         Matrix3x2fStack var36 = ctx.method_51448();
         var36.pushMatrix();

         try {
            var36.scale(tgtScale, tgtScale);
            if (var24 != null) {
               var24.IIIllIIliIIl(var36);
            }

            if (var30) {
               var36.translate(var27, var28);
               var36.scale(var29, var29);
               var36.translate(-var27, -var28);
            }

            if (Math.abs(var35 - 1.0F) > 5.0E-4F) {
               float var37 = var33 + var9 / 2.0F;
               float var38 = var34 + var9 / 2.0F;
               var36.translate(var37, var38);
               var36.scale(var35, var35);
               var36.translate(-var37, -var38);
            }

            var36.translate(var33, var34);
            var36.scale(var9 / 16.0F, var9 / 16.0F);
            llllIIlilllIIl.iIlIlllllill(ctx, iilllIIiiIIillIIii, 0, 0, 16);
         } finally {
            var36.popMatrix();
         }

         int var79 = IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-920587, -1750963, (double)var31), -1535700, (double)var32);
         if (this.iilIiIIiiIIiIiIIii == null || var79 != this.IilIiIIiililIiIIii) {
            this.IilIiIIiililIiIIii = var79;
            this.iilIiIIiiIIiIiIIii = new Color(var79, true);
         }

         float var80 = var33 + var9 + 5.0F;
         float var39 = llliIlIlilliIlIl.IIIllIIliIIl(var26 + this.IIlIiIIiilIlIiIIii);
         float var40 = (float)var10 * this.ilIIiIIiiIiIIiIIii;
         float var41 = var80 + var40 / 2.0F;
         float var42 = (float)this.iIIilIIiiIlIilIIii.iIlIlllllill();
         if (var42 != 1.0F) {
            float var43 = Math.min(1.0F, (float)this.iIIilIIiiIlIilIIii.IlIlllIlilIl() / 140.0F);
            float var44 = IliiIilliiIi.IilliliilIIi(1.0F - var43 * var43);

            try {
               this.iilllIIill(
                  var6,
                  this.iiiilIIiiIIIIiIIii,
                  var41 - (float)this.iiiilIIiiIIIIiIIii.length() * this.ilIIiIIiiIiIIiIIii / 2.0F,
                  var39,
                  this.iilIiIIiiIIiIiIIii
               );
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var44);
            }

            float var45 = IliiIilliiIi.IilliliilIIi(lllllillll(var43));
            iIlllIllll(this.IIIilIIiilIIilIIii, var41, var28, 1.0F + 0.15F * (1.0F - var42));

            try {
               this.iilllIIill(var6, this.IiiilIIiiliiilIIii, var80, var39, this.iilIiIIiiIIiIiIIii);
            } finally {
               this.IIIilIIiilIIilIIii.method_22909();
               IliiIilliiIi.lIiiIiIlilli(var45);
            }
         } else {
            this.iilllIIill(var6, this.IiiilIIiiliiilIIii, var80, var39, this.iilIiIIiiIIiIiIIii);
         }

         float var81 = var80 + var40 + 6.0F;
         float var82 = Math.min(
            (float)this.iiIilIIiiIIlilIIii.iIlIlllllill(), llliIlIlilliIlIl.liiiIIllIl((var25 + var18 - 6.0F - var81 + 0.5F) / this.liIIiIIiiiiIIiIIii)
         );
         if (var82 > 0.004F) {
            float var83 = IliiIilliiIi.IilliliilIIi(var82);

            try {
               this.lIilliIill(
                  var6,
                  IliIlllilIi<"IliIlllilIi","6g1x3I2T9UcC2d5MIxD1U3EOCKrhYgGvUQz72zPhWiyRDw==">(),
                  var81,
                  llliIlIlilliIlIl.IIIllIIliIIl(var26 + this.iIlIiIIiiIllIiIIii),
                  0.7F,
                  lIillIIiiiIillIIii
               );
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var83);
            }
         }
      } finally {
         if (var30) {
            this.IIIilIIiilIIilIIii.method_22909();
         }

         if (var24 != null) {
            this.IIIilIIiilIIilIIii.method_22909();
         }
      }
   }

   private void ilIllIiIll(class_332 sw, int factor, float realH, int count, int ctx) {
      IIlIiIlllIlIiIll var6 = IIlIiIlllIlIiIll.lIiiIiIlilli();
      IIlIiIlllIlIiIll var7 = var6.IIillIiliIil() ? var6 : IIlIiIlllIlIiIll.liiiIIllIl();
      if (var7.IIillIiliIil()) {
         String var8 = String.valueOf(ctx);
         float var9 = Math.max(
            var7.Iiilliiliiil(var8, 12.0F), var7.Iiilliiliiil(IliIlllilIi<"IliIlllilIi","Px/0+t5PwT8fDd1PNRaZfnSMYYHq5WN7Q27/0gIm">(), 12.0F)
         );
         float var10 = 25.0F + var9 + 8.0F;
         float var11 = ((float)count - 22.0F) / realH;
         float var12 = ((float)factor - var10) / 2.0F;
         float var13 = var11 - 16.0F - 20.0F;
         float var14 = IIililillIililil.IiiiIlliiiIl(IliIlllilIi<"IliIlllilIi","S0u629yYzQ1NxEU4X8uplQReCvfRvwmLfU9xIxnk/mhPUg==">());
         float var15 = IIililillIililil.iiiiIlIIIIll(IliIlllilIi<"IliIlllilIi","S0u629yYzQ1NxEU4X8uplQReCvfRvwmLfU9xIxnk/mhPUg==">());
         float var16 = var12 + (float)Math.round(var14);
         float var17 = var13 + (float)Math.round(var15);
         iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(
            IliIlllilIi<"IliIlllilIi","S0u629yYzQ1NxEU4X8uplQReCvfRvwmLfU9xIxnk/mhPUg==">(), var12 + var14, var13 + var15, var10, 20.0F
         );
         if (var18 != null) {
            var18.IilliliilIIi(this.IIIilIIiilIIilIIii);
         }

         try {
            IIililillIililil.ilIlIlIiIlIl(sw, var16, var17, var10, 20.0F, null);
            float var19 = var16 + 8.0F;
            float var20 = var17 + 4.0F;
            sw.method_51448().pushMatrix();
            sw.method_51448().scale(realH, realH);
            if (var18 != null) {
               var18.IIIllIIliIIl(sw.method_51448());
            }

            sw.method_51448().translate(var19, var20);
            sw.method_51448().scale(0.75F, 0.75F);
            llllIIlilllIIl.iIlIlllllill(sw, iilllIIiiIIillIIii, 0, 0, 16);
            sw.method_51448().popMatrix();
            int var21 = ctx == 0 ? -42406 : -1;
            var7.IIlilIliiIli(var8, var19 + 12.0F + 5.0F, var17 + (20.0F - var7.IlIillIiilIi(12.0F)) / 2.0F, var21, 12.0F);
         } finally {
            if (var18 != null) {
               this.IIIilIIiilIIilIIii.method_22909();
            }
         }
      }
   }

   public liiiIIiiiiiIIi() {
      super(IliIlllilIi<"IliIlllilIi","1OiCUCaowft4k9G50mmGVm3NPvKoDv6Hj0HYN8TXb9FjRKpiWRKV8Ec=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.ilillIIiiIiillIIii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","QbeiFZoMuXVwfLLdonPmv/ovqXcas2pIJloQAeVqPwyEtmBTJCw=">(),
         IliIlllilIi<"IliIlllilIi","prDH2/CpqOvnq2077Ib2L+wfym73L8sYRoR77vLoPZ21rPpwEmkHjmR2HtLDbqbhoypKHipW2ytNXfHW06qzkg==">(),
         true
      );
      this.liillIIiiiiillIIii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","0AkSqaMUI/zrgWOOm9gOHsO2RtkXl9GuRtGeyuyGr8yjNRgI24T+">(),
         IliIlllilIi<"IliIlllilIi","wTPizlUEFqVdLt50Obx4fs9MujooncQNb4+Bsgk6+f3KbM7WpcIbiS+d68R4S0ErjFBuIfjdlROX9SUMWHwFdMptPszKzuCkagUYwA==">(),
         true
      );
      this.IIIilIIiilIIilIIii = new class_4587();
      this.iIIilIIiiIlIilIIii = new liIliIliiIliIl(llIIIliilIIIli.illIiliiiIilIiliii, 220, 1.0);
      this.llIilIIiiilIilIIii = new liIliIliiIliIl(llIIIliilIIIli.illIiliiiIilIiliii, 240, 1.0);
      this.IiIilIIiiliIilIIii = new liIliIliiIliIl(llIIIliilIIIli.iIlilliiiIllilliii, 220);
      this.iiIilIIiiIIlilIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, 1.0);
      this.lIlilIIiiiIlilIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 260);
      this.IllilIIiilllilIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 260);
      this.illilIIiiIililIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 160, 1.0);
      this.lililIIiiiililIIii = new liIliIliiIliIl(llIIIliilIIIli.illIiliiiIilIiliii, 240, 1.0);
      this.IIiilIIiilIiilIIii = true;
      this.lliilIIiiiliilIIii = -1;
      this.IiiilIIiiliiilIIii = IliIlllilIi<"IliIlllilIi","7Cq9ZZQ/ao+uXj92Nl7Q/yUHufOcPLsTmwIhx2U=">();
      this.iiiilIIiiIIIIiIIii = IliIlllilIi<"IliIlllilIi","7Cq9ZZQ/ao+uXj92Nl7Q/yUHufOcPLsTmwIhx2U=">();
      this.IlIIiIIiillIIiIIii = new float[10];
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlillIIiillillIIii, this.ilillIIiiIiillIIii, this.liillIIiiiiillIIii});
   }

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      this.IlIllllIll(event.IIiIilIIIl);
   }

   private static float lllllillll(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private void lIIlliIIll() {
      long var3 = -3174592939969651829L;
      if (Iiiilllliiilll.field_1724 != null) {
         var3 ^= ((long)this.iiiIlIIIll() << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != this.lliilIIiiiliilIIii) {
            var3 ^= ((long)(this.lliilIIiiiliilIIii < 0 ? 1 : 0) ^ var3) & -1L >>> 32;
            this.iiiilIIiiIIIIiIIii = this.IiiilIIiiliiilIIii;
            this.IiiilIIiiliiilIIii = (int)(var3 >>> 32) < ((1368697979 ^ 9) * 109 * -69 ^ 1059176132)
               ? IilllIIiililllIIii[(int)(var3 >>> 32)]
               : String.valueOf((int)(var3 >>> 32));
            if ((int)var3 == 0) {
               this.iIIilIIiiIlIilIIii.IilliliilIIi(0.0);
               this.iIIilIIiiIlIilIIii.lIiiIiIlilli(1.0);
               if ((int)(var3 >>> 32) < this.lliilIIiiiliilIIii) {
                  this.llIilIIiiilIilIIii.IilliliilIIi(0.0);
                  this.llIilIIiiilIilIIii.lIiiIiIlilli(1.0);
               }
            }

            this.lliilIIiiiliilIIii = (int)(var3 >>> 32);
         }
      }
   }

   private int iiiIlIIIll() {
      int var1 = 0;
      class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();

      for (int var3 = 0; var3 < 36; var3++) {
         class_1799 var4 = var2.method_5438(var3);
         if (var4.method_31574(class_1802.field_8288)) {
            var1 += var4.method_7947();
         }
      }

      class_1799 var5 = var2.method_5438(40);
      if (var5.method_31574(class_1802.field_8288)) {
         var1 += var5.method_7947();
      }

      return var1;
   }

   @Override
   protected void Illillliilli() {
      this.IIiilIIiilIiilIIii = true;
      this.lliilIIiiiliilIIii = -1;
      this.lIIlliIIll();
   }
}
