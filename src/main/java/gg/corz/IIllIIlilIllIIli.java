package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3966;

public final class IIllIIlilIllIIli {
   private static long iiIillIlIi;
   private static Object IilillIlIi;
   private static boolean IIlillIlIi;
   private static class_1297 lllillIlIi;
   private static final class_310 ilIillIlIi = class_310.method_1551();
   private static Object lilillIlIi;
   private static final ArrayDeque<lIliiliIliil> IiIillIlIi = new ArrayDeque<>();
   private static int illillIlIi;
   private static boolean iIlillIlIi;
   private static boolean lIlillIlIi;
   private static boolean IllillIlIi;
   private static final ArrayDeque<lIliiliIliil> liIillIlIi = new ArrayDeque<>();

   private static void ilIllIiIll(class_243 explosion, boolean velocity) {
      for (ilIllIiIll var3 : liIlliiIll()) {
         if (var3 instanceof lilIliiiilIlii var4) {
            var4.iIlllIllll(explosion, velocity);
         }
      }
   }

   private static void IlIllllIll(class_304 dueAtOrBefore, ArrayDeque<lIliiliIliil> key, long queue) {
      long var7 = -440623811801408615L;
      if (!key.isEmpty()) {
         var7 ^= (0L ^ var7) & -1L << 32;
         Iterator var5 = key.iterator();

         while (var5.hasNext()) {
            if (((lIliiliIliil)var5.next()).liiiIIllIl() <= queue) {
               var5.remove();
               var7 += 4294967296L;
            }
         }

         if ((int)(var7 >>> 32) != 0 && dueAtOrBefore != null) {
            AccessorKeyBinding var6 = (AccessorKeyBinding)dueAtOrBefore;
            var6.corzSetTimesPressed(Math.max(0, var6.corzGetTimesPressed() - (int)(var7 >>> 32)));
         }
      }
   }

   public static void lIlIliIlIl(class_243 knock) {
      if (ilIillIlIi.field_1724 != null && knock != null && ilIillIlIi.method_18854()) {
         ilIllIiIll(knock, true);
      }
   }

   private static List<ilIIIiiIiIIIii> IiiIlliiIl() {
      ArrayList var0 = new ArrayList();

      for (ilIllIiIll var2 : liIlliiIll()) {
         if (var2 instanceof ilIIIiiIiIIIii var3) {
            var0.add(var3);
         }
      }

      illIlIilIl(var0);
      return var0;
   }

   public static boolean Iiilliiliiil() {
      return IlIillIiilIi(liliIiliiliIil::IlIllllIll);
   }

