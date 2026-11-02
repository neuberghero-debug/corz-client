package gg.corz;

import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.Random;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class lIliIllliIliIlll {
   private static final int liiiiIIill = 12;
   private static double ilIIIlIill;
   private static final int IIIIIlIill = -8620404;
   private static final float[] IIlIIlIill = new float[8];
   private static Matrix4f liIIIlIill;
   private static float iiIIIlIill;
   private static final float iiiiiIIill = 30.0F;
   private static final Random IlIIIlIill = new Random();
   private static final float iIIIIlIill = 0.13F;
   private static final iIllIIIlIlllIIIl[] llIIIlIill = new iIllIIIlIlllIIIl[5];
   private static float IiIIIlIill;
   private static final int lIIIIlIill = 14472938;
   public static final String iliiiIIill = iIiiilIiIliiilIi.IiIlliIliiIl(IiIiliIiiiIi<"IiIiliIiiiIi","5kNC/jzPJ/n7Eq0dlf98M8nG7cXB5hr4UItDE1NlVWAIhfYp6w==">());
   private static final float[] lIlIIlIill = new float[8];
   private static final int IiiiiIIill = 5;

   private static void Ililllililil(class_4588 y1, float o2, float vc, float y2, float c2, float nx, float ny, float o1, float x2, int x1, int c1) {
      float var11 = o2 + nx * o1;
      float var12 = vc + ny * o1;
      float var13 = y2 + nx * o1;
      float var14 = c2 + ny * o1;
      float var15 = y2 + nx * x2;
      float var16 = c2 + ny * x2;
      float var17 = o2 + nx * x2;
      float var18 = vc + ny * x2;
      IlIillIiilIi(y1, var11, var12, x1);
      IlIillIiilIi(y1, var13, var14, x1);
      IlIillIiilIi(y1, var15, var16, c1);
      IlIillIiilIi(y1, var11, var12, x1);
      IlIillIiilIi(y1, var15, var16, c1);
      IlIillIiilIi(y1, var17, var18, c1);
   }

   private static void IlIlllIlilIl(class_4588 tipY, float cy, float vc, float tipX, float s, float cx, float side, int col) {
      long var30 = -5691044483439688684L;
      float var8 = tipX * 0.12F;
      float var9 = -tipX * 0.1F;
      float var10 = tipX * 0.12F;
      float var11 = tipX * 0.24F;
      float var12 = s * 0.48F;
      float var13 = Math.min(var9, cx) - tipX * 0.2F;
      float var14 = 0.0F;
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var17 = 0.0F;

      for (long var32 = var30 ^ (0L ^ var30) & -1L << 32; (int)(var32 >>> 32) <= 12; var32 += 4294967296L) {
         float var19 = (float)((int)(var32 >>> 32)) / 12.0F;
         float var20 = 1.0F - var19;
         float var21 = var20 * var20 * var8 + 2.0F * var20 * var19 * var12 + var19 * var19 * s;
         float var22 = var20 * var20 * var9 + 2.0F * var20 * var19 * var13 + var19 * var19 * cx;
         float var23 = var10 + (s - var10) * var19;
         float var24 = 1.0F - Math.abs((float)Math.sin((Math.PI * 3) * (double)var19));
         float var25 = var11 + (cx - var11) * var19 + tipX * (0.1F * (float)Math.sin(Math.PI * (double)var19) + 0.15F * var24 * var20);
         float var26 = cy + side * var21;
         float var27 = vc + var22;
         float var28 = cy + side * var23;
         float var29 = vc + var25;
         if ((int)(var32 >>> 32) > 0) {
            IIIilIIiiIIi(tipY, var14, var15, var26, var27, var28, var29, col);
            IIIilIIiiIIi(tipY, var14, var15, var28, var29, var16, var17, col);
         }

         var14 = var26;
         var15 = var27;
         var16 = var28;
         var17 = var29;
      }
   }

   public static void IilliliilIIi(int py, int mx, int h, int my, int w, int px, int screenW, int radius) {
      long var16 = -8632900023476047869L;
      long var18 = 705473253027318769L;
      if (liiiIIllIl()) {
         float var8 = (float)Math.min(0.05, llIilillilIilill.liiiIIllIl());
         ilIIIlIill += (double)var8;
         IliiIilliiIi.lilIliilIl();
         liIIIlIill = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
         iiIIIlIill = Math.max(0.35F, IliiIilliiIi.Illlllllilll() * 1.2F);
         class_4588 var9 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27379);
         float var10 = (float)w * 0.29F;
         float var11 = (float)ilIIIlIill;
         IiIlliIliiIl(var9, (float)(py + h) - var10, (float)mx + var10, -1.0F, 1.0F, 50.0F, 7, 4, 11, var11);
         IiIlliIliiIl(var9, (float)py + var10, (float)mx + var10, 1.0F, 1.0F, 30.0F, 5, 3, 23, var11 + 1.7F);
         IiIlliIliiIl(var9, (float)(py + h) - var10, (float)(mx + my) - var10, -1.0F, -1.0F, 24.0F, 5, 3, 37, var11 + 3.1F);
         IIlllIlliIll(var9, (float)(py + h) - 31.0F, (float)mx + var10 + 2.0F, screenW, radius, var8, var11);
         llIllIililIllIil.IIillIiliIil();
         var9 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27379);
         var16 ^= ((long)iIillliIlillli.iliIiiliiiii(-8620404, 0xFF000000 | IlIIilIlllIIilIl.lliiIlliIl & 16777215, 0.16F) << 32 ^ var16) & -1L << 32;

         for (long var22 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var22 < 5; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            iIllIIIlIlllIIIl var14 = llIIIlIill[(int)var22];
            if (var14 == null) {
               var14 = llIIIlIill[(int)var22] = new iIllIIIlIlllIIIl();
               lIiiIiIlilli(var14, mx, my, px, true);
            }

            if (!var14.llliiiIlIl) {
               var14.IlliiiIlIl -= var8;
               if (!(var14.IlliiiIlIl <= 0.0F)) {
                  continue;
               }

               var14.llliiiIlIl = true;
            }

            iliIiiliiiii(var14, var8, screenW, radius);
            if ((!(var14.iIIiiiIlIl > 0.0F) || !(var14.iiiliiIlIl > (float)px + 24.0F)) && (!(var14.iIIiiiIlIl < 0.0F) || !(var14.iiiliiIlIl < -24.0F))) {
               var18 ^= ((long)iIillliIlillli.iliIiiliiiii(-16184562, (int)(var22 >>> 32), 0.55F + 0.45F * var14.lIliiiIlIl) << 32 ^ var18) & -1L << 32;
               IIIllIIliIIl(
                  var9,
                  var14.iiiliiIlIl,
                  var14.IIIiiiIlIl + var14.iIliiiIlIl,
                  var14.IIliiiIlIl,
                  var14.iIIiiiIlIl,
                  (float)Math.sin((double)var14.liIiiiIlIl),
                  IliiIilliiIi.IlIlllIlilIl((int)(var18 >>> 32))
               );
            } else {
               lIiiIiIlilli(var14, mx, my, px, false);
            }
         }

         llIllIililIllIil.IIillIiliIil();
      }
   }

   private static void IiIlliIliiIl(class_4588 t, float rings, float r, float vc, float sx, float sy, int spokes, int ax, int seed, float ay) {
      long var33 = -268518168114360825L;
      long var35 = -9219466467963952404L;
      long var37 = -3486431149456920610L;
      float[] var10 = IIlIIlIill;
      float[] var11 = lIlIIlIill;

      for (var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) < spokes; var33 += 4294967296L) {
         double var13 = (Math.PI / 2) * (double)((int)(var33 >>> 32)) / (double)(spokes - 1);
         float var15 = sy * ((int)(var33 >>> 32) != 0 && (int)(var33 >>> 32) != spokes - 1 ? 0.86F + 0.18F * Illlllllilll(seed, (int)(var33 >>> 32)) : 1.08F);
         float var16 = (int)(var33 >>> 32) != 0 && (int)(var33 >>> 32) != spokes - 1
            ? 0.7F * (float)Math.sin((double)(ay * 0.8F + (float)((int)(var33 >>> 32)) * 1.3F))
            : 0.0F;
         float var17 = (float)Math.cos(var13);
         float var18 = (float)Math.sin(var13);
         var10[(int)(var33 >>> 32)] = rings + vc * (var17 * var15 - var18 * var16);
         var11[(int)(var33 >>> 32)] = r + sx * (var18 * var15 + var17 * var16);
      }

      var33 ^= ((long)Iilllilliill(1.0F) << 32 ^ var33) & -1L << 32;
      float var39 = 0.32F;

      for (var33 ^= (0L ^ var33) & -1L >>> 32; (int)var33 < spokes; var33 ^= (var33 ^ var33 + (long)1) & -1L >>> 32) {
         IIillIiliIil(t, rings, r, var10[(int)var33], var11[(int)var33], var39, (int)(var33 >>> 32));
      }

      for (long var45 = var33 ^ (1L ^ var33) & -1L >>> 32; (int)var45 <= ax; var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32) {
         float var40 = (float)Math.pow((double)((float)((int)var45) / ((float)ax + 0.55F)), 1.12F);
         var35 ^= ((long)Iilllilliill(0.75F + 0.25F * (1.0F - var40)) << 32 ^ var35) & -1L << 32;

         for (var35 ^= (0L ^ var35) & -1L >>> 32; (int)var35 + 1 < spokes; var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
            float var41 = rings + (var10[(int)var35] - rings) * var40;
            float var19 = r + (var11[(int)var35] - r) * var40;
            float var20 = rings + (var10[(int)var35 + 1] - rings) * var40;
            float var21 = r + (var11[(int)var35 + 1] - r) * var40;
            float var22 = (var41 + var20) * 0.5F;
            float var23 = (var19 + var21) * 0.5F;
            float var24 = var22 + (rings - var22) * 0.16F;
            float var25 = var23 + (r - var23) * 0.16F;
            float var26 = var41;
            float var27 = var19;

            for (var37 ^= (4294967296L ^ var37) & -1L << 32; (int)(var37 >>> 32) <= 4; var37 += 4294967296L) {
               float var29 = (float)((int)(var37 >>> 32)) / 4.0F;
               float var30 = 1.0F - var29;
               float var31 = var30 * var30 * var41 + 2.0F * var30 * var29 * var24 + var29 * var29 * var20;
               float var32 = var30 * var30 * var19 + 2.0F * var30 * var29 * var25 + var29 * var29 * var21;
               IIillIiliIil(t, var26, var27, var31, var32, var39 * 0.85F, (int)(var35 >>> 32));
               var26 = var31;
               var27 = var32;
            }
         }
      }
   }

   private static int Iilllilliill(float mul) {
      long var2 = 4486834995287239361L;
      var2 ^= ((long)Math.round(33.149998F * mul) << 32 ^ var2) & -1L << 32;
      return IliiIilliiIi.IlIlllIlilIl(Math.min(255, (int)(var2 >>> 32)) << 24 | 14472938);
   }

   private lIliIllliIliIlll() {
   }

   private static void Iiilliiliiil(class_4588 cx, float ry, float col, float cy, float segs, int rx, int vc) {
      long var14 = 8450298438607976281L;
      float var7 = ry + cy;
      float var8 = col;

      for (long var16 = var14 ^ (4294967296L ^ var14) & -1L << 32; (int)(var16 >>> 32) <= rx; var16 += 4294967296L) {
         double var10 = (Math.PI * 2) * (double)((int)(var16 >>> 32)) / (double)rx;
         float var12 = ry + cy * (float)Math.cos(var10);
         float var13 = col + segs * (float)Math.sin(var10);
         IIIilIIiiIIi(cx, ry, col, var7, var8, var12, var13, vc);
         var7 = var12;
         var8 = var13;
      }
   }

   private static void IIIilIIiiIIi(class_4588 col, float by, float cy, float cx, float bx, float vc, float ay, int ax) {
      IlIillIiilIi(col, by, cy, ax);
      IlIillIiilIi(col, cx, bx, ax);
      IlIillIiilIi(col, vc, ay, ax);
   }

   private static void lIiiIiIlilli(iIllIIIlIlllIIIl h, int py, int screenW, int b, boolean first) {
      h.lIliiiIlIl = IlIIIlIill.nextFloat();
      h.IIliiiIlIl = 3.4F + 2.8F * h.lIliiiIlIl;
      h.iIIiiiIlIl = IlIIIlIill.nextBoolean() ? 1.0F : -1.0F;
      h.IlIiiiIlIl = 58.0F + 54.0F * h.lIliiiIlIl + IlIIIlIill.nextFloat() * 14.0F;
      h.iiiliiIlIl = h.iIIiiiIlIl > 0.0F ? -20.0F : (float)b + 20.0F;
      h.lIIiiiIlIl = (float)py + (float)screenW * (0.06F + 0.88F * IlIIIlIill.nextFloat());
      h.llIiiiIlIl = (IlIIIlIill.nextFloat() - 0.5F) * 18.0F;
      h.ilIiiiIlIl = 3.0F + IlIIIlIill.nextFloat() * 8.0F;
      h.IiIiiiIlIl = 1.4F + IlIIIlIill.nextFloat() * 1.2F;
      h.liIiiiIlIl = IlIIIlIill.nextFloat() * 6.283F;
      h.iiIiiiIlIl = (float) (Math.PI * 2) * (8.5F - 2.5F * h.lIliiiIlIl + IlIIIlIill.nextFloat());
      h.iIliiiIlIl = 0.0F;
      h.llliiiIlIl = false;
      h.IlliiiIlIl = first ? IlIIIlIill.nextFloat() * 5.0F : 2.5F + IlIIIlIill.nextFloat() * 7.0F;
      h.IIIiiiIlIl = h.lIIiiiIlIl;
   }

   public static boolean liiiIIllIl() {
      Iiliililliliilil var0 = Iiliililliliilil.llllllllil;
      return var0 != null && var0.lIIillllil.Iilllilliill() && IliIlllilIi();
   }

   public static void iIlIlllllill() {
      long var1 = -2870208138294893786L;

      for (long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) < 5; var3 += 4294967296L) {
         llIIIlIill[(int)(var3 >>> 32)] = null;
      }

      IiIIIlIill = 0.0F;
   }

   private static void iliIiiliiiii(iIllIIIlIlllIIIl dt, float mx, int b, int my) {
      dt.iiiliiIlIl = dt.iiiliiIlIl + dt.iIIiiiIlIl * dt.IlIiiiIlIl * mx;
      dt.lIIiiiIlIl = dt.lIIiiiIlIl + dt.llIiiiIlIl * mx;
      dt.liIiiiIlIl = dt.liIiiiIlIl + dt.iiIiiiIlIl * mx;
      dt.IIIiiiIlIl = dt.lIIiiiIlIl + dt.ilIiiiIlIl * (float)Math.sin(ilIIIlIill * (double)dt.IiIiiiIlIl + (double)(dt.liIiiiIlIl * 0.05F));
      float var4 = dt.iiiliiIlIl - (float)b;
      float var5 = dt.IIIiiiIlIl + dt.iIliiiIlIl - (float)my;
      float var6 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
      float var7 = 0.0F;
      if (var6 < 30.0F) {
         var7 = dt.iIliiiIlIl + (var5 >= 0.0F ? 1.0F : -1.0F) * (30.0F - var6) * 1.4F;
      }

      var7 = Math.max(-28.0F, Math.min(28.0F, var7));
      dt.iIliiiIlIl = dt.iIliiiIlIl + (var7 - dt.iIliiiIlIl) * Math.min(1.0F, mx * (var6 < 30.0F ? 9.0F : 1.6F));
   }

   public static boolean IliIlllilIi() {
      return iIiiilIiIliiilIi.IliIlllilIi() == iIiiilIiIliiilIi.lIIIIilIIi;
   }

   private static void IlIillIiilIi(class_4588 vc, float col, float x, int y) {
      vc.method_22918(liIIIlIill, col, x, 0.0F).method_39415(y);
   }

   private static void IIillIiliIil(class_4588 vc, float x1, float col, float y2, float half, float x2, int y1) {
      long var13 = -7732141940596703696L;
      float var7 = y2 - x1;
      float var8 = half - col;
      float var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
      if (!(var9 < 0.001F)) {
         float var10 = -var8 / var9;
         float var11 = var7 / var9;
         var13 ^= ((long)(y1 & 16777215) << 32 ^ var13) & -1L << 32;
         Ililllililil(vc, x1, col, y2, half, var10, var11, -x2 - iiIIIlIill, -x2, (int)(var13 >>> 32), y1);
         Ililllililil(vc, x1, col, y2, half, var10, var11, -x2, x2, y1, y1);
         Ililllililil(vc, x1, col, y2, half, var10, var11, x2, x2 + iiIIIlIill, y1, (int)(var13 >>> 32));
      }
   }

   private static float Illlllllilll(int seed, int j) {
      double var2 = Math.sin((double)seed * 12.9898 + (double)j * 78.233) * 43758.5453;
      return (float)(var2 - Math.floor(var2));
   }

   private static void IIlllIlliIll(class_4588 mx, float x, float dt, int top, int vc, float t, float my) {
      long var21 = -801592725087404331L;
      long var23 = -50066359274060228L;
      float var7 = 22.0F + 6.0F * (float)Math.sin((double)(my * 0.55F));
      float var8 = dt + var7 * (1.0F - IiIIIlIill);
      var21 ^= ((long)(Math.abs((float)top - x) < 18.0F && (float)vc > dt - 4.0F && (float)vc < var8 + 14.0F ? 1 : 0) << 32 ^ var21) & -1L << 32;
      IiIIIlIill = IiIIIlIill + (((int)(var21 >>> 32) != 0 ? 0.82F : 0.0F) - IiIIIlIill) * Math.min(1.0F, t * ((int)(var21 >>> 32) != 0 ? 7.0F : 1.2F));
      var8 = dt + var7 * (1.0F - IiIIIlIill);
      float var10 = 0.8F * (float)Math.sin((double)(my * 1.1F));
      float var11 = x + var10;
      IIillIiliIil(mx, x, dt, var11, var8 - 2.0F, 0.28F, Iilllilliill(1.1F));
      var21 ^= ((long)IliiIilliiIi.IlIlllIlilIl(iIillliIlillli.iliIiiliiiii(-16184562, -8620404, 0.92F)) ^ var21) & -1L >>> 32;
      float var13 = 0.35F * (float)Math.sin((double)(my * 6.0F));
      var23 ^= (-4294967296L ^ var23) & -1L << 32;

      while ((int)(var23 >>> 32) <= 1) {
         for (var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 < 4; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            float var16 = var8 - 0.8F + (float)((int)var23) * 0.9F;
            float var17 = var11 + (float)((int)(var23 >>> 32)) * (2.6F + ((int)var23 != 1 && (int)var23 != 2 ? 0.0F : 0.6F));
            float var18 = var16 + ((float)((int)var23) - 1.5F) * 1.1F - 1.0F + ((int)var23 % 2 == 0 ? var13 : -var13);
            float var19 = var17 + (float)((int)(var23 >>> 32)) * 1.4F;
            float var20 = var18 + 2.2F + ((float)((int)var23) - 1.5F) * 0.6F;
            IIillIiliIil(mx, var11, var8 + (float)((int)var23) * 0.5F - 0.6F, var17, var18, 0.3F, (int)var21);
            IIillIiliIil(mx, var17, var18, var19, var20, 0.26F, (int)var21);
         }

         var23 += 8589934592L;
      }

      Iiilliiliiil(mx, var11, var8 + 1.4F, 2.1F, 2.4F, 12, (int)var21);
      Iiilliiliiil(mx, var11, var8 - 1.3F, 1.3F, 1.2F, 10, (int)var21);
   }

   private static void IIIllIIliIIl(class_4588 cy, float vc, float col, float s, float dir, float f, int cx) {
      float var7 = s * (0.94F + 0.08F * f);
      float var8 = -s * (0.05F + 0.58F * f);
      IlIlllIlilIl(cy, vc, col, s, var7, var8, 1.0F, cx);
      IlIlllIlilIl(cy, vc, col, s, var7, var8, -1.0F, cx);
      Iiilliiliiil(cy, vc, col + s * 0.06F, s * 0.19F, s * 0.32F, 10, cx);
      float var9 = vc + dir * s * 0.03F;
      float var10 = col - s * 0.27F;
      Iiilliiliiil(cy, var9, var10, s * 0.15F, s * 0.14F, 8, cx);
      IIIilIIiiIIi(cy, var9 - s * 0.13F, var10 - s * 0.02F, var9 - s * 0.03F, var10 - s * 0.08F, var9 - s * 0.12F, var10 - s * 0.3F, cx);
      IIIilIIiiIIi(cy, var9 + s * 0.13F, var10 - s * 0.02F, var9 + s * 0.03F, var10 - s * 0.08F, var9 + s * 0.12F, var10 - s * 0.3F, cx);
   }
}
