package gg.corz;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class iiliIlilIIiiIlil {
   private static final Pattern lIlIIliIil = Pattern.compile(
      IiIlliIliiIl<"IiIlliIliiIl","OqJ7L5XnALIQqXbQsqDxkDgAFMlCUzKy213Csvmk42Jx8eBwjBoIqDmge0Tt3z0H5/OA3jfYfA==">()
   );
   private static final long[] iIlIIliIil = new long[]{1L, 1000L, 1000000L, 1000000000L, 1000000000000L};

   public static boolean iIlIlllllill(Ilililillilili kind, iIiiIIlIliiIIl selfDestructKeyword, String in) {
      if (kind != null && selfDestructKeyword != null && kind.liiiIIllIl() != null) {
         return iIiiIIlIliiIIl.iliIiiliiiii(kind.IliIlllilIi()).orElse(null) == selfDestructKeyword && iliIiiliiiii(kind, selfDestructKeyword)
            ? iIIiIiilIlIiIiil.iliIiiliiiii(kind.liiiIIllIl(), in, false) >= 0
            : false;
      } else {
         return false;
      }
   }

   public static Optional<IiIillIlliIillIl> IliIlllilIi(Ilililillilili in, int selfDestructKeyword, int priceKeyword, String page, String slot) {
      long var17 = -8145538682672981900L;
      if (in != null && in.liiiIIllIl() != null) {
         String var5 = iIIiIiilIlIiIiil.lIiiIiIlilli(page);
         if (!var5.isEmpty() && !iIIiIiilIlIiIiil.lIiiIiIlilli(slot).isEmpty()) {
            iIiiIIlIliiIIl var6 = iIiiIIlIliiIIl.iliIiiliiiii(in.IliIlllilIi()).orElse(null);
            if (var6 != null && iliIiiliiiii(in, var6)) {
               var17 ^= ((long)iIIiIiilIlIiIiil.iliIiiliiiii(in.liiiIIllIl(), slot, false) << 32 ^ var17) & -1L << 32;
               OptionalLong var8 = iIIiIiilIlIiIiil.IliIlllilIi(in.liiiIIllIl(), slot);
               if (!var8.isEmpty() && var8.getAsLong() > 0L) {
                  var17 ^= ((long)iIIiIiilIlIiIiil.iliIiiliiiii(in.liiiIIllIl(), page, true) ^ var17) & -1L >>> 32;
                  if ((int)var17 >= 0 && (int)var17 != (int)(var17 >>> 32)) {
                     String var10 = iIIiIiilIlIiIiil.lIiiIiIlilli(in.liiiIIllIl().get((int)var17));
                     if (var10.contains(iIIiIiilIlIiIiil.lIiiIiIlilli(var6.iIlIlllllill()))) {
                        return Optional.empty();
                     } else {
                        String var11 = var10.substring(var10.indexOf(var5) + var5.length());
                        OptionalLong var12 = iIIiiilIlIiiil.liiiIIllIl(var11);
                        if (!var12.isEmpty() && var12.getAsLong() > 0L) {
                           double var13 = IIIllIIliIIl(in.IilliliilIIi());
                           String var15 = iIIiiilIlIiiil.IliIlllilIi(in.IliIlllilIi()).trim();
                           String var16 = IlIlllIlilIl(var6, var12.getAsLong(), in.liiiIIllIl(), (int)(var17 >>> 32), (int)var17, var13);
                           return Optional.of(
                              new IiIillIlliIillIl(
                                 var6,
                                 selfDestructKeyword,
                                 priceKeyword,
                                 var15,
                                 var12.getAsLong(),
                                 liiiIIllIl(var11, var12.getAsLong()),
                                 var8.getAsLong(),
                                 var13,
                                 var16
                              )
                           );
                        } else {
                           return Optional.empty();
                        }
                     }
                  } else {
                     return Optional.empty();
                  }
               } else {
                  return Optional.empty();
               }
            } else {
               return Optional.empty();
            }
         } else {
            return Optional.empty();
         }
      } else {
         return Optional.empty();
      }
   }

   private static boolean iliIiiliiiii(Ilililillilili in, iIiiIIlIliiIIl kind) {
      return in.iIlIlllllill() == kind.IilliliilIIi() && iIIiIiilIlIiIiil.iliIiiliiiii(in.liiiIIllIl(), kind.iIlIlllllill(), false) >= 0;
   }

   public static boolean IilliliilIIi(Ilililillilili in, iIiiIIlIliiIIl kind) {
      return in != null && kind != null && in.liiiIIllIl() != null
         ? iIiiIIlIliiIIl.iliIiiliiiii(in.IliIlllilIi()).orElse(null) == kind && !iliIiiliiiii(in, kind)
         : false;
   }

   public static boolean lIiiIiIlilli(IiIillIlliIillIl a, IiIillIlliIillIl b, long toleranceSeconds) {
      if (a != null && b != null && a.IIlllIlliIll() != null && a.IIlllIlliIll().equals(b.IIlllIlliIll())) {
         long var4 = Math.max(a.IlIlllIlilIl(), b.IlIlllIlilIl()) - Math.min(a.IlIlllIlilIl(), b.IlIlllIlilIl());
         return var4 >= 0L && var4 <= Math.max(0L, toleranceSeconds);
      } else {
         return false;
      }
   }

   static long liiiIIllIl(String price, long priceText) {
      long var11 = 4647077765487800000L;
      long var13 = -8900431128281705829L;
      Matcher var3 = lIlIIliIil.matcher(price == null ? "" : price);
      if (priceText > 0L && var3.find()) {
         double var4;
         try {
            var4 = Double.parseDouble(var3.group().replace(IiIlliIliiIl<"IiIlliIliiIl","kTEDe7nV9mVxWMz5KtEctI8vrV5Hb1G2OpGG8A8=">(), ""));
         } catch (NumberFormatException var15) {
            return priceText;
         }

         var11 ^= ((long)(var3.group(1) == null ? 0 : var3.group(1).length()) << 32 ^ var11) & -1L << 32;

         for (long var17 = var11 ^ ((long)(iIlIIliIil.length - 1) ^ var11) & -1L >>> 32; (int)var17 >= 1; var17 ^= (var17 ^ var17 + (long)-1) & -1L >>> 32) {
            if (Math.round(var4 * (double)iIlIIliIil[(int)var17]) == priceText) {
               long var8 = iIlIIliIil[(int)var17];

               for (long var18 = var13 ^ ((long)Math.max(1, (int)(var17 >>> 32)) << 32 ^ var13) & -1L << 32;
                  (int)(var18 >>> 32) > 0 && var8 >= 10L;
                  var18 += -4294967296L
               ) {
                  var8 /= 10L;
               }

               return priceText > Long.MAX_VALUE - var8 ? Long.MAX_VALUE : priceText + var8 - 1L;
            }
         }

         return priceText;
      } else {
         return priceText;
      }
   }

   private iiliIlilIIiiIlil() {
   }

   private static String IlIlllIlilIl(iIiiIIlIliiIIl price, long timeAt, List<String> durability, int kind, int priceAt, double lore) {
      long var11 = -1073549193793284833L;
      StringJoiner var8 = new StringJoiner(IiIlliIliiIl<"IiIlliIliiIl","kTEDe7nV9mVxWMz5KtEctI8vrV5Hb1G2OpGG8A8=">());

      for (long var13 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var13 >>> 32) < durability.size(); var13 += 4294967296L) {
         if ((int)(var13 >>> 32) != kind
            && (int)(var13 >>> 32) != priceAt
            && !iIIiIiilIlIiIiil.liiiIIllIl(iIIiIiilIlIiIiil.lIiiIiIlilli((String)durability.get((int)(var13 >>> 32)))).isPresent()) {
            String var10 = iIiiIIlIliiIIl.IIIllIIliIIl((String)durability.get((int)(var13 >>> 32)));
            if (!var10.isEmpty()) {
               var8.add(var10);
            }
         }
      }

      return price.name() + '|' + timeAt + '|' + var8 + '|' + Math.round(lore * 1000.0);
   }

   private static double IIIllIIliIIl(double d) {
      return Double.isNaN(d) ? 0.0 : Math.max(0.0, Math.min(1.0, d));
   }
}
