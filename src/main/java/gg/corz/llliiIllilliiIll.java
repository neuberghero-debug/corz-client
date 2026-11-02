package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.function.IntSupplier;
import net.minecraft.class_332;
import net.minecraft.class_4588;

public class llliiIllilliiIll {
   private static final int lilIliilll = 92;
   private static final int IiIIliilll = 4;
   private int IIllliilll;
   private static final int iiIIliilll = 60;
   private static final int lllIliilll = 160;
   private float iliIliilll = 0.0F;
   private static final int lIlIliilll = 8;
   private static final int IllIliilll = 4;
   private boolean iIIlliilll;
   private int liIlliilll;
   private int lIiIliilll;
   private boolean lIIlliilll;
   private IntSupplier llIlliilll;
   private final iliiliilIiiiliil iilIliilll;
   private int IliIliilll;
   private float liiIliilll;
   private int iiIlliilll;
   private int iIiIliilll;
   private boolean IiIlliilll;
   private static final int iIlIliilll = 4;
   private static final int liIIliilll = 14;
   public static final int IilIliilll = 84;
   private int lliIliilll;
   public static final int illIliilll = 24;
   private final liIliIliiIliIl IIiIliilll;
   private float IiiIliilll = 1.0F;
   private boolean IlIlliilll;
   private boolean ilIlliilll;
   private static final int IIlIliilll = 8;
   private boolean IIIlliilll;
   private int iiiIliilll;

   private void IIlilIliiIli(class_332 bx, int bh, int ctx, int by, int bw) {
      long var17 = 7172873787877038416L;
      long var19 = -2897920930787508790L;
      long var21 = -7229566882566519930L;
      long var15 = 2988170889989429973L;
      var15 ^= (17179869184L ^ var15) & -1L << 32;
      class_4588 var7 = llIllIililIllIil.IilliliilIIi();

      for (var15 ^= ((long)ctx ^ var15) & -1L >>> 32; (int)var15 < ctx + bw; var15 ^= ((long)((int)var15 + (int)(var15 >>> 32)) ^ var15) & -1L >>> 32) {
         var17 ^= ((long)bh << 32 ^ var17) & -1L << 32;

         while ((int)(var17 >>> 32) < bh + by) {
            var17 ^= ((long)((((int)(var17 >>> 32) - bh) / (int)(var15 >>> 32) + ((int)var15 - ctx) / (int)(var15 >>> 32)) % 2 == 0 ? 1 : 0) ^ var17)
               & -1L >>> 32;
            long var28 = var19 ^ ((long)Math.min((int)(var15 >>> 32), bh + by - (int)(var17 >>> 32)) << 32 ^ var19) & -1L << 32;
            var19 = var28 ^ ((long)Math.min((int)(var15 >>> 32), ctx + bw - (int)var15) ^ var28) & -1L >>> 32;
            llIllIililIllIil.iliIiiliiiii(
               var7,
               (float)((int)(var17 >>> 32)),
               (float)((int)var15),
               (float)((int)(var17 >>> 32) + (int)(var19 >>> 32)),
               (float)((int)var15 + (int)var19),
               IllIllllIl((int)var17 != 0 ? -3355444 : -6710887)
            );
            var17 ^= ((long)((int)(var17 >>> 32) + (int)(var15 >>> 32)) << 32 ^ var17) & -1L << 32;
         }
      }

      llIllIililIllIil.IIillIiliIil();
      var15 ^= ((long)(Color.HSBtoRGB(this.iliIliilll, this.IiiIliilll, this.liiIliilll) & 16777215) ^ var15) & -1L >>> 32;
      var17 ^= (257698037760L ^ var17) & -1L << 32;
      class_4588 var10 = llIllIililIllIil.IilliliilIIi();

      for (var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < (int)(var17 >>> 32); var19 += 4294967296L) {
         float var12 = (float)((int)(var19 >>> 32)) / (float)((int)(var17 >>> 32) - 1);
         var21 ^= ((long)(bh + (int)(var19 >>> 32) * by / (int)(var17 >>> 32)) << 32 ^ var21) & -1L << 32;
         var21 ^= ((long)(bh + ((int)(var19 >>> 32) + 1) * by / (int)(var17 >>> 32) - (int)(var21 >>> 32)) ^ var21) & -1L >>> 32;
         if ((int)var21 < 1) {
            var21 ^= (1L ^ var21) & -1L >>> 32;
         }

         llIllIililIllIil.iliIiiliiiii(
            var10,
            (float)((int)(var21 >>> 32)),
            (float)ctx,
            (float)((int)(var21 >>> 32) + (int)var21),
            (float)(ctx + bw),
            IllIllllIl((int)(var12 * 255.0F) << 24 | (int)var15)
         );
      }

      llIllIililIllIil.IIillIiliIil();
      var19 ^= ((long)lIlIliIlIl(bh + (int)((float)this.iiiIliilll / 255.0F * (float)by), bh, bh + by) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(ctx + bw / 2) ^ var19) & -1L >>> 32;
      IIIiiIillIIiiIil.iIlIlllllill(bx, (int)(var19 >>> 32), (int)var19, 5, -872415232);
      IIIiiIillIIiiIil.iIlIlllllill(bx, (int)(var19 >>> 32), (int)var19, 4, -1);
      IIIiiIillIIiiIil.iIlIlllllill(bx, (int)(var19 >>> 32), (int)var19, 3, this.iiiIliilll << 24 | (int)var15);
   }

