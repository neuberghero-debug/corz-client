package gg.corz;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.class_1799;

public final class llliliililliliil {
   public static final int llIIlIIiil = 6;
   public static final int lIIIlIIiil = 40;
   public static final int iIIIlIIiil = 3;
   private final Map<Integer, IiiiiIlliiiiIl> ilIIlIIiil = new HashMap<>();
   private final ArrayDeque<Long> IiIIlIIiil = new ArrayDeque<>();
   public static final int IlIIlIIiil = 100;

   public IlllIlilllllIlil IilliliilIIi(int tick, class_1799 current, long key) {
      if (this.iIlIlllllill(tick, current)) {
         return IlllIlilllllIlil.IlliIIiIil;
      } else {
         IiiiiIlliiiiIl var5 = this.ilIIlIIiil.get(tick);
         if (var5 != null
            && !var5.ililIIIilIiilIIIil
            && key - var5.lIilIIIiliIilIIIil <= 40L
            && iillilIiIIililIi.Iilllilliill(current, var5.iillIIIilIIilIIIil)) {
            var5.IlilIIIilllilIIIil++;
            var5.ililIIIilIiilIIIil = true;
            this.IiIIlIIiil.addLast(key);

            while (!this.IiIIlIIiil.isEmpty() && key - this.IiIIlIIiil.peekFirst() > 100L) {
               this.IiIIlIIiil.removeFirst();
            }

            if (this.IiIIlIIiil.size() >= 6) {
               this.IiIIlIIiil.clear();

               for (IiiiiIlliiiiIl var7 : this.ilIIlIIiil.values()) {
                  if (var7.IlilIIIilllilIIIil > 0) {
                     var7.IlilIIIilllilIIIil = 3;
                  }
               }

               return IlllIlilllllIlil.llliIIiIil;
            } else {
               return var5.IlilIIIilllilIIIil >= 3 ? IlllIlilllllIlil.IlliIIiIil : IlllIlilllllIlil.iIliIIiIil;
            }
         } else {
            return IlllIlilllllIlil.iIliIIiIil;
         }
      }
   }

   public void IliIlllilIi() {
      this.ilIIlIIiil.clear();
      this.IiIIlIIiil.clear();
   }

   public void lIiiIiIlilli(long tick) {
      Iterator var3 = this.ilIIlIIiil.values().iterator();

      while (var3.hasNext()) {
         IiiiiIlliiiiIl var4 = (IiiiiIlliiiiIl)var3.next();
         if (var4.IlilIIIilllilIIIil < 3 && tick - var4.lIilIIIiliIilIIIil > 40L) {
            var3.remove();
         }
      }
   }

   public boolean iIlIlllllill(int current, class_1799 key) {
      IiiiiIlliiiiIl var3 = this.ilIIlIIiil.get(current);
      if (var3 == null || var3.IlilIIIilllilIIIil < 3) {
         return false;
      } else if (iillilIiIIililIi.Iilllilliill(key, var3.iillIIIilIIilIIIil)) {
         return true;
      } else {
         this.ilIIlIIiil.remove(current);
         return false;
      }
   }

   public void liiiIIllIl(int snapshot, class_1799 tick, long key) {
      IiiiiIlliiiiIl var5 = this.ilIIlIIiil.computeIfAbsent(snapshot, k -> new IiiiiIlliiiiIl());
      var5.iillIIIilIIilIIIil = tick;
      var5.lIilIIIiliIilIIIil = key;
      var5.ililIIIilIiilIIIil = false;
   }
}