   public static boolean Illillliilli(Object owner) {
      if (IIiIIllIiIIl.IliIlllilIi()) {
         return false;
      } else {
         for (ilIllIiIll var2 : llilIllililIll.IilliliilIIi()) {
            if (var2 != owner && var2 instanceof liliIiliiliIil var3 && var2.IliIlllilIi() && var3.ilIllIiIll()) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean IIlilIliiIli(Object owner, class_1297 target) {
      return !IIiIIllIiIIl.IliIlllilIi() && owner != null && target != null && !lIlillIlIi ? !IiIiliIiiiIi(owner) : false;
   }

   public static void Iliilliiilii() {
      IIlillIlIi = false;
   }

   static void illIlIilIl(List<ilIIIiiIiIIIii> interceptors) {
      interceptors.sort(Comparator.comparingInt(ilIIIiiIiIIIii::liIlliiIll).reversed());
   }

   public static boolean Iilllilliill(Object owner, class_1297 target) {
      if (IIiIIllIiIIl.IliIlllilIi()) {
         return true;
      } else if (owner == null || target == null || lIlillIlIi) {
         return false;
      } else {
         return IiIiliIiiiIi(owner) ? false : lilIliilIl(IiiIlliiIl(), owner, target) == iilllIllIIillIll.ilIIIIilll;
      }
   }

   private static class_1297 lliIliliIl() {
      return ilIillIlIi.field_1765 instanceof class_3966 var0 ? var0.method_17782() : null;
   }

   private static boolean IiIiliIiiiIi(Object owner) {
      for (ilIllIiIll var2 : llilIllililIll.IilliliilIIi()) {
         if (var2 != owner && var2 instanceof liliIiliiliIil var3 && var2.IliIlllilIi() && var3.iiiIlIIIll()) {
            return true;
         }
      }

      return false;
   }

   public static boolean IIlllIlliIll(Object owner) {
      return ilIillIlIi.field_1690 != null && iiiIlIIIll(ilIillIlIi.field_1690.field_1886, IiIillIlIi, owner);
   }

   private static Object lIIlliIIll(ArrayDeque<lIliiliIliil> queue) {
      lIliiliIliil var1 = (lIliiliIliil)queue.peekFirst();
      if (var1 != null && var1.liiiIIllIl() <= iiIillIlIi) {
         queue.pollFirst();
         return var1.IliIlllilIi();
      } else {
         return null;
      }
   }

   public static long IlIlllIlilIl() {
      return iiIillIlIi;
   }

   public static void IIIIllIIIl() {
      illillIlIi = Math.max(0, illillIlIi - 1);
      IilillIlIi = null;
   }

   private static boolean IlIillIiilIi(Predicate<liliIiliiliIil> test) {
      if (IIiIIllIiIIl.IliIlllilIi()) {
         return false;
      } else {
         for (ilIllIiIll var2 : llilIllililIll.IilliliilIIi()) {
            if (var2 instanceof liliIiliiliIil var3 && var2.IliIlllilIi() && test.test(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public static class_1297 iIlIlllllill() {
      return lllillIlIi;
   }

   public static boolean Ililllililil() {
      return IlIillIiilIi(liliIiliiliIil::lIIlliIIll);
   }

   public static boolean IiIlliIliiIl() {
      return ilIillIlIi.field_1690 != null && ((AccessorKeyBinding)ilIillIlIi.field_1690.field_1886).corzGetTimesPressed() > 0;
   }

   public static boolean liiiIIllIl() {
      return iIlillIlIi;
   }

   public static Boolean Iiiiliiiiiii() {
      long var5 = -7703726630773939621L;
      Object var0 = lIIlliIIll(IiIillIlIi);
      IilillIlIi = var0;
      illillIlIi++;
      var5 ^= (0L ^ var5) & -1L << 32;

      Boolean var3;
      try {
         Boolean var2 = iIiIlIliIl(var0);
         var5 ^= ((long)(var2 != null ? 1 : 0) << 32 ^ var5) & -1L << 32;
         var3 = var2;
      } finally {
         if ((int)(var5 >>> 32) != 0) {
            illillIlIi = Math.max(0, illillIlIi - 1);
            IilillIlIi = null;
         }
      }

      return var3;
   }

   static long IIiIllIiIl(long currentTick, boolean inputWindowOpen) {
      return inputWindowOpen ? currentTick : currentTick + 1L;
   }

   public static boolean IIillIiliIil() {
      return IlIillIiilIi(liliIiliiliIil::iiiIlIIIll);
   }

   public static void IllIllllIl() {
      IIlillIlIi = false;
      IiIillIlIi.clear();
      liIillIlIi.clear();
      lIlillIlIi = false;
      iIlillIlIi = false;
      IllillIlIi = false;
      lllillIlIi = null;
      illillIlIi = 0;
      IilillIlIi = null;
      lilillIlIi = null;
   }

   public static boolean iIIIlIlIIl() {
      lilillIlIi = lIIlliIIll(liIillIlIi);
      return Iiilliiliiil();
   }

   public static void iiIIlIIlIl(int entityId) {
      if (ilIillIlIi.field_1724 != null && entityId == ilIillIlIi.field_1724.method_5628() && ilIillIlIi.method_18854()) {
         ilIllIiIll(ilIillIlIi.field_1724.method_18798(), false);
      }
   }

   public static void IIiilIiiiIii() {
      IIlillIlIi = false;
      if (ilIillIlIi.field_1690 != null) {
         IlIllllIll(ilIillIlIi.field_1690.field_1886, IiIillIlIi, Long.MAX_VALUE);
         IlIllllIll(ilIillIlIi.field_1690.field_1904, liIillIlIi, Long.MAX_VALUE);
      }
   }

   public static void llIIlilIIl() {
      lilillIlIi = null;
   }

   public static boolean IIIllIIliIIl() {
      return !liIillIlIi.isEmpty();
   }

   public static Object lIiiIiIlilli() {
      return lilillIlIi;
   }

   private static boolean iiiIlIIIll(class_304 owner, ArrayDeque<lIliiliIliil> key, Object queue) {
      if (queue != null && owner != null && ilIillIlIi.field_1724 != null && ilIillIlIi.field_1755 == null && ilIillIlIi.method_18506() == null) {
         for (lIliiliIliil var4 : key) {
            if (var4.IliIlllilIi() == queue) {
               return false;
            }
         }

         AccessorKeyBinding var5 = (AccessorKeyBinding)owner;
         var5.corzSetTimesPressed(var5.corzGetTimesPressed() + 1);
         key.addLast(new lIliiliIliil(queue, IIiIllIiIl(iiIillIlIi, IIlillIlIi)));
         return true;
      } else {
         return false;
      }
   }

   private static List<ilIllIiIll> liIlliiIll() {
      if (IIiIIllIiIIl.IliIlllilIi()) {
         return List.of();
      } else {
         List var0 = llilIllililIll.IilliliilIIi();
         ArrayList var1 = new ArrayList();

         for (ilIllIiIll var3 : var0) {
            if (var3.IliIlllilIi()) {
               var1.add(var3);
            }
         }

         return var1;
      }
   }

   public static boolean IliIlllilIi() {
      return lIlillIlIi;
   }

   public static boolean iliIiiliiiii() {
      return !IiIillIlIi.isEmpty();
   }

   private IIllIIlilIllIIli() {
   }

   public static boolean Illlllllilll(Object owner) {
      return ilIillIlIi.field_1690 != null && iiiIlIIIll(ilIillIlIi.field_1690.field_1904, liIillIlIi, owner);
   }

   public static Object IilliliilIIi() {
      return IilillIlIi;
   }

   public static void IiIIlliIIl(class_1297 target) {
      lIlillIlIi = true;
      lllillIlIi = target;
      if (illillIlIi == 0) {
         iIlillIlIi = true;
      } else if (IilillIlIi != null) {
         IllillIlIi = true;
      }

      illIllilIilIllil.IliIlllilIi(target);
   }

   public static boolean IIIilIIiiIIi() {
      return IlIillIiilIi(liliIiliiliIil::ilIllIiIll);
   }

   public static void Iilililiiili() {
      iiIillIlIi++;
      IIlillIlIi = true;
      if (ilIillIlIi.field_1690 != null) {
         IlIllllIll(ilIillIlIi.field_1690.field_1886, IiIillIlIi, iiIillIlIi - 1L);
         IlIllllIll(ilIillIlIi.field_1690.field_1904, liIillIlIi, iiIillIlIi - 1L);
      }

      lIlillIlIi = false;
      iIlillIlIi = false;
      IllillIlIi = false;
      lllillIlIi = null;
      illillIlIi = 0;
      IilillIlIi = null;
      lilillIlIi = null;
   }

   private static Boolean iIiIlIliIl(Object presser) {
      if (IIiIIllIiIIl.IliIlllilIi()) {
         return null;
      } else if (IIillIiliIil()) {
         return Boolean.FALSE;
      } else if (!iIlillIlIi && (!lIlillIlIi || presser == null && !IllillIlIi)) {
         class_1657 var1 = presser == null ? iIiIlillIliIlill.IIIillIIil() : null;
         Object var2 = var1 != null ? var1 : lliIliliIl();
         iilllIllIIillIll var3 = lilIliilIl(IiiIlliiIl(), presser, (class_1297)var2);
         if (var3 == iilllIllIIillIll.IiIIIIilll) {
            return Boolean.FALSE;
         } else if (var3 == iilllIllIIillIll.liIIIIilll) {
            return Boolean.TRUE;
         } else {
            return var1 != null && iIiIlillIliIlill.iIIilIlIil(true) ? Boolean.TRUE : null;
         }
      } else {
         return Boolean.FALSE;
      }
   }

   static iilllIllIIillIll lilIliilIl(List<ilIIIiiIiIIIii> presser, Object interceptors, class_1297 target) {
      for (ilIIIiiIiIIIii var4 : presser) {
         iilllIllIIillIll var5 = var4.IIllllIlll(interceptors, target);
         if (var5 != null && var5 != iilllIllIIillIll.ilIIIIilll) {
            return var5;
         }
      }

      return iilllIllIIillIll.ilIIIIilll;
   }
}
