package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public final class iliiIIllIiiiIIll {
   public final List<String> llIiIlllll = new ArrayList<>();
   public final List<String> ilIiIlllll = new ArrayList<>();

   public String IilliliilIIi() {
      int[] var6 = new int[24];
      int var1;
      int var2 = (var1 = System.identityHashCode(var6)) + -1898821046;
      int var4 = System.identityHashCode(var6) ^ -638349775 ^ 1451062873;
      int var5 = System.identityHashCode(var6) + -479031214;
      String var10000;
      if (iliIiiliiiii<"1me47epknoe83","pbizvrS9vL+hoqqZ/vTg9rbs7vLws9L209Woytfgy9fc0KCDhfek4tv/xtfx0fO979f0junX8PvKpKmVr5CD9qA=">(this.llIiIlllll, 0)) {
         var10000 = null;
         if ((var2 - var1 - -1898821046 ^ 1) == 0) {
            throw new VerifyError("Inconsistent flow at 12264");
         }
      } else {
         var10000 = (String)iliIiiliiiii<"1eh2qiaxij59r","cG9mVVlSUVRUVV9iAwsdDUMbGxkdXD8dBgJ9HxwOcVQ0VzPq4PTiq+nn6e+mxenm6O37q5vzxdbh9dLO7pDKrdvqyvXVlqn+8M6S8fzsxw==">(
            this.llIiIlllll, 0, 0
         );
      }

      return var10000;
   }

   public void liiiIIllIl(String m) {
      iliIiiliiiii<"1vk4y5xcdluvj","pLuyubW+vaCgoaue//fh+bfv7/XxsNPJ0tapxcHCrYDlwMrazIHD0d/VnPvX3NLbzYGS5rffjairmJaKn8yknqGDnJmH/sWJ4YCGhYGQnA==">(
         this.llIiIlllll, m, 0
      );
   }

   public static CallSite iliIiiliiiii(Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "IIIllIIliIIl";
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

   private static String IlIlllIlilIl(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for (int var5 = 0; var5 < var3.length; var5++) {
         var3[var5] = (byte)(var3[var5] ^ var1 + var2 + var5);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   private static Object IIIllIIliIIl(MutableCallSite var0, Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = IlIlllIlilIl(var3, var4 ^ var6, 29).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 649986676) != (Integer.rotateLeft(-455913209 ^ var16, var16 & 31) ^ 649986676)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1132565633) != (Integer.rotateLeft(-2055823414 ^ var16, var16 & 31) ^ 1132565633)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 498006840) != (Integer.rotateLeft(-1300000396 ^ var16, var16 & 31) ^ 498006840)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1013267827) != (Integer.rotateLeft(-1958020138 ^ var16, var16 & 31) ^ -1013267827)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1293318711) != (Integer.rotateLeft(-750270395 ^ var16, var16 & 31) ^ -1293318711)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1003971745) != (Integer.rotateLeft(376533182 ^ var16, var16 & 31) ^ -1003971745)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -380161707) != (Integer.rotateLeft(296100628 ^ var16, var16 & 31) ^ -380161707)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findStaticSetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
                     } else {
                        var12 = var1.findSetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
                     }
                  } else {
                     var12 = var1.findStaticGetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
                  }
               } else {
                  var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
               }
            } else {
               var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
            }
         } else {
            var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
         }
      } else {
         var12 = var1.findGetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), int.class);
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   public void iIlIlllllill(String m) {
      iliIiiliiiii<"1vk4y5xcdluvj","pLuyubW+vaCgoaue//fh+bfv7/XxsNPJ0tapxcHCrYDlwMrazIHD0d/VnPvX3NLbzYGS5rffjairmJaKn8yknqGDnJmH/sWJ4YCGhYGQnA==">(
         this.ilIiIlllll, m, 0
      );
   }

   public boolean IliIlllilIi() {
      return iliIiiliiiii<"1me47epknoe83","pbizvrS9vL+hoqqZ/vTg9rbs7vLws9L209Woytfgy9fc0KCDhfek4tv/xtfx0fO979f0junX8PvKpKmVr5CD9qA=">(this.llIiIlllll, 0);
   }

   public static Class lIiiIiIlilli(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }
}
