package gg.corz;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public final class iliilIIlIiiilIIl {
   public static final List<String> IIiIIIilIl = List.of(
      IiIiliIiiiIi<"IiIiliIiiiIi","P8zXseMXSCpenPsi34+7DapbWnsZLFVIxoZIYf3DoQ==">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","07Kk82L7Ltw6yXgmmfk5OqJRo9ZnrFqbEk0gPn9mhg==">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","Z+Rvsfg13AIzmoj21WyZ59hQKR94KSI1gu4bsnpZNw==">()
   );
   public static final List<String> lilIIIilIl = List.of(
      IiIiliIiiiIi<"IiIiliIiiiIi","Ke2clTlVSLGTp+CMkFojEDXPhwvbqoKCO5429XG6zDBDIB/81y31HNdR">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","qR0cIJ/1U9T/kvZGFWteNjIBxA5pBC1j/QJb+W4LumTyLmaEIMvhHg==">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","5KW254tDvUGWyMWnpn8ETXHXzCNzwbi7pR60tVpX6ckKZkJaNQ==">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","gG99/7S95vJxMNsMIIjpNpMmRx6hf0omfxD17OsmviQqBdteJNl39ltT">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","+0u2kYYToTAgb29nDcuBgq9DQ73iv0SaF7AUr9CnRz1Kg2437duJpw==">()
   );
   private final EnumMap<lIlIIliIlIIl, LinkedHashMap<String, LinkedHashMap<String, double[]>>> iIiIIIilIl;
   public static final List<String> iilIIIilIl = List.of(
      IiIiliIiiiIi<"IiIiliIiiiIi","vfPxeqsjUOAaFUDJD8yHlbXwtO8B0n54Tq4X6VubqA==">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","FNvbcVDn0Zh2K4Stt/y/HfP6dHb6zS7AeyCtMtmsbrHfug==">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","z4IoWeNN/h5+DHHHOpeXBlhEOF8TAABeSY+2VuMXzFLXnQ==">()
   );
   private final Random lIiIIIilIl;

   public void IiIlliIliiIl(Map<String, Map<String, IillIIillillIIil>> state) {
      long var18 = 3983245477363675529L;
      this.IIlllIlliIll();
      if (state != null) {
         for (Entry var3 : state.entrySet()) {
            String var4 = (String)var3.getKey();
            if (var4 != null && var3.getValue() != null) {
               var18 ^= ((long)var4.indexOf(124) << 32 ^ var18) & -1L << 32;
               if ((int)(var18 >>> 32) >= 0) {
                  lIlIIliIlIIl var6 = Illlllllilll(var4.substring(0, (int)(var18 >>> 32)));
                  String var7 = var4.substring((int)(var18 >>> 32) + 1);
                  if (var6 != null && IilliliilIIi(var7)) {
                     List var8 = IliIlllilIi(var6);
                     LinkedHashMap var9 = new LinkedHashMap();

                     for (Entry var11 : ((Map)var3.getValue()).entrySet()) {
                        String var12 = (String)var11.getKey();
                        IillIIillillIIil var13 = (IillIIillillIIil)var11.getValue();
                        if (var12 != null && var13 != null && var8.contains(var12) && var9.size() < 8) {
                           double var14 = Double.isNaN(var13.IliIlllilIi()) ? 0.0 : IiIIIlliIIIl.IIiilIiiiIii(var13.IliIlllilIi(), 0.0, 1000000.0);
                           double var16 = IiIIIlliIIIl.Iliilliiilii(var13.liiiIIllIl(), -1.0, 1.0, liiiIIllIl(var6, var12));
                           var9.put(var12, new double[]{var14, var16});
                        }
                     }

                     if (!var9.isEmpty()) {
                        LinkedHashMap var20 = this.iIiIIIilIl.get(var6);
                        var20.remove(var7);
                        var20.put(var7, var9);
                        IIillIiliIil(var20);
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean IlIillIiilIi(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '_' || c == '.' || c == '|' || c == '-';
   }

   private static double IIIilIIiiIIi(Map<String, Double> values, String arm) {
      Double var2 = values == null ? null : (Double)values.get(arm);
      if (var2 == null) {
         return 0.0;
      } else if (Double.isNaN(var2)) {
         return Double.NEGATIVE_INFINITY;
      } else {
         return var2 == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : var2;
      }
   }

   public void IIlllIlliIll() {
      for (LinkedHashMap var2 : this.iIiIIIilIl.values()) {
         var2.clear();
      }
   }

   private static double Iiilliiliiil(Map<String, double[]> stored) {
      if (stored == null) {
         return 0.0;
      } else {
         double var1 = 0.0;

         for (double[] var4 : stored.values()) {
            var1 += var4[0];
         }

         return var1;
      }
   }

   public static List<String> IliIlllilIi(lIlIIliIlIIl f) {
      if (f == null) {
         return List.of();
      } else {
         return switch (f) {
            case IlIIIIllllIIIIll -> lilIIIilIl;
            case ilIIIIllIiIIIIll -> iilIIIilIl;
            case liIIIIlliiIIIIll -> IIiIIIilIl;
         };
      }
   }

   public iliilIIlIiiilIIl(Random rnd) {
      long var6 = 1350994941914597081L;
      super();
      this.iIiIIIilIl = new EnumMap<>(lIlIIliIlIIl.class);
      this.lIiIIIilIl = rnd == null ? new Random() : rnd;
      lIlIIliIlIIl[] var2 = lIlIIliIlIIl.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         lIlIIliIlIIl var5 = var2[(int)var9];
         this.iIiIIIilIl.put(var5, new LinkedHashMap<>(32, 0.75F, true));
      }
   }

   public static String iIlIlllllill(String context) {
      long var5 = -4603232161225094067L;
      long var7 = 4027092235561120598L;
      if (context == null) {
         return "";
      } else {
         var5 ^= ((long)Math.min(context.length(), 48) << 32 ^ var5) & -1L << 32;
         StringBuilder var2 = new StringBuilder((int)(var5 >>> 32));

         for (long var10 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            var7 ^= ((long)context.charAt((int)var10) << 32 ^ var7) & -1L << 32;
            var2.append((char)(IlIillIiilIi((char)((int)(var7 >>> 32))) ? (int)(var7 >>> 32) : '_'));
         }

         return var2.toString();
      }
   }

   public Map<String, Map<String, IillIIillillIIil>> IlIlllIlilIl() {
      long var11 = 489539144159274864L;
      LinkedHashMap var1 = new LinkedHashMap();
      lIlIIliIlIIl[] var2 = lIlIIliIlIIl.values();
      var11 ^= ((long)var2.length << 32 ^ var11) & -1L << 32;

      for (long var14 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         lIlIIliIlIIl var5 = var2[(int)var14];

         for (Entry var7 : this.iIiIIIilIl.get(var5).entrySet()) {
            LinkedHashMap var8 = new LinkedHashMap();

            for (Entry var10 : ((LinkedHashMap)var7.getValue()).entrySet()) {
               var8.put((String)var10.getKey(), new IillIIillillIIil(((double[])var10.getValue())[0], ((double[])var10.getValue())[1]));
            }

            var1.put(var5.name() + IiIiliIiiiIi<"IiIiliIiiiIi","LRSKCjee6A0cN8CIs1TYB3jnhu8abbSzga/yTWM=">() + (String)var7.getKey(), var8);
         }
      }

      return var1;
   }

   public static boolean IilliliilIIi(String context) {
      long var2 = 3150966683183192584L;
      if (context != null && context.length() <= 48) {
         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < context.length(); var4 += 4294967296L) {
            if (!IlIillIiilIi(context.charAt((int)(var4 >>> 32)))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static lIlIIliIlIIl Illlllllilll(String name) {
      long var5 = -4819721973620057520L;
      if (name == null) {
         return null;
      } else {
         lIlIIliIlIIl[] var1 = lIlIIliIlIIl.values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            lIlIIliIlIIl var4 = var1[(int)var8];
            if (var4.name().equals(name)) {
               return var4;
            }
         }

         return null;
      }
   }

   private static void Ililllililil(LinkedHashMap<String, double[]> m) {
      String var1 = null;
      double var2 = Double.POSITIVE_INFINITY;

      for (Entry var5 : m.entrySet()) {
         if (((double[])var5.getValue())[0] < var2) {
            var2 = ((double[])var5.getValue())[0];
            var1 = (String)var5.getKey();
         }
      }

      if (var1 == null) {
         m.clear();
      } else {
         m.remove(var1);
      }
   }

   private static void IIillIiliIil(LinkedHashMap<String, LinkedHashMap<String, double[]>> fam) {
      Iterator var1 = fam.keySet().iterator();

      while (fam.size() > 16 && var1.hasNext()) {
         var1.next();
         var1.remove();
      }
   }

   public static double liiiIIllIl(lIlIIliIlIIl arm, String f) {
      long var4 = -529764793763448843L;
      if (arm == lIlIIliIlIIl.IlIIIIllllIIIIll && f != null) {
         var4 ^= (-4294967296L ^ var4) & -1L << 32;
         switch (f.hashCode()) {
            case -1705242105:
               if (f.equals(IiIiliIiiiIi<"IiIiliIiiiIi","+0u2kYYToTAgb29nDcuBgq9DQ73iv0SaF7AUr9CnRz1Kg2437duJpw==">())) {
                  var4 ^= (4294967296L ^ var4) & -1L << 32;
               }
               break;
            case -1439578270:
               if (f.equals(IiIiliIiiiIi<"IiIiliIiiiIi","Ke2clTlVSLGTp+CMkFojEDXPhwvbqoKCO5429XG6zDBDIB/81y31HNdR">())) {
                  var4 ^= (0L ^ var4) & -1L << 32;
               }
               break;
            case -587546152:
               if (f.equals(IiIiliIiiiIi<"IiIiliIiiiIi","qR0cIJ/1U9T/kvZGFWteNjIBxA5pBC1j/QJb+W4LumTyLmaEIMvhHg==">())) {
                  var4 ^= (17179869184L ^ var4) & -1L << 32;
               }
               break;
            case 1092288764:
               if (f.equals(IiIiliIiiiIi<"IiIiliIiiiIi","gG99/7S95vJxMNsMIIjpNpMmRx6hf0omfxD17OsmviQqBdteJNl39ltT">())) {
                  var4 ^= (12884901888L ^ var4) & -1L << 32;
               }
               break;
            case 1740920704:
               if (f.equals(IiIiliIiiiIi<"IiIiliIiiiIi","5KW254tDvUGWyMWnpn8ETXHXzCNzwbi7pR60tVpX6ckKZkJaNQ==">())) {
                  var4 ^= (8589934592L ^ var4) & -1L << 32;
               }
         }
         return switch ((int)(var4 >>> 32)) {
            case 0 -> 0.3;
            case 1, 2 -> 0.25;
            case 3 -> 0.2;
            case 4 -> 0.15;
            default -> 0.0;
         };
      } else {
         return arm == lIlIIliIlIIl.liIIIIlliiIIIIll && IiIiliIiiiIi<"IiIiliIiiiIi","07Kk82L7Ltw6yXgmmfk5OqJRo9ZnrFqbEk0gPn9mhg==">().equals(f) ? 0.1 : 0.0;
      }
   }

   public IillIIillillIIil IIIllIIliIIl(lIlIIliIlIIl f, String context, String name) {
      if (f == null) {
         return new IillIIillillIIil(0.0, 0.0);
      } else {
         LinkedHashMap var4 = this.iIiIIIilIl.get(f).get(iIlIlllllill(context));
         double[] var5 = var4 == null ? null : (double[])var4.get(name);
         return var5 == null ? new IillIIillillIIil(0.0, liiiIIllIl(f, name)) : new IillIIillillIIil(var5[0], var5[1]);
      }
   }

   private LinkedHashMap<String, double[]> Iilllilliill(lIlIIliIlIIl f, String key) {
      LinkedHashMap var3 = this.iIiIIIilIl.get(f);
      LinkedHashMap var4 = (LinkedHashMap)var3.get(key);
      if (var4 == null) {
         var4 = new LinkedHashMap();
         var3.put(key, var4);
         IIillIiliIil(var3);
      }

      return var4;
   }

   public void iliIiiliiiii(lIlIIliIlIIl arm, String context, String reward, double f) {
      if (arm != null && reward != null && IliIlllilIi(arm).contains(reward)) {
         double var6 = Double.isNaN(f) ? 0.0 : IiIIIlliIIIl.IIiilIiiiIii(f, -1.0, 1.0);
         LinkedHashMap var8 = this.Iilllilliill(arm, iIlIlllllill(context));

         for (double[] var10 : var8.values()) {
            var10[0] *= 0.97;
         }

         double[] var11 = (double[])var8.get(reward);
         if (var11 == null) {
            while (var8.size() >= 8) {
               Ililllililil(var8);
            }

            var11 = new double[]{0.0, liiiIIllIl(arm, reward)};
            var8.put(reward, var11);
         }

         var11[0] = Math.min(1000000.0, var11[0] + 1.0);
         var11[1] = IiIIIlliIIIl.IIiilIiiiIii(var11[1] + (var6 - var11[1]) / (var11[0] + 2.0), -1.0, 1.0);
      }
   }

   public String lIiiIiIlilli(lIlIIliIlIIl f, String context, List<String> explore, Map<String, Double> plannerValue, boolean eligible) {
      long var34 = 6795894182834428525L;
      long var36 = 2440255322282486509L;
      if (f != null && explore != null && !explore.isEmpty()) {
         List var6 = IliIlllilIi(f);
         ArrayList var7 = new ArrayList();
         ArrayList var8 = new ArrayList();

         for (String var10 : explore) {
            if (var10 != null && var6.contains(var10) && !var7.contains(var10)) {
               var7.add(var10);
               var8.add(IIIilIIiiIIi(plannerValue, var10));
            }
         }

         if (var7.isEmpty()) {
            return null;
         } else {
            double var38 = Double.NEGATIVE_INFINITY;

            for (double var12 : var8) {
               var38 = Math.max(var38, var12);
            }

            ArrayList var39 = new ArrayList();
            ArrayList var40 = new ArrayList();
            var34 ^= (0L ^ var34) & -1L << 32;

            while ((int)(var34 >>> 32) < var7.size()) {
               double var14 = (Double)var8.get((int)(var34 >>> 32));
               var34 ^= ((long)(var38 > 0.0 ? (var14 >= 0.85 * var38 ? 1 : 0) : (var14 >= var38 - 0.5 ? 1 : 0)) ^ var34) & -1L >>> 32;
               if ((int)var34 != 0) {
                  var39.add((String)var7.get((int)(var34 >>> 32)));
                  var40.add(var14);
               }

               var34 += 4294967296L;
            }

            if (var39.size() == 1) {
               return (String)var39.get(0);
            } else {
               LinkedHashMap var13 = this.iIiIIIilIl.get(f).get(iIlIlllllill(context));
               double var41 = Iiilliiliiil(var13);
               if (eligible) {
                  double var16 = Math.max(0.05, 3.0 / (20.0 + var41));
                  if (this.lIiIIIilIl.nextDouble() < var16) {
                     return (String)var39.get(this.lIiIIIilIl.nextInt(var39.size()));
                  }
               }

               double var42 = Math.log(1.0 + var41);
               String var18 = null;
               double var19 = Double.NEGATIVE_INFINITY;
               double var21 = Double.NEGATIVE_INFINITY;

               for (long var45 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var45 >>> 32) < var39.size(); var45 += 4294967296L) {
                  String var24 = (String)var39.get((int)(var45 >>> 32));
                  double[] var25 = var13 == null ? null : (double[])var13.get(var24);
                  double var26 = var25 == null ? 0.0 : var25[0];
                  double var28 = var25 == null ? liiiIIllIl(f, var24) : var25[1];
                  double var30 = IiIIIlliIIIl.IIiilIiiiIii(var28, -0.8, 1.0);
                  if (eligible) {
                     var30 += 0.4 * Math.sqrt(var42 / (var26 + 2.0));
                  }

                  double var32 = (Double)var40.get((int)(var45 >>> 32));
                  if (var18 == null || var30 > var19 || var30 == var19 && var32 > var21) {
                     var18 = var24;
                     var19 = var30;
                     var21 = var32;
                  }
               }

               return var18;
            }
         }
      } else {
         return null;
      }
   }
}
