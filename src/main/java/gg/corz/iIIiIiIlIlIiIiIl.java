package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1297;

public final class iIIiIiIlIlIiIiIl {
   private static final Gson liIIlliIll = new GsonBuilder().setPrettyPrinting().create();
   private static final Path ilIIlliIll = FabricLoader.getInstance()
      .getConfigDir()
      .resolve(Ililllililil<"Ililllililil","eqx7N2awRAqhhY0RXW6rTSMFvbYyF1XVeaakcN416LKt/oKrErI=">());
   private static final LinkedHashSet<String> iiIIlliIll = new LinkedHashSet<>();
   private static final Path IiIIlliIll = ilIIlliIll.resolve(Ililllililil<"Ililllililil","FXJrBqGHlafqvh5vOQKbrVpH9FQgmTvm60xHd6/pAJrGdXxEgVrk6A==">());

   public static void IIlllIlliIll() {
      iiIIlliIll.clear();
      Iilllilliill();
   }

   public static boolean IlIlllIlilIl(String name) {
      long var3 = -3026704172365419351L;
      if (name == null) {
         return false;
      } else {
         String var1 = name.toLowerCase(Locale.ROOT);
         var3 ^= ((long)iiIIlliIll.removeIf(f -> f.toLowerCase(Locale.ROOT).equals(var1)) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != 0) {
            Iilllilliill();
         }

         return (boolean)((int)(var3 >>> 32));
      }
   }

   public static boolean IIIllIIliIIl(String name) {
      if (name == null) {
         return false;
      } else {
         name = name.trim();
         if (!name.isEmpty() && !IliIlllilIi(name)) {
            iiIIlliIll.add(name);
            Iilllilliill();
            return true;
         } else {
            return false;
         }
      }
   }

   public static List<String> IilliliilIIi() {
      return new ArrayList<>(iiIIlliIll);
   }

   private iIIiIiIlIlIiIiIl() {
   }

   public static void Iilllilliill() {
      try {
         Files.createDirectories(ilIIlliIll);
         JsonArray var0 = new JsonArray();

         for (String var2 : iiIIlliIll) {
            var0.add(var2);
         }

         try (BufferedWriter var7 = Files.newBufferedWriter(IiIIlliIll)) {
            liIIlliIll.toJson(var0, var7);
         }
      } catch (Exception var6) {
         System.err.println(Ililllililil<"Ililllililil","5qUNcYZ+s+3g+ogXbbibsXXYbpZwciciYxo8K1mC">() + var6.getMessage());
      }
   }

   public static boolean iliIiiliiiii() {
      return iiIIlliIll.isEmpty();
   }

   public static boolean iIlIlllllill(String name) {
      return IliIlllilIi(name);
   }

   public static boolean liiiIIllIl(class_1297 entity) {
      if (entity == null) {
         return false;
      } else {
         String var1 = entity.method_5477().getString();
         return IliIlllilIi(var1);
      }
   }

   public static void Illlllllilll() {
      if (Files.exists(IiIIlliIll)) {
         try {
            label72: {
               try (BufferedReader var0 = Files.newBufferedReader(IiIIlliIll)) {
                  JsonArray var1 = (JsonArray)liIIlliIll.fromJson(var0, JsonArray.class);
                  if (var1 != null) {
                     iiIIlliIll.clear();

                     for (JsonElement var3 : var1) {
                        if (var3 != null && var3.isJsonPrimitive()) {
                           String var4 = var3.getAsString().trim();
                           if (!var4.isEmpty()) {
                              iiIIlliIll.add(var4);
                           }
                        }
                     }
                     break label72;
                  }
               }

               return;
            }
         } catch (Exception var7) {
            System.err.println(Ililllililil<"Ililllililil","5qUNcYZ+s+3g+ogXbbibsXXYbpZwciciYxo8K1mC">() + var7.getMessage());
         }
      }
   }

   public static boolean IliIlllilIi(String name) {
      if (name != null && !name.isEmpty()) {
         String var1 = name.toLowerCase(Locale.ROOT);

         for (String var3 : iiIIlliIll) {
            if (var3.toLowerCase(Locale.ROOT).equals(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static void IiIlliIliiIl(String name) {
      if (IliIlllilIi(name)) {
         IlIlllIlilIl(name);
      } else {
         IIIllIIliIIl(name);
      }
   }

   public static int lIiiIiIlilli() {
      return iiIIlliIll.size();
   }
}
