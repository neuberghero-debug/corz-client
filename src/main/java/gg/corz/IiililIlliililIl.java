package gg.corz;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import net.minecraft.class_6606;

public final class IiililIlliililIl {
   private static final byte[] IIiililIll = new byte[(690750407 << 25 | 690750407 >>> 7) - -67 - -33 ^ -1907208085];
   private static final byte[] lIiililIll = new byte[((1976737525 ^ -13) * 1030792151 << 9 | (1976737525 ^ -13) * 1030792151 >>> 23) ^ 110894499];
   private static final int iilililIll = 2048;

   private IiililIlliililIl() {
   }

   public static lilIlIiiilIlIi IliIlllilIi(byte[] nibbles) {
      if (nibbles == null || nibbles.length != ((-2144085079 - 77 >>> 27 | -2144085079 - 77 << 5) + 101 ^ 108749813)) {
         return lilIlIiiilIlIi.IIllIlIiilIllIlIii;
      } else if (Arrays.mismatch(nibbles, IIiililIll) < 0) {
         return lilIlIiiilIlIi.IlIlIlIiillIlIlIii;
      } else {
         return Arrays.mismatch(nibbles, lIiililIll) < 0 ? lilIlIiiilIlIi.ilIlIlIiiIiIlIlIii : lilIlIiiilIlIi.iiiIIlIiiIIIlIlIii;
      }
   }

   public static void liiiIIllIl(class_6606 nowNanos, iIiilIllIliilIll snap, long data) {
      iIlIlllllill(nowNanos.method_38601(), nowNanos.method_38604(), nowNanos.method_38606(), snap.iIliIlilll, snap.IlliIlilll, data);
      iIlIlllllill(nowNanos.method_38608(), nowNanos.method_38609(), nowNanos.method_38610(), snap.llliIlilll, snap.illiIlilll, data);
   }

   static {
      Arrays.fill(lIiililIll, (byte)-1);
   }

   private static void iIlIlllllill(BitSet nowNanos, BitSet nibbleList, List<byte[]> inited, lilIlIiiilIlIi[] uninited, long[] out, long updatedNanos) {
      int var7 = 0;
      int var8 = uninited.length;

      for (int var9 = 0; var9 < var8; var9++) {
         if (nowNanos.get(var9)) {
            byte[] var10 = var7 < inited.size() ? (byte[])inited.get(var7) : null;
            var7++;
            uninited[var9] = IliIlllilIi(var10);
            out[var9] = updatedNanos;
         } else if (nibbleList.get(var9)) {
            uninited[var9] = lilIlIiiilIlIi.lIIlIlIiiiIIlIlIii;
            out[var9] = updatedNanos;
         }
      }
   }
}
