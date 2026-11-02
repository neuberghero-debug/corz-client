package gg.corz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import net.minecraft.class_1799;

public final class llliIIiilliIIi {
   public static final double liIIIIIiiiiIIIIIii = 16.0;
   public static final int lIIIIIIiiiIIIIIIii = 40;
   public static final int ilIIIIIiiIiIIIIIii = 1200;
   public static final int IlIIIIIiillIIIIIii = 200;
   private final List<iilIiIllIIiIiIll> IIlIIIIiilIlIIIIii = new ArrayList<>();

   public void iIlIlllllill(ToIntFunction<class_1799> y, long z, double countOf, double tick, double x) {
      long var15 = -9037266342106227386L;
      Iterator var10 = this.IIlIIIIiilIlIIIIii.iterator();

      while (var10.hasNext()) {
         iilIiIllIIiIiIll var11 = (iilIiIllIIiIiIll)var10.next();
         if (var11.lIiIililll >= 0L) {
            if (z >= var11.lIiIililll || var11.IliIlllilIi(countOf, tick, x) > 16.0) {
               var10.remove();
            }
         } else {
            long var12 = z - var11.illIililll;
            if (var12 > 200L) {
               var10.remove();
            } else {
               var15 ^= ((long)y.applyAsInt(var11.lllIililll) << 32 ^ var15) & -1L << 32;
               if (var12 >= 38L && (int)(var15 >>> 32) > var11.IIiIililll) {
                  var11.lIiIililll = z + 1200L;
               } else {
                  var11.IIiIililll = Math.min(var11.IIiIililll, (int)(var15 >>> 32));
               }
            }
         }
      }
   }

   public boolean IilliliilIIi(class_1799 stack) {
      if (stack.method_7960()) {
         return false;
      } else {
         for (iilIiIllIIiIiIll var3 : this.IIlIIIIiilIlIIIIii) {
            if (var3.lIiIililll >= 0L && class_1799.method_31577(var3.lllIililll, stack)) {
               return true;
            }
         }

         return false;
      }
   }

   public void liiiIIllIl(class_1799 tick, int x, long remaining, double z, double kind, double y) {
      if (!tick.method_7960()) {
         this.IIlIIIIiilIlIIIIii.removeIf(t -> t.lIiIililll < 0L && class_1799.method_31577(t.lllIililll, tick));
         this.IIlIIIIiilIlIIIIii.add(new iilIiIllIIiIiIll(tick.method_46651(1), Math.max(0, x), remaining, z, kind, y));
      }
   }

   public void IliIlllilIi() {
      this.IIlIIIIiilIlIIIIii.clear();
   }
}
