package gg.corz;

import java.util.Random;

public final class iiIIIlIIlIIl {
   private double IliliiIllliliiIl;
   private int iiIiiiIlIIliiiIl;
   public static final double IIlliiIllIlliiIl = 1.7;
   private int liliiiIliiliiiIl;
   private double IiIiiiIlliIiiiIl;
   private int iiiiiiIlIIIIIIll;
   private double lIiliiIliIiliiIl;
   static final double IilliiIllilliiIl = 10.0;
   private double iIIiiiIlIlIiiiIl;
   private int IiiiiiIlliiiiiIl;
   private int illiiiIlIiliiiIl;
   private double lliiiiIliliiiiIl;
   private double ililiiIlIiiliiIl;
   private final Random iilliiIlIIiliiIl;
   private double llIiiiIlilIiiiIl;
   private double liiliiIliiiliiIl;
   public static final int iIlliiIlIllliiIl = 10;
   private double IIIiiiIllIIiiiIl;
   private int lIIIIIlliIIIIIll;
   private boolean iIiiiiIlIliiiiIl;
   private int IlliiiIlllliiiIl;
   private boolean IIiiiiIllIiiiiIl;
   static final int lllliiIlillliiIl = 10;
   private int lIliiiIliIliiiIl;

   public liIiiiIiiiIiiiIi IilliliilIIi() {
      long var4 = -5176129764985725320L;
      long var6 = -8736070393106590958L;
      this.lIiliiIliIiliiIl = this.lIiliiIliIiliiIl + (double)this.iiIiiiIlIIliiiIl;
      var4 ^= ((long)liIiiiIiiiIiiiIi.liiiIIllIl(this.lIIIIIlliIIIIIll, this.lIliiiIliIliiiIl, 10) << 32 ^ var4) & -1L << 32;
      this.lIIIIIlliIIIIIll += (int)(var4 >>> 32);
      this.IliliiIllliliiIl += (double)((int)(var4 >>> 32));
      this.iiIiiiIlIIliiiIl = 0;
      this.lIliiiIliIliiiIl = 0;
      var4 ^= ((long)((int)this.lIiliiIliIiliiIl) ^ var4) & -1L >>> 32;
      var6 ^= ((long)((int)this.IliliiIllliliiIl) << 32 ^ var6) & -1L << 32;
      this.lIiliiIliIiliiIl -= (double)((int)var4);
      this.IliliiIllliliiIl -= (double)((int)(var6 >>> 32));
      return (int)var4 == 0 && (int)(var6 >>> 32) == 0 ? liIiiiIiiiIiiiIi.ilIIiIIlIi : new liIiiiIiiiIiiiIi((int)var4, (int)(var6 >>> 32));
   }

   public iiIIIlIIlIIl(Random rnd) {
      this.iilliiIlIIiliiIl = rnd;
   }

