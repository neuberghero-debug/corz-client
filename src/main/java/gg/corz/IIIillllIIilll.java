package gg.corz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ToLongFunction;

public final class IIIillllIIilll {
   private final Map<IIliIIilIliIIi, Long> lIlIIlIIiiIlIIlIIi = new HashMap<>();
   private long IllIIlIIilllIIlIIi;

   public int iIlIlllllill(ToLongFunction<IIliIIilIliIIi> geometryOf) {
      long var5 = 3634890521948251252L;
      var5 ^= (0L ^ var5) & -1L << 32;
      Iterator var3 = this.lIlIIlIIiiIlIIlIIi.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if ((Long)var4.getValue() != geometryOf.applyAsLong((IIliIIilIliIIi)var4.getKey())) {
            var3.remove();
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public boolean liiiIIllIl(IIliIIilIliIIi geometry, long edge) {
      Long var4 = this.lIlIIlIIiiIlIIlIIi.get(geometry);
      if (var4 == null) {
         return false;
      } else if (var4 != edge) {
         this.lIlIIlIIiiIlIIlIIi.remove(geometry);
         return false;
      } else {
         this.IllIIlIIilllIIlIIi++;
         return true;
      }
   }

   public int iliIiiliiiii() {
      return this.lIlIIlIIiiIlIIlIIi.size();
   }

   public int lIiiIiIlilli(LongPredicate from) {
      long var3 = 6652437350737201323L;
      var3 ^= ((long)this.lIlIIlIIiiIlIIlIIi.size() << 32 ^ var3) & -1L << 32;
      this.lIlIIlIIiiIlIIlIIi.keySet().removeIf(fromx -> from.test(fromx.IliIlllilIi()));
      return (int)(var3 >>> 32) - this.lIlIIlIIiiIlIIlIIi.size();
   }

   public static iiiIIiilIIIlIiil IiIlliIliiIl(iiiIIiilIIIlIiil dx, int dy, int dz, int kind) {
      long var6 = 4759856765312133531L;
      var6 ^= ((long)Math.abs(dy) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.abs(kind) ^ var6) & -1L >>> 32;
      if ((int)(var6 >>> 32) + (int)var6 != 2 || (int)(var6 >>> 32) != 2 && (int)var6 != 2) {
         if (dz > 0) {
            return iiiIIiilIIIlIiil.iIIIiillil;
         } else if (dz < 0) {
            return iiiIIiilIIIlIiil.llIIiillil;
         } else {
            return (int)(var6 >>> 32) == 1 && (int)var6 == 1 ? iiiIIiilIIIlIiil.lIIIiillil : iiiIIiilIIIlIiil.IIIIiillil;
         }
      } else {
         return iiiIIiilIIIlIiil.ilIIiillil;
      }
   }

   public boolean IilliliilIIi(IIliIIilIliIIi edge) {
      return this.lIlIIlIIiiIlIIlIIi.containsKey(edge);
   }

   public static long IIlllIlliIll(long blockState, long to, LongUnaryOperator from) {
      long var16 = 2948822242456137771L;
      long var18 = -4457912265981012930L;
      long var20 = -8480661131498532917L;
      long var22 = 2941331777839233687L;
      long var24 = 4349753190396593059L;
      var16 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(blockState) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(blockState) ^ var16) & -1L >>> 32;
      var18 ^= ((long)llIiIiililIiIiil.Illlllllilll(blockState) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(to) ^ var18) & -1L >>> 32;
      var20 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(to) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)llIiIiililIiIiil.Illlllllilll(to) ^ var20) & -1L >>> 32;
      long var11 = -3750763034362895579L;
      var22 ^= ((long)(Math.min((int)(var16 >>> 32), (int)var18) - 1) << 32 ^ var22) & -1L << 32;

      while ((int)(var22 >>> 32) <= Math.max((int)(var16 >>> 32), (int)var18) + 1) {
         for (var22 ^= ((long)(Math.min((int)var16, (int)(var20 >>> 32)) - 2) ^ var22) & -1L >>> 32;
            (int)var22 <= Math.max((int)var16, (int)(var20 >>> 32)) + 3;
            var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32
         ) {
            for (var24 ^= ((long)(Math.min((int)(var18 >>> 32), (int)var20) - 1) << 32 ^ var24) & -1L << 32;
               (int)(var24 >>> 32) <= Math.max((int)(var18 >>> 32), (int)var20) + 1;
               var24 += 4294967296L
            ) {
               var11 = (var11 ^ from.applyAsLong(llIiIiililIiIiil.IIIllIIliIIl((int)(var22 >>> 32), (int)var22, (int)(var24 >>> 32)))) * 1099511628211L;
            }
         }

         var22 += 4294967296L;
      }

      return var11;
   }

   public void IliIlllilIi(IIliIIilIliIIi edge, long geometry) {
      this.lIlIIlIIiiIlIIlIIi.put(edge, geometry);
   }

   public long IIIllIIliIIl() {
      return this.IllIIlIIilllIIlIIi;
   }

   public void IlIlllIlilIl() {
      this.lIlIIlIIiiIlIIlIIi.clear();
      this.IllIIlIIilllIIlIIi = 0L;
   }
}
