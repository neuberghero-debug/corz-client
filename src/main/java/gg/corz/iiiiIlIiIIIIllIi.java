package gg.corz;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class iiiiIlIiIIIIllIi {
   private final int[] IiilIlIIIi;
   public static final iiiiIlIiIIIIllIi ililIlIIIi = new iiiiIlIiIIIIllIi(new LinkedHashMap<>());
   private final String[] liilIlIIIi;
   public static final int IlilIlIIIi = 3;
   public static final int llilIlIIIi = 16;
   private final String[] iiilIlIIIi;

   public static boolean IliIlllilIi(String name) {
      long var3 = -1536944431981902084L;
      if (name == null) {
         return false;
      } else {
         var3 ^= ((long)name.length() << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) >= 3 && (int)(var3 >>> 32) <= 16) {
            for (long var6 = var3 ^ (0L ^ var3) & -1L >>> 32; (int)var6 < (int)(var6 >>> 32); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
               if (!llilillililill.IliIlllilIi(name.charAt((int)var6))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public boolean liiiIIllIl() {
      return this.IiilIlIIIi.length == 0;
   }

   public String lIiiIiIlilli(String text) {
      long var10 = 7383238012896058740L;
      long var12 = 3598702843097241350L;
      long var14 = -7422027742490264855L;
      if (text != null && this.IiilIlIIIi.length != 0) {
         var10 ^= ((long)text.length() << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) < 3) {
            return text;
         } else {
            StringBuilder var3 = null;
            var10 ^= (0L ^ var10) & -1L >>> 32;
            var12 ^= (0L ^ var12) & -1L << 32;

            while ((int)(var12 >>> 32) < (int)(var10 >>> 32)) {
               var12 ^= ((long)text.charAt((int)(var12 >>> 32)) ^ var12) & -1L >>> 32;
               if ((int)var12 == 167) {
                  var12 += 8589934592L;
               } else if (!llilillililill.IliIlllilIi((char)((int)var12))) {
                  var12 += 4294967296L;
               } else {
                  var14 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var14) & -1L << 32;

                  while ((int)(var12 >>> 32) < (int)(var10 >>> 32) && llilillililill.IliIlllilIi(text.charAt((int)(var12 >>> 32)))) {
                     var12 += 4294967296L;
                  }

                  var14 ^= ((long)((int)(var12 >>> 32) - (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
                  if ((int)var14 >= 3 && (int)var14 <= 16) {
                     String var9 = this.iliIiiliiiii(text, (int)(var14 >>> 32), (int)var14);
                     if (var9 != null) {
                        if (var3 == null) {
                           var3 = new StringBuilder((int)(var10 >>> 32) + 16);
                        }

                        var3.append(text, (int)var10, (int)(var14 >>> 32)).append(var9);
                        var10 ^= ((long)((int)(var12 >>> 32)) ^ var10) & -1L >>> 32;
                     }
                  }
               }
            }

            return var3 == null ? text : var3.append(text, (int)var10, (int)(var10 >>> 32)).toString();
         }
      } else {
         return text;
      }
   }

   private iiiiIlIiIIIIllIi(LinkedHashMap<String, String> map) {
      long var9 = -9220424229949407491L;
      long var11 = -416398687938943210L;
      super();
      var9 ^= ((long)map.size() << 32 ^ var9) & -1L << 32;
      long[] var3 = new long[(int)(var9 >>> 32)];
      String[] var4 = new String[(int)(var9 >>> 32)];
      String[] var5 = new String[(int)(var9 >>> 32)];
      var9 ^= (0L ^ var9) & -1L >>> 32;

      for (Entry var8 : map.entrySet()) {
         var4[(int)var9] = (String)var8.getKey();
         var5[(int)var9] = (String)var8.getValue();
         var3[(int)var9] = (long)var4[(int)var9].hashCode() << 32 | (long)((int)var9) & 4294967295L;
         var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
      }

      Arrays.sort(var3);
      this.IiilIlIIIi = new int[(int)(var9 >>> 32)];
      this.liilIlIIIi = new String[(int)(var9 >>> 32)];
      this.iiilIlIIIi = new String[(int)(var9 >>> 32)];
      var11 ^= (0L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < (int)(var9 >>> 32)) {
         var11 ^= ((long)((int)var3[(int)(var11 >>> 32)]) ^ var11) & -1L >>> 32;
         this.IiilIlIIIi[(int)(var11 >>> 32)] = (int)(var3[(int)(var11 >>> 32)] >> 32);
         this.liilIlIIIi[(int)(var11 >>> 32)] = var4[(int)var11];
         this.iiilIlIIIi[(int)(var11 >>> 32)] = var5[(int)var11];
         var11 += 4294967296L;
      }
   }

   public int iIlIlllllill() {
      return this.IiilIlIIIi.length;
   }

   private String iliIiiliiiii(String len, int from, int text) {
      long var8 = 1864333791923493768L;
      long var10 = 4899722196087378204L;
      var8 ^= (0L ^ var8) & -1L << 32;
      var8 ^= ((long)from ^ var8) & -1L >>> 32;
      var10 ^= ((long)(from + text) << 32 ^ var10) & -1L << 32;

      while ((int)var8 < (int)(var10 >>> 32)) {
         var10 ^= ((long)len.charAt((int)var8) ^ var10) & -1L >>> 32;
         var8 ^= ((long)(31 * (int)(var8 >>> 32) + ((int)var10 >= 65 && (int)var10 <= 90 ? (char)((int)var10 + 32) : (int)var10)) << 32 ^ var8) & -1L << 32;
         var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
      }

      var8 ^= ((long)Arrays.binarySearch(this.IiilIlIIIi, (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
      if ((int)var8 < 0) {
         return null;
      } else {
         while ((int)var8 > 0 && this.IiilIlIIIi[(int)var8 - 1] == (int)(var8 >>> 32)) {
            var8 ^= (var8 ^ var8 + (long)-1) & -1L >>> 32;
         }

         while ((int)var8 < this.IiilIlIIIi.length && this.IiilIlIIIi[(int)var8] == (int)(var8 >>> 32)) {
            String var6 = this.liilIlIIIi[(int)var8];
            if (var6.length() == text && len.regionMatches(true, from, var6, 0, text)) {
               return this.iiilIlIIIi[(int)var8];
            }

            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         }

         return null;
      }
   }

   public String IilliliilIIi(String name) {
      return this.IiilIlIIIi.length != 0 && IliIlllilIi(name) ? this.iliIiiliiiii(name, 0, name.length()) : null;
   }
}
