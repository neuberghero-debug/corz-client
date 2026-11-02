package gg.corz;

import java.util.Arrays;
import net.minecraft.class_238;
import net.minecraft.class_243;

public final class lililIlliililIll {
   private double iIllIlilll;
   private double llllIlilll;
   private int IillIlilll;
   public static final double IliIIlilll = 0.9;
   public static final double lIiIIlilll = 0.4;
   public static final double iilIIlilll = 2.0;
   private boolean iiIlIlilll = true;
   private double IlllIlilll;
   private double lIilIlilll;
   public static final double IiiIIlilll = 0.06;
   private final boolean[] lillIlilll = new boolean[40];
   public static final int llIlIlilll = 2;
   private boolean illlIlilll;
   private class_243 liIlIlilll;
   private static final double IiIlIlilll = 1.0E-6;
   public static final int IlIlIlilll = 3;
   private int iillIlilll;
   private double iIilIlilll = 1.0;
   public static final double ilIlIlilll = 1.0E-5;
   private double IIllIlilll;
   private double lIllIlilll;
   public static final double IIiIIlilll = 0.6;
   private int IlilIlilll;
   public static final int liiIIlilll = 40;
   public static final double IIIlIlilll = 0.98;
   public static final double iIiIIlilll = 0.85;
   private int IIilIlilll;
   private boolean llilIlilll;
   public static final double lliIIlilll = 0.05;
   public static final double lIIlIlilll = 0.91;
   public static final double iiiIIlilll = 0.08;
   public static final double iliIIlilll = 0.6;
   public static final double iIIlIlilll = 0.03;

   public void Ililllililil() {
      this.liIlIlilll = null;
      this.iiIlIlilll = true;
      this.Iiilliiliiil();
      this.lIilIlilll = 0.0;
      this.iIilIlilll = 1.0;
   }

   public boolean IIillIiliIil() {
      return this.illlIlilll;
   }

   private class_243 IIlllIlliIll(double sigma) {
      double var3 = Math.hypot(this.IIllIlilll, this.lIllIlilll);
      double var5;
      double var7;
      if (var3 >= 0.03) {
         var5 = -this.lIllIlilll / var3;
         var7 = this.IIllIlilll / var3;
      } else {
         var5 = -this.iIilIlilll;
         var7 = this.lIilIlilll;
      }

      return new class_243(var5 * sigma, 0.0, var7 * sigma);
   }

   public iliiIIIiIiiiIIIi lIiiIiIlilli(class_238 knockback, int collider, class_243 ticks, liiillIiiiiillIi box) {
      return this.iliIiiliiiii(knockback, collider, ticks, box, null);
   }

   private double IiIlliIliiIl(int h, boolean knockedUp) {
      double var3 = Math.hypot(this.IIllIlilll, this.lIllIlilll);
      double var5 = Math.min(1.2, var3 * (double)h * (0.3 + 0.7 * Math.min(1.0, this.Iilllilliill() / 2.0)));
      return knockedUp ? Math.min(var5, 0.15) : var5;
   }

   public void IliIlllilIi(class_243 serverPos, boolean towardUs, class_243 onGround) {
      long var13 = -3576879431724030135L;
      if (onGround != null) {
         double var4 = Math.hypot(onGround.field_1352, onGround.field_1350);
         if (var4 > 1.0E-6) {
            this.lIilIlilll = onGround.field_1352 / var4;
            this.iIilIlilll = onGround.field_1350 / var4;
         }
      }

      if (serverPos != null && Double.isFinite(serverPos.field_1352) && Double.isFinite(serverPos.field_1351) && Double.isFinite(serverPos.field_1350)) {
         this.iiIlIlilll = towardUs;
         if (this.liIlIlilll == null) {
            this.liIlIlilll = serverPos;
            this.IlilIlilll = 0;
            this.llilIlilll = false;
         } else {
            double var15 = serverPos.field_1352 - this.liIlIlilll.field_1352;
            double var6 = serverPos.field_1351 - this.liIlIlilll.field_1351;
            double var8 = serverPos.field_1350 - this.liIlIlilll.field_1350;
            double var10 = var15 * var15 + var6 * var6 + var8 * var8;
            this.IlilIlilll++;
            if (!(var10 <= 1.0000000000000002E-10)) {
               var13 ^= ((long)(this.llilIlilll ? Math.min(this.IlilIlilll, 2) : this.IlilIlilll) << 32 ^ var13) & -1L << 32;
               this.liIlIlilll = serverPos;
               this.IlilIlilll = 0;
               this.llilIlilll = false;
               if (var10 > 4.0 * (double)((int)(var13 >>> 32)) * (double)((int)(var13 >>> 32))) {
                  this.Iiilliiliiil();
               } else {
                  this.liiiIIllIl(var15 / (double)((int)(var13 >>> 32)), var6 / (double)((int)(var13 >>> 32)), var8 / (double)((int)(var13 >>> 32)));
               }
            } else if (this.IlilIlilll < 3) {
               this.IilliliilIIi(false);
            } else {
               this.llilIlilll = true;
               this.liiiIIllIl(0.0, 0.0, 0.0);
            }
         }
      }
   }

