package gg.corz;

import java.util.HashMap;

public final class lIlIliiiIlIlii {
   private static final int liIliIiIIl = 512;
   public static final long IiIliIiIIl = -9223372036854775807L;
   private final HashMap<Long, liIiIiiiIiIi> iiIliIiIIl = new HashMap<>();
   public static final long ilIliIiIIl = Long.MIN_VALUE;
   private long lIlliIiIIl;
   private long IIlliIiIIl;

   public long iliIiiliiiii() {
      return this.lIlliIiIIl;
   }

   public int IIIllIIliIIl() {
      return this.iiIliIiIIl.size();
   }

   public void IilliliilIIi() {
      this.iiIliIiIIl.clear();
   }

   public void liiiIIllIl(long revision, long result, long cell) {
      if (this.iiIliIiIIl.size() >= 512 && !this.iiIliIiIIl.containsKey(revision)) {
         this.iiIliIiIIl.clear();
      }

      liIiIiiiIiIi var7 = this.iiIliIiIIl.computeIfAbsent(revision, k -> new liIiIiiiIiIi());
      var7.liliiIIIliiliiIIIl = result;
      var7.IIiiiIIIllIiiiIIIl = cell;
   }

   public long IliIlllilIi(long cell, long revision) {
      liIiIiiiIiIi var5 = this.iiIliIiIIl.get(cell);
      if (var5 != null && var5.liliiIIIliiliiIIIl == revision) {
         this.IIlliIiIIl++;
         return var5.IIiiiIIIllIiiiIIIl;
      } else {
         this.lIlliIiIIl++;
         return -9223372036854775807L;
      }
   }

   public void iIlIlllllill(long cell) {
      this.iiIliIiIIl.remove(cell);
   }

   public long lIiiIiIlilli() {
      return this.IIlliIiIIl;
   }
}
