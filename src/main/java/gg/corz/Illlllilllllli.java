package gg.corz;

public final class Illlllilllllli extends llllIlilllIl {
   private lIillIlliIillIll IliIIiIIIl;
   private lIillIlliIillIll liiIIiIIIl;
   private static final float[] lIlIIiIIIl = new float[]{0.38F, -0.69F, 1.11F, 2.0F, -0.06F, 1.1F};
   private lIillIlliIillIll iIIlIiIIIl;
   private static final int liIiilIIIl = 14925967;
   private static final int IiliilIIIl = 16513781;
   private lIillIlliIillIll iilIIiIIIl;
   private static final float iIiiilIIIl = 4.1F;
   private static final int iIliilIIIl = 15120522;
   private static final int IlliilIIIl = 13933666;
   private lIillIlliIillIll IiiIIiIIIl;
   private static final float iIIIIiIIIl = 23.8F;
   private static final float[] lilIIiIIIl = new float[]{
      -1.18F, 0.55F, -0.98F, 1.22F, -0.5F, 1.5F, -1.18F, -1.9F, -1.18F, -3.5F, -1.05F, -4.24F, -1.2F, -5.43F, -1.0F, -5.76F
   };
   private static final float[] IIlIIiIIIl = new float[]{1.44F, 0.43F, 1.65F, 0.98F, -0.88F, -0.08F};
   private static final float ilIIIiIIIl = 8.2F;
   private static final float liiiilIIIl = 1.85F;
   private lIillIlliIillIll iIiIIiIIIl;
   private static final int IIliilIIIl = 13605478;
   private lIillIlliIillIll iiiIIiIIIl;
   private lIillIlliIillIll ilIlIiIIIl;
   private static final float[] illIIiIIIl = new float[]{-0.98F, 4.5F, -2.7F};
   private static final float lliiilIIIl = 35.2F;
   private static final float[] IilIIiIIIl = new float[]{-0.4F, 0.5F, -1.2F};
   private static final float IliiilIIIl = 15.2F;
   private static final float llIIIiIIIl = 15.599999F;
   private lIillIlliIillIll lliIIiIIIl;
   private static final float iliiilIIIl = 36.2F;
   private static final float IiIIIiIIIl = 1.2F;
   private static final float[] IllIIiIIIl = new float[]{0.85F, 1.31F, -2.01F, 1.0F, -0.01F, -0.47F};
   private static final float iiiiilIIIl = 32.1F;
   private static final int llliilIIIl = 13144666;
   private lIillIlliIillIll iliIIiIIIl;
   private static final float IiiiilIIIl = 29.9F;
   private lIillIlliIillIll IIIlIiIIIl;
   private static final float IIIIIiIIIl = 28.2F;
   private static final int iiliilIIIl = 2825492;
   private static final int iiIiilIIIl = 12620124;
   private static final int ilIiilIIIl = 16038008;
   private lIillIlliIillIll lIIlIiIIIl;
   private static final float[] iIlIIiIIIl = new float[]{0.4F, 0.76F, -1.08F, 1.86F, 0.99F, 0.03F};
   private static final float[] lllIIiIIIl = new float[]{1.64F, -0.4F, -1.75F, 0.66F, -0.23F, -0.11F};
   private static final int lIliilIIIl = 14592117;
   private static final int lIiiilIIIl = 9067056;
   private static final float IlIIIiIIIl = 1.8F;
   private static final float liIIIiIIIl = 1.8F;
   private static final float[] iiIIIiIIIl = new float[]{0.3F, -1.13F, 2.61F, 1.06F, -0.76F, 1.12F};
   private lIillIlliIillIll lIiIIiIIIl;
   private lIillIlliIillIll llIlIiIIIl;
   private lIillIlliIillIll IIiIIiIIIl;
   private lIillIlliIillIll IlIlIiIIIl;
   private static final int IIiiilIIIl = 4860442;
   private static final int liliilIIIl = 1708557;
   private static final int IiIiilIIIl = 11565637;
   private static final float lIIIIiIIIl = 26.7F;
   private static final int illiilIIIl = 10250808;

   private static void IIIIllIIIl(ililiIilIiiliIil dst, ililiIilIiiliIil src, int from) {
      long var5 = -2575769147390514709L;
      var5 ^= (0L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) < src.lIlIlilIil) {
         for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < src.IIlIlilIil; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            src.liiiIIllIl((int)var5, (int)(var5 >>> 32), dst.IliIlllilIi((int)var5, from - (int)(var5 >>> 32)));
         }

