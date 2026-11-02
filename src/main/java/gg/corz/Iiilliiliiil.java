package gg.corz;

import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Iiilliiliiil {
   public final int IlIIllllIIll;
   public final Map<Long, List<liiIiiiiIi>> lIIIlliIIIll;
   public final int IiiiIlliiiIl;
   public final Set<Long> iiiiIlIIIIll;

   Iiilliiliiil(int remainingWork, Set<Long> frontier, Map<Long, List<liiIiiiiIi>> y, int walkable) {
      this.IiiiIlliiiIl = remainingWork;
      this.iiiiIlIIIIll = frontier;
      this.lIIIlliIIIll = y;
      this.IlIIllllIIll = walkable;
   }

   public boolean IliIlllilIi() {
      long var2 = -5241480941158122262L;
      var2 ^= ((long)this.liiiIIllIl() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) > 0 && ((int)(var2 >>> 32) >= 4 || this.IlIIllllIIll >= 8);
   }

   public int iliIiiliiiii(long feet) {
      long var8 = -2347516253423937937L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (List var5 : this.lIIIlliIIIll.values()) {
         for (liiIiiiiIi var7 : var5) {
            if (var7.liiiIIllIl() == feet) {
               var8 += 4294967296L;
               break;
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   public boolean iIlIlllllill(long feet) {
      return this.iiiiIlIIIIll.contains(feet);
   }

   public int liiiIIllIl() {
      long var6 = 9038778930219909015L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (List var3 : this.lIIIlliIIIll.values()) {
         for (liiIiiiiIi var5 : var3) {
            if (var5.iIlIlllllill() == iIlIililIllIilil.lIIiiIIlil) {
               var6 += 4294967296L;
               break;
            }
         }
      }

      return (int)(var6 >>> 32);
   }

   public int IilliliilIIi() {
      return this.lIIIlliIIIll.size();
   }

   public int lIiiIiIlilli() {
      return this.iiiiIlIIIIll.size();
   }
}
