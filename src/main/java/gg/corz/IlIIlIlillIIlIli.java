package gg.corz;

public final class IlIIlIlillIIlIli {
   public static final double lIIiiiIlIi = 0.005;
   public static final int liiliiIlIi = 9;
   public static final double IIIiiiIlIi = 1.0E-6;
   public static final int iiiliiIlIi = 36;

   public static int IliIlllilIi(int source, int target) {
      return source * 36 + target;
   }

   static boolean iliIiiliiiii(llIliIiilIliIi target, int v, int src, int cat) {
      long var5 = -136072771123720871L;
      if (target.IlIlllIlilIl(src, cat) <= target.IlIlllIlilIl(src, v) + 0.005) {
         return false;
      } else {
         var5 ^= ((long)target.IIlllIlliIll(v) << 32 ^ var5) & -1L << 32;
         return (int)(var5 >>> 32) <= 1 ? true : target.IiIlliIliiIl(cat) >= Math.min(target.IiIlliIliiIl(v), iIlIlllllill((int)(var5 >>> 32)));
      }
   }

   static int IlIlllIlilIl(llIliIiilIliIi v, int target) {
      long var4 = 2906839768450410409L;
      var4 ^= (-4294967296L ^ var4) & -1L << 32;

      for (var4 ^= (9L ^ var4) & -1L >>> 32; (int)var4 < 36; var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         if (!v.IilliliilIIi((int)var4)
            && v.iliIiiliiiii((int)var4)
            && v.lIiiIiIlilli((int)var4)
            && v.Ililllililil(target, (int)var4)
            && !v.Iiilliiliiil((int)var4, target)
            && ((int)(var4 >>> 32) < 0 || v.IiIlliIliiIl((int)var4) > v.IiIlliIliiIl((int)(var4 >>> 32)))) {
            var4 ^= ((long)((int)var4) << 32 ^ var4) & -1L << 32;
         }
      }

      return (int)(var4 >>> 32);
   }

   static int IIIllIIliIIl(llIliIiilIliIi cat, int target, int v) {
      long var11 = -1949689100475510487L;
      long var13 = 5223599889510734335L;
      long var15 = -2892152829450434291L;
      var11 ^= ((long)cat.IIlllIlliIll(target) << 32 ^ var11) & -1L << 32;
      if ((int)(var11 >>> 32) > 1 && cat.IiIlliIliiIl(target) <= iIlIlllllill((int)(var11 >>> 32))) {
         double var4 = cat.IlIlllIlilIl(v, target);
         var11 ^= ~var11 & -1L >>> 32;
         var13 ^= (0L ^ var13) & -1L << 32;

         for (long var20 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var20 < 36; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            var15 ^= ((long)IilliliilIIi((int)var20) << 32 ^ var15) & -1L << 32;
            if (IiIlliIliiIl(cat, target, v, (int)(var15 >>> 32))
               && !(Math.abs(cat.IlIlllIlilIl(v, (int)(var15 >>> 32)) - var4) > 1.0E-6)
               && cat.IiIlliIliiIl((int)(var15 >>> 32)) > cat.IiIlliIliiIl(target)) {
               var15 ^= ((long)cat.Illlllllilll(target, (int)(var15 >>> 32)) ^ var15) & -1L >>> 32;
               if ((int)var11 < 0
                  || (int)var15 != 0 && (int)(var20 >>> 32) == 0
                  || (int)var15 == (int)(var20 >>> 32) && cat.IiIlliIliiIl((int)(var15 >>> 32)) > cat.IiIlliIliiIl((int)var11)) {
                  var11 ^= ((long)((int)(var15 >>> 32)) ^ var11) & -1L >>> 32;
                  var20 ^= ((long)((int)var15) << 32 ^ var20) & -1L << 32;
               }
            }
         }

         return (int)var11;
      } else {
         return -1;
      }
   }

   static int lIiiIiIlilli(llIliIiilIliIi target, int v, int cat) {
      long var6 = -150037474964831100L;
      long var8 = 8989219328365019576L;
      var6 ^= (-4294967296L ^ var6) & -1L << 32;

      for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < 36; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         var8 ^= ((long)IilliliilIIi((int)var6) << 32 ^ var8) & -1L << 32;
         if (IiIlliIliiIl(target, v, cat, (int)(var8 >>> 32)) && ((int)(var6 >>> 32) < 0 || Illlllllilll(target, cat, (int)(var8 >>> 32), (int)(var6 >>> 32)))) {
            var6 ^= ((long)((int)(var8 >>> 32)) << 32 ^ var6) & -1L << 32;
         }
      }

