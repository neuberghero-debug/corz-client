package gg.corz;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.class_2960;

final class iIllliIlllli {
   private static final Map<iiIiliiIIlilii, IiIilllliIilll> iliIIIlIlIiiIIIlIl = new EnumMap<>(iiIiliiIIlilii.class);
   static final class_2960 lIiIIIlIliIiIIIlIl = class_2960.method_60655(
      Iiilliiliiil<"Iiilliiliiil","UOiADIYy7LjIHw8x0d8lEsJw65wfH7oeBC3+dHNopakn+tk8j7Y=">(),
      Iiilliiliiil<"Iiilliiliiil","1QNFr+r1g9dNdcCiRcQuO3GPVetLSVGiWfVinxwkpAUmN1AOOCAekt0n9PRbojZKdnAM/2KY0xCJBFE=">()
   );
   private static final ExecutorService IliIIIlIllliIIIlIl = Executors.newSingleThreadExecutor(r -> {
      Thread var1 = new Thread(r, Iiilliiliiil<"Iiilliiliiil","JTkpKNPZvUdBosxN756C97gcQTkf+En97AzPFLcE62HUcr/bFBCczRhQ8oOQBxa5">());
      var1.setDaemon(true);
      var1.setPriority(4);
      return var1;
   });

   static liIlIiliiIlIil lIiiIiIlilli() {
      return iliIiiliiiii(iiIiliiIIlilii.lIIllliIIl);
   }

   static void iIlIlllllill(iiIiliiIIlilii knife) {
      IillIlilillIli.liiiIIllIl();
      if (knife != null) {
         iiIiliiIIlilii var1 = IillIlilillIli.IIIilIIiiIIi(knife);
         if (var1 != null && IillIlilillIli.iIlIlllllill()) {
            iIlIlllllill(var1);
         }

         IiIilllliIilll var2 = IliIlllilIi(knife);
         if (var2.lliiIlIIiiliiIlIIi == null && var2.IiiiIlIIiliiiIlIIi == null && var2.iiiiIlIIiIIIIllIIi == null) {
            try {
               var2.lliiIlIIiiliiIlIIi = CompletableFuture.supplyAsync(() -> {
                  try {
                     return IilliliilIIi(knife);
                  } catch (RuntimeException | IOException var2x) {
                     throw new CompletionException(var2x);
                  }
               }, IliIIIlIllliIIIlIl);
            } catch (RuntimeException var4) {
               var2.iiiiIlIIiIIIIllIIi = var4.toString();
            }
         }
      }
   }

   static liIlIiliiIlIil iliIiiliiiii(iiIiliiIIlilii knife) {
      if (knife == null) {
         return null;
      } else {
         IiIilllliIilll var1 = iliIIIlIlIiiIIIlIl.get(knife);
         if (var1 == null) {
            return null;
         } else {
            if (var1.lliiIlIIiiliiIlIIi != null && var1.lliiIlIIiiliiIlIIi.isDone()) {
               try {
                  var1.IiiiIlIIiliiiIlIIi = var1.lliiIlIIiiliiIlIIi.join();
               } catch (CancellationException | CompletionException var4) {
                  Throwable var3 = var4.getCause();
                  var1.iiiiIlIIiIIIIllIIi = var3 == null ? var4.toString() : var3.toString();
                  System.err
                     .println(
                        Iiilliiliiil<"Iiilliiliiil","Yz6U2gddwu+M0LMPUlM5XKjRWwXQySTikrLxiEy0">()
                           + knife.lililliIIl
                           + Iiilliiliiil<"Iiilliiliiil","3pbjMShBWgrL36s5XzdEjBHA1g2RlFIrOfTvP+6EF64x122JSSl9CLmEzAcW">()
                           + var1.iiiiIlIIiIIIIllIIi
                     );
               }

               var1.lliiIlIIiiliiIlIIi = null;
            }

            return var1.IiiiIlIIiliiiIlIIi;
         }
      }
   }

   static String IiIlliIliiIl() {
      return IIlllIlliIll(iiIiliiIIlilii.lIIllliIIl);
   }

