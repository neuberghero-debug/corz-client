package gg.corz;

import java.util.Random;

public final class llIliillilIliill {
   public static final float IiilIiiill = 0.35F;
   private float IIliIiiill;
   private float llIiIiiill;
   public static final float llilIiiill = 20.0F;
   private float IlliIiiill;
   public static final float iIilIiiill = 520.0F;
   private float ilIiIiiill;
   public static final double iiilIiiill = 90.0;
   public static final double liilIiiill = 0.05;
   public static final float IlilIiiill = 30.0F;
   private float iiIiIiiill;
   public static final double lIIiIiiill = 50.0;
   private boolean IlIiIiiill;
   public static final float ililIiiill = 20.0F;
   private float lIliIiiill;
   private float iIliIiiill;
   private final Random iIIiIiiill;
   private float liIiIiiill;
   private float IiIiIiiill = 1.0F;
   public static final long IIIiIiiill = 66L;

   public boolean liiiIIllIl() {
      return Math.abs(this.iIliIiiill) < 0.35F && Math.abs(this.IlliIiiill) < 0.35F;
   }

   public void IliIlllilIi() {
      this.IlIiIiiill = false;
      this.IIliIiiill = 0.0F;
      this.lIliIiiill = 0.0F;
      this.iIliIiiill = 0.0F;
      this.IlliIiiill = 0.0F;
   }

   public static float IilliliilIIi(float remaining, float speed) {
      if (!(remaining <= 0.0F) && !(speed <= 0.0F)) {
         double var2;
         if (remaining > 20.0F) {
            double var4 = (double)((remaining - 20.0F) / speed);
            var2 = 0.05 <= var4 ? (double)remaining - (double)speed * 0.05 : 20.0 * Math.exp((double)(-(speed / 20.0F)) * (0.05 - var4));
         } else {
            var2 = (double)remaining * Math.exp((double)(-speed) * 0.05 / 20.0);
         }

         return (float)Math.min(30.0, Math.max(0.0, (double)remaining - var2));
      } else {
         return 0.0F;
      }
   }

   public static float iliIiiliiiii(float yaw) {
      float var1 = (yaw % 45.0F + 45.0F) % 45.0F;
      return Math.min(var1, 45.0F - var1);
   }

   public double lIiiIiIlilli() {
      double var1 = 90.0;
      double var3 = this.iIIiIiiill.nextGaussian() * var1 * 0.3;
      double var5 = -Math.log(1.0 - this.iIIiIiiill.nextDouble()) * var1 * 0.4;
      return (double)Math.max(Math.max(66L, Math.round(var1 * 0.55)), Math.round(var1 + var3 + var5)) / 50.0;
   }

   private static float IlIlllIlilIl(float d) {
      d %= 360.0F;
      if (d >= 180.0F) {
         d -= 360.0F;
      }

      if (d < -180.0F) {
         d += 360.0F;
      }

      return d;
   }

   public llIliillilIliill() {
      this(new Random());
   }

   public float[] iIlIlllllill(float curPitch, float wantPitch, float unit, float curYaw, float wantYaw) {
      long var16 = -7005821900839059586L;
      long var14 = 8864047461754108249L;
      float var6 = Math.max(wantYaw, 1.0E-4F);
      curYaw = liillilliiillill.IiIiliIiiiIi(curYaw);
      if (!this.IlIiIiiill || Math.hypot((double)IlIlllIlilIl(unit - this.llIiIiiill), (double)(curYaw - this.ilIiIiiill)) > 20.0) {
         this.IiIiIiiill = 0.8F + this.iIIiIiiill.nextFloat() * 0.4F;
         this.liIiIiiill = this.iIIiIiiill.nextFloat() * 0.6F;
      }

      this.IlIiIiiill = true;
      this.llIiIiiill = unit;
      this.ilIiIiiill = curYaw;
      this.iiIiIiiill = Math.max(0.8F, Math.min(1.2F, this.iiIiIiiill + (this.iIIiIiiill.nextFloat() - 0.5F) * 0.24F));
      float var7 = Math.min(520.0F * this.IiIiIiiill * this.iiIiIiiill, 600.0F);
      float var8 = IlIlllIlilIl(IIIllIIliIIl(unit, var6, this.liIiIiiill) - curPitch);
      float var9 = curYaw - wantPitch;
      var14 ^= (0L ^ var14) & -1L << 32;
      var14 ^= (0L ^ var14) & -1L >>> 32;
      if (Math.abs(var8) <= var6 * 0.5F) {
         this.IIliIiiill = 0.0F;
      } else {
         float var12 = this.IIliIiiill + Math.copySign(IilliliilIIi(Math.abs(var8), var7), var8);
         var14 ^= ((long)Math.round(var12 / var6) << 32 ^ var14) & -1L << 32;
         this.IIliIiiill = var12 - (float)((int)(var14 >>> 32)) * var6;
      }

      if (Math.abs(var9) <= var6 * 0.5F) {
         this.lIliIiiill = 0.0F;
      } else {
         float var19 = this.lIliIiiill + Math.copySign(IilliliilIIi(Math.abs(var9), var7), var9);
         var14 ^= ((long)Math.round(var19 / var6) ^ var14) & -1L >>> 32;
         this.lIliIiiill = var19 - (float)((int)var14) * var6;
      }

      var16 ^= (0L ^ var16) & -1L << 32;

      while ((int)(var14 >>> 32) != 0 && (int)(var16 >>> 32) < 8 && iliIiiliiiii(curPitch + (float)((int)(var14 >>> 32)) * var6) < 0.1F) {
         var16 ^= ((long)Integer.signum((int)(var14 >>> 32)) ^ var16) & -1L >>> 32;
         var14 ^= ((long)((int)(var14 >>> 32) + (int)var16) << 32 ^ var14) & -1L << 32;
         this.IIliIiiill -= (float)((int)var16) * var6;
         var16 += 4294967296L;
      }

      float var20 = (int)(var14 >>> 32) == 0 ? curPitch : curPitch + (float)((int)(var14 >>> 32)) * var6;
      float var13 = (int)var14 == 0 ? wantPitch : liillilliiillill.IiIiliIiiiIi(wantPitch + (float)((int)var14) * var6);
      this.iIliIiiill = var20 - curPitch;
      this.IlliIiiill = var13 - wantPitch;
      return new float[]{var20, var13};
   }

   public static float IIIllIIliIIl(float unit, float yaw, float skew) {
      float var3 = Math.max(0.35F, yaw * 1.5F + 0.1F);
      if (iliIiiliiiii(unit) >= var3) {
         return unit;
      } else {
         float var4 = (unit % 45.0F + 45.0F) % 45.0F;
         float var5 = (float)Math.round(unit / 45.0F) * 45.0F;
         return var5 + (var4 < 22.5F ? 1.0F : -1.0F) * (var3 + skew);
      }
   }

   public llIliillilIliill(Random rnd) {
      this.iiIiIiiill = 1.0F;
      this.iIIiIiiill = rnd;
   }
}
