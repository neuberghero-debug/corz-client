package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.Locale;
import net.minecraft.class_2960;
import net.minecraft.class_332;

public class iiiiilIiIIIIIiIi {
   private String IiiiIilIIi;
   private static final int IiilIilIIi = 7;
   private boolean liiiIilIIi;
   private boolean lIlIlilIIi;
   private static final int IIIiIilIIi = 3;
   private int IIiiIilIIi;
   private long iIlIlilIIi;
   private static final int lIIiIilIIi = 5;
   private String lliiIilIIi;
   private static final int IlilIilIIi = 7;
   private static final int ilIiIilIIi = 4;
   private float iiIIlilIIi;
   private static final int llilIilIIi = 8;
   private static final boolean liliIilIIi = System.getProperty(IIiilIiiiIii<"IIiilIiiiIii","/EevqtUgkx0d8iM1Jsr/IJ0KwsOSJWIvb9VfjXCVD2+1F3g=">(), "")
      .toLowerCase(Locale.ROOT)
      .contains(IIiilIiiiIii<"IIiilIiiiIii","HWhFc7Qinsud6mrWI6Am6ZlMRNGMr+r1SsdWRGUF0A==">());
   private static final int llIiIilIIi = 4;
   private final iliiIiIiIiiiIiIi IIIIlilIIi;
   private static final float liIiIilIIi = 10.0F;
   private static final String lIliIilIIi = "clear";
   private boolean lIIIlilIIi;
   private float IIlIlilIIi;
   private static final int IlIiIilIIi = 12;
   private int lIiiIilIIi;
   private static final long iIliIilIIi = 300000000L;
   private static final int liilIilIIi = 7;
   private float liIIlilIIi;
   private static final int ililIilIIi = 12;
   private float IiIIlilIIi;
   private static final int iIIiIilIIi = 6;
   private boolean iliiIilIIi;
   private static final int illiIilIIi = 2;
   private static final int iiilIilIIi = 5;
   private static final int IiIiIilIIi = 2;
   private final liIliIliiIliIl llIIlilIIi;
   private final liIliIliiIliIl iIIIlilIIi;
   private static final float iiIiIilIIi = 0.8F;
   private static final int IiliIilIIi = 2;
   private int iIiiIilIIi;
   private int IliiIilIIi = 7;
   private static final float IIliIilIIi = 0.14F;
   private static final class_2960 llliIilIIi = class_2960.method_60655(
      IIiilIiiiIii<"IIiilIiiiIii","/O0P/ITNcMo62Wrjkm8Zeabp8IUhSDd+aGTxAYBi6dRl69sRLZA=">(),
      IIiilIiiiIii<"IIiilIiiiIii","KwiGSl6CSmCwGb2ux+x6QKPbblMxomaZ/O4MDA/dbBL1aYaLqtAXZ9KromnbEGRBiGVCBNmA+63oIQ==">()
   );
   private static final class_2960 IlliIilIIi = class_2960.method_60655(
      IIiilIiiiIii<"IIiilIiiiIii","/O0P/ITNcMo62Wrjkm8Zeabp8IUhSDd+aGTxAYBi6dRl69sRLZA=">(),
      IIiilIiiiIii<"IIiilIiiiIii","Iqn5IPb0vPmaAjBgmGHI/cSJWgXvdT0kxU+dUWruar0dib88Zk9u2ngbEQv5IroQDdSP4Rb8zrv6">()
   );
   private final iIliililIlliilil ilIIlilIIi;
   private final liIliIliiIliIl IlIIlilIIi;
   private boolean iiiiIilIIi;
   private int iiliIilIIi;

   private boolean IlIlllIlilIl(double my, double mx) {
      return this.lIlIlilIIi
         && !this.IiiiIilIIi.isEmpty()
         && System.nanoTime() - this.iIlIlilIIi < 300000000L
         && llilliilililliil.Iliilliiilii(my, mx, this.IiIIlilIIi, this.liIIlilIIi, this.iiIIlilIIi, this.IIlIlilIIi);
   }

