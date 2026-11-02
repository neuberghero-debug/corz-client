package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class IiiiiIIlliiiiIIl {
   public static final int IliiililIl = 2048;
   public static final int lIiiililIl = 512;
   public static final int iiliililIl = 1048576;
   public static final int iliiililIl = 64;
   public static final int liliililIl = 1;
   public static final int IIiiililIl = 12;
   public static final int IiiiililIl = 1000;
   private static final Set<String> lIIIIiilIl;
   public static final int lliiililIl = 3;
   public static final int IiliililIl = 1;
   public static final int iIiiililIl = 256;
   public static final Set<String> IIIIIiilIl = IilliliilIIi<"biwf4scl3rm2","b3lzdHFybmtscj6dl6eVXaelmZtYfJGfMJSKLU5xioSUgkuLf4d/RmV3fnx1iUtfeHKCcDl5bXVtNFNlbGpjdzlNZmBwXidnW2NbIkFTWlhRZScYOlNNXUsUXVtPUQ8yR1UX5SgvJh4tKyJM3CtBOx8wGD/90xoOMi8aGx8+">(
      IIIllIIliIIl<"IIIllIIliIIl","S+xje2aIekAqUNBTE1jdkc34S5K3RLU2dI8qU2ECyOzx1rE=">(),
      IIIllIIliIIl<"IIIllIIliIIl","s8mVygE3o6WRWrA55oz7X6HELGImAUCMms8UIPIJHg==">(),
      IIIllIIliIIl<"IIIllIIliIIl","8WbSn3JRp/4OFj82SlQ5NtO8ZS6kv7XzT4tlPp3IFmgk">(),
      0
   );
   public static final int liiiililIl = 8;
   public static final Set<String> iiiiililIl = IilliliilIIi<"nc39wd3u22dl","v6mjpKGinpucoo5tZ1dlrVdVaWuoLGFPgGRafZ5BWlREUptbT1dPljVHTkxFOXsvSEIyQIlJPUU9hCM1PDozJ2kdNjAgLnc3KzMrchEjKighFVcLJB4OHGUlGSEZYP8RGBYPA0X5Egz8ClMTBw8HTu3/BgT98TPnAPrq+EEB9f31PNvt9PLr3yHV7ujY5i/v4+vjKsnb4uDZzQ/D3NbG1B3d0dnRGLfJ0M7Hu/2xysS0wgvLv8e/BqW3vry1qeufuLKisPm5rbWt9JOlrKqjl9nqjKWfj53mj42ho+FkmYfJt4/AdIV2YI5zrli1dWqBj3VnpXysgG9OXIBo">(
      IIIllIIliIIl<"IIIllIIliIIl","LYQXfF6RAEi4y10koE79o40XHhmWz32ecM5st/7C3qiDrNCZGUEavqY=">(),
      IIIllIIliIIl<"IIIllIIliIIl","TpZnwXbIr+/DhLqeisCOWxq2Ioxr6b4uIXxbgukWKXMy03DY2281RJE=">(),
      IIIllIIliIIl<"IIIllIIliIIl","84vjco7FXW9CfwhOSgABtJ8eeKEqT0LL3ZX8b1DFfptFlrUmijJsbIodvQo=">(),
      IIIllIIliIIl<"IIIllIIliIIl","iqc/v40VyX7a/+oM6YC4jqCUuy5Ez+FoxtXcp7LSTuE=">(),
      IIIllIIliIIl<"IIIllIIliIIl","Pw6lqN4H5GBOm6IVslIFVwz+vOKwEhKee90Pspyahd9Rl53e3+nJ">(),
      IIIllIIliIIl<"IIIllIIliIIl","aYm8QUkKVwt7kOdtOd6V5NBo/c0vkUZH+kh/f1UA583a1Q==">(),
      IIIllIIliIIl<"IIIllIIliIIl","ekrCtqomjPkZPET7dokV+4p1ct0j0NTqJcK3PBPWPMXL4iBZ8w==">(),
      IIIllIIliIIl<"IIIllIIliIIl","N4v1HhpmoifnNZzGexRp3wi4CLTgNXGl5BPiEasXhn/wHnwCKw==">(),
      IIIllIIliIIl<"IIIllIIliIIl","bxnjIW6KllBylZSX8J5lIGwmx1u/26keCeDf4vJVWFQ=">(),
      IIIllIIliIIl<"IIIllIIliIIl","aBoenqwtYBsRxIuVEXODV2Uh+9s/SpT+kTneDjTcyo6hQM0=">(),
      0
   );

   private static Object lIiiIiIlilli(MutableCallSite var0, Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = iliIiiliiiii(var3, var4 ^ var6, 64).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -683763855) != (Integer.rotateLeft(606369056 ^ var16, var16 & 31) ^ -683763855)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 2041584455) != (Integer.rotateLeft(270846044 ^ var16, var16 & 31) ^ 2041584455)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -206527768) != (Integer.rotateLeft(-652188914 ^ var16, var16 & 31) ^ -206527768)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 2032566744) != (Integer.rotateLeft(428254880 ^ var16, var16 & 31) ^ 2032566744)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1505106103) != (Integer.rotateLeft(605140143 ^ var16, var16 & 31) ^ 1505106103)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 765917709) != (Integer.rotateLeft(-675866902 ^ var16, var16 & 31) ^ 765917709)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 710507275) != (Integer.rotateLeft(-875756069 ^ var16, var16 & 31) ^ 710507275)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                     } else {
                        var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                     }
                  } else {
                     var12 = var1.findStaticSetter(var9, var7[2], iIlIlllllill(var7[3], var11));
                  }
               } else {
                  var12 = var1.findGetter(var9, var7[2], iIlIlllllill(var7[3], var11));
               }
            } else {
               var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
            }
         } else {
            var12 = var1.findStaticGetter(var9, var7[2], iIlIlllllill(var7[3], var11));
         }
      } else {
         var12 = var1.findSetter(var9, var7[2], iIlIlllllill(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), int.class);
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   private IiiiiIIlliiiiIIl() {
   }

   public static Class iIlIlllllill(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   public static CallSite IilliliilIIi(Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "lIiiIiIlilli";
         Object[] var6 = new Object[]{var4, var0, var2, var3, var1.hashCode()};
         MethodHandle var7 = MethodHandles.insertArguments(var5, 0, var6).asCollector(Object[].class, var2.parameterCount()).asType(var2);
         if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
            throw new BootstrapMethodError();
         } else {
            var4.setTarget(var7);
            return var4;
         }
      }
   }

   public static boolean liiiIIllIl(String s) {
      int[] var6 = new int[5];
      int var2 = System.identityHashCode(var6) + 1185860738;
      int var4 = (System.identityHashCode(var6) ^ -927743502) + -462710566;
      int var5 = System.identityHashCode(var6) + 779355320;
      if (s == null) {
         return false;
      } else {
         boolean var10000;
         if (!IilliliilIIi<"8ht5htkt2fs2","FA4MCf0KCfkBAinIzMLKCMXHxcsD1be0uL7EGL65ua64r7WnD+zPrLCmruupq6mv5smfpZe1ppGUo52foMXSpPOiybGKlY+0h+qtiaeClby4eeGXqJqelbBwjg==">(
               s, IIIllIIliIIl<"IIIllIIliIIl","0a9tZhWQQE/ikun/ux7XOdUwgHWon8FDZULpWBU=">(), 0
            )
            && !IilliliilIIi<"8ht5htkt2fs2","FA4MCf0KCfkBAinIzMLKCMXHxcsD1be0uL7EGL65ua64r7WnD+zPrLCmruupq6mv5smfpZe1ppGUo52foMXSpPOiybGKlY+0h+qtiaeClby4eeGXqJqelbBwjg==">(
               s, IIIllIIliIIl<"IIIllIIliIIl","FiMT6FtTgerJsWWIRMGhgbIYs8A2FnAM5g8GqW0=">(), 0
            )
            && !IilliliilIIi<"8ht5htkt2fs2","FA4MCf0KCfkBAinIzMLKCMXHxcsD1be0uL7EGL65ua64r7WnD+zPrLCmruupq6mv5smfpZe1ppGUo52foMXSpPOiybGKlY+0h+qtiaeClby4eeGXqJqelbBwjg==">(
               s, IIIllIIliIIl<"IIIllIIliIIl","8ma0CoaByqsx4etwtmJpe/lwRHsWfMvm/c8xCDFT">(), 0
            )
            && !IilliliilIIi<"8ht5htkt2fs2","FA4MCf0KCfkBAinIzMLKCMXHxcsD1be0uL7EGL65ua64r7WnD+zPrLCmruupq6mv5smfpZe1ppGUo52foMXSpPOiybGKlY+0h+qtiaeClby4eeGXqJqelbBwjg==">(
               s, IIIllIIliIIl<"IIIllIIliIIl","KaSeG8+M+MBlX05XHwXlcnscS8z10gJBkypO80A=">(), 0
            )
            && !IilliliilIIi<"1wagoy0jgcukq","4vj29/P08+/39LsaIiwg0hMdDxXNByUmDggOqiAeEB4bG/YDFwKfwNv8BA4Cs/X/8feu6QcI8Orwu6zaicW/3sXb49bjgOXRzd232bLPd87Kpc3HxMTn">(
               s, IIIllIIliIIl<"IIIllIIliIIl","zbkjCsV1P0XwYuH7g6PdELzavDpsJnIj0SyGXhc=">(), 0
            )) {
            var10000 = false;
         } else {
            var10000 = true;
            if ((var6.length ^ 5 ^ 1) == 0) {
               throw new VerifyError("Inconsistent flow at 40175");
            }
         }

         return var10000;
      }
   }

   static {
      String[] var10000 = new String[--644737415 - 125 ^ 644737303];
      var10000[0] = IIIllIIliIIl<"IIIllIIliIIl","RibqKFxJd8wlLFMXXyPJ3oHUCPU52PrcoYZP0Rqrte5udZYh3Hk=">();
      var10000[1] = IIIllIIliIIl<"IIIllIIliIIl","hbyNm+vOkYbILLKVZhlvaNYaOpA5nn3ThYzKpmW0pial+0B97BhB">();
      var10000[2] = IIIllIIliIIl<"IIIllIIliIIl","wI9TbGJAdHNw1xzxOt84MV0IyZQhj9bCk0p6k39NxCYXhJJXzY0K/Q==">();
      var10000[3] = IIIllIIliIIl<"IIIllIIliIIl","XeDdJ2iiXTffnME6RWqgOguAhBs27iZR7bof7SO9PwVWkWrDmSoL5OA=">();
      var10000[4] = IIIllIIliIIl<"IIIllIIliIIl","t5xVUBG761s83D6lhEPntflGzeBJ5vuLyoHnfQzAKtXw">();
      var10000[5] = IIIllIIliIIl<"IIIllIIliIIl","ivILDSwZ1eQu4Gnz4woGXSh814pOx3rxjTVJjnBgYpYzrmSSDomOu5bWXl7w">();
      var10000[-((-91738442 >>> 17 | -91738442 << 15) + 93) ^ -391871911] = IIIllIIliIIl<"IIIllIIliIIl","sts0RKaNor9bwxXod09RONDptplyDcm82KdDvxGkn7E12933oAZTUBI=">();
      var10000[--1726387876 - -71 ^ 1726387948] = IIIllIIliIIl<"IIIllIIliIIl","tdbnfUvnWF8vKNtdJE1NpebpOi0I/D0rBJPgYdysYIdCllxjso07+g==">();
      var10000[((-417280827 ^ -109) * -678152731 - -1 << 25 | (-417280827 ^ -109) * -678152731 - -1 >>> 7) ^ -558234757] = IIIllIIliIIl<"IIIllIIliIIl","X33jtnqS46Xve1OjkXubPVUuXQVFjgNwxIjAiuQo29mU9stX">();
      var10000[(1064093873 << 23 | 1064093873 >>> 9) * 1056139499 ^ 63 ^ -1784607238] = IIIllIIliIIl<"IIIllIIliIIl","RlrQ3ee0ON1nIYbC+5S9NvG30bXF9cauj+mShV9rZ/p1JZilvQ==">();
      var10000[(((-1979500010 ^ -49) << 27 | (-1979500010 ^ -49) >>> 5) - 25 >>> 1 | ((-1979500010 ^ -49) << 27 | (-1979500010 ^ -49) >>> 5) - 25 << 31)
         ^ -438832384] = IIIllIIliIIl<"IIIllIIliIIl","rgETTh6GsN4LpKvfHDfD8puZ86ovtaEpP/JSNAgypFGnq9q3NbowBQ==">();
      var10000[(733943382 << 19 | 733943382 >>> 13) + -15 ^ -1296998942] = IIIllIIliIIl<"IIIllIIliIIl","mzzu00YmYmwFVH3sBQkDd+TNYZaTvr+JKP+uKbH/XKg/8E+Bu3LIinA=">();
      var10000[-928766616 - -11 ^ 15 ^ -928766608] = IIIllIIliIIl<"IIIllIIliIIl","+NuosYPZpXRR4JzsNzh7Cd/xRsOhBbFH8hI8rqcR5aK9CgPtdKsY">();
      var10000[(1733116934 * -43 * 19 * 654471207 << 25 | 1733116934 * -43 * 19 * 654471207 >>> 7) ^ 1842834367] = IIIllIIliIIl<"IIIllIIliIIl","1stOfT52FLb8V28WG4SXb2f4qq0h3H3yplmpEA/JoTthmWcTTetJd/8=">();
      var10000[(-1651234903 - 95 ^ 17) - 53 ^ -1651235032] = IIIllIIliIIl<"IIIllIIliIIl","eJu88p+mt1ThLViQAAuXhzgQDcrwLra7aaSbBwK0/Plt1g==">();
      var10000[-(1239308541 * -3) ^ -577041672] = IIIllIIliIIl<"IIIllIIliIIl","8NVFb9Nkz8RkyuVf+Hm8ldkQEYV01DI/XZ0zqgnnJO30VGI=">();
      var10000[~(~(-471794177 * -1056139499)) ^ -1908785413] = IIIllIIliIIl<"IIIllIIliIIl","t2FEjRHXjXtlweAu5mSGKOzBBFm5beUDxXfeqdLmQs50jnNM">();
      var10000[-1457898221 * 115 - 61 ^ -154570915] = IIIllIIliIIl<"IIIllIIliIIl","Svv6bUc7SXWPL/Q12TP07z81DnujNrZvXov91t5f3abGbQ==">();
      var10000[-320798065 * -1594008481 * -71 ^ 1580587611] = IIIllIIliIIl<"IIIllIIliIIl","ksDlzhSxE3a1xkVtCfgXdor8LWdVdGJFEC5rkcjDIqE2kA==">();
      var10000[(~((-1003778485 << 19 | -1003778485 >>> 13) * -95) << 25 | ~((-1003778485 << 19 | -1003778485 >>> 13) * -95) >>> 7) ^ 1189207249] = IIIllIIliIIl<"IIIllIIliIIl","bxPAsLRt1gctYpgSyI+dzO+M/42qlAS0J2kCOctPqAqsHoXGttk=">();
      var10000[20] = IIIllIIliIIl<"IIIllIIliIIl","s8jPUihKTkyZ3Rjhw6SAykp+GpD5Wu+/m1tiKpLypTEZJZjAB9so">();
      var10000[21] = IIIllIIliIIl<"IIIllIIliIIl","+tEaMgA0hy5mt+Zjfiub3xIAfxCkvFQlqd3MS0Mz48wUBnQECb0GpQM=">();
      var10000[22] = IIIllIIliIIl<"IIIllIIliIIl","DL4wiM982zhJb1SGhv0Rk6LGoge9fFtwvLic/MHcdxDBSCd5hUbuXFvr">();
      var10000[23] = IIIllIIliIIl<"IIIllIIliIIl","LnLPXZbobc1xMCt5HKAd1JoAOjLs61UIfabD8aHz6Y71OCAxUYnhgg==">();
      var10000[24] = IIIllIIliIIl<"IIIllIIliIIl","p7/SXEtrIKDURPT/0JSPlCXai1u7ZTTtnxOMFrudnfVTWQc=">();
      var10000[25] = IIIllIIliIIl<"IIIllIIliIIl","eULhRuY5bftofY7PEir0JDyPwx7yFa+NdH3fdJCagsK6NQ7tCE8=">();
      var10000[26] = IIIllIIliIIl<"IIIllIIliIIl","UoLn5FXZZntrwWQ2iCCyFXz4YGRAWo27toK0AV8Cj9tapsuYirRU">();
      var10000[27] = IIIllIIliIIl<"IIIllIIliIIl","kqvoJXmEXlPbdOuLMRmZ3sKWwKcmQCZevrEPT5yFFWBrw7dpbLs=">();
      var10000[28] = IIIllIIliIIl<"IIIllIIliIIl","emv/Q9IZOsUTPXFAeKrwAbJDWjE6YQSn0OYHfFJqfA==">();
      lIIIIiilIl = IilliliilIIi<"1m6rhjrpplg84","YnZ2d3R1c3hxbTuaoqygUqqqlJBNh5SkLYePKkt3ZYaOmIw9f4l7gThXg3p+f41FNlJze4V5KoODbWklYG19NQVrO0ZJUVVcM/xUMUFyYEsmafMvYTguREpOPA==">(
         var10000, 0
      );
   }

   public static boolean IliIlllilIi(String key) {
      int[] var9 = new int[24];
      int var5 = System.identityHashCode(var9) + 1822025527;
      int var7 = System.identityHashCode(var9) ^ -269737511 ^ 1490705334;
      int var8 = System.identityHashCode(var9) + -1197007708;
      if (key == null) {
         return false;
      } else {
         String var1 = IilliliilIIi<"3eujodf2tc9vi","+OLg3ene3eXd3tU0KBYm7CkjKR/n8QsQJCIYxAsTBxoUFQ682fQZDfsL0A4IDgTL5gwC9NL77un4Avz1stwB9ePzuPbw9uyzzvTq3Lrj1tHg6uTdmqfD6NzK2p/d193TmqW/xNjWzId3ns6B0JnNz3VuqI+npqJtp6xljGqohriAjpk=">(
            IilliliilIIi<"3eujodf2tc9vi","+OLg3ene3eXd3tU0KBYm7CkjKR/n8QsQJCIYxAsTBxoUFQ682fQZDfsL0A4IDgTL5gwC9NL77un4Avz1stwB9ePzuPbw9uyzzvTq3Lrj1tHg6uTdmqfD6NzK2p/d193TmqW/xNjWzId3ns6B0JnNz3VuqI+npqJtp6xljGqohriAjpk=">(
               IilliliilIIi<"3n9nct8jr58gu","/eXl4uTh4OLY2dAvJRkj7ywgLCTq7g4LISUdvwgi/iAHFADwDf4Ps9DzEAb6BNH29AgKzOgK/foE/LG+4P3z5/G++u768rm83Nnv8+uejM/azY7ejsWOg8euyrnBg4uzer6jwbifsp+s">(
                  key, Locale.ROOT, 0
               ),
               IIIllIIliIIl<"IIIllIIliIIl","SEfT0wg5Z626pLTRMRCE9OVe4xeBLLL5D1F53fA=">(),
               "",
               0
            ),
            IIIllIIliIIl<"IIIllIIliIIl","Qzq8yPJfB5x/co9PxTWoCdvbsPXpxbC5AeG9qkw=">(),
            "",
            0
         );
         Iterator var2 = IilliliilIIi<"1us9hgz6ffzjc","Izc3ODIzMjA2M/rZ4+vhEevp1c8MyNXj7M7g0ODS3MLc4wQEnr/J0cf40c+7tfOYyrrKvMasxv7MhwOFw4OLu/rDgbGD+Kb1svK6kHx7qZ56maI=">(
            lIIIIiilIl, 0
         );

         while (IilliliilIIi<"3psy9vr4l93wm","18vLzL7HxrzCv+YFD/8Nxf/9AQPAHvgI8AL0+uzT9PzpE/3f6susrPjHAZ+fEO2c7Zq+6Przyv0F9/a1+PDqytuK9sU=">(var2, 0)) {
            String var3 = (String)IilliliilIIi<"26mx5wrxi2qxa","NysrLB4nJhwiHwbl79/tJd/d4eMgvtjo0OLU2szz1uDCze4PD7HK1MTSC8vPx88Gpce+zMW569mUpaKNkLqe69C9irOkg5qvh8eBpoB7qtqagQ==">(
               var2, 0
            );
            if (IilliliilIIi<"8ht5htkt2fs2","FA4MCf0KCfkBAinIzMLKCMXHxcsD1be0uL7EGL65ua64r7WnD+zPrLCmruupq6mv5smfpZe1ppGUo52foMXSpPOiybGKlY+0h+qtiaeClby4eeGXqJqelbBwjg==">(
               var1,
               IilliliilIIi<"3eujodf2tc9vi","+OLg3ene3eXd3tU0KBYm7CkjKR/n8QsQJCIYxAsTBxoUFQ682fQZDfsL0A4IDgTL5gwC9NL77un4Avz1stwB9ePzuPbw9uyzzvTq3Lrj1tHg6uTdmqfD6NzK2p/d193TmqW/xNjWzId3ns6B0JnNz3VuqI+npqJtp6xljGqohriAjpk=">(
                  var3, IIIllIIliIIl<"IIIllIIliIIl","a10EiwMxvhqvlxzuBMVkdWg3vck4V8brm4lLV8M=">(), "", 0
               ),
               0
            )) {
               return true;
            }

            if ((var8 | ~var8) + 1 != 0) {
               throw new VerifyError("Inconsistent flow at 17977");
            }
         }

         return false;
      }
   }

   private static String iliIiiliiiii(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for (int var5 = 0; var5 < var3.length; var5++) {
         var3[var5] = (byte)(var3[var5] + var5 - var2 ^ var1);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }
}
