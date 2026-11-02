package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public final class lIlIllIliIlIllIl {
   @SerializedName("createdAt")
   public String iIIiilIiIl;
   @SerializedName("minecraftVersion")
   public String liililIiIl;
   @SerializedName("name")
   public String iiililIiIl;
   @SerializedName("content")
   public JsonObject ilIiilIiIl;
   @SerializedName("updatedAt")
   public String IlIiilIiIl;
   @SerializedName("clientVersion")
   public String IiililIiIl;
   @SerializedName("description")
   public String IIIiilIiIl;
   @SerializedName("tags")
   public List<String> llIiilIiIl;
   @SerializedName("author")
   public String lIIiilIiIl;
   private static final Gson llililIiIl = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   @SerializedName("formatVersion")
   public int ilililIiIl = 1;

   public String IilliliilIIi() {
      return llililIiIl.toJson(this);
   }

   public lIlIllIliIlIllIl IIlllIlliIll() {
      return iliIiiliiiii(JsonParser.parseString(this.IilliliilIIi()).getAsJsonObject());
   }

   public byte[] iIlIlllllill() {
      return llililIiIl.toJson(this).getBytes(StandardCharsets.UTF_8);
   }

   public static lIlIllIliIlIllIl iliIiiliiiii(JsonObject root) {
      lIlIllIliIlIllIl var1 = new lIlIllIliIlIllIl();
      var1.ilililIiIl = root.has(Illlllllilll<"Illlllllilll","u9csNwKDNtT4vI+b0KGXlE1FEDr9p8cMuj/59ns5U12Dj7/jTdFmZck=">())
         ? root.get(Illlllllilll<"Illlllllilll","u9csNwKDNtT4vI+b0KGXlE1FEDr9p8cMuj/59ns5U12Dj7/jTdFmZck=">()).getAsInt()
         : 1;
      var1.IiililIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","xeuHr5Aq1Kz2P/S48bV2o+7UZpfMQvDuo0pXIbkpvx7G0+2LjqA/N6A=">());
      var1.liililIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","tI6uUZriLgCRzvh4ktJbtmxT16sndJ5Gf6GzXltXOxMMVZrx+9gBA4/X+pE=">());
      var1.iiililIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","zY1Y/mj0V0gau46vY3tmsPYUB9nJQDqsP3USgqtzmIs=">());
      var1.IIIiilIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","d+wDMCHCYLnc+YN9h5TCx0y4nyoG5yEgeO3BrIB4sOYB4HNmDNYt">());
      var1.lIIiilIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","Q9LCfV89ApaxftenFurdRY/9Qxb6fFhIIRLTqEGD4l0X2w==">());
      var1.iIIiilIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","TYMEDnX3oMqiwvRlWYUrWGCGsGMBBvoU5vtGqmn9OAiCi00G/A==">());
      var1.IlIiilIiIl = IiIlliIliiIl(root, Illlllllilll<"Illlllllilll","2CG8xa6xochMdTSjMJltGPGcjzOMGgHovEhUhqA5WfA87g9zOg==">());
      if (root.has(Illlllllilll<"Illlllllilll","JBm6OzGVViwS3w4XKz6La5vADu+mkb84GQrYgySO8+E=">())
         && root.get(Illlllllilll<"Illlllllilll","JBm6OzGVViwS3w4XKz6La5vADu+mkb84GQrYgySO8+E=">()).isJsonArray()) {
         var1.llIiilIiIl = new ArrayList<>();

         for (JsonElement var3 : root.getAsJsonArray(Illlllllilll<"Illlllllilll","JBm6OzGVViwS3w4XKz6La5vADu+mkb84GQrYgySO8+E=">())) {
            if (var3.isJsonPrimitive()) {
               var1.llIiilIiIl.add(var3.getAsString());
            }
         }
      }

      if (root.has(Illlllllilll<"Illlllllilll","IJNKLdgrrAAjQ3H+uNubRrBcyUoXKmBBYYgQ1bsG/7WMuas=">())
         && root.get(Illlllllilll<"Illlllllilll","IJNKLdgrrAAjQ3H+uNubRrBcyUoXKmBBYYgQ1bsG/7WMuas=">()).isJsonObject()) {
         var1.ilIiilIiIl = root.getAsJsonObject(Illlllllilll<"Illlllllilll","IJNKLdgrrAAjQ3H+uNubRrBcyUoXKmBBYYgQ1bsG/7WMuas=">()).deepCopy();
      }

      return var1;
   }

   private static String IiIlliIliiIl(JsonObject k, String o) {
      return k.has(o) && k.get(o).isJsonPrimitive() ? k.get(o).getAsString() : null;
   }

   public String IIIllIIliIIl() {
      return IlIlllIlilIl(this.iIlIlllllill());
   }

   public JsonObject liiiIIllIl(String key) {
      if (!this.ilIiilIiIl.has(key) || !this.ilIiilIiIl.get(key).isJsonObject()) {
         this.ilIiilIiIl.add(key, new JsonObject());
      }

      return this.ilIiilIiIl.getAsJsonObject(key);
   }

   public static String IlIlllIlilIl(byte[] bytes) {
      long var8 = -6402550536337174918L;
      long var10 = 8529577427040438045L;

      try {
         MessageDigest var1 = MessageDigest.getInstance(Illlllllilll<"Illlllllilll","ArXLpxolsrVuM2gYpAj/SaNdULlSwR5o0MzIkdeNNHBNBFA=">());
         byte[] var2 = var1.digest(bytes);
         StringBuilder var3 = new StringBuilder(var2.length * 2);
         byte[] var4 = var2;
         var8 ^= ((long)var2.length << 32 ^ var8) & -1L << 32;

         for (long var14 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            var10 ^= ((long)var4[(int)var14] << 32 ^ var10) & -1L << 32;
            var3.append(Character.forDigit((int)(var10 >>> 32) >> 4 & 15, 16)).append(Character.forDigit((int)(var10 >>> 32) & 15, 16));
         }

         return var3.toString();
      } catch (Exception var12) {
         return "";
      }
   }

   public lIlIllIliIlIllIl() {
      this.ilIiilIiIl = new JsonObject();
   }

   public static lIlIllIliIlIllIl lIiiIiIlilli(byte[] resultOut, iliiIIllIiiiIIll[] bytes) {
      JsonObject[] var2 = new JsonObject[1];
      iliiIIllIiiiIIll var3 = lIlIiiliIlIiil.liiiIIllIl(resultOut, var2);
      if (bytes != null && bytes.length > 0) {
         bytes[0] = var3;
      }

      return !var3.IliIlllilIi() ? null : iliIiiliiiii(var2[0]);
   }

   public JsonObject IliIlllilIi() {
      if (!this.ilIiilIiIl.has(Illlllllilll<"Illlllllilll","k0PnQcdN/f+DC9jlRqddtYDK2F5yU15EkFm57ULd7MUgH+E=">())
         || !this.ilIiilIiIl.get(Illlllllilll<"Illlllllilll","k0PnQcdN/f+DC9jlRqddtYDK2F5yU15EkFm57ULd7MUgH+E=">()).isJsonObject()) {
         this.ilIiilIiIl.add(Illlllllilll<"Illlllllilll","k0PnQcdN/f+DC9jlRqddtYDK2F5yU15EkFm57ULd7MUgH+E=">(), new JsonObject());
      }

      return this.ilIiilIiIl.getAsJsonObject(Illlllllilll<"Illlllllilll","k0PnQcdN/f+DC9jlRqddtYDK2F5yU15EkFm57ULd7MUgH+E=">());
   }
}
