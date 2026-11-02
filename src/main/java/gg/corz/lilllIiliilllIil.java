package gg.corz;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class lilllIiliilllIil {
   private static volatile Path iIiIiIlIil = null;
   private static final String iilIiIlIil = "preset-seal.key";
   private static final String IIiIiIlIil = "corz-own-preset-v1";
   private static Path lIiIiIlIil = null;
   private static volatile Path IliIiIlIil;
   private static final String IilIiIlIil = "sources.json";
   private static volatile byte[] IiiIiIlIil;
   private static volatile Path iliIiIlIil;
   private static volatile Path lliIiIlIil;
   private static final String lilIiIlIil = "ownSeal";
   public static final String IllIiIlIil = ".corz.json";
   private static final String lllIiIlIil = "active.txt";
   private static final String illIiIlIil = ".backup.corz.json";

   public static String Iilililiiili(String slug) {
      lIlIllIliIlIllIl var1 = iliIiiliiiii(slug);
      if (var1 == null) {
         return null;
      } else {
         lIlIllIliIlIllIl var2 = var1.IIlllIlliIll();
         var2.iiililIiIl = (var1.iiililIiIl == null ? iIIilIlIil<"iIIilIlIil","Rvjoz+KfA5A66luOIWrtG557CMJJXiDxJvXMxXA3h0yUOg==">() : var1.iiililIiIl)
            + iIIilIlIil<"iIIilIlIil","o+abkLljRWv+VodxoNGZFRyjlIZp5zCU6p8yzMf+vrbVy3M=">();
         var2.iIIiilIiIl = illIlIilIl();
         return IIlllIlliIll(var2);
      }
   }

   private static void IIiIllIiIl(String slug) {
      JsonObject var1 = IIllllIlll();
      if (var1.has(slug)
         && var1.get(slug).isJsonObject()
         && var1.getAsJsonObject(slug).has(iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">())) {
         var1.getAsJsonObject(slug).remove(iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">());
         iIlllIllll(var1);
      }
   }

   private static JsonObject IIllllIlll() {
      try {
         Path var0 = iIlIlllllill().resolve(iIIilIlIil<"iIIilIlIil","nv7wOzIyysLHD1tq+4GXhwOEjqiwwfCFb7fhB0C5/PfHU/VUErEvCw==">());
         if (!Files.exists(var0)) {
            return new JsonObject();
         } else {
            JsonElement var1 = JsonParser.parseString(Files.readString(var0));
            return var1.isJsonObject() ? var1.getAsJsonObject() : new JsonObject();
         }
      } catch (Exception var2) {
         return new JsonObject();
      }
   }

   private static byte[] IlIllllIll(Path file) {
      try {
         if (!Files.isRegularFile(file)) {
            return null;
         } else {
            String var1 = Files.readString(file, StandardCharsets.US_ASCII).trim();
            return var1.length() == 64 ? HexFormat.of().parseHex(var1) : null;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   public static String IIIIllIIIl() {
      try {
         Path var0 = iIlIlllllill().resolve(iIIilIlIil<"iIIilIlIil","6AFZjwH8E1JE5XDUhZ9ds04HhJIkZvXtZNw+XkQldC+AIXLCkCo=">());
         if (!Files.exists(var0)) {
            return null;
         } else {
            String var1 = Files.readString(var0).trim();
            return var1.isEmpty() ? null : var1;
         }
      } catch (IOException var2) {
         return null;
      }
   }

   public static boolean IlIlllIlilIl(String slug) {
      try {
         Path var1 = IiIIlliIIl(slug);
         return Files.isRegularFile(var1) && iIiIlIliIl(slug, Files.readAllBytes(var1));
      } catch (IOException var2) {
         return false;
      }
   }

   private lilllIiliilllIil() {
   }

   private static byte[] lIIlliIIll() {
      Path var0 = ilIllIiIll();
      byte[] var1 = IiiIiIlIil;
      if (var1 != null && var0.equals(iliIiIlIil)) {
         return var1;
      } else {
         synchronized (lilllIiliilllIil.class) {
            byte[] var3 = IlIllllIll(var0);
            if (var3 == null) {
               byte[] var4 = new byte[32];
               new SecureRandom().nextBytes(var4);

               try {
                  iiIIlIIlIl(var0, HexFormat.of().formatHex(var4).getBytes(StandardCharsets.US_ASCII));
               } catch (IOException var7) {
                  return null;
               }

               var3 = IlIllllIll(var0);
            }

            if (var3 != null) {
               IiiIiIlIil = var3;
               iliIiIlIil = var0;
            }

            return var3;
         }
      }
   }

   public static void iilllIIill(String m, IillilIilillilIi slug) {
      JsonObject var2 = IIllllIlll();
      JsonObject var3 = var2.has(m) && var2.get(m).isJsonObject() ? var2.getAsJsonObject(m) : null;
      JsonObject var4 = new JsonObject();
      var4.addProperty(iIIilIlIil<"iIIilIlIil","Fbv7jXECBdsF0iRMpWjJOfpn+wrdO3lnS5bDSd+xARb/1A==">(), slug.lllIillIIi.name());
      if (slug.illIillIIi != null) {
         var4.addProperty(iIIilIlIil<"iIIilIlIil","T9IBne6deboJFX+gvR+FwxlQpLiEIouQwzmQgcWAtiNq6TmS7Zn8">(), slug.illIillIIi);
      }

      if (slug.IilIillIIi != null) {
         var4.addProperty(iIIilIlIil<"iIIilIlIil","dStC63AEuaHA6uCpYOO0+sD/4g+ay0D3himyyf3dxB+WuVKoPZvYrAONV/D8Ag==">(), slug.IilIillIIi);
      }

      if (slug.lilIillIIi != null) {
         var4.addProperty(iIIilIlIil<"iIIilIlIil","gfrxO0UyYJZKPn7e5HuFudSEGa511Z3DExZRhLu3rJCNa3YFNpQWcfyOAw==">(), slug.lilIillIIi);
      }

      if (slug.iilIillIIi != null) {
         var4.addProperty(iIIilIlIil<"iIIilIlIil","BUi/PvaWVtAfPevflcIiEuQtaUnp05vzS6AiyScnZAi/asxBIulxWA==">(), slug.iilIillIIi);
      }

      if (slug.lllIillIIi == ilIIIllIiIIIll.IlIIlIIilllIIlIIil
         && var3 != null
         && var3.has(iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">())) {
         var4.add(
            iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">(),
            var3.get(iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">())
         );
      }

      var2.add(m, var4);
      iIlllIllll(var2);
   }

   private static boolean iIiIlIliIl(String bytes, byte[] slug) {
      JsonObject var2 = IIllllIlll();
      if (var2.has(bytes) && var2.get(bytes).isJsonObject()) {
         JsonObject var3 = var2.getAsJsonObject(bytes);
         if (!ilIIIllIiIIIll.IlIIlIIilllIIlIIil.name().equals(lIilliIill(var3, iIIilIlIil<"iIIilIlIil","Fbv7jXECBdsF0iRMpWjJOfpn+wrdO3lnS5bDSd+xARb/1A==">()))) {
            return false;
         } else {
            String var4 = lIilliIill(var3, iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">());
            if (var4 == null) {
               return false;
            } else {
               String var5 = lliIliliIl(bytes, slug);
               return var5 != null && MessageDigest.isEqual(var5.getBytes(StandardCharsets.UTF_8), var4.getBytes(StandardCharsets.UTF_8));
            }
         }
      } else {
         return false;
      }
   }

   public static byte[] llIIlilIIl() {
      Path var0 = iIlIlllllill().resolve(iIIilIlIil<"iIIilIlIil","U0c/9wj94iT0U5HKIH3flu7k1UcT6e/G/85OEy1wsyEyMUseQhyesG1xtg83">());
      return Files.exists(var0) ? Files.readAllBytes(var0) : null;
   }

   public static void Iiiiliiiiiii(String slug) {
      iiIIlIIlIl(
         iIlIlllllill().resolve(iIIilIlIil<"iIIilIlIil","6AFZjwH8E1JE5XDUhZ9ds04HhJIkZvXtZNw+XkQldC+AIXLCkCo=">()), slug.getBytes(StandardCharsets.UTF_8)
      );
   }

   public static Path IiIIlliIIl(String slug) {
      return iIlIlllllill().resolve(slug + iIIilIlIil<"iIIilIlIil","smzhRwlG2x8Fkc+J4auBIa9tkumoLxqBuakeWE8NToTQ9xi9ckg=">());
   }

   private static void lilIliilIl(String fresh, byte[] slug, boolean bytes) {
      JsonObject var3 = IIllllIlll();
      JsonObject var4 = !bytes && var3.has(fresh) && var3.get(fresh).isJsonObject() ? var3.getAsJsonObject(fresh) : new JsonObject();
      var4.addProperty(iIIilIlIil<"iIIilIlIil","Fbv7jXECBdsF0iRMpWjJOfpn+wrdO3lnS5bDSd+xARb/1A==">(), ilIIIllIiIIIll.IlIIlIIilllIIlIIil.name());
      String var5 = lliIliliIl(fresh, slug);
      if (var5 != null) {
         var4.addProperty(iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">(), var5);
      } else {
         var4.remove(iIIilIlIil<"iIIilIlIil","YQu6EjBSlHbjZvKSqw7KKasTCMDizhyAWujjVMszGJLt5Io=">());
      }

      var3.add(fresh, var4);
      iIlllIllll(var3);
   }

   private static String lliIliliIl(String slug, byte[] bytes) {
      return IiiIlliiIl(iIIilIlIil<"iIIilIlIil","ULNqY7D1ydbAI+n8FE6wqo+4PVkzMxPngzgYBVq82TqzvjMjvF9+ZYI0MqLYYQ==">(), slug, bytes);
   }

   private static void IlIillIiilIi(String slug, lIlIllIliIlIllIl fresh, boolean profile) {
      IiIiliIiiiIi(fresh);
      byte[] var3 = fresh.iIlIlllllill();
      IIiIllIiIl(slug);
      iiIIlIIlIl(IiIIlliIIl(slug), var3);
      lilIliilIl(slug, var3, profile);
   }

   static Path iiiIlIIIll() {
      return ilIllIiIll().toAbsolutePath().getParent();
   }

   public static List<IlIIillllIIill> lIiiIiIlilli() {
      ArrayList var0 = new ArrayList();
      Path var1 = iIlIlllllill();

      try (Stream var2 = Files.list(var1)) {
         var2.filter(p -> p.getFileName().toString().endsWith(iIIilIlIil<"iIIilIlIil","smzhRwlG2x8Fkc+J4auBIa9tkumoLxqBuakeWE8NToTQ9xi9ckg=">()))
            .filter(p -> !p.getFileName().toString().equals(iIIilIlIil<"iIIilIlIil","U0c/9wj94iT0U5HKIH3flu7k1UcT6e/G/85OEy1wsyEyMUseQhyesG1xtg83">()))
            .forEach(out -> {
               try {
                  byte[] var2x = Files.readAllBytes(out);
                  lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(var2x, null);
                  if (var3 != null) {
                     var0.add(new IlIIillllIIill(out, var3));
                  }
               } catch (IOException var4) {
               }
            });
      } catch (IOException var7) {
      }

      var0.sort(Comparator.<IlIIillllIIill, String>comparing(e -> e.IIIIilIIilIIIilIIi.IlIiilIiIl == null ? "" : e.IIIIilIIilIIIilIIi.IlIiilIiIl).reversed());
      return var0;
   }

   public static liiilIliiiilIl IIIllIIliIIl(String slug) {
      Path var1 = IiIIlliIIl(slug);
      if (!Files.exists(var1)) {
         return null;
      } else {
         byte[] var2 = Files.readAllBytes(var1);
         lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(var2, null);
         return var3 == null ? null : new liiilIliiiilIl(slug, var3, iIiIlIliIl(slug, var2));
      }
   }

   private static String lIlIliIlIl(String name) {
      long var4 = -684844606349530624L;
      String var1 = IllIllllIl(name);
      String var2 = var1;
      var4 ^= (8589934592L ^ var4) & -1L << 32;

      while (Files.exists(IiIIlliIIl(var2))) {
         StringBuilder var10000 = new StringBuilder().append(var1).append(iIIilIlIil<"iIIilIlIil","19Z5Ad96HjlllLMYh5eqAoXPyG4WyHMVwb7XELM=">());
         int var10001 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var2 = var10000.append(var10001).toString();
      }

      return var2;
   }

   private static void iIlllIllll(JsonObject all) {
      iiIIlIIlIl(
         iIlIlllllill().resolve(iIIilIlIil<"iIIilIlIil","nv7wOzIyysLHD1tq+4GXhwOEjqiwwfCFb7fhB0C5/PfHU/VUErEvCw==">()),
         new GsonBuilder().setPrettyPrinting().create().toJson(all).getBytes(StandardCharsets.UTF_8)
      );
   }

   public static boolean IiIlliIliiIl(String slug) {
      return Files.exists(IiIIlliIIl(slug));
   }

   private static Path ilIllIiIll() {
      Path var0 = iIiIiIlIil;
      if (var0 != null) {
         return var0;
      } else if (lIiIiIlIil != null) {
         return lIiIiIlIil.resolve(iIIilIlIil<"iIIilIlIil","7wt6x5dEYErOpYvov5aX2RiimuxngU+ldiMVCK1qZZ45N9LuC2K5iOfN0g==">());
      } else {
         Path var1 = liIlliiIll();
         return (var1 != null ? var1 : IilliliilIIi())
            .resolve(iIIilIlIil<"iIIilIlIil","9PDJFyqwF4RbmFx+OxWj7Xnv7Asykk2Wc63UNSjFPM2BpQtj9DY=">())
            .resolve(iIIilIlIil<"iIIilIlIil","7wt6x5dEYErOpYvov5aX2RiimuxngU+ldiMVCK1qZZ45N9LuC2K5iOfN0g==">());
      }
   }

   public static IillilIilillilIi lllllillll(String slug) {
      IillilIilillilIi var1 = new IillilIilillilIi();
      JsonObject var2 = IIllllIlll();
      if (var2.has(slug) && var2.get(slug).isJsonObject()) {
         JsonObject var3 = var2.getAsJsonObject(slug);

         try {
            var1.lllIillIIi = ilIIIllIiIIIll.valueOf(var3.get(iIIilIlIil<"iIIilIlIil","Fbv7jXECBdsF0iRMpWjJOfpn+wrdO3lnS5bDSd+xARb/1A==">()).getAsString());
         } catch (Exception var5) {
         }

         var1.illIillIIi = lIilliIill(var3, iIIilIlIil<"iIIilIlIil","T9IBne6deboJFX+gvR+FwxlQpLiEIouQwzmQgcWAtiNq6TmS7Zn8">());
         var1.IilIillIIi = lIilliIill(var3, iIIilIlIil<"iIIilIlIil","dStC63AEuaHA6uCpYOO0+sD/4g+ay0D3himyyf3dxB+WuVKoPZvYrAONV/D8Ag==">());
         var1.lilIillIIi = lIilliIill(var3, iIIilIlIil<"iIIilIlIil","gfrxO0UyYJZKPn7e5HuFudSEGa511Z3DExZRhLu3rJCNa3YFNpQWcfyOAw==">());
         var1.iilIillIIi = lIilliIill(var3, iIIilIlIil<"iIIilIlIil","BUi/PvaWVtAfPevflcIiEuQtaUnp05vzS6AiyScnZAi/asxBIulxWA==">());
      }

      return var1;
   }

   static String Iiilliiliiil(lIlIllIliIlIllIl profile) {
      String var1 = lIlIliIlIl(profile.iiililIiIl);
      IlIillIiilIi(var1, profile, true);
      return var1;
   }

   public static String Illlllllilll(lIlIllIliIlIllIl profile, String communityId) {
      String var2 = Iilllilliill(communityId);
      return IIillIiliIil(var2 != null && !IlIlllIlilIl(var2) ? var2 : lIlIliIlIl(profile.iiililIiIl), profile);
   }

   public static String Iilllilliill(String communityId) {
      if (communityId != null && !communityId.isBlank()) {
         for (Map.Entry var2 : IIllllIlll().entrySet()) {
            if (((JsonElement)var2.getValue()).isJsonObject()) {
               String var3 = lIilliIill(
                  ((JsonElement)var2.getValue()).getAsJsonObject(), iIIilIlIil<"iIIilIlIil","T9IBne6deboJFX+gvR+FwxlQpLiEIouQwzmQgcWAtiNq6TmS7Zn8">()
               );
               if (communityId.equals(var3) && IiIlliIliiIl((String)var2.getKey())) {
                  return (String)var2.getKey();
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static void Ililllililil(String slug, lIlIllIliIlIllIl profile) {
      IIillIiliIil(slug, profile);
   }

   public static void Iillllilll(String oldSlug, String newSlug) {
      JsonObject var2 = IIllllIlll();
      if (var2.has(oldSlug)) {
         JsonElement var3 = var2.remove(oldSlug);
         var2.add(newSlug, var3);
         iIlllIllll(var2);
      }
   }

   private static String IIillIiliIil(String slug, lIlIllIliIlIllIl profile) {
      IiIiliIiiiIi(profile);
      IIiIllIiIl(slug);
      iiIIlIIlIl(IiIIlliIIl(slug), profile.iIlIlllllill());
      return slug;
   }

   public static lIlIllIliIlIllIl iliIiiliiiii(String slug) {
      Path var1 = IiIIlliIIl(slug);
      return !Files.exists(var1) ? null : lIlIllIliIlIllIl.lIiiIiIlilli(Files.readAllBytes(var1), null);
   }

   public static Path iIlIlllllill() {
      Path var0 = lIiIiIlIil != null
         ? lIiIiIlIil
         : IilliliilIIi()
            .resolve(iIIilIlIil<"iIIilIlIil","9PDJFyqwF4RbmFx+OxWj7Xnv7Asykk2Wc63UNSjFPM2BpQtj9DY=">())
            .resolve(iIIilIlIil<"iIIilIlIil","qSliViO1968Wud573IrqK7OzPnLXplymRjrZJiXbXj2zEP4=">());
      if (!var0.equals(lliIiIlIil)) {
         try {
            Files.createDirectories(var0);
            lliIiIlIil = var0;
         } catch (IOException var2) {
         }
      }

      return var0;
   }

   public static lIlIllIliIlIllIl Iliilliiilii(byte[] resultOut, iliiIIllIiiiIIll[] bytes, String[] slugOut) {
      lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(resultOut, bytes);
      if (var3 == null) {
         return null;
      } else {
         String var4 = IIlllIlliIll(var3);
         if (slugOut != null && slugOut.length > 0) {
            slugOut[0] = var4;
         }

         return var3;
      }
   }

   public static boolean IIlilIliiIli(String slug) {
      long var3 = -5370982412892754174L;
      var3 ^= ((long)Files.deleteIfExists(IiIIlliIIl(slug)) << 32 ^ var3) & -1L << 32;

      try {
         JsonObject var2 = IIllllIlll();
         if (var2.remove(slug) != null) {
            iIlllIllll(var2);
         }
      } catch (IOException var5) {
      }

      return (boolean)((int)(var3 >>> 32));
   }

   private static String illIlIilIl() {
      return OffsetDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS).toString();
   }

   public static String IIlllIlliIll(lIlIllIliIlIllIl profile) {
      return IIillIiliIil(lIlIliIlIl(profile.iiililIiIl), profile);
   }

   public static void IliIlllilIi(Path dir) {
      lIiIiIlIil = dir;
   }

   static String IiiIlliiIl(String label, String bytes, byte[] context) {
      byte[] var3 = lIIlliIIll();
      if (var3 == null) {
         return null;
      } else {
         try {
            Mac var4 = Mac.getInstance(iIIilIlIil<"iIIilIlIil","bKJPqOVx2tkN8L9/jzYwo2mDiBuzT/D/LvYdrRv1kRiCPpBhkfU=">());
            var4.init(new SecretKeySpec(var3, iIIilIlIil<"iIIilIlIil","bKJPqOVx2tkN8L9/jzYwo2mDiBuzT/D/LvYdrRv1kRiCPpBhkfU=">()));
            var4.update(
               (label
                     + iIIilIlIil<"iIIilIlIil","/wZmW4vjr8I/kemz1/HiOk39Y8ORFkfrjr+vK+M=">()
                     + bytes
                     + iIIilIlIil<"iIIilIlIil","/wZmW4vjr8I/kemz1/HiOk39Y8ORFkfrjr+vK+M=">())
                  .getBytes(StandardCharsets.UTF_8)
            );
            return HexFormat.of().formatHex(var4.doFinal(context));
         } catch (Exception var5) {
            return null;
         }
      }
   }

   public static lIlIllIliIlIllIl IIiilIiiiIii(byte[] resultOut, iliiIIllIiiiIIll[] bytes) {
      return Iliilliiilii(resultOut, bytes, null);
   }

   private static Path liIlliiIll() {
      try {
         String var0 = System.getProperty(iIIilIlIil<"iIIilIlIil","hu2w22+pGlY29PQj6pNoYKiOAPWaBIOSmA31X+iv/uLHnFA=">(), "").toLowerCase(Locale.ROOT);
         if (var0.contains(iIIilIlIil<"iIIilIlIil","fWwaTg1auFK4vxMqSCSTDXMtv5wycBnW4aqY/TPPTQ==">())) {
            String var1 = System.getenv(iIIilIlIil<"iIIilIlIil","MMC/pJRs+5rsgZ4Pi26r3D8rdG3dM7tNH7FpdFSbIX3OwiE=">());
            if (var1 != null && !var1.isBlank()) {
               return Path.of(var1);
            }
         }

         String var4 = System.getProperty(iIIilIlIil<"iIIilIlIil","NZTdHJxfDgLU6laVaS7f75FiyxSY2A2j+Od91hCnjD8CPUJ3PQ==">());
         if (var4 == null || var4.isBlank()) {
            return null;
         } else if (var0.contains(iIIilIlIil<"iIIilIlIil","274sSELiU/t6VtAS1X7aoQ/CpZj7Db3sOQa7W7zinA==">())) {
            return Path.of(
               var4,
               iIIilIlIil<"iIIilIlIil","qwq2QR54Nai2nIJ0tuBwfF//NusM8EGxXXP33jUAvy0+1m8=">(),
               iIIilIlIil<"iIIilIlIil","5iSg859AJ4x2CV2KkRvqaSPiVtctuJ341vsq/jUvS00GnPTVKL9H+5dPOS9ojzk=">()
            );
         } else {
            String var2 = System.getenv(iIIilIlIil<"iIIilIlIil","t+WLWYBW946/Cn7MfCXQLhIlf6JddmDaKNWx2TT5MaAfSYUaBSmzBqZxjg==">());
            return var2 != null && !var2.isBlank()
               ? Path.of(var2)
               : Path.of(var4, iIIilIlIil<"iIIilIlIil","jKwW1G1/zYbVAL/vtot5Px7EF3QeRh/2YOFIuvMH2U9uH9E=">());
         }
      } catch (Exception var3) {
         return null;
      }
   }

   private static Path IilliliilIIi() {
      Path var0 = IliIiIlIil;
      if (var0 != null) {
         return var0;
      } else {
         try {
            Class var1 = Class.forName(iIIilIlIil<"iIIilIlIil","qyr4tEBpPsg8AKsYcCtRe87YTWOApfLdOSU3trUUivjlFmMb22iuqcz7/1Izufc/9mcRxB66NbYbmJUNSaRpdA==">());
            Object var2 = var1.getMethod(iIIilIlIil<"iIIilIlIil","GVvpzV85XjsOO80+c6cATe8cya3wgMuHR0OexRJ9qQ731c7zmqyj">()).invoke(null);
            Path var3 = (Path)var1.getMethod(iIIilIlIil<"iIIilIlIil","65TN5Xo9Pr4XI8j4Icd2vJpl8ZhZhmbzuyjSk6gJ316vHzycH0TC+g==">()).invoke(var2);
            IliIiIlIil = var3;
            return var3;
         } catch (Throwable var4) {
            return Path.of(
               System.getProperty(iIIilIlIil<"iIIilIlIil","RrP6fhPp+nPdKEMf7WbJslmJUAiuIWTDl8oHMC6NNhC4IvIA">()),
               iIIilIlIil<"iIIilIlIil","yTtnTjo9SiLpwywOjl6thJUYynhUnrMZyYAdCkCvwE07Gw==">()
            );
         }
      }
   }

   private static void IiIiliIiiiIi(lIlIllIliIlIllIl profile) {
      profile.IlIiilIiIl = illIlIilIl();
      if (profile.iIIiilIiIl == null) {
         profile.iIIiilIiIl = profile.IlIiilIiIl;
      }
   }

   private static String IllIllllIl(String name) {
      String var1 = llIllIlilIllIl.IiIlliIliiIl(name == null ? "" : name);
      return var1.isEmpty() ? iIIilIlIil<"iIIilIlIil","yTtnTjo9SiLpwywOjl6thJUYynhUnrMZyYAdCkCvwE07Gw==">() : var1;
   }

   static void IIIilIIiiIIi(String slug, lIlIllIliIlIllIl profile) {
      IlIillIiilIi(slug, profile, false);
   }

   public static void iIIIlIlIIl(byte[] currentStateBytes) {
      iiIIlIIlIl(iIlIlllllill().resolve(iIIilIlIil<"iIIilIlIil","U0c/9wj94iT0U5HKIH3flu7k1UcT6e/G/85OEy1wsyEyMUseQhyesG1xtg83">()), currentStateBytes);
   }

   static void iiIIlIIlIl(Path bytes, byte[] dest) {
      Files.createDirectories(bytes.getParent());
      Path var2 = bytes.resolveSibling(bytes.getFileName().toString() + iIIilIlIil<"iIIilIlIil","DBfWp/i8RySvrwHvTGisjApFOoVdlgXjdYrdSfksIAc=">());
      Files.write(var2, dest);

      try {
         Files.move(var2, bytes, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } catch (IOException var4) {
         Files.move(var2, bytes, StandardCopyOption.REPLACE_EXISTING);
      }
   }

   public static String Illillliilli(String slug, String newName) {
      long var8 = -5225494902262777847L;
      Path var2 = IiIIlliIIl(slug);
      if (!Files.exists(var2)) {
         return null;
      } else {
         byte[] var3 = Files.readAllBytes(var2);
         lIlIllIliIlIllIl var4 = lIlIllIliIlIllIl.lIiiIiIlilli(var3, null);
         if (var4 == null) {
            return null;
         } else {
            var8 ^= ((long)iIiIlIliIl(slug, var3) << 32 ^ var8) & -1L << 32;
            var4.iiililIiIl = newName;
            String var6 = lIlIliIlIl(newName);
            byte[] var7 = var4.iIlIlllllill();
            IIiIllIiIl(var6);
            iiIIlIIlIl(IiIIlliIIl(var6), var7);
            if (!var6.equals(slug)) {
               Files.deleteIfExists(var2);
               Iillllilll(slug, var6);
            }

            if ((int)(var8 >>> 32) != 0) {
               lilIliilIl(var6, var7, false);
            } else {
               IIiIllIiIl(var6);
            }

            return var6;
         }
      }
   }

   private static String lIilliIill(JsonObject k, String o) {
      return k.has(o) && k.get(o).isJsonPrimitive() ? k.get(o).getAsString() : null;
   }

   static void liiiIIllIl(Path file) {
      iIiIiIlIil = file;
      IiiIiIlIil = null;
      iliIiIlIil = null;
   }
}
