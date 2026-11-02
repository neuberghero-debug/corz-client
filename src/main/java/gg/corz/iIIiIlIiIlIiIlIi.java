package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_2824;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_746;

public final class iIIiIlIiIlIiIlIi {
   private static int IiillIIIIi = -1;
   private static class_746 IIillIIIIi;
   private static boolean liillIIIIi;
   private static lIiiilliIiiill ilIilIIIIi = lIiiilliIiiill.llIilllIiilIilllIi;
   private static int lililIIIIi;
   private static liIIIiiiiIIIii iiillIIIIi;
   private static final Object lilllIIIIi = new Object();
   private static class_1297 llillIIIIi;
   private static class_1309 llIilIIIIi;
   private static int IIIilIIIIi = -1;
   private static boolean liIilIIIIi;
   private static liIIIiiiiIIIii IlIilIIIIi;
   private static long lIillIIIIi = Long.MIN_VALUE;
   private static long ilillIIIIi = Long.MIN_VALUE;
   static final int lllllIIIIi = 3;
   private static long iIlilIIIIi = Long.MIN_VALUE;
   private static long IIlilIIIIi;
   private static boolean iiIilIIIIi;
   private static final class_310 iilllIIIIi = class_310.method_1551();
   private static int illilIIIIi = -1;
   private static long iIIilIIIIi;
   private static long lIlilIIIIi;
   private static int IllilIIIIi = -1;
   private static long lllilIIIIi = Long.MIN_VALUE;
   static final int IilllIIIIi = 100;
   private static int lIIilIIIIi = -1;
   static final int illllIIIIi = 10;
   private static double IiIilIIIIi = 1.5;
   static final int IllllIIIIi = 2;
   private static long iIillIIIIi = Long.MIN_VALUE;
   private static Object IlillIIIIi;
   private static int IililIIIIi;

   private static boolean IllIllllIl() {
      return IIIIilIilIIIilIi.lIIlliIIll() || IilIIililIIi.IilliliilIIi();
   }

   private static liIIIiiiiIIIii lilIliilIl() {
      List var0 = IIiIllIiIl();
      return var0.isEmpty() ? null : (liIIIiiiiIIIii)var0.get(0);
   }

   private static List<liIIIiiiiIIIii> IIiIllIiIl() {
      if (IIiIIllIiIIl.IliIlllilIi()) {
         return List.of();
      } else {
         ArrayList var0 = new ArrayList(3);

         for (ilIllIiIll var2 : llilIllililIll.IilliliilIIi()) {
            if (var2 instanceof liIIIiiiiIIIii) {
               liIIIiiiiIIIii var3 = (liIIIiiiiIIIii)var2;
               if (var2.IliIlllilIi()) {
                  var0.add(var3);
               }
            }
         }

         if (var0.size() > 1) {
            var0.sort(Comparator.comparingInt(liIIIiiiiIIIii::iiiIlIIIll).reversed());
         }

         return var0;
      }
   }

   private iIIiIlIiIlIiIlIi() {
   }

   private static boolean IIIilIIiiIIi(class_1309 now, int slot, int viaKey, long selected, boolean target) {
      if (!class_1661.method_7380(slot)) {
         return false;
      } else {
         class_1799 var6 = lIlllIliIlllIl.iliIiiliiiii(slot);
         if (!liliIIliiiliIIli.IiIlliIliiIl(now, var6)) {
            return false;
         } else {
            return target && iilllIIIIi.field_1724.method_75202(var6, 0) ? false : slot == viaKey || llIiIililIiIil.IIIilIIiiIIi(selected, ilillIIIIi);
         }
      }
   }

   public static boolean IIIllIIliIIl(liIIIiiiiIIIii target, class_1309 owner, int minFall, lIiiilliIiiill axeSlot, double swapBack, boolean preference) {
      if (!iliIiiliiiii(target, owner, minFall, preference)) {
         return false;
      } else {
         iiIIlIIlIl(new iliIlIliIiiIlIli(target, minFall, true, axeSlot, swapBack, preference), owner, IIllIIlilIllIIli.IlIlllIlilIl(), false);
         return true;
      }
   }

   private static void IIIIllIIIl() {
      if (IIIilIIIIi < 0 && llIilIIIIi == null && lilIliilIl() == null) {
         Iilllilliill();
      }
   }

