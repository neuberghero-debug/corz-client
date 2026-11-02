package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class liiiiiiiiiiiii {
   private long IlIIIiIlIl;
   private static final float IlIiilIlIl = 12.0F;
   private static final float llIiilIlIl = 0.95F;
   private final long IiiiilIlIl;
   private long iiiiilIlIl = 0L;
   private static final float iIliilIlIl = 0.96F;
   private String ilIIIiIlIl;
   private static final float lIliilIlIl = 0.94F;
   private static final float iiIiilIlIl = 130.0F;
   private final boolean iliiilIlIl;
   private static final float IiIiilIlIl = 2000.0F;
   private static final int liliilIlIl = Math.round(178.5F) << 24;
   private static final int IlililIlIl = 8;
   private long lIIIIiIlIl;
   private static final int IIIiilIlIl = 200;
   private static final Color IIiiilIlIl = new Color(-920587, true);
   private static final Color lIiiilIlIl = new Color(-7630437, true);
   private static final float IlliilIlIl = 1.7F;
   private final String lliiilIlIl;
   private static final float llliilIlIl = 16.0F;
   private long liiiilIlIl;
   private static final float IIliilIlIl = 150.0F;
   private static final int iiililIlIl = 140;
   private static final float ilIiilIlIl = 0.82F;
   private static final Color iIiiilIlIl = new Color(-1750963, true);
   private int iiIIIiIlIl;
   private static final int ilililIlIl = 11;
   private static final float liIiilIlIl = 220.0F;
   private static final int liililIlIl = 1;
   private static final int IIililIlIl = 34;
   private static final float illiilIlIl = 240.0F;
   private float iIIIIiIlIl;
   private static final int llililIlIl = 3;
   private static final int iIililIlIl = 20;
   private static final int lIIiilIlIl = IillIllllillIlll.liiiIIllIl(7, 20, 8, 203);
   private static final int IiililIlIl = 10;
   private static final float IiliilIlIl = 0.14F;
   private String IiIIIiIlIl;
   private boolean IIIIIiIlIl = false;
   private final String IliiilIlIl;
   private float llIIIiIlIl;
   private static final int lIililIlIl = 7;
   private int liIIIiIlIl;
   private static final float iIIiilIlIl = 6.0F;
   private static final int iiliilIlIl = 318767103;

   public int IIIllIIliIIl() {
      return 34;
   }

   private static void Illlllllilll(IIliiIlllIliiIll y, String x, float color, float font, float scale, Color s) {
      class_4587 var6 = CorzClient.fontManager.liiiIIllIl();
      var6.method_22903();

      try {
         var6.method_22905(scale, scale, 1.0F);
         y.IliIlllilIi(x, color / scale, font / scale, s);
      } finally {
         var6.method_22909();
      }
   }

   public void IliIlllilIi() {
      if (!this.IIIIIiIlIl) {
         this.IIIIIiIlIl = true;
         this.lIIIIiIlIl = System.nanoTime();
      }
   }

   public void IilliliilIIi() {
      this.liiiilIlIl = System.nanoTime();
      this.iiiiilIlIl = this.liiiilIlIl;
      this.IIIIIiIlIl = false;
   }

   private static boolean Iilllilliill(class_4587 s, class_4587 fms, float cy, float ms, float cx) {
      if (Math.abs(cx - 1.0F) <= 5.0E-4F) {
         return false;
      } else {
         IIillIiliIil(s, cy, ms, cx);
         if (fms != s) {
            IIillIiliIil(fms, cy, ms, cx);
         }

         return true;
      }
   }

   private static float IlIlllIlilIl(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   private static void IIillIiliIil(class_4587 ms, float cx, float cy, float s) {
      ms.method_22903();
      ms.method_46416(cx, cy, 0.0F);
      ms.method_22905(s, s, 1.0F);
      ms.method_46416(-cx, -cy, 0.0F);
   }

   public boolean liiiIIllIl() {
      return this.IIIIIiIlIl;
   }

   public float lIiiIiIlilli() {
      if (!this.IIIIIiIlIl) {
         return 1.0F;
      } else {
         float var1 = IlIlllIlilIl((float)(System.nanoTime() - this.lIIIIiIlIl) / 1000000.0F / 150.0F);
         return 1.0F - var1 * var1;
      }
   }

   private void IiIlliIliiIl(IIliiIlllIliiIll font) {
      long var3 = -8109336099866924204L;
      this.llIIIiIlIl = font.IilliliilIIi();
      this.ilIIIiIlIl = font.Iiilliiliiil(this.IliiilIlIl, 210.52632F);
      this.IiIIIiIlIl = this.lliiilIlIl.isEmpty() ? "" : font.Iiilliiliiil(this.lliiilIlIl, 243.90244F);
      this.iiIIIiIlIl = this.IiIIIiIlIl.isEmpty() ? 11 : IillIllllillIlll.IliIlllilIi(11, 10, 1);
      var3 ^= ((long)((int)Math.ceil((double)Math.max(font.iIlIlllllill(this.ilIIIiIlIl) * 0.95F, font.iIlIlllllill(this.IiIIIiIlIl) * 0.82F))) << 32 ^ var3)
         & -1L << 32;
      this.liIIIiIlIl = IillIllllillIlll.iIlIlllllill(IillIllllillIlll.liiiIIllIl(7, 20, 8, (int)(var3 >>> 32) + 3), 140, lIIiilIlIl);
   }

   private float Iiilliiliiil(long now) {
      if (this.iiiiilIlIl == 0L) {
         return 1.0F;
      } else {
         float var3 = (float)(now - this.iiiiilIlIl) / 1000000.0F / 240.0F;
         if (var3 >= 1.0F) {
            this.iiiiilIlIl = 0L;
            return 1.0F;
         } else {
            return 1.0F + 0.14F * (float)Math.sin(Math.PI * (double)llilliilililliil.liiiIIllIl(var3));
         }
      }
   }

   private static float IIlllIlliIll(float scale, float boxH, float boxTop) {
      return scale + boxH / 2.0F - 8.28F * boxTop;
   }

   public void IIIilIIiiIIi(class_332 ctx, int targetY, float right) {
      long var33 = 7255962168703541306L;
      long var31 = 1369153670857964884L;
      long var4 = System.nanoTime();
      float var6 = (float)(var4 - this.liiiilIlIl) / 1000000.0F;
      if (!this.IIIIIiIlIl && var6 > 2000.0F) {
         this.IliIlllilIi();
      }

      float var7;
      float var8;
      if (this.IIIIIiIlIl) {
         float var9 = IlIlllIlilIl((float)(var4 - this.lIIIIiIlIl) / 1000000.0F / 150.0F);
         if (var9 >= 1.0F) {
            return;
         }

         var7 = 1.0F - var9 * var9;
         var8 = 1.0F - 0.04000002F * var9 * var9;
      } else {
         float var41 = (float)(var4 - this.IiiiilIlIl) / 1000000.0F;
         var7 = llilliilililliil.liiiIIllIl(var41 / 130.0F);
         var8 = 0.94F + 0.060000002F * llilliilililliil.IilliliilIIi(var41 / 220.0F, 1.7F);
      }

      IIliiIlllIliiIll var42 = CorzClient.fontRenderer();
      if (var42.IilliliilIIi() != this.llIIIiIlIl) {
         this.IiIlliIliiIl(var42);
      }

      if (Float.isNaN(this.iIIIIiIlIl)) {
         this.iIIIIiIlIl = right;
      } else {
         float var10 = Math.min(0.05F, (float)(var4 - this.IlIIIiIlIl) / 1.0E9F);
         this.iIIIIiIlIl = this.iIIIIiIlIl + (right - this.iIIIIiIlIl) * (1.0F - (float)Math.exp((double)(-16.0F * var10)));
         if (Math.abs(right - this.iIIIIiIlIl) < 0.01F) {
            this.iIIIIiIlIl = right;
         }
      }

      this.IlIIIiIlIl = var4;
      var31 ^= ((long)(this.iIIIIiIlIl == right ? 1 : 0) << 32 ^ var31) & -1L << 32;
      float var11 = (float)(targetY - this.liIIIiIlIl);
      float var12 = (int)(var31 >>> 32) != 0 ? llliIlIlilliIlIl.IIIllIIliIIl(this.iIIIIiIlIl) : this.iIIIIiIlIl;
      float var13 = IIIiiIillIIiiIil.Illlllllilll();
      class_4587 var14 = IIIiiIillIIiiIil.liiiIIllIl();
      class_4587 var15 = CorzClient.fontManager.liiiIIllIl();
      float var16 = IliiIilliiIi.IilliliilIIi(var7);
      var31 ^= ((long)Iilllilliill(var14, var15, var11 + (float)this.liIIIiIlIl / 2.0F, var12 + 17.0F, var8) ^ var31) & -1L >>> 32;

      try {
         llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.lIIlIlIiIl, var11, var12, (float)this.liIIIiIlIl, 34.0F, 1.0F);
         var33 ^= ((long)((this.iliiilIlIl ? IlIIilIlllIIilIl.lliiIlliIl : -1750963) & 16777215) << 32 ^ var33) & -1L << 32;
         float var19 = var11 + 7.0F;
         float var20 = var12 + 7.0F;
         float var21 = 4.0F;
         var33 ^= ((long)Iilllilliill(var14, var15, var19 + 10.0F, var20 + 10.0F, this.Iiilliiliiil(var4)) ^ var33) & -1L >>> 32;

         try {
            llliIlIlilliIlIl.Iliilliiilii(var19, var20, 20.0F, 20.0F, 6.0F, 1.0F);
            iiIlilIlIIllilIl.IliIlllilIi(
               var19 + var21,
               var20 + var21,
               12.0F,
               12.0F,
               lIlIIiliIlIIil.illIlIilIl(
                  this.iliiilIlIl
                     ? IlIillIiilIi<"IlIillIiilIi","tstG73fBpFDISgxBA3Ab1dktt49GJPTUxFmDdLVtRQ2q">()
                     : IlIillIiilIi<"IlIillIiilIi","bPDJ5eiBKWiSFAgF0SlqNumpECQVW4s46IfH9pJDMxbD">()
               ),
               this.iliiilIlIl ? llliIlIlilliIlIl.IIlllIlliIll() : iIiiilIlIl,
               var14
            );
         } finally {
            Ililllililil(var14, var15, (boolean)((int)var33));
         }

         float var23 = var19 + 20.0F + 8.0F;
         float var24 = var12 + (float)(34 - this.iiIIIiIlIl) / 2.0F;
         float var25 = IIlllIlliIll(var24, 11.0F, 0.95F);
         Illlllllilll(var42, this.ilIIIiIlIl, var23, (int)(var31 >>> 32) != 0 ? llliIlIlilliIlIl.IIIllIIliIIl(var25) : var25, 0.95F, IIiiilIlIl);
         if (!this.IiIIIiIlIl.isEmpty()) {
            float var26 = IIlllIlliIll(var24 + 11.0F + 1.0F, 10.0F, 0.82F);
            Illlllllilll(var42, this.IiIIIiIlIl, var23, (int)(var31 >>> 32) != 0 ? llliIlIlilliIlIl.IIIllIIliIIl(var26) : var26, 0.82F, lIiiilIlIl);
         }

         float var43 = var11 + 8.0F;
         float var27 = var12 + 34.0F - var13 * 2.0F;
         float var28 = (float)this.liIIIiIlIl - 16.0F;
         llliIlIlilliIlIl.IIillIiliIil(var43, var27, var28, var13, 0.0F, 0.0F, 318767103);
         float var29 = llliIlIlilliIlIl.IIIllIIliIIl(var28 * (1.0F - Math.min(1.0F, var6 / 2000.0F)));
         if (var29 > 0.0F) {
            llliIlIlilliIlIl.IIillIiliIil(var43, var27, var29, var13, 0.0F, 0.0F, liliilIlIl | (int)(var33 >>> 32));
         }
      } finally {
         Ililllililil(var14, var15, (boolean)((int)var31));
         IliiIilliiIi.lIiiIiIlilli(var16);
      }
   }

   public liiiiiiiiiiiii(String title, String subtitle, boolean enabled) {
      this.lIIIIiIlIl = 0L;
      this.iIIIIiIlIl = Float.NaN;
      this.IlIIIiIlIl = 0L;
      this.llIIIiIlIl = -1.0F;
      this.ilIIIiIlIl = "";
      this.IiIIIiIlIl = "";
      this.liIIIiIlIl = 140;
      this.iiIIIiIlIl = 11;
      this.IliiilIlIl = title == null ? "" : title;
      this.lliiilIlIl = subtitle == null ? "" : subtitle;
      this.iliiilIlIl = enabled;
      this.IiiiilIlIl = System.nanoTime();
      this.liiiilIlIl = this.IiiiilIlIl;
   }

   private static void Ililllililil(class_4587 pushed, class_4587 ms, boolean fms) {
      if (fms) {
         if (ms != pushed) {
            ms.method_22909();
         }

         pushed.method_22909();
      }
   }

   public boolean iIlIlllllill(String t, String e, boolean s) {
      return this.iliiilIlIl == s && this.IliiilIlIl.equals(t == null ? "" : t) && this.lliiilIlIl.equals(e == null ? "" : e);
   }

   public boolean iliIiiliiiii() {
      return this.IIIIIiIlIl && (float)(System.nanoTime() - this.lIIIIiIlIl) / 1000000.0F >= 150.0F;
   }
}
