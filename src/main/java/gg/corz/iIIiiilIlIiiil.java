package gg.corz;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class iIIiiilIlIiiil {
   private static final Pattern iiiIillliIIIlillli = Pattern.compile(
      IIlllIlliIll<"IIlllIlliIll","Ll4MYHt9GLMXKv88FbPN5NQE/CiLhxugcFLXTQmTHIrkkNNY17uFb3hzQOBIj0Z8PpYhRTZIBzxgxLfz2K9Okcrv/gWWLDxeMMpTYo/zn2uk2WTyLycLWfzV5UzpmI6+">(),
      2
   );
   private static final Pattern IiiIillliliiIillli = Pattern.compile(
      IIlllIlliIll<"IIlllIlliIll","DkMbPoijB2qFlpvabhQbqX1UvusxrNAuv5YFf/pI5yF8sEIgCDKhi1iGo7w9mLqdXR3RXe1GmceJFlZVhw==">()
   );
   private static final Pattern IlIlilllillIlillli = Pattern.compile(
      IIlllIlliIll<"IIlllIlliIll","u6sbpF1wueLdGgLCqPF8DmE5wqq8ZufcioXChWyWrqa8NddIik1hDFA9spL/Goa0NlXQCrH0+s80wfsglDwLLY8cFaSBcZPxjFnGYMGCZWBGEWo1Grb8hLECiKdZRrA1RaTvXrWjoOa6Q3pZtfYjXV3lnQTSzCb09fJxhP1OAVDjCyXLjPG/LPZ1YfR+DKafMGz54CKPqb+16SFCb8MT71MVwF8=">(),
      2
   );
   private static final String[] lIIlillliiIIlillli = new String[]{
      IIlllIlliIll<"IIlllIlliIll","S9Q9WXrvBsA8RCmVf6WSrYM+pngbmxFww+9PnqVgX8rOsQ==">(),
      IIlllIlliIll<"IIlllIlliIll","xBz+UBkVcDT2DWCRTX2ukCWVK8l13JzfKCGexBW50w==">(),
      IIlllIlliIll<"IIlllIlliIll","TTCjqI9bI3vSaW9E/L2liljg46rOzG54sSqqbhrU8neHAhiN">(),
      IIlllIlliIll<"IIlllIlliIll","mQfVDjkkeCjonUeFtkcZXkQaZjRWnRHZpFlgUpNDAZ4r">(),
      IIlllIlliIll<"IIlllIlliIll","s7W0G6PaAXO14AfEeYb7cMHScflsPB1Q5zggl1LwM1b4">(),
      IIlllIlliIll<"IIlllIlliIll","BI0x4wK8hDPcLex+ckzIMs1W+MesQBnLJkCYtGNIwRE=">(),
      IIlllIlliIll<"IIlllIlliIll","6R7Nlui+bbdY6bzSgZozQqwAL9vDtaTpTm2qlZ+zDhXD+hO6zg==">(),
      IIlllIlliIll<"IIlllIlliIll","MOkdpEu2twNQqR/cGM64bmudpPBXOqs5Hdw7Q+ctDHHr+A==">(),
      IIlllIlliIll<"IIlllIlliIll","PMvGFTBgp91XXX2iAD6oT057xC4iB2StZTtpsSys2dE=">(),
      IIlllIlliIll<"IIlllIlliIll","qey7CQg/uUd8rQpx2gEknN62FLC8OrqAUcxtYMB71NXljw==">(),
      IIlllIlliIll<"IIlllIlliIll","Kh73Qjt5o5Muhwr81JsSdNISBXkVds7hjpvNUHXdwyg0fS4=">(),
      IIlllIlliIll<"IIlllIlliIll","Teg8VGaqz2x8f26lji09uC2wFiXAXQDdIJTJDuoqF1M=">(),
      IIlllIlliIll<"IIlllIlliIll","MdyrxXHwvrTBcGEqtChhw2cIujhMnRNjbej2++fa">(),
      IIlllIlliIll<"IIlllIlliIll","AN/4xPYSadXhlARy9XYXSKG3/OSCTHsao0/BdZuX7to=">()
   };
   private static final Pattern lliIillliiliIillli = Pattern.compile(
      IIlllIlliIll<"IIlllIlliIll","Qdtoi8hndBvHqoNGcR4wiOfxPBkGvIyvi+3nxq6CG7DCU1OivA8CfYo1KkTPpv/tRl+rCQAP08hTnWAfyRu0yiXaz3KSISE=">()
   );

   public static OptionalLong iIlIlllllill(List<String> lines, String priceKeyword) {
      if (lines == null) {
         return OptionalLong.empty();
      } else {
         String var2 = priceKeyword == null ? "" : priceKeyword.toLowerCase(Locale.ROOT).trim();
         OptionalLong var3 = OptionalLong.empty();
         OptionalLong var4 = OptionalLong.empty();
         OptionalLong var5 = OptionalLong.empty();

         for (String var7 : lines) {
            if (var7 != null) {
               String var8 = IliIlllilIi(var7);
               String var9 = var8.toLowerCase(Locale.ROOT);
               OptionalLong var10 = liiiIIllIl(var8);
               if (!var10.isEmpty()) {
                  if (!var2.isEmpty() && var9.contains(var2) && var3.isEmpty()) {
                     var3 = var10;
                  }

                  if (var9.contains(IIlllIlliIll<"IIlllIlliIll","1iVnjZ1nN4vuEdt+hRAR+lbIOrvdkgOcEM/8MmWDpmCN">())
                     && !var9.contains(IIlllIlliIll<"IIlllIlliIll","MOkdpEu2twNQqR/cGM64bmudpPBXOqs5Hdw7Q+ctDHHr+A==">())
                     && var4.isEmpty()) {
                     var4 = var10;
                  }

                  if (var5.isEmpty() && !IiIlliIliiIl(var9)) {
                     var5 = var10;
                  }
               }
            }
         }

         if (var3.isPresent()) {
            return var3;
         } else {
            return var4.isPresent() ? var4 : var5;
         }
      }
   }

   public static boolean lIiiIiIlilli(List<String> loreLines, String priceKeyword) {
      if (loreLines == null) {
         return false;
      } else {
         String var2 = priceKeyword == null ? "" : priceKeyword.toLowerCase(Locale.ROOT).trim();

         for (String var4 : loreLines) {
            if (var4 != null) {
               String var5 = IliIlllilIi(var4).toLowerCase(Locale.ROOT);
               if (var5.contains(IIlllIlliIll<"IIlllIlliIll","1iVnjZ1nN4vuEdt+hRAR+lbIOrvdkgOcEM/8MmWDpmCN">()) || !var2.isEmpty() && var5.contains(var2)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static String IlIlllIlilIl(String s) {
      long var6 = -1356548728878358207L;
      long var8 = -6218865776672951711L;
      StringBuilder var1 = new StringBuilder();
      char[] var2 = IliIlllilIi(s).toLowerCase(Locale.ROOT).toCharArray();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var11 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         var8 ^= ((long)var2[(int)var11] << 32 ^ var8) & -1L << 32;
         if (Character.isLetterOrDigit((char)((int)(var8 >>> 32)))) {
            var1.append((char)((int)(var8 >>> 32)));
         }
      }

      return var1.toString();
   }

   public static OptionalLong IilliliilIIi(List<String> loreLines, String priceKeyword) {
      long var10 = -479178225961075200L;
      if (loreLines == null) {
         return OptionalLong.empty();
      } else {
         String var2 = priceKeyword == null ? "" : priceKeyword.toLowerCase(Locale.ROOT).trim();
         OptionalLong var3 = OptionalLong.empty();
         if (!var2.isEmpty()) {
            for (String var5 : loreLines) {
               if (var5 != null) {
                  String var6 = IliIlllilIi(var5).toLowerCase(Locale.ROOT);
                  var10 ^= ((long)var6.indexOf(var2) << 32 ^ var10) & -1L << 32;
                  if ((int)(var10 >>> 32) >= 0) {
                     String var8 = var6.substring((int)(var10 >>> 32) + var2.length());
                     OptionalLong var9 = liiiIIllIl(var8);
                     if (var9.isEmpty()) {
                        if (var8.chars().anyMatch(Character::isDigit)) {
                           return OptionalLong.empty();
                        }

                        var9 = liiiIIllIl(var6);
                     }

                     if (var9.isPresent() && (var3.isEmpty() || var9.getAsLong() > var3.getAsLong())) {
                        var3 = var9;
                     }
                  }
               }
            }
         }

         return var3.isPresent() ? var3 : iIlIlllllill(loreLines, priceKeyword);
      }
   }

   public static OptionalLong liiiIIllIl(String raw) {
      long var12 = -7358267792650278334L;
      String var1 = IliIlllilIi(raw);
      Matcher var2 = lliIillliiliIillli.matcher(var1);
      if (!var2.find()) {
         return OptionalLong.empty();
      } else {
         var12 ^= ((long)var2.end(1) << 32 ^ var12) & -1L << 32;
         if ((int)(var12 >>> 32) < var1.length()
            && Character.isLetter(var1.charAt((int)(var12 >>> 32)))
            && IIlllIlliIll<"IIlllIlliIll","8/PPYx8NtHiqP+sgVT1Y3yiz5Lu+w7AjobZ2YbM8SAy5jcHJ">().indexOf(var1.charAt((int)(var12 >>> 32))) < 0) {
            return OptionalLong.empty();
         } else if (IiiIillliliiIillli.matcher(var1).region((int)(var12 >>> 32), var1.length()).lookingAt()) {
            return OptionalLong.empty();
         } else {
            String var4 = var2.group(1).replace(IIlllIlliIll<"IIlllIlliIll","hE5SKobTmq70OBw3fdGKtC4sGefI5JhWHetCaW8=">(), "");
            String var5 = var2.group(2);
            if (var5 != null && var2.start(2) > (int)(var12 >>> 32) && var2.end(2) < var1.length() && Character.isLetter(var1.charAt(var2.end(2)))) {
               if (iiiIillliIIIlillli.matcher(var1).region(var2.start(2), var1.length()).lookingAt()) {
                  return OptionalLong.empty();
               }

               var5 = null;
            }

            if (var5 == null && var2.group(1).matches(IIlllIlliIll<"IIlllIlliIll","PRw5FHTriwXlREJKfkjDi6/x2cXE1eCtz2KdVPkY16nLDA9zTPVHG9LOZpkesS7C">())) {
               return OptionalLong.empty();
            } else {
               double var6;
               try {
                  var6 = Double.parseDouble(var4);
               } catch (NumberFormatException var14) {
                  return OptionalLong.empty();
               }
               long var8 = switch (var5 != null && !var5.isEmpty() ? Character.toLowerCase(var5.charAt(0)) : ' ') {
                  case 'b' -> 1000000000L;
                  case 'k' -> 1000L;
                  case 'm' -> 1000000L;
                  case 't' -> 1000000000000L;
                  default -> 1L;
               };
               long var10 = Math.round(var6 * (double)var8);
               return var10 >= 0L ? OptionalLong.of(var10) : OptionalLong.empty();
            }
         }
      }
   }

   private static boolean IiIlliIliiIl(String lowerLine) {
      long var5 = 7839449932751441352L;
      String[] var1 = lIIlillliiIIlillli;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         String var4 = var1[(int)var8];
         if (lowerLine.contains(var4)) {
            return true;
         }
      }

      return false;
   }

   private iIIiiilIlIiiil() {
   }

   public static boolean IIIllIIliIIl(String a, String b) {
      String var2 = IlIlllIlilIl(a);
      String var3 = IlIlllIlilIl(b);
      return !var2.isEmpty() && !var3.isEmpty() && (var2.contains(var3) || var3.contains(var2));
   }

   public static String IliIlllilIi(String s) {
      long var4 = 4175959230552080275L;
      if (s == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(s.length());
         var4 ^= (0L ^ var4) & -1L << 32;

         while ((int)(var4 >>> 32) < s.length()) {
            var4 ^= ((long)s.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
            if ((int)var4 == 167 && (int)(var4 >>> 32) + 1 < s.length()) {
               var4 += 4294967296L;
            } else {
               var1.append((char)((int)var4));
            }

            var4 += 4294967296L;
         }

         return var1.toString();
      }
   }

   public static Optional<IIIililIIili> iliIiiliiiii(String raw) {
      long var4 = -7888493673734633906L;
      Matcher var1 = IlIlilllillIlillli.matcher(IliIlllilIi(raw));
      if (!var1.find()) {
         return Optional.empty();
      } else {
         try {
            var4 ^= ((long)Integer.parseInt(var1.group(1)) << 32 ^ var4) & -1L << 32;
         } catch (NumberFormatException var6) {
            return Optional.empty();
         }

         OptionalLong var3 = liiiIIllIl(var1.group(3));
         return (int)(var4 >>> 32) > 0 && !var3.isEmpty()
            ? Optional.of(new IIIililIIili((int)(var4 >>> 32), var3.getAsLong(), var1.group(2).trim()))
            : Optional.empty();
      }
   }
}