   private void liiiIIllIl(double dz, double dx, double dy) {
      long var17 = -834916466214982692L;
      double var7 = this.iIlIlllllill(dz, dy) ? 0.85 : 0.6;
      this.IIllIlilll = var7 * dz + (1.0 - var7) * this.IIllIlilll;
      this.lIllIlilll = var7 * dy + (1.0 - var7) * this.lIllIlilll;
      this.iIllIlilll = dx;
      double var9 = Math.hypot(dz, dy);
      double var11 = Math.hypot(this.IlllIlilll, this.llllIlilll);
      this.illlIlilll = var9 < 0.9 * var11 && var11 > 0.05;
      var17 ^= (0L ^ var17) & -1L << 32;
      if (var9 > 0.06) {
         double var14 = this.lIilIlilll * dy - this.iIilIlilll * dz;
         var17 ^= ((long)(var14 > 1.0E-9 ? 1 : (var14 < -1.0E-9 ? -1 : 0)) ^ var17) & -1L >>> 32;
         if ((int)var17 != 0) {
            var17 ^= ((long)(this.IillIlilll != 0 && (int)var17 != this.IillIlilll ? 1 : 0) << 32 ^ var17) & -1L << 32;
            this.IillIlilll = (int)var17;
         }
      }

      this.IilliliilIIi((boolean)((int)(var17 >>> 32)));
      this.IlllIlilll = dz;
      this.llllIlilll = dy;
   }

   public double Iilllilliill() {
      return (double)this.IIilIlilll * 20.0 / 40.0;
   }

   public class_243 Illlllllilll() {
      return new class_243(this.IIllIlilll, this.iIllIlilll, this.lIllIlilll);
   }

