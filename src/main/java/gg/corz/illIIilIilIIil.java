package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;

public class illIIilIilIIil {
   private static final int lIIililIiiIIililIi = 4;
   private int IIIIiilIilIIIiilIi;
   private static final int iIlililIiIllililIi = 3;
   private static final int IIlililIilIlililIi = 20;
   private int IiIIiilIiliIIiilIi;
   private static final int lllililIiillililIi = 6;
   private static final int IilililIililililIi = 6;
   private static final int IlIililIillIililIi = 3;
   private final liIliIliiIliIl lIiililIiiIiililIi;
   private int liiililIiiiiililIi;
   private int iiIIiilIiIIlIiilIi;
   private final iliiIiIiIiiiIiIi IliililIilliililIi = new iliiIiIiIiiiIiIi();
   private boolean llIIiilIiilIIiilIi;
   private static final int ilIililIiIiIililIi = 9;
   private int iliililIiIiiililIi;
   private static final int liIililIiiiIililIi = 7;
   private int iIIIiilIiIlIIiilIi;
   private final IIiiIIIllIiiIIIl iilililIiIIiililIi;

   public boolean lIiiIiIlilli(char modifiers, int chr) {
      if (this.llIIiilIiilIIiilIi && modifiers >= ' ' && modifiers != 127) {
         String var3 = this.iilililIiIIiililIi.Iilllilliill();
         this.iilililIiIIiililIi.IIillIiliIil(var3.substring(0, this.IiIIiilIiliIIiilIi) + modifiers + var3.substring(this.IiIIiilIiliIIiilIi));
         this.IiIIiilIiliIIiilIi++;
         this.IliililIilliililIi.IliIlllilIi();
         return true;
      } else {
         return false;
      }
   }

