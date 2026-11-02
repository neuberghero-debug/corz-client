package gg.corz;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_746;
import net.minecraft.class_2568.class_10613;

public class IlIllllllIllll extends ilIllIiIll {
   static final Pattern lilliliiliilliliil = Pattern.compile(
      IliIlllilIi<"IliIlllilIi","3BinwIYQaXeicTy9P4mhUk6elXwHtu6DkOUNf72Uk7A4K1INHXDl8I6iVJJsunuil10dkyEXUZaosy/IoMYBaPnooht1xOdqBgzLzvkSTMAD/nv2EFVH5fmg+b4emxOXD8QHok6QMEIRFZPnFsHOopgZCX5RgtuYnEp/N510EV4qRUdbKY67BE0x4etikiiBco/hUUXEFQarcmhRQQITXLDvJC/Oe11qHYuEV5qgQb3Mxjw9jWWN2tSutnMHiu/RzpdG62j6">()
   );
   static final Pattern llililiililililiil = Pattern.compile(
      IliIlllilIi<"IliIlllilIi","od9ygqCIBxIvGHq2Fcmgf1Ky7MGeLvn3iqZYd/a9EAe2tGd5eM3LKrQ7Y6n0gAQwm9X9rSw6YZU3rgg3QykhW2dUf+LQ/jF3TgrZuelz9xztkoJZ4zxSgMGtMYzjXb7XJP7G/itCGZB193+hBMwhjk3SnBaLb9JuUt/lWpECw/jChvhya9wKUURtpo8yl9SywbHC3sABALlynJPFgLm1/wDPhFsfOD45">()
   );
   private int liIiiliiliiIiiliil;
   static final int llIliliililIliliil = 24000;
   private static final String illliliilIilliliil = "(?![\\p{L}\\p{N}\\p{Sc}_%]|\\.\\d)";
   private static final String Illliliillllliliil = "(?:(?<=\u00a7[0-9a-fk-orA-FK-OR])|(?<![\\p{L}\\p{N}\\p{Sc}_.\\-]))";
   private static final String lIlliliiliIlliliil = "(-?\\d{1,8}(?:\\.\\d+)?)";
   static final Pattern iIililiilIlililiil = Pattern.compile(
      IliIlllilIi<"IliIlllilIi","qwlGhNFsgACc13dhH12pdlmttcJalZVxhJ9qkpsMvhgfXUGIpVnYf3UZD9F1WQU4VjGMaCHMkqNv4VsMpct4eYJmed85n4efTLNWC+Zd9RcX1NJrHbbtd1UoZTBDNYvX4m61Mg7M9e2TFdMUXGcwilPCeR7f5RgsDB290JwAbIoKCn+P5G2tJIgg78X+maixH5QdyjNcP7+ayYHaeEh6Ss/fszAkQ050wDv92TNYm9rLTPQM1Oe0OZx8VNnJVmv2w6AP+jiLGaUclg6abz3G2mne2QjJ">()
   );
   private double iIliiliilIlliiliil;
   private class_634 IlIiiliilllIiiliil;
   private int ilIiiliilIiIiiliil;
   private double IIliiliillIliiliil;
   private static IlIllllllIllll iiililiilIIIiiliil;
   static final int IiIliliilliIliliil = 1024;
   static final double iiIliliilIIlliliil = 256.0;
   private final iiIiiilIIliiil lIIiiliiliIIiiliil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","6G1Qpor2EtAB7vyNhULuPYtpJet8fcmLrU0XL2HEPhgO96Q+h78=">(),
      IliIlllilIi<"IliIlllilIi","/Y4CNRxBYBukScfMWaQWB02T8Jfomemom5CAuGOjXeiMTPftUwnGVQpD8xrndVtmZARWQFxMLjn2w5n/FG8j+cnswJsL7g==">(),
      true
   );
   private static final String IIililiillIililiil = "\u00a7[0-9a-fk-orA-FK-OR]";
   private static final SecureRandom Iiililiilliililiil = new SecureRandom();

   static String IiIilliIil(String s, int dx, int dz) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      iiIilIIlil(s, dx, dz, var3, var4);
      if (var3.isEmpty()) {
         return s;
      } else {
         StringBuilder var5 = new StringBuilder(s.length() + 8);
         int var6 = 0;

         for (int var7 = 0; var7 < var3.size(); var7++) {
            int[] var8 = (int[])var3.get(var7);
            var5.append(s, var6, var8[0]).append((String)var4.get(var7));
            var6 = var8[1];
         }

         return var5.append(s, var6, s.length()).toString();
      }
   }

   static String illilIilil(String delta, int number) {
      try {
         return new BigDecimal(delta).add(BigDecimal.valueOf((long)number)).toPlainString();
      } catch (NumberFormatException var3) {
         return delta;
      }
   }

   public static boolean iIlllIllll() {
      return iiiIlIIIll() && iiililiilIIIiiliil.lIIiiliiliIIiiliil.Iilllilliill();
   }

   public static class_2338 IIllllIlll(class_2338 real) {
      return real != null && iiiIlIIIll() ? real.method_10069(iiililiilIIIiiliil.ilIiiliilIiIiiliil, 0, iiililiilIIIiiliil.liIiiliiliiIiiliil) : real;
   }

   public static String Iillllilll(String s) {
      return s != null && !s.isEmpty() && iiiIlIIIll() ? IiIilliIil(s, iiililiilIIIiiliil.ilIiiliilIiIiiliil, iiililiilIIIiiliil.liIiiliiliiIiiliil) : s;
   }

   private static class_2583 iIIilIlIil(class_2583 dz, int style, int dx) {
      if (dz.method_10969() instanceof class_10613 var3 && var3.comp_3510() != null) {
         class_2561 var5 = IIIillIIil(var3.comp_3510(), style, dx);
         return var5 == var3.comp_3510() ? dz : dz.method_10949(new class_10613(var5));
      }

      return dz;
   }

   @Override
   protected void iIIIlIlIIl() {
      this.lIilliIill();
   }

   public static double IlIllllIll(double realZ) {
      return iiiIlIIIll() ? realZ + (double)iiililiilIIIiiliil.liIiiliiliiIiiliil : realZ;
   }

   public static String iilllIIill(String s) {
      return s != null && !s.isEmpty() && iiiIlIIIll() ? llIililIil(s, iiililiilIIIiiliil.ilIiiliilIiIiiliil, iiililiilIIIiiliil.liIiiliiliiIiiliil) : s;
   }

   static String llIililIil(String dx, int dz, int s) {
      String[] var3 = dx.split(IliIlllilIi<"IliIlllilIi","MOfM+s6bnSy1at/i+4cfU3ZvD/Tsdp2yJUeuC6E=">(), -1);
      byte var4 = -1;
      if (var3.length >= 9
         && var3[0].equals(IliIlllilIi<"IliIlllilIi","ysti4tdUc+GbwXPI0OrVpPoEvfWY8cevtAwHoZf/KNdhrBqK">())
         && var3[1].equals(IliIlllilIi<"IliIlllilIi","H+iJ1MV+vsoB/ZGoY24sbvk1scF/pfYVVTOGL7Ya">())
         && var3[3].equals(IliIlllilIi<"IliIlllilIi","tIytPZEgzFCW5fRNBrEY5WqY1bYYl78z1vV0UZ8mtA==">())
         && var3[4].equals(IliIlllilIi<"IliIlllilIi","gWuFaVVw6iNMA/n+6ot+TtiUVkHvU2/Gi2HqHY6e">())
         && var3[5].equals(IliIlllilIi<"IliIlllilIi","C6MP8xObhCVYeBeH9lbKZIB0gQ+FZ++x85j+G8re">())) {
         var4 = 6;
      } else if (var3.length >= 4 && var3[0].equals(IliIlllilIi<"IliIlllilIi","riC1A1jUwFt0wYWzi9VFZZQs9eWNRN8bnDOUNuBKqkeybf4mLQ==">())) {
         var4 = 1;
      } else if (var3.length >= 5 && var3[0].equals(IliIlllilIi<"IliIlllilIi","BCQmTh6rQUY+Oa4TA39BuhoLIK/+ZXOSEc0DGDTB+OLJASc=">())) {
         var4 = 2;
      }

      if (var4 < 0) {
         return IiIilliIil(dx, dz, s);
      } else {
         var3[var4] = illilIilil(var3[var4], dz);
         var3[var4 + 2] = illilIilil(var3[var4 + 2], s);
         return String.join(IliIlllilIi<"IliIlllilIi","MOfM+s6bnSy1at/i+4cfU3ZvD/Tsdp2yJUeuC6E=">(), var3);
      }
   }

   private static boolean lIliliIlil(List<int[]> a, int spans, int b) {
      for (int[] var4 : a) {
         if (spans < var4[1] && var4[0] < b) {
            return true;
         }
      }

      return false;
   }

   static int[] ilillIiill(double realX, double random, Random realZ) {
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         var5 = liilliiill((double)(realZ.nextInt(48001) - 24000) - realX);
         var6 = liilliiill((double)(realZ.nextInt(48001) - 24000) - random);
         if (Math.abs(var5) >= 1024 && Math.abs(var6) >= 1024) {
            break;
         }
      }

      if (Math.abs(var5) < 1024) {
         var5 = var5 < 0 ? var5 - 1024 : var5 + 1024;
      }

      if (Math.abs(var6) < 1024) {
         var6 = var6 < 0 ? var6 - 1024 : var6 + 1024;
      }

      return new int[]{var5, var6};
   }

   public static boolean iiiIlIIIll() {
      IlIllllllIllll var0 = iiililiilIIIiiliil;
      return var0 != null && var0.IliIlllilIi() && var0.lIilliIill();
   }

   public static class_2561 lllllillll(class_2561 message) {
      return message != null && iiiIlIIIll() ? IIIillIIil(message, iiililiilIIIiiliil.ilIiiliilIiIiiliil, iiililiilIIIiiliil.liIiiliiliiIiiliil) : message;
   }

   public static int ilIllIiIll(int realX) {
      return iiiIlIIIll() ? realX + iiililiilIIIiiliil.ilIiiliilIiIiiliil : realX;
   }

   static void iiIilIIlil(String s, int spans, int values, List<int[]> dz, List<String> dx) {
      if (s != null && !s.isEmpty()) {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         Matcher var7 = lilliliiliilliliil.matcher(s);
         int var8 = 0;

         while (var8 < s.length() && var7.find(var8)) {
            if (!Illillllil(var7.group(3))) {
               var8 = var7.end(1);
            } else {
               var5.add(new int[]{var7.start(1), var7.end(1)});
               var6.add(illilIilil(var7.group(1), spans));
               var5.add(new int[]{var7.start(4), var7.end(4)});
               var6.add(illilIilil(var7.group(4), values));
               var8 = var7.end();
            }
         }

         Matcher var9 = iIililiilIlililiil.matcher(s);

         while (var9.find()) {
            int var10 = var9.start(2);
            int var11 = var9.end(2);
            if (!lIliliIlil(var5, var10, var11)) {
               char var12 = Character.toLowerCase(var9.group(1).charAt(0));
               var5.add(new int[]{var10, var11});
               var6.add(illilIilil(var9.group(2), var12 == 'x' ? spans : values));
            }
         }

         Matcher var16 = llililiililililiil.matcher(s);

         while (var16.find()) {
            if (!lIliliIlil(var5, var16.start(1), var16.end(2))) {
               var5.add(new int[]{var16.start(1), var16.end(1)});
               var6.add(illilIilil(var16.group(1), spans));
               var5.add(new int[]{var16.start(2), var16.end(2)});
               var6.add(illilIilil(var16.group(2), values));
            }
         }

         Integer[] var17 = new Integer[var5.size()];

         for (int var18 = 0; var18 < var17.length; var18++) {
            var17[var18] = var18;
         }

         Arrays.sort(var17, (found, p) -> Integer.compare(((int[])var5.get(found))[0], ((int[])var5.get(p))[0]));

         for (Integer var15 : var17) {
            dz.add((int[])var5.get(var15));
            dx.add((String)var6.get(var15));
         }
      }
   }

   static int liilliiill(double v) {
      return (int)Math.floor(v / Double.longBitsToDouble(4472349702920168169L ^ 9088539320974926569L)) * (348752824 * 1 - -29 ^ 348752837);
   }

   public IlIllllllIllll() {
      super(IliIlllilIi<"IliIlllilIi","5vixA2vVTgbScEsdFRP1sLGxYV8za/iO99+bg3D4/L5IpXMoBnabCl2dUcU=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIiiliiliIIiiliil});
      iiililiilIIIiiliil = this;
   }

   public static double lIIlliIIll(double realX) {
      return iiiIlIIIll() ? realX + (double)iiililiilIIIiiliil.ilIiiliilIiIiiliil : realX;
   }

   static class_2561 IIIillIIil(class_2561 dx, int dz, int message) {
      String var3 = dx.getString();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      iiIilIIlil(var3, dz, message, var4, var5);
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      boolean[] var8 = new boolean[]{false};
      dx.method_27658((hovers, parts) -> {
         var6.add(hovers);
         var7.add(parts);
         if (hovers.method_10969() instanceof class_10613) {
            var8[0] = true;
         }

         return Optional.empty();
      }, class_2583.field_24360);
      if (var4.isEmpty() && !var8[0]) {
         return dx;
      } else {
         class_5250 var9 = class_2561.method_43473();
         int var10 = 0;
         int var11 = 0;
         boolean var12 = false;

         for (int var13 = 0; var13 < var7.size(); var13++) {
            String var14 = (String)var7.get(var13);
            int var15 = var10 + var14.length();
            StringBuilder var16 = null;

            int var17;
            for (var17 = 0; var11 < var4.size() && ((int[])var4.get(var11))[0] < var15; var11++) {
               int[] var18 = (int[])var4.get(var11);
               if (var18[0] >= var10 && var18[1] <= var15) {
                  if (var16 == null) {
                     var16 = new StringBuilder(var14.length() + 8);
                  }

                  var16.append(var14, var17, var18[0] - var10).append((String)var5.get(var11));
                  var17 = var18[1] - var10;
               }
            }

            if (var16 != null) {
               var16.append(var14, var17, var14.length());
               var14 = var16.toString();
               var12 = true;
            }

            class_2583 var20 = (class_2583)var6.get(var13);
            class_2583 var19 = var8[0] ? iIIilIlIil(var20, dz, message) : var20;
            if (var19 != var20) {
               var12 = true;
            }

            var9.method_10852(class_2561.method_43470(var14).method_10862(var19));
            var10 = var15;
         }

         return (class_2561)(var12 ? var9 : dx);
      }
   }

   private boolean lIilliIill() {
      class_634 var1 = Iiiilllliiilll.method_1562();
      if (var1 == null) {
         return false;
      } else {
         class_746 var2 = Iiiilllliiilll.field_1724;
         if (var2 == null) {
            return var1 == this.IlIiiliilllIiiliil;
         } else {
            double var3 = var2.method_23317();
            double var5 = var2.method_23321();
            if (var1 != this.IlIiiliilllIiiliil || Ilillllill(this.IIliiliillIliiliil, this.iIliiliilIlliiliil, var3, var5)) {
               this.IlIiiliilllIiiliil = var1;
               int[] var7 = ilillIiill(var3, var5, Iiililiilliililiil);
               this.ilIiiliilIiIiiliil = var7[0];
               this.liIiiliiliiIiiliil = var7[1];
            }

            this.IIliiliillIliiliil = var3;
            this.iIliiliilIlliiliil = var5;
            return true;
         }
      }
   }

   static boolean Ilillllill(double fromX, double fromZ, double toX, double toZ) {
      double var8 = toX - fromX;
      double var10 = toZ - fromZ;
      return var8 * var8 + var10 * var10 > Double.longBitsToDouble(6752631522039671200L ^ 2109420306220689824L);
   }

   public static int liIlliiIll(int realZ) {
      return iiiIlIIIll() ? realZ + iiililiilIIIiiliil.liIiiliiliiIiiliil : realZ;
   }

   private static boolean Illillllil(String y) {
      try {
         double var1 = Double.parseDouble(y);
         return var1 >= Double.longBitsToDouble(7450234766577481934L ^ -6398334087586793266L)
            && var1 <= Double.longBitsToDouble(-1632206813904421477L ^ -6256277731307078245L);
      } catch (NumberFormatException var3) {
         return false;
      }
   }
}
