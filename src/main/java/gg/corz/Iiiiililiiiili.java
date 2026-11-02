package gg.corz;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;

public final class Iiiiililiiiili {
   private static final int[] IIilIllIIl = new int[]{18, 15, 12, 9, 6, 3};
   private static final String[] iillIllIIl = new String[]{
      Illlllllilll<"Illlllllilll","zOjBWYseTiYU0tjZ0+ha7tdm/dsgLnTTxqjjLJhu">(),
      Illlllllilll<"Illlllllilll","IfgzO5/9IaQmgBC/XM8Gga+/+bvQE6xzeObgroc=">(),
      Illlllllilll<"Illlllllilll","YO/gUdDeJqC9P4HX29e7s50gJeB3epluCGUrcEM=">(),
      Illlllllilll<"Illlllllilll","N1+0A/RSBR5vMzS4zD+giMZoaqJbzrR00cgkfLg=">(),
      Illlllllilll<"Illlllllilll","RfmTJaLszmDo+Q6HL2oK0hRpnfflgM8lQRH2cyY=">(),
      Illlllllilll<"Illlllllilll","U3XOHlhQg0YSsOnFCMpmSUP77TfikEMDjoNsb5c=">()
   };
   private static final Pattern lIilIllIIl = Pattern.compile(
      Illlllllilll<"Illlllllilll","b8JOsQfE78wtBIlIUxzu7kVbFzBZtAIblhhm/fIbdBxTgAxV8rnfA9/Q5a72ovXTde0GYLASGNH5gFrQOvkBPXUaZC6flQ==">()
   );
   private static final String[] lillIllIIl = new String[]{
      Illlllllilll<"Illlllllilll","DeEiW4E9Sr93UQcJBA0yuWSdNcUSvIW7VgJ+Z2SZ">(),
      Illlllllilll<"Illlllllilll","G+3APNWCJVZuBUfPWGms+TYY1Mtq28Bvd/wJeYI=">(),
      Illlllllilll<"Illlllllilll","ikQC6aZMNxlU9t1qGdIazQ4EU/hHR2Ox/NeqJiE=">(),
      Illlllllilll<"Illlllllilll","qSSIAC2vmVps5WG9l5ws2UeWUcAtznTB8XtXFME=">(),
      Illlllllilll<"Illlllllilll","N2RgeOGlkA3CgTsk5/Y5a2PH46bM7h/kPqObDts=">(),
      Illlllllilll<"Illlllllilll","U3XOHlhQg0YSsOnFCMpmSUP77TfikEMDjoNsb5c=">()
   };

   public static int[] iliIiiliiiii(String text) {
      long var2 = 7364330306376451272L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < text.length(); var4 += 4294967296L) {
         if (Character.isDigit(text.charAt((int)(var4 >>> 32)))) {
            return new int[]{(int)(var4 >>> 32), text.length()};
         }
      }

