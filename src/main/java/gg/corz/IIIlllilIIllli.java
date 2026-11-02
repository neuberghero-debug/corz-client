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

public enum IIIlllilIIllli {
   iillilIIIl,
   IIililIIIl,
   lIililIIIl;
   // $VF: synthetic field
   private static final IIIlllilIIllli[] iIililIIIl = iIlIlllllill<"ka3usvocfowr","Oj1AQD49PTw9ODpMaGctYWxudSiCgYBiYWBcXnp5W1pZVTVzVVFwUlFQTE5qSSkGBndnQUAHOkVHTgJbWlk7Ojk1N1NSNDMyLv8NUFdKMCLwRlUEGk/sHk8gPOP7PkYR30VDDhI=">(
      0
   );

   private static Object IilliliilIIi(MutableCallSite var0, Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = lIiiIiIlilli(var3, var4 ^ var6, 32).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1491766855) != (Integer.rotateLeft(1846633084 ^ var16, var16 & 31) ^ 1491766855)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1696945390) != (Integer.rotateLeft(-1091193287 ^ var16, var16 & 31) ^ -1696945390)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -541475883) != (Integer.rotateLeft(1022229859 ^ var16, var16 & 31) ^ -541475883)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -74590230) != (Integer.rotateLeft(-336972126 ^ var16, var16 & 31) ^ -74590230)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 462598683) != (Integer.rotateLeft(1939882865 ^ var16, var16 & 31) ^ 462598683)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 580796887) != (Integer.rotateLeft(-677635235 ^ var16, var16 & 31) ^ 580796887)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1750378787) != (Integer.rotateLeft(-1565566847 ^ var16, var16 & 31) ^ 1750378787)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                     } else {
                        var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
                     }
                  } else {
                     var12 = var1.findSetter(var9, var7[2], liiiIIllIl(var7[3], var11));
                  }
               } else {
                  var12 = var1.findStaticGetter(var9, var7[2], liiiIIllIl(var7[3], var11));
               }
            } else {
               var12 = var1.findGetter(var9, var7[2], liiiIIllIl(var7[3], var11));
            }
         } else {
            var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
         }
      } else {
         var12 = var1.findStaticSetter(var9, var7[2], liiiIIllIl(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), int.class);
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   public static Class liiiIIllIl(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   public static CallSite iIlIlllllill(Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "IilliliilIIi";
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

   private static String lIiiIiIlilli(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for (int var5 = 0; var5 < var3.length; var5++) {
         var3[var5] = (byte)(var3[var5] + var1 + var5 ^ var2);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }
}
