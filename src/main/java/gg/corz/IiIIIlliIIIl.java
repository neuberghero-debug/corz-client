package gg.corz;

import java.util.Arrays;

public final class IiIIIlliIIIl {
   private final double[] IiiIiiIlliiIiiIl;
   public static final int[] IIiIiiIllIiIiiIl = new int[]{2, 4, 6};
   private double iiiIiiIlIIIliiIl;
   private static final int[] iIiIiiIlIliIiiIl = new int[]{2, 4, 6};
   private double lIIliiIliIIliiIl;
   private int liIliiIliiIliiIl;
   private double IlIliiIlllIliiIl;
   private final double[] lliIiiIliliIiiIl = new double[iIiIiiIlIliIiiIl.length];
   private double ilIliiIlIiIliiIl;

   public double lIiiIiIlilli() {
      return this.iiiIiiIlIIIliiIl;
   }

   public double iIlIlllllill(int horizon) {
      return IIlilIliiIli(this.IiiIiiIlliiIiiIl, horizon) * this.IlIillIiilIi();
   }

   static double IIiilIiiiIii(double hi, double lo, double v) {
      return hi < lo ? lo : (hi > v ? v : hi);
   }

   public void IIlllIlliIll(double accelToward) {
      if (Double.isFinite(accelToward) && !(Math.abs(accelToward) > 0.05)) {
         this.ilIliiIlIiIliiIl = IIiilIiiiIii(this.ilIliiIlIiIliiIl + 0.1 * (accelToward - this.ilIliiIlIiIliiIl), -0.026, 0.026);
      }
   }

   static double Iliilliiilii(double hi, double fallback, double lo, double v) {
      return Double.isNaN(hi) ? v : IIiilIiiiIii(hi, fallback, lo);
   }

   private static int IiIiliIiiiIi(int horizon) {
      long var2 = 1295426000187172157L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < iIiIiiIlIliIiiIl.length; var4 += 4294967296L) {
         if (iIiIiiIlIliIiiIl[(int)(var4 >>> 32)] == horizon) {
            return (int)(var4 >>> 32);
         }
      }

