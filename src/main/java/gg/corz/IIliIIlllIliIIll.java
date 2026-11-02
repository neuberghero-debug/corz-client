package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public final class IIliIIlllIliIIll {
   public static final double llIIiIllll = 4.4;
   public static final int IIlIiIllll = 3;
   public static final double IlIIiIllll = 4.0;
   public static final double iIlIiIllll = 10.0;
   public static final int iiIIiIllll = 5;
   public static final double ilIIiIllll = 3.0;
   public static final int liIIiIllll = 3;
   public static final int lIlIiIllll = 2;
   public static final double iIIIiIllll = 2.5;
   public static final double lllIiIllll = 0.1;
   public static final double IllIiIllll = 2.0;
   public static final int IiIIiIllll = 2;

   public static lilIllliilIlll liiiIIllIl(liiiiIiiiiiiIi obsidian, IiIiiIlliIiiIl box, class_2350 d, boolean v) {
      if (obsidian != null && box != null && box.IIIllIIliIIl() != null && d != null) {
         class_2338 var4 = box.IIIllIIliIIl().method_10093(d);
         if (obsidian.IliIlllilIi(var4)) {
            return null;
         } else {
            class_2338 var5 = var4.method_10093(d);
            if (!obsidian.Illlllllilll(var5)) {
               return null;
            } else {
               class_2338 var6 = var5.method_10074();
               if (obsidian.IIIllIIliIIl(var6)) {
                  return new lilIllliilIlll(d, var4, var5, var6, false);
               } else {
                  return v && obsidian.Illlllllilll(var6) && obsidian.Iilllilliill(var6.method_10074()) ? new lilIllliilIlll(d, var4, var5, var6, true) : null;
               }
            }
         }
      } else {
         return null;
      }
   }

   public static iiIIilIiIIlIilIi IIIllIIliIIl(liiiiIiiiiiiIi preAlive, IiIiiIlliIiiIl opened, class_2338 box, long pre, lilIllliilIlll sinceOpen, boolean v) {
      long var9 = 1534608542640661327L;
      if (preAlive != null && opened != null && opened.IIIllIIliIIl() != null && box != null) {
         class_2338 var7 = opened.IIIllIIliIIl();
         if (box.method_10263() == var7.method_10263() && box.method_10260() == var7.method_10260()) {
            if (box.method_10264() < var7.method_10264()) {
               return new iiIIilIiIIlIilIi(ilIIIlilIiIIIlil.ilIliilIil, null, box);
            }

            if (box.method_10264() >= var7.method_10264() + 2) {
               return new iiIIilIiIIlIilIi(ilIIIlilIiIIIlil.llIliilIil, var7.method_10086(2), box);
            }
         }

         if (pre <= 0L && v && sinceOpen != null && sinceOpen.liiiIIllIl().equals(box)) {
            return new iiIIilIiIIlIilIi(ilIIIlilIiIIIlil.lIIliilIil, sinceOpen.IilliliilIIi(), box);
         } else if (pre > 5L) {
            return iiIIilIiIIlIilIi.IiiliIlIIi;
         } else {
            var9 ^= ((long)(box.method_10264() == var7.method_10264() ? 1 : 0) << 32 ^ var9) & -1L << 32;
            return (int)(var9 >>> 32) != 0 && preAlive.IIIllIIliIIl(box.method_10074())
               ? new iiIIilIiIIlIilIi(ilIIIlilIiIIIlil.iIIliilIil, box.method_10074(), box)
               : new iiIIilIiIIlIilIi(ilIIIlilIiIIIlil.IlIliilIil, box, box);
         }
      } else {
         return iiIIilIiIIlIilIi.IiiliIlIIi;
      }
   }

   static boolean iliIiiliiiii(liiiiIiiiiiiIi sd, class_243 eye, lilIllliilIlll v) {
      class_2338 var3 = v.IilliliilIIi();
      if (v.lIiiIiIlilli()) {
         class_2338 var4 = var3.method_10074();
         class_243 var5 = new class_243((double)var4.method_10263() + 0.5, (double)var4.method_10264() + 1.0 - 0.02, (double)var4.method_10260() + 0.5);
         if (eye.method_1022(var5) > 4.4 || !IlIIlIIlllIIlIIl.IiIlliIliiIl(sd, eye, var5, var4, null)) {
            return false;
         }
      } else {
         class_243 var6 = new class_243((double)var3.method_10263() + 0.5, (double)var3.method_10264() + 1.0 - 0.02, (double)var3.method_10260() + 0.5);
         if (eye.method_1022(var6) > 4.4 || !IlIIlIIlllIIlIIl.IiIlliIliiIl(sd, eye, var6, var3, null)) {
            return false;
         }
      }

      return iIiIlllIliIlll.Iliilliiilii(eye, iIiIlllIliIlll.IIiilIiiiIii(var3)) <= 3.0;
   }

   public static lliIliliIl iIlIlllllill(liiiiIiiiiiiIi obsidian, IiIiiIlliIiiIl v, class_243 self, class_2338 digWall, boolean box) {
      long var27 = 8639060155716103664L;
      long var29 = 1818524810054734658L;
      long var31 = -3585003753719077320L;
      if (obsidian != null && v != null && v.IIIllIIliIIl() != null) {
         class_2338 var5 = v.IIIllIIliIIl();
         class_2350 var6 = IliIlllilIi(v, digWall, self);
         ArrayList var7 = new ArrayList();
         lilIllliilIlll var8 = liiiIIllIl(obsidian, v, var6, box);
         if (var8 != null) {
            var7.add(var8);
         }

         for (class_2350 var10 : IilliliilIIi(var6, self, var5)) {
            if (var10 != var6) {
               lilIllliilIlll var11 = liiiIIllIl(obsidian, v, var10, box);
               if (var11 != null) {
                  var7.add(var11);
               }
            }
         }

         class_2338 var33 = var5.method_10093(var6);
         lliIliliIl var34 = null;
         double var35 = Double.NEGATIVE_INFINITY;
         var27 ^= (-21474836480L ^ var27) & -1L << 32;

         while ((int)(var27 >>> 32) <= 5) {
            for (var27 ^= (-5L ^ var27) & -1L >>> 32; (int)var27 <= 5; var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
               for (var29 ^= (-8589934592L ^ var29) & -1L << 32; (int)(var29 >>> 32) <= 2; var29 += 4294967296L) {
                  class_2338 var16 = var5.method_10069((int)(var27 >>> 32), (int)(var29 >>> 32), (int)var27);
                  double var17 = Math.hypot((double)(var16.method_10263() - var33.method_10263()), (double)(var16.method_10260() - var33.method_10260()));
                  if (!(var17 < 2.5) && !(var17 > 4.0) && lIiiIiIlilli(obsidian, v, var16, var7)) {
                     class_243 var19 = iIiIlllIliIlll.Illillliilli(var16);
                     ArrayList var20 = new ArrayList();
                     var29 ^= (0L ^ var29) & -1L >>> 32;

                     for (lilIllliilIlll var23 : var7) {
                        if (var20.size() >= 2) {
                           break;
                        }

                        if (iliIiiliiiii(obsidian, var19, var23)) {
                           var20.add(var23);
                           class_243 var24 = new class_243(
                              (double)var23.IilliliilIIi().method_10263() + 0.5,
                              (double)var23.IilliliilIIi().method_10264() + 1.0,
                              (double)var23.IilliliilIIi().method_10260() + 0.5
                           );
                           if (IlIIlIIlllIIlIIl.IIIllIIliIIl(obsidian, var24, var19) != null) {
                              var29 ^= (1L ^ var29) & -1L >>> 32;
                           }
                        }
                     }

                     var31 ^= ((long)(var8 != null && var20.contains(var8) ? 1 : 0) << 32 ^ var31) & -1L << 32;
                     double var36 = self == null
                        ? 0.0
                        : Math.sqrt(self.method_1028((double)var16.method_10263() + 0.5, (double)var16.method_10264(), (double)var16.method_10260() + 0.5));
                     double var25 = 10.0 * (double)var20.size() + ((int)(var31 >>> 32) != 0 ? 10.0 : 0.0) + ((int)var29 != 0 ? 2.0 : 0.0) - 0.1 * var36;
                     if (var25 > var35) {
                        var35 = var25;
                        var34 = new lliIliliIl(var16.method_10062(), List.copyOf(var20), (boolean)((int)var29));
                     }
                  }
               }
            }

            var27 += 4294967296L;
         }

         return var34;
      } else {
         return null;
      }
   }

   private IIliIIlllIliIIll() {
   }

   static boolean lIiiIiIlilli(liiiiIiiiiiiIi v, IiIiiIlliIiiIl box, class_2338 sides, List<lilIllliilIlll> s) {
      long var17 = 5046236927868926500L;
      long var13 = 523499968709107797L;
      long var15 = 5414220476840405852L;
      if (!v.IIlllIlliIll(sides)) {
         return false;
      } else {
         class_2338 var4 = sides.method_10084();

         for (class_2338 var6 : box.IiIlliIliiIl()) {
            if (var6.equals(sides) || var6.equals(var4)) {
               return false;
            }
         }

         class_2338 var19 = box.IIIllIIliIIl();
         if (sides.method_10263() == var19.method_10263() && sides.method_10260() == var19.method_10260()) {
            return false;
         } else {
            class_2350[] var20 = IlIIlIIlllIIlIIl.IliiilllIl;
            var13 ^= ((long)var20.length << 32 ^ var13) & -1L << 32;

            for (var13 ^= (0L ^ var13) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
               class_2350 var9 = var20[(int)var13];
               class_2338 var10 = var19.method_10093(var9);

               for (var15 ^= (4294967296L ^ var15) & -1L << 32; (int)(var15 >>> 32) <= 3; var15 += 4294967296L) {
                  class_2338 var12 = var10.method_10079(var9, (int)(var15 >>> 32));
                  if (var12.method_10263() == sides.method_10263()
                     && var12.method_10260() == sides.method_10260()
                     && Math.abs(var12.method_10264() - sides.method_10264()) <= 1) {
                     return false;
                  }
               }
            }

            for (lilIllliilIlll var7 : s) {
               if (var7.iIlIlllllill().equals(sides) || var7.iIlIlllllill().equals(var4) || var7.IilliliilIIi().equals(sides.method_10074())) {
                  return false;
               }
            }

            var15 ^= (0L ^ var15) & -1L >>> 32;
            class_2350[] var22 = IlIIlIIlllIIlIIl.IliiilllIl;
            var13 ^= ((long)var22.length ^ var13) & -1L >>> 32;

            for (long var28 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var28 >>> 32) < (int)var13; var28 += 4294967296L) {
               class_2350 var23 = var22[(int)(var28 >>> 32)];
               if (v.IliIlllilIi(sides.method_10093(var23)) && v.IliIlllilIi(var4.method_10093(var23))) {
                  var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
               }
            }

            return (int)var15 >= 2;
         }
      }
   }

   static List<class_2350> IilliliilIIi(class_2350 f, class_243 primary, class_2338 self) {
      ArrayList var3 = new ArrayList<>(List.of(IlIIlIIlllIIlIIl.IliiilllIl));
      double var4 = primary == null ? 0.0 : primary.field_1352 - ((double)self.method_10263() + 0.5);
      double var6 = primary == null ? 0.0 : primary.field_1350 - ((double)self.method_10260() + 0.5);
      var3.sort(
         (dx, b) -> Double.compare(
               (double)b.method_10148() * var4 + (double)b.method_10165() * var6, (double)dx.method_10148() * var4 + (double)dx.method_10165() * var6
            )
      );
      var3.remove(f);
      var3.add(0, f);
      return var3;
   }

   public static class_2350 IliIlllilIi(IiIiiIlliIiiIl digWall, class_2338 box, class_243 self) {
      if (digWall != null && digWall.IIIllIIliIIl() != null) {
         if (box != null) {
            for (ililiIIlIiiliIIl var4 : digWall.Illlllllilll()) {
               if (var4.iIlIlllllill() <= 1 && var4.IilliliilIIi() != null && var4.liiiIIllIl().equals(box)) {
                  return var4.IilliliilIIi();
               }
            }
         }

         class_2338 var8 = digWall.IIIllIIliIIl();
         double var9 = self == null ? 1.0 : self.field_1352 - ((double)var8.method_10263() + 0.5);
         double var6 = self == null ? 0.0 : self.field_1350 - ((double)var8.method_10260() + 0.5);
         if (Math.abs(var9) >= Math.abs(var6)) {
            return var9 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039;
         } else {
            return var6 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043;
         }
      } else {
         return null;
      }
   }
}
