package gg.corz;

import java.util.List;
import java.util.Locale;
import java.util.OptionalLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class iIIiIiilIlIiIiil {
   private static final Pattern IlilIIilil = Pattern.compile(
      IIIllIIliIIl<"IIIllIIliIIl","MhZXrymzDTGbVFhDtYBQIY1dQsQ0r8ryfOK3Pf/rJa60h0uZ8kkT4d4HEIYUAMCcEFSibwwJdQUy">()
   );
   private static final Pattern iIilIIilil = Pattern.compile(
      IIIllIIliIIl<"IIIllIIliIIl","cINhPPCqHRbpksN6/DetWOQCwKd7c9lciWyFi3//FxrLweM9rMZ1dxqpnJ/ORWja7/GX5t5MlTF04pOPELj9Qb7VOTAulwNrEWqakst4C8ywXSkBR0k9U3h1juumsDVzEpKDFSJJh4nw+whtbN803ee2ujATW1HTKisCz+BA6Trj6/I=">()
   );

   private iIIiIiilIlIiIiil() {
   }

   private static long IilliliilIIi(String unit) {
      return switch (unit.charAt(0)) {
         case 'd' -> 86400L;
         case 'h' -> 3600L;
         case 'm' -> 60L;
         default -> 1L;
      };
   }

   static String lIiiIiIlilli(String s) {
      return IlilIIilil.matcher(iIIiiilIlIiiil.IliIlllilIi(s))
         .replaceAll(IIIllIIliIIl<"IIIllIIliIIl","3YzNB8uF4pQq1zZbRcP/xwCHP9W6P3y3jpXW+lY=">())
         .trim()
         .toLowerCase(Locale.ROOT);
   }

   static int iliIiiliiiii(List<String> keyword, String lore, boolean last) {
      long var7 = -5115770857594828535L;
      String var3 = lIiiIiIlilli(lore);
      if (keyword != null && !var3.isEmpty()) {
         var7 ^= (-4294967296L ^ var7) & -1L << 32;

         for (var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < keyword.size(); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            String var6 = (String)keyword.get((int)var7);
            if (var6 != null && lIiiIiIlilli(var6).contains(var3)) {
               if (!last) {
                  return (int)var7;
               }

               var7 ^= ((long)((int)var7) << 32 ^ var7) & -1L << 32;
            }
         }

         return (int)(var7 >>> 32);
      } else {
         return -1;
      }
   }

   public static OptionalLong liiiIIllIl(String text) {
      long var7 = -2836585153107694781L;
      if (text == null) {
         return OptionalLong.empty();
      } else {
         Matcher var1 = iIilIIilil.matcher(lIiiIiIlilli(text));
         long var2 = 0L;
         var7 ^= (0L ^ var7) & -1L << 32;

         try {
            for (; var1.find(); var7 ^= (4294967296L ^ var7) & -1L << 32) {
               long var5 = IilliliilIIi(var1.group(3));
               var2 = Math.addExact(var2, Math.multiplyExact(Long.parseLong(var1.group(1)), var5));
               if (var1.group(2) != null) {
                  var2 = Math.addExact(
                     var2,
                     Math.round(Double.parseDouble(IIIllIIliIIl<"IIIllIIliIIl","orhrkvVXO554uVODcPwV2AsLYf38NQVscY7U9Tzv">() + var1.group(2)) * (double)var5)
                  );
               }
            }
         } catch (ArithmeticException | NumberFormatException var9) {
            return OptionalLong.empty();
         }

         return (int)(var7 >>> 32) != 0 ? OptionalLong.of(var2) : OptionalLong.empty();
      }
   }

   public static OptionalLong IliIlllilIi(List<String> keyword, String lore) {
      long var7 = 6870649622336612675L;
      var7 ^= ((long)iliIiiliiiii(keyword, lore, false) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) < 0) {
         return OptionalLong.empty();
      } else {
         String var3 = lIiiIiIlilli(lore);
         String var4 = lIiiIiIlilli((String)keyword.get((int)(var7 >>> 32)));
         String var5 = var4.substring(var4.indexOf(var3) + var3.length());
         var7 ^= ((long)var5.indexOf(58) ^ var7) & -1L >>> 32;
         return liiiIIllIl((int)var7 >= 0 ? var5.substring((int)var7 + 1) : var5);
      }
   }

   public static String iIlIlllllill(long seconds) {
      if (seconds <= 0L) {
         return IIIllIIliIIl<"IIIllIIliIIl","LeeMvOJS++Z6ZMxM8KOEHGAA12TPR6TBGCQ4frkI">();
      } else {
         long var2 = seconds / 3600L;
         long var4 = seconds % 3600L / 60L;
         long var6 = seconds % 60L;
         if (var2 > 0L) {
            return var4 > 0L
               ? var2
                  + IIIllIIliIIl<"IIIllIIliIIl","MKQGu/JpSInwxAVnA0JkzdQW4Ou2DSurMfGj3ZM2">()
                  + var4
                  + IIIllIIliIIl<"IIIllIIliIIl","yFcPdQHGVEBNcG1EnsNKK/Y8Yl7LaqaPjhzaCIg=">()
               : var2 + IIIllIIliIIl<"IIIllIIliIIl","7Pav09emPVHvJI08GFtrAN4nlnToKVzYMtybXkI=">();
         } else if (var4 > 0L) {
            return var6 > 0L
               ? var4
                  + IIIllIIliIIl<"IIIllIIliIIl","HZ/6ziQ6DjKooLpinzfsUkucQOTq7lWEjestE4ZV">()
                  + var6
                  + IIIllIIliIIl<"IIIllIIliIIl","MOfl7tqJHJHHs4If2/7H4n2HI3QJERdHd73ldKo=">()
               : var4 + IIIllIIliIIl<"IIIllIIliIIl","yFcPdQHGVEBNcG1EnsNKK/Y8Yl7LaqaPjhzaCIg=">();
         } else {
            return var6 + IIIllIIliIIl<"IIIllIIliIIl","MOfl7tqJHJHHs4If2/7H4n2HI3QJERdHd73ldKo=">();
         }
      }
   }
}
