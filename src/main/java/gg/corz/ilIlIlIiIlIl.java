package gg.corz;

import java.util.Random;

public final class ilIlIlIiIlIl {
   private long iliIiIllIiiIiIll;
   private double lIillIlliIillIll;
   static final long IiiIlIllliiIlIll = 1000000L;
   public static final double iIiIlIllIliIlIll = 0.008333333333333333;
   private double IilllIlllilllIll;
   private double lllllIllillllIll;
   private double liIIiIlliiIIiIll;
   private boolean lIIIiIlliIIIiIll;
   private double IiIilIllliIilIll;
   private double IIIilIlllIIilIll;
   private double lliilIlliliilIll;
   private double IliIiIlllliIiIll;
   private boolean iIlIiIllIllIiIll;
   private double liIllIlliiIllIll;
   private double ilillIllIiillIll;
   private boolean ilIIiIllIiIIiIll;
   private double iiiilIllIIIIiIll;
   private double ilIllIllIiIllIll;
   private double illilIllIililIll;
   private double lIIllIlliIIllIll;
   private double lililIlliililIll;
   private boolean iIIilIllIlIilIll;
   private double lIiIiIlliIiIiIll;
   private double iilIiIllIIiIiIll;
   private double IllilIlllllilIll;
   private double liillIlliiillIll;
   private double IIlllIlllIlllIll;
   private int IIIliIlllIIliIll;
   private double IIiilIlllIiilIll;
   private final Random iiiIlIllIIIllIll;
   private double iIlllIllIllllIll;
   private double iIiilIllIliilIll;
   static final double lliIlIlliliIlIll = 0.016666666666666666;
   private double IiiilIllliiilIll;
   private long lllIiIllillIiIll;
   private double lIlilIlliIlilIll;
   private double iilllIllIIillIll;
   private double iiIilIllIIlilIll;
   private double IilIiIlllilIiIll;
   private double IlIllIllllIllIll;
   private boolean liiIiIlliiiIiIll;
   private double IIlIiIlllIlIiIll;
   private boolean llIilIllilIilIll;
   private double IlillIllllillIll;
   private double IlIIiIllllIIiIll;

