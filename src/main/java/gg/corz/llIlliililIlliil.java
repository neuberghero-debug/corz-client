package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public final class llIlliililIlliil {
   private final Deque<Ililllililil> IIlIIiilil = new ArrayDeque<>();
   public static final long llIIIiilil = 300000L;
   public static final double IIIIIiilil = 8.0;
   public static final double ilIIIiilil = 10.0;
   private final List<class_243> lilIIiilil;
   public static final long IiIIIiilil = 2000L;
   private long iIlIIiilil = Long.MIN_VALUE;
   public static final long IlIIIiilil = 60000L;
   public static final double iIIIIiilil = 7.0;
   private long lllIIiilil;
   private class_243 IilIIiilil;
   private Object illIIiilil;
   private class_243 lIlIIiilil;
   private final List<class_238> iilIIiilil;
   private boolean IllIIiilil = true;
   public static final double lIIIIiilil = 4.0;
   public static final double liIIIiilil = 24.0;
   public static final int iiIIIiilil = 16;

   public void lIiiIiIlilli(class_243 pos, long nowMs) {
      if (pos != null) {
         this.lIlIIiilil = pos;
         this.iIlIIiilil = nowMs;
         this.lllIIiilil = Long.MIN_VALUE;
      }
   }

   public boolean iliIiiliiiii(class_243 explosionCenter) {
      if (explosionCenter == null) {
         return true;
      } else {
         this.Iilllilliill();

         for (class_238 var3 : this.iilIIiilil) {
            if (lllIliIlillIliIl.IIlilIliiIli(explosionCenter, var3) <= 7.0) {
               return true;
            }
         }

         if (!this.IllIIiilil) {
            return false;
         } else {
            for (class_243 var8 : this.lilIIiilil) {
               if (Ililllililil(var8, explosionCenter)) {
                  return true;
               }
            }

            long var7 = IIIiillllIIiilll.IliIlllilIi();

            for (Ililllililil var5 : this.IIlIIiilil) {
               if (var7 - var5.liiiIIllIl() <= 2000L && Ililllililil(var5.IliIlllilIi(), explosionCenter)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   static boolean IliIlllilIi(class_1799 stack) {
      if (stack != null && !stack.method_7960()) {
         class_1792 var1 = stack.method_7909();
         return var1 != class_1802.field_8288 && var1 != class_1802.field_8301 && var1 != class_1802.field_8868
            ? var1.method_57347().method_57832(class_9334.field_54196) || var1.method_57347().method_57832(class_9334.field_50077)
            : true;
      } else {
         return false;
      }
   }

   public class_243 IlIlllIlilIl(class_243 from, double max) {
      if (from != null && max > 0.0) {
         this.Iilllilliill();
         long var4 = IIIiillllIIiilll.IliIlllilIi();
         this.Illlllllilll(var4);
         class_243 var6 = null;
         double var7 = Double.POSITIVE_INFINITY;

         for (class_243 var10 : this.lilIIiilil) {
            double var11 = var10.method_1022(from);
            if (!(var11 > max)) {
               double var13 = var11 - (this.IIlllIlliIll(var10, var4) ? 8.0 : 0.0);
               if (var13 < var7) {
                  var7 = var13;
                  var6 = var10;
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private boolean IIillIiliIil(class_243 now, long pos) {
      return this.lIlIIiilil != null && this.iIlIIiilil != Long.MIN_VALUE && pos - this.iIlIIiilil <= 300000L
         ? now.method_1025(this.lIlIIiilil) <= 100.0
         : false;
   }

   public void IilliliilIIi(class_243 pos, long nowMs) {
      if (pos != null) {
         this.IIlIIiilil.addLast(new Ililllililil(pos, nowMs));

         while (this.IIlIIiilil.size() > 16) {
            this.IIlIIiilil.removeFirst();
         }

         this.lllIIiilil = Long.MIN_VALUE;
      }
   }

   public llIlliililIlliil() {
      this.lllIIiilil = Long.MIN_VALUE;
      this.lilIIiilil = new ArrayList<>();
      this.iilIIiilil = new ArrayList<>();
   }

   private boolean IIlllIlliIll(class_243 now, long item) {
      for (Ililllililil var5 : this.IIlIIiilil) {
         if (item - var5.liiiIIllIl() <= 60000L && Ililllililil(var5.IliIlllilIi(), now)) {
            return true;
         }
      }

      return false;
   }

   public void IiIlliIliiIl() {
      this.IIlIIiilil.clear();
      this.lIlIIiilil = null;
      this.iIlIIiilil = Long.MIN_VALUE;
      this.lllIIiilil = Long.MIN_VALUE;
      this.illIIiilil = null;
      this.IilIIiilil = null;
      this.lilIIiilil.clear();
      this.iilIIiilil.clear();
   }

   public boolean iIlIlllllill() {
      return this.IllIIiilil;
   }

   public void liiiIIllIl(boolean on) {
      if (this.IllIIiilil != on) {
         this.lllIIiilil = Long.MIN_VALUE;
      }

      this.IllIIiilil = on;
   }

   public boolean IIIllIIliIIl(class_243 pos) {
      if (pos == null) {
         return false;
      } else {
         this.Iilllilliill();

         for (class_243 var3 : this.lilIIiilil) {
            if (Ililllililil(var3, pos)) {
               return true;
            }
         }

         return false;
      }
   }

   private void Illlllllilll(long now) {
      Iterator var3 = this.IIlIIiilil.iterator();

      while (var3.hasNext()) {
         if (now - ((Ililllililil)var3.next()).liiiIIllIl() > 60000L) {
            var3.remove();
         }
      }
   }

   private void Iilllilliill() {
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      class_638 var3 = var1.field_1687;
      long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (var2 != null && var3 != null) {
         class_243 var6 = var2.method_73189();
         if (this.lllIIiilil != var4 || this.illIIiilil != var3 || this.IilIIiilil == null || !(this.IilIIiilil.method_1025(var6) < 1.0)) {
            this.lllIIiilil = var4;
            this.illIIiilil = var3;
            this.IilIIiilil = var6;
            this.lilIIiilil.clear();
            this.iilIIiilil.clear();
            long var7 = IIIiillllIIiilll.IliIlllilIi();
            class_238 var9 = var2.method_5829().method_1014(24.0);

            for (class_1542 var11 : var3.method_8390(class_1542.class, var9, e -> e.method_5805() && !e.method_31481())) {
               if (IliIlllilIi(var11.method_6983()) && !this.IIillIiliIil(var11.method_73189(), var7)) {
                  this.lilIIiilil.add(var11.method_73189());
               }
            }

            for (class_1657 var13 : var3.method_18456()) {
               if (var13 != var2
                  && var13.method_5805()
                  && !var13.method_31481()
                  && !var13.method_7325()
                  && !(var13.method_5858(var2) > 961.0)
                  && (iIIiIiIlIlIiIiIl.liiiIIllIl(var13) || liiIIIlliiiIIIll.IilliliilIIi(var13))) {
                  this.iilIIiilil.add(var13.method_5829());
               }
            }
         }
      } else {
         this.lilIIiilil.clear();
         this.iilIIiilil.clear();
         this.lllIIiilil = var4;
         this.illIIiilil = null;
      }
   }

   private static boolean Ililllililil(class_243 a, class_243 b) {
      double var2 = a.field_1352 - b.field_1352;
      double var4 = a.field_1350 - b.field_1350;
      return var2 * var2 + var4 * var4 <= 64.0 && Math.abs(a.field_1351 - b.field_1351) <= 4.0;
   }
}
