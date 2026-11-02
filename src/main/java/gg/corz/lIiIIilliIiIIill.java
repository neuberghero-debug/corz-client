package gg.corz;

public final class lIiIIilliIiIIill {
   public static final float lilIillill = 1.5F;
   public static final float IlIlillill = 0.3F;
   public static final double iliIillill = 4.6;
   public static final int IIIlillill = 3;
   public static final float iIlIillill = 0.25F;
   public static final float lIlIillill = 2.0F;
   public static final float illIillill = 1.0F;
   public static final int iIiIillill = 40;
   public static final double iiiIillill = 25.0;
   public static final double lIIlillill = 0.1;
   public static final float iilIillill = 0.4F;
   public static final int liiIillill = 20;
   public static final int lIiIillill = 2;
   public static final float lliIillill = 4.0F;
   public static final float IIlIillill = 0.1F;
   public static final int IliIillill = 3;
   public static final int iiIlillill = 4;
   public static final float ilIlillill = 3.0F;
   public static final int IIllillill = 3;
   public static final int IIiIillill = 1;
   public static final float IiIlillill = 0.5F;
   public static final float lllIillill = 1.0F;
   public static final float IilIillill = 0.6F;
   public static final double lIllillill = 20.0;
   public static final double iIllillill = 38.0;
   public static final float llIlillill = 0.5F;
   public static final float liIlillill = 0.75F;
   public static final float IllIillill = 0.5F;
   public static final float iIIlillill = 4.0F;
   public static final int IiiIillill = 16;

   private lIiIIilliIiIIill() {
   }

   static double lIiiIiIlilli(float wself, float gain, float pDet) {
      return (double)(wself * gain * pDet);
   }

   static double IilliliilIIi(float dealt, float woff, float cost, float pDet, float wself, float hitUs) {
      return (double)(dealt * cost - woff * pDet + woff * wself * hitUs);
   }

   static int IlIillIiilIi(boolean[] placedSide, int solidSides) {
      long var4 = -8762227082337876611L;
      var4 ^= (0L ^ var4) & -1L << 32;
      if (placedSide == null) {
         return solidSides >= 0 ? 1 : 0;
      } else {
         for (var4 ^= (0L ^ var4) & -1L >>> 32; (int)var4 < placedSide.length; var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
            if (placedSide[(int)var4] || (int)var4 == solidSides) {
               var4 += 4294967296L;
            }
         }

         return (int)(var4 >>> 32);
      }
   }