      return -1;
   }

   public int IIillIiliIil() {
      return this.liIliiIliiIliiIl;
   }

   private static double Illillliilli(double hi, double lo, double current, double predicted, double observed, double alpha) {
      if (Double.isFinite(lo) && Double.isFinite(current) && !(lo <= 0.2)) {
         double var12 = IIiilIiiiIii(Math.max(0.0, current) / lo, observed, alpha);
         return IIiilIiiiIii(hi + predicted * (var12 - hi), observed, alpha);
      } else {
         return hi;
      }
   }

   public double[] Iilllilliill(double vx, double dx, double vz, double horizon, int dz) {
      double var10 = this.iiiIiiIlIIIliiIl;
      double var12 = Math.sqrt(vz * vz + horizon * horizon);
      if (Double.isFinite(var12) && !(var12 < 0.03)) {
         double var14 = vz / var12;
         double var16 = horizon / var12;
         double var18 = -var16;
         double var22 = this.liiiIIllIl(dz);
         double var24 = this.iIlIlllllill(dz);
         return new double[]{vx * var10 + var14 * var22 + var18 * var24, dx * var10 + var16 * var22 + var14 * var24};
      } else {
         return new double[]{vx * var10, dx * var10};
      }
   }

   public void iliIiiliiiii(double predicted, double observed) {
      this.lIIliiIliIIliiIl = Illillliilli(this.lIIliiIliIIliiIl, predicted, observed, 0.2, 0.6, 1.3);
   }

   public double IIIllIIliIIl() {
      return this.lIIliiIliIIliiIl;
   }

   private double IlIillIiilIi() {
      return Math.min(1.0, (double)this.liIliiIliiIliiIl / 20.0);
   }

   private static double IIlilIliiIli(double[] h, int k) {
      long var5 = 3057179601579012132L;
      if (k <= 0) {
         return 0.0;
      } else if (k < iIiIiiIlIliIiiIl[0]) {
         return h[0] * (double)k / (double)iIiIiiIlIliIiiIl[0];
      } else {
         for (long var7 = var5 ^ (4294967296L ^ var5) & -1L << 32; (int)(var7 >>> 32) < iIiIiiIlIliIiiIl.length; var7 += 4294967296L) {
            if (k <= iIiIiiIlIliIiiIl[(int)(var7 >>> 32)]) {
               double var3 = (double)(k - iIiIiiIlIliIiiIl[(int)(var7 >>> 32) - 1])
                  / (double)(iIiIiiIlIliIiiIl[(int)(var7 >>> 32)] - iIiIiiIlIliIiiIl[(int)(var7 >>> 32) - 1]);
               return h[(int)(var7 >>> 32) - 1] + (h[(int)(var7 >>> 32)] - h[(int)(var7 >>> 32) - 1]) * var3;
            }
         }

         return h[iIiIiiIlIliIiiIl.length - 1];
      }
   }

   public double liiiIIllIl(int horizon) {
      return IIlilIliiIli(this.lliIiiIliliIiiIl, horizon) * this.IlIillIiilIi();
   }

   public void IIIilIIiiIIi() {
      Arrays.fill(this.lliIiiIliliIiiIl, 0.0);
      Arrays.fill(this.IiiIiiIlliiIiiIl, 0.0);
      this.iiiIiiIlIIIliiIl = 1.0;
      this.lIIliiIliIIliiIl = 1.0;
      this.IlIliiIlllIliiIl = 1.0;
      this.ilIliiIlIiIliiIl = 0.0;
      this.liIliiIliiIliiIl = 0;
   }

   public double Illlllllilll() {
      return this.ilIliiIlIiIliiIl;
   }

   public void IilliliilIIi(double observed, double predicted) {
      this.iiiIiiIlIIIliiIl = Illillliilli(this.iiiIiiIlIIIliiIl, observed, predicted, 0.15, 0.6, 1.2);
   }

   public IiIIIlliIIIl() {
      this.IiiIiiIlliiIiiIl = new double[iIiIiiIlIliIiiIl.length];
      this.iiiIiiIlIIIliiIl = 1.0;
      this.lIIliiIliIIliiIl = 1.0;
      this.IlIliiIlllIliiIl = 1.0;
      this.ilIliiIlIiIliiIl = 0.0;
      this.liIliiIliiIliiIl = 0;
   }

   public void Iiilliiliiil(iilIlIilIIiIlIil s) {
      long var3 = 1250899428778142135L;
      this.IIIilIIiiIIi();
      if (s != null) {
         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < iIiIiiIlIliIiiIl.length; var5 += 4294967296L) {
            this.lliIiiIliliIiiIl[(int)(var5 >>> 32)] = Iliilliiilii(Iilililiiili(s.IliIlllilIi(), (int)(var5 >>> 32)), -0.6, 0.6, 0.0);
            this.IiiIiiIlliiIiiIl[(int)(var5 >>> 32)] = Iliilliiilii(Iilililiiili(s.liiiIIllIl(), (int)(var5 >>> 32)), -0.6, 0.6, 0.0);
         }

         this.iiiIiiIlIIIliiIl = Iliilliiilii(s.iIlIlllllill(), 0.6, 1.2, 1.0);
         this.lIIliiIliIIliiIl = Iliilliiilii(s.IilliliilIIi(), 0.6, 1.3, 1.0);
         this.IlIliiIlllIliiIl = Iliilliiilii(s.lIiiIiIlilli(), 0.8, 1.2, 1.0);
         this.ilIliiIlIiIliiIl = Iliilliiilii(s.iliIiiliiiii(), -0.026, 0.026, 0.0);
         this.liIliiIliiIliiIl = Math.max(0, Math.min(1000000, s.IIIllIIliIIl()));
      }
   }

   public iilIlIilIIiIlIil Ililllililil() {
      return new iilIlIilIIiIlIil(
         (double[])this.lliIiiIliliIiiIl.clone(),
         (double[])this.IiiIiiIlliiIiiIl.clone(),
         this.iiiIiiIlIIIliiIl,
         this.lIIliiIliIIliiIl,
         this.IlIliiIlllIliiIl,
         this.ilIliiIlIiIliiIl,
         this.liIliiIliiIliiIl
      );
   }

   public double IiIlliIliiIl() {
      return this.IlIliiIlllIliiIl;
   }

   public void IlIlllIlilIl(double observed, double predicted) {
      this.IlIliiIlllIliiIl = Illillliilli(this.IlIliiIlllIliiIl, observed, predicted, 0.2, 0.8, 1.2);
   }

   public void IliIlllilIi(int alongObs, double lateralObs, double horizon) {
      long var7 = 8280108494308725606L;
      var7 ^= ((long)IiIiliIiiiIi(alongObs) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) >= 0 && Double.isFinite(lateralObs) && Double.isFinite(horizon)) {
         if (!(Math.abs(lateralObs) > 2.0) && !(Math.abs(horizon) > 2.0)) {
            this.lliIiiIliliIiiIl[(int)(var7 >>> 32)] = IIiilIiiiIii(
               this.lliIiiIliliIiiIl[(int)(var7 >>> 32)] + 0.1 * (lateralObs - this.lliIiiIliliIiiIl[(int)(var7 >>> 32)]), -0.6, 0.6
            );
            this.IiiIiiIlliiIiiIl[(int)(var7 >>> 32)] = IIiilIiiiIii(
               this.IiiIiiIlliiIiiIl[(int)(var7 >>> 32)] + 0.1 * (horizon - this.IiiIiiIlliiIiiIl[(int)(var7 >>> 32)]), -0.6, 0.6
            );
            if (this.liIliiIliiIliiIl < 1000000) {
               this.liIliiIliiIliiIl++;
            }
         }
      }
   }

   private static double Iilililiiili(double[] a, int i) {
      return a != null && i < a.length ? a[i] : 0.0;
   }
}
