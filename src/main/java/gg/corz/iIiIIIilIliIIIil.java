package gg.corz;

import java.util.function.IntToDoubleFunction;

public final class iIiIIIilIliIIIil {
   public static final double liIliIIIil = 1.4;
   public static final double iIlliIIIil = 0.32;
   public static final double lllliIIIil = 25.0;
   private static final double[] lliliIIIil = new double[]{-1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
   public static final double lIiliIIIil = -34.0;
   public static final double lilliIIIil = 1.0;
   public static final double[] IIlliIIIil = new double[]{8.0, 2.0, 8.0};
   private static final double[] IliliIIIil = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
   public static final double[] iiIliIIIil = new double[]{0.0625, 0.625, -0.125};
   public static final double[] IlIliIIIil = new double[]{-0.33, 0.7, -0.63};
   public static final double IllliIIIil = 0.6;
   public static final double lIlliIIIil = 0.48;
   static final double[] iIiliIIIil = new double[]{16.0, 30.0, -10.0, -0.06, -29.0, 0.55, -0.06};
   public static final double[] llIliIIIil = new double[]{0.8, 0.56, 0.21};
   public static final double[] ilIliIIIil = new double[]{-0.0625, 0.56875, 0.0375};
   public static final double illliIIIil = 35.0;
   public static final double IilliIIIil = 50.0;
   public static final double IIiliIIIil = 20.0;
   public static final double[] iIIliIIIil = new double[]{0.4, -0.23, -0.92};
   public static final double[] IiIliIIIil = new double[]{0.0625, 0.53125, -0.0125};
   public static final double iilliIIIil = 1.0;

   public static double[] IIillIiliIil(double scale) {
      double var2 = scale / 0.48;
      double[] var4 = iiIliIIIil;
      return new double[]{var4[0] + var2 * (IiIliIIIil[0] - var4[0]), var4[1] + var2 * (IiIliIIIil[1] - var4[1]), var4[2] + var2 * (IiIliIIIil[2] - var4[2])};
   }

   public static double[] IilliliilIIi(int slimArm, double ch, IntToDoubleFunction scale, boolean side) {
      return lIiiIiIlilli(slimArm, ch, scale, side, null);
   }

   private iIiIIIilIliIIIil() {
   }

   public static double[] IIiilIiiiIii(double d) {
      double var2 = Math.toRadians(d);
      double var4 = Math.cos(var2);
      double var6 = Math.sin(var2);
      return new double[]{1.0, 0.0, 0.0, 0.0, 0.0, var4, -var6, 0.0, 0.0, var6, var4, 0.0, 0.0, 0.0, 0.0, 1.0};
   }

   public static double[] liiiIIllIl(int ch, IntToDoubleFunction side) {
      return IiIiliIiiiIi(llIIlilIIl(Iiilliiliiil(ch)), IiIiliIiiiIi(IliIlllilIi(ch, side), llIIlilIIl(IIIilIIiiIIi(ch))));
   }

   static double[] IlIlllIlilIl(IntToDoubleFunction ch) {
      return IIlilIliiIli(
         Illillliilli(
            ch.applyAsDouble(~(~42246481 + -7) * 84215045 ^ -2106204496),
            ch.applyAsDouble(-((-427999383 + 99) * -11) * -119 ^ 1905314285),
            -ch.applyAsDouble(
               (
                     ~((1828094971 >>> 7 | 1828094971 << 25) << 3 | (1828094971 >>> 7 | 1828094971 << 25) >>> 29) >>> 5
                        | ~((1828094971 >>> 7 | 1828094971 << 25) << 3 | (1828094971 >>> 7 | 1828094971 << 25) >>> 29) << 27
                  )
                  ^ 38372532
            )
         ),
         Iiiiliiiiiii(ch.applyAsDouble(((-1928487254 << 1 | -1928487254 >>> 31) << 23 | (-1928487254 << 1 | -1928487254 >>> 31) >>> 9) ^ -1433596523)),
         IIiilIiiiIii(ch.applyAsDouble(-(-(-634738076 + -47)) ^ -634738120)),
         Iliilliiilii(
            -ch.applyAsDouble((((916408770 << 1 | 916408770 >>> 31) >>> 5 | (916408770 << 1 | 916408770 >>> 31) << 27) - 109) * 1057222719 ^ 2039228317)
         )
      );
   }

   static double[] lIlIliIlIl(double[] b, double[] a) {
      return new double[]{b[1] * a[2] - b[2] * a[1], b[2] * a[0] - b[0] * a[2], b[0] * a[1] - b[1] * a[0]};
   }

   static double[] IIlllIlliIll(IntToDoubleFunction ch) {
      return IIlilIliiIli(
         Illillliilli(ilIliIIIil[0], ilIliIIIil[1], ilIliIIIil[2]),
         Iliilliiilii(Illlllllilll(ch.applyAsDouble(7))),
         IIiilIiiiIii(ch.applyAsDouble(6)),
         Illillliilli(-ilIliIIIil[0], -ilIliIIIil[1], -ilIliIIIil[2])
      );
   }

   public static double[] IliIlllilIi(int side, IntToDoubleFunction ch) {
      double[] var2 = IiIiliIiiiIi(IiIlliIliiIl(ch), IiIiliIiiiIi(Ililllililil(), IIlllIlliIll(ch)));
      return side < 0 ? IIIIllIIIl(var2) : var2;
   }

   static double[] IiIlliIliiIl(IntToDoubleFunction ch) {
      return IIlilIliiIli(
         Illillliilli(iIIliIIIil[0] + ch.applyAsDouble(0), iIIliIIIil[1] + ch.applyAsDouble(1), iIIliIIIil[2] + ch.applyAsDouble(2)),
         Iliilliiilii(ch.applyAsDouble(4)),
         Iiiiliiiiiii(ch.applyAsDouble(5)),
         IIiilIiiiIii(ch.applyAsDouble(3)),
         Illillliilli(-iIIliIIIil[0], -iIIliIIIil[1], -iIIliIIIil[2])
      );
   }

   static double[] IIIllIIliIIl(double s) {
      double var2 = Math.sin(Math.sqrt(s) * Math.PI);
      double var4 = Math.sin(s * Math.PI);
      double var6 = iIiliIIIil[0] * var2;
      double var8 = iIiliIIIil[1] * var2;
      double var10 = iIiliIIIil[2] * var2;
      double[] var12 = IiIIlliIIl(IlIliIIIil);
      double[] var13 = new double[]{var12[0] * iIiliIIIil[5], var12[1] * iIiliIIIil[5], var12[2] * iIiliIIIil[5]};
      double[] var14 = iIIIlIlIIl(IIlilIliiIli(Iliilliiilii(var6), Iiiiliiiiiii(var8), IIiilIiiiIii(var10)), var13);
      double[] var15 = new double[17];
      var15[0] = var14[0] - var13[0];
      var15[1] = var14[1] - var13[1] + iIiliIIIil[6] * var2;
      var15[2] = var14[2] - var13[2] + iIiliIIIil[3] * var4;
      var15[4] = var6;
      var15[5] = var8;
      var15[3] = var10;
      var15[11] = iIiliIIIil[4] * var2;
      return var15;
   }

   public static double[] Iiiiliiiiiii(double d) {
      double var2 = Math.toRadians(d);
      double var4 = Math.cos(var2);
      double var6 = Math.sin(var2);
      return new double[]{var4, -var6, 0.0, 0.0, var6, var4, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
   }

   public static double[] Iliilliiilii(double d) {
      double var2 = Math.toRadians(d);
      double var4 = Math.cos(var2);
      double var6 = Math.sin(var2);
      return new double[]{var4, 0.0, var6, 0.0, 0.0, 1.0, 0.0, 0.0, -var6, 0.0, var4, 0.0, 0.0, 0.0, 0.0, 1.0};
   }

   static double iiIIlIIlIl(double[] b, double[] a) {
      return b[0] * a[0] + b[1] * a[1] + b[2] * a[2];
   }

   public static double[] IiIiliIiiiIi(double[] a, double[] b) {
      double[] var2 = new double[16];

      for (int var3 = 0; var3 < 4; var3++) {
         for (int var4 = 0; var4 < 4; var4++) {
            double var5 = 0.0;

            for (int var7 = 0; var7 < 4; var7++) {
               var5 += a[var3 * 4 + var7] * b[var7 * 4 + var4];
            }

            var2[var3 * 4 + var4] = var5;
         }
      }

      return var2;
   }

   public static double[] Iilililiiili(double s) {
      double[] var2 = IlIillIiilIi();
      var2[0] = s;
      var2[5] = s;
      var2[(
            (-(2142391913 * -1556147571) << 1 | -(2142391913 * -1556147571) >>> 31) << 17
               | (-(2142391913 * -1556147571) << 1 | -(2142391913 * -1556147571) >>> 31) >>> 15
         )
         ^ -1196430901] = s;
      return var2;
   }

   public static double[] Illillliilli(double x, double z, double y) {
      double[] var6 = IlIillIiilIi();
      var6[3] = x;
      var6[~((987491495 ^ -91 ^ -41) * -1090785345) ^ 2029548051] = z;
      var6[(599203218 * -23 << 9 | 599203218 * -23 >>> 23) * -1736263375 ^ -1927840114] = y;
      return var6;
   }

   static double[] IiIIlliIIl(double[] a) {
      double var1 = Math.sqrt(iiIIlIIlIl(a, a));
      return new double[]{a[0] / var1, a[1] / var1, a[2] / var1};
   }

   public static IntToDoubleFunction iliIiiliiiii(IntToDoubleFunction ch, double s) {
      if (s > Double.longBitsToDouble(-3870770668276967905L ^ -3870770668276967905L)
         && !(s >= Double.longBitsToDouble(-7918647417473200163L ^ -5914545583293329443L))) {
         double[] var3 = IIIllIIliIIl(s);
         return chx -> ch.applyAsDouble(chx) + var3[chx];
      } else {
         return ch;
      }
   }

   public static double[] IlIillIiilIi() {
      return new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
   }

   public static double[] lIiiIiIlilli(int ch, double scale, IntToDoubleFunction slimArm, boolean trim, double[] side) {
      double[] var6 = IIillIiliIil(scale);
      double var7 = side == null ? 0.0 : Iilllilliill(side[0], 1.0);
      double var9 = side == null ? 0.0 : Iilllilliill(side[1], 1.0);
      double var11 = side == null ? 0.0 : Iilllilliill(side[2], 20.0);
      double[] var13 = IIlilIliiIli(
         Illillliilli(var6[0], var6[1] - var7 / 16.0, var6[2] - var9 / 16.0),
         Iliilliiilii(-90.0),
         Iiiiliiiiiii(90.0),
         Iiiiliiiiiii(-34.0 - var11),
         Iilililiiili(scale / 16.0),
         Illillliilli(0.0, 0.0, -1.4),
         IlIlllIlilIl(slimArm)
      );
      if (ch < 0) {
         var13 = IIlilIliiIli(lliliIIIil, var13, IliliIIIil);
      }

      return IiIiliIiiiIi(var13, Illillliilli(-IIlliIIIil[0], -IIlliIIIil[1], -IIlliIIIil[2]));
   }

   public static double[] iIlIlllllill(int scale, double ch, IntToDoubleFunction side) {
      return IilliliilIIi(scale, ch, side, false);
   }

   static double Iilllilliill(double v, double max) {
      return v != v ? 0.0 : Math.max(-max, Math.min(max, v));
   }

   public static double[] llIIlilIIl(double[] m) {
      double[] var1 = new double[16];
      double var2 = m[0];
      double var4 = m[1];
      double var6 = m[2];
      double var8 = m[4];
      double var10 = m[5];
      double var12 = m[6];
      double var14 = m[8];
      double var16 = m[9];
      double var18 = m[10];
      double var20 = var2 * (var10 * var18 - var12 * var16) - var4 * (var8 * var18 - var12 * var14) + var6 * (var8 * var16 - var10 * var14);
      double var22 = 1.0 / var20;
      var1[0] = (var10 * var18 - var12 * var16) * var22;
      var1[1] = (var6 * var16 - var4 * var18) * var22;
      var1[2] = (var4 * var12 - var6 * var10) * var22;
      var1[4] = (var12 * var14 - var8 * var18) * var22;
      var1[5] = (var2 * var18 - var6 * var14) * var22;
      var1[6] = (var6 * var8 - var2 * var12) * var22;
      var1[8] = (var8 * var16 - var10 * var14) * var22;
      var1[9] = (var4 * var14 - var2 * var16) * var22;
      var1[10] = (var2 * var10 - var4 * var8) * var22;
      var1[3] = -(var1[0] * m[3] + var1[1] * m[7] + var1[2] * m[11]);
      var1[7] = -(var1[4] * m[3] + var1[5] * m[7] + var1[6] * m[11]);
      var1[11] = -(var1[8] * m[3] + var1[9] * m[7] + var1[10] * m[11]);
      var1[15] = 1.0;
      return var1;
   }

   public static double[] IIlilIliiIli(double[]... ms) {
      double[] var1 = IlIillIiilIi();

      for (double[] var5 : ms) {
         var1 = IiIiliIiiiIi(var1, var5);
      }

      return var1;
   }

   static double[] Ililllililil() {
      double[] var0 = IiIIlliIIl(IlIliIIIil);
      double[] var1 = IiIIlliIIl(llIliIIIil);
      double var2 = iiIIlIIlIl(var1, var0);
      double[] var4 = IiIIlliIIl(new double[]{-(var1[0] - var2 * var0[0]), -(var1[1] - var2 * var0[1]), -(var1[2] - var2 * var0[2])});
      double[] var5 = lIlIliIlIl(var0, var4);
      double[] var6 = new double[]{var5[0], var0[0], var4[0], 0.0, var5[1], var0[1], var4[1], 0.0, var5[2], var0[2], var4[2], 0.0, 0.0, 0.0, 0.0, 1.0};
      double[] var7 = iIIIlIlIIl(var6, ilIliIIIil);
      var6[3] = iIIliIIIil[0] - var7[0];
      var6[7] = iIIliIIIil[1] - var7[1];
      var6[11] = iIIliIIIil[2] - var7[2];
      return var6;
   }

   public static double[] Iiilliiliiil(int side) {
      double var1 = side < 0 ? -1.0 : 1.0;
      return IIlilIliiIli(
         Illillliilli(var1 * 0.64000005, -0.6, -0.71999997),
         Iliilliiilii(var1 * 45.0),
         Illillliilli(var1 * -1.0, 3.6, 3.5),
         Iiiiliiiiiii(var1 * 120.0),
         IIiilIiiiIii(200.0),
         Iliilliiilii(var1 * -135.0),
         Illillliilli(var1 * 5.6, 0.0, 0.0)
      );
   }

   public static double[] IIIilIIiiIIi(int side) {
      double var1 = side < 0 ? Double.longBitsToDouble(3204586861502996233L ^ -7815721426672607479L) : 1.0;
      return IIlilIliiIli(
         Illillliilli(
            var1 * Double.longBitsToDouble(-8157913542844988555L ^ 5682774011971388277L) / Double.longBitsToDouble(519698927490153148L ^ 5117874147035429564L),
            Double.longBitsToDouble(2593626658901241324L ^ 2035180305107299820L),
            0.0
         ),
         Iiiiliiiiiii(Math.toDegrees(var1 * Double.longBitsToDouble(2670879956025593079L ^ 1921144449875072365L)))
      );
   }

   public static double Illlllllilll(double wr) {
      double var2 = Math.abs(wr);
      double var4 = wr > Double.longBitsToDouble(2544052892689873103L ^ 2544052892689873103L)
         ? Double.longBitsToDouble(-8233456340535187268L ^ -3603615186109962052L)
         : Double.longBitsToDouble(4810963525750536958L ^ 183233433650641662L);
      return var2 <= Double.longBitsToDouble(-5649060149099767980L ^ -1034840855881984172L)
         ? wr
         : Math.signum(wr)
            * (
               Double.longBitsToDouble(-2170461132693865867L ^ -6784117475958228363L)
                  + (var4 - Double.longBitsToDouble(-4237611521928409424L ^ -8860275064447512912L))
                     * Math.tanh(
                        (var2 - Double.longBitsToDouble(-1280058914623328353L ^ -5907226056769802337L))
                           / (var4 - Double.longBitsToDouble(7658556473229529439L ^ 3058410928847278431L))
                     )
            );
   }

   public static double[] iIIIlIlIIl(double[] m, double[] v) {
      return new double[]{
         m[0] * v[0] + m[1] * v[1] + m[2] * v[2] + m[3], m[4] * v[0] + m[5] * v[1] + m[6] * v[2] + m[7], m[8] * v[0] + m[9] * v[1] + m[10] * v[2] + m[11]
      };
   }

   public static double[] IIIIllIIIl(double[] m) {
      double[] var1 = (double[])m.clone();

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            double var4 = (double)((var2 == 0 ? -1 : 1) * (var3 == 0 ? -1 : 1));
            var1[var2 * 4 + var3] = m[var2 * 4 + var3] * var4;
         }
      }

      return var1;
   }
}