         var5 += 4294967296L;
      }
   }

   private static void IllIllllIl(IIilllIilIilllIi s, float m, iIlIlIliIllIlIli side) {
      float var3 = m * 4.2F;
      float var4 = 24.15F;
      float var5 = m * 4.6F;
      s.ilIllIiIll(new float[]{var3, var4, 0.0F, m * 4.4F, 21.6F, -0.1F, var5, 19.3F, -0.2F}, new float[]{0.6F, 0.57F, 0.56F}, 8, side, false);
      s.lIIlliIIll(var3, var4, 0.0F, 0.6F, 8, side);
      s.lIIlliIIll(var5, 19.3F, -0.2F, 0.56F, 8, side);
   }

   private static void Iiiiliiiiiii(ililiIilIiiliIil c) {
      c.IilliliilIIi(iiiIIIliIIIlIIli.IliIlllilIi(16038008))
         .IlIillIiilIi(0.05F, 14.0F, 3)
         .IIlilIliiIli(iiiIIIliIIIlIIli.IliIlllilIi(11565637), 11.0F, 0.28F, 0.32F, 7)
         .IlIillIiilIi(0.03F, 3.0F, 9);
   }

   private static float IiIIlliIIl(ililiIilIiiliIil y, float c) {
      return (float)y.lIlIlilIil * (35.2F - c) / 19.400002F;
   }

   private static void lliIliliIl(IIilllIilIilllIi foot, float toe, iIlIlIliIllIlIli m, iIlIlIliIllIlIli s, iIlIlIliIllIlIli side) {
      long var15 = 4893125660641611381L;
      float var5 = toe * 1.8F;
      float var6 = var5 + toe * 0.25F;
      foot.lIIlliIIll(var5, 1.3F, 0.0F, 0.55F, 6, m);
      foot.IiiIlliiIl(var6, 0.62F, -1.9F, 1.25F, 0.6F, 2.8F, 12, s);
      foot.IiiIlliiIl(var6 - toe * 0.1F, 0.46F, -3.5F, 1.4F, 0.44F, 1.05F, 10, s);
      foot.IiiIlliiIl(var6, 0.7F, 0.55F, 0.75F, 0.68F, 0.95F, 8, s);

      for (long var17 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var17 >>> 32) < 5; var17 += 4294967296L) {
         float var8 = var6 - toe * (0.8F - (float)((int)(var17 >>> 32)) * 0.4F);
         float var9 = (int)(var17 >>> 32) == 0 ? 1.5F : 1.15F - 0.07F * (float)((int)(var17 >>> 32));
         float var10 = (int)(var17 >>> 32) == 0 ? 0.32F : 0.24F - 0.012F * (float)((int)(var17 >>> 32));
         float var11 = var10 * 0.8F + 0.1F;
         float var12 = -4.15F;
         float var13 = var12 - var9;
         float var14 = toe * ((float)((int)(var17 >>> 32)) - 1.5F) * 0.14F;
         foot.liIlliiIll(
            new float[]{
               var8,
               var11,
               var12 + 0.25F,
               var8 + var14 * 0.5F,
               var11 + 0.01F,
               var12 - var9 * 0.5F,
               var8 + var14 * 0.85F,
               var11 - 0.1F,
               var12 - var9 * 0.85F,
               var8 + var14,
               var11 - 0.12F,
               var13,
               var8 + var14 * 1.05F,
               var11 - 0.1F,
               var13 - var10 * 0.35F
            },
            new float[]{var10, var10 * 0.97F, var10 * 0.88F, var10 * 0.66F, var10 * 0.14F},
            new float[]{var10 * 0.9F, var10 * 0.87F, var10 * 0.8F, var10 * 0.6F, var10 * 0.12F},
            5,
            side,
            null,
            null,
            0.0F,
            1.0F,
            0.0F
         );
      }
   }

   private static float iiiIlIIIll(float knee, float leg, float sole) {
      long var9 = 5014086121384668139L;
      float var3 = knee + leg;
      float var4 = 15.599999F
         + -7.3999996F * (float)Math.cos((double)knee)
         + 0.2F * (float)Math.sin((double)knee)
         + -7.0F * (float)Math.cos((double)var3)
         - 0.2F * (float)Math.sin((double)var3);
      float var5 = (float)Math.cos((double)sole);
      float var6 = (float)Math.sin((double)sole);
      float var7 = Float.MAX_VALUE;

      for (long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < lilIIiIIIl.length; var11 += 8589934592L) {
         var7 = Math.min(var7, lilIIiIIIl[(int)(var11 >>> 32)] * var5 - lilIIiIIIl[(int)(var11 >>> 32) + 1] * var6);
      }

      return var4 + var7;
   }

   private static float Iliilliiilii(float ex) {
      return (float)(-Math.toDegrees(Math.asin((double)(ex / 4.1F))));
   }

   @Override
   public int IlIlllIlilIl() {
      return 3;
   }

   private static void iIiIlIliIl(IIilllIilIilllIi side, float m, iIlIlIliIllIlIli s) {
      float var3 = m * 1.8F;
      side.ilIllIiIll(new float[]{var3, 8.2F, -0.2F, var3, 4.5F, -0.05F, var3, 1.2F, 0.0F}, new float[]{0.7F, 0.62F, 0.55F}, 8, s, true);
   }

   private static void lilIliilIl(IIilllIilIilllIi h, float grip, iIlIlIliIllIlIli s, boolean side) {
      long var16 = 4491537215401340662L;
      long var14 = 378542536563927339L;
      float var4 = grip * 4.7999997F;
      h.IiiIlliiIl(var4, 14.4F, -0.7F, 0.62F, 0.9F, 0.7F, 10, s);
      if (side) {
         float var5 = grip * 4.65F;
         float var18 = -0.9F;
         float var7 = 0.58F;
         h.IiiIlliiIl(var5 + grip * 0.45F, 14.45F, var18 - 0.15F, 0.5F, 0.88F, 0.62F, 10, s);
         h.IiiIlliiIl(var5 - grip * 0.36F, 14.45F, var18 + 0.32F, 0.34F, 0.78F, 0.42F, 8, s);
         var14 ^= (0L ^ var14) & -1L << 32;

         while ((int)(var14 >>> 32) < 4) {
            var14 ^= ((long)((int)(var14 >>> 32) == 3 ? 1 : 0) ^ var14) & -1L >>> 32;
            float var10 = (int)var14 != 0 ? 13.85F : 15.0F - (float)((int)(var14 >>> 32)) * 0.4F;
            float var11 = (int)var14 != 0 ? 0.16F : 0.21F - 0.02F * (float)((int)(var14 >>> 32));
            float var12 = (int)var14 != 0 ? 0.8F : 1.0F;
            float var13 = grip * 0.05F * (float)((int)(var14 >>> 32));
            h.ilIllIiIll(
               new float[]{
                  var5 + grip * var7 * 0.92F + var13,
                  var10,
                  var18 - var7 * 0.4F,
                  var5 + grip * var7 * 0.2F,
                  var10 - 0.03F,
                  var18 - var7 * 0.98F,
                  var5 - grip * var7 * 0.7F * var12,
                  var10 - 0.06F,
                  var18 - var7 * 0.72F,
                  var5 - grip * var7 * 0.95F * var12,
                  var10 - 0.08F,
                  var18 + var7 * 0.2F * var12
               },
               new float[]{var11, var11, var11 * 0.94F, var11 * 0.82F},
               5,
               s,
               true
            );
            var14 += 4294967296L;
         }

         h.ilIllIiIll(
            new float[]{var5 - grip * 0.15F, 15.35F, var18 + 0.35F, var5 - grip * 0.6F, 15.05F, var18 - 0.45F, var5 - grip * 0.3F, 14.75F, var18 - 0.95F},
            new float[]{0.23F, 0.2F, 0.16F},
            5,
            s,
            true
         );
      } else {
         for (long var21 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var21 >>> 32) < 4; var21 += 4294967296L) {
            float var6 = -1.15F + (float)((int)(var21 >>> 32)) * 0.36F;
            h.ilIllIiIll(
               new float[]{
                  var4 - grip * 0.3F,
                  14.2F,
                  var6,
                  var4 - grip * 0.6F,
                  13.7F,
                  var6 - 0.04F,
                  var4 - grip * 0.45F,
                  13.32F,
                  var6 + 0.02F,
                  var4 - grip * 0.08F,
                  13.42F,
                  var6 + 0.15F
               },
               new float[]{0.17F, 0.17F, 0.16F, 0.14F},
               5,
               s,
               true
            );
         }

         h.ilIllIiIll(
            new float[]{var4 - grip * 0.35F, 14.6F, -1.2F, var4 - grip * 0.62F, 14.05F, -1.45F, var4 - grip * 0.5F, 13.75F, -1.38F},
            new float[]{0.19F, 0.17F, 0.15F},
            5,
            s,
            true
         );
      }
   }

   private lIillIlliIillIll Iilililiiili(IIilllIilIilllIi s, String side, float name) {
      float var4 = name * 1.85F;
      float var5 = IIiilIiiiIii(var4);
      double var6 = Math.toRadians((double)Iliilliiilii(var4));
      return s.IlIlllIlilIl(side, this.IIiIIiIIIl, var4 + 1.8F * (float)Math.sin(var6), 29.9F, var5 + 1.8F * (float)Math.cos(var6));
   }

   @Override
   public String iliIiiliiiii() {
      return iIlIlllllill<"iIlIlllllill","2r9qvssr0J+liCCZGqa3NPBH9vdpHCusoa+KDI5UoxFh15GaPrR79UW5QL4+qJYNjVGb13M=">();
   }

   private static float IlIllllIll(float v, float lim) {
      return v < -lim ? -lim : (v > lim ? lim : v);
   }

   private static float llIIlilIIl(ililiIilIiiliIil x, float c) {
      double var2 = Math.asin((double)Math.max(-1.0F, Math.min(1.0F, c / 4.1F)));
      return (float)x.IIlIlilIil * (float)(0.5 - var2 / (Math.PI * 2));
   }

   @Override
   public void lIiiIiIlilli(iiiIlIIIll a, IIlllilllIlllill p) {
      float var3 = a.ilillllIiillll;
      float var4 = a.Ilillllllillll * 0.6662F;
      float var5 = ilIllIiIll((var3 - 0.88F) / 0.1F);
      float var6 = a.iIlIlllllill(0.0F) * (0.55F + 0.15F * var5);
      float var7 = a.iIlIlllllill((float) Math.PI) * (0.55F + 0.15F * var5);
      float var8 = -a.IilliliilIIi((float) Math.PI) * (0.6F + 0.45F * var5);
      float var9 = -a.IilliliilIIi(0.0F) * (0.6F + 0.45F * var5);
      float var10 = IiiIlliiIl(var4, var3);
      float var11 = IiiIlliiIl(var4 + (float) Math.PI, var3);
      float var12 = Math.min(iiiIlIIIll(var6, var8, var10), iiiIlIIIll(var7, var9, var11));
      float var13 = var3 * Math.abs((float)Math.sin((double)var4));
      float var14 = (1.0F - var13) * var3;
      float var15 = a.IIIillllIIilll * 0.25F;
      p.iIlIlllllill(this.IIiIIiIIIl, var15 - 0.08F * var3, a.liilllliiillll * 0.35F, -0.05F * var3 * (float)Math.sin((double)(var4 + 0.6F)));
      p.IilliliilIIi(this.IIiIIiIIIl, 0.0F, 0.45F * var13, 0.0F);
      p.iliIiiliiiii(this.IIiIIiIIIl, 1.0F + 0.03F * var14, 1.0F - 0.04F * var14, 1.0F + 0.03F * var14);
      float var16 = 0.15F + 0.2F * var3 + (0.13F - 0.11F * a.iIlIlllllill((float) Math.PI)) * var12;
      float var17 = lIIlliIIll(a.iIlIlllllill((float) Math.PI) * 0.25F, 2.6F + 0.12F * var13, var5) - var15;
      float var18 = 0.0F;
      float var19 = lIIlliIIll(0.06F + 0.03F * a.IIIllIIliIIl(70.0F, 1.0F), -0.1F, var5);
      float var20 = a.iIlIlllllill(0.0F) * (0.35F + 0.35F * var5) - var15;
      float var21 = 0.0F;
      float var22 = -0.06F - 0.03F * a.IIIllIIliIIl(70.0F, 0.0F);
      float var23 = lIIlliIIll(var16, 0.6F, var5) + 0.6F * Math.abs(var15);
      float var24 = 0.15F + 0.2F * var3 + 0.7F * var5;
      float var25 = 0.0F;
      float var26 = 0.0F;
      float var27 = 0.0F;
      float var28 = 0.0F;
      float var29 = IlIllllIll(a.IIIillllIIilll * 0.4F, 0.18F);
      float var30 = IlIllllIll(a.liilllliiillll * 0.5F, 0.22F);
      p.liiiIIllIl(this.lIiIIiIIIl, var29, var30, 0.0F);
      p.liiiIIllIl(this.iIiIIiIIIl, var29, var30, 0.0F);
      if (var3 < 0.3F && a.iIIilllIlIilll <= 0.0F && !a.iIiilllIliilll && !a.IiIilllliIilll) {
         float var31 = (a.lIilllliIillll + (float)(a.lliillliliilll & 63)) % 90.0F;
         if (var31 < 30.0F) {
            float var32 = var31 % 10.0F / 10.0F;
            float var33 = 1.0F - var3 / 0.3F;
            var23 += (float)Math.sin((double)var32 * Math.PI) * 0.55F * var33;
            p.iIlIlllllill(this.IIiIIiIIIl, 0.0F, 0.0F, (float)Math.sin((double)var32 * Math.PI) * 0.02F * var33);
         }
      }

      if (a.iIIilllIlIilll > 0.0F) {
         float var43 = a.iIIilllIlIilll;
         float var45 = 0.0F;
         float var34;
         float var46;
         if (var43 < 0.3F) {
            float var35 = ilIllIiIll(var43 / 0.3F) * 2.0F;
            var45 = var35 < 1.0F ? var35 : 2.0F - var35;
            var46 = Math.max(0.0F, var35 - 1.0F);
            var34 = 0.0F;
         } else {
            var46 = 1.0F - ilIllIiIll((var43 - 0.3F) / 0.2F);
            var34 = var43 < 0.6F ? ilIllIiIll((var43 - 0.3F) / 0.2F) : 1.0F - ilIllIiIll((var43 - 0.6F) / 0.4F);
         }

         float var47 = 1.0F - var45 - var46 - var34;
         var17 = var47 * var17 + var45 * lIlIIiIIIl[0] + var46 * iiIIIiIIIl[0] + var34 * IIlIIiIIIl[0];
         var18 = var47 * var18 + var45 * lIlIIiIIIl[1] + var46 * iiIIIiIIIl[1] + var34 * IIlIIiIIIl[1];
         var19 = var47 * var19 + var45 * lIlIIiIIIl[2] + var46 * iiIIIiIIIl[2] + var34 * IIlIIiIIIl[2];
         var23 = var47 * var23 + var45 * lIlIIiIIIl[3] + var46 * iiIIIiIIIl[3] + var34 * IIlIIiIIIl[3];
         var25 = var45 * lIlIIiIIIl[4] + var46 * iiIIIiIIIl[4] + var34 * IIlIIiIIIl[4];
         var26 = var45 * lIlIIiIIIl[5] + var46 * iiIIIiIIIl[5] + var34 * IIlIIiIIIl[5];
         var20 = var47 * var20 + var45 * iIlIIiIIIl[0] + var46 * IllIIiIIIl[0] + var34 * lllIIiIIIl[0];
         var21 = var47 * var21 + var45 * iIlIIiIIIl[1] + var46 * IllIIiIIIl[1] + var34 * lllIIiIIIl[1];
         var22 = var47 * var22 + var45 * iIlIIiIIIl[2] + var46 * IllIIiIIIl[2] + var34 * lllIIiIIIl[2];
         var24 = var47 * var24 + var45 * iIlIIiIIIl[3] + var46 * IllIIiIIIl[3] + var34 * lllIIiIIIl[3];
         var27 = var45 * iIlIIiIIIl[4] + var46 * IllIIiIIIl[4] + var34 * lllIIiIIIl[4];
         var28 = var45 * iIlIIiIIIl[5] + var46 * IllIIiIIIl[5] + var34 * lllIIiIIIl[5];
         float var36 = var46 + 0.5F * var45;
         float var37 = var36 * illIIiIIIl[0] + var34 * IilIIiIIIl[0];
         float var38 = var36 * illIIiIIIl[1] + var34 * IilIIiIIIl[1];
         float var39 = var36 * illIIiIIIl[2] + var34 * IilIIiIIIl[2];
         p.IilliliilIIi(this.IliIIiIIIl, var37, var38, var39);
         p.IilliliilIIi(this.IiiIIiIIIl, -var37, var38, var39);
         float var40 = var43 > 0.45F && var43 < 0.65F ? (float)Math.sin((double)((var43 - 0.45F) / 0.2F) * Math.PI) : 0.0F;
         float var41;
         if (var43 < 0.3F) {
            var41 = 0.12F * ilIllIiIll(var43 / 0.3F);
         } else if (var43 < 0.6F) {
            var41 = 0.12F - 0.34F * ilIllIiIll((var43 - 0.3F) / 0.15F);
         } else {
            var41 = -0.22F * (1.0F - ilIllIiIll((var43 - 0.6F) / 0.4F));
         }

         p.iIlIlllllill(this.IIiIIiIIIl, var41, 0.0F, 0.0F);
         p.IilliliilIIi(this.IIiIIiIIIl, 0.0F, -0.35F * var40, 0.0F);
         if (var43 > 0.45F && var43 < 0.6F) {
            float var42 = (float)Math.sin((double)((var43 - 0.45F) / 0.15F) * Math.PI);
            p.iliIiiliiiii(this.IIiIIiIIIl, 1.0F + 0.05F * var42, 1.0F - 0.06F * var42, 1.0F + 0.05F * var42);
         }
      }

      if (a.IiIilllliIilll) {
         p.iIlIlllllill(this.IIiIIiIIIl, -0.3F, 0.0F, 0.0F);
         var17 += 0.3F;
         var20 += 0.3F;
         var23 += 0.3F;
         var6 += 0.45F;
         var7 += 0.45F;
         var8 -= 0.9F;
         var9 -= 0.9F;
         var10 = 0.0F;
         var11 = 0.0F;
      }

      if (a.iiIilllIIlilll || a.lIlillliIlilll) {
         var17 = -0.4F;
         var18 = 0.0F;
         var19 = 0.9F;
         var20 = -0.4F;
         var21 = 0.0F;
         var22 = -0.9F;
      } else if (a.Illillllllilll && a.iIIilllIlIilll <= 0.0F) {
         var17 = 0.35F;
         var18 = 0.0F;
         var19 = 0.12F;
         var23 = 2.3F;
         var25 = 0.5F;
         var26 = 0.28F;
         var20 = 0.5F;
         var21 = 0.0F;
         var22 = -0.1F;
         var24 = 0.6F;
      }

      p.liiiIIllIl(this.IliIIiIIIl, var17, var18, var19);
      p.liiiIIllIl(this.IiiIIiIIIl, var20, var21, var22);
      p.liiiIIllIl(this.lliIIiIIIl, var23, 0.0F, 0.0F);
      p.liiiIIllIl(this.liiIIiIIIl, var24, 0.0F, 0.0F);
      p.liiiIIllIl(this.iliIIiIIIl, var25, 0.0F, var26);
      p.liiiIIllIl(this.iiiIIiIIIl, var27, 0.0F, var28);
      p.liiiIIllIl(this.IIIlIiIIIl, var6, 0.0F, 0.0F);
      p.liiiIIllIl(this.IlIlIiIIIl, var7, 0.0F, 0.0F);
      p.liiiIIllIl(this.lIIlIiIIIl, var8, 0.0F, 0.0F);
      p.liiiIIllIl(this.llIlIiIIIl, var9, 0.0F, 0.0F);
      p.liiiIIllIl(this.iIIlIiIIIl, var10 - var6 - var8, 0.0F, 0.0F);
      p.liiiIIllIl(this.ilIlIiIIIl, var11 - var7 - var9, 0.0F, 0.0F);
      if (a.Illillllllilll) {
         p.liiiIIllIl(this.IIIlIiIIIl, 1.35F, 0.0F, 0.3F);
         p.liiiIIllIl(this.IlIlIiIIIl, 1.35F, 0.0F, -0.3F);
         p.liiiIIllIl(this.lIIlIiIIIl, -0.55F, 0.0F, 0.0F);
         p.liiiIIllIl(this.llIlIiIIIl, -0.55F, 0.0F, 0.0F);
         p.liiiIIllIl(this.iIIlIiIIIl, -0.5F, 0.0F, 0.0F);
         p.liiiIIllIl(this.ilIlIiIIIl, -0.5F, 0.0F, 0.0F);
      } else if (!a.iiIilllIIlilll && !a.lIlillliIlilll && !a.illilllIililll) {
         float var44 = Math.min(iiiIlIIIll(var6, var8, var10), iiiIlIIIll(var7, var9, var11));
         p.IilliliilIIi(this.iilIIiIIIl, 0.0F, -var44, 0.0F);
      }

      if (a.IIiillllIiilll) {
         p.iliIiiliiiii(this.IIiIIiIIIl, 1.07F, 0.93F, 1.07F);
      }
   }

   private void lIlIliIlIl(IIilllIilIilllIi s) {
      long var11 = 2701787656975883240L;
      iIlIlIliIllIlIli var2 = s.Iilililiiili(16513781);
      iIlIlIliIllIlIli var3 = s.Iilililiiili(1708557);
      iIlIlIliIllIlIli var4 = s.Iilililiiili(16777215);

      for (long var13 = var11 ^ (-4294967296L ^ var11) & -1L << 32; (int)(var13 >>> 32) <= 1; var13 += 8589934592L) {
         float var6 = (float)((int)(var13 >>> 32)) * 1.85F;
         float var7 = IIiilIiiiIii(var6);
         float var8 = Iliilliiilii(var6);
         float var9 = (float)Math.sin(Math.toRadians((double)var8));
         float var10 = (float)Math.cos(Math.toRadians((double)var8));
         s.IiIlliIliiIl(this.IIiIIiIIIl);
         s.Iilllilliill().Ililllililil(var6, 29.9F, var7).IIIilIIiiIIi(var8);
         s.IiiIlliiIl(0.0F, 0.0F, 0.0F, 1.42F, 1.6F, 0.78F, 16, var2);
         s.IIillIiliIil();
         s.IiIlliIliiIl((int)(var13 >>> 32) > 0 ? this.lIiIIiIIIl : this.iIiIIiIIIl);
         s.Iilllilliill().Ililllililil(var6, 29.9F, var7).IIIilIIiiIIi(var8);
         s.IiiIlliiIl((float)(-((int)(var13 >>> 32))) * 0.31F, -0.05F, -0.62F, 0.5F, 0.52F, 0.24F, 8, var3);
         s.lIIlliIIll((0.15F + 0.84F * var9) / var10, 0.22F, -0.84F, 0.16F, 6, var4);
         s.IIillIiliIil();
      }

      s.IiIlliIliiIl(this.IIiIIiIIIl);
      s.IiiIlliiIl(0.0F, 28.300001F, -3.85F, 0.6F, 0.9F, 0.48F, 12, s.Iilililiiili(13933666));
   }

   private static void iiIIlIIlIl(ililiIilIiiliIil c) {
      long var5 = -2909638296626432978L;
      c.IilliliilIIi(iiiIIIliIIIlIIli.IliIlllilIi(14925967));
      float var1 = (float)c.IIlIlilIil * 0.52F;
      float var2 = (float)c.lIlIlilIil * 0.48F;

      for (long var7 = var5 ^ (4294967296L ^ var5) & -1L << 32; (int)(var7 >>> 32) <= 9; var7 += 4294967296L) {
         float var4 = (float)((int)(var7 >>> 32) * c.IIlIlilIil) * 0.055F;
         c.IIlllIlliIll(var1, var2, var4 * 1.04F, var4, 1.1F, iiiIIIliIIIlIIli.IilliliilIIi(12620124, 0.75F));
      }

      c.Illlllllilll(var1, var2, (float)c.IIlIlilIil * 0.92F, (float)c.lIlIlilIil * 0.3F, 1.2F, iiiIIIliIIIlIIli.IilliliilIIi(11041354, 0.6F));
      c.IlIillIiilIi(0.05F, 6.0F, 13);
   }

   @Override
   public float IIIllIIliIIl() {
      return 1.2F;
   }

   private void iIIIlIlIIl(ililiIilIiiliIil c) {
      long var11 = 4985722777272263400L;
      float var2 = (float)c.lIlIlilIil * 0.38F;
      float var3 = (float)c.lIlIlilIil * 0.62F;

      for (var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) <= 1; var11 += 4294967296L) {
         float var5 = (float)((int)(var11 >>> 32) * c.IIlIlilIil);
         c.Illlllllilll(var5, var2 - 1.0F, var5, var3 + 1.0F, 6.5F, iiiIIIliIIIlIIli.IilliliilIIi(9067056, 0.22F));
         c.Illlllllilll(var5 - 1.9F, var2 + 1.2F, var5 - 1.9F, var3 - 1.2F, 1.0F, iiiIIIliIIIlIIli.IilliliilIIi(16770748, 0.4F));
         c.Illlllllilll(var5 + 1.9F, var2 + 1.2F, var5 + 1.9F, var3 - 1.2F, 1.0F, iiiIIIliIIIlIIli.IilliliilIIi(9067056, 0.5F));
         c.Illlllllilll(var5, var2, var5, var3, 1.8F, iiiIIIliIIIlIIli.IilliliilIIi(3810326, 0.6F));
      }

      for (long var17 = var11 ^ (-4294967296L ^ var11) & -1L << 32; (int)(var17 >>> 32) <= 1; var17 += 8589934592L) {
         float var13 = llIIlilIIl(c, (float)((int)(var17 >>> 32)) * 1.85F);
         float var6 = IiIIlliIIl(c, 29.9F);
         c.IiIlliIliiIl(var13, var6, 13.5F, 15.0F, iiiIIIliIIIlIIli.IilliliilIIi(9067056, 0.85F));
         float var7 = llIIlilIIl(c, (float)((int)(var17 >>> 32)) * 2.0F);
         float var8 = IiIIlliIIl(c, 32.1F);
         float var9 = llIIlilIIl(c, (float)((int)(var17 >>> 32)) * 0.55F);
         float var10 = llIIlilIIl(c, (float)((int)(var17 >>> 32)) * 3.4F);
         c.Iilllilliill(var9, var8 + 1.6F, var7, var8 - 3.5F, var10, var8 + 1.0F, 5.2F, iiiIIIliIIIlIIli.IliIlllilIi(2825492));
         c.Iilllilliill(var9, var8 + 4.6F, var7, var8 - 0.8F, var10, var8 + 3.4F, 1.6F, iiiIIIliIIIlIIli.IilliliilIIi(7029798, 0.6F));
      }

      float var4 = llIIlilIIl(c, 1.75F);
      float var14 = llIIlilIIl(c, -1.75F);
      float var15 = IiIIlliIIl(c, 26.7F);
      c.Iilllilliill(var4, var15 - 3.5F, (float)c.IIlIlilIil * 0.5F, var15 + 5.5F, var14, var15 - 3.5F, 2.6F, iiiIIIliIIIlIIli.IliIlllilIi(4860442));
      c.Iilllilliill(
         var4 + 1.0F, var15 - 1.5F, (float)c.IIlIlilIil * 0.5F, var15 + 8.5F, var14 - 1.0F, var15 - 1.5F, 1.2F, iiiIIIliIIIlIIli.IilliliilIIi(15780244, 0.45F)
      );
      c.IiIlliIliiIl(var4 - 0.5F, var15 - 3.8F, 1.6F, 1.6F, iiiIIIliIIIlIIli.IliIlllilIi(4860442));
      c.IiIlliIliiIl(var14 + 0.5F, var15 - 3.8F, 1.6F, 1.6F, iiiIIIliIIIlIIli.IliIlllilIi(4860442));
      c.IiIlliIliiIl((float)c.IIlIlilIil * 0.5F, IiIIlliIIl(c, 27.6F), 3.4F, 1.4F, iiiIIIliIIIlIIli.IilliliilIIi(10381882, 0.35F));
   }

   private static void illIlIilIl(IIilllIilIilllIi m, float s, iIlIlIliIllIlIli side) {
      float var3 = s * 4.6F;
      float var4 = s * 4.7999997F;
      m.ilIllIiIll(new float[]{var3, 19.3F, -0.2F, var4, 17.0F, -0.45F, var4, 14.7F, -0.65F}, new float[]{0.55F, 0.5F, 0.44F}, 8, side, false);
   }

   private static float IiiIlliiIl(float amt, float phase) {
      float var2 = (float)Math.IEEEremainder((double)amt, Math.PI * 2);
      float var3 = (var2 + 0.25F) / 0.4F;
      return phase * (0.32F * (float)Math.exp((double)(-var3 * var3)) - 0.3F * Math.max(0.0F, -((float)Math.sin((double)var2))));
   }

   private static float IIiilIiiiIii(float ex) {
      return -((float)Math.sqrt((double)(16.81F - ex * ex))) + 0.18F;
   }

   private static float lIIlliIIll(float a, float b, float t) {
      return a + (b - a) * t;
   }

   @Override
   protected void IilliliilIIi(IIilllIilIilllIi s) {
      long var19 = 2465415578515887995L;
      long var21 = -4953530687550702430L;
      this.iilIIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","plun8OmumHcgOVK+rfz9u7kN+cAEJGhPoC53DpNegUY=">(), s.IIIllIIliIIl(), 0.0F, 15.2F, 0.0F);
      this.IIiIIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","DOXSmyhPv4u4RuzHb8wgtzdU43Hc9QkRiyJ6qI7v8w==">(), this.iilIIiIIIl, 0.0F, 15.2F, 0.0F);
      this.lIiIIiIIIl = this.Iilililiiili(s, iIlIlllllill<"iIlIlllllill","mhmNjdfgQ9tZRTa/YSJ29rcJLeT91u3A9ksRyeH16hzXacE=">(), 1.0F);
      this.iIiIIiIIIl = this.Iilililiiili(s, iIlIlllllill<"iIlIlllllill","YZyCoA+Qp8Rq3GL5SgTf70q/imrAwrwhyuJFF0t3Ocy8XQk=">(), -1.0F);
      this.IliIIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","8pbtwoOf33ggfLm2pLLPoqVttiIrzYWzNBd7LLdfVblg">(), this.IIiIIiIIIl, 4.2F, 24.15F, 0.0F);
      this.lliIIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","aNC7epQDP3uKPCzSSgYhrYJm7JwL/ULcpCoo3o6d0IZ+Ew==">(), this.IliIIiIIIl, 4.6F, 19.3F, -0.2F);
      this.iliIIiIIIl = s.IlIlllIlilIl(
         iIlIlllllill<"iIlIlllllill","dMkjmVgQkps3Ixh2ZGlh5xG2BIkEPLD/K6Y6lea11XktrQ==">(), this.lliIIiIIIl, 4.7999997F, 14.8F, -0.65F
      );
      this.IiiIIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","hRY32ygUqq2MKpYxxhWxmbzevDV+wBTt7MBI2e1Dp6Uv">(), this.IIiIIiIIIl, -4.2F, 24.15F, 0.0F);
      this.liiIIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","nl79c1gLRjQFGdbw9zMQnCU0PytxGN5qzqDRCuEXgXWTXw==">(), this.IiiIIiIIIl, -4.6F, 19.3F, -0.2F);
      this.iiiIIiIIIl = s.IlIlllIlilIl(
         iIlIlllllill<"iIlIlllllill","LwgSTkJ/YuJvMnxrezXDaXNhILOzJ/Rz83hb2vdaWwaSbw==">(), this.liiIIiIIIl, -4.7999997F, 14.8F, -0.65F
      );
      this.IIIlIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","6rV6VsNvfPXjWJupIwfvCLK9w9emjoZ295YR35Fkw3o1">(), this.iilIIiIIIl, 1.8F, 15.599999F, 0.0F);
      this.lIIlIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","yhM0rRIMVbRFGKHEMugN7lfIswcZ67rcS7438P3V5NT5+w==">(), this.IIIlIiIIIl, 1.8F, 8.2F, -0.2F);
      this.iIIlIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","HwFlX+24RL6IbTx/1WOCLE8ERhZi5U16qw2q5OkipDqs2Q==">(), this.lIIlIiIIIl, 1.8F, 1.2F, 0.0F);
      this.IlIlIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","oXYbgOfnTFEHoXYjt2c5OyL4/ctGbmYBcUGtEIC6GNQK">(), this.iilIIiIIIl, -1.8F, 15.599999F, 0.0F);
      this.llIlIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","mhM0PwS3qIOyf18UB+qc5RIT79RcvuzCHBqHqM4C0me/YA==">(), this.IlIlIiIIIl, -1.8F, 8.2F, -0.2F);
      this.ilIlIiIIIl = s.IlIlllIlilIl(iIlIlllllill<"iIlIlllllill","S0Ax0VeszOeIjGxgb5WAfJ3Z+Uq8TUE1hNiFHVzzO/M/NA==">(), this.llIlIiIIIl, -1.8F, 1.2F, 0.0F);
      s.Illlllllilll(this.IliIIiIIIl);
      iIlIliilIllIliil var2 = s.Illillliilli(216, 160);
      ililiIilIiiliIil var3 = var2.IliIlllilIi();
      Iiiiliiiiiii(var3);
      iIlIliilIllIliil var4 = s.Illillliilli(216, 11);
      IIIIllIIIl(var3, var4.IliIlllilIi(), var4.IliilIilil - 1);
      iIlIliilIllIliil var5 = s.Illillliilli(216, 12);
      IIIIllIIIl(var3, var5.IliIlllilIi(), var2.IliilIilil - 1);
      this.iIIIlIlIIl(var3);
      iIlIliilIllIliil var6 = s.Illillliilli(72, 72);
      iiIIlIIlIl(var6.IliIlllilIi());
      iIlIliilIllIliil var7 = s.Illillliilli(48, 96);
      var7.IliIlllilIi()
         .IilliliilIIi(iiiIIIliIIIlIIli.IliIlllilIi(13144666))
         .IlIillIiilIi(0.05F, 10.0F, 41)
         .IIlilIliiIli(iiiIIIliIIIlIIli.IliIlllilIi(10250808), 5.0F, 0.3F, 0.45F, 43);
      iIlIliilIllIliil var8 = s.Illillliilli(32, 64);
      var8.IliIlllilIi()
         .IilliliilIIi(iiiIIIliIIIlIIli.IliIlllilIi(13605478))
         .IIlilIliiIli(iiiIIIliIIIlIIli.IliIlllilIi(11565637), 6.0F, 0.15F, 0.3F, 51)
         .IlIillIiilIi(0.04F, 4.0F, 52);
      iIlIliilIllIliil var9 = s.Illillliilli(4, 16);
      ililiIilIiiliIil var10 = var9.IliIlllilIi();
      var19 ^= (0L ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) < var10.lIlIlilIil) {
         var19 ^= (
               (long)iiiIIIliIIIlIIli.IiIlliIliiIl(
                     iiiIIIliIIIlIIli.IliIlllilIi(14592117),
                     iiiIIIliIIIlIIli.IliIlllilIi(15120522),
                     ilIllIiIll(((float)((int)(var19 >>> 32)) + 0.5F) / (float)var10.lIlIlilIil * 2.6F - 1.5F)
                  )
                  ^ var19
            )
            & -1L >>> 32;

         for (var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < var10.IIlIlilIil; var21 += 4294967296L) {
            var10.liiiIIllIl((int)(var21 >>> 32), (int)(var19 >>> 32), (int)var19);
         }

         var19 += 4294967296L;
      }

      iIlIlIliIllIlIli var11 = s.IIiilIiiiIii(var2);
      iIlIlIliIllIlIli var12 = s.IIiilIiiiIii(var6);
      iIlIlIliIllIlIli var13 = s.IIiilIiiiIii(var8);
      iIlIlIliIllIlIli var14 = s.Iilililiiili(13605478);
      iIlIlIliIllIlIli var15 = s.Iilililiiili(14592117);
      iIlIlIliIllIlIli var16 = s.IIiilIiiiIii(var9);
      iIlIlIliIllIlIli var17 = s.IIiilIiiiIii(var7);
      iIlIlIliIllIlIli var18 = s.Iilililiiili(12158290);
      s.IiIlliIliiIl(this.IIiIIiIIIl);
      s.lilIliilIl(
         new float[]{3.35F, 3.55F, 3.8F, 3.98F, 4.08F, 4.1F},
         new float[]{14.599999F, 14.7F, 14.88F, 15.099999F, 15.4F, 15.8F},
         24,
         s.IIiilIiiiIii(var5),
         s.Iliilliiilii(var6, 14275272),
         null
      );
      s.lilIliilIl(new float[]{4.1F, 4.1F}, new float[]{15.8F, 35.2F}, 24, var11, null, null);
      s.lilIliilIl(
         new float[]{4.1F, 4.08F, 3.98F, 3.8F, 3.58F, 3.3999999F},
         new float[]{35.2F, 35.45F, 35.7F, 35.920002F, 36.100002F, 36.2F},
         24,
         s.IIiilIiiiIii(var4),
         null,
         var12
      );
      this.lIlIliIlIl(s);
      s.IiIlliIliiIl(this.IliIIiIIIl);
      IllIllllIl(s, 1.0F, var13);
      s.IiIlliIliiIl(this.lliIIiIIIl);
      illIlIilIl(s, 1.0F, var13);
      s.IiIlliIliiIl(this.iliIIiIIIl);
      lilIliilIl(s, 1.0F, var14, true);
      s.Iilllilliill().Ililllililil(4.65F, 14.2F, -0.9F).Iiilliiliiil(6.0F).IlIillIiilIi(4.0F);
      s.lilIliilIl(
         new float[]{0.6F, 1.02F, 1.08F, 1.0F, 0.62F, 0.42F, 0.38F, 0.56F, 0.58F, 0.4F},
         new float[]{-14.9F, -14.55F, -13.8F, -9.4F, -4.7F, -1.4F, 1.3F, 1.55F, 1.75F, 2.0F},
         12,
         var17,
         var18,
         var18
      );
      s.IIillIiliIil();
      s.IiIlliIliiIl(this.IiiIIiIIIl);
      IllIllllIl(s, -1.0F, var13);
      s.IiIlliIliiIl(this.liiIIiIIIl);
      illIlIilIl(s, -1.0F, var13);
      s.IiIlliIliiIl(this.iiiIIiIIIl);
      lilIliilIl(s, -1.0F, var14, false);
      s.IiIlliIliiIl(this.IIIlIiIIIl);
      IIiIllIiIl(s, 1.0F, var13);
      s.IiIlliIliiIl(this.lIIlIiIIIl);
      iIiIlIliIl(s, 1.0F, var13);
      s.IiIlliIliiIl(this.iIIlIiIIIl);
      lliIliliIl(s, 1.0F, var14, var15, var16);
      s.IiIlliIliiIl(this.IlIlIiIIIl);
      IIiIllIiIl(s, -1.0F, var13);
      s.IiIlliIliiIl(this.llIlIiIIIl);
      iIiIlIliIl(s, -1.0F, var13);
      s.IiIlliIliiIl(this.ilIlIiIIIl);
      lliIliliIl(s, -1.0F, var14, var15, var16);
   }

   @Override
   public String IliIlllilIi() {
      return iIlIlllllill<"iIlIlllllill","Gq867x0XkVj4EOcfVE+2gY8kgS/Uqtu/gRQpTplx0RjIohy2wouA/AtkgD5iQyOV">();
   }

   private static void IIiIllIiIl(IIilllIilIilllIi s, float m, iIlIlIliIllIlIli side) {
      float var3 = m * 1.8F;
      s.ilIllIiIll(new float[]{var3, 15.5F, 0.0F, var3, 11.8F, -0.1F, var3, 8.2F, -0.2F}, new float[]{0.78F, 0.74F, 0.7F}, 8, side, true);
      s.lIIlliIIll(var3, 8.2F, -0.2F, 0.76F, 6, side);
   }

   @Override
   public String liiiIIllIl() {
      return iIlIlllllill<"iIlIlllllill","/riioKbNlR0fm7tcThZuHcEilVKT2arqwet9wXZWHHtou+T2qSBe9tLQVEfKNt9R">();
   }

   private static float ilIllIiIll(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      return t * t * (3.0F - 2.0F * t);
   }
}
