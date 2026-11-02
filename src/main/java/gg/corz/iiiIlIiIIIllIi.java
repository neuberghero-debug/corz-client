package gg.corz;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import net.minecraft.class_2248;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_2505;
import net.minecraft.class_2507;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class iiiIlIiIIIllIi {
   private static int liiiIIllIl(long[] bits, int index, long states) {
      long var12 = -4368386120235868533L;
      long var14 = -4228631297129338825L;
      if (index > 0 && bits.length != 0) {
         long var4 = states * (long)index;
         var12 ^= ((long)((int)(var4 >> 6)) << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)((int)((states + 1L) * (long)index - 1L >> 6)) ^ var12) & -1L >>> 32;
         var14 ^= ((long)((int)(var4 & 63L)) << 32 ^ var14) & -1L << 32;
         long var9 = index >= 64 ? -1L : (1L << index) - 1L;
         if ((int)(var12 >>> 32) < 0 || (int)(var12 >>> 32) >= bits.length) {
            return 0;
         } else if ((int)(var12 >>> 32) == (int)var12) {
            return (int)(bits[(int)(var12 >>> 32)] >>> (int)(var14 >>> 32) & var9);
         } else if ((int)var12 >= bits.length) {
            return (int)(bits[(int)(var12 >>> 32)] >>> (int)(var14 >>> 32) & var9);
         } else {
            var14 ^= ((long)(64 - (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
            return (int)((bits[(int)(var12 >>> 32)] >>> (int)(var14 >>> 32) | bits[(int)var12] << (int)var14) & var9);
         }
      } else {
         return 0;
      }
   }

   public static iIilliIlIlilliIl IliIlllilIi(Path file) {
      long var48 = -3814773016147811913L;
      long var50 = 6971809575555766838L;
      long var52 = 779702041033486855L;
      long var54 = -7004936329474993099L;
      long var56 = 6410193622495264792L;
      long var42 = -2149093245064371158L;
      long var58 = -1031159713993460682L;
      long var44 = 1833848288519359995L;
      long var60 = -8107641021935531390L;
      long var46 = -6462879414541633616L;
      long var62 = -2943592095847074591L;
      class_2487 var1 = class_2507.method_30613(file, class_2505.method_53898());
      class_2487 var2 = var1.method_68568(lIiiIiIlilli<"lIiiIiIlilli","mhOPcANtFN0EM31/h9USwJ4+dR+SAVWMSnTbdI5hwBAKYKh4">());
      String var3 = file.getFileName().toString().replaceFirst(lIiiIiIlilli<"lIiiIiIlilli","7YoYI44HvjhEDsufMzoy6bBQMfGNIBQ/iO/kiXEDffleZadi9lad3w==">(), "");
      String var4 = var2.method_10558(lIiiIiIlilli<"lIiiIiIlilli","XnbhRMg+HAyAK6Q0u3A/XOGuhF4yqr18fcWYuzQb5yw=">()).filter(s -> !s.isBlank()).orElse(var3);
      class_2487 var5 = var2.method_68568(lIiiIiIlilli<"lIiiIiIlilli","zb7VqtYfMPxVJ8QwGAblNT/U6TDzE+lmTw/Bi3t3qTbdvNpx9ksHSpE=">());
      var42 ^= ((long)Math.abs(var5.method_10550(lIiiIiIlilli<"lIiiIiIlilli","MW/aTtdSEomEIZJUbkM8hOizHu3xVcEiiOcHPPo=">()).orElse(0)) << 32 ^ var42)
         & -1L << 32;
      var42 ^= ((long)Math.abs(var5.method_10550(lIiiIiIlilli<"lIiiIiIlilli","WxU4w7TffkrZyXKIK+a8iVyZPIpMQAcXQ7ZxBg4=">()).orElse(0)) ^ var42) & -1L >>> 32;
      var44 ^= ((long)Math.abs(var5.method_10550(lIiiIiIlilli<"lIiiIiIlilli","LBxN3vOf11AUvAnNykalAjPNoYZhwl5xfhLQFDk=">()).orElse(0)) << 32 ^ var44)
         & -1L << 32;
      ArrayList var9 = new ArrayList();
      LinkedHashMap var10 = new LinkedHashMap();
      ArrayList var11 = new ArrayList();
      var44 ^= (0L ^ var44) & -1L >>> 32;
      class_2487 var13 = var1.method_68568(lIiiIiIlilli<"lIiiIiIlilli","3SZEQJoMIG00btP9lgXnyUlxrc8yFe0R9gnBhKSeQ9+jMpI=">());

      for (String var15 : var13.method_10541()) {
         class_2487 var16 = var13.method_68568(var15);
         class_2487 var17 = var16.method_68568(lIiiIiIlilli<"lIiiIiIlilli","JzSdOHsBatHCNZnXp6r5oAeyvsgOH9s9axMdxyj/j+4=">());
         long var71 = var46
            ^ ((long)var17.method_10550(lIiiIiIlilli<"lIiiIiIlilli","MW/aTtdSEomEIZJUbkM8hOizHu3xVcEiiOcHPPo=">()).orElse(0).intValue() << 32 ^ var46)
               & -1L << 32;
         var46 = var71
            ^ ((long)var17.method_10550(lIiiIiIlilli<"lIiiIiIlilli","WxU4w7TffkrZyXKIK+a8iVyZPIpMQAcXQ7ZxBg4=">()).orElse(0).intValue() ^ var71) & -1L >>> 32;
         long var72 = var48
            ^ ((long)var17.method_10550(lIiiIiIlilli<"lIiiIiIlilli","LBxN3vOf11AUvAnNykalAjPNoYZhwl5xfhLQFDk=">()).orElse(0).intValue() << 32 ^ var48)
               & -1L << 32;
         var48 = var72 ^ ((long)Math.abs((int)(var46 >>> 32)) ^ var72) & -1L >>> 32;
         var50 ^= ((long)Math.abs((int)var46) << 32 ^ var50) & -1L << 32;
         var50 ^= ((long)Math.abs((int)(var48 >>> 32)) ^ var50) & -1L >>> 32;
         if ((int)var48 != 0 && (int)(var50 >>> 32) != 0 && (int)var50 != 0) {
            class_2487 var24 = var16.method_68568(lIiiIiIlilli<"lIiiIiIlilli","PXVgqmD8su6FBs/i8U64mzG/AlyrE8mlMcxx4MYCUGYuVzSp">());
            var52 ^= ((long)var24.method_10550(lIiiIiIlilli<"lIiiIiIlilli","MW/aTtdSEomEIZJUbkM8hOizHu3xVcEiiOcHPPo=">()).orElse(0).intValue() << 32 ^ var52)
               & -1L << 32;
            var52 ^= ((long)var24.method_10550(lIiiIiIlilli<"lIiiIiIlilli","WxU4w7TffkrZyXKIK+a8iVyZPIpMQAcXQ7ZxBg4=">()).orElse(0).intValue() ^ var52)
               & -1L >>> 32;
            var54 ^= ((long)var24.method_10550(lIiiIiIlilli<"lIiiIiIlilli","LBxN3vOf11AUvAnNykalAjPNoYZhwl5xfhLQFDk=">()).orElse(0).intValue() << 32 ^ var54)
               & -1L << 32;
            class_2499 var28 = var16.method_68569(lIiiIiIlilli<"lIiiIiIlilli","h9MexzB4dA2UYA1xWL9x7bzpF4RPuizwMV8+jTho6SG21CL5x04tW3gG+nw5">());
            class_2680[] var29 = new class_2680[var28.size()];

            for (var54 ^= (0L ^ var54) & -1L >>> 32; (int)var54 < var28.size(); var54 ^= (var54 ^ var54 + (long)1) & -1L >>> 32) {
               class_2487 var31 = var28.method_10602((int)var54).orElse(new class_2487());
               String var32 = var31.method_10558(lIiiIiIlilli<"lIiiIiIlilli","XnbhRMg+HAyAK6Q0u3A/XOGuhF4yqr18fcWYuzQb5yw=">())
                  .orElse(lIiiIiIlilli<"lIiiIiIlilli","R9OXF1tWFaRRohUncs/evpSAFiLO086s9V9BAG0ZmYF7RhJeD1PRWyc=">());
               class_2960 var33 = class_2960.method_12829(var32);
               Optional var34 = var33 == null ? Optional.empty() : class_7923.field_41175.method_17966(var33);
               if (var34.isPresent()) {
                  class_2487 var35 = var31.method_68568(lIiiIiIlilli<"lIiiIiIlilli","O2tbJ6NxcmDGRJkZTnfoujb4uCj4Wxm79351X+TZjHZFjRMG5SM=">());
                  var29[(int)var54] = illIiIilIilIiIil.IliIlllilIi((class_2248)var34.get(), var35, (reason, val, blk, prop) -> {
                  });
               } else {
                  var29[(int)var54] = null;
                  if (!lIiiIiIlilli<"lIiiIiIlilli","R9OXF1tWFaRRohUncs/evpSAFiLO086s9V9BAG0ZmYF7RhJeD1PRWyc=">().equals(var32) && !var11.contains(var32)) {
                     var11.add(var32);
                  }
               }
            }

            long[] var30 = var16.method_10565(lIiiIiIlilli<"lIiiIiIlilli","OmWmFSCsM3sVkenHkHjaITbl10vlXTMWkNuTwxQ75b7dQRMMzC1V">()).orElse(new long[0]);
            long var76 = var56 ^ ((long)Math.max(2, 32 - Integer.numberOfLeadingZeros(Math.max(1, var29.length - 1))) << 32 ^ var56) & -1L << 32;
            var56 = var76 ^ ((long)((int)var48 * (int)(var50 >>> 32) * (int)var50) ^ var76) & -1L >>> 32;
            int[] var64 = new int[(int)var56];

            for (var58 ^= (0L ^ var58) & -1L << 32; (int)(var58 >>> 32) < (int)var56; var58 += 4294967296L) {
               var64[(int)(var58 >>> 32)] = liiiIIllIl(var30, (int)(var56 >>> 32), (long)((int)(var58 >>> 32)));
            }

            HashMap var65 = new HashMap();
            class_2499 var66 = var16.method_68569(lIiiIiIlilli<"lIiiIiIlilli","eIH/+p0rLV6OpMYzWF/54JUgP9gl+uqkY2GEdkZtlrRUoq74Bmw9iw==">());

            for (var58 ^= (0L ^ var58) & -1L >>> 32; (int)var58 < var66.size(); var58 ^= (var58 ^ var58 + (long)1) & -1L >>> 32) {
               class_2487 var37 = (class_2487)var66.method_10602((int)var58).orElse(null);
               if (var37 != null) {
                  var60 ^= (
                        (long)var37.method_10550(lIiiIiIlilli<"lIiiIiIlilli","MW/aTtdSEomEIZJUbkM8hOizHu3xVcEiiOcHPPo=">()).orElse(-1).intValue() << 32 ^ var60
                     )
                     & -1L << 32;
                  var60 ^= ((long)var37.method_10550(lIiiIiIlilli<"lIiiIiIlilli","WxU4w7TffkrZyXKIK+a8iVyZPIpMQAcXQ7ZxBg4=">()).orElse(-1).intValue() ^ var60)
                     & -1L >>> 32;
                  var62 ^= (
                        (long)var37.method_10550(lIiiIiIlilli<"lIiiIiIlilli","LBxN3vOf11AUvAnNykalAjPNoYZhwl5xfhLQFDk=">()).orElse(-1).intValue() << 32 ^ var62
                     )
                     & -1L << 32;
                  if ((int)(var60 >>> 32) >= 0
                     && (int)var60 >= 0
                     && (int)(var62 >>> 32) >= 0
                     && (int)(var60 >>> 32) < (int)var48
                     && (int)var60 < (int)(var50 >>> 32)
                     && (int)(var62 >>> 32) < (int)var50) {
                     int[] var41 = (int[])var37.method_10561(lIiiIiIlilli<"lIiiIiIlilli","q95ZccfAGHH4cnoxK8uCnpqAM/fl3pFXN2XOvNI5aOUHRh5nj9tdxi+n">())
                        .orElse(null);
                     if (var41 != null) {
                        var65.put(((int)var60 * (int)var50 + (int)(var62 >>> 32)) * (int)var48 + (int)(var60 >>> 32), IiliIIllliliIIll.IliIlllilIi(var41));
                     }
                  }
               }
            }

            IiliIIIililiIIIi var36 = new IiliIIIililiIIIi(
               (int)(var52 >>> 32), (int)var52, (int)(var54 >>> 32), (int)(var46 >>> 32), (int)var46, (int)(var48 >>> 32), var29, var64, var65
            );
            var9.add(var36);

            for (var62 ^= (0L ^ var62) & -1L >>> 32; (int)var62 < (int)(var50 >>> 32); var62 ^= (var62 ^ var62 + (long)1) & -1L >>> 32) {
               var60 ^= (0L ^ var60) & -1L << 32;

               while ((int)(var60 >>> 32) < (int)var50) {
                  for (var60 ^= (0L ^ var60) & -1L >>> 32; (int)var60 < (int)var48; var60 ^= (var60 ^ var60 + (long)1) & -1L >>> 32) {
                     class_2680 var40 = var36.IIIllIIliIIl((int)var60, (int)var62, (int)(var60 >>> 32));
                     if (var40 != null && !var40.method_26215()) {
                        var10.merge(var40.method_26204(), Integer.valueOf(1), Integer::sum);
                        var44 ^= (var44 ^ var44 + (long)1) & -1L >>> 32;
                     }
                  }

                  var60 += 4294967296L;
               }
            }
         }
      }

      return new iIilliIlIlilliIl(var4, (int)(var42 >>> 32), (int)var42, (int)(var44 >>> 32), var9, var10, (int)var44, var11);
   }

   private iiiIlIiIIIllIi() {
   }
}
