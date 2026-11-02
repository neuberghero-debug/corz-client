package gg.corz;

import java.util.Arrays;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;

final class iiiiliiIIIIiii {
   private final boolean[] IiililiIIl;
   private static final int IlililiIIl = 4;
   private int iIIiiliIIl;
   private final class_2680 iiililiIIl;
   private static final int llililiIIl = 9;
   private final class_2680 liililiIIl;
   private int lIIiiliIIl;
   private int IIIiiliIIl;
   private final class_2826[][] ilililiIIl = new class_2826[(1983857448 + -29) * 5 ^ 1329352550][];

   private iiiiliiIIIIiii(final IlIllIIillIllIIi param1) {
      this.IiililiIIl = new boolean[~(~-964134054 - 33) + 123 ^ -964133977];
      this.liililiIIl = class_2246.field_10124.method_9564();
      this.iiililiIIl = class_2246.field_10243.method_9564();
   }

   class_2680 liiiIIllIl(int x, int z, int y) {
      long var10 = -9132284806016213257L;
      long var12 = 6778497423961259286L;
      var10 ^= ((long)((x >> 4) - this.IIIiiliIIl) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)((y >> 4) - this.lIIiiliIIl) ^ var10) & -1L >>> 32;
      if ((int)(var10 >>> 32) >= 0
         && (int)(var10 >>> 32) < (~(-1787295965 ^ 107) ^ 1787295934)
         && (int)var10 >= 0
         && (int)var10 < ((~(126506132 ^ -71) * -35 >>> 25 | ~(126506132 ^ -71) * -35 << 7) ^ 187934069)) {
         var12 ^= ((long)((int)var10 * (~(~(~1305281052 * 654471207)) ^ 94240156) + (int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
         if (!this.IiililiIIl[(int)(var12 >>> 32)]) {
            this.IiililiIIl[(int)(var12 >>> 32)] = true;
            class_2818 var7 = ilIllIiIll.Iiiilllliiilll
               .field_1687
               .method_2935()
               .method_21730(this.IIIiiliIIl + (int)(var10 >>> 32), this.lIIiiliIIl + (int)var10);
            this.ilililiIIl[(int)(var12 >>> 32)] = var7 == null ? null : var7.method_12006();
         }

         class_2826[] var14 = this.ilililiIIl[(int)(var12 >>> 32)];
         if (var14 == null) {
            return this.iiililiIIl;
         } else {
            var12 ^= ((long)(z - this.iIIiiliIIl >> 4) ^ var12) & -1L >>> 32;
            if ((int)var12 >= 0 && (int)var12 < var14.length) {
               class_2826 var9 = var14[(int)var12];
               return var9 != null && !var9.method_38292()
                  ? var9.method_12254(
                     x & ((--2018748589 << 11 | --2018748589 >>> 21) - 117 ^ 35 ^ -1656394911),
                     z & (~1640252604 - -81 + 21 ^ -1640252506),
                     y & (~1811087542 * -15 - 75 ^ 1396509281)
                  )
                  : this.liililiIIl;
            } else {
               return this.iiililiIIl;
            }
         }
      } else {
         return ilIllIiIll.Iiiilllliiilll.field_1687.method_8320(new class_2338(x, z, y));
      }
   }

   void IliIlllilIi(class_2818 chunk) {
      long var3 = -298851908544174092L;
      Arrays.fill(this.ilililiIIl, null);
      Arrays.fill(this.IiililiIIl, false);
      this.IIIiiliIIl = chunk.method_12004().field_9181 - 4;
      this.lIIiiliIIl = chunk.method_12004().field_9180 - 4;
      this.iIIiiliIIl = chunk.method_31607();
      var3 ^= (171798691840L ^ var3) & -1L << 32;
      this.ilililiIIl[(int)(var3 >>> 32)] = chunk.method_12006();
      this.IiililiIIl[(int)(var3 >>> 32)] = true;
   }
}
