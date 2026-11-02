package gg.corz;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.OptionalLong;
import java.util.Set;

public final class IilIiIlllilIiIll {
   public static boolean iliIiiliiiii(List<Long> read, long shown) {
      if (read == null) {
         return false;
      } else {
         for (Long var4 : read) {
            if (var4 != null && lIiiIiIlilli(var4, shown)) {
               return true;
            }
         }

         return false;
      }
   }

   public static Set<iIiiIIlIliiIIl> IlIlllIlilIl(String text) {
      long var7 = 2608971832854661802L;
      EnumSet var1 = EnumSet.noneOf(iIiiIIlIliiIIl.class);
      String var2 = iIiiIIlIliiIIl.IIIllIIliIIl(text);
      if (var2.isEmpty()) {
         return var1;
      } else {
         iIiiIIlIliiIIl[] var3 = iIiiIIlIliiIIl.values();
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            iIiiIIlIliiIIl var6 = var3[(int)var10];
            if (var2.contains(iIiiIIlIliiIIl.IIIllIIliIIl(var6.liiiIIllIl()))) {
               var1.add(var6);
            }
         }

         return var1;
      }
   }

   public static boolean iIlIlllllill(String line) {
      return iIIiIiilIlIiIiil.lIiiIiIlilli(line)
         .startsWith(Illlllllilll<"Illlllllilll","4Yi+fdKEJA/hEXzr3ocoGZ7xOvcfjfNwWan73HJ0p0gM/R9GeIRjgTcUTRD2sM/j21w=">());
   }

   public static boolean IliIlllilIi(String word, String line) {
      String var2 = iIIiIiilIlIiIiil.lIiiIiIlilli(line);
      String var3 = iIIiIiilIlIiIiil.lIiiIiIlilli(word);
      return !var2.isEmpty() && !var3.isEmpty()
         ? var3.startsWith(var2) || var3.startsWith(Illlllllilll<"Illlllllilll","rapFeoKtG9Ieo2DlPqsXXspgNygg8fR1ij1xCCuWHnTe7RJfBtwe4n1O">() + var2)
         : false;
   }

   private IilIiIlllilIiIll() {
   }

   static long IIlllIlliIll(long coins) {
      long var2 = 1L;

      while (var2 <= 9223372036854775L && coins >= var2 * 1000L) {
         var2 *= 1000L;
      }

      return var2 / 10L;
   }

   public static boolean IIIllIIliIIl(long paid, IiIillIlliIillIl read) {
      return paid > 0L && read != null && paid > Math.max(read.iliIiiliiiii(), read.IIIllIIliIIl());
   }

   public static boolean liiiIIllIl(String line, String word) {
      String var2 = iIIiIiilIlIiIiil.lIiiIiIlilli(word);
      String var3 = iIIiIiilIlIiIiil.lIiiIiIlilli(line);
      return !var2.isEmpty() && !var3.isEmpty()
         ? var3.startsWith(var2)
            || var3.startsWith(Illlllllilll<"Illlllllilll","teHFPyzYQ/Aue+qScAIQDm/619twZrL/0Yj1Pv/O+bs=">() + var2)
            || var3.startsWith(Illlllllilll<"Illlllllilll","oSaRZlP7JEWYmpiq4y7hMp6zwkRaFjvTtp+Eo7dOTjNRheY=">() + var2)
         : false;
   }

   public static boolean IiIlliIliiIl(Set<String> before, Set<String> now) {
      long var5 = -798257118920572821L;
      if (before != null && !before.isEmpty() && now != null) {
         var5 ^= (0L ^ var5) & -1L << 32;

         for (String var4 : now) {
            if (before.contains(var4)) {
               var5 += 4294967296L;
            }
         }

         return (int)(var5 >>> 32) * 2 >= before.size();
      } else {
         return false;
      }
   }

   public static boolean lIiiIiIlilli(long read, long shown) {
      return read > 0L && shown > 0L ? Math.abs(read - shown) <= Math.max(IIlllIlliIll(read), IIlllIlliIll(shown)) : false;
   }

   public static List<Long> IilliliilIIi(String text, String priceKeyword) {
      long var8 = -6136324155416879379L;
      ArrayList var2 = new ArrayList();
      String var3 = iIIiIiilIlIiIiil.lIiiIiIlilli(priceKeyword);
      String var4 = iIIiIiilIlIiIiil.lIiiIiIlilli(text);
      if (!var3.isEmpty() && !var4.isEmpty()) {
         var8 ^= ((long)var4.indexOf(var3) << 32 ^ var8) & -1L << 32;

         while ((int)(var8 >>> 32) >= 0) {
            var8 ^= ((long)var4.indexOf(var3, (int)(var8 >>> 32) + var3.length()) ^ var8) & -1L >>> 32;
            OptionalLong var7 = iIIiiilIlIiiil.liiiIIllIl(var4.substring((int)(var8 >>> 32) + var3.length(), (int)var8 < 0 ? var4.length() : (int)var8));
            if (var7.isPresent() && var7.getAsLong() > 0L) {
               var2.add(var7.getAsLong());
            }

            var8 ^= ((long)((int)var8) << 32 ^ var8) & -1L << 32;
         }

         return var2;
      } else {
         return var2;
      }
   }
}