   public boolean IiIlliIliiIl(double my, double mx) {
      long var10 = 3096815748560298145L;
      long var12 = 5231657071778698863L;
      long var14 = -2793862560541289080L;
      var10 ^= ((long)this.IilliliilIIi() << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)this.lIiiIiIlilli() ^ var10) & -1L >>> 32;
      var12 ^= ((long)this.iliIiiliiiii() << 32 ^ var12) & -1L << 32;
      if (my < (double)((int)(var10 >>> 32)) || my > (double)((int)(var10 >>> 32) + (int)var10)) {
         return false;
      } else if (mx >= (double)((int)(var12 >>> 32)) && mx <= (double)((int)(var12 >>> 32) + 60)) {
         this.IIIlliilll = true;
         this.Iliilliiilii(my, mx, (int)(var10 >>> 32), (int)(var12 >>> 32), (int)var10, 60);
         return true;
      } else {
         var12 ^= ((long)((int)(var12 >>> 32) + 60 + 4) ^ var12) & -1L >>> 32;
         if (mx >= (double)((int)var12) && mx <= (double)((int)var12 + 8)) {
            this.lIIlliilll = true;
            this.Iiiiliiiiiii(my, (int)(var10 >>> 32), (int)var10);
            return true;
         } else {
            var14 ^= ((long)((int)var12 + 8 + 4) << 32 ^ var14) & -1L << 32;
            if (mx >= (double)((int)(var14 >>> 32)) && mx <= (double)((int)(var14 >>> 32) + 8)) {
               this.iIIlliilll = true;
               this.IIIIllIIIl(my, (int)(var10 >>> 32), (int)var10);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private void Iilllilliill() {
      long var3 = -7789773694651751852L;
      var3 ^= ((long)Color.HSBtoRGB(this.iliIliilll, this.IiiIliilll, this.liiIliilll) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(this.iiiIliilll << 24 | (int)(var3 >>> 32) & 16777215) ^ var3) & -1L >>> 32;
      this.iilIliilll.IIillIiliIil((int)var3);
      IlIIilIlllIIilIl.IilliliilIIi();
   }

   public void IIIllIIliIIl(class_332 ctx) {
      this.IIlllIlliIll();
      this.IlIlllIlilIl(ctx);
   }

   private static int illIlIilIl(int t, int c2, double c1) {
      long var16 = 2523346018989588317L;
      long var18 = -4109668490622637785L;
      long var12 = -8691420436415254160L;
      long var14 = -2843045024948878254L;
      var12 ^= ((long)(t >> 24 & 0xFF) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(t >> 16 & 0xFF) ^ var12) & -1L >>> 32;
      var14 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)(t & 0xFF) ^ var14) & -1L >>> 32;
      var16 ^= ((long)(c2 >> 24 & 0xFF) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)(c2 >> 16 & 0xFF) ^ var16) & -1L >>> 32;
      var18 ^= ((long)(c2 >> 8 & 0xFF) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(c2 & 0xFF) ^ var18) & -1L >>> 32;
      return (int)((double)((int)(var12 >>> 32)) + (double)((int)(var16 >>> 32) - (int)(var12 >>> 32)) * c1) << 24
         | (int)((double)((int)var12) + (double)((int)var16 - (int)var12) * c1) << 16
         | (int)((double)((int)(var14 >>> 32)) + (double)((int)(var18 >>> 32) - (int)(var14 >>> 32)) * c1) << 8
         | (int)((double)((int)var14) + (double)((int)var18 - (int)var14) * c1);
   }

