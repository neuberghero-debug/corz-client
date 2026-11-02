package gg.corz;

import java.util.List;
import net.minecraft.class_243;

public final class iiliillIIiiill {
   private static final double lllllllIiillllllIi = 0.001;
   private static final double lIillllIiiIillllIi = 0.3;
   private static final double iilllllIiIIillllIi = 0.5;
   private int liillllIiiiillllIi = -1;
   private static final int IilllllIililllllIi = 6;
   static final double iIlllllIiIllllllIi = 1.0;
   private static final double IlillllIillillllIi = 0.08;
   static final double IIlllllIilIlllllIi = 0.4;
   private List<iillIilIIilIil> ilillllIiIiillllIi;

   private static int IiIiliIiiiIi(List<iillIilIIilIil> path, class_243 pos) {
      long var9 = 2048510904393496566L;
      long var11 = 4904291876342348419L;
      var9 ^= ((long)path.size() << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) < 2) {
         return (int)(var9 >>> 32);
      } else {
         var9 ^= (1L ^ var9) & -1L >>> 32;
         double var4 = Double.MAX_VALUE;

         for (long var15 = var11 ^ (4294967296L ^ var11) & -1L << 32;
            (int)(var15 >>> 32) < (int)(var9 >>> 32) && (int)(var15 >>> 32) <= 6;
            var15 += 4294967296L
         ) {
            double var7 = IIIilIIiiIIi(path, (int)(var15 >>> 32), pos);
            if (var7 < var4 - 1.0E-9) {
               var4 = var7;
               var9 ^= ((long)((int)(var15 >>> 32)) ^ var9) & -1L >>> 32;
            }
         }

         return (int)var9;
      }
   }

   static double IIlilIliiIli(double ax, double px, double az, double bx, double bz, double pz) {
      double var12 = bz - az;
      double var14 = pz - bx;
      double var16 = var12 * var12 + var14 * var14;
      double var18 = var16 < 1.0E-12 ? 0.0 : Math.max(0.0, Math.min(1.0, ((ax - az) * var12 + (px - bx) * var14) / var16));
      return Math.hypot(ax - (az + var12 * var18), px - (bx + var14 * var18));
   }

   public static boolean lIiiIiIlilli(IlIIlIilllIIlIil maxLen, class_243 w, class_243 to, boolean maxDrop, double from, int allowJump) {
      return !Double.isNaN(IIIllIIliIIl(maxLen, w, to, maxDrop, from, allowJump));
   }

   public static double IlIlllIlilIl(IlIIlIilllIIlIil z, double maxDrop, double x, double feetY, int w) {
      return IIIiIllIIiIl.IIIllIIliIIl(z, (int)Math.floor(maxDrop), (int)Math.floor(x), feetY, 1.0, Math.max(0, w));
   }

   public void liiiIIllIl() {
      this.ilillllIiIiillllIi = null;
      this.liillllIiiiillllIi = -1;
   }

   public static double IIIllIIliIIl(IlIIlIilllIIlIil maxDrop, class_243 w, class_243 maxLen, boolean from, double allowJump, int to) {
      long var40 = -1618541884975162514L;
      long var42 = 7496285968324260833L;
      long var44 = -6057565441665784295L;
      if (maxDrop != null && w != null && maxLen != null && Illillliilli(w) && Illillliilli(maxLen)) {
         double var7 = maxLen.field_1352 - w.field_1352;
         double var9 = maxLen.field_1350 - w.field_1350;
         double var11 = Math.hypot(var7, var9);
         if (var11 < 1.0E-6) {
            double var46 = IlIlllIlilIl(maxDrop, w.field_1352, w.field_1350, w.field_1351, to);
            return Double.isFinite(var46) ? var46 : w.field_1351;
         } else {
            double var13 = Math.min(var11, allowJump);
            var40 ^= ((long)Math.max(1, (int)Math.ceil(var13 / 0.4)) << 32 ^ var40) & -1L << 32;
            double var16 = w.field_1351;
            double var18 = w.field_1352;
            double var20 = w.field_1350;
            long var22 = IIIiIllIIiIl.iIlIlllllill((int)Math.floor(w.field_1352), IIIiIllIIiIl.lIiiIiIlilli(w.field_1351), (int)Math.floor(w.field_1350));

            for (long var48 = var40 ^ (1L ^ var40) & -1L >>> 32; (int)var48 <= (int)(var48 >>> 32); var48 ^= (var48 ^ var48 + (long)1) & -1L >>> 32) {
               double var25 = var13 * (double)((int)var48) / (double)((int)(var48 >>> 32)) / var11;
               double var27 = w.field_1352 + var7 * var25;
               double var29 = w.field_1350 + var9 * var25;
               double var31 = IlIlllIlilIl(maxDrop, var27, var29, var16, to);
               if (!Double.isFinite(var31)) {
                  return Double.NaN;
               }

               double var33 = var31 - var16;
               if (var33 > 1.001) {
                  return Double.NaN;
               }

               if (var33 > 0.601) {
                  if (!from) {
                     return Double.NaN;
                  }

                  if (maxDrop.IliIlllilIi((int)Math.floor(var18), IIIiIllIIiIl.lIiiIiIlilli(var16) + 2, (int)Math.floor(var20))) {
                     return Double.NaN;
                  }
               }

               long var49 = var42 ^ ((long)((int)Math.floor(var27)) << 32 ^ var42) & -1L << 32;
               var42 = var49 ^ ((long)IIIiIllIIiIl.lIiiIiIlilli(var31) ^ var49) & -1L >>> 32;
               var44 ^= ((long)((int)Math.floor(var29)) << 32 ^ var44) & -1L << 32;
               long var38 = IIIiIllIIiIl.iIlIlllllill((int)(var42 >>> 32), (int)var42, (int)(var44 >>> 32));
               if (var38 != var22) {
                  var22 = var38;
                  if ((maxDrop.iIlIlllllill((int)(var42 >>> 32), (int)var42, (int)(var44 >>> 32)) & 1309) != 0) {
                     return Double.NaN;
                  }
               }

               var16 = var31;
               var18 = var27;
               var20 = var29;
            }

            return var16;
         }
      } else {
         return Double.NaN;
      }
   }

   private boolean Illlllllilll(
      iillIilIIilIil inWater, iillIilIIilIil pos, class_243 vel, class_243 collided, boolean cur, boolean next, boolean world, IlIIlIilllIIlIil onGround
   ) {
      long var16 = 4628215786579774091L;
      if (world && pos.iliIiiliiiii() > inWater.iliIiiliiiii() + 0.001) {
         return true;
      } else if (cur && !Ililllililil(onGround, vel)) {
         iIIIliIlIIli var9 = pos.IIIllIIliIIl();
         if (var9 == iIIIliIlIIli.iIililIIlIlililIIl) {
            return next || Iilllilliill(vel, inWater, pos) <= 0.45000000100000004;
         } else if (var9 != iIIIliIlIIli.IiililIIlliililIIl && var9 != iIIIliIlIIli.iiililIIlIIIiilIIl) {
            return false;
         } else {
            var16 ^= ((long)Integer.signum(pos.iIlIlllllill() - inWater.iIlIlllllill()) << 32 ^ var16) & -1L << 32;
            var16 ^= ((long)Integer.signum(pos.lIiiIiIlilli() - inWater.lIiiIiIlilli()) ^ var16) & -1L >>> 32;
            double var12 = collided == null ? 0.0 : collided.field_1352 * (double)((int)(var16 >>> 32)) + collided.field_1350 * (double)((int)var16);
            double var14 = IIillIiliIil(vel, inWater, (int)(var16 >>> 32), (int)var16);
            return var14 > 0.250000001 ? false : var12 >= 0.199999999 || var14 <= 0.08 && var12 > -0.001;
         }
      } else {
         return false;
      }
   }

   static double IIillIiliIil(class_243 cur, iillIilIIilIil pos, int sz, int sx) {
      if (sz > 0) {
         return (double)pos.iIlIlllllill() + 1.0 - cur.field_1352;
      } else if (sz < 0) {
         return cur.field_1352 - (double)pos.iIlIlllllill();
      } else if (sx > 0) {
         return (double)pos.lIiiIiIlilli() + 1.0 - cur.field_1350;
      } else {
         return sx < 0 ? cur.field_1350 - (double)pos.lIiiIiIlilli() : Double.POSITIVE_INFINITY;
      }
   }

   private static boolean IlIillIiilIi(iillIilIIilIil onGround, class_243 pos, boolean nd) {
      double var3 = Math.hypot(onGround.IliIlllilIi() - pos.field_1352, onGround.liiiIIllIl() - pos.field_1350);
      return var3 <= 0.35 && pos.field_1351 >= onGround.iliIiiliiiii() - 0.6
         ? true
         : onGround.IIIllIIliIIl() == iIIIliIlIIli.llililIIlilililIIl && nd && pos.field_1351 <= onGround.iliIiiliiiii() + 0.1 && var3 <= 1.0;
   }

   public List<iillIilIIilIil> IilliliilIIi() {
      return this.ilillllIiIiillllIi;
   }

   private void Iiilliiliiil(List<iillIilIIilIil> onGround, class_243 pos, boolean path) {
      long var13 = -278148182724746608L;
      long var15 = -7458282343956691894L;
      var13 ^= ((long)onGround.size() << 32 ^ var13) & -1L << 32;

      while (this.liillllIiiiillllIi < (int)(var13 >>> 32)) {
         if (IlIillIiilIi((iillIilIIilIil)onGround.get(this.liillllIiiiillllIi), pos, path)) {
            this.liillllIiiiillllIi++;
         } else {
            double var5 = IIIilIIiiIIi(onGround, this.liillllIiiiillllIi, pos);
            var13 ^= ((long)this.liillllIiiiillllIi ^ var13) & -1L >>> 32;
            double var8 = var5 - 0.3;

            for (var15 ^= ((long)(this.liillllIiiiillllIi + 1) << 32 ^ var15) & -1L << 32;
               (int)(var15 >>> 32) < (int)(var13 >>> 32) && (int)(var15 >>> 32) < this.liillllIiiiillllIi + 4;
               var15 += 4294967296L
            ) {
               double var11 = IIIilIIiiIIi(onGround, (int)(var15 >>> 32), pos);
               if (var11 < var8 - 1.0E-9) {
                  var8 = var11;
                  var13 ^= ((long)((int)(var15 >>> 32)) ^ var13) & -1L >>> 32;
               }
            }

            if ((int)var13 == this.liillllIiiiillllIi) {
               return;
            }

            this.liillllIiiiillllIi = (int)var13;
         }
      }
   }

   private static boolean Illillliilli(class_243 v) {
      return Double.isFinite(v.field_1352) && Double.isFinite(v.field_1351) && Double.isFinite(v.field_1350);
   }

   static double Iilllilliill(class_243 next, iillIilIIilIil cur, iillIilIIilIil pos) {
      long var5 = -7183664316846132964L;
      var5 ^= ((long)Integer.signum(pos.iIlIlllllill() - cur.iIlIlllllill()) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Integer.signum(pos.lIiiIiIlilli() - cur.lIiiIiIlilli()) ^ var5) & -1L >>> 32;
      if ((int)(var5 >>> 32) > 0) {
         return (double)pos.iIlIlllllill() - next.field_1352;
      } else if ((int)(var5 >>> 32) < 0) {
         return next.field_1352 - ((double)pos.iIlIlllllill() + 1.0);
      } else if ((int)var5 > 0) {
         return (double)pos.lIiiIiIlilli() - next.field_1350;
      } else {
         return (int)var5 < 0 ? next.field_1350 - ((double)pos.lIiiIiIlilli() + 1.0) : Double.POSITIVE_INFINITY;
      }
   }

   public static boolean iliIiiliiiii(IlIIlIilllIIlIil to, class_243 from, class_243 maxDrop, boolean allowJump, double maxLen, int w) {
      double var7 = IIIllIIliIIl(to, from, maxDrop, allowJump, maxLen, w);
      if (Double.isNaN(var7)) {
         return false;
      } else {
         return Math.hypot(maxDrop.field_1352 - from.field_1352, maxDrop.field_1350 - from.field_1350) > maxLen
            ? true
            : Math.abs(var7 - maxDrop.field_1351) <= 0.601;
      }
   }

   private static boolean IIlllIlliIll(iIIIliIlIIli m) {
      return m == iIIIliIlIIli.llililIIlilililIIl
         || m == iIIIliIlIIli.IiililIIlliililIIl
         || m == iIIIliIlIIli.iiililIIlIIIiilIIl
         || m == iIIIliIlIIli.iIililIIlIlililIIl;
   }

   public int iIlIlllllill() {
      return this.liillllIiiiillllIi;
   }

   private static double IIIilIIiiIIi(List<iillIilIIilIil> k, int pos, class_243 path) {
      iillIilIIilIil var3 = (iillIilIIilIil)k.get(pos - 1);
      iillIilIIilIil var4 = (iillIilIIilIil)k.get(pos);
      return IIlilIliiIli(path.field_1352, path.field_1350, var3.IliIlllilIi(), var3.liiiIIllIl(), var4.IliIlllilIi(), var4.liiiIIllIl())
         + 0.5 * Math.min(Math.abs(path.field_1351 - var3.iliIiiliiiii()), Math.abs(path.field_1351 - var4.iliIiiliiiii()));
   }

   private int IiIlliIliiIl(List<iillIilIIilIil> path, class_243 world, IlIIlIilllIIlIil pos, int maxDrop) {
      long var10 = -5818735235545053102L;
      long var12 = -8186433172380499209L;
      var10 ^= ((long)path.size() << 32 ^ var10) & -1L << 32;
      if (IIlllIlliIll(((iillIilIIilIil)path.get(this.liillllIiiiillllIi)).IIIllIIliIIl())) {
         return this.liillllIiiiillllIi;
      } else {
         var10 ^= ((long)this.liillllIiiiillllIi ^ var10) & -1L >>> 32;

         for (var12 ^= ((long)(this.liillllIiiiillllIi + 1) << 32 ^ var12) & -1L << 32;
            (int)(var12 >>> 32) < (int)(var10 >>> 32)
               && (int)(var12 >>> 32) < this.liillllIiiiillllIi + 4
               && !IIlllIlliIll(((iillIilIIilIil)path.get((int)(var12 >>> 32))).IIIllIIliIIl());
            var12 += 4294967296L
         ) {
            var10 ^= ((long)((int)(var12 >>> 32)) ^ var10) & -1L >>> 32;
         }

         var12 ^= ((long)Math.min(Math.max(0, maxDrop), 1) << 32 ^ var12) & -1L << 32;

         for (long var18 = var12 ^ ((long)((int)var10) ^ var12) & -1L >>> 32;
            (int)var18 > this.liillllIiiiillllIi;
            var18 ^= (var18 ^ var18 + (long)-1) & -1L >>> 32
         ) {
            iillIilIIilIil var9 = (iillIilIIilIil)path.get((int)var18);
            if (iliIiiliiiii(pos, world, new class_243(var9.IliIlllilIi(), var9.iliIiiliiiii(), var9.liiiIIllIl()), true, 16.0, (int)(var18 >>> 32))) {
               return (int)var18;
            }
         }

         return this.liillllIiiiillllIi;
      }
   }

   private static boolean Ililllililil(IlIIlIilllIIlIil pos, class_243 world) {
      return pos == null
         ? false
         : pos.IliIlllilIi((int)Math.floor(world.field_1352), IIIiIllIIiIl.lIiiIiIlilli(world.field_1351) + 2, (int)Math.floor(world.field_1350));
   }

   public illiIiIlIiliIiIl IliIlllilIi(
      List<iillIilIIilIil> collided, class_243 pos, class_243 world, boolean path, boolean onGround, boolean vel, IlIIlIilllIIlIil inWater, int maxDrop
   ) {
      long var32 = -2265222334024000868L;
      long var34 = 6276652477001995324L;
      long var36 = 664220948037023312L;
      if (collided != null && !collided.isEmpty() && pos != null) {
         var32 ^= ((long)collided.size() << 32 ^ var32) & -1L << 32;
         if (collided != this.ilillllIiIiillllIi || this.liillllIiiiillllIi < 0) {
            this.ilillllIiIiillllIi = collided;
            this.liillllIiiiillllIi = IiIiliIiiiIi(collided, pos);
         }

         this.Iiilliiliiil(collided, pos, path);
         if (this.liillllIiiiillllIi >= (int)(var32 >>> 32)) {
            return new illiIiIlIiliIiIl(false, 0.0, 0.0, false, false, true, false, (int)(var32 >>> 32), 0.0, null);
         } else {
            iillIilIIilIil var10 = (iillIilIIilIil)collided.get(this.liillllIiiiillllIi - 1);
            iillIilIIilIil var11 = (iillIilIIilIil)collided.get(this.liillllIiiiillllIi);
            double var12 = IIlilIliiIli(pos.field_1352, pos.field_1350, var10.IliIlllilIi(), var10.liiiIIllIl(), var11.IliIlllilIi(), var11.liiiIIllIl());
            var32 ^= ((long)(!(var12 > 1.5) && !(pos.field_1351 < var11.iliIiiliiiii() - 2.5) ? 0 : 1) ^ var32) & -1L >>> 32;
            double var15 = Math.hypot(var11.IliIlllilIi() - pos.field_1352, var11.liiiIIllIl() - pos.field_1350);

            for (var34 ^= ((long)this.liillllIiiiillllIi << 32 ^ var34) & -1L << 32; (int)(var34 >>> 32) + 1 < (int)(var32 >>> 32); var34 += 4294967296L) {
               iillIilIIilIil var18 = (iillIilIIilIil)collided.get((int)(var34 >>> 32));
               iillIilIIilIil var19 = (iillIilIIilIil)collided.get((int)(var34 >>> 32) + 1);
               var15 += Math.hypot(var19.IliIlllilIi() - var18.IliIlllilIi(), var19.liiiIIllIl() - var18.liiiIIllIl());
            }

            var34 ^= ((long)this.IiIlliIliiIl(collided, pos, inWater, maxDrop) << 32 ^ var34) & -1L << 32;
            iillIilIIilIil var38 = (iillIilIIilIil)collided.get((int)(var34 >>> 32));
            double var39 = var38.IliIlllilIi() - pos.field_1352;
            double var21 = var38.liiiIIllIl() - pos.field_1350;
            double var23 = Math.hypot(var39, var21);
            var34 ^= ((long)(var23 > 0.001 ? 1 : 0) ^ var34) & -1L >>> 32;
            double var26 = (int)var34 != 0 ? var39 / var23 : 0.0;
            double var28 = (int)var34 != 0 ? var21 / var23 : 0.0;
            var36 ^= ((long)this.Illlllllilll(var10, var11, pos, world, path, onGround, vel, inWater) << 32 ^ var36) & -1L << 32;
            var36 ^= ((long)((int)var34 == 0 || !(var15 >= 2.0) && var11.IIIllIIliIIl() != iIIIliIlIIli.iiililIIlIIIiilIIl ? 0 : 1) ^ var36) & -1L >>> 32;
            if ((int)var36 != 0
               && var11.IIIllIIliIIl() == iIIIliIlIIli.llililIIlilililIIl
               && Math.hypot(var11.IliIlllilIi() - pos.field_1352, var11.liiiIIllIl() - pos.field_1350) < 1.5) {
               var36 ^= (0L ^ var36) & -1L >>> 32;
            }

            return new illiIiIlIiliIiIl(
               (boolean)((int)var34),
               var26,
               var28,
               (boolean)((int)(var36 >>> 32)),
               (boolean)((int)var36),
               false,
               (boolean)((int)var32),
               this.liillllIiiiillllIi,
               var15,
               var11.IIIllIIliIIl()
            );
         }
      } else {
         return new illiIiIlIiliIiIl(false, 0.0, 0.0, false, false, true, false, 0, 0.0, null);
      }
   }
}
