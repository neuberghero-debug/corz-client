package gg.corz;

import java.util.Objects;
import java.util.stream.Stream;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2818;
import net.minecraft.class_3965;
import net.minecraft.class_1269.class_9860;

public final class lIIiilliIIiill {
   public static boolean liiiIIllIl(class_2338 blockPos, class_2248 block) {
      return ilIllIiIll.Iiiilllliiilll.field_1687.method_8320(blockPos).method_26204() == block;
   }

   public static Stream<class_2818> IliIlllilIi() {
      long var5 = -6106967475684626495L;
      var5 ^= ((long)(Math.max(2, ilIllIiIll.Iiiilllliiilll.field_1690.method_38521()) + 3) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((int)(var5 >>> 32) * 2 + 1) ^ var5) & -1L >>> 32;
      class_1923 var2 = ilIllIiIll.Iiiilllliiilll.field_1724.method_31476();
      class_1923 var3 = new class_1923(var2.field_9181 - (int)(var5 >>> 32), var2.field_9180 - (int)(var5 >>> 32));
      class_1923 var4 = new class_1923(var2.field_9181 + (int)(var5 >>> 32), var2.field_9180 + (int)(var5 >>> 32));
      return Stream.<class_1923>iterate(var3, min -> {
            long var5x = 8126072550332854622L;
            var5x ^= ((long)min.field_9181 << 32 ^ var5x) & -1L << 32;
            var5x ^= ((long)min.field_9180 ^ var5x) & -1L >>> 32;
            var5x += 4294967296L;
            if ((int)(var5x >>> 32) > var4.field_9181) {
               var5x ^= ((long)var3.field_9181 << 32 ^ var5x) & -1L << 32;
               var5x ^= (var5x ^ var5x + (long)1) & -1L >>> 32;
            }

            if ((int)var5x > var4.field_9180) {
               throw new IllegalStateException(IIIllIIliIIl<"IIIllIIliIIl","MO3kM2hpb1DmadIwKLNlFwzcgSbttjAHxhGy6sRajBvBvCzs/zXMZLbUnK5fIgBcwRJef5w=">());
            } else {
               return new class_1923((int)(var5x >>> 32), (int)var5x);
            }
         })
         .limit((long)((int)var5) * (long)((int)var5))
         .filter(c -> ilIllIiIll.Iiiilllliiilll.field_1687.method_8393(c.field_9181, c.field_9180))
         .map(c -> ilIllIiIll.Iiiilllliiilll.field_1687.method_8497(c.field_9181, c.field_9180))
         .filter(Objects::nonNull);
   }

   public static void iIlIlllllill(class_3965 blockHitResult, boolean shouldSwingHand) {
      class_1269 var2 = ilIllIiIll.Iiiilllliiilll.field_1761.method_2896(ilIllIiIll.Iiiilllliiilll.field_1724, class_1268.field_5808, blockHitResult);
      if (var2 instanceof class_9860 && shouldSwingHand) {
         ilIllIiIll.Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }
   }
}
