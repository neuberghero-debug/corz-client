package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import net.fabricmc.loader.api.FabricLoader;

public final class Iiiilliiil {
   public static final String ilIliliIiIlili = "modules.json";
   private static final String liIliliiiIlili = "corz-live-state-v1";
   private static final Map<String, String> lllliliilllili = Map.of(
      IIlilIliiIli<"IIlilIliiIli","QRD2P7o7/6Tr6i6NIk93y9BbExIufp9qPFJfpv13MGjxikBFqKwLZw==">(),
      IIlilIliiIli<"IIlilIliiIli","tgQIKlslIPL/ofb13zGdcQ4NscSwUwz3sC4Zekk6O4j0Mmus215Vvg==">(),
      IIlilIliiIli<"IIlilIliiIli","V4iLWcJw3KmMcTTXwAydzWVJxaM9Iuo81306v6M5lWy/2SXPM5Q=">(),
      IIlilIliiIli<"IIlilIliiIli","Cmdrj5d/jyMjsiHbfKIgVTKZJfqmWfPqF4PuucOMgsVS/f3Dzg==">()
   );
   private static final Gson iIlliliIlllili = new GsonBuilder().setPrettyPrinting().create();
   private static final String IIllililIllili = "live-state";

   static iilIiIiIIiIiIi IilliliilIIi(Path modules, List<ilIllIiIll> persist, Runnable verify, boolean dir) {
      Path var4 = modules.resolve(IIlilIliiIli<"IIlilIliiIli","2gdcsg6FxkSTCLK/Oxlc/xUaYNypo/Lk7WJKP5d3zU/j3g9A1rLfjQ==">());
      if (!Files.exists(var4)) {
         return iilIiIiIIiIiIi.IliIilliilliIillii;
      } else {
         byte[] var5;
         try {
            var5 = Files.readAllBytes(var4);
         } catch (IOException var10) {
            System.err.println(IIlilIliiIli<"IIlilIliiIli","S0qwU6MuIYv0Bc6Kr/7NmqFJ1OqU4FXZte7wApUS">() + var10.getMessage());
            return iilIiIiIIiIiIi.IliIilliilliIillii;
         }

         JsonObject var6 = lIiiIiIlilli(var5);
         if (!dir) {
            if (var6 != null) {
               IlIlllIlilIl(var6, persist);
            }

            return iilIiIiIIiIiIi.iliIilliiIiiIillii;
         } else {
            byte[] var7 = Illlllllilll(modules);
            if (var7 == null) {
               if (var6 == null) {
                  return iilIiIiIIiIiIi.IliIilliilliIillii;
               } else {
                  IlIlllIlilIl(var6, persist);
                  IIlllIlliIll(modules, var5);
                  return iilIiIiIIiIiIi.liiIilliiiiiIillii;
               }
            } else if (Arrays.equals(var7, var5)) {
               if (var6 != null) {
                  IlIlllIlilIl(var6, persist);
               }

               return iilIiIiIIiIiIi.IIIlilliilIIlillii;
            } else {
               JsonObject var8 = lIiiIiIlilli(var7);
               if (var8 != null) {
                  IlIlllIlilIl(var8, persist);
               }

               if (var6 == null) {
                  verify.run();
                  return iilIiIiIIiIiIi.iIIlilliiIlIlillii;
               } else {
                  IIIllllllIIlllll var9 = iilIliIlIIiIliIl.Iiiiliiiiiii(
                     iilIliIlIIiIliIl.Iilllilliill(var6, persist), llliiillilliiill.iIlIlllllill(), persist, verify
                  );
                  if (var9.IlililIill != null) {
                     System.err.println(IIlilIliiIli<"IIlilIliiIli","S0qwU6MuIYv0Bc6Kr/7NmqFJ1OqU4FXZte7wApUS">() + var9.IlililIill);
                  } else if (var9.iIlIlllllill() != null) {
                  }

                  return iilIiIiIIiIiIi.iIIlilliiIlIlillii;
               }
            }
         }
      }
   }

