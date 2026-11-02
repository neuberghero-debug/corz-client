package gg.corz;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class lIIlIIliiIIlIIli {
   private static final Map<String, class_2960> liIIllIlIi = new HashMap<>();

   public static class_2960 IliIlllilIi(llllIlilllIl m, liIlilIiiiIlilIi c) {
      long var7 = -6570413227973511382L;
      class_2960 var2 = liIIllIlIi.get(m.IliIlllilIi());
      if (var2 != null) {
         return var2;
      } else {
         var2 = class_2960.method_60655(
            iIlIlllllill<"iIlIlllllill","ID5sn0ntRChJj4kzSgz4Ek7uEXqttmGwqCY6CcXe8rktjYF6mXY=">(),
            iIlIlllllill<"iIlIlllllill","izB4EhshyT4KFe1AfiW3A5dpPdskCMicoRqkGugqA+NrKMVhKg==">() + m.IliIlllilIi()
         );
         class_1011 var3 = new class_1011(c.iIIilllIIi, c.IlIilllIIi, false);
         int[] var4 = c.llIilllIIi;
         var7 ^= (0L ^ var7) & -1L << 32;

         while ((int)(var7 >>> 32) < c.IlIilllIIi) {
            for (var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < c.iIIilllIIi; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
               var3.method_61941((int)var7, (int)(var7 >>> 32), var4[(int)(var7 >>> 32) * c.iIIilllIIi + (int)var7]);
            }

            var7 += 4294967296L;
         }

         String var5 = iIlIlllllill<"iIlIlllllill","QOwFXWEQmK9/4YvabSqEUo4l9g1ssVooa9yjUrlwgF2Uan7mc7FQRuAV">() + m.IliIlllilIi();
         class_310.method_1551().method_1531().method_4616(var2, new class_1043(() -> var5, var3));
         liIIllIlIi.put(m.IliIlllilIi(), var2);
         return var2;
      }
   }

   private lIIlIIliiIIlIIli() {
   }
}