   public void liiiIIllIl(class_332 ctx, int mouseX, int mouseY) {
      long var19 = 4668302022099550411L;
      long var21 = 3774709295680083307L;
      long var23 = 3570973577654989649L;
      long var25 = -9171024757920463883L;
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      var4.IliIlllilIi(this.iilililIiIIiililIi.IliIlllilIi(), (float)(this.iliililIiIiiililIi + 4), (float)(this.liiililIiiiiililIi + 3), new Color(-3947581));
      var19 ^= ((long)(this.iliililIiIiiililIi + 4) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)this.IliIlllilIi() ^ var19) & -1L >>> 32;
      var21 ^= ((long)(this.IIIIiilIilIIIiilIi - 8) << 32 ^ var21) & -1L << 32;
      var21 ^= (
            (long)(
                  mouseX >= (int)(var19 >>> 32) && mouseX <= (int)(var19 >>> 32) + (int)(var21 >>> 32) && mouseY >= (int)var19 && mouseY <= (int)var19 + 20
                     ? 1
                     : 0
               )
               ^ var21
         )
         & -1L >>> 32;
      IIlllIlliIll(this.lIiililIiiIiililIi, (int)var21 == 0 && !this.llIIiilIiilIIiilIi ? 0.0 : 1.0);
      double var9 = Illlllllilll(this.lIiililIiiIiililIi.iIlIlllllill());
      var23 ^= ((long)IilIIIIililIIIIi.Illlllllilll(Iilllilliill(16777215, 18), Iilllilliill(IlIIilIlllIIilIl.lliiIlliIl, 255), var9) << 32 ^ var23)
         & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(ctx, (int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32), 20, 6, IilIIIIililIIIIi.IlIlllIlilIl(), (int)(var23 >>> 32));
      var23 ^= ((long)((int)(var19 >>> 32) + 6) ^ var23) & -1L >>> 32;
      var25 ^= ((long)var4.IlIillIiilIi((int)var19, 20) << 32 ^ var25) & -1L << 32;
      String var14 = this.iilililIiIIiililIi.Iilllilliill();
      this.IiIIiilIiliIIiilIi = Math.max(0, Math.min(this.IiIIiilIiliIIiilIi, var14.length()));
      float var15 = (float)((int)(var19 >>> 32) + (int)(var21 >>> 32) - 6 - (int)var23);
      if (var14.isEmpty() && !this.llIIiilIiilIIiilIi) {
         var4.IliIlllilIi(
            Ililllililil<"Ililllililil","eg1fWxQ0D7+l/yjvu3UKzuVdvuLWseIOwtdoZWbur29F1hFxVyg6rw==">(),
            (float)((int)var23),
            (float)((int)(var25 >>> 32)),
            new Color(-8421505)
         );
         this.iiIIiilIiIIlIiilIi = 0;
      } else {
         if (this.IiIIiilIiliIIiilIi < this.iiIIiilIiIIlIiilIi) {
            this.iiIIiilIiIIlIiilIi = this.IiIIiilIiliIIiilIi;
         }

         while (
            this.iiIIiilIiIIlIiilIi < this.IiIIiilIiliIIiilIi && var4.iIlIlllllill(var14.substring(this.iiIIiilIiIIlIiilIi, this.IiIIiilIiliIIiilIi)) > var15
         ) {
            this.iiIIiilIiIIlIiilIi++;
         }

         if (this.iiIIiilIiIIlIiilIi > var14.length()) {
            this.iiIIiilIiIIlIiilIi = 0;
         }

         String var16 = IIillIiliIil(var14.substring(this.iiIIiilIiIIlIiilIi), var15);
         var4.IliIlllilIi(var16, (float)((int)var23), (float)((int)(var25 >>> 32)), new Color(-1));
         if (this.llIIiilIiilIIiilIi) {
            float var17 = (float)((int)var23) + var4.iIlIlllllill(var14.substring(this.iiIIiilIiIIlIiilIi, this.IiIIiilIiliIIiilIi));
            var25 ^= ((long)((int)var4.IilliliilIIi() - 2) ^ var25) & -1L >>> 32;
            this.IliililIilliililIi
               .iIlIlllllill(ctx, var17, (int)var19 + (20 - (int)var25) / 2, (int)var25, IlIIilIlllIIilIl.lliiIlliIl, llIilillilIilill.liiiIIllIl());
         }
      }
   }

   public boolean iIlIlllllill(double mouseX, double button, int mouseY) {
      long var20 = -4394422162878910817L;
      long var22 = -8547541478461534078L;
      long var24 = 311462089992001929L;
      long var26 = 556431829604955661L;
      if (mouseY != 0) {
         return false;
      } else {
         var20 ^= ((long)(this.iliililIiIiiililIi + 4) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)this.IliIlllilIi() ^ var20) & -1L >>> 32;
         var22 ^= ((long)(this.IIIIiilIilIIIiilIi - 8) << 32 ^ var22) & -1L << 32;
         var22 ^= (
               (long)(
                     mouseX >= (double)((int)(var20 >>> 32))
                           && mouseX <= (double)((int)(var20 >>> 32) + (int)(var22 >>> 32))
                           && button >= (double)((int)var20)
                           && button <= (double)((int)var20 + 20)
                        ? 1
                        : 0
                  )
                  ^ var22
            )
            & -1L >>> 32;
         if ((int)var22 != 0) {
            this.IlIlllIlilIl(true);
            var24 ^= ((long)((int)(var20 >>> 32) + 6) << 32 ^ var24) & -1L << 32;
            String var11 = this.iilililIiIIiililIi.Iilllilliill();
            var24 ^= ((long)var11.length() ^ var24) & -1L >>> 32;
            double var13 = Double.MAX_VALUE;

            for (long var34 = var26 ^ ((long)Math.min(this.iiIIiilIiIIlIiilIi, var11.length()) << 32 ^ var26) & -1L << 32;
               (int)(var34 >>> 32) <= var11.length();
               var34 += 4294967296L
            ) {
               double var16 = (double)(
                  (float)((int)(var24 >>> 32))
                     + CorzClient.fontRenderer().iIlIlllllill(var11.substring(Math.min(this.iiIIiilIiIIlIiilIi, var11.length()), (int)(var34 >>> 32)))
               );
               double var18 = Math.abs(var16 - mouseX);
               if (var18 < var13) {
                  var13 = var18;
                  var24 ^= ((long)((int)(var34 >>> 32)) ^ var24) & -1L >>> 32;
               }
            }

            this.IiIIiilIiliIIiilIi = (int)var24;
            this.IliililIilliililIi
               .liiiIIllIl(
                  (float)((int)(var24 >>> 32))
                     + CorzClient.fontRenderer().iIlIlllllill(var11.substring(Math.min(this.iiIIiilIiIIlIiilIi, var11.length()), (int)var24))
               );
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else {
            this.IlIlllIlilIl(false);
            return false;
         }
      }
   }

   private static int Iilllilliill(int alpha, int argb) {
      return (argb & 0xFF) << 24 | alpha & 16777215;
   }

   public boolean iliIiiliiiii(double mouseY, double mouseX) {
      return mouseY >= (double)this.iliililIiIiiililIi
         && mouseY <= (double)(this.iliililIiIiiililIi + this.IIIIiilIilIIIiilIi)
         && mouseX >= (double)this.liiililIiiiiililIi
         && mouseX <= (double)(this.liiililIiiiiililIi + this.iIIIiilIiIlIIiilIi);
   }

   public boolean IIIllIIliIIl() {
      return this.llIIiilIiilIIiilIi;
   }

   public illIIilIilIIil(IIiiIIIllIiiIIIl width, int setting, int height, int x, int y) {
      this.iiIIiilIiIIlIiilIi = 0;
      this.iilililIiIIiililIi = width;
      this.iliililIiIiiililIi = setting;
      this.liiililIiiiiililIi = height;
      this.IIIIiilIilIIIiilIi = x;
      this.iIIIiilIiIlIIiilIi = y;
      this.IiIIiilIiliIIiilIi = width.Iilllilliill().length();
      this.llIIiilIiilIIiilIi = false;
      this.lIiililIiiIiililIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, 0.0);
   }

   private int IliIlllilIi() {
      long var3 = -1829648551443584688L;
      var3 ^= ((long)(this.liiililIiiiiililIi + 3 + 9 + 7) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(this.liiililIiiiiililIi + this.iIIIiilIiIlIIiilIi - 20 - 3) ^ var3) & -1L >>> 32;
      return Math.min((int)(var3 >>> 32), (int)var3);
   }

   public void IiIlliIliiIl(int height, int y, int x, int width) {
      this.iliililIiIiiililIi = height;
      this.liiililIiiiiililIi = y;
      this.IIIIiilIilIIIiilIi = x;
      this.iIIIiilIiIlIIiilIi = width;
   }

   private static double Illlllllilll(double v) {
      return v < 0.0 ? 0.0 : (v > 1.0 ? 1.0 : v);
   }

   private static String IIillIiliIil(String s, float avail) {
      IIliiIlllIliiIll var2 = CorzClient.fontRenderer();
      if (avail <= 0.0F) {
         return "";
      } else if (var2.iIlIlllllill(s) <= avail) {
         return s;
      } else {
         String var3 = s;

         while (var3.length() > 1 && var2.iIlIlllllill(var3) > avail) {
            var3 = var3.substring(0, var3.length() - 1);
         }

         return var3;
      }
   }

   private static void IIlllIlliIll(liIliIliiIliIl a, double target) {
      if (Math.abs(a.IiIlliIliiIl() - target) > 0.001) {
         a.lIiiIiIlilli(target);
      }
   }

   public boolean IilliliilIIi(int scanCode, int keyCode, int modifiers) {
      if (!this.llIIiilIiilIIiilIi) {
         return false;
      } else {
         String var4 = this.iilililIiIIiililIi.Iilllilliill();
         if (scanCode == 259 && this.IiIIiilIiliIIiilIi > 0) {
            this.iilililIiIIiililIi.IIillIiliIil(var4.substring(0, this.IiIIiilIiliIIiilIi - 1) + var4.substring(this.IiIIiilIiliIIiilIi));
            this.IiIIiilIiliIIiilIi--;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 261 && this.IiIIiilIiliIIiilIi < var4.length()) {
            this.iilililIiIIiililIi.IIillIiliIil(var4.substring(0, this.IiIIiilIiliIIiilIi) + var4.substring(this.IiIIiilIiliIIiilIi + 1));
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 263 && this.IiIIiilIiliIIiilIi > 0) {
            this.IiIIiilIiliIIiilIi--;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 262 && this.IiIIiilIiliIIiilIi < var4.length()) {
            this.IiIIiilIiliIIiilIi++;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 268) {
            this.IiIIiilIiliIIiilIi = 0;
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode == 269) {
            this.IiIIiilIiliIIiilIi = var4.length();
            this.IliililIilliililIi.IliIlllilIi();
            return true;
         } else if (scanCode != 257 && scanCode != 256) {
            return false;
         } else {
            this.llIIiilIiilIIiilIi = false;
            return true;
         }
      }
   }

   public void IlIlllIlilIl(boolean focused) {
      this.llIIiilIiilIIiilIi = focused;
      if (focused) {
         this.IiIIiilIiliIIiilIi = this.iilililIiIIiililIi.Iilllilliill().length();
         this.IliililIilliililIi.IliIlllilIi();
      }
   }
}