   public iliiIIIiIiiiIIIi iliIiiliiiii(class_238 ticks, int box, class_243 cal, liiillIiiiiillIi knockback, IiIIIlliIIIl collider) {
      long var33 = -3193084107248002265L;
      long var35 = -1774405163273136234L;
      long var37 = -380821921673206229L;
      class_243 var6 = cal == null ? class_243.field_1353 : cal;
      var33 ^= ((long)Math.max(0, box) << 32 ^ var33) & -1L << 32;
      var33 ^= ((long)Math.min((int)(var33 >>> 32), 8) ^ var33) & -1L >>> 32;
      double var9 = this.IIllIlilll + var6.field_1352;
      double var11 = this.iIllIlilll + var6.field_1351;
      double var13 = this.lIllIlilll + var6.field_1350;
      var35 ^= ((long)(this.iiIlIlilll && !(var6.field_1351 > 0.0) ? 0 : 1) << 32 ^ var35) & -1L << 32;
      var35 ^= ((long)((int)(var35 >>> 32)) ^ var35) & -1L >>> 32;
      class_238 var17 = ticks;
      var37 ^= (0L ^ var37) & -1L << 32;

      while ((int)(var37 >>> 32) < (int)var33) {
         class_243 var19 = new class_243(var9, var11, var13);
         class_243 var20 = knockback == null ? var19 : knockback.IliIlllilIi(var17, var19);
         if (var20 == null) {
            var20 = var19;
         }

         var17 = var17.method_997(var20);
         var37 ^= ((long)(Math.abs(var20.field_1351 - var19.field_1351) > 1.0E-6 ? 1 : 0) ^ var37) & -1L >>> 32;
         if (Math.abs(var20.field_1352 - var19.field_1352) > 1.0E-6) {
            var9 = 0.0;
         }

         if (Math.abs(var20.field_1350 - var19.field_1350) > 1.0E-6) {
            var13 = 0.0;
         }

         if ((int)var37 != 0) {
            if (var19.field_1351 < 0.0) {
               var35 ^= (0L ^ var35) & -1L >>> 32;
            }

            var11 = 0.0;
         } else if (var20.field_1351 < -1.0E-6) {
            var35 ^= (1L ^ var35) & -1L >>> 32;
         }

         var11 = (var11 - 0.08) * 0.98;
         if ((int)var35 != 0) {
            var9 *= 0.91;
            var13 *= 0.91;
         } else if (this.illlIlilll) {
            var9 *= 0.6;
            var13 *= 0.6;
         }

         var37 += 4294967296L;
      }

      if (collider != null && (int)(var35 >>> 32) == 0 && (int)var33 > 0) {
         double var18 = (ticks.field_1323 + ticks.field_1320) * 0.5;
         double var40 = (ticks.field_1321 + ticks.field_1324) * 0.5;
         double var22 = (var17.field_1323 + var17.field_1320) * 0.5;
         double var24 = (var17.field_1321 + var17.field_1324) * 0.5;
         double var26 = var22 - var18;
         double var28 = var24 - var40;
         double[] var30 = collider.Iilllilliill(var26, var28, this.IIllIlilll, this.lIllIlilll, (int)(var33 >>> 32));
         if (var30 != null && var30.length >= 2 && Double.isFinite(var30[0]) && Double.isFinite(var30[1])) {
            class_243 var31 = new class_243(var30[0] - var26, 0.0, var30[1] - var28);
            class_243 var32 = knockback == null ? var31 : knockback.IliIlllilIi(var17, var31);
            if (var32 != null) {
               var17 = var17.method_989(var32.field_1352, 0.0, var32.field_1350);
            }
         }
      }

      double var39 = this.IiIlliIliiIl((int)(var33 >>> 32), var6.field_1351 > 0.0);
      class_243 var41 = new class_243((var17.field_1323 + var17.field_1320) * 0.5, var17.field_1322, (var17.field_1321 + var17.field_1324) * 0.5);
      return new iliiIIIiIiiiIIIi(var41, var17, new class_243(var9, var11, var13), (boolean)((int)var35), var39, this.IIlllIlliIll(var39));
   }

   private boolean iIlIlllllill(double dx, double dz) {
      return Math.hypot(dx, dz) > 0.06 && Math.hypot(this.IIllIlilll, this.lIllIlilll) > 0.06 && dx * this.IIllIlilll + dz * this.lIllIlilll < 0.0;
   }

   private void IilliliilIIi(boolean reversal) {
      if (this.lillIlilll[this.iillIlilll]) {
         this.IIilIlilll--;
      }

      this.lillIlilll[this.iillIlilll] = reversal;
      if (reversal) {
         this.IIilIlilll++;
      }

      this.iillIlilll = (this.iillIlilll + 1) % 40;
   }

   private void Iiilliiliiil() {
      this.IIllIlilll = 0.0;
      this.lIllIlilll = 0.0;
      this.iIllIlilll = 0.0;
      this.IlllIlilll = 0.0;
      this.llllIlilll = 0.0;
      this.illlIlilll = false;
      this.IillIlilll = 0;
      Arrays.fill(this.lillIlilll, false);
      this.IIilIlilll = 0;
      this.iillIlilll = 0;
      this.IlilIlilll = 0;
      this.llilIlilll = false;
   }

   public class_243 IlIlllIlilIl(int ticks) {
      return this.IIlllIlliIll(this.IIIllIIliIIl(ticks));
   }

   public double IIIllIIliIIl(int ticks) {
      return this.IiIlliIliiIl(Math.max(0, ticks), false);
   }
}