   private static boolean IIillIiliIil() {
      long var2 = -413652940568686564L;
      class_746 var0 = iilllIIIIi.field_1724;
      if (var0 != IIillIIIIi) {
         Iilllilliill();
         IIillIIIIi = var0;
         IiillIIIIi = var0 == null ? -1 : var0.method_31548().method_67532();
      }

      if (var0 == null) {
         return false;
      } else {
         var2 ^= ((long)var0.method_31548().method_67532() << 32 ^ var2) & -1L << 32;
         if ((int)(var2 >>> 32) != IiillIIIIi) {
            IiillIIIIi = (int)(var2 >>> 32);
            ilillIIIIi = Math.max(ilillIIIIi, IIllIIlilIllIIli.IlIlllIlilIl());
         }

         if (IIIilIIIIi >= 0 && !llIiIililIiIil.Ililllililil((int)(var2 >>> 32), lIIilIIIIi, IllIllllIl())) {
            iIiIlIliIl();
         }

         return true;
      }
   }

   private static void lliIliliIl() {
      IlIilIIIIi = null;
      llIilIIIIi = null;
      ilIilIIIIi = lIiiilliIiiill.llIilllIiilIilllIi;
      IiIilIIIIi = 1.5;
      liIilIIIIi = false;
      iiIilIIIIi = false;
      IIlilIIIIi = 0L;
      lIlilIIIIi = 0L;
   }

   public static void IliIlllilIi() {
      long var0 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (lIillIIIIi != var0) {
         lIillIIIIi = var0;
         if (iIillIIIIi != var0) {
            IlillIIIIi = null;
            llillIIIIi = null;
         }

         liliIIliiiliIIli.Ililllililil();
         if (IIillIiliIil()) {
            if (IIIilIIIIi >= 0 && iiillIIIIi == null) {
               iiillIIIIi = lilIliilIl();
            }

            if (!iilllIIIIi.field_1724.method_29504() && iilllIIIIi.field_1761 != null) {
               IIlilIliiIli(var0);
               Iilililiiili(var0);
            } else {
               lliIliliIl();
               iIiIlIliIl();
            }
         }
      }
   }

   public static void Illlllllilll(liIIIiiiiIIIii role) {
      if (role != null) {
         if (IlIilIIIIi == role) {
            lliIliliIl();
         }

         if (iiillIIIIi == role && IIIilIIIIi >= 0) {
            iiillIIIIi = lilIliilIl();
            if (iiillIIIIi == null && !IIiilIiiiIii()) {
               Iliilliiilii();
            }
         }

         IIIIllIIIl();
      }
   }

   public static void Iilllilliill() {
      lliIliliIl();
      iIiIlIliIl();
      IIillIIIIi = null;
      IiillIIIIi = -1;
      iIillIIIIi = Long.MIN_VALUE;
      IlillIIIIi = null;
      llillIIIIi = null;
      iIlilIIIIi = Long.MIN_VALUE;
      IllilIIIIi = -1;
      lllilIIIIi = Long.MIN_VALUE;
      illilIIIIi = -1;
      liillIIIIi = false;
      IililIIIIi++;
      lililIIIIi = 0;
      liliIIliiiliIIli.IIIilIIiiIIi();
   }

   public static boolean iIlIlllllill(class_1297 target) {
      llliIiiilliIii var1 = Ililllililil(target);
      return var1 != null && !var1.IliIlllilIi() && lIlllIliIlllIl.liiiIIllIl(lIlllIliIlllIl.iliIiiliiiii(var1.iIlIlllllill()));
   }

   private static boolean illIlIilIl() {
      for (liIIIiiiiIIIii var1 : IIiIllIiIl()) {
         if (var1.ilIllIiIll()) {
            return true;
         }
      }

      return false;
   }

   private static boolean iIIIlIlIIl(liIIIiiiiIIIii target, class_1309 slot, int owner, boolean swapBack) {
      long var9 = 7330259764296497194L;
      class_746 var4 = iilllIIIIi.field_1724;
      long var5 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (!liliIIliiiliIIli.IlIlllIlilIl(slot, lIlllIliIlllIl.iliIiiliiiii(owner))) {
         return false;
      } else if (owner != var4.method_31548().method_67532() && !llIiIililIiIil.IIIilIIiiIIi(var5, ilillIIIIi)) {
         return false;
      } else {
         liillIIIIi = true;

         try {
            var9 ^= ((long)IIllIIlilIllIIli.Iilllilliill(target, slot) << 32 ^ var9) & -1L << 32;
         } finally {
            liillIIIIi = false;
         }

         if ((int)(var9 >>> 32) != 0 && IIillIiliIil()) {
            var9 ^= ((long)var4.method_31548().method_67532() ^ var9) & -1L >>> 32;
            if (owner != (int)var9) {
               if (!llIiIililIiIil.IIIilIIiiIIi(var5, ilillIIIIi)) {
                  return false;
               }

               llIIlilIIl(target, (int)var9, owner, swapBack, var5);
            } else {
               IiIIlliIIl(var5);
            }

            iilllIIIIi.field_1761.method_2918(var4, slot);
            var4.method_6104(class_1268.field_5808);
            var4.method_75203();
            return true;
         } else {
            return false;
         }
      }
   }

