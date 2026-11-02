package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_156;

public final class llIliiIiilIliiIi {
   private static final int iIliIIIlIi = 512;
   private static final long IiIiIIIlIi = 262144L;
   private static final int iiIiIIIlIi = 16;
   private static int liliIIIlIi;
   private static List<IIIlliIllIIlliIl> IlliIIIlIi = List.of();
   public static final String iIIiIIIlIi = "radio.json";
   private static IllIliilllIlii llliIIIlIi = IllIliilllIlii.iIlliIiIIl;
   private static final int lIliIIIlIi = 16;
   private static boolean IiliIIIlIi;
   private static final int ilIiIIIlIi = 24;
   private static final int liIiIIIlIi = 24;
   private static final int IIliIIIlIi = 64;
   private static final String IlIiIIIlIi = "/assets/corzclient/radio/stations.json";
   private static boolean illiIIIlIi;
   private static final String llIiIIIlIi = "corzclient";

   public static synchronized IllIliilllIlii iIlIlllllill() {
      return llliIIIlIi;
   }

   private static String IIillIiliIil(JsonObject o, String name, int max) {
      long var9 = 6823565430287332112L;
      long var11 = -2143138729841470962L;
      JsonElement var3 = o.get(name);
      if (var3 != null && var3.isJsonPrimitive()) {
         String var4 = var3.getAsString();
         if (var4 == null) {
            return "";
         } else {
            StringBuilder var5 = new StringBuilder(Math.min(var4.length(), max));
            var9 ^= (0L ^ var9) & -1L << 32;
            var9 ^= (0L ^ var9) & -1L >>> 32;

            while ((int)var9 < var4.length()) {
               var11 ^= ((long)var4.charAt((int)var9) << 32 ^ var11) & -1L << 32;
               if ((int)(var11 >>> 32) >= 32 && (int)(var11 >>> 32) != 127 && !Character.isWhitespace((char)((int)(var11 >>> 32)))) {
                  if ((int)(var9 >>> 32) != 0) {
                     var5.append(' ');
                  }

                  var9 ^= (0L ^ var9) & -1L << 32;
                  var5.append((char)((int)(var11 >>> 32)));
               } else {
                  var9 ^= ((long)(var5.length() > 0 ? 1 : 0) << 32 ^ var9) & -1L << 32;
               }

               var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
            }

            String var7 = IiiIliiliiIlii.liiiIIllIl(var5.toString());
            if (var7 == null) {
               return "";
            } else {
               var7 = var7.trim();
               return var7.length() > max ? var7.substring(0, max).trim() : var7;
            }
         }
      } else {
         return "";
      }
   }

