package gg.corz;

import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class IlilIiilllilIiil {
   private static final String IIIlIIilil = "corzclient";
   private static final LinkedHashMap<String, class_2960> IlIlIIilil = new LinkedHashMap<>(64, 0.75F, true);
   private static final int iiiIIIilil = 160;
   private static final Set<class_2960> iIIlIIilil = new HashSet<>();
   private static final Map<class_2960, class_1011> lIIlIIilil = new HashMap<>();

   private static class_1011 iIlIlllllill(class_2960 src) {
      if (src.method_12832().startsWith(IiIlliIliiIl<"IiIlliIliiIl","MMboXRbsX5YDdDcdXnwuIMmdgrJWCzgRnkFtF5QPuUc=">())) {
         return class_310.method_1551().method_1531().method_4619(src) instanceof class_1043 var9 ? var9.method_4525() : null;
      } else {
         class_1011 var1 = lIIlIIilil.get(src);
         if (var1 != null) {
            return var1;
         } else {
            try {
               class_1011 var4;
               try (InputStream var2 = class_310.method_1551().method_1478().open(src)) {
                  class_1011 var3 = class_1011.method_4309(var2);
                  lIIlIIilil.put(src, var3);
                  var4 = var3;
               }

               return var4;
            } catch (Throwable var7) {
               iIIlIIilil.add(src);
               return null;
            }
         }
      }
   }

   private static void IIIllIIliIIl() {
      if (IlIlIIilil.size() > 160) {
         Iterator var0 = IlIlIIilil.entrySet().iterator();

         while (IlIlIIilil.size() > 160 && var0.hasNext()) {
            class_2960 var1 = (class_2960)((Entry)var0.next()).getValue();
            var0.remove();
            class_310.method_1551().method_1531().method_4615(var1);
         }
      }
   }

   private static int lIiiIiIlilli(double v) {
      long var3 = 8278476585566633621L;
      var3 ^= ((long)((int)Math.round(v)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? 0 : Math.min(255, (int)(var3 >>> 32));
   }

   private static class_1011 IilliliilIIi(class_1011 src, int dh, int dw) {
      long var49 = -3687297472698498770L;
      long var51 = -4903267753900721219L;
      long var53 = 1865172128304070730L;
      long var55 = 5566867951202104744L;
      long var57 = -3351254656457953016L;
      long var45 = -6031719008022558568L;
      long var47 = -8762264819249623350L;
      var45 ^= ((long)src.method_4307() << 32 ^ var45) & -1L << 32;
      var45 ^= ((long)src.method_4323() ^ var45) & -1L >>> 32;
      double var5 = (double)((int)(var45 >>> 32)) / (double)dh;
      double var7 = (double)((int)var45) / (double)dw;
      class_1011 var9 = new class_1011(dh, dw, false);
      var47 ^= (0L ^ var47) & -1L << 32;

      while ((int)(var47 >>> 32) < dw) {
         double var11 = (double)((int)(var47 >>> 32)) * var7;
         double var13 = (double)((int)(var47 >>> 32) + 1) * var7;
         var47 ^= ((long)((int)Math.floor(var11)) ^ var47) & -1L >>> 32;
         var49 ^= ((long)Math.min((int)var45, (int)Math.ceil(var13)) << 32 ^ var49) & -1L << 32;

         for (var49 ^= (0L ^ var49) & -1L >>> 32; (int)var49 < dh; var49 ^= (var49 ^ var49 + (long)1) & -1L >>> 32) {
            double var18 = (double)((int)var49) * var5;
            double var20 = (double)((int)var49 + 1) * var5;
            var51 ^= ((long)((int)Math.floor(var18)) << 32 ^ var51) & -1L << 32;
            var51 ^= ((long)Math.min((int)(var45 >>> 32), (int)Math.ceil(var20)) ^ var51) & -1L >>> 32;
            double var24 = 0.0;
            double var26 = 0.0;
            double var28 = 0.0;
            double var30 = 0.0;
            double var32 = 0.0;

            for (var53 ^= ((long)((int)var47) << 32 ^ var53) & -1L << 32; (int)(var53 >>> 32) < (int)(var49 >>> 32); var53 += 4294967296L) {
               double var35 = Math.min(var13, (double)((int)(var53 >>> 32) + 1)) - Math.max(var11, (double)((int)(var53 >>> 32)));
               if (!(var35 <= 0.0)) {
                  for (var53 ^= ((long)((int)(var51 >>> 32)) ^ var53) & -1L >>> 32; (int)var53 < (int)var51; var53 ^= (var53 ^ var53 + (long)1) & -1L >>> 32) {
                     double var38 = Math.min(var20, (double)((int)var53 + 1)) - Math.max(var18, (double)((int)var53));
                     if (!(var38 <= 0.0)) {
                        double var40 = var38 * var35;
                        var55 ^= ((long)src.method_61940((int)var53, (int)(var53 >>> 32)) << 32 ^ var55) & -1L << 32;
                        double var43 = (double)((int)(var55 >>> 32) >>> 24 & 0xFF) / 255.0;
                        var24 += var40;
                        var26 += var40 * var43;
                        var28 += var40 * var43 * (double)((int)(var55 >>> 32) >> 16 & 0xFF);
                        var30 += var40 * var43 * (double)((int)(var55 >>> 32) >> 8 & 0xFF);
                        var32 += var40 * var43 * (double)((int)(var55 >>> 32) & 0xFF);
                     }
                  }
               }
            }

            var53 ^= ((long)(var24 <= 0.0 ? 0 : (int)Math.round(var26 / var24 * 255.0)) << 32 ^ var53) & -1L << 32;
            var55 ^= (255L ^ var55) & -1L >>> 32;
            var57 ^= (1095216660480L ^ var57) & -1L << 32;
            var53 ^= (255L ^ var53) & -1L >>> 32;
            if (var26 > 1.0E-9) {
               var55 ^= ((long)lIiiIiIlilli(var28 / var26) ^ var55) & -1L >>> 32;
               var57 ^= ((long)lIiiIiIlilli(var30 / var26) << 32 ^ var57) & -1L << 32;
               var53 ^= ((long)lIiiIiIlilli(var32 / var26) ^ var53) & -1L >>> 32;
            }

            var9.method_61941(
               (int)var49, (int)(var47 >>> 32), lIiiIiIlilli((double)((int)(var53 >>> 32))) << 24 | (int)var55 << 16 | (int)(var57 >>> 32) << 8 | (int)var53
            );
         }

         var47 += 4294967296L;
      }

      return var9;
   }

   private static String iliIiiliiiii(class_2960 id) {
      long var5 = 5923962352623242796L;
      String var1 = id.method_12832().toLowerCase(Locale.ROOT);
      StringBuilder var2 = new StringBuilder(var1.length());
      var5 ^= (0L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) < var1.length()) {
         var5 ^= ((long)var1.charAt((int)(var5 >>> 32)) ^ var5) & -1L >>> 32;
         var2.append((char)(((int)var5 < 97 || (int)var5 > 122) && ((int)var5 < 48 || (int)var5 > 57) && (int)var5 != 95 && (int)var5 != 45 ? '_' : (int)var5));
         var5 += 4294967296L;
      }

      return var2.toString();
   }

   private static boolean liiiIIllIl(class_2960 id) {
      if (!IiIlliIliiIl<"IiIlliIliiIl","vDvB/8dO3naEKIaH4T+LTxXh8BBNboLPnOQhG0ZaRK/8L8fhsmo=">().equals(id.method_12836())) {
         return false;
      } else {
         String var1 = id.method_12832();
         return var1.startsWith(IiIlliIliiIl<"IiIlliIliiIl","8VqeJ/RxDE9jmXYES5F4FHARVkhyJN8NwzS7rLgThf4F46hyuQ==">())
            || var1.startsWith(IiIlliIliiIl<"IiIlliIliiIl","MMboXRbsX5YDdDcdXnwuIMmdgrJWCzgRnkFtF5QPuUc=">());
      }
   }

   private IlilIiilllilIiil() {
   }

   public static class_2960 IliIlllilIi(class_2960 devW, int src, int devH) {
      long var10 = 7723522491349713202L;
      if (devW != null && src > 0 && devH > 0 && liiiIIllIl(devW) && !iIIlIIilil.contains(devW)) {
         class_1011 var3 = iIlIlllllill(devW);
         if (var3 == null) {
            return devW;
         } else {
            var10 ^= ((long)var3.method_4307() << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)var3.method_4323() ^ var10) & -1L >>> 32;
            if (src >= (int)(var10 >>> 32) && devH >= (int)var10) {
               return devW;
            } else if (src <= (int)(var10 >>> 32) && devH <= (int)var10) {
               String var6 = devW
                  + IiIlliIliiIl<"IiIlliIliiIl","2UzqOfhVNNS9L0R2nulpn98itLYgSa5mGM2jWmY=">()
                  + src
                  + IiIlliIliiIl<"IiIlliIliiIl","NxJUtsufXf1Vgw8/xeoDRvZnX8cNZD8uCjU5+EI=">()
                  + devH;
               class_2960 var7 = IlIlIIilil.get(var6);
               if (var7 != null) {
                  return var7;
               } else {
                  try {
                     class_1011 var8 = IilliliilIIi(var3, src, devH);
                     class_2960 var9 = class_2960.method_60655(
                        IiIlliIliiIl<"IiIlliIliiIl","vDvB/8dO3naEKIaH4T+LTxXh8BBNboLPnOQhG0ZaRK/8L8fhsmo=">(),
                        IiIlliIliiIl<"IiIlliIliiIl","VqKA7qztInTQ2HbvWEmq5rkX4ZH0iosIgBRE2BAAE3U=">()
                           + iliIiiliiiii(devW)
                           + IiIlliIliiIl<"IiIlliIliiIl","+PgIs9xFu5ZENTd2iMdNDM9yj7kldZpR2dojQhQ=">()
                           + src
                           + IiIlliIliiIl<"IiIlliIliiIl","NxJUtsufXf1Vgw8/xeoDRvZnX8cNZD8uCjU5+EI=">()
                           + devH
                     );
                     class_310.method_1551()
                        .method_1531()
                        .method_4616(
                           var9, new class_1043(() -> IiIlliIliiIl<"IiIlliIliiIl","Wh3JXU89kbrErUKUQ6nXAgmFCZyOyKMsz0ye5aj4aWMrsjk3AA==">() + var6, var8)
                        );
                     IlIlIIilil.put(var6, var9);
                     IIIllIIliIIl();
                     return var9;
                  } catch (Throwable var12) {
                     iIIlIIilil.add(devW);
                     return devW;
                  }
               }
            } else {
               return devW;
            }
         }
      } else {
         return devW;
      }
   }
}
