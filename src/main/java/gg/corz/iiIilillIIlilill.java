package gg.corz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class iiIilillIIlilill {
   public int IlilIliill;
   public final Map<Long, List<Long>> lIilIliill;
   public final Map<Long, List<Long>> IIilIliill = new HashMap<>();
   public int llilIliill;
   public int ililIliill;
   public final Map<Long, ilIiIllIiIiIll> iIilIliill;

   public int iIlIlllllill() {
      long var4 = -2649980550897482472L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (List var3 : this.IIilIliill.values()) {
         var4 ^= ((long)Math.max((int)(var4 >>> 32), var3.size()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public int IliIlllilIi() {
      return this.lIilIliill.size();
   }

   public int liiiIIllIl() {
      long var4 = -802063619311246741L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (List var3 : this.IIilIliill.values()) {
         if (var3.size() > 1) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public double IilliliilIIi() {
      long var4 = -4941557358583586165L;
      if (this.IIilIliill.isEmpty()) {
         return 0.0;
      } else {
         var4 ^= (0L ^ var4) & -1L << 32;

         for (List var3 : this.IIilIliill.values()) {
            var4 ^= ((long)((int)(var4 >>> 32) + var3.size()) << 32 ^ var4) & -1L << 32;
         }

         return (double)((int)(var4 >>> 32)) / (double)this.IIilIliill.size();
      }
   }

   public iiIilillIIlilill() {
      this.lIilIliill = new HashMap<>();
      this.iIilIliill = new HashMap<>();
   }
}
