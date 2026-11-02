package gg.corz;

import java.util.Optional;
import net.minecraft.class_2248;
import net.minecraft.class_2487;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2769;
import net.minecraft.class_7923;

public final class illIiIilIilIiIil {
   private illIiIilIilIiIil() {
   }

   private static void iIlIlllllill(IIiiiIillIiiiIil prop, class_2248 b, String reason, String val, String sink) {
      prop.onFail(class_7923.field_41175.method_10221(b).toString(), reason, val, sink);
   }

   private static <T extends Comparable<T>> class_2680 IilliliilIIi(class_2680 state, class_2769<T> value, String prop) {
      Optional var3 = value.method_11900(prop);
      return var3.<class_2680>map(propx -> (class_2680)state.method_11657(value, propx)).orElse(null);
   }

   public static class_2680 IliIlllilIi(class_2248 onFail, class_2487 block, IIiiiIillIiiiIil properties) {
      class_2680 var3 = onFail.method_9564();
      if (block == null) {
         return var3;
      } else {
         class_2689 var4 = onFail.method_9595();

         for (String var6 : block.method_10541()) {
            String var7 = block.method_10558(var6).orElse("");
            class_2769 var8 = var4.method_11663(var6);
            if (var8 == null) {
               if (properties != null) {
                  iIlIlllllill(properties, onFail, var6, var7, iliIiiliiiii<"iliIiiliiiii","8hyGAWxdmN5hnns95PeDEszQfVF9ZC1Amsu5tbCcjDl/KsvUKWe2ijo2AeA=">());
               }
            } else {
               class_2680 var9 = IilliliilIIi(var3, var8, var7);
               if (var9 == null) {
                  if (properties != null) {
                     iIlIlllllill(properties, onFail, var6, var7, iliIiiliiiii<"iliIiiliiiii","YTpz3QLJjaWcHHfkV0dyy6CM7mHBHt0g1+Rwdy6Q3woo2FQJ5T+sukkJysTm">());
                  }
               } else {
                  var3 = var9;
               }
            }
         }

         return var3;
      }
   }

   public static class_2680 liiiIIllIl(class_2248 block, String onFail, IIiiiIillIiiiIil key) {
      long var16 = 8668777383483934593L;
      long var18 = 2350319091653648981L;
      long var20 = 1593581513413497947L;
      class_2680 var3 = block.method_9564();
      var16 ^= ((long)onFail.indexOf(91) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)onFail.lastIndexOf(93) ^ var16) & -1L >>> 32;
      if ((int)(var16 >>> 32) >= 0 && (int)var16 > (int)(var16 >>> 32)) {
         class_2689 var6 = block.method_9595();
         String[] var7 = onFail.substring((int)(var16 >>> 32) + 1, (int)var16).split(iliIiiliiiii<"iliIiiliiiii","6FyqgjDTvKLLlgX/aKlus/djqLBb5DD3VQou/fg=">());
         var18 ^= ((long)var7.length << 32 ^ var18) & -1L << 32;

         for (long var25 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var25 < (int)(var25 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            String var10 = var7[(int)var25];
            var20 ^= ((long)var10.indexOf(61) << 32 ^ var20) & -1L << 32;
            if ((int)(var20 >>> 32) >= 0) {
               String var12 = var10.substring(0, (int)(var20 >>> 32)).trim();
               String var13 = var10.substring((int)(var20 >>> 32) + 1).trim();
               class_2769 var14 = var6.method_11663(var12);
               if (var14 == null) {
                  if (key != null) {
                     iIlIlllllill(key, block, var12, var13, iliIiiliiiii<"iliIiiliiiii","8hyGAWxdmN5hnns95PeDEszQfVF9ZC1Amsu5tbCcjDl/KsvUKWe2ijo2AeA=">());
                  }
               } else {
                  class_2680 var15 = IilliliilIIi(var3, var14, var13);
                  if (var15 == null) {
                     if (key != null) {
                        iIlIlllllill(key, block, var12, var13, iliIiiliiiii<"iliIiiliiiii","YTpz3QLJjaWcHHfkV0dyy6CM7mHBHt0g1+Rwdy6Q3woo2FQJ5T+sukkJysTm">());
                     }
                  } else {
                     var3 = var15;
                  }
               }
            }
         }

         return var3;
      } else {
         return var3;
      }
   }
}
