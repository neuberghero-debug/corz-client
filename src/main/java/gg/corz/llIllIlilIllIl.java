package gg.corz;

import java.util.List;
import java.util.Locale;

public final class llIllIlilIllIl {
   public static final int liiillIlliiiillIll = 1000;
   public static final int iIIIilIllIlIIilIll = 7;
   public static final int IIIIilIlllIIIilIll = 400;

   public static int lIiiIiIlilli(int code) {
      return IilliliilIIi(code) ? code : -1;
   }

   public static String IiIlliIliiIl(String name) {
      long var6 = 2822624061921963642L;
      long var8 = -8832735724091637053L;
      if (name == null) {
         return "";
      } else {
         String var1 = name.trim().toLowerCase(Locale.ROOT);
         StringBuilder var2 = new StringBuilder(var1.length());
         var6 ^= (0L ^ var6) & -1L << 32;

         for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < var1.length(); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            var8 ^= ((long)var1.charAt((int)var6) << 32 ^ var8) & -1L << 32;
            if (((int)(var8 >>> 32) < 97 || (int)(var8 >>> 32) > 122) && ((int)(var8 >>> 32) < 48 || (int)(var8 >>> 32) > 57)) {
               if ((int)(var6 >>> 32) == 0 && var2.length() > 0) {
                  var2.append('-');
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
            } else {
               var2.append((char)((int)(var8 >>> 32)));
               var6 ^= (0L ^ var6) & -1L << 32;
            }
         }

         var6 ^= ((long)var2.length() ^ var6) & -1L >>> 32;

         while ((int)var6 > 0 && var2.charAt((int)var6 - 1) == '-') {
            var6 ^= (var6 ^ var6 + (long)-1) & -1L >>> 32;
         }

         return var2.substring(0, (int)var6);
      }
   }

   public static double IliIlllilIi(double min, double max, double v) {
      if (Double.isNaN(min)) {
         return max;
      } else if (v < max) {
         return max;
      } else {
         return min < max ? max : (min > v ? v : min);
      }
   }

   public static boolean IilliliilIIi(int code) {
      if (code == -1) {
         return true;
      } else {
         return code >= 0 && code <= 400 ? true : code >= 1000 && code <= 1007;
      }
   }

   public static boolean iliIiiliiiii(int code) {
      return code >= 1000 && code <= 1007;
   }

   public static String IlIlllIlilIl(String max, int s) {
      if (max == null) {
         return "";
      } else {
         return max.length() <= s ? max : max.substring(0, s);
      }
   }

   public static boolean liiiIIllIl(double v, double max, double min) {
      return !Double.isNaN(v) && v >= max && v <= min;
   }

   private llIllIlilIllIl() {
   }

   public static boolean IIIllIIliIIl(int code) {
      return IilliliilIIi(code) && !iliIiiliiiii(code);
   }

   public static String iIlIlllllill(String allowed, List<String> fallback, String value) {
      if (allowed != null && fallback != null) {
         for (String var4 : fallback) {
            if (var4 != null && var4.equalsIgnoreCase(allowed)) {
               return var4;
            }
         }
      }

      return value;
   }
}