   public static iilllIllIIillIll liiiIIllIl(Object presser, class_1297 target) {
      long var10 = 6303053801518750604L;
      long var12 = 8949461585536222209L;
      if (!liillIIIIi && !(presser instanceof liIIIiiiiIIIii)) {
         long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (iIillIIIIi == var2 && IlillIIIIi == presser && llillIIIIi == target) {
            return iilllIllIIillIll.ilIIIIilll;
         } else {
            iIillIIIIi = var2;
            IlillIIIIi = presser;
            llillIIIIi = target;
            var10 ^= ((long)(presser != null && IIllIIlilIllIIli.IilliliilIIi() != presser ? 0 : 1) << 32 ^ var10) & -1L << 32;
            llliIiiilliIii var5 = Iiilliiliiil(presser, target, (boolean)((int)(var10 >>> 32)), presser == null);
            if (var5 == null) {
               return iilllIllIIillIll.ilIIIIilll;
            } else {
               class_1309 var6 = (class_1309)target;
               var10 ^= ((long)iilllIIIIi.field_1724.method_31548().method_67532() ^ var10) & -1L >>> 32;
               liIIIiiiiIIIii var8 = var5.IliIlllilIi() ? IlIilIIIIi : var5.liiiIIllIl().IliIlllilIi();
               var12 ^= ((long)(var5.IliIlllilIi() ? liIilIIIIi : var5.liiiIIllIl().iliIiiliiiii()) << 32 ^ var12) & -1L << 32;
               if (var5.iIlIlllllill() == (int)var10) {
                  IiIIlliIIl(var2);
               } else {
                  llIIlilIIl(var8, (int)var10, var5.iIlIlllllill(), (boolean)((int)(var12 >>> 32)), var2);
               }

               if (var5.IliIlllilIi()) {
                  lliIliliIl();
               } else if (var5.liiiIIllIl().iIlIlllllill()) {
                  iiIIlIIlIl(var5.liiiIIllIl(), var6, var2, true);
               }

               return iilllIllIIillIll.ilIIIIilll;
            }
         }
      } else {
         return iilllIllIIillIll.ilIIIIilll;
      }
   }

