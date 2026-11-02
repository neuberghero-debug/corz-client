package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import net.minecraft.class_310;

public final class IlliIilllliIil {
   private static final HttpClient iIlIlliIiIllIlliIi = HttpClient.newBuilder().connectTimeout(Duration.ofMillis(6000L)).build();
   private static final int liIIlliIiiiIIlliIi = 6000;
   private static final int IIlIlliIilIlIlliIi = 8000;

   private static lliIiIliliIiIl IIillIiliIil(JsonObject o) {
      long var4 = 671237001409839795L;
      Integer var1 = o.has(iIlllIllll<"iIlllIllll","n/EEun2W3BOr72kyqPtj3PlPhYgB8fsa4qjbw0oXrxqHC2I=">())
            && o.get(iIlllIllll<"iIlllIllll","n/EEun2W3BOr72kyqPtj3PlPhYgB8fsa4qjbw0oXrxqHC2I=">()).isJsonPrimitive()
         ? o.get(iIlllIllll<"iIlllIllll","n/EEun2W3BOr72kyqPtj3PlPhYgB8fsa4qjbw0oXrxqHC2I=">()).getAsInt()
         : null;
      var4 ^= (
            (long)(
                     o.has(iIlllIllll<"iIlllIllll","hz3Di7WLEd6F3OfNuiGtImY0nK7yXXMgK24hDjEKvxo6Dw8W">())
                        ? o.get(iIlllIllll<"iIlllIllll","hz3Di7WLEd6F3OfNuiGtImY0nK7yXXMgK24hDjEKvxo6Dw8W">()).getAsInt()
                        : 0
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      var4 ^= (
            (long)(
                  o.has(iIlllIllll<"iIlllIllll","BQb2r/uomDEWYf5cJOzkevlodwUV2/qGYmmZN9dK/RIT/6s=">())
                        && o.get(iIlllIllll<"iIlllIllll","BQb2r/uomDEWYf5cJOzkevlodwUV2/qGYmmZN9dK/RIT/6s=">()).getAsBoolean()
                     ? 1
                     : 0
               )
               ^ var4
         )
         & -1L >>> 32;
      return new lliIiIliliIiIl(
         o.get(iIlllIllll<"iIlllIllll","MIgp7uwdTUgbUpB9K1+MfqCwMHVobCmQB6gTWTqlqJs=">()).getAsString(), var1, (int)(var4 >>> 32), (boolean)((int)var4)
      );
   }

   public static void Iiilliiliiil(String id, Consumer<IllllIllllllIl<List<lliIiIliliIiIl>>> cb) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","tHxnWSHxb6zS/c5Znde+pTO07a2UWa1X0V5xXv2cpoT5S3eAnRfC/9CY">()
               );
            } else {
               iilIliilIIiIliil var1 = Illillliilli(
                  iIlllIllll<"iIlllIllll","16u2pfszbWLHY8SC//M2tGYB0Cemz4K53M/g32f6VQ==">(),
                  iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                     + iIIIlIlIIl(id)
                     + iIlllIllll<"iIlllIllll","uSQ7oIrRd41sztk3twKJXKMOSUM/G9hrApbAIUv/OAqInercDb287A==">(),
                  null,
                  true
               );
               if (var1 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var1.lilIiIilil >= 400) {
                  return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1));
               } else {
                  ArrayList var2 = new ArrayList();
                  if (var1.iilIiIilil.has(iIlllIllll<"iIlllIllll","Wo8lPCqx2ZW079KmGf+C40p6At9LEPL3Kc1wf9VT/XswExGlM1c=">())
                     && var1.iilIiIilil.get(iIlllIllll<"iIlllIllll","Wo8lPCqx2ZW079KmGf+C40p6At9LEPL3Kc1wf9VT/XswExGlM1c=">()).isJsonArray()) {
                     for (JsonElement var4 : var1.iilIiIilil.getAsJsonArray(iIlllIllll<"iIlllIllll","Wo8lPCqx2ZW079KmGf+C40p6At9LEPL3Kc1wf9VT/XswExGlM1c=">())) {
                        if (var4.isJsonObject()) {
                           var2.add(IIillIiliIil(var4.getAsJsonObject()));
                        }
                     }
                  }

                  return IllllIllllllIl.IliIlllilIi(var2);
               }
            }
         },
         cb
      );
   }

   private static boolean liiiIIllIl() {
      return IIIIIllllIIIIlll.iiIIiiilll != null && !IIIIIllllIIIIlll.iiIIiiilll.isBlank();
   }

   public static void IiIiliIiiiIi(String reason, String cb, String id, Consumer<IllllIllllllIl<Boolean>> details) {
      IIlilIliiIli(
         () -> {
            JsonObject var3 = new JsonObject();
            var3.addProperty(iIlllIllll<"iIlllIllll","tds8AKk7urq3lQt3NjNCrLX2+uURPdqpSop95A4WLVJIPw==">(), cb);
            if (id != null) {
               var3.addProperty(iIlllIllll<"iIlllIllll","oc2+1nIDiT8COplFTtpTPcB6LttYtEle/E9Feys+FmvfzT4=">(), id);
            }

            iilIliilIIiIliil var4 = Illillliilli(
               iIlllIllll<"iIlllIllll","lgBiEupbuhT7OKpwb0+JEn4TYhi/Gz4XhOKupQ38U/E=">(),
               iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                  + iIIIlIlIIl(reason)
                  + iIlllIllll<"iIlllIllll","mEYsB9R9cY2gzLn6AAJuEhIPruzP4oN6MPYBq3bNSea9kOw=">(),
               var3,
               true
            );
            if (var4 == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                  iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
               );
            } else {
               return var4.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var4), Iiiiliiiiiii(var4)) : IllllIllllllIl.IliIlllilIi(Boolean.TRUE);
            }
         },
         details
      );
   }

   private static String Iiiiliiiiiii(iilIliilIIiIliil r) {
      if (r.iilIiIilil.has(iIlllIllll<"iIlllIllll","s4vT52af58DpjS0Z+IRb6zGWliAEVd5ee8Yxx391qoEyeDc=">())) {
         return r.iilIiIilil.get(iIlllIllll<"iIlllIllll","s4vT52af58DpjS0Z+IRb6zGWliAEVd5ee8Yxx391qoEyeDc=">()).getAsString();
      } else {
         return r.iilIiIilil.has(iIlllIllll<"iIlllIllll","DTmj1DBeM1PQ82p/g8szp0tGMGtSzMn58pqZx1NKkyjLWQ==">())
               && r.iilIiIilil.get(iIlllIllll<"iIlllIllll","DTmj1DBeM1PQ82p/g8szp0tGMGtSzMn58pqZx1NKkyjLWQ==">()).isJsonArray()
               && r.iilIiIilil.getAsJsonArray(iIlllIllll<"iIlllIllll","DTmj1DBeM1PQ82p/g8szp0tGMGtSzMn58pqZx1NKkyjLWQ==">()).size() > 0
            ? r.iilIiIilil.getAsJsonArray(iIlllIllll<"iIlllIllll","DTmj1DBeM1PQ82p/g8szp0tGMGtSzMn58pqZx1NKkyjLWQ==">()).get(0).getAsString()
            : iIlllIllll<"iIlllIllll","+ajPa0Fd7KLJkIEDbtEdZcPLOH2ONasKWTSA2fFF+gMmsxaqNbbG+25femI=">()
               + r.lilIiIilil
               + iIlllIllll<"iIlllIllll","x7V7aCWWr4TDa10cF/faiPEaH387mJHjVXmH1uVx">();
      }
   }

   private static String Iliilliiilii(iilIliilIIiIliil r) {
      return r.iilIiIilil.has(iIlllIllll<"iIlllIllll","tsN+Ckna00lYe0p01vCvwSahZltGoSuxGjOQcWRzDhtm">())
         ? r.iilIiIilil.get(iIlllIllll<"iIlllIllll","tsN+Ckna00lYe0p01vCvwSahZltGoSuxGjOQcWRzDhtm">()).getAsString()
         : iIlllIllll<"iIlllIllll","bX4DH0wNZlXuWHHGxmQ7Rv/5hB8JwG6p/JGBkWVEzZy0">();
   }

   public static void Iilllilliill(String id, Consumer<IllllIllllllIl<Boolean>> cb) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","IaNKuk8PhKMJ+xJ97JkcM3PI1TnqJ8Abru8G82SSDMpdbgnlmQt+WROiRS7mEzP1pxp5/r6c">()
               );
            } else {
               iilIliilIIiIliil var1 = Illillliilli(
                  iIlllIllll<"iIlllIllll","dV70ufjt2bjrZEeAyBkxMxoRKQRsI3Bd2gh1HUu7Wt6fPQ==">(),
                  iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">() + iIIIlIlIIl(id),
                  null,
                  true
               );
               if (var1 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var1.lilIiIilil == 401) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                     iIlllIllll<"iIlllIllll","IaNKuk8PhKMJ+xJ97JkcM3PI1TnqJ8Abru8G82SSDMpdbgnlmQt+WROiRS7mEzP1pxp5/r6c">()
                  );
               } else if (var1.lilIiIilil == 403) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","vlvn8fQnbBGoA++bDNHJiHajfmPVoiwWlwdBVMKKoDokbEMGPQ==">(),
                     iIlllIllll<"iIlllIllll","K4YDK5I6/kEhEnkwNeXHlchHLbEdYjMDfs36vS0CDHDDuw0QYab6fo93+KJbJXCMCnNA6QcF">()
                  );
               } else if (var1.lilIiIilil == 404) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","ALyV4KDYA/IHVQUgekmKb6rIAiMgvaJqiXwdQ0+bHI6V0CnM9g==">(),
                     iIlllIllll<"iIlllIllll","Wyv0r/ZBPEYrZKSSrUgFALP8JqZ4chHzMomFNCraVKy6zyP+w+d8QQTO+YwQX6PDRXTGhgtfDDfk">()
                  );
               } else {
                  return var1.lilIiIilil >= 400 ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1)) : IllllIllllllIl.IliIlllilIi(Boolean.TRUE);
               }
            }
         },
         cb
      );
   }

   public static void IIlllIlliIll(String visibility, String id, Consumer<IllllIllllllIl<lllililillilil>> cb) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","tHxnWSHxb6zS/c5Znde+pTO07a2UWa1X0V5xXv2cpoT5S3eAnRfC/9CY">()
               );
            } else {
               JsonObject var2 = new JsonObject();
               var2.addProperty(iIlllIllll<"iIlllIllll","gcmLTQ34f8PULWlblhVS3PYCqp98chkeIdFoYyNQRpWo0LrTNwA=">(), id);
               iilIliilIIiIliil var3 = Illillliilli(
                  iIlllIllll<"iIlllIllll","xWoHD1E5f+QfQhscypEZwmqzH7HnDwIYeqJNyE0S/ZkI">(),
                  iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">() + iIIIlIlIIl(visibility),
                  var2,
                  true
               );
               if (var3 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var3.lilIiIilil == 403) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","vlvn8fQnbBGoA++bDNHJiHajfmPVoiwWlwdBVMKKoDokbEMGPQ==">(),
                     iIlllIllll<"iIlllIllll","K4YDK5I6/kEhEnkwNeXHlchHLbEdYjMDfs36vS0CDHDDuw0QYab6fo93+KJbJXCMCnNA6QcF">()
                  );
               } else {
                  return var3.lilIiIilil >= 400
                     ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var3), Iiiiliiiiiii(var3))
                     : IllllIllllllIl.IliIlllilIi(
                        lllililillilil.IliIlllilIi(
                           var3.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">())
                        )
                     );
               }
            }
         },
         cb
      );
   }

   public static void iIlIlllllill(Map<String, String> cb, Consumer<IllllIllllllIl<Ilillillilli>> params) {
      IIlilIliiIli(
         () -> {
            iilIliilIIiIliil var1 = Illillliilli(
               iIlllIllll<"iIlllIllll","16u2pfszbWLHY8SC//M2tGYB0Cemz4K53M/g32f6VQ==">(),
               iIlllIllll<"iIlllIllll","dBek7AaUH3g7vszkl0hPknrx04kM76RdcAfx7e7Fg7DTRCHV">() + llIIlilIIl(cb),
               null,
               true
            );
            if (var1 == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                  iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
               );
            } else {
               return var1.lilIiIilil >= 400
                  ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1))
                  : IllllIllllllIl.IliIlllilIi(Ilillillilli.IliIlllilIi(var1.iilIiIilil));
            }
         },
         params
      );
   }

   private static iilIliilIIiIliil IIiilIiiiIii(String auth, String method, JsonObject body, boolean pathSuffix) {
      try {
         Builder var4 = HttpRequest.newBuilder(URI.create(IIIIIllllIIIIlll.iiIIiiilll + method))
            .timeout(Duration.ofMillis(8000L))
            .header(
               iIlllIllll<"iIlllIllll","0VnOHvijpRo0VSbW5jfKUC8I5AyF5NvXjNafZQR7MRRiXA==">(),
               iIlllIllll<"iIlllIllll","Q1lghUhNUdoazhbb8Lj9KQ8zm5HnpI+PKTIrQN9WLx/aY0MGoSxTdT3+SRg=">()
            );
         if (pathSuffix) {
            String var5 = IIIIIllllIIIIlll.Ililllililil();
            if (var5 != null) {
               var4.header(
                  iIlllIllll<"iIlllIllll","hGYBUSMzqoFvqFfnGsCSRlRRxiffbWH+VBkN26x+/n59YSs03WDApNk=">(),
                  iIlllIllll<"iIlllIllll","gXg4VcEhSJpSb2QhAQZPS03vpwgvfJx9KUJu44ZXRE1ZTl0=">() + var5
               );
            }
         }

         if (body != null) {
            var4.header(
               iIlllIllll<"iIlllIllll","bwSsVInQGa4P2/hGVyb38H0vPi54DwN0KAWQlD9z4/bmo4EzONBlzA==">(),
               iIlllIllll<"iIlllIllll","Q1lghUhNUdoazhbb8Lj9KQ8zm5HnpI+PKTIrQN9WLx/aY0MGoSxTdT3+SRg=">()
            );
            var4.method(auth, BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8));
         } else {
            var4.method(auth, BodyPublishers.noBody());
         }

         java.net.http.HttpResponse var10 = iIlIlliIiIllIlliIi.send(var4.build(), BodyHandlers.ofString(StandardCharsets.UTF_8));

         JsonObject var6;
         try {
            var6 = JsonParser.parseString((String)var10.body()).getAsJsonObject();
         } catch (Exception var8) {
            var6 = new JsonObject();
         }

         return new iilIliilIIiIliil(var10.statusCode(), var6);
      } catch (Exception var9) {
         return null;
      }
   }

   public static void lIiiIiIlilli(String id, Consumer<IllllIllllllIl<List<JsonObject>>> cb) {
      IIlilIliiIli(
         () -> {
            iilIliilIIiIliil var1 = Illillliilli(
               iIlllIllll<"iIlllIllll","16u2pfszbWLHY8SC//M2tGYB0Cemz4K53M/g32f6VQ==">(),
               iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                  + iIIIlIlIIl(id)
                  + iIlllIllll<"iIlllIllll","JOo7YRi27VthGYjkl2HfsZKNmUSft/7iGbgjQDvE9uTYaoEqjQ==">(),
               null,
               true
            );
            if (var1 == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                  iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
               );
            } else if (var1.lilIiIilil >= 400) {
               return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1));
            } else {
               ArrayList var2 = new ArrayList();
               JsonArray var3 = var1.iilIiIilil.getAsJsonArray(iIlllIllll<"iIlllIllll","0FPMzlSrS92dPERxCWMuD3VS5XTuRILv6i60RqF3rmDoXRaj">());
               if (var3 != null) {
                  for (JsonElement var5 : var3) {
                     if (var5.isJsonObject()) {
                        var2.add(var5.getAsJsonObject());
                     }
                  }
               }

               return IllllIllllllIl.IliIlllilIi(var2);
            }
         },
         cb
      );
   }

   private static String Iilililiiili(InputStream in) {
      if (in == null) {
         return "";
      } else {
         try {
            InputStream var1 = in;

            String var2;
            try {
               var2 = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            } catch (Throwable var5) {
               if (in != null) {
                  try {
                     var1.close();
                  } catch (Throwable var4) {
                     var5.addSuppressed(var4);
                  }
               }

               throw var5;
            }

            if (in != null) {
               in.close();
            }

            return var2;
         } catch (Exception var6) {
            return "";
         }
      }
   }

   public static void Illlllllilll(String like, boolean cb, Consumer<IllllIllllllIl<Long>> id) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","lvpUkUdlZbNzhZEXo7GIts3+zDqImYrQScRLOoggvEB3fatSZJcF4OPJia4L6XSDeiJx2A==">()
               );
            } else {
               iilIliilIIiIliil var2 = Illillliilli(
                  cb
                     ? iIlllIllll<"iIlllIllll","lgBiEupbuhT7OKpwb0+JEn4TYhi/Gz4XhOKupQ38U/E=">()
                     : iIlllIllll<"iIlllIllll","dV70ufjt2bjrZEeAyBkxMxoRKQRsI3Bd2gh1HUu7Wt6fPQ==">(),
                  iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                     + iIIIlIlIIl(like)
                     + iIlllIllll<"iIlllIllll","cCVSS342yvYHvJ96pHekhFgFjTQoTvKa6yKUydLkH4Pg">(),
                  null,
                  true
               );
               if (var2 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var2.lilIiIilil == 401) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                     iIlllIllll<"iIlllIllll","lvpUkUdlZbNzhZEXo7GIts3+zDqImYrQScRLOoggvEB3fatSZJcF4OPJia4L6XSDeiJx2A==">()
                  );
               } else if (var2.lilIiIilil >= 400) {
                  return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var2), Iiiiliiiiiii(var2));
               } else {
                  long var3 = var2.iilIiIilil.has(iIlllIllll<"iIlllIllll","gvBqjP+sQDfIMM0gRJkxt2pTrbCKSQix4aFdBoWO3CeeFPH/bg==">())
                     ? var2.iilIiIilil.get(iIlllIllll<"iIlllIllll","gvBqjP+sQDfIMM0gRJkxt2pTrbCKSQix4aFdBoWO3CeeFPH/bg==">()).getAsLong()
                     : 0L;
                  return IllllIllllllIl.IliIlllilIi(var3);
               }
            }
         },
         id
      );
   }

   public static void Ililllililil(String maxUses, Integer id, Consumer<IllllIllllllIl<lliIiIliliIiIl>> cb) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","bF1eAbg++2WPNk5DlwCx4GSiLfKrWs46a9Isx3/eXvVFLL6/q0+P2BvBBJKrLziTXYVvCv0=">()
               );
            } else {
               JsonObject var2 = new JsonObject();
               if (id != null) {
                  var2.addProperty(iIlllIllll<"iIlllIllll","n/EEun2W3BOr72kyqPtj3PlPhYgB8fsa4qjbw0oXrxqHC2I=">(), id);
               }

               iilIliilIIiIliil var3 = Illillliilli(
                  iIlllIllll<"iIlllIllll","lgBiEupbuhT7OKpwb0+JEn4TYhi/Gz4XhOKupQ38U/E=">(),
                  iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                     + iIIIlIlIIl(maxUses)
                     + iIlllIllll<"iIlllIllll","uSQ7oIrRd41sztk3twKJXKMOSUM/G9hrApbAIUv/OAqInercDb287A==">(),
                  var2,
                  true
               );
               if (var3 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var3.lilIiIilil == 403) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","vlvn8fQnbBGoA++bDNHJiHajfmPVoiwWlwdBVMKKoDokbEMGPQ==">(),
                     iIlllIllll<"iIlllIllll","K4YDK5I6/kEhEnkwNeXHlchHLbEdYjMDfs36vS0CDHDDuw0QYab6fo93+KJbJXCMCnNA6QcF">()
                  );
               } else {
                  return var3.lilIiIilil >= 400
                     ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var3), Iiiiliiiiiii(var3))
                     : IllllIllllllIl.IliIlllilIi(
                        IIillIiliIil(var3.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","RzT25oMIaSbbg6xMdDl8oU0bj2PgFGZAWLXuNgY/hpnVNqSA2A==">()))
                     );
               }
            }
         },
         cb
      );
   }

   public static void IiIlliIliiIl(String profile, lIlIllIliIlIllIl id, String cb, Consumer<IllllIllllllIl<lllililillilil>> changelog) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","tHxnWSHxb6zS/c5Znde+pTO07a2UWa1X0V5xXv2cpoT5S3eAnRfC/9CY">()
               );
            } else {
               lIlIllIliIlIllIl var3 = IliIlllilIi(id);
               if (var3 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","dHK2harokhOK4mtjj/BZr9urGDg28+KzR8+MlYVkXcy7Ug==">(),
                     iIlllIllll<"iIlllIllll","Fl1X5hFO9HAa0wMkDmq1GUUwjRVDMB7G7erb66C/MjDV/euyawjjvQsTVkoGYoGnJBJUfRcUMRyCo6Uou5iy9SLzT/grOIaINdxI1KO+xCGLjexzgg==">()
                  );
               } else {
                  JsonObject var4 = new JsonObject();
                  var4.addProperty(
                     iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">(), new String(var3.iIlIlllllill(), StandardCharsets.UTF_8)
                  );
                  if (cb != null) {
                     var4.addProperty(iIlllIllll<"iIlllIllll","Sw544I+K2s+CB4AIUAsmiOywwu6AHOAjDwN6DSwhiiG1ba6CCA==">(), cb);
                  }

                  iilIliilIIiIliil var5 = Illillliilli(
                     iIlllIllll<"iIlllIllll","lgBiEupbuhT7OKpwb0+JEn4TYhi/Gz4XhOKupQ38U/E=">(),
                     iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                        + iIIIlIlIIl(profile)
                        + iIlllIllll<"iIlllIllll","Lbh8a7wxPzRi8xdevWc9riPd2I6s8sia7AJmfQ8rOgg44c1F">(),
                     var4,
                     true
                  );
                  if (var5 == null) {
                     return IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                        iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                     );
                  } else if (var5.lilIiIilil == 403) {
                     return IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","vlvn8fQnbBGoA++bDNHJiHajfmPVoiwWlwdBVMKKoDokbEMGPQ==">(),
                        iIlllIllll<"iIlllIllll","K4YDK5I6/kEhEnkwNeXHlchHLbEdYjMDfs36vS0CDHDDuw0QYab6fo93+KJbJXCMCnNA6QcF">()
                     );
                  } else {
                     return var5.lilIiIilil >= 400
                        ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var5), Iiiiliiiiiii(var5))
                        : IllllIllllllIl.IliIlllilIi(
                           lllililillilil.IliIlllilIi(
                              var5.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">())
                           )
                        );
                  }
               }
            }
         },
         changelog
      );
   }

   public static void iliIiiliiiii(String versionId, String id, Consumer<IllllIllllllIl<iIlIiillIllIiill>> cb) {
      IIlilIliiIli(
         () -> {
            String var2 = iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
               + iIIIlIlIIl(versionId)
               + iIlllIllll<"iIlllIllll","CN7tLUT+zia/php50Qio0HVOukYkaClKVuaiIUAuT9wT2EjnPQ==">();
            LinkedHashMap var3 = new LinkedHashMap();
            if (id != null) {
               var3.put(iIlllIllll<"iIlllIllll","ESJixhMWV1zddWkNgikGM2iUJpvK8jonYas1w6COoS/k8ZGYUQ==">(), id);
            }

            var3.put(iIlllIllll<"iIlllIllll","/stl9llCpeB9d0nmRdCU24rPyk7Rh5xRy6EG9vhOscJYxJYuWntQJ7U=">(), IIIIIllllIIIIlll.IIillIiliIil());
            iilIliilIIiIliil var4 = Illillliilli(iIlllIllll<"iIlllIllll","16u2pfszbWLHY8SC//M2tGYB0Cemz4K53M/g32f6VQ==">(), var2 + llIIlilIIl(var3), null, true);
            if (var4 == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                  iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
               );
            } else if (var4.lilIiIilil == 404) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","ALyV4KDYA/IHVQUgekmKb6rIAiMgvaJqiXwdQ0+bHI6V0CnM9g==">(),
                  iIlllIllll<"iIlllIllll","Wyv0r/ZBPEYrZKSSrUgFALP8JqZ4chHzMomFNCraVKy6zyP+w+d8QQTO+YwQX6PDRXTGhgtfDDfk">()
               );
            } else if (var4.lilIiIilil >= 400) {
               return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var4), Iiiiliiiiiii(var4));
            } else {
               JsonObject var5 = var4.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","uJ0xz49v3wd9C6c+8i3oXjnnGU7JjrFL9LLwc7V6IAg=">());
               String var6 = var4.iilIiIilil.has(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">())
                     && var4.iilIiIilil.get(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">()).isJsonPrimitive()
                  ? var4.iilIiIilil.get(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">()).getAsString()
                  : null;
               if (var6 != null && var5 != null) {
                  byte[] var7 = var6.getBytes(StandardCharsets.UTF_8);
                  String var8 = var5.has(iIlllIllll<"iIlllIllll","f5nK9Sdfhsp/8CzLWoUUYjaha+P3HF3T6UvI6vGM/QXXLw==">())
                     ? var5.get(iIlllIllll<"iIlllIllll","f5nK9Sdfhsp/8CzLWoUUYjaha+P3HF3T6UvI6vGM/QXXLw==">()).getAsString()
                     : "";
                  String var9 = lIlIllIliIlIllIl.IlIlllIlilIl(var7);
                  return !var9.equalsIgnoreCase(var8)
                     ? IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","OzccOxu1TY0t5sVrVi7kRgWSD7nIrzKrLg6t4nWBe5EFRwmAg/FWrg==">(),
                        iIlllIllll<"iIlllIllll","gsVB3XUwxEMlrp2pDFp6xI1ewcC0Vb0DgnLshHjaKj66/Cw4i3Dzeib6Oj89SHx81l6gD33WGmojvZ+QtnCpNsGvsORkXAmJlw==">()
                     )
                     : IllllIllllllIl.IliIlllilIi(new iIlIiillIllIiill(var7, var5));
               } else {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","oQK5rIpFlhjQrJ1s2ri/oTvfkAWaC/ckoQjk5wC2vMR6PvKqSipX/w==">(),
                     iIlllIllll<"iIlllIllll","WBYCtKpBwPmJQo1BHCAOlfGtsLn+CevlvIp//ajYYqjCstM7l7egucptq278tlI=">()
                  );
               }
            }
         },
         cb
      );
   }

   private IlliIilllliIil() {
   }

   private static iilIliilIIiIliil Illillliilli(String method, String body, JsonObject auth, boolean pathSuffix) {
      long var10 = -5852550268405934176L;
      if (!liiiIIllIl()) {
         return null;
      } else if (iIlllIllll<"iIlllIllll","xWoHD1E5f+QfQhscypEZwmqzH7HnDwIYeqJNyE0S/ZkI">().equals(method)) {
         return IIiilIiiiIii(method, body, auth, pathSuffix);
      } else {
         HttpURLConnection var4 = null;

         Object var6;
         try {
            var4 = (HttpURLConnection)URI.create(IIIIIllllIIIIlll.iiIIiiilll + body).toURL().openConnection();
            var4.setRequestMethod(method);
            var4.setRequestProperty(
               iIlllIllll<"iIlllIllll","0VnOHvijpRo0VSbW5jfKUC8I5AyF5NvXjNafZQR7MRRiXA==">(),
               iIlllIllll<"iIlllIllll","Q1lghUhNUdoazhbb8Lj9KQ8zm5HnpI+PKTIrQN9WLx/aY0MGoSxTdT3+SRg=">()
            );
            var4.setConnectTimeout(6000);
            var4.setReadTimeout(8000);
            if (pathSuffix) {
               String var5 = IIIIIllllIIIIlll.Ililllililil();
               if (var5 != null) {
                  var4.setRequestProperty(
                     iIlllIllll<"iIlllIllll","hGYBUSMzqoFvqFfnGsCSRlRRxiffbWH+VBkN26x+/n59YSs03WDApNk=">(),
                     iIlllIllll<"iIlllIllll","gXg4VcEhSJpSb2QhAQZPS03vpwgvfJx9KUJu44ZXRE1ZTl0=">() + var5
                  );
               }
            }

            if (auth != null) {
               var4.setRequestProperty(
                  iIlllIllll<"iIlllIllll","bwSsVInQGa4P2/hGVyb38H0vPi54DwN0KAWQlD9z4/bmo4EzONBlzA==">(),
                  iIlllIllll<"iIlllIllll","Q1lghUhNUdoazhbb8Lj9KQ8zm5HnpI+PKTIrQN9WLx/aY0MGoSxTdT3+SRg=">()
               );
               var4.setDoOutput(true);

               try (OutputStream var22 = var4.getOutputStream()) {
                  var22.write(auth.toString().getBytes(StandardCharsets.UTF_8));
               }
            }

            var10 ^= ((long)var4.getResponseCode() << 32 ^ var10) & -1L << 32;
            String var23 = Iilililiiili((int)(var10 >>> 32) < 400 ? var4.getInputStream() : var4.getErrorStream());

            JsonObject var7;
            try {
               var7 = JsonParser.parseString(var23).getAsJsonObject();
            } catch (Exception var18) {
               var7 = new JsonObject();
            }

            return new iilIliilIIiIliil((int)(var10 >>> 32), var7);
         } catch (Exception var20) {
            var6 = null;
         } finally {
            if (var4 != null) {
               var4.disconnect();
            }
         }

         return (iilIliilIIiIliil)var6;
      }
   }

   public static void IilliliilIIi(String cb, Consumer<IllllIllllllIl<lllililillilil>> id) {
      IIlilIliiIli(
         () -> {
            iilIliilIIiIliil var1 = Illillliilli(
               iIlllIllll<"iIlllIllll","16u2pfszbWLHY8SC//M2tGYB0Cemz4K53M/g32f6VQ==">(),
               iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">() + iIIIlIlIIl(cb),
               null,
               true
            );
            if (var1 == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                  iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
               );
            } else if (var1.lilIiIilil == 404) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","ALyV4KDYA/IHVQUgekmKb6rIAiMgvaJqiXwdQ0+bHI6V0CnM9g==">(),
                  iIlllIllll<"iIlllIllll","Wyv0r/ZBPEYrZKSSrUgFALP8JqZ4chHzMomFNCraVKy6zyP+w+d8QQTO+YwQX6PDRXTGhgtfDDfk">()
               );
            } else {
               return var1.lilIiIilil >= 400
                  ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var1), Iiiiliiiiiii(var1))
                  : IllllIllllllIl.IliIlllilIi(
                     lllililillilil.IliIlllilIi(var1.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">()))
                  );
            }
         },
         id
      );
   }

   public static void IIIilIIiiIIi(String id, String cb, Consumer<IllllIllllllIl<Boolean>> code) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","tHxnWSHxb6zS/c5Znde+pTO07a2UWa1X0V5xXv2cpoT5S3eAnRfC/9CY">()
               );
            } else {
               iilIliilIIiIliil var2 = Illillliilli(
                  iIlllIllll<"iIlllIllll","dV70ufjt2bjrZEeAyBkxMxoRKQRsI3Bd2gh1HUu7Wt6fPQ==">(),
                  iIlllIllll<"iIlllIllll","S5CIuPwZV3M+rupyREiMS8cYPH30hQbJ9zEK5FNdTAnwdtaj7Q==">()
                     + iIIIlIlIIl(id)
                     + iIlllIllll<"iIlllIllll","O1fnfmeWSX3ZIu6UTWoOufQGWCjDrRU4C+zcqPeTZQVhXKcwscajlEs=">()
                     + iIIIlIlIIl(cb),
                  null,
                  true
               );
               if (var2 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else {
                  return var2.lilIiIilil >= 400
                     ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var2), Iiiiliiiiiii(var2))
                     : IllllIllllllIl.IliIlllilIi(
                        var2.iilIiIilil.has(iIlllIllll<"iIlllIllll","AU++g2/nkxPLuyBA7ad7oyrlRv4Lvp7M5WRFxx9j">())
                           && var2.iilIiIilil.get(iIlllIllll<"iIlllIllll","AU++g2/nkxPLuyBA7ad7oyrlRv4Lvp7M5WRFxx9j">()).getAsBoolean()
                     );
               }
            }
         },
         code
      );
   }

   public static void IlIlllIlilIl(
      lIlIllIliIlIllIl changelog, List<String> visibility, String tags, String profile, Consumer<IllllIllllllIl<lllililillilil>> cb
   ) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","k4gqiE6zJU4XrdaRsPaXMJ5dGjR2xD6sgTc/oiFQA9T9VpcbFVYbPkB4b2KAgfIYdndIcSTezP1diOf/ixZz9SObWg==">()
               );
            } else {
               lIlIllIliIlIllIl var4 = IliIlllilIi(changelog);
               if (var4 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","dHK2harokhOK4mtjj/BZr9urGDg28+KzR8+MlYVkXcy7Ug==">(),
                     iIlllIllll<"iIlllIllll","Fl1X5hFO9HAa0wMkDmq1GUUwjRVDMB7G7erb66C/MjDV/euyawjjvQsTVkoGYoGnJBJUfRcUMRyCo6Uou5iy9SLzT/grOIaINdxI1KO+xCGLjexzgg==">()
                  );
               } else {
                  JsonObject var5 = new JsonObject();
                  var5.addProperty(
                     iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">(), new String(var4.iIlIlllllill(), StandardCharsets.UTF_8)
                  );
                  var5.addProperty(iIlllIllll<"iIlllIllll","iQcECRIUsDRI+t4FqtldbwEX+7VYfGj312+WThqIJgZRkoy8DxtHNo66VX5S">(), IIIIllIIIl());
                  if (tags != null) {
                     var5.addProperty(iIlllIllll<"iIlllIllll","gcmLTQ34f8PULWlblhVS3PYCqp98chkeIdFoYyNQRpWo0LrTNwA=">(), tags);
                  }

                  if (profile != null) {
                     var5.addProperty(iIlllIllll<"iIlllIllll","Sw544I+K2s+CB4AIUAsmiOywwu6AHOAjDwN6DSwhiiG1ba6CCA==">(), profile);
                  }

                  if (visibility != null) {
                     JsonArray var6 = new JsonArray();

                     for (String var8 : visibility) {
                        var6.add(var8);
                     }

                     var5.add(iIlllIllll<"iIlllIllll","1wkkALp7MQTL97hV8KHgESqTuJTfCp571IclQkwBbok=">(), var6);
                  }

                  iilIliilIIiIliil var9 = Illillliilli(
                     iIlllIllll<"iIlllIllll","lgBiEupbuhT7OKpwb0+JEn4TYhi/Gz4XhOKupQ38U/E=">(),
                     iIlllIllll<"iIlllIllll","dBek7AaUH3g7vszkl0hPknrx04kM76RdcAfx7e7Fg7DTRCHV">(),
                     var5,
                     true
                  );
                  if (var9 == null) {
                     return IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                        iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                     );
                  } else if (var9.lilIiIilil == 401) {
                     return IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                        iIlllIllll<"iIlllIllll","k4gqiE6zJU4XrdaRsPaXMJ5dGjR2xD6sgTc/oiFQA9T9VpcbFVYbPkB4b2KAgfIYdndIcSTezP1diOf/ixZz9SObWg==">()
                     );
                  } else if (var9.lilIiIilil == 409) {
                     return IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","C1eQr/tWPTHPXmpBRIFr5rIcglYtHZM3RWeYFja+CwEgHVbvIg==">(),
                        iIlllIllll<"iIlllIllll","QZ2aiWSXVahhqNjdZ673d/7uyerCjRoAvkn0E1sbuGTD5J6SEYA6EeJ9xrh15YN70MGP5oeeC/5pRKLpj4sOjAW2eFeVWR3jgQ==">()
                     );
                  } else {
                     return var9.lilIiIilil >= 400
                        ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var9), Iiiiliiiiiii(var9))
                        : IllllIllllllIl.IliIlllilIi(
                           lllililillilil.IliIlllilIi(
                              var9.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">())
                           )
                        );
                  }
               }
            }
         },
         cb
      );
   }

   private static String IIIIllIIIl() {
      try {
         String var0 = class_310.method_1551().method_1548().method_1676();
         return var0 != null && !var0.isBlank() ? var0 : iIlllIllll<"iIlllIllll","RCQqVPfkF/B+5+7xoq/se68UpeqjfHUFB7xf5v1ndcF3rU57dA==">();
      } catch (Throwable var1) {
         return iIlllIllll<"iIlllIllll","RCQqVPfkF/B+5+7xoq/se68UpeqjfHUFB7xf5v1ndcF3rU57dA==">();
      }
   }

   private static <T> void IIlilIliiIli(Callable<IllllIllllllIl<T>> cb, Consumer<IllllIllllllIl<T>> work) {
      Thread var2 = new Thread(
         () -> {
            IllllIllllllIl var2x;
            try {
               var2x = (IllllIllllllIl)cb.call();
            } catch (Exception var5) {
               var2x = IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","bX4DH0wNZlXuWHHGxmQ7Rv/5hB8JwG6p/JGBkWVEzZy0">(),
                  iIlllIllll<"iIlllIllll","ecPFLSaSR8RVRF4DttKvUwEmdOxVR4jq4KsB7idLtz7axtVyIJSl96D8JBFL">()
               );
            }

            try {
               work.accept(var2x);
            } catch (Exception var4) {
            }
         },
         iIlllIllll<"iIlllIllll","8cd+TX/xsOCpzRZxiW79vPOaBkj8FBZIwv3P8Ek2ClyM3/tV08gRkKW1">()
      );
      var2.setDaemon(true);
      var2.start();
   }

   private static String llIIlilIIl(Map<String, String> params) {
      long var5 = 8331924571931190772L;
      if (params != null && !params.isEmpty()) {
         StringBuilder var1 = new StringBuilder(iIlllIllll<"iIlllIllll","ey92IBLQFcOl65GXg/YaTyKoGUcuAKplhpJ5VYo=">());
         var5 ^= (4294967296L ^ var5) & -1L << 32;

         for (Entry var4 : params.entrySet()) {
            if (var4.getValue() != null && !((String)var4.getValue()).isEmpty()) {
               if ((int)(var5 >>> 32) == 0) {
                  var1.append('&');
               }

               var1.append(iIIIlIlIIl((String)var4.getKey())).append('=').append(iIIIlIlIIl((String)var4.getValue()));
               var5 ^= (0L ^ var5) & -1L << 32;
            }
         }

         return var1.length() == 1 ? "" : var1.toString();
      } else {
         return "";
      }
   }

   public static lIlIllIliIlIllIl IliIlllilIi(lIlIllIliIlIllIl profile) {
      return profile != null && lIiIiIlliIiIiIll.IliIlllilIi().IlIlllIlilIl() ? iilIliIlIIiIliIl.IiIlliIliiIl(profile) : null;
   }

   private static String iIIIlIlIIl(String s) {
      return URLEncoder.encode(s == null ? "" : s, StandardCharsets.UTF_8);
   }

   public static void IIIllIIliIIl(Consumer<IllllIllllllIl<Ilillillilli>> cb) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","0oyW2K3TQTzQWh+5dzJLxBIAQvD76YxECBB7sV9k+FdegGUJK8TjjLXDyDuXufYG1xRoCipKOzc2">()
               );
            } else {
               iilIliilIIiIliil var0 = Illillliilli(
                  iIlllIllll<"iIlllIllll","16u2pfszbWLHY8SC//M2tGYB0Cemz4K53M/g32f6VQ==">(),
                  iIlllIllll<"iIlllIllll","aUFVmv8OqNaI9R+TMJchGhvR6PSlpi3zrf7bWRD/MJfveLhDH9xuRYE=">(),
                  null,
                  true
               );
               if (var0 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var0.lilIiIilil == 401) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                     iIlllIllll<"iIlllIllll","0oyW2K3TQTzQWh+5dzJLxBIAQvD76YxECBB7sV9k+FdegGUJK8TjjLXDyDuXufYG1xRoCipKOzc2">()
                  );
               } else {
                  return var0.lilIiIilil >= 400
                     ? IllllIllllllIl.liiiIIllIl(Iliilliiilii(var0), Iiiiliiiiiii(var0))
                     : IllllIllllllIl.IliIlllilIi(Ilillillilli.IliIlllilIi(var0.iilIiIilil));
               }
            }
         },
         cb
      );
   }

   public static void IlIillIiilIi(String cb, Consumer<IllllIllllllIl<iIlIiillIllIiill>> code) {
      IIlilIliiIli(
         () -> {
            if (IIIIIllllIIIIlll.Ililllililil() == null) {
               return IllllIllllllIl.liiiIIllIl(
                  iIlllIllll<"iIlllIllll","+0eE8x5R2kZYd0RhTbkBzd0j6OZIQUhaiN80w/Yr2Sh3yeb9bAbowg==">(),
                  iIlllIllll<"iIlllIllll","UnBcLujk8J4CASIsYCdd3dwLLgEx6U++/9nxd4vfvJfZx20QGleRhmt/4ieyeSkvsodfQmo=">()
               );
            } else {
               JsonObject var1 = new JsonObject();
               var1.addProperty(iIlllIllll<"iIlllIllll","MIgp7uwdTUgbUpB9K1+MfqCwMHVobCmQB6gTWTqlqJs=">(), cb);
               iilIliilIIiIliil var2 = Illillliilli(
                  iIlllIllll<"iIlllIllll","lgBiEupbuhT7OKpwb0+JEn4TYhi/Gz4XhOKupQ38U/E=">(),
                  iIlllIllll<"iIlllIllll","EzFM4Aexn5sCqBHw86cfqAg3xMhfuRLxG7TB4NZZz0+MAOu4CRkBEESKig==">(),
                  var1,
                  true
               );
               if (var2 == null) {
                  return IllllIllllllIl.liiiIIllIl(
                     iIlllIllll<"iIlllIllll","h/J7Hn7X9FK6CoSSv7M6pLUR6KBIZSonlj8lVH5dWjRxcW0=">(),
                     iIlllIllll<"iIlllIllll","FT1MxjJ3AQV7iSmLEEbgI00enFkMp/phpezpo+HCtlHnsZfJMWe0sg2RPGXrOmpldRZg/8C6XOcYQHssDQ==">()
                  );
               } else if (var2.lilIiIilil >= 400) {
                  return IllllIllllllIl.liiiIIllIl(Iliilliiilii(var2), Iiiiliiiiiii(var2));
               } else {
                  JsonObject var3 = var2.iilIiIilil.getAsJsonObject(iIlllIllll<"iIlllIllll","uJ0xz49v3wd9C6c+8i3oXjnnGU7JjrFL9LLwc7V6IAg=">());
                  String var4 = var2.iilIiIilil.has(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">())
                        && var2.iilIiIilil.get(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">()).isJsonPrimitive()
                     ? var2.iilIiIilil.get(iIlllIllll<"iIlllIllll","q5O6A6mx8yeoBTxOU+tRPWRR4Fu4moU+aGxV+gXDCsA9RQ==">()).getAsString()
                     : null;
                  if (var4 != null && var3 != null) {
                     byte[] var5 = var4.getBytes(StandardCharsets.UTF_8);
                     String var6 = var3.has(iIlllIllll<"iIlllIllll","f5nK9Sdfhsp/8CzLWoUUYjaha+P3HF3T6UvI6vGM/QXXLw==">())
                        ? var3.get(iIlllIllll<"iIlllIllll","f5nK9Sdfhsp/8CzLWoUUYjaha+P3HF3T6UvI6vGM/QXXLw==">()).getAsString()
                        : "";
                     String var7 = lIlIllIliIlIllIl.IlIlllIlilIl(var5);
                     return !var7.equalsIgnoreCase(var6)
                        ? IllllIllllllIl.liiiIIllIl(
                           iIlllIllll<"iIlllIllll","OzccOxu1TY0t5sVrVi7kRgWSD7nIrzKrLg6t4nWBe5EFRwmAg/FWrg==">(),
                           iIlllIllll<"iIlllIllll","m+yi3sIopO5gFpOmDvvJufZyeqtylGNiIr2CBeYzONYA0XXvpLJgGM0zktk71moeKz0I78H0GFniBJ8ajj2rLbzeRkzU">()
                        )
                        : IllllIllllllIl.IliIlllilIi(new iIlIiillIllIiill(var5, var3));
                  } else {
                     return IllllIllllllIl.liiiIIllIl(
                        iIlllIllll<"iIlllIllll","oQK5rIpFlhjQrJ1s2ri/oTvfkAWaC/ckoQjk5wC2vMR6PvKqSipX/w==">(),
                        iIlllIllll<"iIlllIllll","OwP0vyXnxYpqlIsCOGCZq/J6UOxTXKKdIClvI+GVxd4uHlb8SuZeFUB5Jh9F">()
                     );
                  }
               }
            }
         },
         code
      );
   }
}
