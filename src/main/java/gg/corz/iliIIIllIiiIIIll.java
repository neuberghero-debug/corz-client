package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class iliIIIllIiiIIIll {
   public static final int ilIliiIlll = 3;
   public static final int IiIliiIlll = 120;
   private int iiIliiIlll;
   private final Map<Long, IIiillIiil> liIliiIlll = new HashMap<>();
   private int lIlliiIlll;
   private int IIlliiIlll;

   public int IiIlliIliiIl() {
      return this.liIliiIlll.size();
   }

   public int iliIiiliiiii() {
      return this.iiIliiIlll;
   }

   public static long IliIlllilIi(long from, long kind, int to) {
      long var5 = from * -7046029254386353131L;
      var5 ^= kind + -4417276706812531889L + (var5 << 6) + (var5 >>> 2);
      return var5 * 31L + (long)to;
   }

   public void IilliliilIIi() {
      this.liIliiIlll.clear();
   }

   public void lIiiIiIlilli() {
      this.liIliiIlll.clear();
      this.iiIliiIlll = this.IIlliiIlll = this.lIlliiIlll = 0;
   }

   public boolean liiiIIllIl(long kind, long to, int from, int tick) {
      long var12 = 3187529255201633745L;
      this.lIlliiIlll++;
      long var7 = IliIlllilIi(kind, to, from);
      IIiillIiil var9 = this.liIliiIlll.get(var7);
      if (var9 != null && tick - var9.liiiIIllIl() <= 120) {
         var12 ^= ((long)(var9.IliIlllilIi() + 1) << 32 ^ var12) & -1L << 32;
         if ((int)(var12 >>> 32) < 3) {
            this.liIliiIlll.put(var7, new IIiillIiil((int)(var12 >>> 32), var9.liiiIIllIl(), var9.iIlIlllllill()));
            return false;
         } else {
            var12 ^= ((long)(tick < var9.iIlIlllllill() ? 1 : 0) ^ var12) & -1L >>> 32;
            this.liIliiIlll.put(var7, new IIiillIiil((int)(var12 >>> 32), var9.liiiIIllIl(), tick + 120));
            if ((int)var12 != 0) {
               return false;
            } else {
               this.iiIliiIlll++;
               return true;
            }
         }
      } else {
         this.liIliiIlll.put(var7, new IIiillIiil(1, tick, 0));
         return false;
      }
   }

   public boolean iIlIlllllill(long kind, long tick, int to, int from) {
      long var9 = 3618460370148864151L;
      IIiillIiil var7 = this.liIliiIlll.get(IliIlllilIi(kind, tick, to));
      var9 ^= ((long)(var7 != null && from < var7.iIlIlllllill() ? 1 : 0) << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) != 0) {
         this.IIlliiIlll++;
      }

      return (boolean)((int)(var9 >>> 32));
   }

   public int IlIlllIlilIl() {
      return this.lIlliiIlll;
   }

   public int IIIllIIliIIl() {
      return this.IIlliiIlll;
   }
}