   private void IIIllIIliIIl(class_332 shown, int ctx, int boxX, int my, float mx) {
      long var15 = 2803151954176390962L;
      float var6 = (float)this.IIiiIilIIi + (float)(this.iIiiIilIIi - 12) / 2.0F;
      this.IiIIlilIIi = (float)(ctx - 2);
      this.liIIlilIIi = (float)this.IIiiIilIIi;
      this.iiIIlilIIi = (float)(this.iiliIilIIi + this.lIiiIilIIi) - this.IiIIlilIIi;
      this.IIlIlilIIi = (float)this.iIiiIilIIi;
      this.lIlIlilIIi = mx > 0.5F;
      var15 ^= (
            (long)(
                     this.lIlIlilIIi
                           && llilliilililliil.Iliilliiilii((double)boxX, (double)my, this.IiIIlilIIi, this.liIIlilIIi, this.iiIIlilIIi, this.IIlIlilIIi)
                        ? 1
                        : 0
                  )
                  << 32
               ^ var15
         )
         & -1L << 32;
      float var8 = this.ilIIlilIIi.IIIllIIliIIl(IIiilIiiiIii<"IIiilIiiiIii","9zZxt5BzatzzslRZo5zWXdTxAApubCIgQw5hId9rCDCa">(), (boolean)((int)(var15 >>> 32)));
      if (!(mx <= 0.01F)) {
         float var9 = (float)ctx + 6.0F;
         float var10 = var6 + 6.0F;
         float var11 = (0.8F + 0.19999999F * llilliilililliil.liiiIIllIl(mx))
            * this.ilIIlilIIi.IilliliilIIi(IIiilIiiiIii<"IIiilIiiiIii","9zZxt5BzatzzslRZo5zWXdTxAApubCIgQw5hId9rCDCa">(), 0.14F);
         var15 ^= ((long)llilliilililliil.IlIlllIlilIl(shown, var9, var10, var11) ^ var15) & -1L >>> 32;
         float var13 = IliiIilliiIi.IilliliilIIi(mx);

         try {
            if (var8 > 0.01F) {
               IIIiiIillIIiiIil.IlIlllIlilIl(shown, (float)ctx, var6, 12.0F, 12.0F, 6.0F, llilliilililliil.IIIIllIIIl(-1, 0.08F * var8));
            }

            iiIlilIlIIllilIl.IliIlllilIi(
               var9 - 5.0F,
               var10 - 5.0F,
               10.0F,
               10.0F,
               lIlIIiliIlIIil.IIIIllIIIl(IIiilIiiiIii<"IIiilIiiiIii","uUCN+Vjdo6WKCF1tKID0HF1oKO0G3UE8Hp+fs/Jl233L">()),
               new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var8), true),
               IIIiiIillIIiiIil.liiiIIllIl()
            );
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var13);
            llilliilililliil.IiIlliIliiIl(shown, (boolean)((int)var15));
         }
      }
   }

   private static int Ililllililil(int alpha, int argb) {
      return (argb & 0xFF) << 24 | alpha & 16777215;
   }

   public boolean IiIlliIliiIl(double button, double my, int mx) {
      long var7 = 7706440892732125086L;
      var7 ^= (
            (long)(
                     button >= (double)this.iiliIilIIi
                           && button <= (double)(this.iiliIilIIi + this.lIiiIilIIi)
                           && my >= (double)this.IIiiIilIIi
                           && my <= (double)(this.IIiiIilIIi + this.iIiiIilIIi)
                        ? 1
                        : 0
                  )
                  << 32
               ^ var7
         )
         & -1L << 32;
      if ((int)(var7 >>> 32) != 0 && mx == 0 && this.IlIlllIlilIl(button, my)) {
         this.IiiiIilIIi = "";
         this.lIIIlilIIi = false;
         this.liiiIilIIi = true;
         this.IIIIlilIIi.IliIlllilIi();
         this.ilIIlilIIi.liiiIIllIl(IIiilIiiiIii<"IIiilIiiiIii","9zZxt5BzatzzslRZo5zWXdTxAApubCIgQw5hId9rCDCa">());
         return true;
      } else {
         this.liiiIilIIi = (boolean)((int)(var7 >>> 32));
         this.lIIIlilIIi = false;
         if (this.liiiIilIIi) {
            this.IIIIlilIIi.IliIlllilIi();
         }

         return (boolean)((int)(var7 >>> 32));
      }
   }

   public void IilliliilIIi(int radius) {
      this.IliiIilIIi = radius;
   }

   public iiiiilIiIIIIIiIi(int y, int height, int x, int width) {
      this.lliiIilIIi = IIiilIiiiIii<"IIiilIiiiIii","e0KRdUxUgAcTkTjvgT6O9EWq8XS4i+OVaZOBL2cinYxWhkxJNA7nyk+UZnZa">();
      this.iliiIilIIi = true;
      this.IiiiIilIIi = "";
      this.liiiIilIIi = false;
      this.iiiiIilIIi = false;
      this.IIIIlilIIi = new iliiIiIiIiiiIiIi();
      this.lIIIlilIIi = false;
      this.iIIIlilIIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200);
      this.IlIIlilIIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 180, 1.0);
      this.llIIlilIIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 150, 1.0);
      this.ilIIlilIIi = new iIliililIlliilil();
      this.iiliIilIIi = y;
      this.IIiiIilIIi = height;
      this.lIiiIilIIi = x;
      this.iIiiIilIIi = width;
   }

   private static void Iilllilliill(liIliIliiIliIl a, double target) {
      if (Math.abs(a.IiIlliIliiIl() - target) > 0.001) {
         a.lIiiIiIlilli(target);
      }
   }

   public boolean Illlllllilll(char modifiers, int chr) {
      if (!this.liiiIilIIi) {
         return false;
      } else if (modifiers >= ' ' && modifiers != 127) {
         this.IiiiIilIIi = lIiIililiIiIilil.liiiIIllIl(this.IiiiIilIIi, this.lIIIlilIIi, modifiers);
         this.lIIIlilIIi = false;
         this.IIIIlilIIi.IliIlllilIi();
         return true;
      } else {
         return false;
      }
   }

   private static String IIIilIIiiIIi(String avail, float s) {
      IIliiIlllIliiIll var2 = CorzClient.fontRenderer();
      if (s <= 0.0F) {
         return "";
      } else if (var2.iIlIlllllill(avail) <= s) {
         return avail;
      } else {
         String var3 = avail;

         while (var3.length() > 1 && var2.iIlIlllllill(var3) > s) {
            var3 = var3.substring(1);
         }

         return var3;
      }
   }

   public void iIlIlllllill(boolean shortcut) {
      this.iliiIilIIi = shortcut;
   }

   public boolean IIlilIliiIli() {
      return this.liiiIilIIi;
   }

   public void IiIiliIiiiIi(String text) {
      this.IiiiIilIIi = text;
      this.lIIIlilIIi = false;
   }

   private static double IIillIiliIil(double v) {
      return v < 0.0 ? 0.0 : (v > 1.0 ? 1.0 : v);
   }

   public void IliIlllilIi(int height, int x, int y, int width) {
      this.iiliIilIIi = height;
      this.IIiiIilIIi = x;
      this.lIiiIilIIi = y;
      this.iIiiIilIIi = width;
   }

   public void liiiIIllIl(String placeholder) {
      this.lliiIilIIi = placeholder == null ? "" : placeholder;
   }

   public boolean Illillliilli(double mx, double my) {
      return mx >= (double)this.iiliIilIIi
         && mx <= (double)(this.iiliIilIIi + this.lIiiIilIIi)
         && my >= (double)this.IIiiIilIIi
         && my <= (double)(this.IIiiIilIIi + this.iIiiIilIIi);
   }

   public boolean IIlllIlliIll(int keyCode, int scanCode, int modifiers) {
      long var7 = 8375492125733531323L;
      if (!this.iliiIilIIi || keyCode != 75 || (!liliIilIIi || (modifiers & 8) == 0) && (liliIilIIi || (modifiers & 2) == 0)) {
         if (!this.liiiIilIIi) {
            return false;
         } else if (lIiIililiIiIilil.IliIlllilIi(liliIilIIi, keyCode, modifiers)) {
            this.lIIIlilIIi = !this.IiiiIilIIi.isEmpty();
            return true;
         } else if (keyCode == 259 || keyCode == 261) {
            var7 ^= ((long)(keyCode == 261 ? 1 : 0) << 32 ^ var7) & -1L << 32;
            String var5 = lIiIililiIiIilil.iIlIlllllill(this.IiiiIilIIi, this.lIIIlilIIi, (boolean)((int)(var7 >>> 32)));
            var7 ^= ((long)(var5.equals(this.IiiiIilIIi) && !this.lIIIlilIIi ? 0 : 1) ^ var7) & -1L >>> 32;
            this.IiiiIilIIi = var5;
            this.lIIIlilIIi = false;
            this.IIIIlilIIi.IliIlllilIi();
            return (int)var7 != 0 ? true : (int)(var7 >>> 32) == 0;
         } else if (keyCode == 256) {
            this.lIIIlilIIi = false;
            this.liiiIilIIi = false;
            return true;
         } else if (keyCode != 263 && keyCode != 262 && keyCode != 268 && keyCode != 269) {
            return false;
         } else {
            this.lIIIlilIIi = false;
            return true;
         }
      } else {
         this.liiiIilIIi = true;
         this.IIIIlilIIi.IliIlllilIi();
         return true;
      }
   }

   public String IlIillIiilIi() {
      return this.IiiiIilIIi;
   }

   public void lIiiIiIlilli() {
      this.Iilililiiili(false);
   }

   private static String Iiilliiliiil(String avail, float s) {
      IIliiIlllIliiIll var2 = CorzClient.fontRenderer();
      if (s <= 0.0F) {
         return "";
      } else if (var2.iIlIlllllill(avail) <= s) {
         return avail;
      } else {
         String var3 = avail;

         while (var3.length() > 1 && var2.iIlIlllllill(var3) > s) {
            var3 = var3.substring(0, var3.length() - 1);
         }

         return var3;
      }
   }

   public void Iilililiiili(boolean focused) {
      this.liiiIilIIi = focused;
      if (!focused) {
         this.lIIIlilIIi = false;
      }
   }

   public void iliIiiliiiii(class_332 my, int ctx, int delta, float mx) {
      long var49 = 3578593435244450431L;
      long var35 = -218581430877195088L;
      long var51 = 3870305821417583449L;
      long var37 = 3204630249066341117L;
      long var53 = -157440829697061150L;
      long var39 = -8220709819333494485L;
      long var41 = -5947964838590363127L;
      long var43 = -449211760659406708L;
      long var45 = 4012810000121564889L;
      long var47 = 1291937918358312133L;
      this.iIlIlilIIi = System.nanoTime();
      this.iiiiIilIIi = ctx >= this.iiliIilIIi
         && ctx <= this.iiliIilIIi + this.lIiiIilIIi
         && delta >= this.IIiiIilIIi
         && delta <= this.IIiiIilIIi + this.iIiiIilIIi;
      Iilllilliill(this.iIIIlilIIi, !this.liiiIilIIi && !this.iiiiIilIIi ? 0.0 : 1.0);
      Iilllilliill(this.IlIIlilIIi, this.IiiiIilIIi.isEmpty() ? 1.0 : 0.0);
      Iilllilliill(this.llIIlilIIi, this.liiiIilIIi ? 0.0 : 1.0);
      double var5 = IIillIiliIil(this.iIIIlilIIi.iIlIlllllill());
      double var7 = 1.0 - IIillIiliIil(this.IlIIlilIIi.iIlIlllllill());
      double var9 = IIillIiliIil(1.0 - var7 / 0.6);
      float var11 = (float)IIillIiliIil((var7 - 0.4) / 0.6);
      double var12 = IIillIiliIil(this.llIIlilIIi.iIlIlllllill());
      IIliiIlllIliiIll var14 = CorzClient.fontRenderer();
      var35 ^= ((long)IilIIIIililIIIIi.Illlllllilll(Ililllililil(16777215, 18), Ililllililil(IlIIilIlllIIilIl.lliiIlliIl, 255), var5) << 32 ^ var35)
         & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(
         my, this.iiliIilIIi, this.IIiiIilIIi, this.lIiiIilIIi, this.iIiiIilIIi, this.IliiIilIIi, IilIIIIililIIIIi.IlIlllIlilIl(), (int)(var35 >>> 32)
      );
      var35 ^= ((long)(this.IIiiIilIIi + (this.iIiiIilIIi - 12) / 2) ^ var35) & -1L >>> 32;
      var37 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-8421505, -1, var5) << 32 ^ var37) & -1L << 32;
      iiIlilIlIIllilIl.IliIlllilIi(
         (float)(this.iiliIilIIi + 8), (float)((int)var35), 12.0F, 12.0F, IlliIilIIi, new Color((int)(var37 >>> 32), true), IIIiiIillIIiiIil.liiiIIllIl()
      );
      var37 ^= ((long)(this.iiliIilIIi + this.lIiiIilIIi - 7) ^ var37) & -1L >>> 32;
      if (this.iliiIilIIi) {
         long var59 = var39 ^ ((long)((int)var14.IilliliilIIi()) << 32 ^ var39) & -1L << 32;
         var39 = var59 ^ ((long)((int)var14.iIlIlllllill(IIiilIiiiIii<"IIiilIiiiIii","RGTmOIv63iSE3H1TgGeOd8KddZ+A6QP8Gv5dLhU=">())) ^ var59) & -1L >>> 32;
         long var62 = var41 ^ ((long)lliliIllililiIll.IliIlllilIi((int)(var39 >>> 32)) << 32 ^ var41) & -1L << 32;
         var41 = var62 ^ ((long)lliliIllililiIll.liiiIIllIl((int)(var62 >>> 32)) ^ var62) & -1L >>> 32;
         long var64 = var43 ^ ((long)((int)var41 + 2 + (int)var39 + 10) << 32 ^ var43) & -1L << 32;
         var43 = var64 ^ ((long)(this.iIiiIilIIi - 6) ^ var64) & -1L >>> 32;
         var45 ^= ((long)(this.iiliIilIIi + this.lIiiIilIIi - 7 - (int)(var43 >>> 32)) << 32 ^ var45) & -1L << 32;
         var45 ^= ((long)(this.IIiiIilIIi + (this.iIiiIilIIi - (int)var43) / 2) ^ var45) & -1L >>> 32;
         if (var9 > 0.01) {
            var47 ^= ((long)Ililllililil(-15461350, (int)(255.0 * var9)) << 32 ^ var47) & -1L << 32;
            var47 ^= ((long)Ililllililil(-1, (int)(24.0 * var9)) ^ var47) & -1L >>> 32;
            IIIiiIillIIiiIil.IIillIiliIil(my, (int)(var45 >>> 32), (int)var45, (int)(var43 >>> 32), (int)var43, 5, (int)(var47 >>> 32), (int)var47);
            var49 ^= ((long)Ililllililil(-7630437, (int)(255.0 * var9)) << 32 ^ var49) & -1L << 32;
            var49 ^= ((long)var14.IlIillIiilIi((int)var45, (int)var43) ^ var49) & -1L >>> 32;
            float var31 = (float)((int)var49) + (float)((int)(var39 >>> 32)) / 2.0F;
            var51 ^= ((long)((int)(var45 >>> 32) + 5) << 32 ^ var51) & -1L << 32;
            var51 ^= ((long)Math.round((float)((int)(var51 >>> 32)) - 0.203125F * (float)((int)(var41 >>> 32))) ^ var51) & -1L >>> 32;
            var53 ^= ((long)(Math.round(var31 - 0.453125F * (float)((int)(var41 >>> 32))) + 2) << 32 ^ var53) & -1L << 32;
            iiIlilIlIIllilIl.IliIlllilIi(
               (float)((int)var51),
               (float)((int)(var53 >>> 32)),
               (float)((int)(var41 >>> 32)),
               (float)((int)(var41 >>> 32)),
               llliIilIIi,
               new Color((int)(var49 >>> 32), true),
               IIIiiIillIIiiIil.liiiIIllIl()
            );
            var14.liiiIIllIl(
               IIiilIiiiIii<"IIiilIiiiIii","RGTmOIv63iSE3H1TgGeOd8KddZ+A6QP8Gv5dLhU=">(),
               (float)((int)(var51 >>> 32) + (int)var41 + 2),
               (float)((int)var49),
               new Color((int)(var49 >>> 32), true)
            );
         }

         var37 ^= ((long)((int)(var45 >>> 32) - 6) ^ var37) & -1L >>> 32;
      }

      var39 ^= ((long)(this.iiliIilIIi + this.lIiiIilIIi - 4 - 12) << 32 ^ var39) & -1L << 32;
      this.IIIllIIliIIl(my, (int)(var39 >>> 32), ctx, delta, var11);
      var39 ^= ((long)(this.iiliIilIIi + 8 + 12 + 7) ^ var39) & -1L >>> 32;
      var41 ^= ((long)var14.IlIillIiilIi(this.IIiiIilIIi, this.iIiiIilIIi) << 32 ^ var41) & -1L << 32;
      float var22 = (float)((this.IiiiIilIIi.isEmpty() ? (int)var37 : (int)(var39 >>> 32) - 4) - (int)var39);
      if (this.IiiiIilIIi.isEmpty()) {
         if (var12 > 0.01) {
            var43 ^= ((long)Ililllililil(-8421505, (int)Math.round(255.0 * var12)) << 32 ^ var43) & -1L << 32;
            var14.IliIlllilIi(Iiilliiliiil(this.lliiIilIIi, var22), (float)((int)var39), (float)((int)(var41 >>> 32)), new Color((int)(var43 >>> 32), true));
         }
      } else {
         String var23 = IIIilIIiiIIi(this.IiiiIilIIi, var22);
         if (this.liiiIilIIi && this.lIIIlilIIi) {
            var43 ^= ((long)((int)var14.iIlIlllllill(var23)) ^ var43) & -1L >>> 32;
            var45 ^= ((long)((int)var14.IilliliilIIi() + 2) << 32 ^ var45) & -1L << 32;
            IIIiiIillIIiiIil.lIiiIiIlilli(
               my,
               (int)var39 - 1,
               this.IIiiIilIIi + (this.iIiiIilIIi - (int)(var45 >>> 32)) / 2,
               (int)var43 + 2,
               (int)(var45 >>> 32),
               2,
               IilIIIIililIIIIi.IIlllIlliIll(0.32)
            );
         }

         var14.IliIlllilIi(var23, (float)((int)var39), (float)((int)(var41 >>> 32)), new Color(-1));
         if (this.liiiIilIIi && !this.lIIIlilIIi) {
            float var24 = (float)((int)var39) + var14.iIlIlllllill(var23) + 1.0F;
            var45 ^= ((long)((int)var14.IilliliilIIi() - 2) << 32 ^ var45) & -1L << 32;
            this.IIIIlilIIi
               .iIlIlllllill(
                  my,
                  var24,
                  this.IIiiIilIIi + (this.iIiiIilIIi - (int)(var45 >>> 32)) / 2,
                  (int)(var45 >>> 32),
                  IlIIilIlllIIilIl.lliiIlliIl,
                  llIilillilIilill.liiiIIllIl()
               );
         }
      }

      if (this.liiiIilIIi && this.IiiiIilIIi.isEmpty()) {
         var43 ^= ((long)((int)var14.IilliliilIIi() - 2) << 32 ^ var43) & -1L << 32;
         this.IIIIlilIIi
            .iIlIlllllill(
               my,
               (float)((int)var39),
               this.IIiiIilIIi + (this.iIiiIilIIi - (int)(var43 >>> 32)) / 2,
               (int)(var43 >>> 32),
               IlIIilIlllIIilIl.lliiIlliIl,
               llIilillilIilill.liiiIIllIl()
            );
      }
   }
}