   private void IIlllIlliIll() {
      long var3 = -9139756010500587693L;
      if (this.llIlliilll != null && !this.IiIIlliIIl()) {
         var3 ^= ((long)(this.llIlliilll.getAsInt() & 16777215) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != (this.iilIliilll.Iilllilliill() & 16777215)) {
            float[] var2 = Color.RGBtoHSB((int)(var3 >>> 32) >> 16 & 0xFF, (int)(var3 >>> 32) >> 8 & 0xFF, (int)(var3 >>> 32) & 0xFF, null);
            if (var2[1] > 0.0F) {
               this.iliIliilll = var2[0];
            }

            this.IiiIliilll = var2[1];
            this.liiIliilll = var2[2];
            this.ilIlliilll = true;
         } else if (this.ilIlliilll) {
            this.Illlllllilll();
            this.ilIlliilll = false;
         }
      } else {
         this.ilIlliilll = false;
      }
   }

   public boolean llIIlilIIl(char modifiers, int chr) {
      return false;
   }

   public llliiIllilliiIll(iliiliilIiiiliil x, int setting, int width, int height, int y) {
      this.liiIliilll = 1.0F;
      this.iiiIliilll = 255;
      this.IIIlliilll = false;
      this.lIIlliilll = false;
      this.iIIlliilll = false;
      this.IlIlliilll = false;
      this.iilIliilll = x;
      this.lIiIliilll = setting;
      this.iIiIliilll = width;
      this.IliIliilll = height;
      this.lliIliilll = y;
      this.IIiIliilll = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 300, 0.0);
      this.Illlllllilll();
   }

   public int IIillIiliIil() {
      double var1 = this.IlIlliilll ? 1.0 : 0.0;
      if (Math.abs(this.IIiIliilll.IiIlliIliiIl() - var1) > 0.01) {
         this.IIiIliilll.lIiiIiIlilli(var1);
      }

      double var3 = this.IIiIliilll.iIlIlllllill();
      double var5 = this.IlIlliilll ? 1.0 : var3;
      return 24 + (int)(92.0 * var5);
   }

   private static int IllIllllIl(int argb) {
      return IliiIilliiIi.IlIlllIlilIl(argb);
   }

   private void IlIillIiilIi(class_332 fy, int fw, int ctx, int fx, int fh) {
      long var19 = -5862276276997660208L;
      long var21 = 3768822773089135592L;
      long var23 = -4520374988731548081L;
      long var25 = 6999928775589966650L;
      long var27 = 5388367671875699702L;
      long var29 = -6767211412290969095L;
      var19 ^= (206158430208L ^ var19) & -1L << 32;
      var19 ^= (48L ^ var19) & -1L >>> 32;
      class_4588 var8 = llIllIililIllIil.IilliliilIIi();
      var21 ^= (0L ^ var21) & -1L << 32;

      while ((int)(var21 >>> 32) < (int)(var19 >>> 32)) {
         float var10 = 1.0F - (float)((int)(var21 >>> 32)) / (float)((int)(var19 >>> 32) - 1);
         var21 ^= ((long)(ctx + (int)(var21 >>> 32) * fh / (int)(var19 >>> 32)) ^ var21) & -1L >>> 32;
         var23 ^= ((long)(ctx + ((int)(var21 >>> 32) + 1) * fh / (int)(var19 >>> 32) - (int)var21) << 32 ^ var23) & -1L << 32;
         if ((int)(var23 >>> 32) < 1) {
            var23 ^= (4294967296L ^ var23) & -1L << 32;
         }

         var23 ^= ((long)(0xFF000000 | Color.HSBtoRGB(this.iliIliilll, 0.0F, var10) & 16777215) ^ var23) & -1L >>> 32;
         var25 ^= ((long)(0xFF000000 | Color.HSBtoRGB(this.iliIliilll, 1.0F, var10) & 16777215) << 32 ^ var25) & -1L << 32;

         for (var25 ^= (0L ^ var25) & -1L >>> 32; (int)var25 < (int)var19; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            float var16 = (float)((int)var25) / (float)((int)var19 - 1);
            var27 ^= ((long)(fw + (int)var25 * fx / (int)var19) << 32 ^ var27) & -1L << 32;
            var27 ^= ((long)(fw + ((int)var25 + 1) * fx / (int)var19 - (int)(var27 >>> 32)) ^ var27) & -1L >>> 32;
            if ((int)var27 < 1) {
               var27 ^= (1L ^ var27) & -1L >>> 32;
            }

            llIllIililIllIil.iliIiiliiiii(
               var8,
               (float)((int)(var27 >>> 32)),
               (float)((int)var21),
               (float)((int)(var27 >>> 32) + (int)var27),
               (float)((int)var21 + (int)(var23 >>> 32)),
               IllIllllIl(illIlIilIl((int)var23, (int)(var25 >>> 32), (double)var16))
            );
         }

         var21 += 4294967296L;
      }

      llIllIililIllIil.IIillIiliIil();
      var21 ^= ((long)(fw + (int)(this.IiiIliilll * (float)fx)) << 32 ^ var21) & -1L << 32;
      var29 ^= ((long)(ctx + (int)((1.0F - this.liiIliilll) * (float)fh)) << 32 ^ var29) & -1L << 32;
      var21 ^= ((long)lIlIliIlIl((int)(var21 >>> 32), fw, fw + fx) << 32 ^ var21) & -1L << 32;
      var29 ^= ((long)lIlIliIlIl((int)(var29 >>> 32), ctx, ctx + fh) << 32 ^ var29) & -1L << 32;
      IIIiiIillIIiiIil.iIlIlllllill(fy, (int)(var21 >>> 32), (int)(var29 >>> 32), 5, -872415232);
      IIIiiIillIIiiIil.iIlIlllllill(fy, (int)(var21 >>> 32), (int)(var29 >>> 32), 4, -1);
      IIIiiIillIIiiIil.iIlIlllllill(
         fy, (int)(var21 >>> 32), (int)(var29 >>> 32), 2, 0xFF000000 | Color.HSBtoRGB(this.iliIliilll, this.IiiIliilll, this.liiIliilll) & 16777215
      );
   }

   public void IIIilIIiiIIi(class_332 mouseY, int mouseX, int ctx) {
      long var12 = 3812703897843880775L;
      long var14 = -2783687456279876663L;
      this.IIlllIlliIll();
      double var4 = this.IlIlliilll ? 1.0 : 0.0;
      if (Math.abs(this.IIiIliilll.IiIlliIliiIl() - var4) > 0.01) {
         this.IIiIliilll.lIiiIiIlilli(var4);
      }

      double var6 = this.IIiIliilll.iIlIlllllill();
      var12 ^= ((long)(this.iIiIliilll + 4) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(this.lIiIliilll + this.IliIliilll - 4 - 14) ^ var12) & -1L >>> 32;
      CorzClient.fontRenderer().IliIlllilIi(this.iilIliilll.IliIlllilIi(), (float)(this.lIiIliilll + 4), (float)((int)(var12 >>> 32)), new Color(-3947581));
      IIIiiIillIIiiIil.lIiiIiIlilli(mouseY, (int)var12 - 1, (int)(var12 >>> 32) - 1, 16, 16, 4, -8421505);
      IIIiiIillIIiiIil.lIiiIiIlilli(mouseY, (int)var12, (int)(var12 >>> 32), 14, 14, 3, this.liiiIIllIl());
      if (var6 > 0.001) {
         var14 ^= ((long)(this.iIiIliilll + 24) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)Math.min((int)(92.0 * var6), Math.max(0, this.lliIliilll - 24)) ^ var14) & -1L >>> 32;
         if ((int)var14 <= 0) {
            return;
         }

         mouseY.method_44379(this.lIiIliilll, (int)(var14 >>> 32), this.lIiIliilll + this.IliIliilll, (int)(var14 >>> 32) + (int)var14);
         this.IlIlllIlilIl(mouseY);
         mouseY.method_44380();
      }
   }

   public boolean Illillliilli(double my, double mx, int btn) {
      long var9 = 8936427058061908556L;
      long var11 = 8324158377685438421L;
      if (btn != 0) {
         return false;
      } else {
         var9 ^= ((long)(this.iIiIliilll + 4) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)(this.lIiIliilll + this.IliIliilll - 4 - 14) ^ var9) & -1L >>> 32;
         var11 ^= (
               (long)(
                        my >= (double)((int)var9)
                              && my <= (double)((int)var9 + 14)
                              && mx >= (double)((int)(var9 >>> 32))
                              && mx <= (double)((int)(var9 >>> 32) + 14)
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var11
            )
            & -1L << 32;
         if ((int)(var11 >>> 32) != 0) {
            this.IlIlliilll = !this.IlIlliilll;
            if (this.IlIlliilll) {
               this.Illlllllilll();
            }

            return true;
         } else {
            return this.IlIlliilll && this.IIiIliilll.iIlIlllllill() > 0.3 ? this.IiIlliIliiIl(my, mx) : false;
         }
      }
   }

   public void Iilililiiili(double mx, double my, int btn) {
      long var9 = 7068926213437050044L;
      long var11 = 2391192190131651964L;
      var9 ^= ((long)this.IilliliilIIi() << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)this.lIiiIiIlilli() ^ var9) & -1L >>> 32;
      var11 ^= ((long)this.iliIiiliiiii() << 32 ^ var11) & -1L << 32;
      if (this.IIIlliilll) {
         this.Iliilliiilii(mx, my, (int)(var9 >>> 32), (int)(var11 >>> 32), (int)var9, 60);
      }

      if (this.lIIlliilll) {
         this.Iiiiliiiiiii(mx, (int)(var9 >>> 32), (int)var9);
      }

      if (this.iIIlliilll) {
         this.IIIIllIIIl(mx, (int)(var9 >>> 32), (int)var9);
      }
   }

   private void Illlllllilll() {
      long var6 = -8060000894819302881L;
      long var8 = -8307564647161011456L;
      var6 ^= ((long)this.iilIliilll.Iilllilliill() << 32 ^ var6) & -1L << 32;
      this.iiiIliilll = (int)(var6 >>> 32) >> 24 & 0xFF;
      var6 ^= ((long)((int)(var6 >>> 32) >> 16 & 0xFF) ^ var6) & -1L >>> 32;
      var8 ^= ((long)((int)(var6 >>> 32) >> 8 & 0xFF) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)((int)(var6 >>> 32) & 0xFF) ^ var8) & -1L >>> 32;
      float[] var5 = Color.RGBtoHSB((int)var6, (int)(var8 >>> 32), (int)var8, null);
      this.iliIliilll = var5[0];
      this.IiiIliilll = var5[1];
      this.liiIliilll = var5[2];
   }

   private int lIiiIiIlilli() {
      return this.IiIlliilll ? this.IIllliilll : Math.min(this.IliIliilll - 8, 160);
   }

   public void Iiilliiliiil() {
      this.Illlllllilll();
   }

   private void IIIIllIIIl(double mx, int barX, int barW) {
      this.iiiIliilll = (int)(Math.max(0.0, Math.min(1.0, (mx - (double)barX) / (double)barW)) * 255.0);
      this.Iilllilliill();
   }

   private int iliIiiliiiii() {
      return this.IiIlliilll ? this.iiIlliilll : this.iIiIliilll + 24 + 4;
   }

   public boolean Ililllililil() {
      return this.IlIlliilll;
   }

   public void IliIlllilIi(IntSupplier source) {
      this.llIlliilll = source;
   }

   private int IilliliilIIi() {
      return this.IiIlliilll ? this.liIlliilll : this.lIiIliilll + 4;
   }

   public int liiiIIllIl() {
      return this.llIlliilll != null ? this.llIlliilll.getAsInt() : this.iilIliilll.Iilllilliill();
   }

   private void Iliilliiilii(double svW, double svH, int svX, int my, int mx, int svY) {
      this.IiiIliilll = (float)Math.max(0.0, Math.min(1.0, (svW - (double)svX) / (double)mx));
      this.liiIliilll = 1.0F - (float)Math.max(0.0, Math.min(1.0, (svH - (double)my) / (double)svY));
      this.Iilllilliill();
   }

   private static int lIlIliIlIl(int val, int max, int min) {
      return Math.max(max, Math.min(min, val));
   }

   public boolean iIIIlIlIIl(int keyCode, int modifiers, int scanCode) {
      return false;
   }

   public boolean IiIIlliIIl() {
      return this.IIIlliilll || this.lIIlliilll || this.iIIlliilll;
   }

   private void Iiiiliiiiiii(double barW, int barX, int mx) {
      this.iliIliilll = (float)Math.max(0.0, Math.min(1.0, (barW - (double)barX) / (double)mx));
      this.Iilllilliill();
   }

   public void iIlIlllllill(int px, int pw, int py) {
      this.IiIlliilll = true;
      this.liIlliilll = px;
      this.iiIlliilll = pw;
      this.IIllliilll = py;
   }

   public void iiIIlIIlIl(int y, int width, int height, int x) {
      this.lIiIliilll = y;
      this.iIiIliilll = width;
      this.IliIliilll = height;
      this.lliIliilll = x;
   }

   public void IIiilIiiiIii(double mx, double my, int btn) {
      this.IIIlliilll = false;
      this.lIIlliilll = false;
      this.iIIlliilll = false;
   }

   private void IiIiliIiiiIi(class_332 bh, int bw, int bx, int by, int ctx) {
      long var16 = 5496200377299151402L;
      long var12 = 7057372820842654179L;
      long var14 = 7510952428069571704L;
      var12 ^= (257698037760L ^ var12) & -1L << 32;
      class_4588 var7 = llIllIililIllIil.IilliliilIIi();

      for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         float var9 = (float)((int)var12) / (float)((int)(var12 >>> 32) - 1);
         var14 ^= ((long)(bw + (int)var12 * by / (int)(var12 >>> 32)) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(bw + ((int)var12 + 1) * by / (int)(var12 >>> 32) - (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
         if ((int)var14 < 1) {
            var14 ^= (1L ^ var14) & -1L >>> 32;
         }

         llIllIililIllIil.iliIiiliiiii(
            var7,
            (float)((int)(var14 >>> 32)),
            (float)bx,
            (float)((int)(var14 >>> 32) + (int)var14),
            (float)(bx + ctx),
            IllIllllIl(0xFF000000 | Color.HSBtoRGB(var9, 1.0F, 1.0F) & 16777215)
         );
      }

      llIllIililIllIil.IIillIiliIil();
      var12 ^= ((long)lIlIliIlIl(bw + (int)(this.iliIliilll * (float)by), bw, bw + by) ^ var12) & -1L >>> 32;
      var16 ^= ((long)(bx + ctx / 2) << 32 ^ var16) & -1L << 32;
      IIIiiIillIIiiIil.iIlIlllllill(bh, (int)var12, (int)(var16 >>> 32), 5, -872415232);
      IIIiiIillIIiiIil.iIlIlllllill(bh, (int)var12, (int)(var16 >>> 32), 4, -1);
      IIIiiIillIIiiIil.iIlIlllllill(bh, (int)var12, (int)(var16 >>> 32), 3, 0xFF000000 | Color.HSBtoRGB(this.iliIliilll, 1.0F, 1.0F) & 16777215);
   }

   private void IlIlllIlilIl(class_332 ctx) {
      long var7 = -4915316382604844418L;
      long var9 = 5813922073246497889L;
      long var11 = -25569319972506777L;
      var7 ^= ((long)this.IilliliilIIi() << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)this.lIiiIiIlilli() ^ var7) & -1L >>> 32;
      var9 ^= ((long)this.iliIiiliiiii() << 32 ^ var9) & -1L << 32;
      this.IlIillIiilIi(ctx, (int)(var7 >>> 32), (int)(var9 >>> 32), (int)var7, 60);
      var9 ^= ((long)((int)(var9 >>> 32) + 60 + 4) ^ var9) & -1L >>> 32;
      this.IiIiliIiiiIi(ctx, (int)(var7 >>> 32), (int)var9, (int)var7, 8);
      var11 ^= ((long)((int)var9 + 8 + 4) << 32 ^ var11) & -1L << 32;
      this.IIlilIliiIli(ctx, (int)(var7 >>> 32), (int)(var11 >>> 32), (int)var7, 8);
   }
}
