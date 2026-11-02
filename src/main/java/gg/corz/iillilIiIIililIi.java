package gg.corz;

import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2480;
import net.minecraft.class_2815;
import net.minecraft.class_310;
import net.minecraft.class_4081;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_746;
import net.minecraft.class_9276;
import net.minecraft.class_9288;
import net.minecraft.class_9334;

public final class iillilIiIIililIi {
   public static boolean IlIlllIlilIl() {
      return !liiIIiIiiiiIIiIi.iIlllIllll();
   }

   public static boolean Iilllilliill(class_1799 a, class_1799 b) {
      return !a.method_7960() && !b.method_7960() ? a.method_7947() == b.method_7947() && class_1799.method_31577(a, b) : a.method_7960() && b.method_7960();
   }

   private iillilIiIIililIi() {
   }

   public static boolean Iiilliiliiil() {
      return IIlilIliiIli(iIlIilIlIllIilIl.class)
         || IIlilIliiIli(iiliililIIiiilil.class)
         || IIlilIliiIli(iIIiIlIlIiIl.class)
         || IIlilIliiIli(lIIIlIIliIIIlIIl.class);
   }

   public static boolean iIlIlllllill(class_310 owner, Object mc) {
      class_746 var2 = owner.field_1724;
      if (var2 == null || owner.field_1687 == null || owner.field_1761 == null) {
         return false;
      } else if (!var2.method_5805() || var2.method_7325() || var2.method_31549().field_7477 || var2.method_5765()) {
         return false;
      } else if (owner.field_1755 != null && !(owner.field_1755 instanceof class_490)) {
         return false;
      } else if (owner.field_1761.method_2923() || !IIlllIlliIll(var2)) {
         return false;
      } else {
         return lIlillliIlilll.iIlIlllllill(mc) && !IilliliilIIi() && !lllIIllillIIll.iIlIlllllill() ? !Iiilliiliiil() : false;
      }
   }

   public static void Ililllililil(class_310 mc, int syncId) {
      if (!(mc.field_1755 instanceof class_465)) {
         if (mc.method_1562() != null) {
            mc.method_1562().method_52787(new class_2815(syncId));
         }
      }
   }

   private static boolean IIIllIIliIIl(class_310 owner, Object mc) {
      class_746 var2 = owner.field_1724;
      if (var2 == null || owner.field_1687 == null || owner.field_1761 == null) {
         return false;
      } else if (!var2.method_5805() || var2.method_7325() || var2.method_31549().field_7477 || var2.method_5765()) {
         return false;
      } else if (owner.field_1755 != null && !(owner.field_1755 instanceof class_490)) {
         return false;
      } else if (owner.field_1761.method_2923() || !IIlllIlliIll(var2)) {
         return false;
      } else {
         return lIlillliIlilll.iIlIlllllill(mc) && !lIiiIiIlilli(mc) && !lllIIllillIIll.iIlIlllllill() ? !Iiilliiliiil() : false;
      }
   }

   public static boolean IlIillIiilIi(class_1799 s) {
      long var6 = -4358467447721825991L;
      if (!s.method_31574(class_1802.field_8574) && !s.method_31574(class_1802.field_8436) && !s.method_31574(class_1802.field_8150)) {
         return false;
      } else {
         class_1844 var1 = (class_1844)s.method_58694(class_9334.field_49651);
         if (var1 == null) {
            return false;
         } else {
            var6 ^= (0L ^ var6) & -1L << 32;

            for (class_1293 var4 : var1.method_57397()) {
               class_4081 var5 = ((class_1291)var4.method_5579().comp_349()).method_18792();
               if (var5 == class_4081.field_18271) {
                  return false;
               }

               if (var5 == class_4081.field_18272) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
            }

            return (boolean)((int)(var6 >>> 32));
         }
      }
   }

   public static boolean iliIiiliiiii(class_310 mc, Object owner) {
      return !lIlIiIliIlIiIl.Illlllllilll() && IIIllIIliIIl(mc, owner);
   }

   public static boolean lIiiIiIlilli(Object owner) {
      return IilIIililIIi.IilliliilIIi() || IIIIilIilIIIilIi.lIIlliIIll() || iIIiIlIiIlIiIlIi.IiIlliIliiIl() || IIllIIlilIllIIli.Illillliilli(owner);
   }

   public static boolean IIIilIIiiIIi(class_1799 s) {
      if (s.method_7960()) {
         return false;
      } else if (s.method_31574(class_1802.field_8288) || s.method_57826(class_9334.field_54274)) {
         return true;
      } else if (s.method_31574(class_1802.field_8833) || s.method_57826(class_9334.field_54197)) {
         return true;
      } else if (s.method_31574(class_1802.field_8598) || s.method_31574(class_1802.field_8466)) {
         return true;
      } else if (!s.method_57826(class_9334.field_49631) && !s.method_57826(class_9334.field_49614)) {
         if (s.method_7909() instanceof class_1747 var1 && var1.method_7711() instanceof class_2480) {
            return true;
         }

         class_9288 var3 = (class_9288)s.method_58694(class_9334.field_49622);
         if (var3 != null && var3.method_59712().findAny().isPresent()) {
            return true;
         } else {
            class_9276 var4 = (class_9276)s.method_58694(class_9334.field_49650);
            return var4 != null && !var4.method_57429();
         }
      } else {
         return true;
      }
   }

   public static boolean IIlllIlliIll(class_746 p) {
      return p.field_7512 == p.field_7498 && p.field_7512.method_34255().method_7960() && !p.method_6115();
   }

   public static boolean IilliliilIIi() {
      return IilIIililIIi.IilliliilIIi() || IIIIilIilIIIilIi.lIIlliIIll() || iIIiIlIiIlIiIlIi.IiIlliIliiIl() || IIllIIlilIllIIli.IIIilIIiiIIi();
   }

   private static boolean IIlilIliiIli(Class<? extends ilIllIiIll> type) {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(type);
      return var1 != null && var1.IliIlllilIi();
   }

   public static int IliIlllilIi(int invSlot) {
      return invSlot < 9 ? 36 + invSlot : invSlot;
   }

   public static boolean IiIiliIiiiIi(class_1799 s) {
      return s.method_57826(class_9334.field_50075) && !s.method_31574(class_1802.field_8463) && !s.method_31574(class_1802.field_8367);
   }

   public static boolean liiiIIllIl(class_310 owner, Object mc) {
      return !lIlIiIliIlIiIl.Illlllllilll() && iIlIlllllill(owner, mc);
   }

   public static int IIillIiliIil(class_746 p, class_1799 kind) {
      long var5 = 8991580211206317920L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 <= 40; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         if ((int)var5 < 36 || (int)var5 >= 40) {
            class_1799 var4 = p.method_31548().method_5438((int)var5);
            if (!var4.method_7960() && class_1799.method_31577(var4, kind)) {
               var5 ^= ((long)((int)(var5 >>> 32) + var4.method_7947()) << 32 ^ var5) & -1L << 32;
            }
         }
      }

      return (int)(var5 >>> 32);
   }

   public static boolean Illlllllilll(class_746 p) {
      return lIlIiIliIlIiIl.IIIilIIiiIIi() >= 3 && !p.method_5624();
   }

   public static boolean IiIlliIliiIl(class_746 p) {
      return p.method_31549().field_7476;
   }
}