   public void liiiIIllIl(lliIliiliIli horizontalSpeed, double strafeIncrease, double aimVertically, boolean f, boolean unit, double verticalSpeed) {
      long var158 = -6666346414413769137L;
      double var10 = this.iIIilIllIlIilIll ? 0.008333333333333333 : 0.016666666666666666;
      this.iliIiIllIiiIiIll += 1000000L;
      this.liiIiIlliiiIiIll = f;
      this.lIiiIiIlilli(horizontalSpeed, var10);
      double var12 = Math.min(0.85, this.IIlIiIlllIlIiIll);
      double var14 = 0.1 + var12;
      double var16 = lliillililiillil.lIiiIiIlilli(var12 / 0.55, 0.0, 1.0);
      double var18 = horizontalSpeed.IIIllIIliIIl() + 0.01;
      double var20 = Math.max(var18, horizontalSpeed.IlIlllIlilIl() - 0.01);
      double var22 = horizontalSpeed.IIIllIIliIIl() + 0.65 * (horizontalSpeed.IlIlllIlilIl() - horizontalSpeed.IIIllIIliIIl());
      double var24 = lliillililiillil.lIiiIiIlilli(horizontalSpeed.liiiIIllIl() - var14, var18, var20);
      double var26 = horizontalSpeed.lIiiIiIlilli();
      double var28 = lliillililiillil.lIiiIiIlilli(var24 + (var22 - var24) * var16, var18, var20);
      double var30 = horizontalSpeed.iliIiiliiiii();
      double var32 = horizontalSpeed.IiIlliIliiIl() - horizontalSpeed.Iilllilliill();
      double var34 = horizontalSpeed.IIlllIlliIll() - horizontalSpeed.IIillIiliIil();
      double var36 = horizontalSpeed.Illlllllilll() - horizontalSpeed.Ililllililil();
      double var38 = horizontalSpeed.IIlllIlliIll() + var34 * 0.1;
      if (!this.llIilIllilIilIll) {
         this.IiIilIllliIilIll = var26;
         this.iiIilIllIIlilIll = var28;
         this.lIlilIlliIlilIll = var30;
         this.IllilIlllllilIll = var38;
         this.llIilIllilIilIll = true;
      }

      double var40 = Math.hypot(horizontalSpeed.IiIlliIliiIl(), horizontalSpeed.Illlllllilll());
      double var42 = Math.hypot(var32, var36);
      double var44 = horizontalSpeed.Iiilliiliiil();
      double var46 = lliillililiillil.lIiiIiIlilli(0.28 + Math.min(0.35, var42 * 0.5), 0.08, 0.75);
      double var48 = lliillililiillil.lIiiIiIlilli(0.18 + Math.min(0.42, (var40 + 0.25 * var42) * 0.72), 0.12, 0.68);
      double var50 = lliillililiillil.lIiiIiIlilli(var10 * 60.0, 0.45, 2.4);
      double var52 = 1.0 - Math.pow(1.0 - var46, var50);
      double var54 = 1.0 - Math.pow(1.0 - var48, var50);
      this.IiIilIllliIilIll = this.IiIilIllliIilIll + (var26 - this.IiIilIllliIilIll) * var52;
      this.iiIilIllIIlilIll = this.iiIilIllIIlilIll + (var28 - this.iiIilIllIIlilIll) * var52;
      this.lIlilIlliIlilIll = this.lIlilIlliIlilIll + (var30 - this.lIlilIlliIlilIll) * var52;
      this.IllilIlllllilIll = this.IllilIlllllilIll + (var38 - this.IllilIlllllilIll) * var54;
      if (Math.hypot(var26 - this.IiIilIllliIilIll, var30 - this.lIlilIlliIlilIll) > 0.3 + 1.3 * var40 + 0.4 * var42) {
         this.IiIilIllliIilIll = var26;
         this.iiIilIllIIlilIll = var28;
         this.lIlilIlliIlilIll = var30;
         this.IllilIlllllilIll = var38;
      }

      double var56 = lliillililiillil.lIiiIiIlilli(0.35 + 0.045 * var44 + 0.95 * var40 + Math.min(0.18, 0.12 * var42), 0.1, 1.05);
      var56 *= 0.3 + 0.7 * lliillililiillil.lIiiIiIlilli((var44 - 0.8) / 2.5, 0.0, 1.0);
      var56 = Math.max(0.05, var56);
      double var58 = this.iiIilIllIIlilIll - horizontalSpeed.liiiIIllIl();
      double var60 = this.IllilIlllllilIll
         * Math.min(var56, 0.7 + 0.04 * var44)
         * (0.28 + 0.52 * lliillililiillil.lIiiIiIlilli(Math.abs(var58) / 0.7, 0.0, 1.0));
      double var62 = 0.16 + 0.055 * var44;
      var60 = lliillililiillil.lIiiIiIlilli(var60, -var62, var62);
      double var64 = this.IiIilIllliIilIll - horizontalSpeed.IliIlllilIi();
      double var66 = this.iiIilIllIIlilIll + var60 - horizontalSpeed.liiiIIllIl();
      double var68 = this.lIlilIlliIlilIll - horizontalSpeed.iIlIlllllill();
      double var70 = Math.toDegrees(Math.atan2(var68, var64)) - 90.0;
      double var72 = -Math.toDegrees(Math.atan2(var66, Math.max(Math.hypot(var64, var68), 1.0E-4)));
      if (this.iIIilIllIlIilIll) {
         double var74 = Math.abs(lliillililiillil.IliIlllilIi(var70 - this.iilllIllIIillIll));
         double var76 = Math.abs(lliillililiillil.IliIlllilIi(var72 - this.lIillIlliIillIll));
         double var78 = lliillililiillil.lIiiIiIlilli((Math.max(var74, var76) - 12.0) / 50.0, 0.0, 1.0);
         this.IiiilIllliiilIll = Math.max(this.IiiilIllliiilIll, var78);
         if (var78 > 0.3) {
            this.illilIllIililIll *= 0.3;
            this.IiIilIllliIilIll = var26;
            this.iiIilIllIIlilIll = var28;
            this.lIlilIlliIlilIll = var30;
         }

         double var80 = (120.0 + 700.0 * var42)
            * (1.0 + Math.min(2.0, var74 / 60.0))
            * (1.0 + 1.5 * lliillililiillil.IIIllIIliIIl(10.0, 35.0, Math.abs(lliillililiillil.IliIlllilIi(var70 - horizontalSpeed.IIIilIIiiIIi()))));
         double var82 = (95.0 + 550.0 * Math.abs(this.IllilIlllllilIll)) * (1.0 + Math.min(2.0, var76 / 60.0));
         var80 = lliillililiillil.lIiiIiIlilli(var80, 90.0, 1080.0);
         var82 = lliillililiillil.lIiiIiIlilli(var82, 70.0, 500.0);
         var70 = this.iilllIllIIillIll
            + lliillililiillil.lIiiIiIlilli(lliillililiillil.IliIlllilIi(var70 - this.iilllIllIIillIll), -var80 * var10, var80 * var10);
         var72 = this.lIillIlliIillIll
            + lliillililiillil.lIiiIiIlilli(lliillililiillil.IliIlllilIi(var72 - this.lIillIlliIillIll), -var82 * var10, var82 * var10);
      }

      this.IiiilIllliiilIll = this.IiiilIllliiilIll * Math.pow(0.02, var10);
      if (this.IiiilIllliiilIll < 0.01) {
         this.IiiilIllliiilIll = 0.0;
      }

      double var163 = 1.0 + 3.0 * this.IiiilIllliiilIll;
      double var164 = lliillililiillil.IliIlllilIi(var70 - horizontalSpeed.IIIilIIiiIIi());
      double var165 = f ? lliillililiillil.IliIlllilIi(var72 - horizontalSpeed.IlIillIiilIi()) : 0.0;
      double var167 = Math.sqrt(var164 * var164 + var165 * var165);
      double var169 = 1.0 - lliillililiillil.IIIllIIliIIl(1.5, 8.0, var167);
      if (this.iIIilIllIlIilIll) {
         var169 = lliillililiillil.lIiiIiIlilli(
            var169 + lliillililiillil.lIiiIiIlilli(-(Math.abs(var164) - Math.abs(this.lllllIllillllIll)) / var10 / 20.0, -0.3, 0.3), 0.0, 1.0
         );
      }

      double var84 = var169 > this.illilIllIililIll
         ? lliillililiillil.lIiiIiIlilli(var10 * 3.0, 0.01, 0.25)
         : lliillililiillil.lIiiIiIlilli(var10 * 20.0, 0.05, 0.8);
      this.illilIllIililIll = this.illilIllIililIll + (var169 - this.illilIllIililIll) * var84;
      double var86 = this.illilIllIililIll;
      double var88 = 0.0;
      double var90 = 0.0;
      double var92 = 0.0;
      double var94 = 0.0;
      if (this.iIIilIllIlIilIll) {
         double var96 = lliillililiillil.IliIlllilIi(var70 - this.iilllIllIIillIll) / var10;
         double var98 = lliillililiillil.IliIlllilIi(var72 - this.lIillIlliIillIll) / var10;
         var92 = lliillililiillil.IliIlllilIi(horizontalSpeed.IIIilIIiiIIi() - this.liillIlliiillIll) / var10;
         var94 = lliillililiillil.IliIlllilIi(horizontalSpeed.IlIillIiilIi() - this.IIIilIlllIIilIll) / var10;
         double var100 = lliillililiillil.lIiiIiIlilli(var10 * 12.0, 0.05, 0.45);
         this.IlillIllllillIll = this.IlillIllllillIll + (var96 - this.IlillIllllillIll) * var100;
         this.ilillIllIiillIll = this.ilillIllIiillIll + (var98 - this.ilillIllIiillIll) * var100;
         var88 = this.IlillIllllillIll;
         var90 = this.ilillIllIiillIll;
      }

      double var170 = strafeIncrease * 0.75;
      double var171 = aimVertically * 0.75;
      if (Math.signum(var164) != Math.signum(this.lllllIllillllIll) && Math.abs(var164) > 0.1 && Math.abs(this.lllllIllillllIll) > 0.1) {
         this.ilIllIllIiIllIll *= 0.3;
      }

      if (Math.signum(var165) != Math.signum(this.IilllIlllilllIll) && Math.abs(var165) > 0.1 && Math.abs(this.IilllIlllilllIll) > 0.1) {
         this.liIllIlliiIllIll *= 0.3;
      }

      this.ilIllIllIiIllIll += var164 * var10 * var86 * var86;
      this.liIllIlliiIllIll += var165 * var10 * var86 * var86;
      double var172 = 1.0 - (1.0 - var86) * lliillililiillil.lIiiIiIlilli(var10 * 5.0, 0.0, 0.5);
      this.ilIllIllIiIllIll = lliillililiillil.lIiiIiIlilli(this.ilIllIllIiIllIll * var172, -15.0, 15.0);
      this.liIllIlliiIllIll = lliillililiillil.lIiiIiIlilli(this.liIllIlliiIllIll * var172, -10.0, 10.0);
      this.IIlllIlllIlllIll = 0.85 * this.IIlllIlllIlllIll + 0.15 * (this.iIIilIllIlIilIll ? (var164 - this.lllllIllillllIll) / var10 : 0.0);
      this.iIlllIllIllllIll = 0.85 * this.iIlllIllIllllIll + 0.15 * (this.iIIilIllIlIilIll ? (var165 - this.IilllIlllilllIll) / var10 : 0.0);
      if (!f) {
         this.liIllIlliiIllIll = 0.0;
         this.iIlllIllIllllIll = 0.0;
      }

      double var102 = Math.signum(var164);
      double var104 = Math.signum(var165);
      this.lililIlliililIll = var102 != this.iIiilIllIliilIll && Math.abs(var164) > 0.5
         ? Math.min(this.lililIlliililIll + 1.0, 8.0)
         : Math.max(0.0, this.lililIlliililIll - 3.0 * var10);
      this.IIiilIlllIiilIll = var104 != this.lliilIlliliilIll && Math.abs(var165) > 0.5
         ? Math.min(this.IIiilIlllIiilIll + 1.0, 8.0)
         : Math.max(0.0, this.IIiilIlllIiilIll - 3.0 * var10);
      this.iIiilIllIliilIll = var102;
      this.lliilIlliliilIll = var104;
      double var106 = lliillililiillil.lIiiIiIlilli(this.lililIlliililIll / 5.0, 0.0, 1.0);
      double var108 = lliillililiillil.lIiiIiIlilli(this.IIiilIlllIiilIll / 5.0, 0.0, 1.0);
      double var110 = Math.min(var170, 10.0);
      double var112 = Math.min(var171, 10.0);
      double var114 = IIIllIIliIIl((var110 - 1.0) / 9.0);
      double var116 = IIIllIIliIIl((var112 - 1.0) / 9.0);
      double var118 = 0.15 + 0.85 * lliillililiillil.lIiiIiIlilli(var114, 0.0, 1.0);
      double var120 = 0.15 + 0.85 * lliillililiillil.lIiiIiIlilli(var116, 0.0, 1.0);
      double var122 = lliillililiillil.iliIiiliiiii(var86, 8.0, 2.5 + 0.15 * var110) * var118 * (1.0 - 0.6 * var106);
      double var124 = lliillililiillil.iliIiiliiiii(var86, 0.15, 0.8 + 0.04 * var110) * var118;
      double var126 = lliillililiillil.iliIiiliiiii(var86, 0.08, 0.25) * var118 * (1.0 + 2.0 * var106);
      double var128 = (0.85 + 0.015 * var110) * var118;
      double var130 = lliillililiillil.iliIiiliiiii(var86, 0.1, 0.3);
      double var132 = var122 * var164 + var124 * this.ilIllIllIiIllIll + var126 * this.IIlllIlllIlllIll + var128 * var88 - var130 * var92;
      double var134 = 0.0;
      if (f) {
         double var136 = lliillililiillil.iliIiiliiiii(var86, 7.0, 2.2 + 0.13 * var112) * var120 * (1.0 - 0.6 * var108);
         double var138 = lliillililiillil.iliIiiliiiii(var86, 0.12, 0.65 + 0.035 * var112) * var120;
         double var140 = lliillililiillil.iliIiiliiiii(var86, 0.06, 0.2) * var120 * (1.0 + 2.0 * var108);
         double var142 = (0.82 + 0.013 * var112) * var120;
         double var144 = lliillililiillil.iliIiiliiiii(var86, 0.08, 0.25);
         var134 = var136 * var165 + var138 * this.liIllIlliiIllIll + var140 * this.iIlllIllIllllIll + var142 * var90 - var144 * var94;
      }

      var134 += this.iliIiiliiiii(horizontalSpeed.IlIillIiilIi(), var10, var86);
      if (unit && Math.abs(horizontalSpeed.IiIiliIiiiIi()) > 0.01) {
         var158 ^= ((long)(var164 > 0.0 ? 1 : 0) << 32 ^ var158) & -1L << 32;
         if ((int)(var158 >>> 32) != 0 ? horizontalSpeed.IiIiliIiiiIi() > 0.0 : horizontalSpeed.IiIiliIiiiIi() < 0.0) {
            var132 *= 1.15;
         }
      }

      double var179 = lliillililiillil.IIIllIIliIIl(8.0, 40.0, Math.abs(var164));
      double var180 = 1.0 + 2.5 * var179;
      double var181 = Math.min(
         400.0 * var163 * var180, Math.max((22.0 + 15.0 * var110) * var118 * var163 * var180, (0.4 * Math.abs(var88) + 18.0) * (0.35 + 0.65 * var118) * var180)
      );
      double var182 = Math.min(300.0 * var163, Math.max((18.0 + 13.0 * var112) * var120 * var163, (0.38 * Math.abs(var90) + 14.0) * (0.35 + 0.65 * var120)));
      var132 = lliillililiillil.lIiiIiIlilli(var132, -var181, var181);
      var134 = lliillililiillil.lIiiIiIlilli(var134, -var182, var182);
      double var183 = lliillililiillil.IIIllIIliIIl(0.5, 3.0, var44);
      double var146 = lliillililiillil.iliIiiliiiii(var179, 0.15, 0.65);
      var132 *= lliillililiillil.iliIiiliiiii(var86, var146 + (1.0 - var146) * var183, 0.4 + 0.6 * var183);
      var134 *= lliillililiillil.iliIiiliiiii(var86, 0.2 + 0.8 * var183, 0.45 + 0.55 * var183);
      double var148 = (double)this.iliIiIllIiiIiIll / 1.0E9;
      double var150 = 0.4 * Math.sin(62.83 * var148)
         + 0.25 * Math.sin(47.12 * var148)
         + 0.15 * Math.sin(78.54 * var148)
         + 0.8 * Math.sin(12.57 * var148)
         + 0.5 * Math.sin(7.85 * var148)
         + 0.3 * Math.sin(1.26 * var148);
      double var152 = 0.35 * Math.sin(56.55 * var148 + 1.3)
         + 0.2 * Math.sin(43.98 * var148 + 0.7)
         + 0.12 * Math.sin(72.26 * var148 + 2.1)
         + 0.6 * Math.sin(10.47 * var148 + 0.9)
         + 0.4 * Math.sin(5.65 * var148 + 1.8)
         + 0.2 * Math.sin(0.94 * var148 + 0.5);
      double var154 = 0.15 + 0.85 * var86;
      double var156 = 0.5 + 0.5 * (1.0 - var114);
      var132 += var150 * var154 * var156 * 1.5;
      if (f) {
         var134 += var152 * var154 * var156;
      }

      if (verticalSpeed > 1.0E-5 && Double.isFinite(var132) && Double.isFinite(var134)) {
         this.lIIllIlliIIllIll += var132 * var10 / verticalSpeed;
         this.IlIllIllllIllIll += var134 * var10 / verticalSpeed;
      }

      this.iIIilIllIlIilIll = true;
      this.lllllIllillllIll = var164;
      this.IilllIlllilllIll = var165;
      this.iilllIllIIillIll = var70;
      this.lIillIlliIillIll = var72;
      this.liillIlliiillIll = horizontalSpeed.IIIilIIiiIIi();
      this.IIIilIlllIIilIll = horizontalSpeed.IlIillIiilIi();
   }

