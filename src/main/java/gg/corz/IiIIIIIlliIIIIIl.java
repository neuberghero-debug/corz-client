package gg.corz;

import java.util.List;

public final class IiIIIIIlliIIIIIl {
   public static final int liilIiIlIl = 11141290;
   static final float ilIiIiIlIl = 0.28F;
   static final int liIiIiIlIl = 3;
   public static final int IlliIiIlIl = 2;
   public static final int iIliIiIlIl = 9;
   static final int lIliIiIlIl = 4;
   static final float llIiIiIlIl = 165.0F;
   static final int iiIiIiIlIl = 16;
   public static final int IIIiIiIlIl = 43520;
   static final int IiIiIiIlIl = 64;
   public static final int IiilIiIlIl = 16733695;
   static final float lIIiIiIlIl = 248.0F;
   static final float iIIiIiIlIl = 326.0F;
   public static final int ililIiIlIl = -1;
   static final float IlIiIiIlIl = 75.0F;
   static final int IIliIiIlIl = 2;
   public static final int iiilIiIlIl = 5635925;

   public static int IliIlllilIi(String name, String team) {
      if (name != null && team != null && !team.isEmpty()) {
         int var2 = name.indexOf(45);
         if (var2 >= 1 && var2 <= 3) {
            int var3 = 0;

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = name.charAt(var4);
               if (var5 < '0' || var5 > '9') {
                  return -1;
               }

               var3 = var3 * 10 + (var5 - '0');
            }

            int var6 = var2 + 1 + team.length();
            if (var6 <= name.length() && name.regionMatches(true, var2 + 1, team, 0, team.length())) {
               return var6 != name.length() && name.charAt(var6) != 45 ? -1 : var3;
            } else {
               return -1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private static boolean Iiiiliiiiiii(String s, String part) {
      int var2 = part.length();

      for (int var3 = 0; var3 + var2 <= s.length(); var3++) {
         if (s.regionMatches(true, var3, part, 0, var2)) {
            return true;
         }
      }

      return false;
   }

   static boolean IiIiliIiiiIi(String font, int[] cp, int owner, int at, String all) {
      if (!Illillliilli(all) && !IIiilIiiiIii(all) && Character.isLetterOrDigit(at)) {
         int var5 = cp[owner];
         int var6 = owner;
         int var7 = owner;

         while (var6 > 0 && cp[var6 - 1] == var5 && Character.isLetterOrDigit(font.charAt(var6 - 1))) {
            var6--;
         }

         while (var7 < font.length() && cp[var7] == var5 && Character.isLetterOrDigit(font.charAt(var7))) {
            var7++;
         }

         return var7 - var6 <= 2;
      } else {
         return false;
      }
   }

   private IiIIIIIlliIIIIIl() {
   }

   static IIiIIlIilIiIIlIi Ililllililil(String r, int[] cp, int owner, int all, llllIlllilllIlll at) {
      long var8 = -9016762716456842934L;
      String var5 = at.IilliliilIIi();
      if (IIiilIiiiIii(var5)) {
         return null;
      } else {
         var8 ^= ((long)(!IlIillIiilIi(all, var5) && !IiIiliIiiiIi(r, cp, owner, all, var5) ? 0 : 1) << 32 ^ var8) & -1L << 32;
         if ((int)(var8 >>> 32) == 0 && !Iiilliiliiil(all)) {
            return null;
         } else {
            IIiIIlIilIiIIlIi var7 = IIIIllIIIl(at.iIlIlllllill());
            if (var7 == null && (int)(var8 >>> 32) != 0) {
               var7 = Iliilliiilii(var5);
            }

            return var7;
         }
      }
   }

   public static int llIIlilIIl(int tier, IIiIIlIilIiIIlIi rgb) {
      if (tier < 0) {
         tier = rgb == null ? 16777215 : rgb.Iilliiiiil;
      }

      int var2 = tier >> 16 & 0xFF;
      int var3 = tier >> 8 & 0xFF;
      int var4 = tier & 0xFF;
      int var5 = Math.max(var2, Math.max(var3, var4));
      int var6 = Math.min(var2, Math.min(var3, var4));
      if (var5 == 0) {
         return 16777215;
      } else {
         float var7 = iIIIlIlIIl(var2, var3, var4, var5, var6) / 60.0F;
         float var8 = Math.max(0.42F, Math.min(0.68F, (float)(var5 - var6) / (float)var5));
         float var9 = Math.max(0.86F, Math.min(1.0F, (float)var5 / 255.0F));
         float var10 = var9 * var8;
         float var11 = var10 * (1.0F - Math.abs(var7 % 2.0F - 1.0F));
         float var12 = var9 - var10;
         float var13;
         float var14;
         float var15;
         if (var7 < 1.0F) {
            var13 = var10;
            var14 = var11;
            var15 = 0.0F;
         } else if (var7 < 2.0F) {
            var13 = var11;
            var14 = var10;
            var15 = 0.0F;
         } else if (var7 < 3.0F) {
            var13 = 0.0F;
            var14 = var10;
            var15 = var11;
         } else if (var7 < 4.0F) {
            var13 = 0.0F;
            var14 = var11;
            var15 = var10;
         } else if (var7 < 5.0F) {
            var13 = var11;
            var14 = 0.0F;
            var15 = var10;
         } else {
            var13 = var10;
            var14 = 0.0F;
            var15 = var11;
         }

         return Math.round((var13 + var12) * 255.0F) << 16 | Math.round((var14 + var12) * 255.0F) << 8 | Math.round((var15 + var12) * 255.0F);
      }
   }

   public static boolean Illillliilli(String font) {
      return font != null && !font.isEmpty()
         ? font.equals(iiIIlIIlIl<"iiIIlIIlIl","KfeYneFrTv2Wb3Q5rFliK9i0H6rS/RIMAczIpogWUsBmLHqlMboGxR+akhsn">())
            || font.equals(iiIIlIIlIl<"iiIIlIIlIl","aYfZmGgcO+LoJvCczDTZTCdkq5NtLg5NGUnbALw7me1ggXhn235RRvbsFxQE">())
            || font.equals(iiIIlIIlIl<"iiIIlIIlIl","OmfQRB+sXfIbLFHuusaJomE9wz5u8sKOF7Wd8JJcW6DgF9qwkFnD37I=">())
            || font.equals(iiIIlIIlIl<"iiIIlIIlIl","mxo1xw8Qsf6Hs2gbAKbzOeed8rVo/Xiq2CJWJZYwuO8kekAo76uDP4cFBXPXYSC0">())
         : true;
   }

   private static boolean IIlllIlliIll(String runs, List<llllIlllilllIlll> i, int[] owner, int all) {
      long var5 = -6364494672527836105L;
      var5 ^= ((long)runs.charAt(all) << 32 ^ var5) & -1L << 32;
      return IIillIiliIil((char)((int)(var5 >>> 32))) && Illillliilli(((llllIlllilllIlll)i.get(owner[all])).IilliliilIIi());
   }

   static int IIIllIIliIIl(String name, String all) {
      if (all != null && !all.isEmpty() && all.length() <= name.length()) {
         int var2 = all.length();

         for (int var3 = name.length() - var2; var3 >= 0; var3--) {
            if (name.regionMatches(true, var3, all, 0, var2)) {
               boolean var4 = var3 == 0 || !IIillIiliIil(name.charAt(var3 - 1));
               boolean var5 = var3 + var2 == name.length() || !IIillIiliIil(name.charAt(var3 + var2));
               if (var4 && var5) {
                  return var3 + var2;
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   static boolean IlIillIiilIi(int font, String cp) {
      if (Character.isWhitespace(font) || Character.isSpaceChar(font)) {
         return false;
      } else if (IIIilIIiiIIi(font)) {
         return true;
      } else if (Illillliilli(cp)) {
         return false;
      } else {
         return Iilililiiili(cp) ? true : !Character.isLetterOrDigit(font) && !IIlilIliiIli(font);
      }
   }

   static float iIIIlIlIIl(int g, int min, int r, int b, int max) {
      float var5 = (float)(b - max);
      if (var5 <= 0.0F) {
         return 0.0F;
      } else {
         float var6;
         if (b == g) {
            var6 = (float)(min - r) / var5 % 6.0F;
         } else if (b == min) {
            var6 = (float)(r - g) / var5 + 2.0F;
         } else {
            var6 = (float)(g - min) / var5 + 4.0F;
         }

         var6 *= 60.0F;
         return var6 < 0.0F ? var6 + 360.0F : var6;
      }
   }

   private static IliIilllliIill IilliliilIIi(String start, List<llllIlllilllIlll> owner, int[] shown, int runs, String all) {
      int var5 = runs;

      while (var5 > 0 && Character.isWhitespace(start.charAt(var5 - 1))) {
         var5--;
      }

      for (int var6 = 0; var5 > 0 && var6 < 4; var6++) {
         int var7 = start.codePointBefore(var5);
         if (Character.isWhitespace(var7)) {
            break;
         }

         int var8 = var5 - Character.charCount(var7);
         llllIlllilllIlll var9 = (llllIlllilllIlll)owner.get(shown[var8]);
         IIiIIlIilIiIIlIi var10 = Ililllililil(start, shown, var8, var7, var9);
         if (var10 != null) {
            return new IliIilllliIill(all, var10, var9.iIlIlllllill() < 0 ? var10.Iilliiiiil : var9.iIlIlllllill() & 16777215);
         }

         var5 = var8;
      }

      return null;
   }

   private static boolean Illlllllilll(String all, int e, int s) {
      char var3 = e > 0 ? all.charAt(e - 1) : 32;
      char var4 = s < all.length() ? all.charAt(s) : 32;
      return var3 == '[' || var3 == '(' || var3 == '{' || var3 == '<' || var4 == ']' || var4 == ')' || var4 == '}' || var4 == '>';
   }

   public static boolean IIIilIIiiIIi(int cp) {
      return cp >= (809084543 * 1084587701 * 1857283155 * 678152731 ^ -821905397) && cp <= (-(1722419489 * 33) - -57 + -7 ^ -1005311474)
         || cp >= (-(-979689090 * -619094385) ^ -1733228898)
            && cp <= ((-2019309942 * 1191041351 >>> 19 | -2019309942 * 1191041351 << 13) * -1875962727 ^ -796489290)
         || cp >= ((-1660381763 + -63 ^ -71) * 43 ^ -1616973971) && cp <= ((1516738362 - 51) * 93 * 65 ^ -1073102922);
   }

   static boolean Iilililiiili(String font) {
      return font != null && font.startsWith(iiIIlIIlIl<"iiIIlIIlIl","SQ/QNH8urd0XVaOHoiAXC1fVvxNX5QEsJGxAuUUkuu+76lw=">());
   }

   private static IliIilllliIill lIiiIiIlilli(String owner, List<llllIlllilllIlll> all, int[] shown, int from, String runs) {
      int var5 = from;

      while (var5 < owner.length()) {
         int var6 = owner.codePointAt(var5);
         llllIlllilllIlll var7 = (llllIlllilllIlll)all.get(shown[var5]);
         int var8 = var5;
         var5 += Character.charCount(var6);
         IIiIIlIilIiIIlIi var9 = Ililllililil(owner, shown, var8, var6, var7);
         if (var9 != null) {
            return new IliIilllliIill(runs, var9, var7.iIlIlllllill() < 0 ? var9.Iilliiiiil : var7.iIlIlllllill() & 16777215);
         }
      }

      return null;
   }

   static boolean IIillIiliIil(char c) {
      return c >= (~(-(1376951415 >>> 9 | 1376951415 << 23)) ^ 1000933676) && c <= (-(343872455 - -27 - -57) ^ -343872609)
         || c >= (-(1543463565 * -123) ^ 867457534) && c <= (-(--533162182 * -1643291835) * -89 ^ -1794480140)
         || c >= ((770762559 * 41 >>> 25 | 770762559 * 41 << 7) ^ -897283171) && c <= ((1278041505 + -99) * 1047552999 ^ 387849419)
         || c == (-(~-1578076376) * 1059797125 ^ -689840110);
   }

   private static boolean IIlilIliiIli(int cp) {
      long var2 = 1947683669442765250L;
      if (cp < (((-100657223 << 7 | -100657223 >>> 25) - 101 << 11 | (-100657223 << 7 | -100657223 >>> 25) - 101 >>> 21) - 29 ^ 1592049507)) {
         return !Character.isLetterOrDigit(cp);
      } else {
         var2 ^= ((long)Character.getType(cp) << 32 ^ var2) & -1L << 32;
         return (int)(var2 >>> 32) == ((-330337227 + 25 >>> 9 | -330337227 + 25 << 23) ^ 662054830)
            || (int)(var2 >>> 32) == (-28309954 + -117 + 5 ^ -28310053)
            || (int)(var2 >>> 32) == (~(1953651614 + 103 + -59) - -53 ^ -1953651588)
            || (int)(var2 >>> 32) == ((~-688876949 << 9 | ~-688876949 >>> 23) ^ 517679173)
            || (int)(var2 >>> 32) == (--631665878 - -23 - -87 ^ 631666012)
            || (int)(var2 >>> 32) == ((246905878 ^ -121) * 69 ^ 143357448)
            || (int)(var2 >>> 32) == ((109609571 ^ -61) - 61 ^ -109609603);
      }
   }

   private static String IlIlllIlilIl(String runs, List<llllIlllilllIlll> owner, int[] all, int limit) {
      int var4 = limit;

      while (var4 > 0) {
         while (var4 > 0 && !IIlllIlliIll(runs, owner, all, var4 - 1)) {
            var4--;
         }

         int var5 = var4;

         while (var4 > 0 && IIlllIlliIll(runs, owner, all, var4 - 1)) {
            var4--;
         }

         if (var5 <= var4) {
            break;
         }

         if (var5 - var4 >= 3 && var5 - var4 <= 16 && !Illlllllilll(runs, var4, var5) && Iilllilliill(runs, var4, var5)) {
            return runs.substring(var4, var5);
         }
      }

      return null;
   }

   public static IliIilllliIill liiiIIllIl(IliIilllliIill name, int badge, String priority) {
      if (badge < 0) {
         return name;
      } else if (badge >= (-94490079 * -67 * -59 - -99 + 57 ^ 142872612)) {
         return null;
      } else if (name != null) {
         return name;
      } else if (priority != null && !priority.isEmpty()) {
         IIiIIlIilIiIIlIi var3 = badge <= ((~(745632489 + -23) << 1 | ~(745632489 + -23) >>> 31) - 49 ^ -1491264984)
            ? IIiIIlIilIiIIlIi.Illliiiiil
            : IIiIIlIilIiIIlIi.lllliiiiil;
         return new IliIilllliIill(priority, var3, var3.Iilliiiiil);
      } else {
         return null;
      }
   }

   private static boolean Iilllilliill(String s, int all, int e) {
      for (int var3 = all; var3 < e; var3++) {
         if (Character.isLetter(s.charAt(var3))) {
            return true;
         }
      }

      return false;
   }

   private static IliIilllliIill iliIiiliiiii(String runs, List<llllIlllilllIlll> owner, int[] all) {
      int var3 = 0;

      while (var3 < runs.length()) {
         int var4 = runs.codePointAt(var3);
         llllIlllilllIlll var5 = (llllIlllilllIlll)owner.get(all[var3]);
         int var6 = var3;
         var3 += Character.charCount(var4);
         IIiIIlIilIiIIlIi var7 = Ililllililil(runs, all, var6, var4, var5);
         if (var7 != null) {
            String var8 = IlIlllIlilIl(runs, owner, all, var6);
            if (var8 == null) {
               var8 = IiIlliIliiIl(runs, owner, all, var3);
            }

            if (var8 != null) {
               return new IliIilllliIill(var8, var7, var5.iIlIlllllill() < 0 ? var7.Iilliiiiil : var5.iIlIlllllill() & 16777215);
            }
         }
      }

      return null;
   }

   public static int IiIIlliIIl(int t, int a, float b) {
      if (b <= 0.0F) {
         return t & 16777215;
      } else if (b >= 1.0F) {
         return a & 16777215;
      } else {
         int var3 = Math.round((float)(t >> 16 & 0xFF) + (float)((a >> 16 & 0xFF) - (t >> 16 & 0xFF)) * b);
         int var4 = Math.round((float)(t >> 8 & 0xFF) + (float)((a >> 8 & 0xFF) - (t >> 8 & 0xFF)) * b);
         int var5 = Math.round((float)(t & 0xFF) + (float)((a & 0xFF) - (t & 0xFF)) * b);
         return var3 << 16 | var4 << 8 | var5;
      }
   }

   public static boolean Iiilliiliiil(int cp) {
      return cp == 9733
         || cp == 9734
         || cp >= 10022 && cp <= 10032
         || cp >= 10036 && cp <= 10041
         || cp == 10050
         || cp == 8902
         || cp == 9055
         || cp == 1645
         || cp >= 11088 && cp <= 11090
         || cp >= 11212 && cp <= 11215
         || cp >= 11240 && cp <= 11247
         || cp == 127775
         || cp == 127776
         || cp >= 128960 && cp <= 128984;
   }

   static IIiIIlIilIiIIlIi Iliilliiilii(String font) {
      if (font == null) {
         return null;
      } else if (Iiiiliiiiiii(font, iiIIlIIlIl<"iiIIlIIlIl","NYYs3J256rQd4875Qoo5h2TrlTYw2pQv1Xc97LYRZU8o7A==">())
         || Iiiiliiiiiii(font, iiIIlIIlIl<"iiIIlIIlIl","3Z/gOa8T0DN/EXjW7sVq5TCS1UY7rpM/4xEy9dm/DTQ65w==">())
         || Iiiiliiiiiii(font, iiIIlIIlIl<"iiIIlIIlIl","7MAZg4ncmC7FJ6WbXQqpzH7QT9+1xNOZ7jdnQBtqeUsZqX8=">())) {
         return IIiIIlIilIiIIlIi.Illliiiiil;
      } else {
         return !Iiiiliiiiiii(font, iiIIlIIlIl<"iiIIlIIlIl","4xAMkJFnUMP2b4/9i+fuJsvZhw1kTQ75YR4VpxM7zZVS">())
               && !Iiiiliiiiiii(font, iiIIlIIlIl<"iiIIlIIlIl","OshAeerm2N31AbZi+9ROP7lAYLMvef2Pj9n+sQc2jBg=">())
            ? null
            : IIiIIlIilIiIIlIi.lllliiiiil;
      }
   }

   public static IliIilllliIill iIlIlllllill(List<llllIlllilllIlll> name, String runs) {
      if (name != null && !name.isEmpty()) {
         int var2 = 0;

         for (int var3 = 0; var3 < name.size(); var3++) {
            var2 += ((llllIlllilllIlll)name.get(var3)).liiiIIllIl().length();
         }

         if (var2 == 0) {
            return null;
         } else {
            StringBuilder var9 = new StringBuilder(var2);
            int[] var4 = new int[var2];
            int var5 = 0;

            for (int var6 = 0; var5 < name.size(); var5++) {
               String var7 = ((llllIlllilllIlll)name.get(var5)).liiiIIllIl();
               var9.append(var7);

               for (int var8 = 0; var8 < var7.length(); var8++) {
                  var4[var6 + var8] = var5;
               }

               var6 += var7.length();
            }

            String var10 = var9.toString();
            int var11 = IIIllIIliIIl(var10, runs);
            if (var11 >= 0) {
               IliIilllliIill var12 = lIiiIiIlilli(var10, name, var4, var11, runs);
               return var12 != null ? var12 : IilliliilIIi(var10, name, var4, var11 - runs.length(), runs);
            } else {
               return iliIiiliiiii(var10, name, var4);
            }
         }
      } else {
         return null;
      }
   }

   private static String IiIlliIliiIl(String all, List<llllIlllilllIlll> owner, int[] runs, int from) {
      int var4 = all.length();
      int var5 = from;

      while (var5 < var4 && !IIlllIlliIll(all, owner, runs, var5)) {
         var5++;
      }

      int var6 = var5;

      while (var5 < var4 && IIlllIlliIll(all, owner, runs, var5)) {
         var5++;
      }

      return var5 - var6 >= 3 && var5 - var6 <= 16 && !Illlllllilll(all, var6, var5) && Iilllilliill(all, var6, var5) ? all.substring(var6, var5) : null;
   }

   public static IIiIIlIilIiIIlIi IIIIllIIIl(int rgb) {
      if (rgb < 0) {
         return null;
      } else {
         rgb &= 16777215;
         if (rgb == 16733695 || rgb == 11141290) {
            return IIiIIlIilIiIIlIi.Illliiiiil;
         } else if (rgb != 5635925 && rgb != 43520) {
            int var1 = rgb >> 16 & 0xFF;
            int var2 = rgb >> 8 & 0xFF;
            int var3 = rgb & 0xFF;
            int var4 = Math.max(var1, Math.max(var2, var3));
            int var5 = Math.min(var1, Math.min(var2, var3));
            if (var4 < 64) {
               return null;
            } else if ((float)(var4 - var5) / (float)var4 < 0.28F) {
               return null;
            } else {
               float var6 = iIIIlIlIIl(var1, var2, var3, var4, var5);
               if (var6 >= 248.0F && var6 <= 326.0F) {
                  return IIiIIlIilIiIIlIi.Illliiiiil;
               } else {
                  return var6 >= 75.0F && var6 <= 165.0F ? IIiIIlIilIiIIlIi.lllliiiiil : null;
               }
            }
         } else {
            return IIiIIlIilIiIIlIi.lllliiiiil;
         }
      }
   }

   static boolean IIiilIiiiIii(String font) {
      return font != null && font.startsWith(iiIIlIIlIl<"iiIIlIIlIl","jCHHOdDt8kmDm1SC0OgpciS/CzNpmVMaKtR0r8K4gxJ1kA0=">());
   }
}
