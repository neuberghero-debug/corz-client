package gg.corz;

import java.util.Random;

public final class lIlllIIliIlllIIl {
   private float IiiilillIl = 1.0F;
   private boolean IliilillIl;
   private float IIIIiillIl;
   private static volatile boolean iililillIl = false;
   private float liiilillIl;
   private static final int lIiilillIl = 8;
   private float iliilillIl;
   private float llIIiillIl;
   private static final float IIiilillIl = 0.1F;
   private float lIIIiillIl;
   private float lliilillIl;
   private static final float lililillIl = 15.0F;
   private final Random iIiilillIl;
   private float IlIIiillIl;
   private float ilIIiillIl;
   private float iIIIiillIl;
   private float iiiilillIl = 0.845F;
   public static final float IililillIl = 20.0F;

   public boolean IilliliilIIi() {
      return Math.abs(this.llIIiillIl) < 0.35F && Math.abs(this.ilIIiillIl) < 0.35F;
   }

   public float[] lIiiIiIlilli(float wantYaw, float curPitch, float curYaw, float unit, float wantPitch, float degPerSec) {
      long var18 = 7339751127573939679L;
      long var20 = -4776886258903251774L;
      long var22 = 8351814740501230006L;
      if (Float.isFinite(wantYaw) && Float.isFinite(curPitch) && Float.isFinite(curYaw) && Float.isFinite(unit)) {
         float var7 = Float.isFinite(wantPitch) ? Math.max(wantPitch, 1.0E-4F) : 1.0E-4F;
         float var8 = Float.isFinite(degPerSec) ? Math.max(0.0F, degPerSec) : 0.0F;
         unit = IIIllIIliIIl(unit);
         if (!this.IliilillIl || Math.hypot((double)IlIlllIlilIl(curYaw - this.lliilillIl), (double)(unit - this.iliilillIl)) > 20.0) {
            this.IiiilillIl = 0.85F + this.iIiilillIl.nextFloat() * 0.3F;
            this.liiilillIl = this.iIiilillIl.nextFloat() * 0.6F;
            this.iiiilillIl = 0.72F + this.iIiilillIl.nextFloat() * 0.25F;
            this.IIIIiillIl = 0.95F + this.iIiilillIl.nextFloat() * 0.05F;
         }

         this.IliilillIl = true;
         this.lliilillIl = curYaw;
         this.iliilillIl = unit;
         this.lIIIiillIl = Math.max(0.85F, Math.min(1.15F, this.lIIIiillIl + (this.iIiilillIl.nextFloat() - 0.5F) * 0.24F));
         float var9 = var8 * this.IiiilillIl * this.lIIIiillIl * this.IIIIiillIl;
         float var10 = var8 * this.IiiilillIl * this.lIIIiillIl * this.iiiilillIl;
         float var11 = IlIlllIlilIl(llIliillilIliill.IIIllIIliIIl(curYaw, var7, this.liiilillIl) - wantYaw);
         float var12 = unit - curPitch;
         if (Math.abs(var11) <= var7 * 0.5F) {
            this.iIIIiillIl = 0.0F;
            var18 ^= (0L ^ var18) & -1L << 32;
         } else {
            float var14 = iliIiiliiiii(this.iIIIiillIl + Math.copySign(llIliillilIliill.IilliliilIIi(Math.abs(var11), var9), var11));
            var18 ^= ((long)Math.round(var14 / var7) << 32 ^ var18) & -1L << 32;
            this.iIIIiillIl = var14 - (float)((int)(var18 >>> 32)) * var7;
         }

         if (Math.abs(var12) <= var7 * 0.5F) {
            this.IlIIiillIl = 0.0F;
            var18 ^= (0L ^ var18) & -1L >>> 32;
         } else {
            float var15 = iliIiiliiiii(this.IlIIiillIl + Math.copySign(llIliillilIliill.IilliliilIIi(Math.abs(var12), var10), var12));
            var18 ^= ((long)Math.round(var15 / var7) ^ var18) & -1L >>> 32;
            this.IlIIiillIl = var15 - (float)((int)var18) * var7;
         }

         if ((int)(var18 >>> 32) != 0) {
            var20 ^= ((long)Integer.signum((int)(var18 >>> 32)) << 32 ^ var20) & -1L << 32;
            var20 ^= ((long)Math.min(8, (int)Math.ceil((double)(0.2F / var7)) + 1) ^ var20) & -1L >>> 32;
            if ((float)(Math.abs((int)(var18 >>> 32)) + (int)var20) * var7 > 20.0F) {
               var20 ^= ((long)(-((int)(var20 >>> 32))) << 32 ^ var20) & -1L << 32;
            }

            for (long var30 = var22 ^ (0L ^ var22) & -1L << 32;
               (int)(var30 >>> 32) < 8 && (int)(var18 >>> 32) != 0 && llIliillilIliill.iliIiiliiiii(wantYaw + (float)((int)(var18 >>> 32)) * var7) < 0.1F;
               var30 += 4294967296L
            ) {
               var18 ^= ((long)((int)(var18 >>> 32) + (int)(var20 >>> 32)) << 32 ^ var18) & -1L << 32;
               this.iIIIiillIl -= (float)((int)(var20 >>> 32)) * var7;
            }
         }

         float var25 = (int)(var18 >>> 32) == 0 ? wantYaw : wantYaw + (float)((int)(var18 >>> 32)) * var7;
         float var16 = (int)var18 == 0 ? curPitch : IIIllIIliIIl(curPitch + (float)((int)var18) * var7);
         this.llIIiillIl = var25 - wantYaw;
         this.ilIIiillIl = var16 - curPitch;
         return new float[]{var25, var16};
      } else {
         this.llIIiillIl = 0.0F;
         this.ilIIiillIl = 0.0F;
         return new float[]{wantYaw, curPitch};
      }
   }

   private static float IIIllIIliIIl(float pitch) {
      return Math.max(-90.0F, Math.min(90.0F, pitch));
   }

   private static float iliIiiliiiii(float t) {
      float var1 = iililillIl ? 15.0F : 20.0F;
      return Math.abs(t) > var1 ? Math.copySign(var1, t) : t;
   }

   private static float IlIlllIlilIl(float x) {
      return (x % 360.0F + 540.0F) % 360.0F - 180.0F;
   }

   public static void IliIlllilIi(boolean on) {
      iililillIl = on;
   }

   public lIlllIIliIlllIIl(Random rnd) {
      this.IIIIiillIl = 0.975F;
      this.lIIIiillIl = 1.0F;
      this.iIiilillIl = rnd == null ? new Random() : rnd;
   }

   public void iIlIlllllill() {
      this.IliilillIl = false;
      this.iIIIiillIl = 0.0F;
      this.IlIIiillIl = 0.0F;
      this.llIIiillIl = 0.0F;
      this.ilIIiillIl = 0.0F;
   }

   public static float liiiIIllIl() {
      return iililillIl ? 15.0F : 20.0F;
   }
}
