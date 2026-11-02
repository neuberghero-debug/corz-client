package gg.corz;

public final class IlllllIillllllIi {
   public static final double lIiIiiIIIi = 0.98;
   public static final double IliIiiIIIi = 0.7;
   public static final int liiIiiIIIi = 40;
   public static final double iliIiiIIIi = 0.01;
   public static final double lIIliiIIIi = 0.05;
   public static final double IiiIiiIIIi = 0.004;
   public static final double IIiIiiIIIi = 0.98;
   public static final double iIiIiiIIIi = 0.989;
   public static final double iilIiiIIIi = 0.6;
   public static final double lliIiiIIIi = 0.03;
   public static final double IIIliiIIIi = 0.5;
   public static final int iiiIiiIIIi = 70;

   static boolean IIIllIIliIIl(iilliIilIIiliIil interval, double sz, double pz, double sx, double px) {
      if (interval.liiiIIllIl(sx, px)) {
         return false;
      } else {
         double[] var9 = IlIlllIlilIl(interval, sz, pz);
         double var10 = var9[0] - sz;
         double var12 = var9[1] - pz;
         double var14 = var9[0] - sx;
         double var16 = var9[1] - px;
         return var10 * var14 + var12 * var16 < 0.0;
      }
   }

   static double[] IlIlllIlilIl(iilliIilIIiliIil interval, double z, double x) {
      double var5 = interval.lIiiIiIlilli() == 2 ? x : z;
      double var7 = interval.lIiiIiIlilli() == 2 ? z : x;
      double var9 = Math.max(interval.iliIiiliiiii(), Math.min(interval.IIIllIIliIIl(), var5));
      double var11 = Math.max(interval.IlIlllIlilIl(), Math.min(interval.IiIlliIliiIl(), var7));
      return interval.lIiiIiIlilli() == 2 ? new double[]{var11, var9} : new double[]{var9, var11};
   }

   public static double liiiIIllIl(double speed, double slipperiness) {
      double var4 = IliIlllilIi(slipperiness);
      return speed * var4 / (1.0 - var4);
   }

   public static double iIlIlllllill(double slipperiness) {
      double var2 = IliIlllilIi(0.6);
      double var4 = IliIlllilIi(slipperiness);
      double var6 = var2 / var4;
      return 0.03 * var6 * var6 * var6;
   }

   static double IiIlliIliiIl(iilliIilIIiliIil px, double interval, double pz) {
      long var18 = -3390504483094944849L;
      double var5 = px.IIlllIlliIll() - interval;
      double var7 = px.Illlllllilll() - pz;
      double var9 = Math.hypot(var5, var7);
      if (var9 < 1.0E-9) {
         return 0.0;
      } else {
         var5 /= var9;
         var7 /= var9;
         double[][] var11 = px.lIiiIiIlilli() == 2
            ? new double[][]{
               {px.IlIlllIlilIl(), px.iliIiiliiiii()},
               {px.IlIlllIlilIl(), px.IIIllIIliIIl()},
               {px.IiIlliIliiIl(), px.iliIiiliiiii()},
               {px.IiIlliIliiIl(), px.IIIllIIliIIl()}
            }
            : new double[][]{
               {px.iliIiiliiiii(), px.IlIlllIlilIl()},
               {px.iliIiiliiiii(), px.IiIlliIliiIl()},
               {px.IIIllIIliIIl(), px.IlIlllIlilIl()},
               {px.IIIllIIliIIl(), px.IiIlliIliiIl()}
            };
         double var12 = 0.0;
         double[][] var14 = var11;
         var18 ^= ((long)var11.length << 32 ^ var18) & -1L << 32;

         for (long var23 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            double[] var17 = var14[(int)var23];
            var12 = Math.max(var12, (var17[0] - interval) * var5 + (var17[1] - pz) * var7);
         }

         return var12;
      }
   }

   private IlllllIillllllIi() {
   }