      return (int)(var6 >>> 32);
   }

   public static illlIlilIillIlil liiiIIllIl(llIliIiilIliIi v, boolean upgrades) {
      long var6 = 219796415346634993L;
      long var8 = 1888061622885931409L;

      for (var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
         if (!v.liiiIIllIl((int)(var6 >>> 32)) && v.IilliliilIIi((int)(var6 >>> 32))) {
            var6 ^= ((long)v.IliIlllilIi((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
            if ((int)var6 != 0) {
               if (v.Iilllilliill((int)(var6 >>> 32))) {
                  var8 ^= ((long)lIiiIiIlilli(v, (int)(var6 >>> 32), (int)var6) << 32 ^ var8) & -1L << 32;
                  if ((int)(var8 >>> 32) >= 0) {
                     return new illlIlilIillIlil((int)(var8 >>> 32), (int)(var6 >>> 32), true);
                  }
               }
            } else if (v.IIillIiliIil((int)(var6 >>> 32))) {
               var8 ^= ((long)IlIlllIlilIl(v, (int)(var6 >>> 32)) << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) >= 0) {
                  return new illlIlilIillIlil((int)(var8 >>> 32), (int)(var6 >>> 32), true);
               }
            }
         }
      }

      if (!upgrades) {
         return null;
      } else {
         var6 ^= (0L ^ var6) & -1L << 32;

         while ((int)(var6 >>> 32) < 9) {
            var6 ^= ((long)v.IliIlllilIi((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
            if ((int)var6 != 0 && !v.liiiIIllIl((int)(var6 >>> 32)) && v.IilliliilIIi((int)(var6 >>> 32))) {
               var8 ^= ((long)lIiiIiIlilli(v, (int)(var6 >>> 32), (int)var6) << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) >= 0) {
                  return new illlIlilIillIlil((int)(var8 >>> 32), (int)(var6 >>> 32), false);
               }
            }

            var6 += 4294967296L;
         }

         var6 ^= (0L ^ var6) & -1L << 32;

         while ((int)(var6 >>> 32) < 9) {
            var6 ^= ((long)v.IliIlllilIi((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
            if ((int)var6 != 0 && !v.liiiIIllIl((int)(var6 >>> 32)) && !v.IilliliilIIi((int)(var6 >>> 32)) && v.lIiiIiIlilli((int)(var6 >>> 32))) {
               var8 ^= ((long)lIiiIiIlilli(v, (int)(var6 >>> 32), (int)var6) << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) >= 0) {
                  if (!v.IIIllIIliIIl((int)var6, (int)(var6 >>> 32))) {
                     if (!v.iIlIlllllill((int)(var6 >>> 32))) {
                        return new illlIlilIillIlil((int)(var8 >>> 32), (int)(var6 >>> 32), false);
                     }
                  } else {
                     if (iliIiiliiiii(v, (int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) {
                        return new illlIlilIillIlil((int)(var8 >>> 32), (int)(var6 >>> 32), false);
                     }

                     var8 ^= ((long)IIIllIIliIIl(v, (int)(var6 >>> 32), (int)var6) ^ var8) & -1L >>> 32;
                     if ((int)var8 >= 0) {
                        return new illlIlilIillIlil((int)var8, (int)(var6 >>> 32), false);
                     }
                  }
               }
            }

            var6 += 4294967296L;
         }

         return null;
      }
   }

   public static int iIlIlllllill(int maxCount) {
      return maxCount <= 1 ? 0 : Math.max(1, maxCount / 4);
   }

   private static boolean Illlllllilll(llIliIiilIliIi v, int b, int a, int cat) {
      double var4 = v.IlIlllIlilIl(b, a);
      double var6 = v.IlIlllIlilIl(b, cat);
      if (var4 > var6 + 1.0E-6) {
         return true;
      } else {
         return var4 < var6 - 1.0E-6 ? false : v.IiIlliIliiIl(a) > v.IiIlliIliiIl(cat);
      }
   }

   static boolean IiIlliIliiIl(llIliIiilIliIi cat, int s, int v, int target) {
      if (target == s || cat.IilliliilIIi(target) || !cat.iliIiiliiiii(target) || !cat.lIiiIiIlilli(target) || !cat.IIIllIIliIIl(v, target)) {
         return false;
      } else if (cat.Iiilliiliiil(target, s)) {
         return false;
      } else {
         return target >= 9 ? true : !cat.liiiIIllIl(target) && !cat.iIlIlllllill(target) && !IIlllIlliIll(cat, target);
      }
   }

   private IlIIlIlillIIlIli() {
   }

   static boolean IIlllIlliIll(llIliIiilIliIi hotbar, int v) {
      long var3 = -5288553284159187550L;
      var3 ^= ((long)hotbar.IliIlllilIi(v) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) != 0 && !hotbar.liiiIIllIl(v) && !hotbar.IilliliilIIi(v) && hotbar.IIIllIIliIIl((int)(var3 >>> 32), v);
   }

   static int IilliliilIIi(int k) {
      return k < 27 ? k + 9 : k - 27;
   }
}
