package gg.corz;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public final class llIIilIiilIIilIi {
   private static final char[] IilliIlIIi = new char[]{'K', 'M', 'B', 'T'};
   private static final long[] illliIlIIi = new long[]{1000L, 1000000L, 1000000000L, 1000000000000L};
   private static final long[] lilliIlIIi = new long[]{1L, 10L, 100L, 1000L};
   public static final String lllliIlIIi = "\u2014";

   public static boolean iliIiiliiiii(long coins) {
      return coins >= 1000L;
   }

   private llIIilIiilIIilIi() {
   }

   private static void IiIlliIliiIl(StringBuilder b, long digits, int frac) {
      long var8 = -8881985736175321426L;
      if (frac != 0 && digits != 0L) {
         String var4 = Long.toString(digits);
         var8 ^= ((long)frac << 32 ^ var8) & -1L << 32;
         StringBuilder var6 = new StringBuilder(frac);

         for (var8 ^= ((long)var4.length() ^ var8) & -1L >>> 32; (int)var8 < frac; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            var6.append('0');
         }

         var6.append(var4);

         while ((int)(var8 >>> 32) > 0 && var6.charAt((int)(var8 >>> 32) - 1) == '0') {
            var8 += -4294967296L;
         }

         b.append('.').append(var6, 0, (int)(var8 >>> 32));
      }
   }

   public static String IIIllIIliIIl(long delta) {
      if (delta == 0L) {
         return "";
      } else {
         long var2 = delta == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(delta);
         return (
               delta > 0L
                  ? Illlllllilll<"Illlllllilll","/fn+TL2JivF7XON2S5qS6qB+Ye55VeXdqPp3Zd4=">()
                  : Illlllllilll<"Illlllllilll","8d2ZQIluLzB4/APE2AHbX+ER2LeByeVMUA3xroo=">()
            )
            + liiiIIllIl(var2);
      }
   }

   private static void IlIlllIlilIl(StringBuilder value, long b) {
      long var6 = 6069000139486908374L;
      String var3 = Long.toString(b);
      var6 ^= ((long)var3.length() << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         if ((int)var9 > 0 && ((int)(var9 >>> 32) - (int)var9) % 3 == 0) {
            value.append(',');
         }

         value.append(var3.charAt((int)var9));
      }
   }

   public static String lIiiIiIlilli(long value) {
      StringBuilder var2 = new StringBuilder(28);
      if (value < 0L) {
         var2.append('-');
         if (value == Long.MIN_VALUE) {
            return var2.append(Illlllllilll<"Illlllllilll","pi7O9MkCKJ8CEZDLFPUQTsC45shherIlC63v/ME4f8fk7l4/f4Xj/m/pCjtC9TMmUgd4cCA=">()).toString();
         }

         value = -value;
      }

      IlIlllIlilIl(var2, value);
      return var2.toString();
   }

   public static String IilliliilIIi(long coins) {
      if (coins < 0L) {
         return Illlllllilll<"Illlllllilll","ztVcxCNl+IkPH5kbs3LHB1+D+BMZiKlDUKvukEQZyw==">();
      } else {
         StringBuilder var2 = new StringBuilder(28).append('$');
         IlIlllIlilIl(var2, coins);
         return var2.toString();
      }
   }

   public static String iIlIlllllill(long coins, int decimals) {
      long var17 = -1154773547544790536L;
      long var15 = -6653949486906230469L;
      if (coins < 0L) {
         return Illlllllilll<"Illlllllilll","ztVcxCNl+IkPH5kbs3LHB1+D+BMZiKlDUKvukEQZyw==">();
      } else if (coins < 1000L) {
         return Illlllllilll<"Illlllllilll","NZ+QL+m+gv3IUEbw7DIA8CwFI+Meor+a1YMulQU=">() + coins;
      } else {
         var15 ^= ((long)Math.max(0, Math.min(lilliIlIIi.length - 1, decimals)) << 32 ^ var15) & -1L << 32;
         long var4 = lilliIlIIi[(int)(var15 >>> 32)];
         var15 ^= ((long)(illliIlIIi.length - 1) ^ var15) & -1L >>> 32;

         for (long var21 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var21 >>> 32) <= (int)var15; var21 += 4294967296L) {
            long var8 = illliIlIIi[(int)(var21 >>> 32)];
            long var10 = coins / var8;
            long var12 = (coins % var8 * var4 + var8 / 2L) / var8;
            if (var12 >= var4) {
               var10++;
               var12 -= var4;
            }

            if (var10 < 1000L || (int)(var21 >>> 32) >= (int)var15) {
               StringBuilder var14 = new StringBuilder(20).append('$');
               if ((int)(var21 >>> 32) == (int)var15) {
                  IlIlllIlilIl(var14, var10);
               } else {
                  var14.append(var10);
               }

               IiIlliIliiIl(var14, var12, (int)(var15 >>> 32));
               return var14.append(IilliIlIIi[(int)(var21 >>> 32)]).toString();
            }
         }

         return IilliliilIIi(coins);
      }
   }

   public static <K> iliIIIiIiiIIIi<K> IliIlllilIi(Map<K, Integer> unitPrice, Map<K, Long> need) {
      long var13 = -6836084207309166536L;
      long var15 = 3255320165424940030L;
      ArrayList var2 = new ArrayList();
      long var3 = 0L;
      var13 ^= (0L ^ var13) & -1L << 32;
      var13 ^= (0L ^ var13) & -1L >>> 32;

      for (Entry var8 : unitPrice.entrySet()) {
         var15 ^= ((long)(var8.getValue() == null ? 0 : Math.max(0, (Integer)var8.getValue())) << 32 ^ var15) & -1L << 32;
         if ((int)(var15 >>> 32) != 0) {
            Long var10 = need == null ? null : (Long)need.get(var8.getKey());
            if (var10 != null && var10 >= 0L) {
               long var11 = var10 * (long)((int)(var15 >>> 32));
               var2.add(new IiIlliilliIlliil<>(var8.getKey(), (int)(var15 >>> 32), var10, var11, true));
               var3 += var11;
               var13 += 4294967296L;
            } else {
               var2.add(new IiIlliilliIlliil<>(var8.getKey(), (int)(var15 >>> 32), -1L, 0L, false));
               var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32;
            }
         }
      }

      var2.sort((a, b) -> Long.compare(b.IliIIiilil, a.IliIIiilil));
      return new iliIIIiIiiIIIi<>(var2, var3, (int)(var13 >>> 32), (int)var13);
   }

   public static String liiiIIllIl(long coins) {
      return iIlIlllllill(coins, 1);
   }
}
