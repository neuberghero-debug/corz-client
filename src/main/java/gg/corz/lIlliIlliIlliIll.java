package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

final class lIlliIlliIlliIll<K> {
   int iIlIIiilll;
   final Map<K, Integer> iiIIIiilll;
   final LinkedHashMap<K, Integer> liIIIiilll = new LinkedHashMap<>();
   final int lIlIIiilll;
   final ToIntFunction<K> IIlIIiilll;

   boolean liiiIIllIl(Map<K, Integer> add) {
      long var9 = -5490286628304626158L;
      long var11 = 6455169297467644520L;
      var9 ^= ((long)this.iIlIIiilll << 32 ^ var9) & -1L << 32;

      for (Entry var4 : add.entrySet()) {
         Object var5 = var4.getKey();
         var9 ^= ((long)this.liIIIiilll.getOrDefault(var5, 0).intValue() ^ var9) & -1L >>> 32;
         long var15 = var11 ^ ((long)IIiIiiillIiIiiil.IIlllIlliIll(this.iiIIIiilll, (K)var5) << 32 ^ var11) & -1L << 32;
         var11 = var15 ^ ((long)this.IliIlllilIi((K)var5) ^ var15) & -1L >>> 32;
         var9 ^= (
               (long)(
                        (int)(var9 >>> 32)
                           + (
                              IIiIiiillIiIiiil.IliIlllilIi((int)var9 + (Integer)var4.getValue(), (int)(var11 >>> 32), (int)var11)
                                 - IIiIiiillIiIiiil.IliIlllilIi((int)var9, (int)(var11 >>> 32), (int)var11)
                           )
                     )
                     << 32
                  ^ var9
            )
            & -1L << 32;
      }

      return (int)(var9 >>> 32) <= this.lIlIIiilll;
   }

   int IilliliilIIi(K k, int count) {
      long var16 = 4908758407557175354L;
      long var18 = -6605933051953116282L;
      long var12 = 2870251318386276328L;
      long var14 = 4127124461677560731L;
      if (count <= 0) {
         return 0;
      } else {
         var12 ^= ((long)this.liIIIiilll.getOrDefault(k, 0).intValue() << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)IIiIiiillIiIiiil.IIlllIlliIll(this.iiIIIiilll, (K)k) ^ var12) & -1L >>> 32;
         var14 ^= ((long)this.IliIlllilIi((K)k) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)IIiIiiillIiIiiil.IliIlllilIi((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
         var16 ^= ((long)Math.max(0, this.lIlIIiilll - (this.iIlIIiilll - (int)var14)) << 32 ^ var16) & -1L << 32;
         long var8 = (long)(iIIIilIiIlIIilIi.IliIlllilIi((int)var12, (int)(var14 >>> 32)) + (int)(var16 >>> 32)) * (long)((int)(var14 >>> 32));
         var16 ^= ((long)((int)Math.min((long)((int)(var12 >>> 32)) + (long)count, Math.max(var8, (long)((int)(var12 >>> 32))))) ^ var16) & -1L >>> 32;
         var18 ^= ((long)((int)var16 - (int)(var12 >>> 32)) << 32 ^ var18) & -1L << 32;
         if ((int)(var18 >>> 32) <= 0) {
            return 0;
         } else {
            this.liIIIiilll.put((K)k, Integer.valueOf((int)var16));
            this.iIlIIiilll = this.iIlIIiilll + (IIiIiiillIiIiiil.IliIlllilIi((int)var16, (int)var12, (int)(var14 >>> 32)) - (int)var14);
            return (int)(var18 >>> 32);
         }
      }
   }

   lIlliIlliIlliIll(Map<K, Integer> budget, int maxStack, ToIntFunction<K> carried) {
      this.iiIIIiilll = budget;
      this.lIlIIiilll = maxStack;
      this.IIlIIiilll = carried;
   }

   int IliIlllilIi(K k) {
      return Math.max(1, this.IIlIIiilll.applyAsInt((K)k));
   }

   void iIlIlllllill(Map<K, Integer> add) {
      long var8 = 1395181070158613490L;
      long var10 = -5938423294585687718L;

      for (Entry var3 : add.entrySet()) {
         Object var4 = var3.getKey();
         long var12 = var8 ^ ((long)this.liIIIiilll.getOrDefault(var4, 0).intValue() << 32 ^ var8) & -1L << 32;
         var8 = var12 ^ ((long)IIiIiiillIiIiiil.IIlllIlliIll(this.iiIIIiilll, (K)var4) ^ var12) & -1L >>> 32;
         var10 ^= ((long)this.IliIlllilIi((K)var4) << 32 ^ var10) & -1L << 32;
         this.iIlIIiilll = this.iIlIIiilll
            + (
               IIiIiiillIiIiiil.IliIlllilIi((int)(var8 >>> 32) + (Integer)var3.getValue(), (int)var8, (int)(var10 >>> 32))
                  - IIiIiiillIiIiiil.IliIlllilIi((int)(var8 >>> 32), (int)var8, (int)(var10 >>> 32))
            );
         this.liIIIiilll.put((K)var4, Integer.valueOf((int)(var8 >>> 32) + (Integer)var3.getValue()));
      }
   }
}
