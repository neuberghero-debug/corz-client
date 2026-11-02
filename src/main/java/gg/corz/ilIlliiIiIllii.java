package gg.corz;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ilIlliiIiIllii<K> {
   private final ConcurrentHashMap<K, IlIliiilllIliiil> iilIIliIIl = new ConcurrentHashMap<>();

   public void iIlIlllllill(K k, IlIliiilllIliiil e) {
      if (k != null && e != null && e.IliIlllilIi() > 0L) {
         this.iilIIliIIl.put((K)k, e);
      }
   }

   public int iliIiiliiiii() {
      return this.iilIIliIIl.size();
   }

   public void IIIllIIliIIl() {
      this.iilIIliIIl.clear();
   }

   public Map<K, IlIliiilllIliiil> lIiiIiIlilli() {
      return Collections.unmodifiableMap(this.iilIIliIIl);
   }

   public int IilliliilIIi(long today) {
      long var4 = 3221533278297561721L;
      var4 ^= ((long)this.iilIIliIIl.size() << 32 ^ var4) & -1L << 32;
      this.iilIIliIIl.values().removeIf(e -> today - Math.max(e.liiiIIllIl(), e.IilliliilIIi()) > 30L);
      return (int)(var4 >>> 32) - this.iilIIliIIl.size();
   }

   public long IliIlllilIi(K today, long k) {
      IlIliiilllIliiil var4 = today == null ? null : this.iilIIliIIl.get(today);
      if (var4 == null) {
         return 0L;
      } else if (var4.IliIlllilIi() > 0L && k - var4.liiiIIllIl() <= 30L) {
         return var4.IliIlllilIi();
      } else {
         return var4.iIlIlllllill() > 0L && k - var4.IilliliilIIi() <= 30L ? var4.iIlIlllllill() : 0L;
      }
   }

   public boolean liiiIIllIl(K unitPrice, long k, long today) {
      long var12 = 4303147418238594416L;
      if (unitPrice != null && k > 0L) {
         IlIliiilllIliiil var6 = this.iilIIliIIl.get(unitPrice);
         long var7 = this.IliIlllilIi((K)unitPrice, today);
         if (var6 != null && var7 > 0L && k > var7) {
            var12 ^= ((long)(var6.IliIlllilIi() > 0L && today - var6.liiiIIllIl() <= 30L ? 1 : 0) << 32 ^ var12) & -1L << 32;
            long var10 = (int)(var12 >>> 32) != 0 && var6.iIlIlllllill() > var6.IliIlllilIi() && today - var6.IilliliilIIi() <= 30L
               ? Math.min(var6.iIlIlllllill(), k)
               : k;
            this.iilIIliIIl.put((K)unitPrice, new IlIliiilllIliiil(var7, (int)(var12 >>> 32) != 0 ? var6.liiiIIllIl() : var6.IilliliilIIi(), var10, today));
            return (int)(var12 >>> 32) == 0;
         } else {
            this.iilIIliIIl.put((K)unitPrice, new IlIliiilllIliiil(k, today));
            return true;
         }
      } else {
         return false;
      }
   }
}
