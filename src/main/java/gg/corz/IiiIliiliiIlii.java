package gg.corz;

public final class IiiIliiliiIlii {
   public static boolean IliIlllilIi(int cp) {
      return cp >= 32 && cp <= 126 || cp >= 160 && cp <= 254 || cp == 10;
   }

   private IiiIliiliiIlii() {
   }

   public static String liiiIIllIl(String s) {
      long var8 = -7732361535915032748L;
      long var10 = -1532819173053749653L;
      long var12 = 8348182472978973261L;
      long var14 = -9007510241917290223L;
      if (s != null && !s.isEmpty()) {
         var8 ^= ((long)s.length() << 32 ^ var8) & -1L << 32;
         var8 ^= ~var8 & -1L >>> 32;

         for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)(var8 >>> 32); var10 += 4294967296L) {
            if (!IliIlllilIi(s.charAt((int)(var10 >>> 32)))) {
               var8 ^= ((long)((int)(var10 >>> 32)) ^ var8) & -1L >>> 32;
               break;
            }
         }

         if ((int)var8 < 0) {
            return s;
         } else {
            StringBuilder var3 = new StringBuilder((int)(var8 >>> 32) + 8);
            var3.append(s, 0, (int)var8);

            for (long var19 = var10 ^ ((long)((int)var8) ^ var10) & -1L >>> 32;
               (int)var19 < (int)(var8 >>> 32);
               var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32
            ) {
               var12 ^= ((long)s.charAt((int)var19) << 32 ^ var12) & -1L << 32;
               if (IliIlllilIi((int)(var12 >>> 32))) {
                  var3.append((char)((int)(var12 >>> 32)));
               } else {
                  switch ((int)(var12 >>> 32)) {
                     case 160:
                        var3.append(' ');
                        break;
                     case 8211:
                     case 8212:
                        var12 ^= ((long)(var3.length() > 0 && var3.charAt(var3.length() - 1) == ' ' ? 1 : 0) ^ var12) & -1L >>> 32;
                        var14 ^= ((long)((int)var19 + 1 < (int)(var8 >>> 32) && s.charAt((int)var19 + 1) == ' ' ? 1 : 0) << 32 ^ var14) & -1L << 32;
                        if ((int)var12 == 0) {
                           var3.append(' ');
                        }

                        var3.append('-');
                        if ((int)(var14 >>> 32) == 0) {
                           var3.append(' ');
                        }
                        break;
                     case 8216:
                     case 8217:
                        var3.append('\'');
                        break;
                     case 8220:
                     case 8221:
                        var3.append('"');
                        break;
                     case 8226:
                        var3.append('*');
                        break;
                     case 8230:
                        var3.append(IilliliilIIi<"IilliliilIIi","vn5m6pfgAAX8Ij5TCOtaSq0JdAkETnLu2Ip6VSbVXA==">());
                        break;
                     case 8592:
                        var3.append(IilliliilIIi<"IilliliilIIi","AcVZ77xjG1qeQqygw77g+RTXrc4c1g2wNYDqqreH">());
                        break;
                     case 8594:
                        var3.append(IilliliilIIi<"IilliliilIIi","uQ2bdS0aVG/an7uKTaY75eWD38kMV4S9qBnivgYi">());
                        break;
                     case 10003:
                     case 10004:
                        var3.append('+');
                        break;
                     case 10007:
                     case 10008:
                        var3.append('x');
                        break;
                     default:
                        var3.append('?');
                  }
               }
            }

            return var3.toString();
         }
      } else {
         return s;
      }
   }

   public static boolean iIlIlllllill(String s) {
      long var2 = -7031237033948451425L;
      if (s == null) {
         return true;
      } else {
         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < s.length(); var4 += 4294967296L) {
            if (!IliIlllilIi(s.charAt((int)(var4 >>> 32)))) {
               return false;
            }
         }

         return true;
      }
   }
}
