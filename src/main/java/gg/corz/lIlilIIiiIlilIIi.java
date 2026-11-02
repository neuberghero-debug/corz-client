package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public final class lIlilIIiiIlilIIi {
   private static final Comparator<IiIillIlliIillIl> illilIiiil = lIlilIIiiIlilIIi::IilliliilIIi;
   private static final llIIIIlilIIIIl lllilIiiil = new llIIIIlilIIIIl(0L, 0L, 0L);
   private static final Comparator<IiIillIlliIillIl> IililIiiil = illilIiiil.thenComparing(Comparator.comparingLong(IiIillIlliIillIl::IlIlllIlilIl).reversed())
      .thenComparing(Comparator.comparingDouble(IiIillIlliIillIl::IiIlliIliiIl).reversed())
      .thenComparingLong(IiIillIlliIillIl::iliIiiliiiii)
      .thenComparingInt(IiIillIlliIillIl::iIlIlllllill)
      .thenComparingInt(IiIillIlliIillIl::IilliliilIIi);

   private static int IilliliilIIi(IiIillIlliIillIl b, IiIillIlliIillIl a) {
      long var2 = Math.max(1L, b.IlIlllIlilIl());
      long var4 = Math.max(1L, a.IlIlllIlilIl());
      long var6 = Math.multiplyHigh(b.iliIiiliiiii(), var4);
      long var8 = Math.multiplyHigh(a.iliIiiliiiii(), var2);
      return var6 != var8 ? Long.compare(var6, var8) : Long.compareUnsigned(b.iliIiiliiiii() * var4, a.iliIiiliiiii() * var2);
   }

   public static List<IiIillIlliIillIl> IliIlllilIi(Collection<IiIillIlliIillIl> rules, llIIIIlilIIIIl listings) {
      ArrayList var2 = new ArrayList();
      if (rules == null) {
         return var2;
      } else {
         llIIIIlilIIIIl var3 = listings == null ? lllilIiiil : listings;

         for (IiIillIlliIillIl var5 : rules) {
            if (iIlIlllllill(var5, var3)) {
               var2.add(var5);
            }
         }

         var2.sort(IililIiiil);
         return var2;
      }
   }

   private static boolean iIlIlllllill(IiIillIlliIillIl l, llIIIIlilIIIIl r) {
      if (l == null || l.iliIiiliiiii() <= 0L || l.IlIlllIlilIl() <= 0L) {
         return false;
      } else if (r.IliIlllilIi() > 0L && l.IIIllIIliIIl() > r.IliIlllilIi()) {
         return false;
      } else {
         return r.iIlIlllllill() > 0L && l.IIIllIIliIIl() > r.iIlIlllllill() ? false : l.IlIlllIlilIl() >= r.liiiIIllIl();
      }
   }

   private lIlilIIiiIlilIIi() {
   }

   public static Optional<IiIillIlliIillIl> liiiIIllIl(Collection<IiIillIlliIillIl> rules, llIIIIlilIIIIl listings) {
      List var2 = IliIlllilIi(rules, listings);
      return var2.isEmpty() ? Optional.empty() : Optional.of((IiIillIlliIillIl)var2.get(0));
   }
}
