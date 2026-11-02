package gg.corz;

public final class liillilliiillill {
   public static final float ilIIIliill = 0.35F;
   private float lIlIIliill;
   public static final float llIIIliill = 9.0F;
   public static final float IlIIIliill = 30.0F;
   private float iIlIIliill;
   private float IllIIliill;
   private float iiIIIliill;
   public static final float liIIIliill = 3.5F;
   private float illIIliill;
   private float lllIIliill;
   public static final float IiIIIliill = 1.5F;
   private final float IIlIIliill;

   private double IlIillIiilIi(double v) {
      long var4 = -2578192505882082796L;
      if (v <= 0.0) {
         return 0.0;
      } else {
         var4 ^= ((long)((int)Math.ceil(v / (double)this.IIlIIliill - 1.0E-9)) << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) < 1) {
            var4 ^= (4294967296L ^ var4) & -1L << 32;
         }

         return (double)((int)(var4 >>> 32)) * v - (double)(this.IIlIIliill * (float)((int)(var4 >>> 32)) * (float)((int)(var4 >>> 32) - 1)) / 2.0;
      }
   }

   public static float Ililllililil(float degrees) {
      float var1 = degrees % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public liillilliiillill(float maxAccel, float maxVelocity) {
      this.iiIIIliill = Math.max(0.001F, maxAccel);
      this.IIlIIliill = Math.max(0.001F, maxVelocity);
   }

   public iIllliiIllllii IliIlllilIi(float curYaw, float driftPitch, float wantYaw, float curPitch, float driftYaw, float wantPitch) {
      float var7 = curYaw + Ililllililil(wantYaw + driftYaw - curYaw);
      float var8 = IiIiliIiiiIi(curPitch + wantPitch);
      float var9 = this.Iiilliiliiil(var7 - curYaw, this.lIlIIliill);
      float var10 = this.Iiilliiliiil(var8 - IiIiliIiiiIi(driftPitch), this.iIlIIliill);
      this.illIIliill = Math.max(this.illIIliill, Math.max(Math.abs(var9 - this.lIlIIliill), Math.abs(var10 - this.iIlIIliill)));
      this.lIlIIliill = var9;
      this.iIlIIliill = var10;
      this.IllIIliill = Math.max(this.IllIIliill, Math.abs(this.lIlIIliill));
      this.lllIIliill = Math.max(this.lllIIliill, Math.abs(this.iIlIIliill));
      return new iIllliiIllllii(curYaw + this.lIlIIliill, IiIiliIiiiIi(IiIiliIiiiIi(driftPitch) + this.iIlIIliill), this.lIlIIliill, this.iIlIIliill);
   }

   public float IiIlliIliiIl() {
      return this.illIIliill;
   }

   public float IilliliilIIi() {
      return this.lIlIIliill;
   }

   public static float Illlllllilll(long legKey) {
      long var2 = legKey * -7046029254386353131L;
      var2 ^= var2 >>> 30;
      var2 *= -4658895280553007687L;
      var2 ^= var2 >>> 27;
      var2 *= -7723592293110705685L;
      var2 ^= var2 >>> 31;
      double var4 = 1.5 + (double)((var2 >>> 20) % 2001L) / 2000.0 * 2.0;
      return (float)((var2 >>> 17 & 1L) == 0L ? var4 : -var4);
   }

   public float IlIlllIlilIl() {
      return this.lllIIliill;
   }

   public int IIillIiliIil(float deltaDegrees) {
      long var9 = 4732138445110297605L;
      double var2 = (double)Math.abs(deltaDegrees);
      double var4 = 0.0;

      for (var9 ^= (0L ^ var9) & -1L << 32; var2 > 1.0E-4 && (int)(var9 >>> 32) < 1000; var9 += 4294967296L) {
         double var7 = Math.min((double)this.iiIIIliill, Math.min(var4 + (double)this.IIlIIliill, this.IIIilIIiiIIi(var2)));
         if (var7 > var2) {
            var7 = var2;
         }

         if (var7 > 0.0 && var7 < 0.35F) {
            var7 = Math.min(0.35F, var2);
         }

         var2 -= var7;
         var4 = var7;
      }

      return (int)(var9 >>> 32);
   }

   public boolean lIiiIiIlilli() {
      return Math.abs(this.lIlIIliill) < 0.35F && Math.abs(this.iIlIIliill) < 0.35F;
   }

   private static float IiIiliIiiiIi(float pitch) {
      return pitch < -90.0F ? -90.0F : (pitch > 90.0F ? 90.0F : pitch);
   }

   public void iIlIlllllill() {
      this.lIlIIliill = 0.0F;
      this.iIlIIliill = 0.0F;
   }

   public void IIlllIlliIll() {
      this.IllIIliill = 0.0F;
      this.lllIIliill = 0.0F;
      this.illIIliill = 0.0F;
   }

   public static boolean Iilllilliill(float yaw, float tolerance) {
      double var2 = (double)Math.round((double)yaw / 45.0);
      return Math.abs((double)yaw - var2 * 45.0) <= (double)tolerance;
   }

   public float IIIllIIliIIl() {
      return this.IllIIliill;
   }

   private double IIIilIIiiIIi(double distance) {
      long var10 = 8070193003859286262L;
      if (distance <= 0.0) {
         return 0.0;
      } else if (this.IlIillIiilIi((double)this.iiIIIliill) <= distance) {
         return (double)this.iiIIIliill;
      } else {
         double var3 = 0.0;
         double var5 = (double)this.iiIIIliill;

         for (long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < 60; var12 += 4294967296L) {
            double var8 = (var3 + var5) * 0.5;
            if (this.IlIillIiilIi(var8) <= distance) {
               var3 = var8;
            } else {
               var5 = var8;
            }
         }

         return var3;
      }
   }

   private float Iiilliiliiil(float remaining, float currentVelocity) {
      float var3 = remaining < 0.0F ? -1.0F : 1.0F;
      double var4 = (double)Math.abs(remaining);
      double var6 = (double)(currentVelocity * var3);
      if (var4 < 1.0E-6 && Math.abs(var6) < 1.0E-6) {
         return 0.0F;
      } else {
         double var8 = Math.min((double)this.iiIIIliill, Math.min(var6 + (double)this.IIlIIliill, this.IIIilIIiiIIi(var4)));
         if (var8 > var4) {
            var8 = var4;
         }

         if (var8 > 0.0 && var8 < 0.35F) {
            var8 = Math.min(0.35F, var4);
         }

         if (var8 < var6 - (double)this.IIlIIliill) {
            var8 = var6 - (double)this.IIlIIliill;
         }

         return (float)(var8 * (double)var3);
      }
   }

   public float iliIiiliiiii() {
      return this.iIlIIliill;
   }

   public void liiiIIllIl(float maxVelocityNow) {
      this.iiIIIliill = Math.max(1.0F, Math.min(30.0F, maxVelocityNow));
   }
}
