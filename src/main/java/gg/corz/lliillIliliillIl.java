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

public final class lliillIliliillIl {
   private lliillIliliillIl() {
   }

   public static iIilliIlIlilliIl IliIlllilIi(Path file) {
      long var32 = 7250203634880220693L;
      long var34 = -3388653684982661958L;
      long var36 = 2729768029008434778L;
      long var38 = -8629712391972511976L;
      long var40 = 1317439886057870605L;
      long var42 = 893295525952396529L;
      long var28 = 779151671775107555L;
      long var30 = -8278461869029775001L;
      class_2487 var1 = class_2507.method_30613(file, class_2505.method_53898());
      class_2487 var2 = var1.method_10545(lIiiIiIlilli<"lIiiIiIlilli","TdXHuC2vmjgqnAI40rdE9ZCKo6HqFANCJmW4peFZhua0yedaBA==">())
         ? var1.method_68568(lIiiIiIlilli<"lIiiIiIlilli","TdXHuC2vmjgqnAI40rdE9ZCKo6HqFANCJmW4peFZhua0yedaBA==">())
         : var1;
      var28 ^= ((long)liiiIIllIl(var2, lIiiIiIlilli<"lIiiIiIlilli","yXZehzTrJPNoeBIL5DDBpT/4AItqeG5vKxFbHXWjg3Kt">()) << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)liiiIIllIl(var2, lIiiIiIlilli<"lIiiIiIlilli","oAnfipEM0sWbqyzQ/aYxMxr75KY7W3YCdMmZ+iOoN1qv5w==">()) ^ var28) & -1L >>> 32;
      var30 ^= ((long)liiiIIllIl(var2, lIiiIiIlilli<"lIiiIiIlilli","8HVTICTlNI26o/VPZpkeduzxvQ+I8BpPyc/0h90eLP5EHg==">()) << 32 ^ var30) & -1L << 32;
      if ((int)(var28 >>> 32) > 0 && (int)var28 > 0 && (int)(var30 >>> 32) > 0) {
         class_2487 var6 = var2.method_68568(lIiiIiIlilli<"lIiiIiIlilli","JzyH5tVrRsfImOT8YXjJz7yl9hmr68jbYFW5PGb8oUuyyQ==">());
         class_2487 var7 = var6.method_10545(lIiiIiIlilli<"lIiiIiIlilli","TqnwhN8NxmCYOreKBo+2XooOHrqnGQSwaIOdzVrzz88lsqU=">())
            ? var6.method_68568(lIiiIiIlilli<"lIiiIiIlilli","TqnwhN8NxmCYOreKBo+2XooOHrqnGQSwaIOdzVrzz88lsqU=">())
            : var2.method_68568(lIiiIiIlilli<"lIiiIiIlilli","TqnwhN8NxmCYOreKBo+2XooOHrqnGQSwaIOdzVrzz88lsqU=">());
         byte[] var8 = var6.method_10545(lIiiIiIlilli<"lIiiIiIlilli","IJYreZvSZRKihqNFfsj2GcTnUsEbBysroqXb4Ny6Zb4=">())
            ? var6.method_10547(lIiiIiIlilli<"lIiiIiIlilli","IJYreZvSZRKihqNFfsj2GcTnUsEbBysroqXb4Ny6Zb4=">()).orElse(new byte[0])
            : var2.method_10547(lIiiIiIlilli<"lIiiIiIlilli","ed1NwdTQKXjoeUpMT//2UXi4LiaPfM40SaJAbSwS+z2l7yTQGQ==">()).orElse(new byte[0]);
         ArrayList var9 = new ArrayList();
         var30 ^= ~var30 & -1L >>> 32;

         for (String var12 : var7.method_10541()) {
            var30 ^= ((long)Math.max((int)var30, var7.method_10550(var12).orElse(0)) ^ var30) & -1L >>> 32;
         }

         class_2680[] var44 = new class_2680[(int)var30 + 1];

         for (String var13 : var7.method_10541()) {
            var32 ^= ((long)var7.method_10550(var13).orElse(0).intValue() << 32 ^ var32) & -1L << 32;
            if ((int)(var32 >>> 32) >= 0 && (int)(var32 >>> 32) < var44.length) {
               String var15 = var13.contains(lIiiIiIlilli<"lIiiIiIlilli","6k3jLHo6IuCjldOpvh9dPS4wkPojZk0fZPvGcdc=">())
                  ? var13.substring(0, var13.indexOf(91))
                  : var13;
               class_2960 var16 = class_2960.method_12829(var15);
               Optional var17 = var16 == null ? Optional.empty() : class_7923.field_41175.method_17966(var16);
               if (var17.isPresent()) {
                  var44[(int)(var32 >>> 32)] = illIiIilIilIiIil.liiiIIllIl((class_2248)var17.get(), var13, (prop, blk, reason, val) -> {
                  });
               } else {
                  var44[(int)(var32 >>> 32)] = null;
                  if (!lIiiIiIlilli<"lIiiIiIlilli","Kwg3h4ATiHXFM5UtekWtzt7Eves4GYGWIv9ML0mVhzQf6AWf8bLCixk=">().equals(var15) && !var9.contains(var15)) {
                     var9.add(var15);
                  }
               }
            }
         }

         var32 ^= ((long)((int)(var28 >>> 32) * (int)var28 * (int)(var30 >>> 32)) ^ var32) & -1L >>> 32;
         int[] var46 = new int[(int)var32];
         var32 ^= (0L ^ var32) & -1L << 32;
         var34 ^= (0L ^ var34) & -1L << 32;

         while ((int)(var34 >>> 32) < (int)var32 && (int)(var32 >>> 32) < var8.length) {
            var34 ^= (0L ^ var34) & -1L >>> 32;
            var36 ^= (0L ^ var36) & -1L << 32;

            while (true) {
               if ((int)(var32 >>> 32) < var8.length) {
                  int var10001 = (int)(var32 >>> 32);
                  var32 += 4294967296L;
                  var36 ^= ((long)var8[var10001] ^ var36) & -1L >>> 32;
                  var34 ^= ((long)((int)var34 | ((int)var36 & 127) << (int)(var36 >>> 32)) ^ var34) & -1L >>> 32;
                  if (((int)var36 & 128) != 0) {
                     var36 += 30064771072L;
                     if ((int)(var36 >>> 32) <= 35) {
                        continue;
                     }
                  }
               }

               int var62 = (int)(var34 >>> 32);
               var34 += 4294967296L;
               var46[var62] = (int)var34;
               break;
            }
         }

         LinkedHashMap var47 = new LinkedHashMap();
         var36 ^= (0L ^ var36) & -1L << 32;

         for (var36 ^= (0L ^ var36) & -1L >>> 32; (int)var36 < (int)var32; var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
            var38 ^= ((long)var46[(int)var36] << 32 ^ var38) & -1L << 32;
            class_2680 var20 = (int)(var38 >>> 32) >= 0 && (int)(var38 >>> 32) < var44.length ? var44[(int)(var38 >>> 32)] : null;
            if (var20 != null && !var20.method_26215()) {
               var47.merge(var20.method_26204(), Integer.valueOf(1), Integer::sum);
               var36 += 4294967296L;
            }
         }

         HashMap var18 = new HashMap();
         class_2499 var19 = var6.method_10545(lIiiIiIlilli<"lIiiIiIlilli","naNEJpwdOxn29h7dzfAndlleu6ZSh5hU/SDarl675zn4nBpOG6rlFqQ=">())
            ? var6.method_68569(lIiiIiIlilli<"lIiiIiIlilli","naNEJpwdOxn29h7dzfAndlleu6ZSh5hU/SDarl675zn4nBpOG6rlFqQ=">())
            : var2.method_68569(lIiiIiIlilli<"lIiiIiIlilli","naNEJpwdOxn29h7dzfAndlleu6ZSh5hU/SDarl675zn4nBpOG6rlFqQ=">());

         for (long var60 = var38 ^ (0L ^ var38) & -1L >>> 32; (int)var60 < var19.size(); var60 ^= (var60 ^ var60 + (long)1) & -1L >>> 32) {
            class_2487 var21 = (class_2487)var19.method_10602((int)var60).orElse(null);
            if (var21 != null) {
               int[] var22 = (int[])var21.method_10561(lIiiIiIlilli<"lIiiIiIlilli","XNo14cVgcnpD2ZA7DmhdSu3OaRY6QLAY1aa99pGJ/Q==">()).orElse(null);
               if (var22 != null && var22.length >= 3) {
                  class_2487 var23 = var21.method_10545(lIiiIiIlilli<"lIiiIiIlilli","IJYreZvSZRKihqNFfsj2GcTnUsEbBysroqXb4Ny6Zb4=">())
                     ? var21.method_68568(lIiiIiIlilli<"lIiiIiIlilli","IJYreZvSZRKihqNFfsj2GcTnUsEbBysroqXb4Ny6Zb4=">())
                     : var21;
                  int[] var24 = (int[])var23.method_10561(lIiiIiIlilli<"lIiiIiIlilli","9H00puutxfCEyHySBLKf4z34ni93Jt54Bq6qMt0qGHfU0zrJ2LJ4up8L">())
                     .orElse(null);
                  if (var24 != null) {
                     var40 ^= ((long)var22[0] << 32 ^ var40) & -1L << 32;
                     var40 ^= ((long)var22[1] ^ var40) & -1L >>> 32;
                     var42 ^= ((long)var22[2] << 32 ^ var42) & -1L << 32;
                     if ((int)(var40 >>> 32) >= 0
                        && (int)var40 >= 0
                        && (int)(var42 >>> 32) >= 0
                        && (int)(var40 >>> 32) < (int)(var28 >>> 32)
                        && (int)var40 < (int)var28
                        && (int)(var42 >>> 32) < (int)(var30 >>> 32)) {
                        var18.put(
                           ((int)var40 * (int)(var30 >>> 32) + (int)(var42 >>> 32)) * (int)(var28 >>> 32) + (int)(var40 >>> 32),
                           IiliIIllliliIIll.IliIlllilIi(var24)
                        );
                     }
                  }
               }
            }
         }

         ArrayList var48 = new ArrayList();
         var48.add(new IiliIIIililiIIIi(0, 0, 0, (int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32), var44, var46, var18));
         String var49 = file.getFileName()
            .toString()
            .replaceFirst(lIiiIiIlilli<"lIiiIiIlilli","8M0eFdHIDq1YhUWDb06dXOXQOqbzVXK2tTD3Ea4mJd+0+1UWE/nS6h3ghkBnm0P0">(), "");
         return new iIilliIlIlilliIl(var49, (int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32), var48, var47, (int)(var36 >>> 32), var9);
      } else {
         throw new IllegalStateException(lIiiIiIlilli<"lIiiIiIlilli","t/BIkOvxcYXmKGoGWNjpOiX8TBPOFJKOonYhgNhMhYIiB1pfw9btgncEbTid9Ra0eVGGwQ==">());
      }
   }

   private static int liiiIIllIl(class_2487 c, String key) {
      return c.method_10568(key).map(Short::intValue).or(() -> c.method_10550(key)).orElse(0);
   }
}