   private static boolean IlIillIiilIi(class_1309 physical, boolean target) {
      if (target && iIiIlillIliIlill.IIIillIIil() == physical) {
         return true;
      } else if (iilllIIIIi.field_1771 <= 0 && !iilllIIIIi.field_1724.method_3144()) {
         if (iilllIIIIi.field_1765 instanceof class_3966 var2 && var2.method_17782() == physical) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean iliIiiliiiii(liIIIiiiiIIIii swapBack, class_1309 slot, int target, boolean owner) {
      if (swapBack == null || slot == null || !class_1661.method_7380(target)) {
         return false;
      } else {
         return !lIiiIiIlilli() ? false : iIIIlIlIIl(swapBack, slot, target, owner);
      }
   }

   private static void Iiiiliiiiiii(int gen) {
      if (gen == IililIIIIi) {
         if (!IIiilIiiiIii()) {
            if (--lililIIIIi > 0) {
               iIiiIliIliiIli.liiiIIllIl(() -> Iiiiliiiiiii(gen));
               return;
            }

            iIiIlIliIl();
         }

         IIIIllIIIl();
      }
   }

   private static iliIlIliIiiIlIli IiIiliIiiiIi(Object presser, class_1309 target) {
      long var10 = 3196221017553604185L;
      long var12 = -6215380105186491957L;
      List var2 = IIiIllIiIl();
      if (var2.isEmpty()) {
         return null;
      } else {
         var10 ^= ((long)iilllIIIIi.field_1724.method_31548().method_67532() << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)(IIIilIIIIi >= 0 && (int)(var10 >>> 32) == lIIilIIIIi ? IIIilIIIIi : (int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
         class_1799 var5 = lIlllIliIlllIl.iliIiiliiiii((int)var10);
         if (liliIIliiiliIIli.IliIlllilIi(target)) {
            var12 ^= ((long)lIlllIliIlllIl.IlIlllIlilIl() << 32 ^ var12) & -1L << 32;
            if ((int)(var12 >>> 32) < 0) {
               return null;
            } else {
               for (liIIIiiiiIIIii var19 : var2) {
                  iiIIIlIiIIlIIlIi var9 = var19.lIIlliIIll();
                  if (var9.iliIiiliiiii()
                     && var9.liiiIIllIl()
                     && var19.IlIllllIll(presser, var5)
                     && liliIIliiiliIIli.lIiiIiIlilli(var9.IilliliilIIi())
                     && lIlllIliIlllIl.IIIllIIliIIl(var9.lIiiIiIlilli()) >= 0) {
                     return new iliIlIliIiiIlIli(var19, (int)(var12 >>> 32), true, var9.lIiiIiIlilli(), var9.IilliliilIIi(), var9.IiIlliIliiIl());
                  }
               }

               for (liIIIiiiiIIIii var20 : var2) {
                  iiIIIlIiIIlIIlIi var21 = var20.lIIlliIIll();
                  if (var21.IIIllIIliIIl() && var20.IlIllllIll(presser, var5)) {
                     return new iliIlIliIiiIlIli(var20, (int)(var12 >>> 32), false, var21.lIiiIiIlilli(), var21.IilliliilIIi(), var21.IiIlliIliiIl());
                  }
               }

               return null;
            }
         } else {
            for (liIIIiiiiIIIii var7 : var2) {
               iiIIIlIiIIlIIlIi var8 = var7.lIIlliIIll();
               if (var8.liiiIIllIl() && var7.IlIllllIll(presser, var5) && (!var8.iIlIlllllill() || liliIIliiiliIIli.lIiiIiIlilli(var8.IilliliilIIi()))) {
                  var12 ^= ((long)lIlllIliIlllIl.IIIllIIliIIl(var8.lIiiIiIlilli()) ^ var12) & -1L >>> 32;
                  if ((int)var12 >= 0) {
                     return new iliIlIliIiiIlIli(var7, (int)var12, false, var8.lIiiIiIlilli(), var8.IilliliilIIi(), var8.IiIlliIliiIl());
                  }
               }
            }

            for (liIIIiiiiIIIii var15 : var2) {
               iiIIIlIiIIlIIlIi var18 = var15.lIIlliIIll();
               if (var18.IlIlllIlilIl() && var15.IlIllllIll(presser, var5)) {
                  var12 ^= ((long)lIlllIliIlllIl.IiIlliIliiIl((int)var10) ^ var12) & -1L >>> 32;
                  if ((int)var12 >= 0) {
                     return new iliIlIliIiiIlIli(var15, (int)var12, false, var18.lIiiIiIlilli(), var18.IilliliilIIi(), var18.IiIlliIliiIl());
                  }
               }
            }

            return (int)var10 != (int)(var10 >>> 32) && iiillIIIIi != null
               ? new iliIlIliIiiIlIli(iiillIIIIi, (int)var10, false, lIiiilliIiiill.llIilllIiilIilllIi, 1.5, true)
               : null;
         }
      }
   }

   private static boolean lIlIliIlIl() {
      class_746 var0 = iilllIIIIi.field_1724;
      return var0 != null
         && iilllIIIIi.field_1761 != null
         && iilllIIIIi.field_1755 == null
         && !var0.method_6115()
         && !var0.method_7325()
         && !IllIllllIl()
         && !IIllIIlilIllIIli.IliIlllilIi()
         && !lIIIIIlliIIIIIll.lIiiIiIlilli();
   }

   private static void Iilililiiili(long now) {
      if (IIIilIIIIi >= 0) {
         if (llIiIililIiIil.IlIillIiilIi(now, iIIilIIIIi, ilillIIIIi)) {
            if (llIilIIIIi == null && iilllIIIIi.field_1755 == null) {
               if (!IIllIIlilIllIIli.IiIlliIliiIl() && !IIllIIlilIllIIli.IliIlllilIi() && !IllIllllIl()) {
                  if (!IIllIIlilIllIIli.IIIilIIiiIIi() && !illIlIilIl()) {
                     class_746 var2 = iilllIIIIi.field_1724;
                     if (var2.method_31548().method_67532() != lIIilIIIIi) {
                        iIiIlIliIl();
                     } else {
                        var2.method_31548().method_61496(IIIilIIIIi);
                        IiillIIIIi = IIIilIIIIi;
                        ilillIIIIi = now;
                        iIiIlIliIl();
                     }
                  }
               }
            }
         }
      }
   }

   private static llliIiiilliIii Ililllililil(class_1297 target) {
      if (iilllIIIIi != null && !liillIIIIi) {
         Object var1 = IIllIIlilIllIIli.IilliliilIIi();
         return Iiilliiliiil(var1 != null ? var1 : lilllIIIIi, target, true, false);
      } else {
         return null;
      }
   }

   public static boolean IlIlllIlilIl(class_1297 target) {
      return target != null && llIiIililIiIil.Iiilliiliiil(illilIIIIi, lllilIIIIi, target.method_5628(), IIllIIlilIllIIli.IlIlllIlilIl(), 10);
   }

   private static boolean Illillliilli(long now) {
      if (llIilIIIIi == null || iiIilIIIIi || !llIiIililIiIil.IiIiliIiiiIi(now, IIlilIIIIi, lIlilIIIIi)) {
         return false;
      } else if (IlIilIIIIi != null && IlIilIIIIi.IliIlllilIi()) {
         return llIilIIIIi.method_5805() && !llIilIIIIi.method_31481() && llIilIIIIi.method_73183() == iilllIIIIi.field_1687
            ? liliIIliiiliIIli.lIiiIiIlilli(IiIilIIIIi)
            : false;
      } else {
         return false;
      }
   }

   private static void iIiIlIliIl() {
      iiillIIIIi = null;
      IIIilIIIIi = -1;
      lIIilIIIIi = -1;
      iIIilIIIIi = 0L;
   }

   private static void llIIlilIIl(liIIIiiiiIIIii owner, int swapBack, int to, boolean now, long from) {
      iilllIIIIi.field_1724.method_31548().method_61496(to);
      IiillIIIIi = to;
      ilillIIIIi = from;
      if (IIIilIIIIi >= 0) {
         if (to == IIIilIIIIi) {
            iIiIlIliIl();
         } else {
            lIIilIIIIi = to;
            iIIilIIIIi = from + 2L;
         }
      } else if (now && owner != null) {
         iiillIIIIi = owner;
         IIIilIIIIi = swapBack;
         lIIilIIIIi = to;
         iIIilIIIIi = from + 2L;
      }
   }

   private static llliIiiilliIii Iiilliiliiil(Object target, class_1297 physical, boolean presser, boolean viaKey) {
      long var10 = -95738246496962242L;
      if (!IIillIiliIil()) {
         return null;
      } else {
         class_746 var4 = iilllIIIIi.field_1724;
         if (!(physical instanceof class_1309 var5) || var5 == var4 || !var5.method_5805() || var5 instanceof class_1531) {
            return null;
         }

         if (iilllIIIIi.field_1761 == null || var4.method_6115() || var4.method_7325() || IllIllllIl()) {
            return null;
         } else if (presser && !IlIillIiilIi(var5, viaKey)) {
            return null;
         } else {
            long var6 = IIllIIlilIllIIli.IlIlllIlilIl();
            var10 ^= ((long)var4.method_31548().method_67532() << 32 ^ var10) & -1L << 32;
            if (llIilIIIIi == null) {
               iliIlIliIiiIlIli var9 = IiIiliIiiiIi(target, var5);
               return var9 != null && IIIilIIiiIIi(var5, var9.liiiIIllIl(), (int)(var10 >>> 32), var6, presser)
                  ? new llliIiiilliIii(var9, var9.liiiIIllIl())
                  : null;
            } else if (var5 == llIilIIIIi && Illillliilli(var6)) {
               var10 ^= ((long)lIlllIliIlllIl.IIIllIIliIIl(ilIilIIIIi) ^ var10) & -1L >>> 32;
               return IIIilIIiiIIi(var5, (int)var10, (int)(var10 >>> 32), var6, presser) ? new llliIiiilliIii(null, (int)var10) : null;
            } else {
               return null;
            }
         }
      }
   }

   private static void iiIIlIIlIl(iliIlIliIiiIlIli now, class_1309 plan, long needsHit, boolean target) {
      IlIilIIIIi = now.IliIlllilIi();
      llIilIIIIi = plan;
      ilIilIIIIi = now.IilliliilIIi();
      IiIilIIIIi = now.lIiiIiIlilli();
      liIilIIIIi = now.iliIiiliiiii();
      iiIilIIIIi = target;
      IIlilIIIIi = needsHit;
      lIlilIIIIi = needsHit + 3L;
   }

   public static boolean lIiiIiIlilli() {
      return IIillIiliIil() && llIilIIIIi == null && lIlIliIlIl();
   }

   private static void Iliilliiilii() {
      long var1 = 81728993830313759L;
      var1 ^= ((long)(++IililIIIIi) << 32 ^ var1) & -1L << 32;
      lililIIIIi = 100;
      iIiiIliIliiIli.liiiIIllIl(() -> Iiiiliiiiiii(gen));
   }

   private static boolean IIiilIiiiIii() {
      if (IIIilIIIIi >= 0 && iiillIIIIi == null) {
         class_746 var0 = iilllIIIIi.field_1724;
         if (var0 == null || var0 != IIillIIIIi || iilllIIIIi.field_1761 == null) {
            iIiIlIliIl();
            return true;
         } else if (IllIllllIl()) {
            return false;
         } else if (var0.method_31548().method_67532() != lIIilIIIIi) {
            iIiIlIliIl();
            return true;
         } else {
            long var1 = IIllIIlilIllIIli.IlIlllIlilIl();
            if (llIiIililIiIil.IIIilIIiiIIi(var1, ilillIIIIi) && !IIllIIlilIllIIli.IliIlllilIi()) {
               var0.method_31548().method_61496(IIIilIIIIi);
               IiillIIIIi = IIIilIIIIi;
               ilillIIIIi = var1 + 1L;
               iIiIlIliIl();
               return true;
            } else {
               return false;
            }
         }
      } else {
         return true;
      }
   }

   public static boolean IiIlliIliiIl() {
      return llIilIIIIi != null || IIIilIIIIi >= 0;
   }

   private static void IiIIlliIIl(long now) {
      if (IIIilIIIIi >= 0 && iilllIIIIi.field_1724.method_31548().method_67532() == lIIilIIIIi) {
         iIIilIIIIi = Math.max(iIIilIIIIi, now + 2L);
      }
   }

   public static boolean IilliliilIIi(class_1297 target) {
      llliIiiilliIii var1 = Ililllililil(target);
      return var1 != null && lIlllIliIlllIl.IliIlllilIi(lIlllIliIlllIl.iliIiiliiiii(var1.iIlIlllllill()));
   }

   public static void IIlllIlliIll(IiIiIlIiliIiIlIi event) {
      long var5 = -6152517195315721999L;
      if (event != null && !event.lIiiIiIlilli() && iilllIIIIi.field_1724 != null && iilllIIIIi.method_18854()) {
         if (event.lIiilIIIIi instanceof class_2824 var1 && IIIliiIilIIliiIi.IliIlllilIi(var1)) {
            long var7 = IIllIIlilIllIIli.IlIlllIlilIl();
            var5 ^= ((long)IIIliiIilIIliiIi.liiiIIllIl(var1) << 32 ^ var5) & -1L << 32;
            if (iIlilIIIIi == var7 && IllilIIIIi == (int)(var5 >>> 32)) {
               return;
            }

            iIlilIIIIi = var7;
            IllilIIIIi = (int)(var5 >>> 32);
            if (llIilIIIIi != null && iiIilIIIIi && var7 == IIlilIIIIi && (int)(var5 >>> 32) == llIilIIIIi.method_5628()) {
               iiIilIIIIi = false;
            }

            if (lIlllIliIlllIl.IliIlllilIi(iilllIIIIi.field_1724.method_6047()) && liliIIliiiliIIli.Iiilliiliiil()) {
               lllilIIIIi = var7;
               illilIIIIi = (int)(var5 >>> 32);
            }

            return;
         }
      }
   }

   private static void IIlilIliiIli(long now) {
      long var3 = -3103186708744715227L;
      if (llIilIIIIi != null && now > IIlilIIIIi) {
         if (iilllIIIIi.field_1755 == null && Illillliilli(now)) {
            var3 ^= ((long)lIlllIliIlllIl.IIIllIIliIIl(ilIilIIIIi) << 32 ^ var3) & -1L << 32;
            if ((int)(var3 >>> 32) < 0) {
               lliIliliIl();
            } else if (lIlIliIlIl()) {
               if (iIIIlIlIIl(IlIilIIIIi, llIilIIIIi, (int)(var3 >>> 32), liIilIIIIi)) {
                  lliIliliIl();
               }
            }
         } else {
            lliIliliIl();
         }
      }
   }
}