   private static int Ililllililil(JsonObject name, String o) {
      JsonElement var2 = name.get(o);
      if (var2 != null && var2.isJsonPrimitive()) {
         try {
            JsonPrimitive var3 = var2.getAsJsonPrimitive();
            double var4 = var3.isNumber() ? var3.getAsDouble() : Double.parseDouble(var3.getAsString().trim());
            return !Double.isNaN(var4) && !(var4 < 1.0) ? (int)Math.min(99999.0, Math.floor(var4)) : 0;
         } catch (Throwable var6) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static String IiIlliIliiIl() {
      try {
         String var1;
         try (InputStream var0 = llIliiIiilIliiIi.class
               .getResourceAsStream(IIIilIIiiIIi<"IIIilIIiiIIi","VmhwAMXaDKuNVYvTavm2aW3H2vVJiLFqTM6FvG7miohCHxemDhNVbeRebG/phzYoRSsuttHy4E+TaD18ZOQWyXfr">())) {
            var1 = var0 == null ? null : new String(var0.readAllBytes(), StandardCharsets.UTF_8);
         }

         return var1;
      } catch (Throwable var5) {
         return null;
      }
   }

   private static Path IIIllIIliIIl() {
      try {
         FabricLoader var0 = FabricLoader.getInstance();
         Path var1 = var0.getGameDir()
            .resolve(IIIilIIiiIIi<"IIIilIIiiIIi","IKxs/s3XXkteaw8Bgbx0NuGwVChX27zVyjX/sxXlrEe5Zp+n4do=">())
            .resolve(IIIilIIiiIIi<"IIIilIIiiIIi","bkuEyPtVevfFdVwTGXkpQieP06lEExlTA5AQXQU81WwpvUZNI+k=">());
         if (Files.isRegularFile(var1)) {
            return var1;
         }

         Path var2 = var0.getConfigDir()
            .resolve(IIIilIIiiIIi<"IIIilIIiiIIi","IKxs/s3XXkteaw8Bgbx0NuGwVChX27zVyjX/sxXlrEe5Zp+n4do=">())
            .resolve(IIIilIIiiIIi<"IIIilIIiiIIi","bkuEyPtVevfFdVwTGXkpQieP06lEExlTA5AQXQU81WwpvUZNI+k=">());
         if (Files.isRegularFile(var2)) {
            return var2;
         }
      } catch (Throwable var3) {
      }

      return null;
   }

   public static synchronized int liiiIIllIl() {
      if (!IiliIIIlIi) {
         lIiiIiIlilli();
      }

      return liliIIIlIi;
   }

   static String Iiilliiliiil(String raw) {
      if (raw != null && !raw.isEmpty()) {
         try {
            URI var1 = new URI(raw);
            String var2 = var1.getScheme();
            if (var2 == null) {
               return "";
            } else {
               var2 = var2.toLowerCase(Locale.ROOT);
               if (var2.equals(IIIilIIiiIIi<"IIIilIIiiIIi","gv+tQydUUaYmZ1ukXvINo9uOI1w5JiTmHgdK/gh5ijk=">())
                  || var2.equals(IIIilIIiiIIi<"IIIilIIiiIIi","G3e2zvXTi2E5hSRog0WmuGGuUEjlGa6cxEStFjj4ZveZ">())) {
                  String var6 = var1.getHost();
                  return var6 != null && !var6.isEmpty() ? var1.toASCIIString() : "";
               } else if (!var2.equals(IIIilIIiiIIi<"IIIilIIiiIIi","HzVTMxVCiyCgJPFcXPJisl/Rvt50Gwyhij+gK44VY7XRpt0=">())) {
                  return "";
               } else {
                  String var3 = var1.getSchemeSpecificPart();
                  return var3 != null && var3.matches(IIIilIIiiIIi<"IIIilIIiiIIi","IgUbxMkFlH9CljIMxokPtZTtHj5fTFWWmDYcmHOMNmDIQ1kBm489Crog5ZEpOAk=">())
                     ? IIIilIIiiIIi<"IIIilIIiiIIi","mCurcVRbn2qvlFH+LnrnO1t1jqtPFZk7ArsiLVBlIB6zV6Kq">() + var3
                     : "";
               }
            }
         } catch (Throwable var4) {
            return "";
         }
      } else {
         return "";
      }
   }

   public static synchronized void lIiiIiIlilli() {
      IiliIIIlIi = true;
      liliIIIlIi++;
      illiIIIlIi = false;
      Path var0 = IIIllIIliIIl();
      if (var0 != null) {
         List var1 = IIlllIlliIll(IlIlllIlilIl(var0));
         if (var1 != null) {
            IlliIIIlIi = var1;
            llliIIIlIi = IllIliilllIlii.lllliIiIIl;
            return;
         }

         illiIIIlIi = true;
      }

      List var2 = IIlllIlliIll(IiIlliIliiIl());
      IlliIIIlIi = var2 == null ? List.of() : var2;
      llliIIIlIi = var2 == null ? IllIliilllIlii.iIlliIiIIl : IllIliilllIlii.IllliIiIIl;
   }

   static List<IIIlliIllIIlliIl> IIlllIlliIll(String json) {
      if (json == null) {
         return null;
      } else {
         try {
            if (!json.isEmpty() && json.charAt(0) == '\ufeff') {
               json = json.substring(1);
            }

            JsonElement var1 = JsonParser.parseString(json);
            JsonArray var2 = null;
            if (var1.isJsonArray()) {
               var2 = var1.getAsJsonArray();
            } else if (var1.isJsonObject()) {
               JsonElement var3 = var1.getAsJsonObject().get(IIIilIIiiIIi<"IIIilIIiiIIi","U2zqFaLhY08V9QVB6Z8KXcIFqecBF4iaWH+AnJ4ebA8MtfaQ">());
               if (var3 != null && var3.isJsonArray()) {
                  var2 = var3.getAsJsonArray();
               }
            }

            if (var2 == null) {
               return null;
            } else {
               ArrayList var8 = new ArrayList();

               for (JsonElement var5 : var2) {
                  if (var8.size() >= 24) {
                     break;
                  }

                  IIIlliIllIIlliIl var6 = Illlllllilll(var5);
                  if (var6 != null) {
                     var8.add(var6);
                  }
               }

               return var8.isEmpty() && !var2.isEmpty() ? null : List.copyOf(var8);
            }
         } catch (Throwable var7) {
            return null;
         }
      }
   }

   public static synchronized List<IIIlliIllIIlliIl> IliIlllilIi() {
      if (!IiliIIIlIi) {
         lIiiIiIlilli();
      }

      return IlliIIIlIi;
   }

   public static synchronized boolean IilliliilIIi() {
      return illiIIIlIi;
   }

   public static boolean iliIiiliiiii(IIIlliIllIIlliIl station) {
      if (station != null && station.IliIlllilIi()) {
         try {
            URI var1 = new URI(station.iliIiiliiiii());
            class_156.method_668().method_673(var1);
            return true;
         } catch (Throwable var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   private llIliiIiilIliiIi() {
   }

   private static String Iilllilliill(JsonObject o, String max, int name) {
      JsonElement var3 = o.get(max);
      if (var3 != null && var3.isJsonPrimitive()) {
         String var4 = var3.getAsString();
         if (var4 == null) {
            return "";
         } else {
            var4 = var4.trim();
            return var4.length() > name ? "" : var4;
         }
      } else {
         return "";
      }
   }

   private static IIIlliIllIIlliIl Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var1 = element.getAsJsonObject();
         String var2 = IIillIiliIil(var1, IIIilIIiiIIi<"IIIilIIiiIIi","BcXQAtVHxcN9fzmkwQ3pfetVkuz2ge73rd9y1Ikscmjw">(), 24);
         if (var2.isEmpty()) {
            return null;
         } else {
            String var3 = IIillIiliIil(var1, IIIilIIiiIIi<"IIIilIIiiIIi","zvpkMChTHYAcb6qhotGvv+DSNRLRgEJxFTY7uJyF">(), 16);
            if (!var3.matches(IIIilIIiiIIi<"IIIilIIiiIIi","Mg/ivrwSDAqo36Hpg/b/GJEXGXO48OLMlI9IKcaVM87I8CKXbSUvKrRrPLoTjQ==">())) {
               var3 = "";
            }

            String var4 = Iilllilliill(var1, IIIilIIiiIIi<"IIIilIIiiIIi","uPvieJHHz/k2PZbes9olegmbHH2ElLZoh3hbRXW3Tw==">(), 512);
            String var5 = Iiilliiliiil(var4);
            String var6 = var2.toLowerCase(Locale.ROOT) + IIIilIIiiIIi<"IIIilIIiiIIi","k87DyBpd1FHDvXCns97Q3PYaw+JI41udJKwTVTY=">() + var5;
            return new IIIlliIllIIlliIl(
               var2,
               var3,
               IIillIiliIil(var1, IIIilIIiiIIi<"IIIilIIiiIIi","+hKhWeKKF61ApFul1dOCPFHAiAh8qK5i/r2ishwBNuA=">(), 16),
               IIillIiliIil(var1, IIIilIIiiIIi<"IIIilIIiiIIi","t1WXsH5RIwNwU+TI+MUGWvicZxLZUKsnBebadZf7zIjn">(), 64),
               var5,
               Ililllililil(var1, IIIilIIiiIIi<"IIIilIIiiIIi","uOeCnlYOLOT1ElIDDVsjuTxvMpBmKF3/UMPuZ90w2nbysg==">()),
               IIillIiliIil(var1, IIIilIIiiIIi<"IIIilIIiiIIi","eMV/YxgAqKK4CpbrLYSAlNK16jqhRu8Y6+pgHg8TjQ==">(), 16),
               var6,
               var5.isEmpty() && !var4.isEmpty()
            );
         }
      } else {
         return null;
      }
   }

   private static String IlIlllIlilIl(Path file) {
      try {
         return Files.size(file) > 262144L ? null : Files.readString(file, StandardCharsets.UTF_8);
      } catch (Throwable var2) {
         return null;
      }
   }
}
