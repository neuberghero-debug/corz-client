package gg.corz;

import java.util.Locale;

public record IiIilillliIilill(
   long id,
   long target,
   long stand,
   IIlIiiIilIlIiiIi eyeMode,
   double eyeX,
   double eyeY,
   double eyeZ,
   lIlIIiiliIlIIiil hit,
   double reach,
   double plannerDistance,
   long geometryFingerprint,
   iillilllIIililll pose
) {
   private final IIlIiiIilIlIiiIi llIlIliill;
   private final long IlIlIliill;
   public static final int IillIliill = 30;
   private final lIlIIiiliIlIIiil iiIlIliill;
   private final iillilllIIililll IlllIliill;
   private static final double iillIliill = 1.0E-9;
   private final long iIllIliill;
   private final double lIllIliill;
   private final long lIIlIliill;
   public static final double llllIliill = 0.3;
   private final double IiIlIliill;
   private final double ilIlIliill;
   private final double IIllIliill;
   private final long iIIlIliill;
   private final double liIlIliill;
   public static final int lillIliill = 6;
   public static final double illlIliill = 0.07;

   public static IiIilillliIilill liiiIIllIl(
      long id,
      long mode,
      long eyeY,
      IIlIiiIilIlIiiIi stand,
      double eyeX,
      double reach,
      double eyeZ,
      lIlIIiiliIlIIiil hit,
      double target,
      long pose,
      iillilllIIililll geometryFingerprint
   ) {
      if (hit != null && stand != null && geometryFingerprint != null && target > 0.0) {
         if (geometryFingerprint.iliIiiliiiii() != stand || !geometryFingerprint.IilliliilIIi()) {
            return null;
         } else if (!iIlIlllllill(eyeY, reach, geometryFingerprint)) {
            return null;
         } else {
            double var19 = IilliliilIIi(eyeX, reach, eyeZ, hit);
            return var19 > target + 1.0E-9
               ? null
               : new IiIilillliIilill(id, mode, eyeY, stand, eyeX, reach, eyeZ, hit, target, var19, pose, geometryFingerprint);
         }
      } else {
         return null;
      }
   }

   public iillilllIIililll Iliilliiilii() {
      return this.IlllIliill;
   }

   public static double IilliliilIIi(double ex, double ey, double ez, lIlIIiiliIlIIiil h) {
      double var7 = h.iIlIlllllill() - ex;
      double var9 = h.IilliliilIIi() - ey;
      double var11 = h.lIiiIiIlilli() - ez;
      return Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public boolean IlIlllIlilIl(double x, double z) {
      return Math.hypot(x - this.ilIlIliill, z - this.liIlIliill) <= this.IlllIliill.IIillIiliIil() + 1.0E-9;
   }

   public lIlIIiiliIlIIiil IIlilIliiIli() {
      return this.iiIlIliill;
   }

   public double lIiiIiIlilli(double ez, double ey, double ex) {
      return IilliliilIIi(ez, ey, ex, this.iiIlIliill);
   }

   public double Illillliilli() {
      return this.IIllIliill;
   }

   public long Ililllililil() {
      return this.IlIlIliill;
   }

   public long IIiilIiiiIii() {
      return this.iIllIliill;
   }

   public boolean iliIiiliiiii(double ey, double ez, double ex) {
      return this.lIiiIiIlilli(ey, ez, ex) <= this.IIllIliill + 1.0E-9;
   }

   public IiIilillliIilill(
      long id,
      long target,
      long stand,
      IIlIiiIilIlIiiIi eyeMode,
      double eyeX,
      double eyeY,
      double eyeZ,
      lIlIIiiliIlIIiil hit,
      double reach,
      double plannerDistance,
      long geometryFingerprint,
      iillilllIIililll pose
   ) {
      this.lIIlIliill = id;
      this.iIIlIliill = target;
      this.IlIlIliill = stand;
      this.llIlIliill = eyeMode;
      this.ilIlIliill = eyeX;
      this.IiIlIliill = eyeY;
      this.liIlIliill = eyeZ;
      this.iiIlIliill = hit;
      this.IIllIliill = reach;
      this.lIllIliill = plannerDistance;
      this.iIllIliill = geometryFingerprint;
      this.IlllIliill = pose;
   }

   public static IiIilillliIilill IliIlllilIi(
      long geometryFingerprint,
      long eyeX,
      long id,
      IIlIiiIilIlIiiIi hit,
      double stand,
      double eyeZ,
      double eyeY,
      lIlIIiiliIlIIiil reach,
      double target,
      long mode
   ) {
      return liiiIIllIl(
         geometryFingerprint,
         eyeX,
         id,
         hit,
         stand,
         eyeZ,
         eyeY,
         reach,
         target,
         mode,
         hit == null ? null : iillilllIIililll.liiiIIllIl(hit, false, -1, reach == null ? -1 : reach.liiiIIllIl())
      );
   }

   public boolean IiIlliIliiIl(double eyeAboveFeet, boolean sneaking) {
      return this.IlllIliill.iIlIlllllill(eyeAboveFeet, sneaking);
   }

   public boolean IIIllIIliIIl(double x, double z) {
      return Math.abs(x - this.ilIlIliill) <= this.IlllIliill.Iilllilliill() + 1.0E-9
         && Math.abs(z - this.liIlIliill) <= this.IlllIliill.Iilllilliill() + 1.0E-9;
   }

   public double Iilililiiili() {
      return this.lIllIliill;
   }

   public long IIillIiliIil() {
      return this.iIIlIliill;
   }

   public double IlIillIiilIi() {
      return this.IiIlIliill;
   }

   public String Illlllllilll(double ex, double ez, double result, String ey) {
      return String.format(
         Locale.ROOT,
         Iiiiliiiiiii<"Iiiiliiiiiii","g1nEpZBzkQR/mjc5CnnWDQvp2ZoIqkj1YWFM1f9/3JyFR6JIFX+m987cU5pMlm0WbO86MyoII1LFkePvINciI4Cmwx786N8XhzbzXidxgQENRQ+m2CjCmJCtM1ZSSMidso036mSx/mBZw9JXTpsVD70B+dsjgS9fyb2DYsJjJrUacUYjxfo2WtV6g2jAMDdbtzr9nqr6gNwoTtgMc8MQjN00PjH9vihduXqmWTy4xT+uh1PJGzFvWVHHFbByWP6r2a//ELgpUSF2OaR/1OMYbgbu1M3hVBaX750=">(),
         this.ilIlIliill,
         this.IiIlIliill,
         this.liIlIliill,
         ex,
         ez,
         result,
         this.iiIlIliill.iIlIlllllill(),
         this.iiIlIliill.IilliliilIIi(),
         this.iiIlIliill.lIiiIiIlilli(),
         this.lIllIliill,
         this.lIiiIiIlilli(ex, ez, result),
         this.IIllIliill,
         this.llIlIliill,
         this.lIIlIliill,
         Long.toUnsignedString(this.iIllIliill),
         this.IlllIliill.lIiiIiIlilli(),
         ey
      );
   }

   public static boolean IIlllIlliIll(double tz, double ez, double ey, int ex, int ty, int reach, double tx) {
      double var11 = (double)ex + 0.5 - tz;
      double var13 = (double)ty + 0.5 - ez;
      double var15 = (double)reach + 0.5 - ey;
      return var11 * var11 + var13 * var13 + var15 * var15 > tx * tx;
   }

   public static boolean iIlIlllllill(long pose, double stand, iillilllIIililll eyeY) {
      return Math.abs(stand - ((double)llIiIiililIiIiil.IIlllIlliIll(pose) + eyeY.IiIlliIliiIl())) <= 1.0E-6;
   }

   public double IiIiliIiiiIi() {
      return this.liIlIliill;
   }

   public double IIIilIIiiIIi() {
      return this.ilIlIliill;
   }

   public IIlIiiIilIlIiiIi Iiilliiliiil() {
      return this.llIlIliill;
   }

   public long Iilllilliill() {
      return this.lIIlIliill;
   }
}