   private void IIIllIIliIIl(double crossAngle, double speedSetting, double adj) {
      long var10 = -5757956063042347606L;
      if (crossAngle == 0.0) {
         this.lIiliiIliIiliiIl = 0.0;
      } else {
         double var7 = adj;
         var10 ^= ((long)((int)Math.abs(speedSetting)) << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) <= 10) {
            this.llIiiiIlilIiiiIl = adj;
         }

         if (this.llIiiiIlilIiiiIl > 0.0) {
            var7 = adj - this.llIiiiIlilIiiiIl / 3.0;
            this.llIiiiIlilIiiiIl -= (double)((int)(var10 >>> 32)) / 200.0;
         }

         this.lIiliiIliIiliiIl += var7 * crossAngle * 5.0;
      }
   }

   private void iliIiiliiiii() {
      long var3 = 8010841951732201607L;
      this.liliiiIliiliiiIl++;
      if (this.liliiiIliiliiiIl >= 250 + this.iilliiIlIIiliiIl.nextInt(50)) {
         this.liliiiIliiliiiIl = -100 + this.iilliiIlIIiliiIl.nextInt(50);
         this.IlliiiIlllliiiIl = this.iilliiIlIIiliiIl.nextInt(3) - 1;
         this.illiiiIlIiliiiIl = this.iilliiIlIIiliiIl.nextInt(3) - 1;
      }

      var3 ^= ((long)this.IlliiiIlllliiiIl << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)this.illiiiIlIiliiiIl ^ var3) & -1L >>> 32;
      if (this.iilliiIlIIiliiIl.nextInt(10) < 2) {
         var3 ^= (0L ^ var3) & -1L << 32;
      }

      if (this.iilliiIlIIiliiIl.nextInt(10) < 2) {
         var3 ^= (0L ^ var3) & -1L >>> 32;
      }

      if (this.liliiiIliiliiiIl < 0) {
         var3 ^= (0L ^ var3) & -1L << 32;
         var3 ^= (0L ^ var3) & -1L >>> 32;
      }

      if (this.iilliiIlIIiliiIl.nextInt(20) == 1) {
         this.iiIiiiIlIIliiiIl += (int)(var3 >>> 32);
         this.lIliiiIliIliiiIl += (int)var3;
      }

      if (this.lIiliiIliIiliiIl > 0.0 && this.iiIiiiIlIIliiiIl < 0 || this.lIiliiIliIiliiIl < 0.0 && this.iiIiiiIlIIliiiIl > 0) {
         this.iiIiiiIlIIliiiIl = 0;
      }
   }

   public void IliIlllilIi() {
      this.lIiliiIliIiliiIl = 0.0;
      this.IliliiIllliliiIl = 0.0;
      this.IlliiiIlllliiiIl = 0;
      this.illiiiIlIiliiiIl = 0;
      this.iiIiiiIlIIliiiIl = 0;
      this.lIliiiIliIliiiIl = 0;
   }

   private void lIiiIiIlilli() {
      if (++this.IiiiiiIlliiiiiIl > 10) {
         this.iIIiiiIlIlIiiiIl = this.IIIiiiIllIIiiiIl;
         this.ililiiIlIiiliiIl = this.liiliiIliiiliiIl;
         this.liiliiIliiiliiIl = 0.0;
         this.IIIiiiIllIIiiiIl = 0.0;
         this.IiiiiiIlliiiiiIl = 0;
      }
   }

   public void liiiIIllIl() {
      this.IliIlllilIi();
      this.ililiiIlIiiliiIl = 0.0;
      this.liiliiIliiiliiIl = 0.0;
      this.IIIiiiIllIIiiiIl = 0.0;
      this.iIIiiiIlIlIiiiIl = 0.0;
      this.llIiiiIlilIiiiIl = 0.0;
      this.IiIiiiIlliIiiiIl = 0.0;
      this.liliiiIliiliiiIl = 0;
      this.IIiiiiIllIiiiiIl = false;
      this.iIiiiiIlIliiiiIl = false;
      this.lliiiiIliliiiiIl = 0.0;
      this.IiiiiiIlliiiiiIl = 0;
      this.iiiiiiIlIIIIIIll = 0;
      this.lIIIIIlliIIIIIll = 0;
   }

   public void iIlIlllllill(
      double strafeIncrease,
      double verticalSpeed,
      double aimVertically,
      double crossAngle,
      double yawError,
      double distance,
      double pitchError,
      boolean strafe,
      boolean horizontalSpeed
   ) {
      long var38 = -5562876353007178699L;
      long var40 = 1842666746369609268L;
      this.lIiiIiIlilli();
      this.iliIiiliiiii();
      double var17 = Math.min(180.0, Math.abs(strafeIncrease));
      var38 ^= ((long)(strafeIncrease < 0.0 ? 1 : 0) << 32 ^ var38) & -1L << 32;
      var38 ^= ((long)(aimVertically > 0.0 ? 1 : 0) ^ var38) & -1L >>> 32;
      double var21 = Math.abs(aimVertically);
      double var23 = var21 - 10.0;
      double var25 = 1.0 + this.iilliiIlIIiliiIl.nextDouble() * 2.0 + var17 / 50.0;
      double var27 = 1.0 + this.iilliiIlIIiliiIl.nextDouble() * 2.0 + Math.abs(var23) / 50.0;
      if (Math.abs(var17 - this.lliiiiIliliiiiIl) > 6.0) {
         var25 += var17 / 35.0;
      }

      var25 += Math.max(0.0, (9.0 - crossAngle) / 2.5 - 2.0);
      var40 ^= ((long)((int)(var38 >>> 32) != 0 ? (yawError < 0.0 ? 1 : 0) : (yawError > 0.0 ? 1 : 0)) << 32 ^ var40) & -1L << 32;
      if (horizontalSpeed && (int)(var40 >>> 32) != 0) {
         var25 *= 1.6;
      }

      if (crossAngle < 0.5) {
         var25 /= 5.0;
      }

      double var30 = var25 / 90.0 * ((int)(var38 >>> 32) != 0 ? -1.0 : 1.0);
      double var32 = var27 / 90.0 * ((int)var38 != 0 ? 1.0 : -1.0);
      if (var17 < 5.0) {
         var30 = 0.0;
         this.ililiiIlIiiliiIl *= 0.7;
         if ((int)(var38 >>> 32) != 0 ? yawError > 0.0 : yawError < 0.0) {
            this.ililiiIlIiiliiIl *= 0.5;
         }
      }

      if ((int)(var38 >>> 32) != this.IIiiiiIllIiiiiIl) {
         this.ililiiIlIiiliiIl = -this.ililiiIlIiiliiIl;
         this.liiliiIliiiliiIl = -this.liiliiIliiiliiIl;
         this.lIiliiIliIiliiIl = 0.0;
      }

      if ((int)var38 != this.iIiiiiIlIliiiiIl) {
         this.iIIiiiIlIlIiiiIl = -this.iIIiiiIlIlIiiiIl;
         this.IIIiiiIllIIiiiIl = -this.IIIiiiIllIIiiiIl;
         this.IliliiIllliliiIl = 0.0;
      }

      if (var23 < 5.0) {
         var32 = 0.0;
         this.iIIiiiIlIlIiiiIl *= 0.7;
      }

      this.liiliiIliiiliiIl += var30;
      this.IIIiiiIllIIiiiIl += var32;
      if (Math.abs(this.ililiiIlIiiliiIl) > 10.0) {
         this.liiliiIliiiliiIl = 0.0;
         this.ililiiIlIiiliiIl = 0.0;
      } else {
         double var34 = this.ililiiIlIiiliiIl * 0.15;
         if (var17 <= 9.0) {
            var34 /= 10.0 - var17;
         }

         if (!Double.isFinite(var34)) {
            this.ililiiIlIiiliiIl = 0.0;
            this.liiliiIliiiliiIl = 0.0;
            this.lIiliiIliIiliiIl = 0.0;
         } else {
            this.IIIllIIliIIl(var34, verticalSpeed, distance);
            if (strafe) {
               double var36 = this.iIIiiiIlIlIiiiIl * 0.15;
               if (!Double.isFinite(var36)) {
                  this.IIIiiiIllIIiiiIl = 0.0;
                  this.iIIiiiIlIlIiiiIl = 0.0;
                  this.IliliiIllliliiIl = 0.0;
                  return;
               }

               this.IlIlllIlilIl(var36, var21, pitchError);
            }

            this.iIiiiiIlIliiiiIl = (boolean)((int)var38);
            this.IIiiiiIllIiiiiIl = (boolean)((int)(var38 >>> 32));
            if (++this.iiiiiiIlIIIIIIll > 10) {
               this.lliiiiIliliiiiIl = var17;
               this.iiiiiiIlIIIIIIll = 0;
            }
         }
      }
   }

   private void IlIlllIlilIl(double speedSetting, double angleAbs, double adj) {
      long var10 = 211599672080479764L;
      if (speedSetting == 0.0) {
         this.IliliiIllliliiIl = 0.0;
      } else {
         double var7 = adj;
         var10 ^= ((long)((int)angleAbs) << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) <= 10) {
            this.IiIiiiIlliIiiiIl = adj;
         }

         if (this.IiIiiiIlliIiiiIl > 0.0) {
            var7 = adj - this.IiIiiiIlliIiiiIl / 3.0;
            this.IiIiiiIlliIiiiIl -= (double)((int)(var10 >>> 32)) / 200.0;
         }

         this.IliliiIllliliiIl += var7 * speedSetting * 5.0;
      }
   }
}