   static boolean IlIlllIlilIl(iiIiliiIIlilii knife) {
      iliIiiliiiii(knife);
      IiIilllliIilll var1 = knife == null ? null : iliIIIlIlIiiIIIlIl.get(knife);
      return var1 != null && var1.iiiiIlIIiIIIIllIIi != null;
   }

   private iIllliIlllli() {
   }

   static String IIlllIlliIll(iiIiliiIIlilii knife) {
      if (iliIiiliiiii(knife) != null) {
         return Iiilliiliiil<"Iiilliiliiil","nLbQ+V6g1L0Gwx+PVeD7MNLgB3Mgm34xZbORrEw/wlB9">();
      } else {
         IiIilllliIilll var1 = knife == null ? null : iliIIIlIlIiiIIIlIl.get(knife);
         if (var1 == null) {
            return Iiilliiliiil<"Iiilliiliiil","zmZOWe+4bD7hCSNqTFTGyQncYaS6cbzwvDQ7Ow09Z/lcU+Q5OCc=">();
         } else {
            return var1.iiiiIlIIiIIIIllIIi != null
               ? var1.iiiiIlIIiIIIIllIIi
               : (
                  var1.lliiIlIIiiliiIlIIi != null
                     ? Iiilliiliiil<"Iiilliiliiil","qg6omNYSXXrD4kgr6Dc2Znia4adUaVBdnoDD0y6tdZkhV7Q=">()
                     : Iiilliiliiil<"Iiilliiliiil","zmZOWe+4bD7hCSNqTFTGyQncYaS6cbzwvDQ7Ow09Z/lcU+Q5OCc=">()
               );
         }
      }
   }

   static boolean IIIllIIliIIl() {
      return IlIlllIlilIl(iiIiliiIIlilii.lIIllliIIl);
   }

   private static IiIilllliIilll IliIlllilIi(iiIiliiIIlilii knife) {
      return iliIIIlIlIiiIIIlIl.computeIfAbsent(knife, k -> new IiIilllliIilll());
   }

   static void Illlllllilll() {
      iliIIIlIlIiiIIIlIl.clear();
   }

   static void liiiIIllIl() {
      iIlIlllllill(iiIiliiIIlilii.lIIllliIIl);
   }

   static liIlIiliiIlIil IilliliilIIi(iiIiliiIIlilii knife) {
      if (knife.IliIlllilIi()) {
         return new liIlIiliiIlIil(knife, lIIiilIliIIiilIl.liiiIIllIl(), lIiIIIlIliIiIIIlIl, null);
      } else {
         IlIillllllIillll var1 = lIIiilIliIIiilIl.IilliliilIIi(knife);
         lIIiilIliIIiilIl var2 = lIIiilIliIIiilIl.iIlIlllllill(knife);
         if (!lIIiilIliIIiilIl.lIiiIiIlilli(var1.iIlIlllllill())) {
            throw new IOException(Iiilliiliiil<"Iiilliiliiil","mI5lO3zSOEeKQ4aOPu1L5awYJjbJajqhc6GZlSGkhYl8ax1BmovC+Itkr3YPNsKcZHI=">() + var1.iIlIlllllill());
         } else {
            class_2960 var3 = class_2960.method_60655(
               Iiilliiliiil<"Iiilliiliiil","UOiADIYy7LjIHw8x0d8lEsJw65wfH7oeBC3+dHNopakn+tk8j7Y=">(), var1.iIlIlllllill()
            );
            class_2960 var4 = null;
            if (knife.IilliliilIIi()) {
               String var5 = var1.iIlIlllllill().substring(0, var1.iIlIlllllill().length() - 4)
                  + Iiilliiliiil<"Iiilliiliiil","UiNnRfcoRYL2lprWVOGVgyMCog21Ks2TKacng6KZX+A+0g==">();
               if (lIIiilIliIIiilIl.lIiiIiIlilli(var5)) {
                  var4 = class_2960.method_60655(Iiilliiliiil<"Iiilliiliiil","UOiADIYy7LjIHw8x0d8lEsJw65wfH7oeBC3+dHNopakn+tk8j7Y=">(), var5);
               }
            }

            return new liIlIiliiIlIil(knife, var2, var3, var4);
         }
      }
   }
}
