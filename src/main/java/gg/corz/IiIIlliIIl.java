package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class IiIIlliIIl {
   private final Map<String, Integer> lliIIIliliIIIl = new HashMap<>();

   public int IliIlllilIi(String family, int count, double u) {
      long var9 = 116676636503992576L;
      double var5 = u >= Double.longBitsToDouble(-1979786145427478103L ^ -1979786145427478103L)
            && u < Double.longBitsToDouble(-3761044151963928264L ^ -847215193055217352L)
         ? u
         : 0.0;
      if (count <= ((-(451516674 ^ 111) >>> 5 | -(451516674 ^ 111) << 27) ^ -1624722635)) {
         this.lliIIIliliIIIl.put(family, 0);
         return 0;
      } else {
         Integer var7 = this.lliIIIliliIIIl.get(family);
         if (var7 != null && var7 >= 0 && var7 < count) {
            var9 ^= ((long)Math.min(count - 2, (int)Math.floor(var5 * (double)(count - 1))) << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) >= var7) {
               var9 += 4294967296L;
            }
         } else {
            var9 ^= ((long)Math.min(count - 1, (int)Math.floor(var5 * (double)count)) << 32 ^ var9) & -1L << 32;
         }

         this.lliIIIliliIIIl.put(family, (int)(var9 >>> 32));
         return (int)(var9 >>> 32);
      }
   }

   public int liiiIIllIl(String family) {
      Integer var2 = this.lliIIIliliIIIl.get(family);
      return var2 == null ? -1 : var2;
   }

   public void iIlIlllllill() {
      this.lliIIIliliIIIl.clear();
   }

   public static float lIiiIiIlilli(float u, double pitch, double jitter) {
      double var5 = jitter >= Double.longBitsToDouble(-4382258916758535097L ^ -4382258916758535097L)
            && jitter <= Double.longBitsToDouble(-2425229713245509559L ^ -2186538932994873271L)
         ? jitter
         : Double.longBitsToDouble(-876649318888350120L ^ -3731931482641244584L);
      return (float)((double)u * (1.0 + pitch * (Double.longBitsToDouble(-8148081734163493236L ^ -3536395715736105332L) * var5 - 1.0)));
   }

   public static float IilliliilIIi(float volume, double u) {
      double var3 = u >= Double.longBitsToDouble(-7698859174452390169L ^ -7698859174452390169L)
            && u <= Double.longBitsToDouble(-1080355205680359022L ^ -3534817002597279342L)
         ? u
         : 1.0;
      return (float)(
         (double)volume
            * (
               Double.longBitsToDouble(-3768046882713935073L ^ -838605441053689211L)
                  + Double.longBitsToDouble(2766557715438415367L ^ 1850223034637170591L) * var3
            )
      );
   }
}
