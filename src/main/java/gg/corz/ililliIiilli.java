package gg.corz;

import java.util.IdentityHashMap;
import java.util.Map;

final class ililliIiilli {
   private final Map<Object, long[]> iiIilIlIlIIlilIlIl = new IdentityHashMap<>();
   private long lIlilIlIliIlilIlIl;

   long IliIlllilIi() {
      return this.lIlilIlIliIlilIlIl;
   }

   void liiiIIllIl(Object owner) {
      if (owner != null) {
         this.iiIilIlIlIIlilIlIl.computeIfAbsent(owner, o -> new long[3])[0] = ++this.lIlilIlIliIlilIlIl;
      }
   }

   void iIlIlllllill(Object latestUntilMs, long owner) {
      if (latestUntilMs != null) {
         long[] var4 = this.iiIilIlIlIIlilIlIl.computeIfAbsent(latestUntilMs, o -> new long[3]);
         var4[1] = ++this.lIlilIlIliIlilIlIl;
         var4[2] = owner;
      }
   }

   long IilliliilIIi(Object untilMs, long sinceEpoch, long owner) {
      long[] var6 = this.iiIilIlIlIIlilIlIl.get(untilMs);
      if (var6 == null) {
         return owner;
      } else if (var6[0] > sinceEpoch) {
         return Long.MIN_VALUE;
      } else {
         return var6[1] > sinceEpoch ? Math.min(owner, var6[2]) : owner;
      }
   }
}
