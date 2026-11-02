package gg.corz;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import net.minecraft.class_746;
import org.joml.Matrix4f;

public final class lllIiiillIii {
   private static final float IliilllIllliilllIl = 1.35F;
   private final lllliIIlillliIIl[] IIiiillIllIiiillIl;
   private static final float llIiillIlilIiillIl = 0.045F;
   private double[] lIiIIilIliIiIIilIl;
   private long ilIIIilIlIiIIIilIl;
   private static final double IillillIllillillIl = 1.25;
   private float iIilIilIlIlilIilIl;
   private long IiiiillIlliiiillIl;
   private int iiilIilIlIIIiIilIl;
   private static final double ilIlillIlIiIlillIl = 0.045;
   private static final float lIliillIliIliillIl = 0.04F;
   private static final double liIlillIliiIlillIl = 0.2;
   private long lIIIIilIliIIIIilIl;
   private long liIIIilIliiIIIilIl;
   private float llilIilIlililIilIl;
   private static final float IiIiillIlliIiillIl = 0.42F;
   private static final long iiIIillIlIIlIillIl = 260000000L;
   private static final float IIIIillIllIIIillIl = 9.0F;
   private final double[] iilIIilIlIIiIIilIl;
   private final double[] iIlIIilIlIllIIilIl;
   private static final double IlIlillIlllIlillIl = 192.0;
   private static final float llIIillIlilIIillIl = 1.6F;
   private long[] IiIlIilIlliIlIilIl;
   private boolean iiiiillIlIIIIIilIl;
   private static final long iIiIillIlIliIillIl = 240000000L;
   private static final long illIillIlIilIillIl = 300000000L;
   private static final float iiIiillIlIIliillIl = 0.065F;
   private static final long iiiIillIlIIIlillIl = 200000000L;
   private final IliilIllliilIl[] IlliillIlllliillIl = new IliilIllliilIl[]{new IliilIllliilIl(), new IliilIllliilIl(), new IliilIllliilIl()};
   private static final int lIilillIliIilillIl = 48;
   private static final int IIiIillIllIiIillIl = 4;
   private final double[] iIIlIilIlIlIlIilIl;
   private int[] iliIIilIlIiiIIilIl;
   private static final long lliIillIliliIillIl = 260000000L;
   private final liiIliIliiiIliIl[] liliillIliiliillIl;
   private double IIilIilIllIilIilIl;
   private static final double IIllillIllIllillIl = 1.0;
   private static final float iIIiillIlIlIiillIl = 1.0F;
   private static final float IIIiillIllIIiillIl = 0.82F;
   private static final long IiiIillIlliiIillIl = 110000000L;
   private int IiilIilIlliilIilIl;
   private static final long lIIlillIliIIlillIl = 150000000L;
   private final IiiIIiilliiIIiil iIiiillIlIliiillIl;
   private static final double iillillIlIIilillIl = 1.5;
   private final IilllIililllIi[] illiillIlIiliillIl = new IilllIililllIi[]{
      new IilllIililllIi(), new IilllIililllIi(), new IilllIililllIi(), new IilllIililllIi(), new IilllIililllIi()
   };
   private long IlIIIilIlllIIIilIl;
   private static final long IllIillIllllIillIl = 220000000L;
   private final double[] IilIIilIllilIIilIl;
   private Matrix4f IlllIilIlllllIilIl;
   private static final float liiilllIliiiilllIl = 3.0F;
   private int[] IIIlIilIllIIlIilIl;
   private final int[] llIlIilIlilIlIilIl;
   private static final long IiIIillIlliIIillIl = 1000000L;
   private static final double iIllillIlIlllillIl = 0.9;
   private static final long lilIillIliilIillIl = 230000000L;
   private class_4184 lIllIilIliIllIilIl;
   private static final float IlilillIlllilillIl = 0.32F;
   private double illlIilIlIillIilIl;
   private float lliiillIliliiillIl;
   private static final int llllillIlilllillIl = 7;
   private static final float iliilllIlIiiilllIl = 1.0F;
   private static final float iIIIillIlIlIIillIl = 2.0F;
   private static final float ililillIlIiilillIl = 0.9F;
   private double lillIilIliillIilIl;
   private int[] iiIlIilIlIIllIilIl;
   private static final float liilillIliiilillIl = 0.025F;
   private double[] IliIIilIllliIIilIl;
   private int[] liiIIilIliiiIIilIl;
   private static final long lIlIillIliIlIillIl = 320000000L;
   private final int[] lllIIilIlillIIilIl;
   private boolean IIlIIilIllIlIIilIl;

   private void iiIIlIIlIl(class_4588 w, double cb, double bz, double ca, double vc, double az, double ax, int bx, int ay, float by) {
      if ((bx | ay) >>> 24 != 0) {
         this.iIlIIilIlIllIIilIl[0] = cb;
         this.iIlIIilIlIllIIilIl[1] = bz;
         this.iIlIIilIlIllIIilIl[2] = ca;
         this.iIlIIilIlIllIIilIl[3] = vc;
         this.iIlIIilIlIllIIilIl[4] = az;
         this.iIlIIilIlIllIIilIl[5] = ax;
         this.lllIIilIlillIIilIl[0] = bx;
         this.lllIIilIlillIIilIl[1] = ay;
         IIillllIilll.liiiIIllIl(
            w, this.IlllIilIlllllIilIl, this.lIllIilIliIllIilIl, this.iIlIIilIlIllIIilIl, this.lllIIilIlillIIilIl, 2, by, 1.0F, false, false
         );
      }
   }

   private static <T extends lIiilIliIiilIl> T liIlliiIll(T[] slots) {
      long var6 = 4982802822476082599L;
      long var8 = -3350722155037799494L;
      lIiilIliIiilIl[] var1 = slots;
      var6 ^= ((long)slots.length << 32 ^ var6) & -1L << 32;

      for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < (int)(var6 >>> 32); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         lIiilIliIiilIl var4 = var1[(int)var6];
         if (!var4.lllIIllllillIIllll) {
            return (T)var4;
         }
      }

      lIiilIliIiilIl var10 = slots[0];
      lIiilIliIiilIl[] var2 = slots;
      var6 ^= ((long)slots.length ^ var6) & -1L >>> 32;

