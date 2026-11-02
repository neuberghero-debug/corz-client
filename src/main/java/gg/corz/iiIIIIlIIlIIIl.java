package gg.corz;

import java.util.Iterator;
import java.util.Map;

public record iiIIIIlIIlIIIl<K>(int y, Map<K, Integer> counts) {
   private final int iiIIiIiIlIIlIiIiIl;
   private final Map<K, Integer> lIlIiIiIliIlIiIiIl;

   public int IliIlllilIi() {
      long var4 = -3201501897075035776L;
      var4 ^= (0L ^ var4) & -1L << 32;
      Iterator var2 = this.lIlIiIiIliIlIiIiIl.values().iterator();

      while (var2.hasNext()) {
         var4 ^= ((long)((Integer)var2.next()).intValue() ^ var4) & -1L >>> 32;
         var4 ^= ((long)((int)(var4 >>> 32) + Math.max(0, (int)var4)) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public iiIIIIlIIlIIIl(int y, Map<K, Integer> counts) {
      this.iiIIiIiIlIIlIiIiIl = y;
      this.lIlIiIiIliIlIiIiIl = counts;
   }

   public Map<K, Integer> iIlIlllllill() {
      return this.lIlIiIiIliIlIiIiIl;
   }

   public int liiiIIllIl() {
      return this.iiIIiIiIlIIlIiIiIl;
   }
}