   static byte[] Illlllllilll(Path dir) {
      try {
         String var1 = Ililllililil(dir);
         Path var2 = IIillIiliIil(var1);
         if (!Files.isRegularFile(var2)) {
            return null;
         } else {
            JsonObject var3 = JsonParser.parseString(Files.readString(var2, StandardCharsets.UTF_8)).getAsJsonObject();
            if (!var1.equals(Iiilliiliiil(var3, IIlilIliiIli<"IIlilIliiIli","V9DssIMCD+syG2V+0Avdkh+sRXP3I3krgfoBcHeCKw==">()))) {
               return null;
            } else {
               String var4 = Iiilliiliiil(var3, IIlilIliiIli<"IIlilIliiIli","VKz8oDXpmbKABBQ9/tFqaN4fIcPI5xd07G4voOrDE8/K">());
               String var5 = Iiilliiliiil(var3, IIlilIliiIli<"IIlilIliiIli","p5+rYEy7zPwW0AZJeJimZT5g/ydCU9rlhUuzzKG1xg==">());
               if (var4 != null && var5 != null) {
                  byte[] var6 = IlIillIiilIi(Base64.getDecoder().decode(var4));
                  String var7 = lilllIiliilllIil.IiiIlliiIl(
                     IIlilIliiIli<"IIlilIliiIli","LQNm6gmeBb33wkB2/mvcOMfRcyF30dgfex1WVvC+6ggH1hIrdPTGC7M3XARW3Q==">(), var1, var6
                  );
                  if (var7 == null) {
                     return null;
                  } else {
                     return MessageDigest.isEqual(var7.getBytes(StandardCharsets.UTF_8), var5.getBytes(StandardCharsets.UTF_8)) ? var6 : null;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (Exception var8) {
         return null;
      }
   }

   private static byte[] IlIillIiilIi(byte[] packed) {
      byte[] var2;
      try (GZIPInputStream var1 = new GZIPInputStream(new ByteArrayInputStream(packed))) {
         var2 = var1.readAllBytes();
      }

      return var2;
   }

   static JsonElement IIIllIIliIIl(JsonObject module, ilIllIiIll root) {
      JsonElement var2 = module.get(root.IilliliilIIi());
      if (var2 != null) {
         return var2;
      } else {
         String var3 = lllliliilllili.get(root.IilliliilIIi());
         return var3 == null ? null : module.get(var3);
      }
   }

   public static iilIiIiIIiIiIi iIlIlllllill(Path persist, List<ilIllIiIll> dir, Runnable modules) {
      return IilliliilIIi(persist, dir, modules, !IiIiliIiiiIi());
   }

   private static byte[] IIIilIIiiIIi(byte[] raw) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try (GZIPOutputStream var2 = new GZIPOutputStream(var1)) {
         var2.write(raw);
      }

      return var1.toByteArray();
   }

   static Path Iilllilliill(Path dir) {
      return IIillIiliIil(Ililllililil(dir));
   }

   static synchronized void liiiIIllIl(Path dir, List<ilIllIiIll> seal, boolean modules) {
      Files.createDirectories(dir);
      byte[] var3 = iIlliliIlllili.toJson(iliIiiliiiii(seal)).getBytes(StandardCharsets.UTF_8);
      Files.write(dir.resolve(IIlilIliiIli<"IIlilIliiIli","2gdcsg6FxkSTCLK/Oxlc/xUaYNypo/Lk7WJKP5d3zU/j3g9A1rLfjQ==">()), var3);
      if (modules) {
         IIlllIlliIll(dir, var3);
      }
   }

   private static JsonObject iliIiiliiiii(List<ilIllIiIll> modules) {
      JsonObject var1 = new JsonObject();

      for (ilIllIiIll var3 : modules) {
         JsonObject var4 = new JsonObject();
         var4.addProperty(IIlilIliiIli<"IIlilIliiIli","HH3EBk9rAat62/ejsGj8Pzi7X0sZnRlNCuDCRh32G/7Wiy0=">(), var3.IliIlllilIi());
         var4.addProperty(IIlilIliiIli<"IIlilIliiIli","C0wIB0h/Xjt1EgHIujbffTWCf62COeqzyeh4GMh2k4wJGJk=">(), var3.IIIilIIiiIIi());
         JsonObject var5 = new JsonObject();

         for (IilliIllilliIl var7 : var3.IiIlliIliiIl()) {
            JsonElement var8 = var7.IIlllIlliIll();
            var5.add(var7.IliIlllilIi(), (JsonElement)(var8 != null ? var8 : JsonNull.INSTANCE));
         }

         var4.add(IIlilIliiIli<"IIlilIliiIli","m70oqYxuzrKNwlsHvTbUPPq7g7LZUWVbs6RLB8ZHE7oimH9u">(), var5);
         JsonElement var9 = var3.IIiIllIiIl();
         if (var9 != null) {
            var4.add(IIlilIliiIli<"IIlilIliiIli","fkJciFUxOn2KLtKMtWn7H/zxhzLUY782BXtBQPIOlDA3">(), var9);
         }

         var1.add(var3.IilliliilIIi(), var4);
      }

      return var1;
   }

   private static String Iiilliiliiil(JsonObject o, String k) {
      return o.has(k) && o.get(k).isJsonPrimitive() ? o.get(k).getAsString() : null;
   }

   private static boolean IiIiliIiiiIi() {
      try {
         return FabricLoader.getInstance().isDevelopmentEnvironment();
      } catch (Throwable var1) {
         return false;
      }
   }

   private static void IiIlliIliiIl(IilliIllilliIl element, JsonElement setting) {
      if (!element.IlIlllIlilIl()) {
         try {
            element.Illlllllilll(setting);
         } catch (Exception var3) {
            System.err
               .println(
                  IIlilIliiIli<"IIlilIliiIli","S0qwU6MuIYv0Bc6Kr/7NmqFJ1OqU4FXZte7wApUS">()
                     + element.IliIlllilIi()
                     + IIlilIliiIli<"IIlilIliiIli","EeQNK1HZnPmOrhyESVf8oHwch5kN9RbO1Wh+oL+8">()
                     + var3.getMessage()
               );
         }
      }
   }

   public static void IliIlllilIi(Path modules, List<ilIllIiIll> dir) {
      liiiIIllIl(modules, dir, !IiIiliIiiiIi());
   }

   private static JsonObject lIiiIiIlilli(byte[] bytes) {
      try {
         return (JsonObject)iIlliliIlllili.fromJson(new String(bytes, StandardCharsets.UTF_8), JsonObject.class);
      } catch (Exception var2) {
         System.err.println(IIlilIliiIli<"IIlilIliiIli","S0qwU6MuIYv0Bc6Kr/7NmqFJ1OqU4FXZte7wApUS">() + var2.getMessage());
         return null;
      }
   }

   private static Path IIillIiliIil(String label) {
      String var1 = lIlIllIliIlIllIl.IlIlllIlilIl(label.getBytes(StandardCharsets.UTF_8)).substring(0, 32);
      return lilllIiliilllIil.iiiIlIIIll()
         .resolve(IIlilIliiIli<"IIlilIliiIli","gX8h0OM+BHEUoTDE5RwZxWa1hapZYYXweBkmaqTKhz6ys7hIk8o=">())
         .resolve(var1 + IIlilIliiIli<"IIlilIliiIli","4cAyaI+7oTZUYr4GtNtMUS4/wm2ddqxfEk98+/rqkv6x">());
   }

   private static void IIlllIlliIll(Path bytes, byte[] dir) {
      try {
         String var2 = Ililllililil(bytes);
         String var3 = lilllIiliilllIil.IiiIlliiIl(IIlilIliiIli<"IIlilIliiIli","LQNm6gmeBb33wkB2/mvcOMfRcyF30dgfex1WVvC+6ggH1hIrdPTGC7M3XARW3Q==">(), var2, dir);
         if (var3 == null) {
            return;
         }

         JsonObject var4 = new JsonObject();
         var4.addProperty(IIlilIliiIli<"IIlilIliiIli","V9DssIMCD+syG2V+0Avdkh+sRXP3I3krgfoBcHeCKw==">(), var2);
         var4.addProperty(IIlilIliiIli<"IIlilIliiIli","p5+rYEy7zPwW0AZJeJimZT5g/ydCU9rlhUuzzKG1xg==">(), var3);
         var4.addProperty(IIlilIliiIli<"IIlilIliiIli","VKz8oDXpmbKABBQ9/tFqaN4fIcPI5xd07G4voOrDE8/K">(), Base64.getEncoder().encodeToString(IIIilIIiiIIi(dir)));
         lilllIiliilllIil.iiIIlIIlIl(IIillIiliIil(var2), var4.toString().getBytes(StandardCharsets.UTF_8));
      } catch (Exception var5) {
         System.err.println(IIlilIliiIli<"IIlilIliiIli","S0qwU6MuIYv0Bc6Kr/7NmqFJ1OqU4FXZte7wApUS">() + var5.getMessage());
      }
   }

   private static void IlIlllIlilIl(JsonObject modules, List<ilIllIiIll> root) {
      long var9 = -7014600424310033780L;

      try {
         for (ilIllIiIll var3 : root) {
            JsonElement var4 = IIIllIIliIIl(modules, var3);
            if (var4 != null) {
               JsonObject var5 = var4.getAsJsonObject();
               if (var5.has(IIlilIliiIli<"IIlilIliiIli","C0wIB0h/Xjt1EgHIujbffTWCf62COeqzyeh4GMh2k4wJGJk=">())) {
                  var3.IlIillIiilIi(var5.get(IIlilIliiIli<"IIlilIliiIli","C0wIB0h/Xjt1EgHIujbffTWCf62COeqzyeh4GMh2k4wJGJk=">()).getAsInt());
               }

               if (var5.has(IIlilIliiIli<"IIlilIliiIli","m70oqYxuzrKNwlsHvTbUPPq7g7LZUWVbs6RLB8ZHE7oimH9u">())) {
                  JsonObject var6 = var5.getAsJsonObject(IIlilIliiIli<"IIlilIliiIli","m70oqYxuzrKNwlsHvTbUPPq7g7LZUWVbs6RLB8ZHE7oimH9u">());

                  for (IilliIllilliIl var8 : var3.IiIlliIliiIl()) {
                     if (var6.has(var8.IliIlllilIi())) {
                        IiIlliIliiIl(var8, var6.get(var8.IliIlllilIi()));
                     }
                  }
               }

               if (var5.has(IIlilIliiIli<"IIlilIliiIli","fkJciFUxOn2KLtKMtWn7H/zxhzLUY782BXtBQPIOlDA3">())) {
                  var3.iIiIlIliIl(var5.get(IIlilIliiIli<"IIlilIliiIli","fkJciFUxOn2KLtKMtWn7H/zxhzLUY782BXtBQPIOlDA3">()));
               }

               var3.IiiIlliiIl();
               if (var5.has(IIlilIliiIli<"IIlilIliiIli","HH3EBk9rAat62/ejsGj8Pzi7X0sZnRlNCuDCRh32G/7Wiy0=">())) {
                  var9 ^= ((long)var5.get(IIlilIliiIli<"IIlilIliiIli","HH3EBk9rAat62/ejsGj8Pzi7X0sZnRlNCuDCRh32G/7Wiy0=">()).getAsBoolean() << 32 ^ var9)
                     & -1L << 32;
                  if ((int)(var9 >>> 32) != var3.IliIlllilIi()) {
                     var3.IIillIiliIil((boolean)((int)(var9 >>> 32)));
                  }
               }
            }
         }
      } catch (Exception var11) {
         System.err.println(IIlilIliiIli<"IIlilIliiIli","S0qwU6MuIYv0Bc6Kr/7NmqFJ1OqU4FXZte7wApUS">() + var11.getMessage());
      }
   }

   private static String Ililllililil(Path dir) {
      Path var1 = dir.toAbsolutePath().normalize();

      try {
         var1 = var1.toRealPath();
      } catch (IOException var3) {
      }

      return var1.toString();
   }

   private Iiiilliiil() {
   }
}
