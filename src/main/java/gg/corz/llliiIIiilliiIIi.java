package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;

public class llliiIIiilliiIIi {
   private static final float iilIliiiil = 3.0F;
   private static final int lllIliiiil = 12;
   private static final int iiIIliiiil = 6;
   private float IlIlliiiil;
   private int liiIliiiil;
   private static final float IilIliiiil = 9.0F;
   private static final int liIIliiiil = 2;
   private final float[] lIIlliiiil;
   private static final int IiIIliiiil = 4;
   private static final long IliIliiiil = 250000000L;
   private final iIliiIllIlliiIll lliIliiiil;
   private static final float IIiIliiiil = 10.0F;
   private static final float iIiIliiiil = 300.0F;
   private long llIlliiiil;
   private static final int IIlIliiiil = 9;
   private static final int iIlIliiiil = 4;
   private int IiIlliiiil;
   private int IiiIliiiil;
   private static final float lilIliiiil = 9.0F;
   private static final int lIlIliiiil = 22;
   private static final float lIiIliiiil = 28.0F;
   private int iiiIliiiil;
   private static final float illIliiiil = 14.0F;
   private final float[] IIIlliiiil = new float[liIliiiliiIliiil.lllillIiil];
   private final int[][] iIIlliiiil;
   private int liIlliiiil;
   private long ilIlliiiil;
   private int iliIliiiil;
   private static final int IllIliiiil = 7;

   private static int Iiilliiliiil(int t, int c2, float c1) {
      return 0xFF000000 | IIIilIIiiIIi(t | 0xFF000000, c2 | 0xFF000000, (double)c1) & 16777215;
   }

   public void IliIlllilIi(int w, int x, int y, int h) {
      this.iliIliiiil = w;
      this.IiiIliiiil = x;
      this.liiIliiiil = y;
      this.iiiIliiiil = h;
   }