   public liIiiiIiiiIiiiIi iIlIlllllill() {
      long var3 = -4750030988713401242L;
      var3 ^= ((long)((int)this.lIIllIlliIIllIll) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)((int)this.IlIllIllllIllIll) ^ var3) & -1L >>> 32;
      this.lIIllIlliIIllIll -= (double)((int)(var3 >>> 32));
      this.IlIllIllllIllIll -= (double)((int)var3);
      if (!this.liiIiIlliiiIiIll) {
         var3 ^= ((long)liIiiiIiiiIiiiIi.liiiIIllIl(this.IIIliIlllIIliIll, (int)var3, 10) ^ var3) & -1L >>> 32;
         this.IIIliIlllIIliIll += (int)var3;
      }

      return (int)(var3 >>> 32) == 0 && (int)var3 == 0 ? liIiiiIiiiIiiiIi.ilIIiIIlIi : new liIiiiIiiiIiiiIi((int)(var3 >>> 32), (int)var3);
   }

   double IilliliilIIi() {
      return this.illilIllIililIll;
   }

   public ilIlIlIiIlIl(Random rnd) {
      this.iiiIlIllIIIllIll = rnd;
   }

   private static double IIIllIIliIIl(double v) {
      return v * v;
   }

   public void IliIlllilIi() {
      this.lIIllIlliIIllIll = 0.0;
      this.IlIllIllllIllIll = 0.0;
      this.ilIllIllIiIllIll = 0.0;
      this.liIllIlliiIllIll = 0.0;
      this.IIlllIlllIlllIll = 0.0;
      this.iIlllIllIllllIll = 0.0;
      this.lllllIllillllIll = 0.0;
      this.IilllIlllilllIll = 0.0;
      this.iilllIllIIillIll = 0.0;
      this.lIillIlliIillIll = 0.0;
      this.IlillIllllillIll = 0.0;
      this.ilillIllIiillIll = 0.0;
      this.liillIlliiillIll = 0.0;
      this.IIIilIlllIIilIll = 0.0;
      this.iIIilIllIlIilIll = false;
      this.llIilIllilIilIll = false;
      this.IiIilIllliIilIll = this.iiIilIllIIlilIll = this.lIlilIlliIlilIll = 0.0;
      this.IllilIlllllilIll = 0.0;
      this.illilIllIililIll = 0.0;
      this.lililIlliililIll = 0.0;
      this.IIiilIlllIiilIll = 0.0;
      this.iIiilIllIliilIll = 0.0;
      this.lliilIlliliilIll = 0.0;
      this.IiiilIllliiilIll = 0.0;
      this.iiiilIllIIIIiIll = 0.0;
      this.lIIIiIlliIIIiIll = false;
      this.IlIIiIllllIIiIll = 0.0;
      this.ilIIiIllIiIIiIll = false;
      this.liIIiIlliiIIiIll = 0.0;
      this.IIlIiIlllIlIiIll = 0.0;
      this.iIlIiIllIllIiIll = false;
      this.lllIiIllillIiIll = 0L;
      this.IilIiIlllilIiIll = 0.0;
      this.iilIiIllIIiIiIll = 0.0;
      this.lIiIiIlliIiIiIll = 0.0;
      this.IliIiIlllliIiIll = 0.0;
      this.iliIiIllIiiIiIll = 0L;
      this.IIIliIlllIIliIll = 0;
   }

   private void lIiiIiIlilli(lliIliiliIli dt, double f) {
      double var4 = dt.liiiIIllIl();
      double var6 = this.iIIilIllIlIilIll && this.lIIIiIlliIIIiIll ? (var4 - this.iiiilIllIIIIiIll) / f : 0.0;
      this.liIIiIlliiIIiIll = this.liIIiIlliiIIiIll + (var6 - this.liIIiIlliiIIiIll) * 0.65;
      this.iiiilIllIIIIiIll = var4;
      this.lIIIiIlliIIIiIll = true;
      if (dt.IilliliilIIi()) {
         this.IlIIiIllllIIiIll = var4;
         this.ilIIiIllIiIIiIll = true;
         this.IIlIiIlllIlIiIll *= 0.35;
      } else {
         if (!this.ilIIiIllIiIIiIll) {
            this.IlIIiIllllIIiIll = var4;
            this.ilIIiIllIiIIiIll = true;
         }

         double var8 = Math.max(0.0, var4 - this.IlIIiIllllIIiIll);
         this.IIlIiIlllIlIiIll = Math.max(
            this.IIlIiIlllIlIiIll * 0.92, Math.max(Math.min(0.7, Math.max(0.0, this.liIIiIlliiIIiIll) * 0.34), Math.min(0.82, var8 * 0.58))
         );
      }
   }

   private double iliIiiliiiii(double dt, double s, double pitch) {
      double var7 = 0.65 + 0.35 * pitch;
      long var9 = this.iliIiIllIiiIiIll / 1000000L;
      if (!this.iIlIiIllIllIiIll || var9 >= this.lllIiIllillIiIll) {
         double var11 = dt > 22.0 ? -0.18 : (dt < -22.0 ? 0.18 : 0.0);
         this.IilIiIlllilIiIll = lliillililiillil.lIiiIiIlilli(
            (this.iiiIlIllIIIllIll.nextDouble() * 2.0 - 1.0) * lliillililiillil.iliIiiliiiii(var7, 0.05, 0.15) + var11, -0.5, 0.5
         );
         this.lllIiIllillIiIll = var9 + 300L + (long)this.iiiIlIllIIIllIll.nextInt(420);
         this.iIlIiIllIllIiIll = true;
      }

      this.lIiIiIlliIiIiIll = this.lIiIiIlliIiIiIll + (this.IilIiIlllilIiIll - this.iilIiIllIIiIiIll) * lliillililiillil.iliIiiliiiii(var7, 2.0, 5.0) * s;
      this.lIiIiIlliIiIiIll = this.lIiIiIlliIiIiIll * Math.pow(0.04, s);
      this.iilIiIllIIiIiIll = this.iilIiIllIIiIiIll + this.lIiIiIlliIiIiIll * s;
      double var21 = lliillililiillil.iliIiiliiiii(var7, 0.45, 0.8);
      if (this.iilIiIllIIiIiIll > var21) {
         this.iilIiIllIIiIiIll = var21;
         this.lIiIiIlliIiIiIll = Math.min(0.0, this.lIiIiIlliIiIiIll);
      } else if (this.iilIiIllIIiIiIll < -var21) {
         this.iilIiIllIIiIiIll = -var21;
         this.lIiIiIlliIiIiIll = Math.max(0.0, this.lIiIiIlliIiIiIll);
      }

      this.IliIiIlllliIiIll = this.IliIiIlllliIiIll
         + (this.iiiIlIllIIIllIll.nextDouble() * 2.0 - 1.0 - this.IliIiIlllliIiIll) * lliillililiillil.lIiiIiIlilli(s * 5.0, 0.02, 0.18);
      double var13 = (double)this.iliIiIllIiiIiIll / 1.0E9;
      double var15 = 0.35 * Math.sin(8.7 * var13 + 0.4)
         + 0.22 * Math.sin(13.1 * var13 + 2.2)
         + 0.12 * Math.sin(19.6 * var13 + 1.1)
         + 0.3 * this.IliIiIlllliIiIll;
      double var17 = 0.25 * this.lIiIiIlliIiIiIll
         + this.iilIiIllIIiIiIll * lliillililiillil.iliIiiliiiii(var7, 1.4, 3.0)
         + var15 * lliillililiillil.iliIiiliiiii(var7, 0.35, 0.9);
      double var19 = lliillililiillil.iliIiiliiiii(var7, 0.25, 0.55) * (1.0 - 0.85 * lliillililiillil.IIIllIIliIIl(72.0, 88.0, Math.abs(dt)));
      return lliillililiillil.lIiiIiIlilli(var17, -var19, var19);
   }
}
