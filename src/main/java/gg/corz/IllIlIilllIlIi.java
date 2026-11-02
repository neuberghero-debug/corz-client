package gg.corz;

import java.util.Arrays;

public final class IllIlIilllIlIi {
   private final float[] IiIIIlIiiliIIIlIii = new float[105];
   public static final float IIIIIlIiilIIIIlIii = -1000000.0F;
   public static final float IliiiIIiilliiiIIii = -14.0F;
   public static final float iIIIIlIiiIlIIIlIii = 0.5F;
   public static final float iliiiIIiiIiiiiIIii = 0.5F;
   private float iiIIIlIiiIIlIIlIii = Float.POSITIVE_INFINITY;
   public static final int liiiiIIiiiiiiiIIii = 105;
   public static final float llIIIlIiiilIIIlIii = Float.POSITIVE_INFINITY;

   public float IIIllIIliIIl(float y) {
      long var6 = 5585808632954214388L;
      float var2 = (y - -14.0F) / 0.5F;
      if (var2 >= 0.0F && !(var2 > 104.0F)) {
         var6 ^= ((long)((int)var2) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) >= 104) {
            return this.IiIIIlIiiliIIIlIii[104];
         } else {
            float var4 = this.IiIIIlIiiliIIIlIii[(int)(var6 >>> 32)];
            float var5 = this.IiIIIlIiiliIIIlIii[(int)(var6 >>> 32) + 1];
            return !(var4 <= -1000000.0F) && !(var5 <= -1000000.0F) ? var4 + (var5 - var4) * (var2 - (float)((int)(var6 >>> 32))) : Math.max(var4, var5);
         }
      } else {
         return -1000000.0F;
      }
   }

   public float IilliliilIIi() {
      return this.iiIIIlIiiIIlIIlIii;
   }

   public void lIiiIiIlilli(float[] yLimit, float[] zs, int n, float ys) {
      long var20 = 8843052625500534125L;
      long var22 = 5174214638084543551L;
      long var24 = 6140631710458340756L;
      float var5 = Float.POSITIVE_INFINITY;
      float var6 = Float.NEGATIVE_INFINITY;

      for (var20 ^= (0L ^ var20) & -1L << 32; (int)(var20 >>> 32) < n; var20 += 4294967296L) {
         if (!Float.isFinite(yLimit[(int)(var20 >>> 32)]) || !Float.isFinite(zs[(int)(var20 >>> 32)])) {
            return;
         }

         var5 = Math.min(var5, yLimit[(int)(var20 >>> 32)]);
         var6 = Math.max(var6, yLimit[(int)(var20 >>> 32)]);
      }

      var6 = Math.min(var6, ys);
      if (var6 >= var5) {
         var20 ^= ((long)Math.max(0, (int)Math.ceil((double)((var5 - -14.0F) / 0.5F))) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)Math.min(104, (int)Math.floor((double)((var6 - -14.0F) / 0.5F))) ^ var20) & -1L >>> 32;
         var22 ^= ((long)((int)(var20 >>> 32)) << 32 ^ var22) & -1L << 32;

         while ((int)(var22 >>> 32) <= (int)var20) {
            float var10 = -14.0F + (float)((int)(var22 >>> 32)) * 0.5F;
            float var11 = -1000000.0F;

            for (var22 ^= (0L ^ var22) & -1L >>> 32; (int)var22 < n; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
               float var13 = yLimit[(int)var22];
               float var14 = zs[(int)var22];

               for (var24 ^= ((long)((int)var22) << 32 ^ var24) & -1L << 32; (int)(var24 >>> 32) < n; var24 += 4294967296L) {
                  float var16 = yLimit[(int)(var24 >>> 32)];
                  float var17 = zs[(int)(var24 >>> 32)];
                  float var18;
                  if (var13 == var16) {
                     if (var10 != var13) {
                        continue;
                     }

                     var18 = Math.max(var14, var17);
                  } else {
                     float var19 = (var10 - var13) / (var16 - var13);
                     if (var19 < 0.0F || var19 > 1.0F) {
                        continue;
                     }

                     var18 = var14 + (var17 - var14) * var19;
                  }

                  if (var18 > var11) {
                     var11 = var18;
                  }
               }
            }

            if (var11 > -1000000.0F) {
               this.IiIIIlIiiliIIIlIii[(int)(var22 >>> 32)] = Math.max(this.IiIIIlIiiliIIIlIii[(int)(var22 >>> 32)], var11 - 0.5F);
            }

            var22 += 4294967296L;
         }
      }
   }

   public void iIlIlllllill(float y) {
      this.iiIIIlIiiIIlIIlIii = Float.isFinite(y) ? y : Float.POSITIVE_INFINITY;
   }

   public void liiiIIllIl(IllIlIilllIlIi other) {
      System.arraycopy(other.IiIIIlIiiliIIIlIii, 0, this.IiIIIlIiiliIIIlIii, 0, 105);
      this.iiIIIlIiiIIlIIlIii = other.iiIIIlIiiIIlIIlIii;
   }

   public void iliIiiliiiii(float z0, float yLimit, float y0, float z1, float y1) {
      float[] var6 = new float[]{z0, z0, y0, y0};
      float[] var7 = new float[]{yLimit, z1, yLimit, z1};
      this.lIiiIiIlilli(var6, var7, 4, y1);
   }

   public void IliIlllilIi() {
      Arrays.fill(this.IiIIIlIiiliIIIlIii, -1000000.0F);
      this.iiIIIlIiiIIlIIlIii = Float.POSITIVE_INFINITY;
   }

   public IllIlIilllIlIi() {
      this.IliIlllilIi();
   }

   public static void IlIlllIlilIl(IllIlIilllIlIi e) {
      e.IliIlllilIi();
      e.iliIiiliiiii(-0.25F, -2.25F, 12.0F, 2.25F, Float.POSITIVE_INFINITY);
      e.iliIiiliiiii(12.0F, -2.25F, 24.25F, 2.25F, Float.POSITIVE_INFINITY);
      e.iliIiiliiiii(-8.5F, -4.5F, 0.0F, 4.5F, 0.0F);
   }
}
