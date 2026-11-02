package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class lIIiilIliIIiilIl {
   public final iiIIliiIIlIlii[] liiililIll;
   private static final int IiiililIll = 128;
   public static final String iIiililIll = "/assets/corzclient/c2visuals/butterfly/";
   public final Matrix4f IIIIiilIll;
   private static final int iliililIll = 65536;
   public final int lIIIiilIll;
   private static final int lliililIll = 4194304;
   public final Map<String, lliIiiililiIiiil> iiiililIll;
   private static final String[] IlIIiilIll = new String[]{
      IIiilIiiiIii<"IIiilIiiiIii","U5onkljd5DKZfD0OfkFIOdwNnlKbH6c4YWyHDMRdm8kJ">(),
      IIiilIiiiIii<"IIiilIiiiIii","8XfQcrts8d1hz8+LGVRlCRKQITT6MDpdSYMa5SndkEc=">(),
      IIiilIiiiIii<"IIiilIiiiIii","zMAo+V+kfPyjj6pdLpZJ6dQc1krIouvqh3BDx8jZTnJw">(),
      IIiilIiiiIii<"IIiilIiiiIii","kPsqxP5MYZfyQ1oWhWEOIJJA50/EMG7jlUW6ynSViow=">(),
      IIiilIiiiIii<"IIiilIiiiIii","317xRMOxxtmhkwmoKjR7fB1/WgqoM0Tf4w4i8Qmv">(),
      IIiilIiiiIii<"IIiilIiiiIii","3MdSNcrYVLW3NzLUl+feR9Fo6lAVVoMI4+C+zN8qXsI=">()
   };
   private static final int[][] llIIiilIll = new int[][]{{1, 0, 2, 3}, {5, 1, 3, 7}, {4, 5, 7, 6}, {0, 4, 6, 2}, {5, 4, 0, 1}, {3, 2, 6, 7}};
   private static final float[][] ilIIiilIll = new float[][]{
      {0.0F, 0.0F, -1.0F}, {1.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 1.0F}, {-1.0F, 0.0F, 0.0F}, {0.0F, -1.0F, 0.0F}, {0.0F, 1.0F, 0.0F}
   };
   private static final String IliililIll = "/assets/corzclient/";
   public final Vector3f iIIIiilIll;

   public static boolean lIiiIiIlilli(String assetPath) {
      long var4 = 2662754788821005124L;

      try (InputStream var1 = lIIiilIliIIiilIl.class
            .getResourceAsStream(IIiilIiiiIii<"IIiilIiiiIii","GwaxNl6AiHWXwed+Y55p9zF+2oD4d2yRPjAHblcMftgKUAC8aseydRB2jaui+3A=">() + assetPath)) {
         var4 ^= ((long)(var1 != null ? 1 : 0) << 32 ^ var4) & -1L << 32;
      } catch (IOException var8) {
         return false;
      }

      return (boolean)((int)(var4 >>> 32));
   }

   public int IiIlliIliiIl(String name) {
      for (int var2 = 0; var2 < this.liiililIll.length; var2++) {
         if (this.liiililIll[var2].liiIiIiIIl.equals(name)) {
            return var2;
         }
      }

      return -1;
   }

   private static String iliIiiliiiii(JsonObject o, String key) {
      JsonElement var2 = o.get(key);
      if (var2 != null && var2.isJsonPrimitive()) {
         return var2.getAsString();
      } else {
         throw new IOException(IIiilIiiiIii<"IIiilIiiiIii","ItVETeOidRrtGyzpI9TEfqCICOr0H/kaFi6eYGEqXFNre/j1fU+wY0Dczy/M47Urehmwn4g=">() + key);
      }
   }

   static JsonObject IlIlllIlilIl(String limit, int path) {
      try {
         JsonObject var5;
         try (InputStream var2 = lIIiilIliIIiilIl.class.getResourceAsStream(limit)) {
            if (var2 == null) {
               throw new IOException(IIiilIiiiIii<"IIiilIiiiIii","jZFpgXD/9p7CH9JGc0/ZcUDOETIeGDrMoCJm5aW9mUVUe+QIpKAMoP5vgvdifjx67za3Uyj7JFxs">() + limit);
            }

            byte[] var3 = var2.readNBytes(path + 1);
            if (var3.length > path) {
               throw new IOException(IIiilIiiiIii<"IIiilIiiiIii","DqwqW2jnv86CcfQVw3csBLBHchfBF+9KXfJrfRaxjAiZ6VwuLF7+EphdFfMWMtLR">() + limit);
            }

            JsonElement var4 = JsonParser.parseString(new String(var3, StandardCharsets.UTF_8));
            if (!var4.isJsonObject()) {
               throw new IOException(IIiilIiiiIii<"IIiilIiiiIii","zP65eeKDhHYXXCbKmIpZSDzwlK39LDZ2SJU3ZsSnAcTbA+tSsDq8E+dpLvvGEvo=">() + limit);
            }

            var5 = var4.getAsJsonObject();
         }

         return var5;
      } catch (RuntimeException var8) {
         throw new IOException(
            IIiilIiiiIii<"IIiilIiiiIii","Ugg3OnZtf731szbdcwHmO/DgOFGt7m/PZ1IZiNsRUyMc5G5ITliVorRFZEpte3e8/5m6928yi7tynjI=">()
               + limit
               + IIiilIiiiIii<"IIiilIiiiIii","sJjyRjkBtsQmtg3mvJOL+VX+fbS7wceqDi8FLSgd">()
               + var8.getMessage(),
            var8
         );
      }
   }

   public Matrix4f[] Iilllilliill() {
      Matrix4f[] var1 = new Matrix4f[this.liiililIll.length];
      Arrays.setAll(var1, i -> new Matrix4f());
      return var1;
   }

   private static float[] IIIilIIiiIIi(JsonObject key, String fallback, float o) {
      return key.has(fallback) ? lIIlIiiliIIlIiil.iliIiiliiiii(key.get(fallback)) : new float[]{o, o, o};
   }

   private lIIiilIliIIiilIl(iiIIliiIIlIlii[] bones, Map<String, lliIiiililiIiiil> clips, Matrix4f camera, Vector3f shift) {
      this.liiililIll = bones;
      this.iiiililIll = Collections.unmodifiableMap(clips);
      this.IIIIiilIll = camera;
      this.iIIIiilIll = shift;
      this.lIIIiilIll = Arrays.stream(bones).mapToInt(b -> b.iIIliIiIIl.length / (((-1533581209 ^ -39) >>> 15 | (-1533581209 ^ -39) << 17) ^ 796702425)).sum();
   }

   public static IlIillllllIillll IilliliilIIi(iiIiliiIIlilii knife) {
      if (knife != null && !knife.IliIlllilIi()) {
         JsonObject var1 = IlIlllIlilIl(knife.IiIlliIliiIl(), (--437000875 >>> 9 | --437000875 << 23) ^ 1435239949);

         try {
            return new IlIillllllIillll(
               knife.IIlllIlliIll(
                  iliIiiliiiii(var1, IIiilIiiiIii<"IIiilIiiiIii","xKVt8TWAlya8DjFI/QLnldOWorLhyuGAm1s4YHqnpnSj">()),
                  IIiilIiiiIii<"IIiilIiiiIii","h1QDFS7dPeCtgjdU3yWP8plS9X7q5gri7hKlPo/13JoheQID0CY=">(),
                  IIiilIiiiIii<"IIiilIiiiIii","s0ZxcQzzljD7dje6wrDHAe4ylnROp/7hN6rYeTmhm3JS">()
               ),
               knife.IIlllIlliIll(
                  iliIiiliiiii(var1, IIiilIiiiIii<"IIiilIiiiIii","Ta5OtSSpF04iBbzCpR4okcRU0C6kAESrawaABYcY9XZdXHWssQ==">()),
                  IIiilIiiiIii<"IIiilIiiiIii","9OCdhOouXUgiqPMYrVPEn/jEvXNALDKQuN1CEaMcrgd/fKbukIQ=">(),
                  IIiilIiiiIii<"IIiilIiiiIii","xHQfoo75nE0LmL/1hCpeiIl0eMqszzxQ5HN6VycWqBPt7jbRAzzRxdnaCQ==">()
               ),
               knife.IIlllIlliIll(
                  iliIiiliiiii(var1, IIiilIiiiIii<"IIiilIiiiIii","JpP/79MTg9e6j4F6h41vl5IqhZWnAAuqnDUmq2KZQpCitug=">()),
                  IIiilIiiiIii<"IIiilIiiiIii","xV68pW5IDzbmerxjTtejDURH4NvVk+gYjKfInxIs+OPfjwXi">(),
                  IIiilIiiiIii<"IIiilIiiiIii","bYmMGGWVVK4fR8J48JRX17n117uIFA4nd2dsD2UQWpk=">()
               )
            );
         } catch (IllegalArgumentException var3) {
            throw new IOException(var3.getMessage(), var3);
         }
      } else {
         throw new IOException(IIiilIiiiIii<"IIiilIiiiIii","pTFp3CdxWWyVRxjOoG3tfTlc9fS1r+XUOJJjp3D4sR6FoKeIn5nZNvt5uKQ=">());
      }
   }

   lIIiilIliIIiilIl IliIlllilIi(Vector3f by) {
      return by != null && by.isFinite() && by.lengthSquared() != 0.0F
         ? new lIIiilIliIIiilIl(this.liiililIll, this.iiiililIll, new Matrix4f().translation(by).mul(this.IIIIiilIll), new Vector3f(this.iIIIiilIll).add(by))
         : this;
   }

   public static lIIiilIliIIiilIl Ililllililil(JsonObject animation, JsonObject geometry) {
      JsonObject var2 = animation.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","NtwXNGRGZWYGO0ZGPSbYp+6l6PFXmsoD4pt10fYlBj8jQKv7fGDucP+Fc9a+FA==">())
         .get(0)
         .getAsJsonObject();
      JsonObject var3 = var2.getAsJsonObject(IIiilIiiiIii<"IIiilIiiiIii","baBdF65ru+RbS2YphYHp4sN0MqoWpl7C0JMB8qqmUkis2g5x6ZcT">());
      float var4 = lIIlIiiliIIlIiil.IIIllIIliIIl(var3.get(IIiilIiiiIii<"IIiilIiiiIii","6ZBhgpcNWPpCKvIZfxy/LhU+zHb7RPeh/O8QNU3BGHj1zE/gm+oHk+8=">()));
      float var5 = lIIlIiiliIIlIiil.IIIllIIliIIl(var3.get(IIiilIiiiIii<"IIiilIiiiIii","Rci2UP39F+QqDNPFgAanB+U5a+zzZniReGw75whc7W8o9GzHp11EGfVT">()));
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F) && !(var4 > 8192.0F) && !(var5 > 8192.0F)) {
         JsonArray var6 = var2.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","JkFL7p5QNLeFrTPq/LBgImwPdJ5dqEvh0FzQVL+wbOYD">());
         if (var6.size() > 256) {
            throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","S9FkLhuZLR8z+s6+N34HepHdxmW+YaRDuXL+akX1pavlL3WdFoMp4Gz8">());
         } else {
            LinkedHashMap var7 = new LinkedHashMap();

            for (JsonElement var9 : var6) {
               JsonObject var10 = var9.getAsJsonObject();
               if (var7.put(var10.get(IIiilIiiiIii<"IIiilIiiiIii","yrrAEVGEP0boMwj0eoJhLgMFeC/TLFeiKfO3/gn71eY=">()).getAsString(), var10) != null) {
                  throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","MbG+1IokRhhnwLJ2ZQW8qq6KCFIVRF+iw8ZIUNHy4Y/Vx6YuYmCndjP3">());
               }
            }

            LinkedHashMap var27 = new LinkedHashMap();
            ArrayList var28 = new ArrayList();

            while (!var7.isEmpty()) {
               int var29 = var7.size();
               Iterator var11 = var7.entrySet().iterator();

               while (var11.hasNext()) {
                  Entry var12 = (Entry)var11.next();
                  JsonObject var13 = (JsonObject)var12.getValue();
                  if (!var13.has(IIiilIiiiIii<"IIiilIiiiIii","BaIWdkY6J07VhxQhJRRJKt4zlzOb+R0YhanzmvbSo5Ql2g==">())
                     || var27.containsKey(var13.get(IIiilIiiiIii<"IIiilIiiiIii","BaIWdkY6J07VhxQhJRRJKt4zlzOb+R0YhanzmvbSo5Ql2g==">()).getAsString())) {
                     var27.put((String)var12.getKey(), var28.size());
                     var28.add(var13);
                     var11.remove();
                  }
               }

               if (var29 == var7.size()) {
                  throw new IllegalArgumentException(
                     IIiilIiiiIii<"IIiilIiiiIii","vO5t+Vop9zkWeFaYWM664JkOlNolYbZJ8gyDz/yhFOfVoIR2IJQeSB0N0jv0WCbjStPWhDaMe/xZ">()
                  );
               }
            }

            iiIIliiIIlIlii[] var30 = new iiIIliiIIlIlii[var28.size()];
            int var31 = 0;

            for (int var32 = 0; var32 < var30.length; var32++) {
               JsonObject var34 = (JsonObject)var28.get(var32);
               String var14 = var34.get(IIiilIiiiIii<"IIiilIiiiIii","yrrAEVGEP0boMwj0eoJhLgMFeC/TLFeiKfO3/gn71eY=">()).getAsString();
               int var15 = var34.has(IIiilIiiiIii<"IIiilIiiiIii","BaIWdkY6J07VhxQhJRRJKt4zlzOb+R0YhanzmvbSo5Ql2g==">())
                  ? (Integer)var27.get(var34.get(IIiilIiiiIii<"IIiilIiiiIii","BaIWdkY6J07VhxQhJRRJKt4zlzOb+R0YhanzmvbSo5Ql2g==">()).getAsString())
                  : -1;
               float[] var16 = IIIilIIiiIIi(var34, IIiilIiiiIii<"IIiilIiiiIii","lt98YPJxMv2f8E/K3pEoQdl++L6UVK3S3f95Y6wcR9Me">(), 0.0F);
               float[] var17 = IIIilIIiiIIi(var34, IIiilIiiiIii<"IIiilIiiiIii","TWnKT33I/ch49E8OjAfnseZTDyFDAyvo8th6SNYa3Nvh8mfa">(), 0.0F);
               float[] var18 = var15 < 0
                  ? new float[]{0.0F, 24.0F, 0.0F}
                  : IIIilIIiiIIi((JsonObject)var28.get(var15), IIiilIiiiIii<"IIiilIiiiIii","lt98YPJxMv2f8E/K3pEoQdl++L6UVK3S3f95Y6wcR9Me">(), 0.0F);
               float[] var19 = new float[]{(var16[0] - var18[0]) / 16.0F, (var18[1] - var16[1]) / 16.0F, (var16[2] - var18[2]) / 16.0F};
               int var20 = var14.equals(IIiilIiiiIii<"IIiilIiiiIii","xXXML8MiW8FzmCwsSEsNU/fbIXmGyv9pryuCSe1yxzizRpe37+Z988s=">())
                  ? 1
                  : (var14.equals(IIiilIiiiIii<"IIiilIiiiIii","b05QdkrcMYwHVII/6uGezvzkrtabHFTAnR4e4xD3c8o5N8gYp1Wy3A==">()) ? -1 : 0);
               ArrayList var21 = new ArrayList();
               if (var20 == 0 && var34.has(IIiilIiiiIii<"IIiilIiiiIii","VEJqn3X7f0XELVe2EP+Zx1TeVLj3icijSBdPg2l8T1gn">())) {
                  for (JsonElement var23 : var34.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","VEJqn3X7f0XELVe2EP+Zx1TeVLj3icijSBdPg2l8T1gn">())) {
                     if (++var31 > 4096) {
                        throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","u2Ph8KW7HQ9lJU6qF8csLwqWUoJH9H+SQI0mFVVPx8KEvryw6o634W72">());
                     }

                     IIlilIliiIli(var23.getAsJsonObject(), var16, var4, var5, var21);
                  }
               }

               float[] var49 = new float[var21.size()];

               for (int var51 = 0; var51 < var49.length; var51++) {
                  var49[var51] = (Float)var21.get(var51);
               }

               float[] var52 = null;
               if (var20 != 0
                  && var34.has(IIiilIiiiIii<"IIiilIiiiIii","VEJqn3X7f0XELVe2EP+Zx1TeVLj3icijSBdPg2l8T1gn">())
                  && !var34.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","VEJqn3X7f0XELVe2EP+Zx1TeVLj3icijSBdPg2l8T1gn">()).isEmpty()) {
                  JsonObject var24 = var34.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","VEJqn3X7f0XELVe2EP+Zx1TeVLj3icijSBdPg2l8T1gn">())
                     .get(0)
                     .getAsJsonObject();
                  float[] var25 = IIIilIIiiIIi(var24, IIiilIiiiIii<"IIiilIiiiIii","j+VASCW/PixeICWDzWCHZKhGI3fVHc2EE11t8Yhv7XG5mg==">(), 0.0F);
                  float[] var26 = IIIilIIiiIIi(var24, IIiilIiiiIii<"IIiilIiiiIii","YCYyOHwvF3ziHePeLsztNkSegZSSyLjheeaWoKhEiQg=">(), 0.0F);
                  var52 = new float[]{
                     (var25[0] + var26[0] / 2.0F - var16[0]) / 16.0F, (var16[1] - var25[1]) / 16.0F, (var25[2] + var26[2] / 2.0F - var16[2]) / 16.0F
                  };
               }

               var30[var32] = new iiIIliiIIlIlii(var14, var15, var19, var17, var49, var20, var52);
            }

            LinkedHashMap var33 = new LinkedHashMap();
            JsonObject var35 = geometry.getAsJsonObject(IIiilIiiiIii<"IIiilIiiiIii","9OCdhOouXUgiqPMYrVPEn/jEvXNALDKQuN1CEaMcrgd/fKbukIQ=">());
            if (var35.size() > 128) {
               throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","lVI+qJI9INc7x468kBxqZQPKNjOmGO3Dgla0G6aOFXfora+H+FUMAkmi">());
            } else {
               for (Entry var38 : var35.entrySet()) {
                  String var41 = (String)var38.getKey();
                  if (var41.startsWith(IIiilIiiiIii<"IIiilIiiiIii","pboUH4tePmHZnJuaChjF32L0XXzJYcEwDs0hSgZIITv674PGD/H4">())
                     || var41.startsWith(IIiilIiiiIii<"IIiilIiiiIii","/YhIGkHMoBe3OOiiBdTrea5aieV/H+TkHyfLcASda9s=">())
                     || var41.startsWith(IIiilIiiiIii<"IIiilIiiiIii","M7JUMmx0xBMxFVuPNXlYtFxYFxUNtTjjPDEMNQMW6tN94wg=">())
                     || var41.startsWith(IIiilIiiiIii<"IIiilIiiiIii","nQRG3EL/7OEpEZc2MdhRkFfG5CAj5BJHRCVMXYF/QMROxg==">())) {
                     JsonObject var44 = ((JsonElement)var38.getValue()).getAsJsonObject();
                     float var45 = var44.has(IIiilIiiiIii<"IIiilIiiiIii","kZIOyPueEppBruOd/zePilKDGavN/WSpfTbQE5MVa1hlV/Q2PXCP/u9N5cE=">())
                        ? lIIlIiiliIIlIiil.IIIllIIliIIl(
                           var44.get(IIiilIiiiIii<"IIiilIiiiIii","kZIOyPueEppBruOd/zePilKDGavN/WSpfTbQE5MVa1hlV/Q2PXCP/u9N5cE=">())
                        )
                        : 0.0F;
                     lIIlIiiliIIlIiil[][] var46 = new lIIlIiiliIIlIiil[var30.length][3];
                     JsonObject var47 = var44.has(IIiilIiiiIii<"IIiilIiiiIii","JkFL7p5QNLeFrTPq/LBgImwPdJ5dqEvh0FzQVL+wbOYD">())
                           && var44.get(IIiilIiiiIii<"IIiilIiiiIii","JkFL7p5QNLeFrTPq/LBgImwPdJ5dqEvh0FzQVL+wbOYD">()).isJsonObject()
                        ? var44.getAsJsonObject(IIiilIiiiIii<"IIiilIiiiIii","JkFL7p5QNLeFrTPq/LBgImwPdJ5dqEvh0FzQVL+wbOYD">())
                        : new JsonObject();

                     for (Entry var50 : var47.entrySet()) {
                        Integer var53 = (Integer)var27.get(var50.getKey());
                        if (var53 != null
                           && !((String)var50.getKey()).equals(IIiilIiiiIii<"IIiilIiiiIii","BRqT02Ygn9S7VxMpnWEer+WbddL3QlVB/6eLSCjEZBeC8g==">())) {
                           JsonObject var54 = ((JsonElement)var50.getValue()).getAsJsonObject();
                           String[] var55 = new String[]{
                              IIiilIiiiIii<"IIiilIiiiIii","Oj7SkYIDegiSaB8eaIoqjirD1FxuATIrub1azidJgWyQRyWU">(),
                              IIiilIiiiIii<"IIiilIiiiIii","TWnKT33I/ch49E8OjAfnseZTDyFDAyvo8th6SNYa3Nvh8mfa">(),
                              IIiilIiiiIii<"IIiilIiiiIii","iKIvi8EbLPhvu+2xERGCe3FvAuSck4OgP2QnXVp58em8">()
                           };

                           for (int var56 = 0; var56 < 3; var56++) {
                              if (var54.has(var55[var56])) {
                                 var46[var53][var56] = lIIlIiiliIIlIiil.IliIlllilIi(var54.get(var55[var56]));
                                 var45 = Math.max(var45, var46[var53][var56].iIlIlllllill());
                              }
                           }
                        }
                     }

                     if (var45 > 300.0F || var45 < 0.0F) {
                        throw new IllegalArgumentException(
                           IIiilIiiiIii<"IIiilIiiiIii","tnVUKL4EDoQCzlY4YogFSWRfM40JQ4mmAH5JINJol0tX+K8RMpnX8EdqpI4FGxsgxw==">()
                        );
                     }

                     var33.put(var41, new lliIiiililiIiiil(var41, Math.max(0.05F, var45), var46, Iiilliiliiil(var44)));
                  }
               }

               if (var33.containsKey(IIiilIiiiIii<"IIiilIiiiIii","pboUH4tePmHZnJuaChjF32L0XXzJYcEwDs0hSgZIITv674PGD/H4">())
                  && var33.containsKey(IIiilIiiiIii<"IIiilIiiiIii","M7JUMmx0xBMxFVuPNXlYtFxYFxUNtTjjPDEMNQMW6tN94wg=">())
                  && var33.containsKey(IIiilIiiiIii<"IIiilIiiiIii","g2CmU9AR9tgnpMuf1dLkO0T7UDS9Kyg+wwf/f7nEyOTxYe0=">())) {
                  Matrix4f[] var37 = new Matrix4f[var30.length];

                  for (int var39 = 0; var39 < var30.length; var39++) {
                     iiIIliiIIlIlii var42 = var30[var39];
                     var37[var39] = var42.iiiIiIiIIl < 0 ? new Matrix4f() : new Matrix4f(var37[var42.iiiIiIiIIl]);
                     var37[var39].translate(var42.IIIliIiIIl[0], var42.IIIliIiIIl[1], var42.IIIliIiIIl[2]);
                     IiIiliIiiiIi(var37[var39], var42.lIIliIiIIl);
                  }

                  Integer var40 = (Integer)var27.get(IIiilIiiiIii<"IIiilIiiiIii","ivoDjjR1/3ArWAjHOoi1nEhIlww9tc/YCDRvEMAmxR1uLB6uYA==">());
                  if (var40 == null) {
                     throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","9BODZnrNsAtQDCMwvXLDOUPllk0975gBIPluK011B6uiLndhMPdFcTAxdX/f">());
                  } else {
                     Matrix4f var43 = new Matrix4f().rotateZ((float) Math.PI).mul(new Matrix4f(var37[var40]).invert());
                     return new lIIiilIliIIiilIl(var30, var33, var43);
                  }
               } else {
                  throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","Y4HZO8DsEEDTzxt6if36kwlnUVld4TTvy3t1xfN3gxv2X8MNnaonbc0=">());
               }
            }
         }
      } else {
         throw new IllegalArgumentException(IIiilIiiiIii<"IIiilIiiiIii","CZ3V9MUS60q+UiT9OFFI2ZK+xf9H5h3H6UXTjkJ3y9NUjT1DuC2MHQ8yUhwMSbtMVg==">());
      }
   }

   public boolean IIlllIlliIll(int root, int bone) {
      int var3 = root;

      while (var3 >= 0) {
         if (var3 == bone) {
            return true;
         }

         var3 = this.liiililIll[var3].iiiIiIiIIl;
      }

      return false;
   }

   static JsonObject IIIllIIliIIl(String name) {
      return IlIlllIlilIl(
         IIiilIiiiIii<"IIiilIiiiIii","XBAC5s9d6+ZEWpPeyZaIZMwluLVlRkDVu3Fozq07OyinDgXOhi+9JviFZ2oIHNHfpu6QrkNaAkgyMOlO763rm6ORJw==">() + name,
         -1722365911 * -23 + -75 ^ 963904518
      );
   }

   private static float IlIillIiilIi(float degrees) {
      return degrees * (float) (Math.PI / 180.0);
   }

   public float[] Illlllllilll() {
      float[] var1 = new float[this.liiililIll.length * 9];

      for (int var2 = 0; var2 < this.liiililIll.length; var2++) {
         Arrays.fill(var1, var2 * 9 + 6, var2 * 9 + 9, 1.0F);
      }

      return var1;
   }

   private static void IiIiliIiiiIi(Matrix4f m, float[] r) {
      m.rotateZYX(IlIillIiilIi(r[2]), IlIillIiilIi(r[1]), IlIillIiilIi(r[0]));
   }

   public void IIillIiliIil(float[] pose, Matrix4f[] out) {
      for (int var3 = 0; var3 < this.liiililIll.length; var3++) {
         iiIIliiIIlIlii var4 = this.liiililIll[var3];
         int var5 = var3 * 9;
         Matrix4f var6 = out[var3];
         if (var4.iiiIiIiIIl < 0) {
            var6.identity();
         } else {
            var6.set(out[var4.iiiIiIiIIl]);
         }

         var6.translate(var4.IIIliIiIIl[0] + pose[var5] / 16.0F, var4.IIIliIiIIl[1] - pose[var5 + 1] / 16.0F, var4.IIIliIiIIl[2] + pose[var5 + 2] / 16.0F);
         IiIiliIiiiIi(var6, var4.lIIliIiIIl);
         var6.rotateZYX(IlIillIiilIi(pose[var5 + 5]), IlIillIiilIi(pose[var5 + 4]), IlIillIiilIi(pose[var5 + 3]));
         var6.scale(pose[var5 + 6], pose[var5 + 7], pose[var5 + 8]);
      }
   }

   private static void IIlilIliiIli(JsonObject out, float[] bonePivot, float tw, float c, List<Float> th) {
      float[] var5 = IIIilIIiiIIi(out, IIiilIiiiIii<"IIiilIiiiIii","j+VASCW/PixeICWDzWCHZKhGI3fVHc2EE11t8Yhv7XG5mg==">(), 0.0F);
      float[] var6 = IIIilIIiiIIi(out, IIiilIiiiIii<"IIiilIiiiIii","YCYyOHwvF3ziHePeLsztNkSegZSSyLjheeaWoKhEiQg=">(), 0.0F);
      float[] var7 = out.has(IIiilIiiiIii<"IIiilIiiiIii","lt98YPJxMv2f8E/K3pEoQdl++L6UVK3S3f95Y6wcR9Me">())
         ? IIIilIIiiIIi(out, IIiilIiiiIii<"IIiilIiiiIii","lt98YPJxMv2f8E/K3pEoQdl++L6UVK3S3f95Y6wcR9Me">(), 0.0F)
         : bonePivot;
      float var8 = out.has(IIiilIiiiIii<"IIiilIiiiIii","JI7GlvB2uzC2RWK/DnCa637E1k6uSF62XYXtZt5ZL+Y9T6M=">())
         ? lIIlIiiliIIlIiil.IIIllIIliIIl(out.get(IIiilIiiiIii<"IIiilIiiiIii","JI7GlvB2uzC2RWK/DnCa637E1k6uSF62XYXtZt5ZL+Y9T6M=">()))
         : 0.0F;
      Matrix4f var9 = new Matrix4f().translate((var7[0] - bonePivot[0]) / 16.0F, (bonePivot[1] - var7[1]) / 16.0F, (var7[2] - bonePivot[2]) / 16.0F);
      IiIiliIiiiIi(var9, IIIilIIiiIIi(out, IIiilIiiiIii<"IIiilIiiiIii","TWnKT33I/ch49E8OjAfnseZTDyFDAyvo8th6SNYa3Nvh8mfa">(), 0.0F));
      Matrix3f var10 = new Matrix3f(var9);
      JsonElement var11 = out.get(IIiilIiiiIii<"IIiilIiiiIii","rPqQgmFdIcQ/nMLtxV+tKEnMRv/I51sOyVS4WXdu">());
      if (var11 != null) {
         float[][] var12 = null;
         if (var11.isJsonArray()) {
            float var13 = lIIlIiiliIIlIiil.IIIllIIliIIl(var11.getAsJsonArray().get(0));
            float var14 = lIIlIiiliIIlIiil.IIIllIIliIIl(var11.getAsJsonArray().get(1));
            float var15 = var6[0];
            float var16 = var6[1];
            float var17 = var6[2];
            var12 = new float[][]{
               {var13 + var17, var14 + var17, var15, var16},
               {var13 + var17 + var15, var14 + var17, var17, var16},
               {var13 + 2.0F * var17 + var15, var14 + var17, var15, var16},
               {var13, var14 + var17, var17, var16},
               {var13 + var17, var14, var15, var17},
               {var13 + var17 + var15, var14 + var17, var15, -var17}
            };
         }

         for (int var30 = 0; var30 < 6; var30++) {
            int var32 = 0;
            float[] var31;
            if (var12 != null) {
               var31 = var12[var30];
            } else {
               JsonObject var33 = var11.getAsJsonObject().getAsJsonObject(IlIIiilIll[var30]);
               if (var33 == null) {
                  continue;
               }

               JsonArray var35 = var33.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","rPqQgmFdIcQ/nMLtxV+tKEnMRv/I51sOyVS4WXdu">());
               JsonArray var18 = var33.getAsJsonArray(IIiilIiiiIii<"IIiilIiiiIii","tmEhiiN7zlQIRqE7wzBsVI0tNMzixfLsxBooEMiC53zWHA0=">());
               if (var33.has(IIiilIiiiIii<"IIiilIiiiIii","pr749/u9kD70dcdal+sfX2fBlylI/nat2JdfYASI+d6SK0IOjVOT">())) {
                  float var19 = lIIlIiiliIIlIiil.IIIllIIliIIl(var33.get(IIiilIiiiIii<"IIiilIiiiIii","pr749/u9kD70dcdal+sfX2fBlylI/nat2JdfYASI+d6SK0IOjVOT">()));
                  if (var19 % 90.0F != 0.0F) {
                     throw new IllegalArgumentException(
                        IIiilIiiiIii<"IIiilIiiiIii","gWk2g1j6GN6vdM9yDbFW/+TvbS5cEqEFNtsngSiem/DSbqN86FieHIgGC/NEiJvnKQq8kg==">()
                     );
                  }

                  var32 = Math.floorMod(Math.round(var19 / 90.0F), 4);
               }

               var31 = new float[]{
                  lIIlIiiliIIlIiil.IIIllIIliIIl(var35.get(0)),
                  lIIlIiiliIIlIiil.IIIllIIliIIl(var35.get(1)),
                  lIIlIiiliIIlIiil.IIIllIIliIIl(var18.get(0)),
                  lIIlIiiliIIlIiil.IIIllIIliIIl(var18.get(1))
               };
            }

            Vector3f var34 = new Vector3f(ilIIiilIll[var30]).mul(var10).normalize();

            for (int var36 = 0; var36 < 4; var36++) {
               int var37 = llIIiilIll[var30][var36];
               float var38 = var5[0] - var7[0] + ((var37 & 1) == 0 ? -var8 : var6[0] + var8);
               float var20 = var7[1] - var5[1] - var6[1] + ((var37 & 2) == 0 ? -var8 : var6[1] + var8);
               float var21 = var5[2] - var7[2] + ((var37 & 4) == 0 ? -var8 : var6[2] + var8);
               Vector3f var22 = new Vector3f(var38 / 16.0F, var20 / 16.0F, var21 / 16.0F).mulPosition(var9);
               int var23 = Math.floorMod(var36 - var32, 4);
               float var24 = (var31[0] + (var23 != 0 && var23 != 3 ? 0.0F : var31[2])) / tw;
               float var25 = (var31[1] + (var23 >= 2 ? var31[3] : 0.0F)) / c;

               for (float var29 : new float[]{var22.x, var22.y, var22.z, var24, var25, var34.x, var34.y, var34.z}) {
                  th.add(var29);
               }
            }
         }
      }
   }

   private lIIiilIliIIiilIl(iiIIliiIIlIlii[] clips, Map<String, lliIiiililiIiiil> bones, Matrix4f camera) {
      this(clips, bones, camera, new Vector3f());
   }

   private static List<IIIilIIilIIilIIi> Iiilliiliiil(JsonObject clip) {
      if (clip.has(IIiilIiiiIii<"IIiilIiiiIii","mERN9bQ6Y+9ydZzsQF//CFdC+8A6EMhQV18OSVekKS36XCLyl2PiYGo=">())
         && clip.get(IIiilIiiiIii<"IIiilIiiiIii","mERN9bQ6Y+9ydZzsQF//CFdC+8A6EMhQV18OSVekKS36XCLyl2PiYGo=">()).isJsonObject()) {
         ArrayList var1 = new ArrayList();

         for (Entry var3 : clip.getAsJsonObject(IIiilIiiiIii<"IIiilIiiiIii","mERN9bQ6Y+9ydZzsQF//CFdC+8A6EMhQV18OSVekKS36XCLyl2PiYGo=">()).entrySet()) {
            float var4;
            try {
               var4 = lIIlIiiliIIlIiil.IIIllIIliIIl(new JsonPrimitive((String)var3.getKey()));
            } catch (RuntimeException var10) {
               continue;
            }

            if (!(var4 < 0.0F) && !(var4 > 300.0F)) {
               JsonArray var5 = new JsonArray();
               if (((JsonElement)var3.getValue()).isJsonArray()) {
                  var5 = ((JsonElement)var3.getValue()).getAsJsonArray();
               } else {
                  var5.add((JsonElement)var3.getValue());
               }

               for (JsonElement var7 : var5) {
                  if (var1.size() >= 128) {
                     break;
                  }

                  if (var7.isJsonObject() && var7.getAsJsonObject().has(IIiilIiiiIii<"IIiilIiiiIii","b2ypehOK6V0GLWjjXBjYkNJu+DAtY9ah3/5lt2T+8Wy54w==">())) {
                     JsonElement var8 = var7.getAsJsonObject().get(IIiilIiiiIii<"IIiilIiiiIii","b2ypehOK6V0GLWjjXBjYkNJu+DAtY9ah3/5lt2T+8Wy54w==">());
                     if (var8.isJsonPrimitive()) {
                        String var9 = var8.getAsString();
                        if (var9.matches(IIiilIiiiIii<"IIiilIiiiIii","bRHSE2Isum4ZifdAX2f/lndHu0mozxjyDSYfIiLXnDij7Q/AU6q6w7RlmNdcoHiOL9HKAg==">())
                           && !var9.contains(IIiilIiiiIii<"IIiilIiiiIii","I549iGsmkg+jB9ZLtPK/K7Xd+RlhESfJ/q7IqWxi">())) {
                           var1.add(new IIIilIIilIIilIIi(var4, var9));
                        }
                     }
                  }
               }
            }
         }

         var1.sort(Comparator.comparingDouble(IIIilIIilIIilIIi::IliIlllilIi));
         return List.copyOf(var1);
      } else {
         return List.of();
      }
   }

   public static lIIiilIliIIiilIl iIlIlllllill(iiIiliiIIlilii knife) {
      if (knife == null) {
         throw new IOException(IIiilIiiiIii<"IIiilIiiiIii","bkXb9xPWChISJYc0VFyQUegyh9xuvL5+5IHYffZLiJsecy+T">());
      } else if (knife.IliIlllilIi()) {
         return liiiIIllIl();
      } else {
         IlIillllllIillll var1 = IilliliilIIi(knife);
         lIIiilIliIIiilIl var2 = Ililllililil(
            IlIlllIlilIl(
               IIiilIiiiIii<"IIiilIiiiIii","GwaxNl6AiHWXwed+Y55p9zF+2oD4d2yRPjAHblcMftgKUAC8aseydRB2jaui+3A=">() + var1.IliIlllilIi(),
               (-319569719 >>> 23 | -319569719 << 9) ^ 43 ^ -406744078
            ),
            IlIlllIlilIl(
               IIiilIiiiIii<"IIiilIiiiIii","GwaxNl6AiHWXwed+Y55p9zF+2oD4d2yRPjAHblcMftgKUAC8aseydRB2jaui+3A=">() + var1.liiiIIllIl(),
               (1915613724 >>> 7 | 1915613724 << 25) * 723362913 ^ -1904680604
            )
         );
         return var2.IliIlllilIi(illIIIlIilIIIl.IliIlllilIi(knife, var2));
      }
   }

   public static lIIiilIliIIiilIl liiiIIllIl() {
      return Ililllililil(
         IIIllIIliIIl(IIiilIiiiIii<"IIiilIiiiIii","JFNOmIuioAB4lRl7xGmFaytvKnEprURRBAq+JZoRvyFPaYONo1I=">()),
         IIIllIIliIIl(IIiilIiiiIii<"IIiilIiiiIii","Bwn8nmeyIOQFb5A8JGIpaEc4sHukEXy+XEood4iScLSiVjoNJt6E8GBJPw==">())
      );
   }
}