      for (long var14 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var14 >>> 32) < (int)var6; var14 += 4294967296L) {
         lIiilIliIiilIl var5 = var2[(int)(var14 >>> 32)];
         if (var5.iilIIllllIIiIIllll != 0L && (var10.iilIIllllIIiIIllll == 0L || var5.iilIIllllIIiIIllll < var10.iilIIllllIIiIIllll)) {
            var10 = var5;
         }
      }

      return (T)var10;
   }

   private int Illillliilli(lllliIIlillliIIl pz, double py, double px, double s) {
      long var20 = -5920614671327570616L;
      double var8 = pz.iiIIiIilIl - py;
      double var10 = pz.IIlIiIilIl - px;
      double var12 = pz.lIlIiIilIl - s;
      double var14 = Math.sqrt(var8 * var8 + var10 * var10 + var12 * var12);
      var20 ^= ((long)Math.max(1, Math.min(400, (int)Math.ceil(var14 / 0.25))) << 32 ^ var20) & -1L << 32;
      this.IiiIlliiIl((int)(var20 >>> 32) + 1);

      for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 <= (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         double var18 = (double)((int)var20) / (double)((int)(var20 >>> 32));
         this.lIiIIilIliIiIIilIl[(int)var20 * 3] = py + var8 * var18;
         this.lIiIIilIliIiIIilIl[(int)var20 * 3 + 1] = px + var10 * var18;
         this.lIiIIilIliIiIIilIl[(int)var20 * 3 + 2] = s + var12 * var18;
         this.IliIIilIllliIIilIl[(int)var20] = var14 * var18;
      }

      return (int)(var20 >>> 32) + 1;
   }

   private void IIlilIliiIli(lllliIIlillliIIl a, float py, long px, double pz, double now, double s) {
      long var26 = 2130761756150497388L;
      double var11 = a.iiIIiIilIl - pz;
      double var13 = a.lIlIiIilIl - s;
      if (!(var11 * var11 + var13 * var13 > 36864.0)) {
         var26 ^= ((long)(a.liiilIilIl ? this.Illillliilli(a, pz, now, s) : this.Iilililiiili(a, pz, now, s)) << 32 ^ var26) & -1L << 32;
         if ((int)(var26 >>> 32) >= 2) {
            double var16 = this.IliIIilIllliIIilIl[(int)(var26 >>> 32) - 1];
            if (var16 > 0.05) {
               float var18 = 0.5F * (3.0F * this.llilIilIlililIilIl + 1.0F);

               for (var26 ^= (0L ^ var26) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
                  double var20 = this.IliIIilIllliIIilIl[(int)var26];
                  double var22 = var16 - var20;
                  float var24 = iIillliIlillli.Ililllililil((float)(var20 / 0.6))
                     * (1.0F - 0.55F * iIillliIlillli.Ililllililil((float)(var20 / var16)))
                     * (0.3F + 0.7F * iIillliIlillli.Ililllililil((float)(var22 / 0.5)));
                  float var25 = py * var24;
                  this.IIIlIilIllIIlIilIl[(int)var26] = iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.92F * var25);
                  this.liiIIilIliiiIIilIl[(int)var26] = iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.11F * var25);
                  this.iliIIilIlIiiIIilIl[(int)var26] = iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.3F * var25);
                  this.lIiIIilIliIiIIilIl[(int)var26 * 3 + 1] = this.lIiIIilIliIiIIilIl[(int)var26 * 3 + 1]
                     + this.IIIIllIIIl(
                        this.lIiIIilIliIiIIilIl[(int)var26 * 3],
                        this.lIiIIilIliIiIIilIl[(int)var26 * 3 + 1],
                        this.lIiIIilIliIiIIilIl[(int)var26 * 3 + 2],
                        var18
                     );
               }

               float var19 = 3.0F * this.llilIilIlililIilIl;
               IIillllIilll.liiiIIllIl(
                  iIiiIIilIliiIIil.IilliliilIIi(),
                  this.IlllIilIlllllIilIl,
                  this.lIllIilIliIllIilIl,
                  this.lIiIIilIliIiIIilIl,
                  this.iliIIilIlIiiIIilIl,
                  (int)(var26 >>> 32),
                  var19,
                  1.0F,
                  false,
                  false
               );
               class_4588 var28 = iIiiIIilIliiIIil.lIiiIiIlilli();
               IIillllIilll.liiiIIllIl(
                  var28,
                  this.IlllIilIlllllIilIl,
                  this.lIllIilIliIllIilIl,
                  this.lIiIIilIliIiIIilIl,
                  this.liiIIilIliiiIIilIl,
                  (int)(var26 >>> 32),
                  9.0F * this.llilIilIlililIilIl,
                  9.0F * this.llilIilIlililIilIl,
                  false,
                  false
               );
               IIillllIilll.liiiIIllIl(
                  var28,
                  this.IlllIilIlllllIilIl,
                  this.lIllIilIliIllIilIl,
                  this.lIiIIilIliIiIIilIl,
                  this.IIIlIilIllIIlIilIl,
                  (int)(var26 >>> 32),
                  var19,
                  1.0F,
                  false,
                  false
               );
               this.IIiilIiiiIii((int)(var26 >>> 32), var16, py, px);
               this.Iiiiliiiiiii(a, py, px);
            }
         }
      }
   }

   private void iIiIlIliIl(class_4588 z, double vc, double c, double x1, double x0, double y0, int y1) {
      float var13 = iIiiIIilIliiIIil.IIIilIIiiIIi(vc);
      float var14 = iIiiIIilIliiIIil.Ililllililil(c);
      float var15 = iIiiIIilIliiIIil.Ililllililil(x0);
      float var16 = iIiiIIilIliiIIil.Iiilliiliiil(x1);
      float var17 = iIiiIIilIliiIIil.Iiilliiliiil(y0);
      iIiiIIilIliiIIil.IlIlllIlilIl(
         z, this.IlllIilIlllllIilIl, var14, var16, var13, y1, var15, var16, var13, y1, var15, var17, var13, y1, var14, var17, var13, y1
      );
   }

   private void iIlIlllllill(boolean on, float tickDelta) {
      long var22 = -2421895670682271648L;
      long var24 = -669975875173714085L;
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && var3.field_1773 != null) {
         long var5 = System.nanoTime();
         float var7 = this.IiiiillIlliiiillIl == 0L ? 0.0F : Math.min(100.0F, (float)(var5 - this.IiiiillIlliiiillIl) / 1000000.0F);
         this.IiiiillIlliiiillIl = var5;
         this.lliiillIliliiillIl = on ? Math.min(1.0F, this.lliiillIliliiillIl + var7 / 260.0F) : Math.max(0.0F, this.lliiillIliliiillIl - var7 / 320.0F);
         if (this.lliiillIliliiillIl <= 0.0F) {
            if (!on) {
               this.IilliliilIIi();
            }
         } else {
            float var8 = iIillliIlillli.Ililllililil(this.lliiillIliliiillIl);
            this.lIllIilIliIllIilIl = var3.field_1773.method_19418();
            if (this.lIllIilIliIllIilIl != null) {
               class_243 var9 = this.lIllIilIliIllIilIl.method_71156();
               this.illlIilIlIillIilIl = var9.field_1352;
               this.lillIilIliillIilIl = var9.field_1351;
               this.IIilIilIllIilIilIl = var9.field_1350;
               this.IlllIilIlllllIilIl = iIiiIIilIliiIIil.IIillIiliIil();
               this.iIilIilIlIlilIilIl = IIillllIilll.IliIlllilIi();
               if (this.iIilIilIlIlilIilIl > 0.001F) {
                  this.llilIilIlililIilIl = Math.max(1.0F, (float)var3.method_22683().method_4506() / 1080.0F);
                  this.IiilIilIlliilIilIl = 0xFF000000 | IlIIilIlllIIilIl.lliiIlliIl;
                  this.iiilIilIlIIIiIilIl = IilIIIIililIIIIi.Illlllllilll(this.IiilIilIlliilIilIl, -1, 0.55);
                  double var10 = class_3532.method_16436((double)tickDelta, var4.field_6014, var4.method_23317());
                  double var12 = class_3532.method_16436((double)tickDelta, var4.field_6036, var4.method_23318());
                  double var14 = class_3532.method_16436((double)tickDelta, var4.field_5969, var4.method_23321());
                  if (on) {
                     this.lIiiIiIlilli(var5, var10, var12, var14);
                  }

                  IliilIllliilIl[] var16 = this.IlliillIlllliillIl;
                  var22 ^= ((long)var16.length << 32 ^ var22) & -1L << 32;

                  for (var22 ^= (0L ^ var22) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
                     IliilIllliilIl var19 = var16[(int)var22];
                     float var20 = var19.IilliliilIIi(var5, 220000000L, 300000000L) * var8;
                     if (var20 > 0.003F) {
                        this.Ililllililil(var19, var20);
                     }
                  }

                  IilllIililllIi[] var26 = this.illiillIlIiliillIl;
                  var22 ^= ((long)var26.length << 32 ^ var22) & -1L << 32;

                  for (var22 ^= (0L ^ var22) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
                     IilllIililllIi var29 = var26[(int)var22];
                     float var30 = var29.IilliliilIIi(var5, 220000000L, 300000000L) * var8;
                     if (var30 > 0.003F) {
                        this.IIIilIIiiIIi(var29, var30, var5);
                     }
                  }

                  float var27 = 0.5F + 0.5F * (float)Math.sin((double)var5 / 1.0E9 * Math.PI * 2.0 / 1.1);
                  liiIliIliiiIliIl[] var17 = this.liliillIliiliillIl;
                  var22 ^= ((long)var17.length ^ var22) & -1L >>> 32;

                  for (var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) < (int)var22; var24 += 4294967296L) {
                     liiIliIliiiIliIl var31 = var17[(int)(var24 >>> 32)];
                     float var21 = var31.IilliliilIIi(var5, 220000000L, 300000000L) * var8;
                     if (var21 > 0.003F) {
                        this.IiIiliIiiiIi(var31, var21, var27);
                     }
                  }

                  lllliIIlillliIIl[] var28 = this.IIiiillIllIiiillIl;
                  var22 ^= ((long)var28.length ^ var22) & -1L >>> 32;

                  for (long var41 = var24 ^ (0L ^ var24) & -1L << 32; (int)(var41 >>> 32) < (int)var22; var41 += 4294967296L) {
                     lllliIIlillliIIl var32 = var28[(int)(var41 >>> 32)];
                     float var33 = var32.IilliliilIIi(var5, 240000000L, 260000000L) * var8;
                     if (var33 > 0.003F) {
                        this.IIlilIliiIli(var32, var33, var5, var10, var12, var14);
                     }
                  }
               }
            }
         }
      }
   }

   private int Iilililiiili(lllliIIlillliIIl pz, double s, double px, double py) {
      long var43 = 4353964992564647585L;
      long var45 = 5530942197474261791L;
      double var8 = pz.IiIIiIilIl[pz.liIIiIilIl - 1];
      double var10 = IIIIiIillIIIiIil.IIlllIlliIll(pz.ilIIiIilIl, pz.IiIIiIilIl, pz.liIIiIilIl, s, px, py);
      double var12 = Math.min(0.9, Math.max(0.0, var8 - var10));
      double var14 = var10 + var12;
      var43 ^= ((long)(IIIIiIillIIIiIil.Illlllllilll(pz.IiIIiIilIl, pz.liIIiIilIl, var14) + 1) << 32 ^ var43) & -1L << 32;
      this.IiiIlliiIl(8 + (pz.liIIiIilIl - (int)(var43 >>> 32)) + 1);
      IIIIiIillIIIiIil.Iilllilliill(pz.ilIIiIilIl, pz.IiIIiIilIl, pz.liIIiIilIl, var14, this.IilIIilIllilIIilIl);
      IIIIiIillIIIiIil.IIillIiliIil(pz.ilIIiIilIl, pz.IiIIiIilIl, pz.liIIiIilIl, var14, this.iilIIilIlIIiIIilIl);
      double var17 = this.IilIIilIllilIIilIl[0];
      double var19 = this.IilIIilIllilIIilIl[1];
      double var21 = this.IilIIilIllilIIilIl[2];
      double var23 = var17 - this.iilIIilIlIIiIIilIl[0] * var12 * 0.55;
      double var25 = var19 - this.iilIIilIlIIiIIilIl[1] * var12 * 0.55;
      double var27 = var21 - this.iilIIilIlIIiIIilIl[2] * var12 * 0.55;
      var43 ^= (0L ^ var43) & -1L >>> 32;
      double var30 = 0.0;

      for (var45 ^= (0L ^ var45) & -1L << 32; (int)(var45 >>> 32) <= 7; var45 += 4294967296L) {
         double var33 = (double)((int)(var45 >>> 32)) / 7.0;
         double var35 = 1.0 - var33;
         double var37 = var35 * var35 * s + 2.0 * var35 * var33 * var23 + var33 * var33 * var17;
         double var39 = var35 * var35 * px + 2.0 * var35 * var33 * var25 + var33 * var33 * var19;
         double var41 = var35 * var35 * py + 2.0 * var35 * var33 * var27 + var33 * var33 * var21;
         if ((int)var43 > 0) {
            var30 += Math.sqrt(
               IIllllIlll(var37 - this.lIiIIilIliIiIIilIl[(int)var43 * 3 - 3])
                  + IIllllIlll(var39 - this.lIiIIilIliIiIIilIl[(int)var43 * 3 - 2])
                  + IIllllIlll(var41 - this.lIiIIilIliIiIIilIl[(int)var43 * 3 - 1])
            );
         }

         this.lIiIIilIliIiIIilIl[(int)var43 * 3] = var37;
         this.lIiIIilIliIiIIilIl[(int)var43 * 3 + 1] = var39;
         this.lIiIIilIliIiIIilIl[(int)var43 * 3 + 2] = var41;
         this.IliIIilIllliIIilIl[(int)var43] = var30;
         var43 ^= (var43 ^ var43 + (long)1) & -1L >>> 32;
      }

      for (long var53 = var45 ^ ((long)((int)(var43 >>> 32)) << 32 ^ var45) & -1L << 32; (int)(var53 >>> 32) < pz.liIIiIilIl; var53 += 4294967296L) {
         if (!(pz.IiIIiIilIl[(int)(var53 >>> 32)] <= var14 + 1.0E-6)) {
            double var47 = pz.ilIIiIilIl[(int)(var53 >>> 32) * 3];
            double var48 = pz.ilIIiIilIl[(int)(var53 >>> 32) * 3 + 1];
            double var49 = pz.ilIIiIilIl[(int)(var53 >>> 32) * 3 + 2];
            var30 += Math.sqrt(
               IIllllIlll(var47 - this.lIiIIilIliIiIIilIl[(int)var43 * 3 - 3])
                  + IIllllIlll(var48 - this.lIiIIilIliIiIIilIl[(int)var43 * 3 - 2])
                  + IIllllIlll(var49 - this.lIiIIilIliIiIIilIl[(int)var43 * 3 - 1])
            );
            this.lIiIIilIliIiIIilIl[(int)var43 * 3] = var47;
            this.lIiIIilIliIiIIilIl[(int)var43 * 3 + 1] = var48;
            this.lIiIIilIliIiIIilIl[(int)var43 * 3 + 2] = var49;
            this.IliIIilIllliIIilIl[(int)var43] = var30;
            var43 ^= (var43 ^ var43 + (long)1) & -1L >>> 32;
         }
      }

      return (int)var43;
   }

   private void lilIliilIl(class_4588 y0, double vc, double z1, double y1, double c, double x, int z0) {
      float var13 = iIiiIIilIliiIIil.Ililllililil(vc);
      float var14 = iIiiIIilIliiIIil.Iiilliiliiil(z1);
      float var15 = iIiiIIilIliiIIil.Iiilliiliiil(c);
      float var16 = iIiiIIilIliiIIil.IIIilIIiiIIi(y1);
      float var17 = iIiiIIilIliiIIil.IIIilIIiiIIi(x);
      iIiiIIilIliiIIil.IlIlllIlilIl(
         y0, this.IlllIilIlllllIilIl, var13, var14, var16, z0, var13, var15, var16, z0, var13, var15, var17, z0, var13, var14, var17, z0
      );
   }

   private void IIiIllIiIl(class_4588 y, double z0, double x1, double z1, double c, double vc, int x0) {
      float var13 = iIiiIIilIliiIIil.Iiilliiliiil(z0);
      float var14 = iIiiIIilIliiIIil.Ililllililil(x1);
      float var15 = iIiiIIilIliiIIil.Ililllililil(c);
      float var16 = iIiiIIilIliiIIil.IIIilIIiiIIi(z1);
      float var17 = iIiiIIilIliiIIil.IIIilIIiiIIi(vc);
      iIiiIIilIliiIIil.IlIlllIlilIl(
         y, this.IlllIilIlllllIilIl, var14, var13, var16, x0, var15, var13, var16, x0, var15, var13, var17, x0, var14, var13, var17, x0
      );
   }

   private void Ililllililil(IliilIllliilIl s, float a) {
      long var34 = 5952596426827307127L;
      long var36 = -9198621904713168741L;
      double var3 = (double)s.lIiIIlllliIiIIllll;
      double var5 = (double)s.IliIIlllllliIIllll;
      double var7 = (double)s.iliIIllllIiiIIllll;
      double var9 = (double)s.liiIIlllliiiIIllll + 1.0;
      double var11 = (double)s.IIIlIlllllIIlIllll + 1.0;
      double var13 = (double)s.iIIlIllllIlIlIllll + 1.0;
      if (!(this.lliIliliIl(var3, var5, var7, var9, var11, var13) > 576.0)) {
         var34 ^= ((long)iIillliIlillli.IIIilIIiiIIi(-5854026, 0.32F * a) << 32 ^ var34) & -1L << 32;
         var34 ^= ((long)iIillliIlillli.IIIilIIiiIIi(-920587, 0.9F * a) ^ var34) & -1L >>> 32;
         float var17 = iIillliIlillli.Ililllililil((float)((this.lliIliliIl(var3, var5, var7, var9, var11, var13) - 0.25) / 2.5));
         if (var17 > 0.01F) {
            this.lIlIliIlIl(var3, var5, var7, var9, var11, var13, iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.025F * a * var17), 0.003);
         }

         class_4588 var18 = iIiiIIilIliiIIil.IilliliilIIi();
         double var19 = Iiilliiliiil(var9 - var3);
         double var21 = Iiilliiliiil(var11 - var5);
         double var23 = Iiilliiliiil(var13 - var7);

         for (long var40 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var40 >>> 32) < 4; var40 += 4294967296L) {
            double var26 = ((int)(var40 >>> 32) & 1) == 0 ? var5 : var11;
            double var28 = ((int)(var40 >>> 32) & 2) == 0 ? var7 : var13;
            this.iIIIlIlIIl(var18, var3, var26, var28, var9, var26, var28, (int)(var34 >>> 32), (int)var34, var19, true, true);
            double var30 = ((int)(var40 >>> 32) & 1) == 0 ? var3 : var9;
            this.iIIIlIlIIl(var18, var30, var5, var28, var30, var11, var28, (int)(var34 >>> 32), (int)var34, var21, true, true);
            double var32 = ((int)(var40 >>> 32) & 2) == 0 ? var5 : var11;
            this.iIIIlIlIIl(var18, var30, var32, var7, var30, var32, var13, (int)(var34 >>> 32), (int)var34, var23, true, true);
         }
      }
   }

   private IliilIllliilIl iiiIlIIIll() {
      long var5 = 1941544478247967724L;
      IliilIllliilIl[] var1 = this.IlliillIlllliillIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         IliilIllliilIl var4 = var1[(int)var8];
         if (var4.iIlIlllllill()) {
            return var4;
         }
      }

      return null;
   }

   private static double Iiilliiliiil(double len) {
      return Math.min(len * 0.42, Math.max(0.45, Math.min(1.6, len * 0.12)));
   }

   private void iliIiiliiiii(long py, double pz, double px, double now) {
      long var17 = -3067775673455021628L;
      long var15 = 2428739203824656601L;
      IiiIIiilliiIIiil var9 = this.iIiiillIlIliiillIl;
      var15 ^= ((long)(var9.IlIilillil && var9.liiilillil != null && var9.iiiilillil && IIIllIIliIIl(var9.liiilillil, pz, px, now) ? 1 : 0) << 32 ^ var15)
         & -1L << 32;
      if ((int)(var15 >>> 32) != 0) {
         if (this.lIIIIilIliIIIIilIl == 0L) {
            this.lIIIIilIliIIIIilIl = py;
         }

         this.IlIIIilIlllIIIilIl = 0L;
      } else {
         if (this.IlIIIilIlllIIIilIl == 0L) {
            this.IlIIIilIlllIIIilIl = py;
         }

         this.lIIIIilIliIIIIilIl = 0L;
      }

      this.IIlIIilIllIlIIilIl = this.IIlIIilIllIlIIilIl
         ? this.IlIIIilIlllIIIilIl == 0L || py - this.IlIIIilIlllIIIilIl <= 200000000L
         : this.lIIIIilIliIIIIilIl != 0L && py - this.lIIIIilIliIIIIilIl > 110000000L;
      lllliIIlillliIIl var11 = this.ilIllIiIll();
      if (!this.IIlIIilIllIlIIilIl) {
         if (var11 != null) {
            var11.liiiIIllIl(py);
         }
      } else if (var9.liiilillil != null) {
         var15 ^= ((long)(var9.Iiiilillil != null && !var9.Iiiilillil.isEmpty() ? 1 : 0) ^ var15) & -1L >>> 32;
         if (var11 != null) {
            var17 ^= (
                  (long)(
                           var11.iIIIiIilIl == var9.liiilillil.method_10263()
                                 && var11.IlIIiIilIl == var9.liiilillil.method_10264()
                                 && var11.llIIiIilIl == var9.liiilillil.method_10260()
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var17
               )
               & -1L << 32;
            if (var11.iiiilIilIl == var9.Iiiilillil && (int)(var17 >>> 32) != 0) {
               return;
            }

            if ((int)(var17 >>> 32) != 0 && (int)var15 == 0) {
               var11.iiiilIilIl = var9.Iiiilillil;
               return;
            }

            if ((int)(var17 >>> 32) != 0 && !var11.liiilIilIl) {
               var17 ^= ((long)this.IlIlllIlilIl(var9.Iiiilillil) ^ var17) & -1L >>> 32;
               if (IIIIiIillIIIiIil.Ililllililil(var11.IIIIiIilIl, var11.lIIIiIilIl, this.IiIlIilIlliIlIilIl, (int)var17)) {
                  var11.iiiilIilIl = var9.Iiiilillil;
                  return;
               }
            }

            var11.liiiIIllIl(py);
         }

         lllliIIlillliIIl var13 = liIlliiIll(this.IIiiillIllIiiillIl);
         this.IiIlliIliiIl(var13, var9, (boolean)((int)var15), pz, px, now);
         var13.IliIlllilIi(py);
      }
   }

   private void Iiiiliiiiiii(lllliIIlillliIIl now, float a, long s) {
      long var33 = 6537574806712834952L;
      long var35 = 897328934811291542L;
      long var37 = 9213762269352477895L;
      long var39 = -2014438672278078668L;
      double var5 = (double)s / 1.0E9;
      double var7 = Math.sin(var5 * Math.PI * 2.0 / 2.6);
      double var9 = 0.31 + 0.03 * var7;
      float var11 = 0.72F + 0.28F * (float)(0.5 + 0.5 * var7);
      double var12 = now.iiIIiIilIl;
      double var14 = now.lIlIiIilIl;
      double var16 = now.IIlIiIilIl;
      if (!iIiiIIilIliiIIil.IlIillIiilIi(var12, var16, var14, 1.0F)) {
         float var18 = 1.6F * this.llilIilIlililIilIl;
         float var19 = 0.5F * (var18 + 1.0F);
         double var20 = var16 + this.IIIIllIIIl(var12, var16, var14, var19);

         for (var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) <= 48; var33 += 4294967296L) {
            double var23 = (Math.PI * 2) * (double)((int)(var33 >>> 32)) / 48.0;
            this.iIIlIilIlIlIlIilIl[(int)(var33 >>> 32) * 3] = var12 + Math.cos(var23) * var9;
            this.iIIlIilIlIlIlIilIl[(int)(var33 >>> 32) * 3 + 1] = var20;
            this.iIIlIilIlIlIlIilIl[(int)(var33 >>> 32) * 3 + 2] = var14 + Math.sin(var23) * var9;
         }

         var33 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.3F * a * var11) << 32 ^ var33) & -1L << 32;

         for (var33 ^= (0L ^ var33) & -1L >>> 32; (int)var33 <= 48; var33 ^= (var33 ^ var33 + (long)1) & -1L >>> 32) {
            this.llIlIilIlilIlIilIl[(int)var33] = (int)(var33 >>> 32);
         }

         IIillllIilll.liiiIIllIl(
            iIiiIIilIliiIIil.IilliliilIIi(),
            this.IlllIilIlllllIilIl,
            this.lIllIilIliIllIilIl,
            this.iIIlIilIlIlIlIilIl,
            this.llIlIilIlilIlIilIl,
            49,
            var18,
            1.0F,
            false,
            false
         );
         var33 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.iiilIilIlIIIiIilIl, 0.95F * a * var11) ^ var33) & -1L >>> 32;

         for (var35 ^= (0L ^ var35) & -1L << 32; (int)(var35 >>> 32) <= 48; var35 += 4294967296L) {
            this.llIlIilIlilIlIilIl[(int)(var35 >>> 32)] = (int)var33;
         }

         class_4588 var24 = iIiiIIilIliiIIil.lIiiIiIlilli();
         IIillllIilll.liiiIIllIl(
            var24, this.IlllIilIlllllIilIl, this.lIllIilIliIllIilIl, this.iIIlIilIlIlIlIilIl, this.llIlIilIlilIlIilIl, 49, var18, 1.0F, false, false
         );
         var35 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.14F * a * var11) ^ var35) & -1L >>> 32;
         var37 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.03F * a) << 32 ^ var37) & -1L << 32;
         float var27 = iIiiIIilIliiIIil.Ililllililil(var12);
         float var28 = iIiiIIilIliiIIil.Iiilliiliiil(var20 - 0.004);
         float var29 = iIiiIIilIliiIIil.IIIilIIiiIIi(var14);

         for (long var48 = var37 ^ (0L ^ var37) & -1L >>> 32; (int)var48 < 48; var48 ^= (var48 ^ var48 + (long)1) & -1L >>> 32) {
            long var49 = var39 ^ ((long)((int)var48 * 3) << 32 ^ var39) & -1L << 32;
            var39 = var49 ^ ((long)(((int)var48 + 1) * 3) ^ var49) & -1L >>> 32;
            iIiiIIilIliiIIil.IlIlllIlilIl(
               var24,
               this.IlllIilIlllllIilIl,
               var27,
               var28,
               var29,
               (int)(var48 >>> 32),
               iIiiIIilIliiIIil.Ililllililil(this.iIIlIilIlIlIlIilIl[(int)(var39 >>> 32)]),
               var28,
               iIiiIIilIliiIIil.IIIilIIiiIIi(this.iIIlIilIlIlIlIilIl[(int)(var39 >>> 32) + 2]),
               (int)var35,
               iIiiIIilIliiIIil.Ililllililil(this.iIIlIilIlIlIlIilIl[(int)var39]),
               var28,
               iIiiIIilIliiIIil.IIIilIIiiIIi(this.iIIlIilIlIlIlIilIl[(int)var39 + 2]),
               (int)var35,
               var27,
               var28,
               var29,
               (int)(var48 >>> 32)
            );
         }
      }
   }

   private static boolean Iilllilliill(IilllIililllIi f, IiiIIiilliiIIiil s) {
      long var8 = -3822539631197315038L;
      long var10 = 4922286201249170143L;
      long var12 = 1199190502717412006L;
      var8 ^= ((long)Math.min(s.Illilillil, s.Iililillil) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)Math.min(s.lllilillil, s.lililillil) ^ var8) & -1L >>> 32;
      var10 ^= ((long)Math.min(s.illilillil, s.iililillil) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)Math.max(s.Illilillil, s.Iililillil) ^ var10) & -1L >>> 32;
      var12 ^= ((long)Math.max(s.lllilillil, s.lililillil) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)Math.max(s.illilillil, s.iililillil) ^ var12) & -1L >>> 32;
      return (int)var10 - (int)(var8 >>> 32) == f.illiilIiiIiliilIii - f.iiIiilIiiIIliilIii
            && (int)(var12 >>> 32) - (int)var8 == f.liliilIiiiiliilIii - f.lIliilIiiiIliilIii
            && (int)var12 - (int)(var10 >>> 32) == f.IIiiilIiilIiiilIii - f.IlliilIiillliilIii
         ? Math.abs((int)(var8 >>> 32) - f.iiIiilIiiIIliilIii) <= 4
            && Math.abs((int)var8 - f.lIliilIiiiIliilIii) <= 4
            && Math.abs((int)(var10 >>> 32) - f.IlliilIiillliilIii) <= 4
         : false;
   }

   private static int IiIIlliIIl(int f, float c) {
      long var3 = -1696685852073400750L;
      var3 ^= ((long)Math.round((float)(f >>> 24) * Math.max(0.0F, Math.min(1.0F, c))) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | f & 16777215;
   }

   private void IilliliilIIi() {
      long var5 = -8249266292979796056L;
      IliilIllliilIl[] var1 = this.IlliillIlllliillIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < (int)(var5 >>> 32); var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         IliilIllliilIl var4 = var1[(int)var5];
         var4.lllIIllllillIIllll = false;
      }

      IilllIililllIi[] var7 = this.illiillIlIiliillIl;
      var5 ^= ((long)var7.length << 32 ^ var5) & -1L << 32;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < (int)(var5 >>> 32); var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         IilllIililllIi var10 = var7[(int)var5];
         var10.lllIIllllillIIllll = false;
      }

      liiIliIliiiIliIl[] var8 = this.liliillIliiliillIl;
      var5 ^= ((long)var8.length << 32 ^ var5) & -1L << 32;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < (int)(var5 >>> 32); var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         liiIliIliiiIliIl var11 = var8[(int)var5];
         var11.lllIIllllillIIllll = false;
      }

      lllliIIlillliIIl[] var9 = this.IIiiillIllIiiillIl;
      var5 ^= ((long)var9.length << 32 ^ var5) & -1L << 32;

      for (long var20 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         lllliIIlillliIIl var12 = var9[(int)var20];
         var12.lllIIllllillIIllll = false;
      }

      this.IIlIIilIllIlIIilIl = false;
      this.lIIIIilIliIIIIilIl = this.IlIIIilIlllIIIilIl = this.ilIIIilIlIiIIIilIl = this.liIIIilIliiIIIilIl = 0L;
   }

   private double IIIIllIIIl(double x, double z, double y, float halfPx) {
      double var8 = Math.sqrt(IIllllIlll(x - this.illlIilIlIillIilIl) + IIllllIlll(z - this.lillIilIliillIilIl) + IIllllIlll(y - this.IIilIilIllIilIilIl));
      return 0.045 + (double)halfPx * var8 / (double)this.iIilIilIlIlilIilIl;
   }

   private void IIIilIIiiIIi(IilllIililllIi a, float now, long s) {
      long var51 = -3702148640887809229L;
      long var53 = -7039175333272384503L;
      long var55 = 5031421548840478504L;
      long var57 = -473272549473025305L;
      float var5 = a.lIiiIiIlilli(s);
      double var6 = a.iIiiilIiiIliiilIii * (double)var5;
      double var8 = a.lliiilIiiiliiilIii * (double)var5;
      double var10 = a.IiiiilIiiliiiilIii * (double)var5;
      double var12 = (double)a.iiIiilIiiIIliilIii + var6;
      double var14 = (double)a.lIliilIiiiIliilIii + var8;
      double var16 = (double)a.IlliilIiillliilIii + var10;
      double var18 = (double)a.illiilIiiIiliilIii + 1.0 + var6;
      double var20 = (double)a.liliilIiiiiliilIii + 1.0 + var8;
      double var22 = (double)a.IIiiilIiilIiiilIii + 1.0 + var10;
      double var24 = this.lliIliliIl(var12, var14, var16, var18, var20, var22);
      if (!(var24 > 192.0)) {
         float var26 = iIillliIlillli.Ililllililil((float)((var24 - 0.15) / 1.2));
         if (var26 > 0.01F) {
            var51 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.045F * now * var26) << 32 ^ var51) & -1L << 32;

            for (long var68 = var51 ^ (0L ^ var51) & -1L >>> 32; (int)var68 + 3 < a.ilIIIiIiiIiIIIiIii.length; var68 ^= (var68 ^ var68 + (long)4) & -1L >>> 32) {
               this.illIlIilIl(
                  (double)a.ilIIIiIiiIiIIIiIii[(int)var68] + var6,
                  (double)a.ilIIIiIiiIiIIIiIii[(int)var68 + 1] + var8,
                  (double)a.ilIIIiIiiIiIIIiIii[(int)var68 + 2] + var10,
                  a.ilIIIiIiiIiIIIiIii[(int)var68 + 3],
                  (int)(var68 >>> 32),
                  0.004
               );
            }
         }

         class_4588 var27 = iIiiIIilIliiIIil.IilliliilIIi();
         float var28 = 0.3F + 0.7F * iIillliIlillli.Ililllililil((float)((var24 - 0.25) / 1.75));
         var53 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.82F * now * var28) << 32 ^ var53) & -1L << 32;
         var53 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.iiilIilIlIIIiIilIl, 1.0F * now * var28) ^ var53) & -1L >>> 32;
         int[] var31 = a.lIIIIiIiiiIIIIiIii;
         var55 ^= (0L ^ var55) & -1L << 32;

         while ((int)(var55 >>> 32) + 6 < var31.length) {
            var55 ^= ((long)var31[(int)(var55 >>> 32)] ^ var55) & -1L >>> 32;
            var57 ^= ((long)var31[(int)(var55 >>> 32) + 4] << 32 ^ var57) & -1L << 32;
            double var35 = (double)var31[(int)(var55 >>> 32) + 1] + var6;
            double var37 = (double)var31[(int)(var55 >>> 32) + 2] + var8;
            double var39 = (double)var31[(int)(var55 >>> 32) + 3] + var10;
            double var41 = var35 + (double)((int)var55 == 0 ? (int)(var57 >>> 32) : 0);
            double var43 = var37 + (double)((int)var55 == 1 ? (int)(var57 >>> 32) : 0);
            double var45 = var39 + (double)((int)var55 == 2 ? (int)(var57 >>> 32) : 0);
            this.iIIIlIlIIl(
               var27,
               var35,
               var37,
               var39,
               var41,
               var43,
               var45,
               (int)(var53 >>> 32),
               (int)var53,
               0.24,
               var31[(int)(var55 >>> 32) + 5] != 0,
               var31[(int)(var55 >>> 32) + 6] != 0
            );
            var55 += 30064771072L;
         }

         if (a.liIIIiIiiiiIIIiIii >= 0) {
            int[] var32 = a.IlIIIiIiillIIIiIii;

            for (long var73 = var55 ^ (0L ^ var55) & -1L >>> 32; (int)var73 + 6 < var32.length; var73 ^= (var73 ^ var73 + (long)7) & -1L >>> 32) {
               long var74 = var57 ^ ((long)var32[(int)var73] << 32 ^ var57) & -1L << 32;
               var57 = var74 ^ ((long)var32[(int)var73 + 4] ^ var74) & -1L >>> 32;
               double var36 = (double)var32[(int)var73 + 1];
               double var38 = (double)var32[(int)var73 + 2];
               double var40 = (double)var32[(int)var73 + 3];
               double var42 = var36 + (double)((int)(var57 >>> 32) == 0 ? (int)var57 : 0);
               double var44 = var38 + (double)((int)(var57 >>> 32) == 1 ? (int)var57 : 0);
               double var46 = var40 + (double)((int)(var57 >>> 32) == 2 ? (int)var57 : 0);
               float var48 = IlIillIiilIi(a, var36, var38, var40);
               float var49 = IlIillIiilIi(a, var42, var44, var46);
               var36 += var6;
               var38 += var8;
               var40 += var10;
               var42 += var6;
               var44 += var8;
               var46 += var10;
               float var50 = this.llIIlilIIl(var36, var38, var40, var42, var44, var46);
               var48 *= var50;
               var49 *= var50;
               if (!(var48 < 0.004F) || !(var49 < 0.004F)) {
                  this.iiIIlIIlIl(
                     var27,
                     var36,
                     var38,
                     var40,
                     var42,
                     var44,
                     var46,
                     iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.42F * now * var48),
                     iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, 0.42F * now * var49),
                     1.35F * this.llilIilIlililIilIl
                  );
               }
            }
         }
      }
   }

   public lllIiiillIii() {
      this.liliillIliiliillIl = new liiIliIliiiIliIl[]{new liiIliIliiiIliIl(), new liiIliIliiiIliIl(), new liiIliIliiiIliIl(), new liiIliIliiiIliIl()};
      this.IIiiillIllIiiillIl = new lllliIIlillliIIl[]{new lllliIIlillliIIl(), new lllliIIlillliIIl(), new lllliIIlillliIIl()};
      this.iIiiillIlIliiillIl = new IiiIIiilliiIIiil();
      this.iIlIIilIlIllIIilIl = new double[9];
      this.lllIIilIlillIIilIl = new int[3];
      this.IilIIilIllilIIilIl = new double[3];
      this.iilIIilIlIIiIIilIl = new double[3];
      this.lIiIIilIliIiIIilIl = new double[768];
      this.IliIIilIllliIIilIl = new double[256];
      this.iliIIilIlIiiIIilIl = new int[256];
      this.liiIIilIliiiIIilIl = new int[256];
      this.IIIlIilIllIIlIilIl = new int[256];
      this.iIIlIilIlIlIlIilIl = new double[147];
      this.llIlIilIlilIlIilIl = new int[49];
      this.IiIlIilIlliIlIilIl = new long[64];
      this.iiIlIilIlIIllIilIl = new int[192];
   }

   private float llIIlilIIl(double ax, double bz, double az, double by, double ay, double bx) {
      double var13 = by - ax;
      double var15 = ay - bz;
      double var17 = bx - az;
      double var19 = var13 * var13 + var15 * var15 + var17 * var17;
      double var21 = var19 < 1.0E-12
         ? 0.0
         : ((this.illlIilIlIillIilIl - ax) * var13 + (this.lillIilIliillIilIl - bz) * var15 + (this.IIilIilIllIilIilIl - az) * var17) / var19;
      var21 = Math.max(0.0, Math.min(1.0, var21));
      double var23 = Math.sqrt(
         IIllllIlll(ax + var13 * var21 - this.illlIilIlIillIilIl)
            + IIllllIlll(bz + var15 * var21 - this.lillIilIliillIilIl)
            + IIllllIlll(az + var17 * var21 - this.IIilIilIllIilIilIl)
      );
      return iIillliIlillli.Ililllililil((float)((var23 - 0.2) / 1.0));
   }

   private static long IIlllIlliIll(IiiIIiilliiIIiil f) {
      long var1 = 1469598103934665603L;
      var1 = Illlllllilll(var1, f.Illilillil);
      var1 = Illlllllilll(var1, f.lllilillil);
      var1 = Illlllllilll(var1, f.illilillil);
      var1 = Illlllllilll(var1, f.Iililillil);
      var1 = Illlllllilll(var1, f.lililillil);
      var1 = Illlllllilll(var1, f.iililillil);
      var1 = Illlllllilll(var1, f.IIiilillil);
      var1 = Illlllllilll(var1, f.lIiilillil);
      var1 = Illlllllilll(var1, f.iIiilillil);
      var1 = Illlllllilll(var1, f.Iliilillil);
      var1 = Illlllllilll(var1, f.lliilillil);
      return var1 == 0L ? 1L : var1;
   }

   private lllliIIlillliIIl ilIllIiIll() {
      long var5 = 152155064708619118L;
      lllliIIlillliIIl[] var1 = this.IIiiillIllIiiillIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lllliIIlillliIIl var4 = var1[(int)var8];
         if (var4.iIlIlllllill()) {
            return var4;
         }
      }

      return null;
   }

   private IilllIililllIi lIIlliIIll() {
      long var5 = -4275898537376571898L;
      IilllIililllIi[] var1 = this.illiillIlIiliillIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         IilllIililllIi var4 = var1[(int)var8];
         if (var4.iIlIlllllill()) {
            return var4;
         }
      }

      return null;
   }

   private void illIlIilIl(double dir, double z, double col, int out, int x, double y) {
      if (x >>> 24 != 0) {
         double var17 = dir + 1.0;
         double var19 = z + 1.0;
         double var21 = col + 1.0;
         class_4588 var23 = iIiiIIilIliiIIil.IilliliilIIi();
         switch (out) {
            case 0:
               this.lilIliilIl(var23, dir - y, z, col, var19, var21, x);
               break;
            case 1:
               this.lilIliilIl(var23, var17 + y, z, col, var19, var21, x);
               break;
            case 2:
               this.IIiIllIiIl(var23, z - y, dir, col, var17, var21, x);
               break;
            case 3:
               this.IIiIllIiIl(var23, var19 + y, dir, col, var17, var21, x);
               break;
            case 4:
               this.iIiIlIliIl(var23, col - y, dir, z, var17, var19, x);
               break;
            default:
               this.iIiIlIliIl(var23, var21 + y, dir, z, var17, var19, x);
         }
      }
   }

   private double lliIliliIl(double x0, double y0, double y1, double x1, double z1, double z0) {
      double var13 = Math.max(0.0, Math.max(x0 - this.illlIilIlIillIilIl, this.illlIilIlIillIilIl - x1));
      double var15 = Math.max(0.0, Math.max(y0 - this.lillIilIliillIilIl, this.lillIilIliillIilIl - z1));
      double var17 = Math.max(0.0, Math.max(y1 - this.IIilIilIllIilIilIl, this.IIilIilIllIilIilIl - z0));
      return Math.sqrt(var13 * var13 + var15 * var15 + var17 * var17);
   }

   private void lIlIliIlIl(double x1, double z1, double y1, double col, double z0, double x0, int y0, double out) {
      this.IllIllllIl(iIiiIIilIliiIIil.IilliliilIIi(), x1, z1, y1, col, z0, x0, y0, out);
   }

   private int Iliilliiilii(int n, double d) {
      long var7 = -3454273523410399733L;
      long var9 = 4896514589963902541L;
      var7 ^= (0L ^ var7) & -1L << 32;
      var7 ^= ((long)(n - 1) ^ var7) & -1L >>> 32;

      while ((int)var7 - (int)(var7 >>> 32) > 1) {
         var9 ^= ((long)((int)(var7 >>> 32) + (int)var7 >>> 1) << 32 ^ var9) & -1L << 32;
         if (this.IliIIilIllliIIilIl[(int)(var9 >>> 32)] <= d) {
            var7 ^= ((long)((int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
         } else {
            var7 ^= ((long)((int)(var9 >>> 32)) ^ var7) & -1L >>> 32;
         }
      }

      return Math.min((int)(var7 >>> 32), n - 2);
   }

   private void iIIIlIlIIl(
      class_4588 ax, double vc, double ay, double c1, double by, double bx, double col, int tick, int az, double c0, boolean tickCol, boolean bz
   ) {
      double var20 = by - vc;
      double var22 = bx - ay;
      double var24 = col - c1;
      double var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24);
      if (!(var26 < 1.0E-6)) {
         float var28 = this.llIIlilIIl(vc, ay, c1, by, bx, col);
         if (!(var28 < 0.004F)) {
            tick = IiIIlliIIl(tick, var28);
            az = IiIIlliIIl(az, var28);
            double var29 = var20 / var26;
            double var31 = var22 / var26;
            double var33 = var24 / var26;
            double var35 = tickCol ? Math.min(c0, var26 * 0.42) : 0.0;
            double var37 = bz ? Math.min(c0, var26 * 0.42) : 0.0;
            float var39 = 1.35F * this.llilIilIlililIilIl;
            if (var35 > 0.0) {
               this.iiIIlIIlIl(ax, vc, ay, c1, vc + var29 * var35, ay + var31 * var35, c1 + var33 * var35, az, az, var39);
            }

            if (var26 - var35 - var37 > 1.0E-4) {
               this.iiIIlIIlIl(
                  ax,
                  vc + var29 * var35,
                  ay + var31 * var35,
                  c1 + var33 * var35,
                  by - var29 * var37,
                  bx - var31 * var37,
                  col - var33 * var37,
                  tick,
                  tick,
                  var39
               );
            }

            if (var37 > 0.0) {
               this.iiIIlIIlIl(ax, by - var29 * var37, bx - var31 * var37, col - var33 * var37, by, bx, col, az, az, var39);
            }
         }
      }
   }

   private static long Illlllllilll(long v, int h) {
      return (v ^ (long)h & 4294967295L) * 1099511628211L;
   }

   public IiiIIiilliiIIiil IliIlllilIi() {
      return this.iIiiillIlIliiillIl;
   }

   private liiIliIliiiIliIl IlIllllIll() {
      long var5 = -8330496973714623774L;
      liiIliIliiiIliIl[] var1 = this.liliillIliiliillIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         liiIliIliiiIliIl var4 = var1[(int)var8];
         if (var4.iIlIlllllill()) {
            return var4;
         }
      }

      return null;
   }

   private void IiIiliIiiiIi(liiIliIliiiIliIl pulse, float s, float a) {
      long var11 = -4339062485935776131L;
      double var4 = (double)pulse.iiilliiIll;
      double var6 = (double)pulse.IIIiliiIll;
      double var8 = (double)pulse.lIIiliiIll;
      if (!(this.lliIliliIl(var4, var6, var8, var4 + 1.0, var6 + 1.0, var8 + 1.0) > 192.0)) {
         var11 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.IiilIilIlliilIilIl, (0.065F + 0.04F * a) * s) << 32 ^ var11) & -1L << 32;
         this.IllIllllIl(iIiiIIilIliiIIil.lIiiIiIlilli(), var4, var6, var8, var4 + 1.0, var6 + 1.0, var8 + 1.0, (int)(var11 >>> 32), 0.006);
      }
   }

   private static boolean IIIllIIliIIl(class_2338 px, double py, double goal, double pz) {
      double var7 = (double)px.method_10263() + 0.5 - py;
      double var9 = (double)px.method_10260() + 0.5 - pz;
      return var7 * var7 + var9 * var9 > 0.5625 || Math.abs((double)px.method_10264() - goal) >= 0.9;
   }

   private void IiIlliIliiIl(lllliIIlillliIIl py, IiiIIiilliiIIiil routed, boolean pz, double f, double s, double px) {
      long var16 = 215647277604310908L;
      long var14 = 5800592038670563887L;
      py.iiiilIilIl = routed.Iiiilillil;
      py.iIIIiIilIl = routed.liiilillil.method_10263();
      py.IlIIiIilIl = routed.liiilillil.method_10264();
      py.llIIiIilIl = routed.liiilillil.method_10260();
      py.liiilIilIl = !pz;
      py.lIIIiIilIl = 0;
      if (!pz) {
         py.liIIiIilIl = 0;
         py.iiIIiIilIl = (double)py.iIIIiIilIl + 0.5;
         py.IIlIiIilIl = (double)py.IlIIiIilIl;
         py.lIlIiIilIl = (double)py.llIIiIilIl + 0.5;
      } else {
         var14 ^= ((long)this.IlIlllIlilIl(routed.Iiiilillil) << 32 ^ var14) & -1L << 32;
         if (py.IIIIiIilIl.length < (int)(var14 >>> 32)) {
            py.IIIIiIilIl = new long[Math.max((int)(var14 >>> 32), 16)];
         }

         System.arraycopy(this.IiIlIilIlliIlIilIl, 0, py.IIIIiIilIl, 0, (int)(var14 >>> 32));
         py.lIIIiIilIl = (int)(var14 >>> 32);
         if (this.iiIlIilIlIIllIilIl.length < (int)(var14 >>> 32) * 3) {
            this.iiIlIilIlIIllIilIl = new int[(int)(var14 >>> 32) * 3];
         }

         for (var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            class_2338 var12 = routed.Iiiilillil.get((int)var14);
            this.iiIlIilIlIIllIilIl[(int)var14 * 3] = var12.method_10263();
            this.iiIlIilIlIIllIilIl[(int)var14 * 3 + 1] = var12.method_10264();
            this.iiIlIilIlIIllIilIl[(int)var14 * 3 + 2] = var12.method_10260();
         }

         double[] var11 = IIIIiIillIIIiIil.iIlIlllllill(f, s, px, IIIIiIillIIIiIil.IliIlllilIi(this.iiIlIilIlIIllIilIl, (int)(var14 >>> 32)));
         double[] var18 = IIIIiIillIIIiIil.IilliliilIIi(var11);
         var16 ^= ((long)IIIIiIillIIIiIil.IiIlliIliiIl(var18, 0.2) << 32 ^ var16) & -1L << 32;
         py.ilIIiIilIl = new double[(int)(var16 >>> 32) * 3];
         py.IiIIiIilIl = new double[(int)(var16 >>> 32)];
         py.liIIiIilIl = IIIIiIillIIIiIil.IlIlllIlilIl(var18, 0.2, py.ilIIiIilIl, py.IiIIiIilIl);
         if (py.liIIiIilIl == 0) {
            py.liiilIilIl = true;
            py.iiIIiIilIl = (double)py.iIIIiIilIl + 0.5;
            py.IIlIiIilIl = (double)py.IlIIiIilIl;
            py.lIlIiIilIl = (double)py.llIIiIilIl + 0.5;
         } else {
            py.iiIIiIilIl = py.ilIIiIilIl[(py.liIIiIilIl - 1) * 3];
            py.IIlIiIilIl = py.ilIIiIilIl[(py.liIIiIilIl - 1) * 3 + 1];
            py.lIlIiIilIl = py.ilIIiIilIl[(py.liIIiIilIl - 1) * 3 + 2];
         }
      }
   }

   private void IllIllllIl(class_4588 y1, double x1, double x0, double z1, double vc, double y0, double col, int out, double z0) {
      if (out >>> 24 != 0) {
         float var17 = iIiiIIilIliiIIil.Ililllililil(x1 - z0);
         float var18 = iIiiIIilIliiIIil.Iiilliiliiil(x0 - z0);
         float var19 = iIiiIIilIliiIIil.IIIilIIiiIIi(z1 - z0);
         float var20 = iIiiIIilIliiIIil.Ililllililil(vc + z0);
         float var21 = iIiiIIilIliiIIil.Iiilliiliiil(y0 + z0);
         float var22 = iIiiIIilIliiIIil.IIIilIIiiIIi(col + z0);
         iIiiIIilIliiIIil.IlIlllIlilIl(
            y1, this.IlllIilIlllllIilIl, var17, var18, var19, out, var20, var18, var19, out, var20, var18, var22, out, var17, var18, var22, out
         );
         iIiiIIilIliiIIil.IlIlllIlilIl(
            y1, this.IlllIilIlllllIilIl, var17, var21, var19, out, var17, var21, var22, out, var20, var21, var22, out, var20, var21, var19, out
         );
         iIiiIIilIliiIIil.IlIlllIlilIl(
            y1, this.IlllIilIlllllIilIl, var17, var18, var19, out, var17, var21, var19, out, var20, var21, var19, out, var20, var18, var19, out
         );
         iIiiIIilIliiIIil.IlIlllIlilIl(
            y1, this.IlllIilIlllllIilIl, var17, var18, var22, out, var20, var18, var22, out, var20, var21, var22, out, var17, var21, var22, out
         );
         iIiiIIilIliiIIil.IlIlllIlilIl(
            y1, this.IlllIilIlllllIilIl, var17, var18, var19, out, var17, var18, var22, out, var17, var21, var22, out, var17, var21, var19, out
         );
         iIiiIIilIliiIIil.IlIlllIlilIl(
            y1, this.IlllIilIlllllIilIl, var20, var18, var19, out, var20, var21, var19, out, var20, var21, var22, out, var20, var18, var22, out
         );
      }
   }

   private void IiiIlliiIl(int n) {
      long var3 = -7546934371981480562L;
      if (this.IliIIilIllliIIilIl.length < n) {
         var3 ^= ((long)Math.max(n, this.IliIIilIllliIIilIl.length * 2) << 32 ^ var3) & -1L << 32;
         this.lIiIIilIliIiIIilIl = new double[(int)(var3 >>> 32) * 3];
         this.IliIIilIllliIIilIl = new double[(int)(var3 >>> 32)];
         this.iliIIilIlIiiIIilIl = new int[(int)(var3 >>> 32)];
         this.liiIIilIliiiIIilIl = new int[(int)(var3 >>> 32)];
         this.IIIlIilIllIIlIilIl = new int[(int)(var3 >>> 32)];
      }
   }

   private void lIiiIiIlilli(long px, double py, double now, double pz) {
      long var23 = -1380038752478275926L;
      IiiIIiilliiIIiil var9 = this.iIiiillIlIliiillIl;
      IliilIllliilIl var10 = this.iiiIlIIIll();
      var23 ^= ((long)(var9.llIilillil && var9.iIIilillil ? 1 : 0) << 32 ^ var23) & -1L << 32;
      if (var10 != null
         && (
            (int)(var23 >>> 32) == 0
               || var10.lIiIIlllliIiIIllll != var9.ilIilillil
               || var10.IliIIlllllliIIllll != var9.IiIilillil
               || var10.iliIIllllIiiIIllll != var9.liIilillil
               || var10.liiIIlllliiiIIllll != var9.iiIilillil
               || var10.IIIlIlllllIIlIllll != var9.IIlilillil
               || var10.iIIlIllllIlIlIllll != var9.lIlilillil
         )) {
         var10.liiiIIllIl(px);
         var10 = null;
      }

      if ((int)(var23 >>> 32) != 0 && var10 == null) {
         IliilIllliilIl var12 = liIlliiIll(this.IlliillIlllliillIl);
         var12.lIiIIlllliIiIIllll = var9.ilIilillil;
         var12.IliIIlllllliIIllll = var9.IiIilillil;
         var12.iliIIllllIiiIIllll = var9.liIilillil;
         var12.liiIIlllliiiIIllll = var9.iiIilillil;
         var12.IIIlIlllllIIlIllll = var9.IIlilillil;
         var12.iIIlIllllIlIlIllll = var9.lIlilillil;
         var12.IliIlllilIi(px);
      }

      IilllIililllIi var25 = this.lIIlliIIll();
      var23 ^= ((long)(var9.iIlilillil && var9.iIIilillil ? 1 : 0) ^ var23) & -1L >>> 32;
      long var14 = (int)var23 != 0 ? IIlllIlliIll(var9) : 0L;
      if (var25 != null && (int)var23 != 0 && var25.IiIiilIiiliIiilIii != var14) {
         if (Iilllilliill(var25, var9)) {
            float var16 = var25.lIiiIiIlilli(px);
            double var17 = (double)var25.iiIiilIiiIIliilIii + var25.iIiiilIiiIliiilIii * (double)var16;
            double var19 = (double)var25.lIliilIiiiIliilIii + var25.lliiilIiiiliiilIii * (double)var16;
            double var21 = (double)var25.IlliilIiillliilIii + var25.IiiiilIiiliiiilIii * (double)var16;
            this.IIillIiliIil(var25, var9, var14);
            var25.iIiiilIiiIliiilIii = var17 - (double)var25.iiIiilIiiIIliilIii;
            var25.lliiilIiiiliiilIii = var19 - (double)var25.lIliilIiiiIliilIii;
            var25.IiiiilIiiliiiilIii = var21 - (double)var25.IlliilIiillliilIii;
            var25.iiiiilIiiIIIIIiIii = px;
         } else {
            var25.liiiIIllIl(px);
            var25 = null;
         }
      }

      if (var25 != null && (int)var23 == 0 && var9.iIIilillil) {
         if (this.ilIIIilIlIiIIIilIl == 0L) {
            this.ilIIIilIlIiIIIilIl = px;
         }

         if (px - this.ilIIIilIlIiIIIilIl > 150000000L) {
            var25.liiiIIllIl(px);
            var25 = null;
         }
      } else if (var25 != null && (int)var23 == 0) {
         var25.liiiIIllIl(px);
         var25 = null;
      }

      if ((int)var23 != 0) {
         this.ilIIIilIlIiIIIilIl = 0L;
      }

      if ((int)var23 != 0 && var25 == null) {
         IilllIililllIi var26 = liIlliiIll(this.illiillIlIiliillIl);
         this.IIillIiliIil(var26, var9, var14);
         var26.IliIlllilIi(px);
      }

      liiIliIliiiIliIl var27 = this.IlIllllIll();
      class_2338 var28 = var9.iIIilillil ? var9.iliilillil : null;
      if (var27 != null
         && var28 != null
         && (var27.iiilliiIll != var28.method_10263() || var27.IIIiliiIll != var28.method_10264() || var27.lIIiliiIll != var28.method_10260())) {
         var27.liiiIIllIl(px);
         var27 = null;
      }

      if (var27 != null && var28 == null) {
         if (this.liIIIilIliiIIIilIl == 0L) {
            this.liIIIilIliiIIIilIl = px;
         }

         if (px - this.liIIIilIliiIIIilIl > 150000000L || !var9.iIIilillil) {
            var27.liiiIIllIl(px);
            var27 = null;
         }
      }

      if (var28 != null) {
         this.liIIIilIliiIIIilIl = 0L;
      }

      if (var28 != null && var27 == null) {
         liiIliIliiiIliIl var18 = liIlliiIll(this.liliillIliiliillIl);
         var18.iiilliiIll = var28.method_10263();
         var18.IIIiliiIll = var28.method_10264();
         var18.lIIiliiIll = var28.method_10260();
         var18.IliIlllilIi(px);
      }

      this.iliIiiliiiii(px, py, now, pz);
   }

   private static double IIllllIlll(double v) {
      return v * v;
   }

   public void liiiIIllIl(boolean tickDelta, float on) {
      if (!this.iiiiillIlIIIIIilIl) {
         try {
            this.iIlIlllllill(tickDelta, on);
         } catch (Throwable var4) {
            this.iiiiillIlIIIIIilIl = true;
         }
      }
   }

   private int IlIlllIlilIl(List<class_2338> route) {
      long var5 = -3232114227901761408L;
      var5 ^= ((long)(route == null ? 0 : route.size()) << 32 ^ var5) & -1L << 32;
      if (this.IiIlIilIlliIlIilIl.length < (int)(var5 >>> 32)) {
         this.IiIlIilIlliIlIilIl = new long[Math.max((int)(var5 >>> 32), this.IiIlIilIlliIlIilIl.length * 2)];
      }

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < (int)(var5 >>> 32); var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         class_2338 var4 = (class_2338)route.get((int)var5);
         this.IiIlIilIlliIlIilIl[(int)var5] = lllIiIIiillIiIIi.IliIlllilIi(var4.method_10263(), var4.method_10264(), var4.method_10260());
      }

      return (int)(var5 >>> 32);
   }

   private void IIillIiliIil(IilllIililllIi f, IiiIIiilliiIIiil s, long sig) {
      long var32 = 8073559464230393037L;
      long var34 = 6267897208753486021L;
      long var22 = 5589592778488812571L;
      long var24 = -3508429704154223887L;
      long var26 = 814833241466354112L;
      long var28 = 4266421350004799076L;
      long var30 = -6556921990259490369L;
      f.IiIiilIiiliIiilIii = sig;
      f.iIiiilIiiIliiilIii = f.lliiilIiiiliiilIii = f.IiiiilIiiliiiilIii = 0.0;
      f.iiiiilIiiIIIIIiIii = 0L;
      f.iiIiilIiiIIliilIii = Math.min(s.Illilillil, s.Iililillil);
      f.lIliilIiiiIliilIii = Math.min(s.lllilillil, s.lililillil);
      f.IlliilIiillliilIii = Math.min(s.illilillil, s.iililillil);
      f.illiilIiiIiliilIii = Math.max(s.Illilillil, s.Iililillil);
      f.liliilIiiiiliilIii = Math.max(s.lllilillil, s.lililillil);
      f.IIiiilIiilIiiilIii = Math.max(s.illilillil, s.iililillil);
      var22 ^= (
            (long)(
                     (f.illiilIiiIiliilIii - f.iiIiilIiiIIliilIii + 1)
                        * (f.liliilIiiiiliilIii - f.lIliilIiiiIliilIii + 1)
                        * (f.IIiiilIiilIiiilIii - f.IlliilIiillliilIii + 1)
                  )
                  << 32
               ^ var22
         )
         & -1L << 32;
      long[] var6 = new long[Math.max(1, (int)(var22 >>> 32))];
      var22 ^= (0L ^ var22) & -1L >>> 32;
      var24 ^= ((long)f.iiIiilIiiIIliilIii << 32 ^ var24) & -1L << 32;

      while ((int)(var24 >>> 32) <= f.illiilIiiIiliilIii) {
         for (var24 ^= ((long)f.lIliilIiiiIliilIii ^ var24) & -1L >>> 32; (int)var24 <= f.liliilIiiiiliilIii; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            for (var26 ^= ((long)f.IlliilIiillliilIii << 32 ^ var26) & -1L << 32; (int)(var26 >>> 32) <= f.IIiiilIiilIiiilIii; var26 += 4294967296L) {
               int var10001 = (int)var22;
               var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32;
               var6[var10001] = lllIiIIiillIiIIi.IliIlllilIi((int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32));
            }
         }

         var24 += 4294967296L;
      }

      f.lIIIIiIiiiIIIIiIii = lllIiIIiillIiIIi.lIiiIiIlilli(var6, (int)var22);
      f.ilIIIiIiiIiIIIiIii = lllIiIIiillIiIIi.IlIlllIlilIl(var6, (int)var22);
      f.liIIIiIiiiiIIIiIii = -1;
      f.IlIIIiIiillIIIiIii = new int[0];
      if (s.IIiilillil >= 0 && s.iIiilillil > 0 && s.lIiilillil != 0) {
         var24 ^= ((long)(s.IIiilillil == 0 ? f.iiIiilIiiIIliilIii : (s.IIiilillil == 1 ? f.lIliilIiiiIliilIii : f.IlliilIiillliilIii)) << 32 ^ var24)
            & -1L << 32;
         var24 ^= ((long)(s.IIiilillil == 0 ? f.illiilIiiIiliilIii : (s.IIiilillil == 1 ? f.liliilIiiiiliilIii : f.IIiiilIiilIiiilIii)) ^ var24) & -1L >>> 32;
         var26 ^= ((long)(s.lIiilillil > 0 ? 1 : -1) << 32 ^ var26) & -1L << 32;
         long[] var11 = new long[(int)var22 * (s.iIiilillil + 1)];
         System.arraycopy(var6, 0, var11, 0, (int)var22);
         var26 ^= ((long)((int)var22) ^ var26) & -1L >>> 32;
         var28 ^= (0L ^ var28) & -1L << 32;
         var28 ^= (1L ^ var28) & -1L >>> 32;

         while ((int)var28 <= s.iIiilillil) {
            var30 ^= ((long)((int)(var26 >>> 32) > 0 ? (int)var24 + (int)var28 : (int)(var24 >>> 32) - (int)var28) << 32 ^ var30) & -1L << 32;
            if ((int)(var30 >>> 32) < s.Iliilillil || (int)(var30 >>> 32) > s.lliilillil) {
               break;
            }

            var28 ^= ((long)((int)var28) << 32 ^ var28) & -1L << 32;

            for (var30 ^= (0L ^ var30) & -1L >>> 32; (int)var30 < (int)var22; var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32) {
               long var17 = var6[(int)var30];
               var32 ^= ((long)lllIiIIiillIiIIi.liiiIIllIl(var17) << 32 ^ var32) & -1L << 32;
               var32 ^= ((long)lllIiIIiillIiIIi.iIlIlllllill(var17) ^ var32) & -1L >>> 32;
               var34 ^= ((long)lllIiIIiillIiIIi.IilliliilIIi(var17) << 32 ^ var34) & -1L << 32;
               switch (s.IIiilillil) {
                  case 0:
                     var32 ^= ((long)((int)(var30 >>> 32)) << 32 ^ var32) & -1L << 32;
                     break;
                  case 1:
                     var32 ^= ((long)((int)(var30 >>> 32)) ^ var32) & -1L >>> 32;
                     break;
                  default:
                     var34 ^= ((long)((int)(var30 >>> 32)) << 32 ^ var34) & -1L << 32;
               }

               int var49 = (int)var26;
               var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32;
               var11[var49] = lllIiIIiillIiIIi.IliIlllilIi((int)(var32 >>> 32), (int)var32, (int)(var34 >>> 32));
            }

            var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32;
         }

         if ((int)(var28 >>> 32) != 0) {
            f.IlIIIiIiillIIIiIii = lllIiIIiillIiIIi.iliIiiliiiii(var11, (int)var26, var6, (int)var22);
            f.liIIIiIiiiiIIIiIii = s.IIiilillil;
            f.IIlIIiIiilIlIIiIii = (int)(var26 >>> 32);
            f.iIlIIiIiiIllIIiIii = (int)(var26 >>> 32) > 0 ? (int)var24 + 1 : (int)(var24 >>> 32);
            f.lllIIiIiiillIIiIii = (int)(var28 >>> 32);
         }
      }
   }

   private static float IlIillIiilIi(IilllIililllIi s, double x, double z, double y) {
      double var7 = s.liIIIiIiiiiIIIiIii == 0 ? x : (s.liIIIiIiiiiIIIiIii == 1 ? z : y);
      double var9 = (var7 - (double)s.iIlIIiIiiIllIIiIii) * (double)s.IIlIIiIiilIlIIiIii;
      float var11 = (float)Math.max(0.0, Math.min(1.0, var9 / (double)Math.max(1, s.lllIIiIiiillIIiIii)));
      float var12 = 1.0F - var11;
      return var12 * var12;
   }

   private void IIiilIiiiIii(int a, double now, float total, long n) {
      long var42 = -3300421756264469488L;
      long var44 = 8086304767426218479L;
      long var46 = 8406370942839158970L;
      double var7 = (double)n / 1.0E9 * 1.5 % 1.25;
      class_4588 var9 = iIiiIIilIliiIIil.lIiiIiIlilli();
      class_4588 var10 = iIiiIIilIliiIIil.IilliliilIIi();
      float var11 = 2.0F * this.llilIilIlililIilIl;

      for (long var50 = var42 ^ (0L ^ var42) & -1L << 32; (int)(var50 >>> 32) < 256; var50 += 4294967296L) {
         double var13 = (double)((int)(var50 >>> 32)) * 1.25 + (1.25 - var7);
         if (var13 > now - 0.9) {
            break;
         }

         if (!(var13 < 0.55)) {
            double var15 = now - var13;
            float var17 = iIillliIlillli.Ililllililil((float)((var15 - 0.9) / 0.6))
               * iIillliIlillli.Ililllililil((float)((var13 - 0.55) / 0.5))
               * (1.0F - 0.5F * iIillliIlillli.Ililllililil((float)(var15 / now)));
            if (!(var17 < 0.01F)) {
               var50 ^= ((long)this.Iliilliiilii(a, var15) ^ var50) & -1L >>> 32;
               double var19 = this.IliIIilIllliIIilIl[(int)var50 + 1] - this.IliIIilIllliIIilIl[(int)var50] > 1.0E-9
                  ? (var15 - this.IliIIilIllliIIilIl[(int)var50]) / (this.IliIIilIllliIIilIl[(int)var50 + 1] - this.IliIIilIllliIIilIl[(int)var50])
                  : 0.0;
               double var21 = this.lIiIIilIliIiIIilIl[(int)var50 * 3]
                  + (this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 3] - this.lIiIIilIliIiIIilIl[(int)var50 * 3]) * var19;
               double var23 = this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 1]
                  + (this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 4] - this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 1]) * var19;
               double var25 = this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 2]
                  + (this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 5] - this.lIiIIilIliIiIIilIl[(int)var50 * 3 + 2]) * var19;
               long var51 = var44 ^ ((long)Math.max(0, (int)var50 - 1) << 32 ^ var44) & -1L << 32;
               var44 = var51 ^ ((long)Math.min(a - 1, (int)var50 + 2) ^ var51) & -1L >>> 32;
               double var29 = this.lIiIIilIliIiIIilIl[(int)var44 * 3] - this.lIiIIilIliIiIIilIl[(int)(var44 >>> 32) * 3];
               double var31 = this.lIiIIilIliIiIIilIl[(int)var44 * 3 + 2] - this.lIiIIilIliIiIIilIl[(int)(var44 >>> 32) * 3 + 2];
               double var33 = Math.sqrt(var29 * var29 + var31 * var31);
               if (!(var33 < 1.0E-4)) {
                  var29 /= var33;
                  var31 /= var33;
                  double var35 = -var31;
                  double var39 = 0.012;
                  this.iIlIIilIlIllIIilIl[0] = var21 - var29 * 0.1 + var35 * 0.17;
                  this.iIlIIilIlIllIIilIl[1] = var23 + var39;
                  this.iIlIIilIlIllIIilIl[2] = var25 - var31 * 0.1 + var29 * 0.17;
                  this.iIlIIilIlIllIIilIl[3] = var21 + var29 * 0.1;
                  this.iIlIIilIlIllIIilIl[4] = var23 + var39;
                  this.iIlIIilIlIllIIilIl[5] = var25 + var31 * 0.1;
                  this.iIlIIilIlIllIIilIl[6] = var21 - var29 * 0.1 - var35 * 0.17;
                  this.iIlIIilIlIllIIilIl[7] = var23 + var39;
                  this.iIlIIilIlIllIIilIl[8] = var25 - var31 * 0.1 - var29 * 0.17;
                  var46 ^= ((long)iIillliIlillli.IIIilIIiiIIi(this.iiilIilIlIIIiIilIl, 0.95F * total * var17) << 32 ^ var46) & -1L << 32;
                  this.lllIIilIlillIIilIl[0] = this.lllIIilIlillIIilIl[1] = this.lllIIilIlillIIilIl[2] = iIillliIlillli.IIIilIIiiIIi(
                     this.iiilIilIlIIIiIilIl, 0.32F * total * var17
                  );
                  IIillllIilll.liiiIIllIl(
                     var10, this.IlllIilIlllllIilIl, this.lIllIilIliIllIilIl, this.iIlIIilIlIllIIilIl, this.lllIIilIlillIIilIl, 3, var11, 1.0F, false, false
                  );
                  this.lllIIilIlillIIilIl[0] = this.lllIIilIlillIIilIl[1] = this.lllIIilIlillIIilIl[2] = (int)(var46 >>> 32);
                  IIillllIilll.liiiIIllIl(
                     var9, this.IlllIilIlllllIilIl, this.lIllIilIliIllIilIl, this.iIlIIilIlIllIIilIl, this.lllIIilIlillIIilIl, 3, var11, 1.0F, false, false
                  );
               }
            }
         }
      }
   }
}