   static int Illillliilli(double points, double cy, double ax, double[][] cz, int cx, int ay, int az) {
      long var17 = -7532980550061731945L;
      long var15 = -4967530616279834180L;
      if (cz == null) {
         return 0;
      } else {
         var15 ^= (0L ^ var15) & -1L << 32;
         double[][] var11 = cz;
         var15 ^= ((long)cz.length ^ var15) & -1L >>> 32;

         for (long var21 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var21 >>> 32) < (int)var15; var21 += 4294967296L) {
            double[] var14 = var11[(int)(var21 >>> 32)];
            if (var14 != null && Iilililiiili(points, cy, ax, var14[0], var14[1], var14[2], cx, ay, az)) {
               var15 += 4294967296L;
            }
         }

         return (int)(var15 >>> 32);
      }
   }

   public static boolean IliIlllilIi(IIIilIIiiIIi ehp, float a) {
      return ehp != null && ehp.IliIlllilIi()
         ? ehp.liiiIIllIl() >= Math.max(2.0F, 0.25F * a)
            || ehp.IlIlllIlilIl() >= a - 0.5F
            || ehp.Illlllllilll() <= 1 && ehp.iliIiiliiiii() >= 1 && ehp.IiIlliIliiIl() >= 1.0F
         : false;
   }

   public static boolean Ililllililil(boolean obsidian, int crystalBaseRisk, int glowstone) {
      return glowstone > 20 && (obsidian || crystalBaseRisk < 16);
   }

   public static int IIlllIlliIll(double firstCap, boolean aimedNow, double turn) {
      if (aimedNow) {
         return 0;
      } else {
         double var5 = Double.isFinite(turn) && turn > 0.0 ? Math.min(turn, 20.0) : 20.0;
         return firstCap <= var5 ? 1 : (firstCap <= var5 + 18.0 ? 2 : 3);
      }
   }

   public static float IIillIiliIil(float saved, int prep) {
      return saved - 0.75F * (float)prep;
   }

   static double[][] IIlilIliiIli(double minZ, double minX, double maxY, double maxZ, double maxX, double minY) {
      double var12 = (maxZ - minZ) * 0.1;
      double var14 = (maxX - minX) * 0.1;
      double var16 = (minY - maxY) * 0.1;
      double var18 = minZ + var12;
      double var20 = maxZ - var12;
      double var22 = minX + var14;
      double var24 = maxX - var14;
      double var26 = maxY + var16;
      double var28 = minY - var16;
      return new double[][]{
         {(minZ + maxZ) * 0.5, (minX + maxX) * 0.5, (maxY + minY) * 0.5},
         {var18, var22, var26},
         {var20, var22, var26},
         {var18, var22, var28},
         {var20, var22, var28},
         {var18, var24, var26},
         {var20, var24, var26},
         {var18, var24, var28},
         {var20, var24, var28}
      };
   }

   public static boolean IlIlllIlilIl(float ehp, float hitUs, float pDet) {
      return pDet >= 0.5F && Float.isFinite(ehp) && (ehp >= hitUs - 0.5F || ehp >= Math.max(4.0F, 0.3F * hitUs));
   }

   static boolean IIIllIIliIIl(float gain, float shieldsRecent, int prepTicks, int eta, int fullUs) {
      return gain >= Math.max(1.5F, 0.4F * shieldsRecent) && prepTicks >= eta && fullUs < 2;
   }

   public static boolean IIIilIIiiIIi(int solidFeetSidesAfter) {
      return solidFeetSidesAfter < 3;
   }

   static boolean Iilililiiili(double az, double bx, double bz, double ax, double cz, double ay, int by, int cx, int cy) {
      long var33 = 4688055372980355198L;
      double var15 = 0.0;
      double var17 = 1.0;
      double[] var19 = new double[]{az, bx, bz};
      double[] var20 = new double[]{ax - az, cz - bx, ay - bz};
      int[] var21 = new int[]{by, cx, cy};

      for (long var35 = var33 ^ (0L ^ var33) & -1L << 32; (int)(var35 >>> 32) < 3; var35 += 4294967296L) {
         double var23 = (double)var21[(int)(var35 >>> 32)];
         double var25 = (double)var21[(int)(var35 >>> 32)] + 1.0;
         if (Math.abs(var20[(int)(var35 >>> 32)]) < 1.0E-9) {
            if (var19[(int)(var35 >>> 32)] <= var23 || var19[(int)(var35 >>> 32)] >= var25) {
               return false;
            }
         } else {
            double var27 = (var23 - var19[(int)(var35 >>> 32)]) / var20[(int)(var35 >>> 32)];
            double var29 = (var25 - var19[(int)(var35 >>> 32)]) / var20[(int)(var35 >>> 32)];
            if (var27 > var29) {
               double var31 = var27;
               var27 = var29;
               var29 = var31;
            }

            var15 = Math.max(var15, var27);
            var17 = Math.min(var17, var29);
            if (var15 >= var17) {
               return false;
            }
         }
      }

      return true;
   }

   public static int Illlllllilll(int eta, int pingTicks) {
      return eta >= 99 ? 3 : Math.min(3, eta - 1 - Math.max(0, pingTicks));
   }

   static int IiIiliIiiiIi(double turnDegrees) {
      return turnDegrees > 25.0 ? 2 : 1;
   }

   public static boolean Iilllilliill(float saved, float prep, int recent, int hitUs, int deadline) {
      return recent <= hitUs && deadline < 4 && saved >= Math.max(3.0F, 0.5F * prep);
   }

   static boolean iliIiiliiiii(float dealt, float ev, float totemConfirmed, float hitUs, double targetEhp, boolean ehp, float cost) {
      if (!Float.isFinite(dealt) || !(targetEhp > 0.0)) {
         return false;
      } else if (dealt <= 0.1F) {
         return true;
      } else {
         return dealt >= totemConfirmed - 1.0F ? ehp && ev >= cost : ev >= dealt || dealt <= 0.6F * hitUs;
      }
   }

   static boolean Iiilliiliiil(boolean glow, boolean crystalBaseRisk, int obsidian, int glowstone) {
      return glow ? glowstone > 20 : obsidian > 0 && !crystalBaseRisk;
   }

   public static int IiIlliIliiIl(double aimedNow, boolean turn) {
      return IIlllIlliIll(aimedNow, turn, 20.0);
   }

   public static liliiiiliiliiiil liiiIIllIl(iiIllilIIlllil in) {
      return iIlIlllllill(in, Float.POSITIVE_INFINITY);
   }

   public static liliiiiliiliiiil iIlIlllllill(iiIllilIIlllil targetEhp, float in) {
      long var11 = -553024213286051459L;
      if (targetEhp != null && targetEhp.IliIlllilIi() != null && IliIlllilIi(targetEhp.IliIlllilIi(), targetEhp.liiiIIllIl())) {
         IIIilIIiiIIi var2 = targetEhp.IliIlllilIi();
         lIiliIiliIiliIil var3 = targetEhp.iliIiiliiiii();
         var11 ^= (0L ^ var11) & -1L << 32;
         double var5 = Double.NEGATIVE_INFINITY;
         if (var3 != null && var3.IliIlllilIi() && var2.iliIiiliiiii() >= 1 && var2.lIiiIiIlilli() != null) {
            var5 = IilliliilIIi(
               targetEhp.IilliliilIIi(), targetEhp.lIiiIiIlilli(), var3.iIlIlllllill(), var3.liiiIIllIl(), var2.Iilllilliill(), var2.IiIlliIliiIl()
            );
            if (var3.liiiIIllIl() <= 0.1F) {
               return new liliiiiliiliiiil(IlIIllllllIIllll.iiilllIill, var2.lIiiIiIlilli(), false, Math.max(0.0, var5));
            }

            var11 ^= (
                  (long)iliIiiliiiii(var3.liiiIIllIl(), var3.iIlIlllllill(), targetEhp.liiiIIllIl(), var2.IiIlliIliiIl(), var5, targetEhp.iIlIlllllill(), in)
                        << 32
                     ^ var11
               )
               & -1L << 32;
         }

         iIiiilllIliiilll var7 = targetEhp.IIIllIIliIIl();
         var11 ^= (0L ^ var11) & -1L >>> 32;
         double var9 = Double.NEGATIVE_INFINITY;
         if (var7 != null && var7.IliIlllilIi() && var7.liiiIIllIl() != null) {
            var9 = lIiiIiIlilli(targetEhp.lIiiIiIlilli(), var2.Iilllilliill(), var7.IilliliilIIi());
            var11 ^= (
                  (long)(
                        IIIllIIliIIl(var7.IilliliilIIi(), var2.IlIlllIlilIl(), var2.Illlllllilll(), var7.lIiiIiIlilli(), targetEhp.IlIlllIlilIl())
                              && var9 > 0.0
                           ? 1
                           : 0
                     )
                     ^ var11
               )
               & -1L >>> 32;
         }

         if ((int)(var11 >>> 32) == 0 || (int)var11 != 0 && !(var5 >= var9)) {
            return (int)var11 != 0
               ? new liliiiiliiliiiil(IlIIllllllIIllll.IIIillIill, var7.liiiIIllIl(), var7.iIlIlllllill(), var9)
               : liliiiiliiliiiil.llIIliIiil;
         } else {
            return new liliiiiliiliiiil(IlIIllllllIIllll.iiilllIill, var2.lIiiIiIlilli(), false, var5);
         }
      } else {
         return liliiiiliiliiiil.llIIliIiil;
      }
   }
}
