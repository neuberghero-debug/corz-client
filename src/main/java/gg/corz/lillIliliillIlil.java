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

public final class lillIliliillIlil {
   private static Object lIiiIiIlilli(MutableCallSite var0, Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = iliIiiliiiii(var3, var4 ^ var6, 56).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1861789031) != (Integer.rotateLeft(879890628 ^ var16, var16 & 31) ^ 1861789031)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1983473498) != (Integer.rotateLeft(-538836289 ^ var16, var16 & 31) ^ 1983473498)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -771380280) != (Integer.rotateLeft(-434210424 ^ var16, var16 & 31) ^ -771380280)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -55651532) != (Integer.rotateLeft(2026863199 ^ var16, var16 & 31) ^ -55651532)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1111598010) != (Integer.rotateLeft(583018142 ^ var16, var16 & 31) ^ -1111598010)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1700714299) != (Integer.rotateLeft(120159542 ^ var16, var16 & 31) ^ -1700714299)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 332634785) != (Integer.rotateLeft(2044892001 ^ var16, var16 & 31) ^ 332634785)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findSetter(var9, var7[2], iIlIlllllill(var7[3], var11));
                     } else {
                        var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
                     }
                  } else {
                     var12 = var1.findStaticGetter(var9, var7[2], iIlIlllllill(var7[3], var11));
                  }
               } else {
                  var12 = var1.findStaticSetter(var9, var7[2], iIlIlllllill(var7[3], var11));
               }
            } else {
               var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
            }
         } else {
            var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
         }
      } else {
         var12 = var1.findGetter(var9, var7[2], iIlIlllllill(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), int.class);
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
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

   public static Class iIlIlllllill(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   private static String iliIiiliiiii(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for (int var5 = 0; var5 < var3.length; var5++) {
         var3[var5] = (byte)(var3[var5] + var1 + var5 ^ var2);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   public static boolean IliIlllilIi(llllliiillllii m, boolean desiredEnabled) {
      int[] var7 = new int[15];
      int var3 = System.identityHashCode(var7) ^ -765824372;
      int var5 = (System.identityHashCode(var7) ^ 1077022811) + 125687936;
      int var6 = System.identityHashCode(var7) + 1871189677;
      if (m == null) {
         return false;
      } else if (!desiredEnabled) {
         return true;
      } else {
         boolean var10000;
         if (!IilliliilIIi<"1c7qxp0vbx5fw","T0VDQ0A+PD88PWKOjUOHgnRrPnt6eXh3c3Jxc3JxcGxrS2mIaoZoZ2ZlZGBiYT4bG2s6dIVRVm1Ea04xbWwIA2VmATgoYGNhZFxDWWw=">(m, 0)) {
            var10000 = true;
            if (desiredEnabled ^ desiredEnabled) {
               throw null;
            }
         } else {
            var10000 = false;
         }

         return var10000;
      }
   }

   private lillIliliillIlil() {
   }

   public static boolean liiiIIllIl(lIiIiIlliIiIiIll desiredEnabled, llllliiillllii policy, boolean m) {
      int[] var9 = new int[22];
      int var4;
      int var5 = (var4 = System.identityHashCode(var9)) + -1727726082;
      int var7 = (System.identityHashCode(var9) ^ -1324136980) + 2059364680;
      int var8 = System.identityHashCode(var9) + 1464190529;
      if (policy != null
         && desiredEnabled != null
         && IilliliilIIi<"94vnpcetd0yk","wri2trOxr7KvsNUBALb69efese4K6QjnBujn4wLhAN/+4N+8+tz42tnY9NbS1PDSr4yM3KvU8+u13sXbfaLI7evpyNbL3JnV0mWj0N+0qQ==">(
            desiredEnabled, 0
         )) {
         ilIIlIliIiIIlIli var3 = IilliliilIIi<"245aobw0noyno","dmxqamdlY2ZjZIm1tGquqZuSZaK+nbybupybl7aVtJOylJNwro2Mjo2JiIqGhYSGY0CjgIZ6hEF9gX2FPI9vbHJ2fiF/fiyOeHcucWxeVSliZIB/YX1fW3pZeHdZdVdTBDJtBkVqcU5NYSlYSFY1X25H/CBGQWDyXlZVXA==">(
            desiredEnabled,
            IilliliilIIi<"3s7m47ckg70kg","enBubmtpZ2pnaI25uG6yrZ+WaaalpKOinp2cnp2cm5eWdrSWkrGTkpGNj6uKakdHqYaMgIpHg4eDi0KVdXJ4fIQnVY10kn+VnHhlTIeUjYlykZFrQ35iDhl2FFoR">(
               policy, 0
            ),
            IilliliilIIi<"1c7qxp0vbx5fw","T0VDQ0A+PD88PWKOjUOHgnRrPnt6eXh3c3Jxc3JxcGxrS2mIaoZoZ2ZlZGBiYT4bG2s6dIVRVm1Ea04xbWwIA2VmATgoYGNhZFxDWWw=">(policy, 0),
            IilliliilIIi<"2gsv1f0mohmfq","QDY0NDEvLTAtLlN/fjR4c2VcL2xramloZGNiZGNiYV1cPHp5W1pZdVdWUnFTUi8MDFwrZ3ZCQWD7/zMiTERBZ00/SzYZSDtWS1hO7Us=">(policy, 0),
            0
         );
         boolean var10000;
         if (IilliliilIIi<"18akie4h7ga1g","7+Xj4+De3N/c3QIuLeMnIhQL3hs3FjUUMxUUEC8OLQwrDQzpJwYlBAYCIQD//h383LkcBgW8//rs47fw8g4N7wvt6QjnBgXnA+XhkvCe7r35+dj64fTgxLT3//3g2ITP+avUf4PDze/k5w==">(
               desiredEnabled, var3, m, 0
            )
            && IilliliilIIi<"z5mbsowyvaxk","KSAdERAaHBcMDDxoZx1hXE5FGFVRU1JuUExOSklLSmZIREYjYUM/XkA/Pjo8WDcX9FdBQPc6NSce8i4tLCsqJiUkJiUkIx8ezy3bK/ogQ0MOJS8rDvEtKjI5JsMh+OgjvQfAGgX7uQ==">(
               policy, m, 0
            )) {
            var10000 = true;
            if ((var5 - var4 - -1727726082 ^ 1) == 0) {
               liIlliiIll = ~liIlliiIll;
               throw null;
            }
         } else {
            var10000 = false;
         }

         return var10000;
      } else {
         return false;
      }
   }
}
