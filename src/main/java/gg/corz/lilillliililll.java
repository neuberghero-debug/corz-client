package gg.corz;

import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2352;

public final class lilillliililll {
   public static final int llilllIIiililllIIi = 25;
   public static final double IiilllIIiliilllIIi = 0.3;
   public static final int iIilllIIiIlilllIIi = 700;
   public static final int IIilllIIilIilllIIi = 350;
   public static final int illlllIIiIillllIIi = 350;
   public static final int lillllIIiiillllIIi = 150;
   public static final int IlllllIIillllllIIi = 100;
   public static final double iiilllIIiIIIillIIi = 0.4;

   static boolean iliIiiliiiii(lilIIliilIIl b, IIIiliilIIilii y, class_2351 z, int ex, int normal, int ey, int ez, int x, int w) {
      long var21 = 194323611479678724L;
      long var23 = -6364646791546167806L;
      long var25 = -6001838229275965264L;
      long var27 = -8796647204045659747L;
      long var29 = -7239098690137887453L;
      long var31 = 7040327241639787322L;
      class_2351[] var9 = IiIIIlIiliIIIlIi.lIiiIiIlilli(z);
      var21 ^= ((long)iIIIlIlIIl(ex, normal, ey, var9[0]) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)iIIIlIlIIl(ex, normal, ey, var9[1]) ^ var21) & -1L >>> 32;
      var23 ^= ((long)y.liiiIIllIl(var9[0]) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)y.iIlIlllllill(var9[0]) ^ var23) & -1L >>> 32;
      var25 ^= ((long)y.liiiIIllIl(var9[1]) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)y.iIlIlllllill(var9[1]) ^ var25) & -1L >>> 32;

      for (long var39 = var27 ^ (-4294967296L ^ var27) & -1L << 32; (int)(var39 >>> 32) <= 1; var39 += 4294967296L) {
         if (iIlliIlIllliIl.liiiIIllIl((int)(var21 >>> 32) + (int)(var39 >>> 32), (int)(var23 >>> 32), (int)var23)) {
            for (var39 ^= ~var39 & -1L >>> 32; (int)var39 <= 1; var39 ^= (var39 ^ var39 + (long)1) & -1L >>> 32) {
               if (iIlliIlIllliIl.liiiIIllIl((int)var21 + (int)var39, (int)(var25 >>> 32), (int)var25)) {
                  var29 ^= ((long)ex << 32 ^ var29) & -1L << 32;
                  var29 ^= ((long)normal ^ var29) & -1L >>> 32;
                  var31 ^= ((long)ey << 32 ^ var31) & -1L << 32;
                  switch (var9[0]) {
                     case field_11048:
                        var29 ^= ((long)((int)(var21 >>> 32) + (int)(var39 >>> 32)) << 32 ^ var29) & -1L << 32;
                        break;
                     case field_11052:
                        var29 ^= ((long)((int)(var21 >>> 32) + (int)(var39 >>> 32)) ^ var29) & -1L >>> 32;
                        break;
                     case field_11051:
                        var31 ^= ((long)((int)(var21 >>> 32) + (int)(var39 >>> 32)) << 32 ^ var31) & -1L << 32;
                  }

                  switch (var9[1]) {
                     case field_11048:
                        var29 ^= ((long)((int)var21 + (int)var39) << 32 ^ var29) & -1L << 32;
                        break;
                     case field_11052:
                        var29 ^= ((long)((int)var21 + (int)var39) ^ var29) & -1L >>> 32;
                        break;
                     case field_11051:
                        var31 ^= ((long)((int)var21 + (int)var39) << 32 ^ var31) & -1L << 32;
                  }

                  if (((int)(var29 >>> 32) != ez || (int)var29 != x || (int)(var31 >>> 32) != w)
                     && b.liiiIIllIl((int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32))
                     && IilliliilIIi(b, y, z, (int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32))) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public static iiIIlIllIIlIlIll IIIilIIiiIIi(lilIIliilIIl cy, IIIiliilIIilii b, int w, int cz, int normal, class_2351 cx) {
      return IlIillIiilIi(cy, b, w, cz, normal, cx, null);
   }

   private static boolean Iilllilliill(lilIIliilIIl w, IIIiiillIIiiil r) {
      return IIIllIIliIIl(w, r.llIIillliilIIillli, r.IiIIillliliIIillli, r.iiIIillliIIlIillli, Illlllllilll(r));
   }

   static boolean lIiiIiIlilli(lilIIliilIIl w, IIIiliilIIilii normal, class_2351 b, int z, int x, int y) {
      class_2351[] var6 = IiIIIlIiliIIIlIi.lIiiIiIlilli(b);
      if (!iIlliIlIllliIl.liiiIIllIl(iIIIlIlIIl(z, x, y, var6[0]), normal.liiiIIllIl(var6[0]), normal.iIlIlllllill(var6[0]))) {
         return false;
      } else {
         return !iIlliIlIllliIl.liiiIIllIl(iIIIlIlIIl(z, x, y, var6[1]), normal.liiiIIllIl(var6[1]), normal.iIlIlllllill(var6[1]))
            ? false
            : w.liiiIIllIl(z, x, y) && IilliliilIIi(w, normal, b, z, x, y);
      }
   }

   static boolean iIlIlllllill(lilIIliilIIl ty, class_2351 tz, int footNormal, int tileNormal, int fz, int fy, int w, int tx, class_2351 fx) {
      boolean[] var9 = new boolean[]{false};
      IiIIIlIiliIIIlIi.IliIlllilIi(footNormal, tileNormal, fz, tz, (fxx, y, outside) -> {
         if (!var9[0] && ty.liiiIIllIl(fxx, y, outside) && !IiIIIlIiliIIIlIi.IilliliilIIi(fy, w, tx, fx, fxx, y, outside)) {
            var9[0] = true;
         }
      });
      return var9[0];
   }

   private static iiIIlIllIIlIlIll liiiIIllIl(
      lilIIliilIIl face, IIIiliilIIilii allowCovered, int z, int b, int x, class_2350 preferredNormal, class_2351 orderPenalty, int w, boolean y
   ) {
      long var21 = 9139551543461198999L;
      long var23 = -5027986300887219885L;
      long var25 = 3517238111081977647L;
      long var27 = -155238481359612297L;
      class_2351 var9 = preferredNormal.method_10166();
      class_2351 var10 = orderPenalty != null ? orderPenalty : var9;
      var21 ^= ((long)(var9 != var10 ? 1 : 0) << 32 ^ var21) & -1L << 32;
      class_2351[] var12 = IiIIIlIiliIIIlIi.lIiiIiIlilli(var9);
      var21 ^= ((long)iIlliIlIllliIl.liiiIIllIl(iIIIlIlIIl(z, b, x, var12[0]), allowCovered.liiiIIllIl(var12[0]), allowCovered.iIlIlllllill(var12[0])) ^ var21)
         & -1L >>> 32;
      var23 ^= (
            (long)iIlliIlIllliIl.liiiIIllIl(iIIIlIlIIl(z, b, x, var12[1]), allowCovered.liiiIIllIl(var12[1]), allowCovered.iIlIlllllill(var12[1])) << 32
               ^ var23
         )
         & -1L << 32;
      var23 ^= ((long)((int)(var21 >>> 32) == 0 && (int)var21 != 0 && (int)(var23 >>> 32) != 0 ? 1 : 0) ^ var23) & -1L >>> 32;
      int[] var16 = new int[3];
      boolean[] var17 = new boolean[]{false};
      IiIIIlIiliIIIlIi.IliIlllilIi(
         z,
         b,
         x,
         var9,
         (cx, cover, breaksPattern) -> {
            if (face.liiiIIllIl(cx, cover, breaksPattern)) {
               if (!offPlane && iliIiiliiiii(face, allowCovered, var10, cx, cover, breaksPattern, z, b, x)) {
                  var16[2]++;
               } else {
                  var16[0]++;
               }

               if (zx
                  && (cx != z || cover != b || breaksPattern != x)
                  && lIiiIiIlilli(face, allowCovered, var10, cx, cover, breaksPattern)
                  && iIlIlllllill(face, var10, cx, cover, breaksPattern, z, b, x, var9)) {
                  var17[0] = true;
               }
            } else if (!face.IliIlllilIi(cx, cover, breaksPattern) && face.iIlIlllllill(cx, cover, breaksPattern)) {
               var16[1]++;
            }
         }
      );
      var25 ^= ((long)(var16[0] == 0 ? 1 : 0) << 32 ^ var25) & -1L << 32;
      if ((int)(var25 >>> 32) == 0 || y && var16[2] != 0) {
         if ((int)(var21 >>> 32) != 0 && (int)(var25 >>> 32) == 0 && var17[0]) {
            return null;
         } else {
            var25 ^= ((long)((int)(var25 >>> 32) != 0 ? var16[2] * 25 : var16[0] * 100) ^ var25) & -1L >>> 32;
            var27 ^= (
                  (long)(
                           (int)var25
                              + ((int)var21 != 0 ? 350 : 0)
                              + ((int)(var23 >>> 32) != 0 ? 350 : 0)
                              - var16[1] * 150
                              - ((int)(var21 >>> 32) != 0 ? 350 : 0)
                              - w
                        )
                        << 32
                     ^ var27
               )
               & -1L << 32;
            return new iiIIlIllIIlIlIll(
               z,
               b,
               x,
               preferredNormal,
               var16[0],
               var16[2],
               var16[1],
               (boolean)((int)var21),
               (boolean)((int)(var23 >>> 32)),
               (int)(var27 >>> 32),
               (boolean)((int)(var25 >>> 32)),
               (boolean)((int)(var21 >>> 32))
            );
         }
      } else {
         return null;
      }
   }

   public static boolean IIiilIiiiIii(lilIIliilIIl cy, IIIiliilIIilii cz, int w, int cx, int b, class_2351 normal) {
      if (cy.liiiIIllIl(w, cx, b)) {
         return true;
      } else {
         boolean[] var6 = new boolean[]{false};
         IiIIIlIiliIIIlIi.IliIlllilIi(w, cx, b, normal, (cyx, wx, y) -> {
            if (!var6[0] && cy.liiiIIllIl(cyx, wx, y) && !iliIiiliiiii(cy, cz, normal, cyx, wx, y, w, cx, b)) {
               var6[0] = true;
            }
         });
         return var6[0];
      }
   }

   public static boolean IIIllIIliIIl(lilIIliilIIl z, int w, int x, int y, class_2350 f) {
      return !z.iIlIlllllill(w + f.method_10148(), x + f.method_10164(), y + f.method_10165());
   }

   public static iiIIlIllIIlIlIll IIillIiliIil(lilIIliilIIl r, IIIiliilIIilii b, IIIiiillIIiiil w) {
      return Ililllililil(r, b, w, false);
   }

   public static iiIIlIllIIlIlIll IiIlliIliiIl(lilIIliilIIl w, IIIiliilIIilii b, IIIiiillIIiiil r) {
      long var9 = -5396549002145321000L;
      long var11 = 8630142303195662444L;
      long var13 = 3246120474855052360L;
      iiIIlIllIIlIlIll var3 = Ililllililil(w, b, r, false);
      var9 ^= ((long)(r.iIIIillliIlIIillli && r.IIIIilllilIIIillli != null && Iilllilliill(w, r) ? 0 : 1) << 32 ^ var9) & -1L << 32;
      if (var3 == null && (int)(var9 >>> 32) != 0) {
         var3 = Ililllililil(w, b, r, true);
      }

      if (var3 == null) {
         return null;
      } else {
         var9 ^= ((long)(r.iIIIillliIlIIillli && var3.IilliliilIIi(r.llIIillliilIIillli, r.IiIIillliliIIillli, r.iiIIillliIIlIillli) ? 1 : 0) ^ var9)
            & -1L >>> 32;
         if ((int)var9 != 0 && r.IllIilllilllIillli != null && var3.IillIillll == r.IllIilllilllIillli) {
            return var3;
         } else {
            var11 ^= ((long)(r.IIIIilllilIIIillli != null && var3.IliIlllilIi() != r.IIIIilllilIIIillli ? 0 : 1) << 32 ^ var11) & -1L << 32;
            var11 ^= (
                  (long)(
                        r.lIlIillliiIlIillli != null
                              && r.iIIIillliIlIIillli
                              && r.lIlIillliiIlIillli.rank(var3.IlllIillll, var3.llllIillll, var3.illlIillll)
                                 > r.lIlIillliiIlIillli.rank(r.llIIillliilIIillli, r.IiIIillliliIIillli, r.iiIIillliIIlIillli)
                           ? 1
                           : 0
                     )
                     ^ var11
               )
               & -1L >>> 32;
            if (var3.iIlIlllllill() && (int)(var11 >>> 32) != 0 && (int)var11 == 0) {
               return var3;
            } else {
               var13 ^= (
                     (long)(
                              r.iIIIillliIlIIillli
                                    && Iiiiliiiiiii(
                                          r.iIlilllliIllilllli,
                                          r.lllilllliillilllli,
                                          r.Iilillllilililllli,
                                          r.llIIillliilIIillli,
                                          r.IiIIillliliIIillli,
                                          r.iiIIillliIIlIillli
                                       )
                                       <= r.illIillliIilIillli * r.illIillliIilIillli
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var13
                  )
                  & -1L << 32;
               return (int)(var13 >>> 32) != 0 && r.IIIIilllilIIIillli != null && IIlllIlliIll(w, r) ? null : var3;
            }
         }
      }
   }

   public static iiIIlIllIIlIlIll IlIillIiilIi(lilIIliilIIl cx, IIIiliilIIilii cz, int cy, int b, int w, class_2351 deeper, class_2350 normal) {
      long var16 = -6297688751544043040L;
      long var14 = -6574992922940623892L;
      class_2350 var7 = class_2350.method_10169(deeper, class_2352.field_11056);
      if (cx.liiiIIllIl(cy, b, w) && Iliilliiilii(cx, cy, b, w) && IilliliilIIi(cx, cz, deeper, cy, b, w)) {
         iiIIlIllIIlIlIll var8 = IliIlllilIi(cx, cz, cy, b, w, var7, deeper);
         if (var8 != null) {
            return IIlilIliiIli(cx, var8);
         }
      }

      iiIIlIllIIlIlIll[] var18 = new iiIIlIllIIlIlIll[]{null};
      int[] var9 = new int[]{Integer.MAX_VALUE};
      IiIIIlIiliIIIlIi.IliIlllilIi(cy, b, w, deeper, (normalx, cyx, czx) -> {
         long var14x = -7834947100345505712L;
         if (Iliilliiilii(cx, normalx, cyx, czx)) {
            iiIIlIllIIlIlIll var12 = IliIlllilIi(cx, cz, normalx, cyx, czx, var7, deeper);
            if (var12 != null && var12.IIilIillll <= 0) {
               var14x ^= ((long)((normalx - cy) * (normalx - cy) + (cyx - b) * (cyx - b) + (czx - w) * (czx - w)) << 32 ^ var14x) & -1L << 32;
               if (var18[0] == null || var12.IlilIillll > var18[0].IlilIillll || var12.IlilIillll == var18[0].IlilIillll && (int)(var14x >>> 32) < var9[0]) {
                  var18[0] = var12;
                  var9[0] = (int)(var14x >>> 32);
               }
            }
         }
      });
      if (var18[0] != null) {
         return IIlilIliiIli(cx, var18[0]);
      } else {
         var14 ^= (0L ^ var14) & -1L << 32;

         while ((int)(var14 >>> 32) <= (normal == null ? 0 : 1)) {
            var14 ^= ((long)(normal == null ? 0 : normal.method_10148() * (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
            long var21 = var16 ^ ((long)(normal == null ? 0 : normal.method_10164() * (int)(var14 >>> 32)) << 32 ^ var16) & -1L << 32;
            var16 = var21 ^ ((long)(normal == null ? 0 : normal.method_10165() * (int)(var14 >>> 32)) ^ var21) & -1L >>> 32;
            IiIIIlIiliIIIlIi.IliIlllilIi(
               cy + (int)var14,
               b + (int)(var16 >>> 32),
               w + (int)var16,
               deeper,
               (cyx, cxx, bestD) -> {
                  long var17 = -5988105568956470967L;
                  long var19x = -7054636117799140461L;
                  if (cz.IliIlllilIi(cyx, cxx, bestD) && Iliilliiilii(cx, cyx, cxx, bestD)) {
                     class_2350[] var11 = class_2350.values();
                     var17 ^= ((long)var11.length << 32 ^ var17) & -1L << 32;

                     for (long var22 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
                        class_2350 var14x = var11[(int)var22];
                        if (var14x.method_10166() != deeper && IIIllIIliIIl(cx, cyx, cxx, bestD, var14x)) {
                           iiIIlIllIIlIlIll var15 = IliIlllilIi(cx, cz, cyx, cxx, bestD, var14x, deeper);
                           if (var15 != null
                              && var15.IIilIillll <= 0
                              && (
                                 IiIIIlIiliIIIlIi.IilliliilIIi(cyx, cxx, bestD, var14x.method_10166(), cy, b, w)
                                    || IiIiliIiiiIi(cx, cy, b, w, deeper, cyx, cxx, bestD, var14x.method_10166())
                              )) {
                              var19x ^= ((long)((cyx - cy) * (cyx - cy) + (cxx - b) * (cxx - b) + (bestD - w) * (bestD - w)) << 32 ^ var19x) & -1L << 32;
                              if (var18[0] == null
                                 || var15.lillIillll > var18[0].lillIillll
                                 || var15.lillIillll == var18[0].lillIillll
                                    && (var15.IlilIillll > var18[0].IlilIillll || var15.IlilIillll == var18[0].IlilIillll && (int)(var19x >>> 32) < var9[0])) {
                                 var18[0] = var15;
                                 var9[0] = (int)(var19x >>> 32);
                              }
                           }
                        }
                     }
                  }
               }
            );
            var14 += 4294967296L;
         }

         return var18[0];
      }
   }

   private static boolean IiIiliIiiiIi(lilIIliilIIl groupNormal, int footNormal, int w, int gz, class_2351 fy, int fx, int gy, int gx, class_2351 fz) {
      boolean[] var9 = new boolean[]{false};
      IiIIIlIiliIIIlIi.IliIlllilIi(footNormal, w, gz, fy, (wx, fxx, hit) -> {
         if (!var9[0] && groupNormal.liiiIIllIl(wx, fxx, hit) && IiIIIlIiliIIIlIi.IilliliilIIi(fx, gy, gx, fz, wx, fxx, hit)) {
            var9[0] = true;
         }
      });
      return var9[0];
   }

   public static boolean IlIlllIlilIl(lilIIliilIIl x, double reach, double ex, double w, int ez, int y, int z, class_2350 f, double ey) {
      if (!IIIllIIliIIl(x, ez, y, z, f)) {
         return false;
      } else {
         double var13 = (double)ez + 0.5 + (double)f.method_10148() * 0.5;
         double var15 = (double)y + 0.5 + (double)f.method_10164() * 0.5;
         double var17 = (double)z + 0.5 + (double)f.method_10165() * 0.5;
         double var19 = reach - var13;
         double var21 = ex - var15;
         double var23 = w - var17;
         double var25 = var19 * (double)f.method_10148() + var21 * (double)f.method_10164() + var23 * (double)f.method_10165();
         if (var25 < 0.3) {
            return false;
         } else {
            double var27 = Math.sqrt(var19 * var19 + var21 * var21 + var23 * var23);
            return var27 > ey ? false : var25 / var27 >= 0.4;
         }
      }
   }

   private static iiIIlIllIIlIlIll IIlilIliiIli(lilIIliilIIl c, iiIIlIllIIlIlIll w) {
      if (IIIllIIliIIl(c, w.IlllIillll, w.llllIillll, w.illlIillll, w.IillIillll)) {
         return w;
      } else {
         class_2350 var2 = w.IillIillll.method_10153();
         return !IIIllIIliIIl(c, w.IlllIillll, w.llllIillll, w.illlIillll, var2)
            ? w
            : new iiIIlIllIIlIlIll(
               w.IlllIillll,
               w.llllIillll,
               w.illlIillll,
               var2,
               w.lillIillll,
               w.iillIillll,
               w.IIilIillll,
               w.lIilIillll,
               w.iIilIillll,
               w.IlilIillll,
               w.llilIillll,
               w.ililIillll
            );
      }
   }

   public static boolean IilliliilIIi(lilIIliilIIl w, IIIiliilIIilii normal, class_2351 b, int cy, int cx, int cz) {
      boolean[] var6 = new boolean[]{false};
      IiIIIlIiliIIIlIi.IliIlllilIi(cy, cx, cz, b, (spill, y, wx) -> {
         if (!var6[0] && !w.IliIlllilIi(spill, y, wx) && w.iIlIlllllill(spill, y, wx)) {
            var6[0] = true;
         }
      });
      return !var6[0];
   }

   public static boolean Iliilliiilii(lilIIliilIIl x, int z, int y, int w) {
      long var8 = 8999432189958374148L;
      if (x.liiiIIllIl(z, y, w) && !x.IilliliilIIi(z, y, w)) {
         class_2350[] var4 = class_2350.values();
         var8 ^= ((long)var4.length << 32 ^ var8) & -1L << 32;

         for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            class_2350 var7 = var4[(int)var11];
            if (!x.iIlIlllllill(z + var7.method_10148(), y + var7.method_10164(), w + var7.method_10165())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static double IIIIllIIIl(double v, double lo, double hi) {
      return v < lo ? lo : (v > hi ? hi : v);
   }

   private static boolean Iiilliiliiil(iiIIlIllIIlIlIll oTier, int d, double tier, iiIIlIllIIlIlIll c, int oDist, double r, IIIiiillIIiiil o) {
      long var11 = -7865320524757436458L;
      if (d != oDist) {
         return d < oDist;
      } else if (oTier.IlilIillll != c.IlilIillll) {
         return oTier.IlilIillll > c.IlilIillll;
      } else {
         var11 ^= ((long)(o.iIIIillliIlIIillli && oTier.IilliliilIIi(o.llIIillliilIIillli, o.IiIIillliliIIillli, o.iiIIillliIIlIillli) ? 1 : 0) << 32 ^ var11)
            & -1L << 32;
         var11 ^= ((long)(o.iIIIillliIlIIillli && c.IilliliilIIi(o.llIIillliilIIillli, o.IiIIillliliIIillli, o.iiIIillliIIlIillli) ? 1 : 0) ^ var11)
            & -1L >>> 32;
         if ((int)(var11 >>> 32) != (int)var11) {
            return (boolean)((int)(var11 >>> 32));
         } else if ((int)(var11 >>> 32) != 0
            && o.IllIilllilllIillli != null
            && oTier.IillIillll == o.IllIilllilllIillli != (c.IillIillll == o.IllIilllilllIillli)) {
            return oTier.IillIillll == o.IllIilllilllIillli;
         } else if (oTier.llllIillll != c.llllIillll) {
            return oTier.llllIillll > c.llllIillll;
         } else if (Math.abs(tier - r) > 1.0E-9) {
            return tier < r;
         } else if (oTier.IlllIillll != c.IlllIillll) {
            return oTier.IlllIillll < c.IlllIillll;
         } else {
            return oTier.illlIillll != c.illlIillll ? oTier.illlIillll < c.illlIillll : oTier.IillIillll.ordinal() < c.IillIillll.ordinal();
         }
      }
   }

   public static boolean Iilililiiili(
      lilIIliilIIl z, IIIiliilIIilii x, int w, int offPlaneLimit, int rank, class_2351 cover, iIIilillIlIilill inPlaneLimit, long b, long y
   ) {
      long var33 = 5067091917255855769L;
      long var35 = 6129855399146606641L;
      long var37 = 7741191650170724544L;
      long var29 = 915374398728606822L;
      long var31 = -3958163102382479694L;
      class_2351[] var11 = class_2351.values();
      var29 ^= ((long)var11.length << 32 ^ var29) & -1L << 32;

      for (long var40 = var29 ^ (0L ^ var29) & -1L >>> 32; (int)var40 < (int)(var40 >>> 32); var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
         class_2351 var14 = var11[(int)var40];
         long var15 = cover != null && var14 != cover ? y : b;
         class_2351[] var17 = IiIIIlIiliIIIlIi.lIiiIiIlilli(var14);
         var31 ^= (-4294967296L ^ var31) & -1L << 32;

         while ((int)(var31 >>> 32) <= 1) {
            for (var31 ^= ~var31 & -1L >>> 32; (int)var31 <= 1; var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
               var33 ^= ((long)w << 32 ^ var33) & -1L << 32;
               var33 ^= ((long)offPlaneLimit ^ var33) & -1L >>> 32;
               var35 ^= ((long)rank << 32 ^ var35) & -1L << 32;
               switch (var17[0]) {
                  case field_11048:
                     var33 ^= ((long)((int)(var33 >>> 32) + (int)(var31 >>> 32)) << 32 ^ var33) & -1L << 32;
                     break;
                  case field_11052:
                     var33 ^= ((long)((int)var33 + (int)(var31 >>> 32)) ^ var33) & -1L >>> 32;
                     break;
                  case field_11051:
                     var35 ^= ((long)((int)(var35 >>> 32) + (int)(var31 >>> 32)) << 32 ^ var35) & -1L << 32;
               }

               switch (var17[1]) {
                  case field_11048:
                     var33 ^= ((long)((int)(var33 >>> 32) + (int)var31) << 32 ^ var33) & -1L << 32;
                     break;
                  case field_11052:
                     var33 ^= ((long)((int)var33 + (int)var31) ^ var33) & -1L >>> 32;
                     break;
                  case field_11051:
                     var35 ^= ((long)((int)(var35 >>> 32) + (int)var31) << 32 ^ var35) & -1L << 32;
               }

               if (z.liiiIIllIl((int)(var33 >>> 32), (int)var33, (int)(var35 >>> 32))
                  && (inPlaneLimit == null || inPlaneLimit.rank((int)(var33 >>> 32), (int)var33, (int)(var35 >>> 32)) <= var15)) {
                  class_2352[] var23 = class_2352.values();
                  var35 ^= ((long)var23.length ^ var35) & -1L >>> 32;

                  for (var37 ^= (0L ^ var37) & -1L << 32; (int)(var37 >>> 32) < (int)var35; var37 += 4294967296L) {
                     class_2352 var26 = var23[(int)(var37 >>> 32)];
                     class_2350 var27 = class_2350.method_10169(var14, var26);
                     if (IIIllIIliIIl(z, (int)(var33 >>> 32), (int)var33, (int)(var35 >>> 32), var27)) {
                        iiIIlIllIIlIlIll var28 = IliIlllilIi(z, x, (int)(var33 >>> 32), (int)var33, (int)(var35 >>> 32), var27, cover);
                        if (var28 != null && var28.IIilIillll == 0 && !var28.llilIillll) {
                           return true;
                        }
                     }
                  }
               }
            }

            var31 += 4294967296L;
         }
      }

      return false;
   }

   private lilillliililll() {
   }

   public static iiIIlIllIIlIlIll IliIlllilIi(lilIIliilIIl b, IIIiliilIIilii w, int x, int face, int preferredNormal, class_2350 z, class_2351 y) {
      return liiiIIllIl(b, w, x, face, preferredNormal, z, y, 0, false);
   }

   private static class_2350 Illlllllilll(IIIiiillIIiiil r) {
      class_2350 var1 = r.IllIilllilllIillli;
      if (var1 == null) {
         class_2351 var2 = r.IIIIilllilIIIillli;

         double var3 = switch (var2) {
            case field_11048 -> r.iIlilllliIllilllli;
            case field_11052 -> r.lllilllliillilllli;
            case field_11051 -> r.Iilillllilililllli;
            default -> throw new MatchException(null, null);
         };
         double var5 = (double)iIIIlIlIIl(r.llIIillliilIIillli, r.IiIIillliliIIillli, r.iiIIillliIIlIillli, var2) + 0.5;
         var1 = class_2350.method_10169(var2, var3 >= var5 ? class_2352.field_11056 : class_2352.field_11060);
      }

      return var1;
   }

   public static boolean Illillliilli(lilIIliilIIl z, IIIiliilIIilii y, int w, int b, int x) {
      return Iilililiiili(z, y, w, b, x, null, null, Long.MAX_VALUE, Long.MAX_VALUE);
   }

   private static boolean IIlllIlliIll(lilIIliilIIl r, IIIiiillIIiiil w) {
      long var6 = 4568532888610864882L;
      long var8 = 6573239823473637027L;
      var6 ^= ((long)w.llIIillliilIIillli << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)w.IiIIillliliIIillli ^ var6) & -1L >>> 32;
      var8 ^= ((long)w.iiIIillliIIlIillli << 32 ^ var8) & -1L << 32;
      if (r.liiiIIllIl((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)) && !r.IilliliilIIi((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) {
         class_2350 var5 = Illlllllilll(w);
         return !Iilllilliill(r, w)
            ? false
            : !IlIlllIlilIl(
               r,
               w.iIlilllliIllilllli,
               w.lllilllliillilllli,
               w.Iilillllilililllli,
               (int)(var6 >>> 32),
               (int)var6,
               (int)(var8 >>> 32),
               var5,
               w.iililllliIIiilllli
            );
      } else {
         return false;
      }
   }

   public static iiIIlIllIIlIlIll Ililllililil(lilIIliilIIl allowCovered, IIIiliilIIilii b, IIIiiillIIiiil w, boolean r) {
      long var48 = -7544568665642404204L;
      long var50 = -3803090154857899075L;
      long var52 = -5854510705801118670L;
      long var38 = 5037596504474881094L;
      long var54 = -1491040590689140199L;
      long var40 = -5048407395172339906L;
      long var56 = -5902857241651134056L;
      long var42 = -136981828463421529L;
      long var44 = -1531070172455394862L;
      long var46 = 903983987258472827L;
      var38 ^= ((long)((int)Math.floor(w.iIlilllliIllilllli)) << 32 ^ var38) & -1L << 32;
      var38 ^= ((long)((int)Math.floor(w.lllilllliillilllli)) ^ var38) & -1L >>> 32;
      var40 ^= ((long)((int)Math.floor(w.Iilillllilililllli)) << 32 ^ var40) & -1L << 32;
      var40 ^= ((long)((int)Math.ceil(w.iililllliIIiilllli) + 1) ^ var40) & -1L >>> 32;
      var42 ^= ((long)Math.max(b.lliiIliIIl, (int)(var38 >>> 32) - (int)var40) << 32 ^ var42) & -1L << 32;
      var42 ^= ((long)Math.min(b.liiiIliIIl, (int)(var38 >>> 32) + (int)var40) ^ var42) & -1L >>> 32;
      var44 ^= ((long)Math.max(b.iliiIliIIl, (int)var38 - (int)var40) << 32 ^ var44) & -1L << 32;
      var44 ^= ((long)Math.min(b.iiiiIliIIl, (int)var38 + (int)var40) ^ var44) & -1L >>> 32;
      var46 ^= ((long)Math.max(b.IiiiIliIIl, (int)(var40 >>> 32) - (int)var40) << 32 ^ var46) & -1L << 32;
      var46 ^= ((long)Math.min(b.IIIIlliIIl, (int)(var40 >>> 32) + (int)var40) ^ var46) & -1L >>> 32;
      double var14 = w.iililllliIIiilllli * w.iililllliIIiilllli;
      var48 ^= ((long)(w.lIlIillliiIlIillli != null && w.iIIIillliIlIIillli ? 1 : 0) << 32 ^ var48) & -1L << 32;
      long var17 = (int)(var48 >>> 32) != 0 ? w.lIlIillliiIlIillli.rank(w.llIIillliilIIillli, w.IiIIillliliIIillli, w.iiIIillliIIlIillli) : 0L;
      iiIIlIllIIlIlIll var19 = null;
      var48 ^= (0L ^ var48) & -1L >>> 32;
      double var21 = 0.0;
      var50 ^= ((long)((int)var44) << 32 ^ var50) & -1L << 32;

      while ((int)(var50 >>> 32) >= (int)(var44 >>> 32)) {
         for (var50 ^= ((long)((int)(var42 >>> 32)) ^ var50) & -1L >>> 32; (int)var50 <= (int)var42; var50 ^= (var50 ^ var50 + (long)1) & -1L >>> 32) {
            for (var52 ^= ((long)((int)(var46 >>> 32)) << 32 ^ var52) & -1L << 32; (int)(var52 >>> 32) <= (int)var46; var52 += 4294967296L) {
               if (allowCovered.liiiIIllIl((int)var50, (int)(var50 >>> 32), (int)(var52 >>> 32))
                  && !allowCovered.IilliliilIIi((int)var50, (int)(var50 >>> 32), (int)(var52 >>> 32))) {
                  double var26 = Iiiiliiiiiii(
                     w.iIlilllliIllilllli, w.lllilllliillilllli, w.Iilillllilililllli, (int)var50, (int)(var50 >>> 32), (int)(var52 >>> 32)
                  );
                  if (!(var26 > var14)) {
                     long var28 = (int)(var48 >>> 32) != 0 ? w.lIlIillliiIlIillli.rank((int)var50, (int)(var50 >>> 32), (int)(var52 >>> 32)) : 0L;
                     if ((int)(var48 >>> 32) == 0 || w.IIiIilllilIiIillli < 0L || var28 <= var17 + w.IIiIilllilIiIillli) {
                        var52 ^= ((long)((int)(var48 >>> 32) != 0 && var28 > var17 ? 700 : 0) ^ var52) & -1L >>> 32;
                        class_2350[] var31 = class_2350.values();
                        var54 ^= ((long)var31.length << 32 ^ var54) & -1L << 32;

                        for (var54 ^= (0L ^ var54) & -1L >>> 32; (int)var54 < (int)(var54 >>> 32); var54 ^= (var54 ^ var54 + (long)1) & -1L >>> 32) {
                           class_2350 var34 = var31[(int)var54];
                           if (IlIlllIlilIl(
                              allowCovered,
                              w.iIlilllliIllilllli,
                              w.lllilllliillilllli,
                              w.Iilillllilililllli,
                              (int)var50,
                              (int)(var50 >>> 32),
                              (int)(var52 >>> 32),
                              var34,
                              w.iililllliIIiilllli
                           )) {
                              var56 ^= ((long)(w.IIIIilllilIIIillli != null && var34.method_10166() != w.IIIIilllilIIIillli ? 1 : 0) << 32 ^ var56) & -1L << 32;
                              iiIIlIllIIlIlIll var36 = liiiIIllIl(
                                 allowCovered, b, (int)var50, (int)(var50 >>> 32), (int)(var52 >>> 32), var34, w.IIIIilllilIIIillli, (int)var52, r
                              );
                              if (var36 != null
                                 && (var36.IIilIillll <= 0 || !w.iIiIillliIliIillli && ((int)(var56 >>> 32) == 0 || !w.lilIillliiilIillli))
                                 && (
                                    w.liiilllliiiiilllli
                                       || !IiIIIlIiliIIIlIi.IilliliilIIi(
                                          (int)var50,
                                          (int)(var50 >>> 32),
                                          (int)(var52 >>> 32),
                                          var34.method_10166(),
                                          w.lIiilllliiIiilllli,
                                          w.Iliillllilliilllli - 1,
                                          w.iliilllliIiiilllli
                                       )
                                 )) {
                                 var56 ^= ((long)((int)(var50 >>> 32) >= w.Iliillllilliilllli ? 0 : 1) ^ var56) & -1L >>> 32;
                                 if (var19 == null || Iiilliiliiil(var36, (int)var56, var26, var19, (int)var48, var21, w)) {
                                    var19 = var36;
                                    var48 ^= ((long)((int)var56) ^ var48) & -1L >>> 32;
                                    var21 = var26;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var50 += -4294967296L;
      }

      return var19;
   }

   public static double Iiiiliiiiiii(double x, double y, double ex, int ez, int ey, int z) {
      double var9 = IIIIllIIIl(x, (double)ez, (double)ez + 1.0);
      double var11 = IIIIllIIIl(y, (double)ey, (double)ey + 1.0);
      double var13 = IIIIllIIIl(ex, (double)z, (double)z + 1.0);
      double var15 = x - var9;
      double var17 = y - var11;
      double var19 = ex - var13;
      return var15 * var15 + var17 * var17 + var19 * var19;
   }

   static int iIIIlIlIIl(int x, int y, int a, class_2351 z) {
      return switch (z) {
         case field_11048 -> x;
         case field_11052 -> y;
         case field_11051 -> a;
         default -> throw new MatchException(null, null);
      };
   }
}