   private static float Illlllllilll(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private static boolean IIlllIlliIll(int px, int ry, int rx, int rw, int rh, int py) {
      return px >= rx && px <= rx + rh && ry >= rw && ry <= rw + py;
   }

   private static int IiIlliIliiIl(int rgb) {
      return 0xFF000000 | rgb & 16777215;
   }

   private float IlIlllIlilIl(float rate, float tgt, float cur) {
      float var4 = rate + (tgt - rate) * (1.0F - (float)Math.exp((double)(-cur * this.IlIlliiiil)));
      return Math.abs(tgt - var4) < 0.0015F ? tgt : var4;
   }

   public void lIiiIiIlilli(class_332 mx, int ctx, int my) {
      long var20 = -5494011785486668059L;
      long var22 = 7640082649307092344L;
      long var24 = 6084629724657201921L;
      long var26 = 4294285314951875350L;
      long var28 = 4296051088436712140L;
      long var30 = 7884939644801935918L;
      this.IiIlliiiil = ctx;
      this.liIlliiiil = my;
      var20 ^= ((long)liIliiiliiIliiil.IilliliilIIi() << 32 ^ var20) & -1L << 32;
      long var5 = System.nanoTime();
      var20 ^= ((long)(this.llIlliiiil != 0L && var5 - this.llIlliiiil <= 250000000L ? 0 : 1) ^ var20) & -1L >>> 32;
      this.IlIlliiiil = (int)var20 != 0 ? 0.0F : Math.min((float)(var5 - this.llIlliiiil) / 1.0E9F, 0.05F);
      this.llIlliiiil = var5;
      if ((int)var20 != 0) {
         this.ilIlliiiil = var5;

         for (var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < this.IIIlliiiil.length; var22 += 4294967296L) {
            this.IIIlliiiil[(int)(var22 >>> 32)] = 0.0F;
            this.lIIlliiiil[(int)(var22 >>> 32)] = (int)(var22 >>> 32) == (int)(var20 >>> 32) ? 1.0F : 0.0F;
         }
      }

      float var8 = (float)(var5 - this.ilIlliiiil) / 1000000.0F;
      IIliiIlllIliiIll var9 = CorzClient.fontRenderer();
      var22 ^= ((long)((int)var9.IilliliilIIi()) ^ var22) & -1L >>> 32;
      var9.liiiIIllIl(
         IlIillIiilIi<"IlIillIiilIi","fUtCGKNsdY1eaJ6L4s3URcF9lwbFVJXMlmKy007dCH1rsKgRXSmiRZCDorOkHoylVztDNAM6pirxVkmWtLDSIDZyCvNL">(),
         (float)(this.iliIliiiil + 2),
         (float)(this.IiiIliiiil + 1),
         new Color(-7630437, true)
      );
      var24 ^= ((long)(this.IiiIliiiil + (int)var22 + 12) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((this.liiIliiiil - 4 - 18) / 4) ^ var24) & -1L >>> 32;
      var26 ^= ((long)this.iIlIlllllill() << 32 ^ var26) & -1L << 32;

      for (long var38 = var26 ^ (0L ^ var26) & -1L >>> 32; (int)var38 < liIliiiliiIliiil.IliIlllilIi().length; var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
         long var39 = var28 ^ ((long)((int)var38 % 4) << 32 ^ var28) & -1L << 32;
         var28 = var39 ^ ((long)((int)var38 / 4) ^ var39) & -1L >>> 32;
         long var40 = var30 ^ ((long)(this.iliIliiiil + 2 + (int)(var28 >>> 32) * ((int)var24 + 6)) << 32 ^ var30) & -1L << 32;
         var30 = var40 ^ ((long)((int)(var24 >>> 32) + (int)var28 * ((int)(var38 >>> 32) + 9)) ^ var40) & -1L >>> 32;
         float var19 = Iilllilliill(Illlllllilll((var8 - (float)((int)var38) * 28.0F) / 300.0F));
         this.iliIiiliiiii(
            mx, var9, (int)var38, (int)(var30 >>> 32), (int)var30, (int)var24, (int)(var38 >>> 32), (int)var22, (int)var38 == (int)(var20 >>> 32), var19
         );
      }
   }

   private static int Ililllililil(int t, float rgb) {
      return Iiilliiliiil(t, -1, rgb);
   }

   private int liiiIIllIl() {
      return (int)CorzClient.fontRenderer().IilliliilIIi();
   }

   private int iIlIlllllill() {
      return this.liiiIIllIl() + 7 + 22;
   }

   private void iliIiiliiiii(class_332 ctx, IIliiIlllIliiIll cardH, int selected, int cw, int cx, int rev, int font, int cy, boolean fh, float i) {
      long var36 = -5304785831273285730L;
      long var38 = -8775003481108031986L;
      long var40 = 3848573246854948856L;
      long var42 = 6590882426953008240L;
      iiliIillIIiiIill var11 = liIliiiliiIliiil.IliIlllilIi()[selected];
      float var12 = (float)cx + (1.0F - i) * 10.0F;
      var36 ^= ((long)IIlllIlliIll(this.IiIlliiiil, this.liIlliiiil, cw - 2, Math.round(var12) - 2, rev + 4, font + 4) << 32 ^ var36) & -1L << 32;
      float var14 = this.IIIlliiiil[selected] = this.IlIlllIlilIl(
         this.IIIlliiiil[selected], (int)(var36 >>> 32) != 0 ? 1.0F : 0.0F, (int)(var36 >>> 32) != 0 ? 14.0F : 9.0F
      );
      float var15 = this.lIIlliiiil[selected] = this.IlIlllIlilIl(this.lIIlliiiil[selected], fh ? 1.0F : 0.0F, 9.0F);
      float var16 = var12 - var14 * 3.0F;
      float var17 = (float)cw - 2.0F;
      float var18 = var16 - 2.0F;
      float var19 = (float)rev + 4.0F;
      float var20 = (float)font + 4.0F;
      float var21 = IliiIilliiIi.IilliliilIIi(Math.max(1.0E-4F, i));

      try {
         float var22 = Math.max(var15 * 0.16F, var14 * 0.15F);
         if (var22 > 0.004F) {
            IIIiiIillIIiiIil.IiIlliIliiIl(ctx, var17, var18, var19, var20, 7.0F, IIillIiliIil(IlIIilIlllIIilIl.lliiIlliIl, var22), 7.0F, 0.42F);
         }

         var36 ^= ((long)IIIilIIiiIIi(234881023, IIIiiIillIIiiIil.IlIillIiilIi(0.8), (double)(var14 * 0.8F)) ^ var36) & -1L >>> 32;
         var36 ^= ((long)IIIilIIiiIIi((int)var36, -805306368 | IlIIilIlllIIilIl.lliiIlliIl & 16777215, (double)var15) ^ var36) & -1L >>> 32;
         var38 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-15723751, -1, 0.02 + 0.06 * (double)Math.max(var14, var15)) << 32 ^ var38) & -1L << 32;
         IIIiiIillIIiiIil.Ililllililil(ctx, var17, var18, var19, var20, 6.0F, (int)(var38 >>> 32), (int)var36);
         var38 ^= ((long)IIIilIIiiIIi(IIIilIIiiIIi(-7630437, -920587, (double)var14), Ililllililil(IlIIilIlllIIilIl.lliiIlliIl, 0.3F), (double)var15) ^ var38)
            & -1L >>> 32;
         cardH.IliIlllilIi(cardH.Iiilliiliiil(var11.iIlIlllllill(), (float)(rev - 8)), (float)(cw + 1), var16, new Color((int)var38, true));
         if (var15 > 0.01F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(ctx, (float)(cw + rev) - 5.0F, var16 + 1.0F, 4.0F, 4.0F, 2.0F, IIillIiliIil(IlIIilIlllIIilIl.lliiIlliIl, var15));
         }

         float var26 = var16 + (float)cy + 7.0F;
         int[] var27 = var11.IilliliilIIi();
         var40 ^= ((long)var27.length << 32 ^ var40) & -1L << 32;
         float var29 = 0.1F * var14;

         for (long var52 = var40 ^ (0L ^ var40) & -1L >>> 32; (int)var52 < (int)(var52 >>> 32); var52 ^= (var52 ^ var52 + (long)1) & -1L >>> 32) {
            long var53 = var42 ^ ((long)(cw + (int)Math.round((double)rev * (double)((int)var52) / (double)((int)(var52 >>> 32)))) << 32 ^ var42) & -1L << 32;
            var42 = var53 ^ ((long)(cw + (int)Math.round((double)rev * (double)((int)var52 + 1) / (double)((int)(var52 >>> 32)))) ^ var53) & -1L >>> 32;
            float var33 = (int)var52 == 0 ? (float)((int)(var42 >>> 32)) - 1.0F : (float)((int)(var42 >>> 32));
            float var34 = (int)var52 == (int)(var52 >>> 32) - 1 ? (float)((int)var42) + 1.0F : (float)((int)var42);
            IIIiiIillIIiiIil.IIIllIIliIIl(
               ctx,
               (float)cw,
               var26,
               (float)rev,
               22.0F,
               4.0F,
               IIIilIIiiIIi(IiIlliIliiIl(var27[(int)var52]), -1, (double)var29),
               var33,
               var26 - 1.0F,
               var34 - var33,
               24.0F
            );
         }

         int[] var30 = this.iIIlliiiil[selected];
         var30[0] = cw - 2;
         var30[1] = Math.round(var12) - 2;
         var30[2] = rev + 4;
         var30[3] = font + 4;
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var21);
      }
   }

   private static int IIillIiliIil(int rgb, float a) {
      long var3 = 2157553732786249806L;
      var3 ^= ((long)Math.round(255.0F * Illlllllilll(a)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | rgb & 16777215;
   }

   public boolean IIIllIIliIIl(double btn, double mxd, int myd) {
      long var11 = 8204611876281493720L;
      long var13 = 2103609901154283757L;
      if (myd != 0) {
         return false;
      } else {
         var11 ^= ((long)((int)btn) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)((int)mxd) ^ var11) & -1L >>> 32;

         for (long var17 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var17 >>> 32) < liIliiiliiIliiil.IliIlllilIi().length; var17 += 4294967296L) {
            int[] var9 = this.iIIlliiiil[(int)(var17 >>> 32)];
            if (var9[2] > 0 && IIlllIlliIll((int)(var11 >>> 32), (int)var11, var9[0], var9[1], var9[2], var9[3])) {
               iiliIillIIiiIill var10 = liIliiiliiIliiil.IliIlllilIi()[(int)(var17 >>> 32)];
               liIliiiliiIliiil.iIlIlllllill(var10);
               Iliiiiilliiiii.IliIlllilIi()
                  .iIlIlllllill(
                     IlIillIiilIi<"IlIillIiilIi","zaGIaWJ16b5qQHdKfhQ2uE0EXEjYUmuHBfTKxT2EMbPY">(),
                     var10.iIlIlllllill() + IlIillIiilIi<"IlIillIiilIi","HYXQU8LDfXkd/Ovn9JCTCUWK0tQhsSTDyiF6pz/VXJvNaJsB">(),
                     true
                  );
               return true;
            }
         }

         return false;
      }
   }

   private static float Iilllilliill(float t) {
      t = Illlllllilll(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private static int IIIilIIiiIIi(int c2, int t, double c1) {
      long var16 = -828850725877394513L;
      long var18 = 3250711919833943375L;
      long var12 = 813573907063148395L;
      long var14 = 6546308823241484488L;
      c1 = Math.max(0.0, Math.min(1.0, c1));
      var12 ^= ((long)(c2 >> 24 & 0xFF) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(c2 >> 16 & 0xFF) ^ var12) & -1L >>> 32;
      var14 ^= ((long)(c2 >> 8 & 0xFF) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)(c2 & 0xFF) ^ var14) & -1L >>> 32;
      var16 ^= ((long)(t >> 24 & 0xFF) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)(t >> 16 & 0xFF) ^ var16) & -1L >>> 32;
      var18 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(t & 0xFF) ^ var18) & -1L >>> 32;
      return (int)((double)((int)(var12 >>> 32)) + (double)((int)(var16 >>> 32) - (int)(var12 >>> 32)) * c1) << 24
         | (int)((double)((int)var12) + (double)((int)var16 - (int)var12) * c1) << 16
         | (int)((double)((int)(var14 >>> 32)) + (double)((int)(var18 >>> 32) - (int)(var14 >>> 32)) * c1) << 8
         | (int)((double)((int)var14) + (double)((int)var18 - (int)var14) * c1);
   }

   public int IilliliilIIi() {
      long var2 = -2073823669164829634L;
      var2 ^= ((long)((liIliiiliiIliiil.IliIlllilIi().length + 4 - 1) / 4) << 32 ^ var2) & -1L << 32;
      return this.liiiIIllIl() + 12 + (int)(var2 >>> 32) * this.iIlIlllllill() + ((int)(var2 >>> 32) - 1) * 9 + 2 + 2;
   }

   public llliiIIiilliiIIi(iIliiIllIlliiIll y, int w, int x, int h, int setting) {
      this.lIIlliiiil = new float[liIliiiliiIliiil.lllillIiil];
      this.iIIlliiiil = new int[liIliiiliiIliiil.lllillIiil][4];
      this.IlIlliiiil = 0.0F;
      this.llIlliiiil = 0L;
      this.ilIlliiiil = 0L;
      this.lliIliiiil = y;
      this.iliIliiiil = w;
      this.IiiIliiiil = x;
      this.liiIliiiil = h;
      this.iiiIliiiil = setting;
   }
}