      return null;
   }

   public static String liiiIIllIl(double n) {
      long var9 = 4360591012706909549L;
      double var2 = Math.abs(n);

      for (long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < IIilIllIIl.length; var11 += 4294967296L) {
         double var5 = Math.pow(10.0, (double)IIilIllIIl[(int)(var11 >>> 32)]);
         if (var2 >= var5) {
            double var7 = (double)Math.round(n / var5 * 10.0) / 10.0;
            return IilliliilIIi(var7) + iillIllIIl[(int)(var11 >>> 32)];
         }
      }

      return Long.toString(Math.round(n));
   }

   private Iiiiililiiiili() {
   }

   private static class_2561 IiIlliIliiIl(class_2561 original, String replacement, boolean toEnd) {
      long var19 = -5488335903248847397L;
      long var21 = -2231619528538293082L;
      long var23 = -30545346113077917L;
      long var25 = 8882912939701400014L;
      long var27 = 268365499494404236L;
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      original.method_27658((style, str) -> {
         var3.add(style);
         var4.add(str);
         return Optional.empty();
      }, class_2583.field_24360);
      StringBuilder var5 = new StringBuilder();

      for (String var7 : var4) {
         var5.append(var7);
      }

      int[] var29 = toEnd ? iliIiiliiiii(var5.toString()) : lIiiIiIlilli(var5.toString());
      if (var29 == null) {
         return original;
      } else {
         var19 ^= ((long)var29[0] << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)var29[1] ^ var19) & -1L >>> 32;
         class_5250 var9 = class_2561.method_43473();
         var21 ^= (0L ^ var21) & -1L << 32;
         var21 ^= (0L ^ var21) & -1L >>> 32;
         var23 ^= (0L ^ var23) & -1L << 32;

         while ((int)(var23 >>> 32) < var4.size()) {
            String var13 = (String)var4.get((int)(var23 >>> 32));
            class_2583 var14 = (class_2583)var3.get((int)(var23 >>> 32));
            var23 ^= ((long)((int)(var21 >>> 32)) ^ var23) & -1L >>> 32;
            var25 ^= ((long)((int)(var21 >>> 32) + var13.length()) << 32 ^ var25) & -1L << 32;
            var25 ^= ((long)Math.min((int)(var25 >>> 32), (int)(var19 >>> 32)) ^ var25) & -1L >>> 32;
            if ((int)var25 > (int)var23) {
               var9.method_10852(class_2561.method_43470(var13.substring(0, (int)var25 - (int)var23)).method_10862(var14));
            }

            if ((int)var21 == 0 && (int)(var19 >>> 32) >= (int)var23 && (int)(var19 >>> 32) < (int)(var25 >>> 32)) {
               var9.method_10852(class_2561.method_43470(replacement).method_10862(var14));
               var21 ^= (1L ^ var21) & -1L >>> 32;
            }

            var27 ^= ((long)Math.max((int)var23, (int)var19) << 32 ^ var27) & -1L << 32;
            if ((int)(var25 >>> 32) > (int)(var27 >>> 32)) {
               var9.method_10852(class_2561.method_43470(var13.substring((int)(var27 >>> 32) - (int)var23)).method_10862(var14));
            }

            var21 ^= ((long)((int)(var25 >>> 32)) << 32 ^ var21) & -1L << 32;
            var23 += 4294967296L;
         }

         if ((int)var21 == 0) {
            var9.method_10852(class_2561.method_43470(replacement));
         }

         return var9;
      }
   }

   private static String IilliliilIIi(double v) {
      return v == Math.floor(v) && !Double.isInfinite(v) ? Long.toString((long)v) : String.valueOf(v);
   }

   public static String iIlIlllllill(double n) {
      return Long.toString((long)Math.floor(n));
   }

   public static class_2561 IlIlllIlilIl(class_2561 replacement, String original) {
      return IiIlliIliiIl(replacement, original, true);
   }

   public static double IliIlllilIi(String raw) {
      long var5 = 1737279213751104684L;
      if (raw == null) {
         return Double.NaN;
      } else {
         String var1 = raw.trim().toLowerCase(Locale.ROOT).replaceAll(Illlllllilll<"Illlllllilll","4qC4HznzsxIVtO9JcnHb9Dm9a9AdXqaNcQVwkUeIAJywUQ==">(), "");

         while (!var1.isEmpty() && (var1.charAt(0) == '$' || var1.charAt(0) == 8364 || var1.charAt(0) == 163)) {
            var1 = var1.substring(1);
         }

         if (var1.isEmpty()) {
            return Double.NaN;
         } else {
            for (long var9 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var9 >>> 32) < lillIllIIl.length; var9 += 4294967296L) {
               if (var1.endsWith(lillIllIIl[(int)(var9 >>> 32)]) && var1.length() > lillIllIIl[(int)(var9 >>> 32)].length()) {
                  String var3 = var1.substring(0, var1.length() - lillIllIIl[(int)(var9 >>> 32)].length());

                  try {
                     return Double.parseDouble(var3) * Math.pow(10.0, (double)IIilIllIIl[(int)(var9 >>> 32)]);
                  } catch (NumberFormatException var7) {
                     return Double.NaN;
                  }
               }
            }

            try {
               return Double.parseDouble(var1);
            } catch (NumberFormatException var8) {
               return Double.NaN;
            }
         }
      }
   }

   public static int[] lIiiIiIlilli(String text) {
      long var4 = 5346937217151865629L;
      Matcher var1 = lIilIllIIl.matcher(text);
      var4 ^= (-4294967296L ^ var4) & -1L << 32;
      var4 ^= ~var4 & -1L >>> 32;

      while (var1.find()) {
         var4 ^= ((long)var1.start() << 32 ^ var4) & -1L << 32;
         var4 ^= ((long)var1.end() ^ var4) & -1L >>> 32;
      }

      return (int)(var4 >>> 32) < 0 ? null : new int[]{(int)(var4 >>> 32), (int)var4};
   }

   public static class_2561 IIIllIIliIIl(class_2561 replacement, String original) {
      return IiIlliIliiIl(replacement, original, false);
   }
}
