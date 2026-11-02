package gg.corz;

import java.util.HashMap;
import java.util.Map;
import java.util.function.LongUnaryOperator;

public final class liiiIilliiiiIill {
   private final Map<Long, llliIiilliIi> lIiililill = new HashMap<>();
   private long Iliililill;
   private final int iIiililill;

   public void IIIllIIliIIl() {
      this.lIiililill.clear();
   }

   public llliIiilliIi iIlIlllllill(long goal) {
      return this.lIiililill.get(goal);
   }

   public int iliIiiliiiii() {
      return this.lIiililill.size();
   }

   public boolean IilliliilIIi(long goal, long stateOf, long ttl, int tick, int originKey, LongUnaryOperator worldRevision) {
      long var12 = 2970953169431883009L;
      llliIiilliIi var10 = this.lIiililill.get(goal);
      if (var10 == null || var10.liiiIIllIl() != stateOf || tick - var10.iIlIlllllill() >= originKey) {
         return false;
      } else if (var10.IliIlllilIi() == ttl) {
         return true;
      } else if (var10.IilliliilIIi() == null) {
         return false;
      } else {
         var12 ^= ((long)(IliIlllilIi(var10.IilliliilIIi(), worldRevision) == var10.lIiiIiIlilli() ? 1 : 0) << 32 ^ var12) & -1L << 32;
         if ((int)(var12 >>> 32) != 0) {
            this.Iliililill++;
         }

         return (boolean)((int)(var12 >>> 32));
      }
   }

   public static long IliIlllilIi(long[] stateOf, LongUnaryOperator cells) {
      long var9 = 1884001859415498954L;
      long var2 = -3750763034362895579L;
      long[] var4 = stateOf;
      var9 ^= ((long)stateOf.length << 32 ^ var9) & -1L << 32;

      for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         long var7 = var4[(int)var12];
         var2 = (var2 ^ var7 * -7046029254386353131L + cells.applyAsLong(var7)) * 1099511628211L;
      }

      return var2;
   }

   public liiiIilliiiiIill(int maxEntries) {
      this.iIiililill = maxEntries;
   }

   public void liiiIIllIl(long worldRevision, long originKey, long footprint, int stateOf, long[] goal, LongUnaryOperator tick) {
      if (this.lIiililill.size() >= this.iIiililill) {
         this.lIiililill.clear();
      }

      long var10 = goal == null ? 0L : IliIlllilIi(goal, tick);
      this.lIiililill.put(worldRevision, new llliIiilliIi(originKey, footprint, stateOf, goal == null ? null : (long[])goal.clone(), var10));
   }

   public long lIiiIiIlilli() {
      return this.Iliililill;
   }
}