   public static double IliIlllilIi(double slipperiness) {
      return Math.min(0.995, slipperiness * 0.91);
   }

   public static boolean IilliliilIIi(double slipperiness) {
      return slipperiness > 0.7;
   }

   public static int lIiiIiIlilli(double slipperiness) {
      return IilliliilIIi(slipperiness) ? 70 : 40;
   }

   public static IIIIiiillIIIiiil iliIiiliiiii(iilliIilIIiliIil pz, double px, double slipperiness, double interval, double vx, double vz) {
      long var32 = 2033727718866800923L;
      long var30 = 8941123294303749509L;
      double var11 = Math.hypot(interval, vx);
      var30 ^= ((long)pz.liiiIIllIl(px, slipperiness) << 32 ^ var30) & -1L << 32;
      double var14 = var11 > 1.0E-9 ? liiiIIllIl(var11, vz) : 0.0;
      double var16 = var11 > 1.0E-9 ? px + interval / var11 * var14 : px;
      double var18 = var11 > 1.0E-9 ? slipperiness + vx / var11 * var14 : slipperiness;
      var30 ^= ((long)(var11 > 0.001 && pz.liiiIIllIl(var16, var18) ? 1 : 0) ^ var30) & -1L >>> 32;
      if (!IilliliilIIi(vz)) {
         if ((int)(var30 >>> 32) != 0) {
            return var11 > 0.01
               ? new IIIIiiillIIIiiil(
                  lliilIiiliilIi.iiliIlliiIIiiIllii,
                  IIlIlIIllIlIlIIl.iiIIIillIl,
                  true,
                  var14,
                  (boolean)((int)var30),
                  false,
                  IIlllIlliIll<"IIlllIlliIll","vTQYPl4/K+KixqCBN+AQaUHtPaGItyy3ERmb8qTy9i18rhOe7xFWnukVhQ==">()
               )
               : new IIIIiiillIIIiiil(
                  lliilIiiliilIi.lIiiIlliiiIiiIllii,
                  IIlIlIIllIlIlIIl.IIlIIillIl,
                  true,
                  var14,
                  (boolean)((int)var30),
                  false,
                  IIlllIlliIll<"IIlllIlliIll","lU+OI3Fng5I1O8jCiFflQA3svhHfU+ySuWHd2H+91ETRGgY=">()
               );
         } else {
            return (int)var30 != 0
               ? new IIIIiiillIIIiiil(
                  lliilIiiliilIi.llliIlliiilliIllii,
                  IIlIlIIllIlIlIIl.IiIIIillIl,
                  false,
                  var14,
                  true,
                  false,
                  IIlllIlliIll<"IIlllIlliIll","TLs0m05wWCw+tIRsLKp/TCNp0rWnXoPo08fSv9zCF/vScoSVq2E=">()
               )
               : new IIIIiiillIIIiiil(
                  lliilIiiliilIi.iIliIlliiIlliIllii,
                  IIlIlIIllIlIlIIl.llIIIillIl,
                  false,
                  var14,
                  false,
                  false,
                  IIlllIlliIll<"IIlllIlliIll","h9vNWfbOE6tX/IScA6Ix9ZfLJANtoRzu0/zEMWGTc8wPBnSp">()
               );
         }
      } else {
         var32 ^= ((long)(var11 > 0.001 && (int)var30 == 0 && IIIllIIliIIl(pz, px, slipperiness, var16, var18) ? 1 : 0) << 32 ^ var32) & -1L << 32;
         if ((int)(var30 >>> 32) != 0) {
            return var11 <= 0.004
               ? new IIIIiiillIIIiiil(
                  lliilIiiliilIi.lIiiIlliiiIiiIllii,
                  IIlIlIIllIlIlIIl.IIlIIillIl,
                  true,
                  var14,
                  (boolean)((int)var30),
                  false,
                  IIlllIlliIll<"IIlllIlliIll","lU+OI3Fng5I1O8jCiFflQA3svhHfU+ySuWHd2H+91ETRGgY=">()
               )
               : new IIIIiiillIIIiiil(
                  lliilIiiliilIi.IiliIlliililiIllii,
                  IIlIlIIllIlIlIIl.ilIIIillIl,
                  true,
                  var14,
                  (boolean)((int)var30),
                  (int)var30 == 0,
                  IIlllIlliIll<"IIlllIlliIll","LgcSuxxiKzobzSlx+5ly2pR/57PQsnK3X2prLe9NnuB5sJcsGlKmfSfyqtVDjganBOmPiIphXg==">()
               );
         } else {
            double var22 = IiIlliIliiIl(pz, px, slipperiness);
            double var24 = var11 + iIlIlllllill(vz);
            double var26 = var24 + liiiIIllIl(var24, vz);
            if ((int)var30 != 0) {
               double var34 = (pz.IIlllIlliIll() - var16) * (var11 > 1.0E-9 ? interval / var11 : 0.0)
                  + (pz.Illlllllilll() - var18) * (var11 > 1.0E-9 ? vx / var11 : 0.0);
               return var34 > 0.05 && var26 <= var22
                  ? new IIIIiiillIIIiiil(
                     lliilIiiliilIi.iIliIlliiIlliIllii,
                     IIlIlIIllIlIlIIl.liIIIillIl,
                     false,
                     var14,
                     true,
                     false,
                     IIlllIlliIll<"IIlllIlliIll","QignGGqC+Td09XnWv2OW9ZNrGlnxXIxi57tiY1JMDdsKA3qXyEyfiv2kIoOALUHtWdxCkUKx8k4m5eRu50+O0wD4Hd6IPkcv7fU=">()
                  )
                  : new IIIIiiillIIIiiil(
                     lliilIiiliilIi.llliIlliiilliIllii,
                     IIlIlIIllIlIlIIl.IiIIIillIl,
                     false,
                     var14,
                     true,
                     false,
                     IIlllIlliIll<"IIlllIlliIll","TLs0m05wWCw+tIRsLKp/TCNp0rWnXoPo08fSv9zCF/vScoSVq2E=">()
                  );
            } else if ((int)(var32 >>> 32) != 0) {
               return new IIIIiiillIIIiiil(
                  lliilIiiliilIi.IiliIlliililiIllii,
                  IIlIlIIllIlIlIIl.ilIIIillIl,
                  false,
                  var14,
                  false,
                  true,
                  IIlllIlliIll<"IIlllIlliIll","bld2aDmFD9eXtHF110/Bj1wHIXSV0qCFpZetUxk6XBX1+no4wXoRrrpaV2uEzXWyvc09uGPAvw7lf7Fhn6GPhdUU6pdpoa8=">()
               );
            } else {
               double var28 = pz.iIlIlllllill(px, slipperiness);
               return var26 > var22
                  ? new IIIIiiillIIIiiil(
                     lliilIiiliilIi.llliIlliiilliIllii,
                     IIlIlIIllIlIlIIl.liIIIillIl,
                     false,
                     var14,
                     false,
                     false,
                     IIlllIlliIll<"IIlllIlliIll","Ge4y6+/VrB5p7We4VN24/vcD8Me/+xQMhDAWD7zWeMdWLhZkKCYPMSzwCiy/GCl7PFoBeq8a9jL15Ik=">()
                  )
                  : new IIIIiiillIIIiiil(
                     lliilIiiliilIi.iIliIlliiIlliIllii,
                     var28 <= 0.5 ? IIlIlIIllIlIlIIl.liIIIillIl : IIlIlIIllIlIlIIl.llIIIillIl,
                     false,
                     var14,
                     false,
                     false,
                     IIlllIlliIll<"IIlllIlliIll","h9vNWfbOE6tX/IScA6Ix9ZfLJANtoRzu0/zEMWGTc8wPBnSp">()
                  );
            }
         }
      }
   }
}
