package gg.corz;

import java.util.Locale;

public final class llilillililill {
   public static final String iililIlIiIIiilIlIi = "You";
   private static volatile iiiIilIiIIIlilIi lIiilIlIiiIiilIlIi;

   private static iiiIilIiIIIlilIi IilliliilIIi(String self) {
      iiiIilIiIIIlilIi var1 = lIiilIlIiiIiilIlIi;
      if (var1 != null && var1.IllllllIIi.equals(self)) {
         return var1;
      } else {
         var1 = new iiiIilIiIIIlilIi(self, self.toLowerCase(Locale.ROOT), lIiiIiIlilli(self));
         lIiilIlIiiIiilIlIi = var1;
         return var1;
      }
   }

   public static boolean liiiIIllIl(String self, String candidate) {
      return self != null && candidate != null && !candidate.isEmpty() && self.equalsIgnoreCase(candidate);
   }

   public static String IiIlliIliiIl(String self, String alias, String text) {
      long var16 = -8273150562105901032L;
      long var12 = -6861574371871645884L;
      long var14 = -3110416597954870011L;
      if (self != null && alias != null && !alias.isEmpty() && text != null) {
         var12 ^= ((long)alias.length() << 32 ^ var12) & -1L << 32;
         if (self.length() < (int)(var12 >>> 32)) {
            return self;
         } else {
            iiiIilIiIIIlilIi var4 = IilliliilIIi(alias);
            if (var4.illllllIIi && lIiiIiIlilli(self)) {
               return IlIlllIlilIl(self, alias, text);
            } else {
               String var5 = self.toLowerCase(Locale.ROOT);
               String var6 = var4.lllllllIIi;
               var12 ^= ((long)var5.indexOf(var6) ^ var12) & -1L >>> 32;
               if ((int)var12 < 0) {
                  return self;
               } else {
                  StringBuilder var8 = null;

                  for (var14 ^= (0L ^ var14) & -1L << 32;
                     (int)var12 >= 0;
                     var12 ^= ((long)var5.indexOf(var6, (int)var12 + (int)(var12 >>> 32)) ^ var12) & -1L >>> 32
                  ) {
                     var14 ^= ((long)((int)var12 != 0 && IliIlllilIi(self.charAt((int)var12 - 1)) ? 0 : 1) ^ var14) & -1L >>> 32;
                     var16 ^= (
                           (long)((int)var12 + (int)(var12 >>> 32) < self.length() && IliIlllilIi(self.charAt((int)var12 + (int)(var12 >>> 32))) ? 0 : 1) << 32
                              ^ var16
                        )
                        & -1L << 32;
                     if ((int)var14 != 0 && (int)(var16 >>> 32) != 0) {
                        if (var8 == null) {
                           var8 = new StringBuilder(self.length());
                        }

                        var8.append(self, (int)(var14 >>> 32), (int)var12).append(text);
                        var14 ^= ((long)((int)var12 + (int)(var12 >>> 32)) << 32 ^ var14) & -1L << 32;
                     }
                  }

                  return var8 == null ? self : var8.append(self, (int)(var14 >>> 32), self.length()).toString();
               }
            }
         }
      } else {
         return self;
      }
   }

   private static int IIIllIIliIIl(String text, String self, int from) {
      long var8 = 6326897930389691138L;
      long var10 = 5055318903022302065L;
      long var12 = 6760839765665646117L;
      var8 ^= ((long)self.length() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(text.length() - (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
      var10 ^= ((long)iliIiiliiiii(self.charAt(0)) << 32 ^ var10) & -1L << 32;

      for (long var17 = var10 ^ ((long)from ^ var10) & -1L >>> 32; (int)var17 <= (int)var8; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         if (iliIiiliiiii(text.charAt((int)var17)) == (int)(var17 >>> 32)) {
            var12 ^= (4294967296L ^ var12) & -1L << 32;

            while (
               (int)(var12 >>> 32) < (int)(var8 >>> 32)
                  && iliIiiliiiii(text.charAt((int)var17 + (int)(var12 >>> 32))) == iliIiiliiiii(self.charAt((int)(var12 >>> 32)))
            ) {
               var12 += 4294967296L;
            }

            if ((int)(var12 >>> 32) == (int)(var8 >>> 32)) {
               return (int)var17;
            }
         }
      }

      return -1;
   }

   private static boolean lIiiIiIlilli(String s) {
      long var3 = 8213013461019678117L;
      var3 ^= (0L ^ var3) & -1L << 32;

      for (long var6 = var3 ^ ((long)s.length() ^ var3) & -1L >>> 32; (int)(var6 >>> 32) < (int)var6; var6 += 4294967296L) {
         if (s.charAt((int)(var6 >>> 32)) >= 128) {
            return false;
         }
      }

      return true;
   }

   private llilillililill() {
   }

   public static boolean IliIlllilIi(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '_';
   }

   private static String IlIlllIlilIl(String alias, String self, String text) {
      long var9 = -4745479108691222416L;
      long var11 = -7301617906242394143L;
      long var13 = -4536213183382833505L;
      var9 ^= ((long)self.length() << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)IIIllIIliIIl(alias, self, 0) ^ var9) & -1L >>> 32;
      if ((int)var9 < 0) {
         return alias;
      } else {
         StringBuilder var5 = null;

         for (var11 ^= (0L ^ var11) & -1L << 32; (int)var9 >= 0; var9 ^= ((long)IIIllIIliIIl(alias, self, (int)var9 + (int)(var9 >>> 32)) ^ var9) & -1L >>> 32) {
            var11 ^= ((long)((int)var9 != 0 && IliIlllilIi(alias.charAt((int)var9 - 1)) ? 0 : 1) ^ var11) & -1L >>> 32;
            var13 ^= (
                  (long)((int)var9 + (int)(var9 >>> 32) < alias.length() && IliIlllilIi(alias.charAt((int)var9 + (int)(var9 >>> 32))) ? 0 : 1) << 32 ^ var13
               )
               & -1L << 32;
            if ((int)var11 != 0 && (int)(var13 >>> 32) != 0) {
               if (var5 == null) {
                  var5 = new StringBuilder(alias.length());
               }

               var5.append(alias, (int)(var11 >>> 32), (int)var9).append(text);
               var11 ^= ((long)((int)var9 + (int)(var9 >>> 32)) << 32 ^ var11) & -1L << 32;
            }
         }

         return var5 == null ? alias : var5.append(alias, (int)(var11 >>> 32), alias.length()).toString();
      }
   }

   public static String iIlIlllllill(String playerName, String alias, String self) {
      return liiiIIllIl(playerName, alias) ? self : playerName;
   }

   private static char iliIiiliiiii(char c) {
      return c >= 'A' && c <= 'Z' ? (char)(c + ' ') : c;
   }
}
