package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

final class iIIIIlIlIIIl<T> {
   private final long liiiliIliiiiliIl;
   private final ArrayDeque<lIiIlliIiIll<T>> iliiliIlIiiiliIl = new ArrayDeque<>();

   void Illlllllilll(Object owner) {
      for (lIiIlliIiIll var3 : this.iliiliIlIiiiliIl) {
         var3.iliIiiliiiii(owner);
      }
   }

   boolean IliIlllilIi() {
      return this.iliiliIlIiiiliIl.isEmpty();
   }

   List<T> IlIlllIlilIl(long now) {
      ArrayList var3 = new ArrayList();

      while (!this.iliiliIlIiiiliIl.isEmpty() && this.iliiliIlIiiiliIl.peekFirst().IlIlllIlilIl(now, this.liiiliIliiiiliIl)) {
         var3.add(this.iliiliIlIiiiliIl.pollFirst().liIiIIIiiiIiIIIi);
      }

      return var3;
   }

   void Iilllilliill(Object owner, long latestUntilMs) {
      for (lIiIlliIiIll var5 : this.iliiliIlIiiiliIl) {
         var5.IIIllIIliIIl(owner, latestUntilMs);
      }
   }

   void IIlllIlliIll() {
      this.iliiliIlIiiiliIl.clear();
   }

   iIIIIlIlIIIl(long maxAgeMs) {
      this.liiiliIliiiiliIl = maxAgeMs;
   }

   boolean IIillIiliIil(Object owner) {
      Iterator var2 = this.iliiliIlIiiiliIl.iterator();

      while (var2.hasNext()) {
         if (((lIiIlliIiIll)var2.next()).lIiiIiIlilli(owner)) {
            return true;
         }
      }

      return false;
   }

   lIiIlliIiIll<T> lIiiIiIlilli(Predicate<T> test) {
      Iterator var2 = this.iliiliIlIiiiliIl.descendingIterator();

      while (var2.hasNext()) {
         lIiIlliIiIll var3 = (lIiIlliIiIll)var2.next();
         if (test.test(var3.liIiIIIiiiIiIIIi)) {
            return var3;
         }
      }

      return null;
   }

   boolean iliIiiliiiii(lIiIlliIiIll<T> entry) {
      return this.iliiliIlIiiiliIl.removeLastOccurrence(entry);
   }

   int liiiIIllIl() {
      return this.iliiliIlIiiiliIl.size();
   }

   boolean IIIllIIliIIl(T payload) {
      lIiIlliIiIll var2 = this.iliiliIlIiiiliIl.peekLast();
      if (var2 != null && var2.liIiIIIiiiIiIIIi == payload) {
         this.iliiliIlIiiiliIl.pollLast();
         return true;
      } else {
         return false;
      }
   }

   long Ililllililil(long now) {
      lIiIlliIiIll var3 = this.iliiliIlIiiiliIl.peekFirst();
      return var3 == null ? 0L : Math.max(0L, now - var3.IIliIIIilIliIIIi);
   }

   lIiIlliIiIll<T> iIlIlllllill(T payload, long now) {
      lIiIlliIiIll var4 = new lIiIlliIiIll<>(payload, now);
      this.iliiliIlIiiiliIl.addLast(var4);
      return var4;
   }

   lIiIlliIiIll<T> IilliliilIIi() {
      return this.iliiliIlIiiiliIl.peekLast();
   }

   List<T> IiIlliIliiIl() {
      ArrayList var1 = new ArrayList(this.iliiliIlIiiiliIl.size());

      while (!this.iliiliIlIiiiliIl.isEmpty()) {
         var1.add(this.iliiliIlIiiiliIl.pollFirst().liIiIIIiiiIiIIIi);
      }

      return var1;
   }
}
