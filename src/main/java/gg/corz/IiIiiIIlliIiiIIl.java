package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7920;
import net.minecraft.class_8685;

public final class IiIiiIIlliIiiIIl {
   private static final ExecutorService llIiIlilIl = Executors.newFixedThreadPool(2, r -> {
      Thread var1 = new Thread(r, IlIillIiilIi<"IlIillIiilIi","Gj5oO423iFEfcZkSmxlWLz+/EJi4FU3+ihGWgBhpGgJJpfPhQengQyjTAw==">());
      var1.setDaemon(true);
      return var1;
   });
   private static final Set<String> IlIiIlilIl = ConcurrentHashMap.newKeySet();
   private static final Map<String, class_8685> lIIiIlilIl = new ConcurrentHashMap<>();
   private static final Set<String> iIIiIlilIl = ConcurrentHashMap.newKeySet();
   private static final int iiilIlilIl = 128;
   private static final Map<String, class_8685> IIIiIlilIl = new LinkedHashMap<>();

   public static boolean iIlIlllllill(String name) {
      return name != null && !name.isEmpty() && liiiIIllIl(name) != null;
   }

   private static String[] IiIlliIliiIl(String uuid) {
      try {
         String var1 = Illlllllilll(
            IlIillIiilIi<"IlIillIiilIi","B/mm0JASKMNIpqGdi8oIbsCICUPlvGHTSZ66hqLyqGNuPH7iXRxHkQBfE+2W7Fg2gws8gqH5O9LI4w8NeO1HiDzA70OEHSPZeFaVDUhSKadN6vikuKMI">()
               + uuid
         );
         if (var1 == null) {
            return null;
         } else {
            JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
            JsonArray var3 = var2.getAsJsonArray(IlIillIiilIi<"IlIillIiilIi","DE/AjLNyV7dcO3VDWRzkgAjkZJhx6hSfMXT16N2MmV+D3bUwUMI=">());
            if (var3 != null && !var3.isEmpty()) {
               String var4 = var3.get(0).getAsJsonObject().get(IlIillIiilIi<"IlIillIiilIi","OBDHvKiKY94DZnCQhXHQQtr4ZrzL6G6oRxlouJemQyL0">()).getAsString();
               String var5 = new String(Base64.getDecoder().decode(var4), StandardCharsets.UTF_8);
               JsonObject var6 = JsonParser.parseString(var5)
                  .getAsJsonObject()
                  .getAsJsonObject(IlIillIiilIi<"IlIillIiilIi","4tQvayWI/eT6bgRI5uFSSXOIpVhMipehddyz1zSjBFJCCvHL">());
               if (var6 == null) {
                  return null;
               } else {
                  JsonObject var7 = var6.getAsJsonObject(IlIillIiilIi<"IlIillIiilIi","v9j9S/bpBaZ8aphr1yfC+mHVhzfoZ/JinCbZXy/mWxA=">());
                  if (var7 != null && var7.has(IlIillIiilIi<"IlIillIiilIi","u9XnBlSvA4WhIFwZNk/jZ0LkpWqzGmxCVuj2HpAl2A==">())) {
                     String var8 = var7.get(IlIillIiilIi<"IlIillIiilIi","u9XnBlSvA4WhIFwZNk/jZ0LkpWqzGmxCVuj2HpAl2A==">()).getAsString();
                     String var9 = "";
                     if (var7.has(IlIillIiilIi<"IlIillIiilIi","AQuoAbBtPPVZwXO2n9vwrM0feP/hWuEcRa8A1WVRWuiJxPCH">())
                        && var7.getAsJsonObject(IlIillIiilIi<"IlIillIiilIi","AQuoAbBtPPVZwXO2n9vwrM0feP/hWuEcRa8A1WVRWuiJxPCH">())
                           .has(IlIillIiilIi<"IlIillIiilIi","ETTNlRqwfDudoaHbLzqkkCq4agjdlK/CPK3+i9ef2bCP">())) {
                        var9 = var7.getAsJsonObject(IlIillIiilIi<"IlIillIiilIi","AQuoAbBtPPVZwXO2n9vwrM0feP/hWuEcRa8A1WVRWuiJxPCH">())
                           .get(IlIillIiilIi<"IlIillIiilIi","ETTNlRqwfDudoaHbLzqkkCq4agjdlK/CPK3+i9ef2bCP">())
                           .getAsString();
                     }

                     return new String[]{var8, var9};
                  } else {
                     return null;
                  }
               }
            } else {
               return null;
            }
         }
      } catch (Throwable var10) {
         return null;
      }
   }

   private static byte[] IIlllIlliIll(String url) {
      try {
         HttpURLConnection var1 = (HttpURLConnection)URI.create(url).toURL().openConnection();
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setRequestProperty(
            IlIillIiilIi<"IlIillIiilIi","x33HlGbzY6L91gT7SlRGyoywFbrJLEedqHTFJlcqzA/lTt9KFeU=">(),
            IlIillIiilIi<"IlIillIiilIi","XpNkoQPr4XwBq/0FZPESa7PF8zZQYoW/z7JhNLzZ1ajcV5qDCpE=">()
         );
         if (var1.getResponseCode() != 200) {
            return null;
         } else {
            byte[] var3;
            try (InputStream var2 = var1.getInputStream()) {
               var3 = var2.readAllBytes();
            }

            return var3;
         }
      } catch (Throwable var7) {
         return null;
      }
   }

   private static String Illlllllilll(String url) {
      HttpURLConnection var1 = (HttpURLConnection)URI.create(url).toURL().openConnection();
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setRequestProperty(
         IlIillIiilIi<"IlIillIiilIi","x33HlGbzY6L91gT7SlRGyoywFbrJLEedqHTFJlcqzA/lTt9KFeU=">(),
         IlIillIiilIi<"IlIillIiilIi","XpNkoQPr4XwBq/0FZPESa7PF8zZQYoW/z7JhNLzZ1ajcV5qDCpE=">()
      );
      if (var1.getResponseCode() != 200) {
         return null;
      } else {
         String var3;
         try (InputStream var2 = var1.getInputStream()) {
            var3 = new String(var2.readAllBytes(), StandardCharsets.UTF_8);
         }

         return var3;
      }
   }

   private static void lIiiIiIlilli(String name) {
      String var1 = IliIlllilIi(name);
      if (!lIIiIlilIl.containsKey(var1) && !IlIiIlilIl.contains(var1) && iIIiIlilIl.add(var1)) {
         llIiIlilIl.submit(
            () -> {
               long var8 = 3869627771313409077L;

               try {
                  String var2 = IlIlllIlilIl(name);
                  if (var2 == null) {
                     IIIllIIliIIl(var1);
                     return;
                  }

                  String[] var3 = IiIlliIliiIl(var2);
                  if (var3 == null || var3[0] == null) {
                     IIIllIIliIIl(var1);
                     return;
                  }

                  var8 ^= ((long)IlIillIiilIi<"IlIillIiilIi","2tFhbESfIBzM6nSVV39TpE296Q+n43GpMmSeAfuOkCQ=">().equalsIgnoreCase(var3[1]) << 32 ^ var8)
                     & -1L << 32;
                  byte[] var5 = IIlllIlliIll(var3[0]);
                  if (var5 == null) {
                     IIIllIIliIIl(var1);
                     return;
                  }

                  class_1011 var6;
                  try {
                     var6 = iliIiiliiiii(class_1011.method_4309(new ByteArrayInputStream(var5)));
                  } catch (Throwable var10) {
                     IIIllIIliIIl(var1);
                     return;
                  }

                  class_310 var7 = class_310.method_1551();
                  if (var7 == null) {
                     IIIllIIliIIl(var1);
                     return;
                  }

                  var7.execute(
                     () -> {
                        try {
                           class_2960 var4 = class_2960.method_60655(
                              IlIillIiilIi<"IlIillIiilIi","H0Xi4E2iG5QCNxZL3eQi0cZUM+oZyGbPK2hxsUTcy8sMKMQj2hg=">(),
                              IlIillIiilIi<"IlIillIiilIi","b4Dpu5Rf5E0XhtAbj//RBiEOCX4ZZgUOZ2EZfreUM93QFRcyWgSIkck=">()
                                 + var1.replaceAll(
                                    IlIillIiilIi<"IlIillIiilIi","09+UAqNqekDLmXnca6D3icuF8prdRXtO92ZndSVN8VjM1R+n/uXt+A==">(),
                                    IlIillIiilIi<"IlIillIiilIi","IS3h+balAEwb1NmGBEGTXPL0VH9BGmu1JlDiVRQ=">()
                                 )
                           );
                           var7.method_1531()
                              .method_4616(
                                 var4,
                                 new class_1043(
                                    () -> IlIillIiilIi<"IlIillIiilIi","dSyt2sq95zu28YJXahG1Lqa5KUmJX3htXdE5d8sVlUnfcSMz8s4a4E5IaR+8UQ==">() + var1, var6
                                 )
                              );
                           lIIiIlilIl.put(
                              var1, class_8685.method_74884(new iIlilIIlIllilIIl(var4), null, null, kx ? class_7920.field_41122 : class_7920.field_41123)
                           );
                        } catch (Throwable var8x) {
                           IlIiIlilIl.add(var1);
                        } finally {
                           iIIiIlilIl.remove(var1);
                        }
                     }
                  );
               } catch (Throwable var11) {
                  IIIllIIliIIl(var1);
               }
            }
         );
      }
   }

   public static void Iilllilliill() {
      IIIiIlilIl.clear();
   }

   private IiIiiIIlliIiiIIl() {
   }

   public static class_8685 IilliliilIIi(String name) {
      if (name != null && !name.isEmpty()) {
         String var1 = IliIlllilIi(name);
         class_640 var2 = liiiIIllIl(name);
         if (var2 != null) {
            try {
               class_8685 var3 = var2.method_52810();
               if (var3 != null) {
                  if (IIIiIlilIl.size() >= 128 && !IIIiIlilIl.containsKey(var1)) {
                     Iterator var7 = IIIiIlilIl.keySet().iterator();
                     if (var7.hasNext()) {
                        var7.next();
                        var7.remove();
                     }
                  }

                  IIIiIlilIl.put(var1, var3);
                  return var3;
               }
            } catch (Exception var5) {
            }
         }

         class_8685 var6 = IIIiIlilIl.get(var1);
         if (var6 != null) {
            return var6;
         } else {
            class_8685 var4 = lIIiIlilIl.get(var1);
            if (var4 != null) {
               return var4;
            } else {
               lIiiIiIlilli(name);
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static class_640 liiiIIllIl(String name) {
      try {
         class_310 var1 = class_310.method_1551();
         if (var1 == null) {
            return null;
         } else {
            class_634 var2 = var1.method_1562();
            return var2 == null ? null : var2.method_2874(name);
         }
      } catch (Exception var3) {
         return null;
      }
   }

   private static void IIIllIIliIIl(String k) {
      IlIiIlilIl.add(k);
      iIIiIlilIl.remove(k);
   }

   private static class_1011 iliIiiliiiii(class_1011 img) {
      long var5 = -3937185984735949709L;
      long var7 = -6368435196277417176L;
      if (img.method_4307() == 64 && img.method_4323() == 32) {
         class_1011 var1 = new class_1011(64, 64, true);
         var1.method_4317(img);
         img.close();
         var5 ^= (4294967296L ^ var5) & -1L << 32;

         for (var5 ^= (32L ^ var5) & -1L >>> 32; (int)var5 < 64 && (int)(var5 >>> 32) != 0; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            for (var7 ^= (0L ^ var7) & -1L << 32; (int)(var7 >>> 32) < 32; var7 += 4294967296L) {
               if (var1.method_61940((int)var5, (int)(var7 >>> 32)) >>> 24 < 128) {
                  var5 ^= (0L ^ var5) & -1L << 32;
                  break;
               }
            }
         }

         if ((int)(var5 >>> 32) != 0) {
            for (long var11 = var5 ^ (32L ^ var5) & -1L >>> 32; (int)var11 < 64; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
               for (var7 ^= (0L ^ var7) & -1L << 32; (int)(var7 >>> 32) < 32; var7 += 4294967296L) {
                  var1.method_61941((int)var11, (int)(var7 >>> 32), var1.method_61940((int)var11, (int)(var7 >>> 32)) & 16777215);
               }
            }
         }

         return var1;
      } else {
         return img;
      }
   }

   private static String IlIlllIlilIl(String name) {
      try {
         String var1 = Illlllllilll(
            IlIillIiilIi<"IlIillIiilIi","woonMVx4TiyZnrpeUjxXqzlzGzarU4eJZsi8PaqqtZZ5eG6CjoYvRgFtPwc+krBiTJFPQiK8u7+LXMBjMWbtti3eAuN5kZAQAXPkEw==">()
               + URLEncoder.encode(name, StandardCharsets.UTF_8)
         );
         if (var1 != null && !var1.isBlank()) {
            JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
            return var2.has(IlIillIiilIi<"IlIillIiilIi","CaRVcIiOEwhvpx88xjH453cIb6ITB8049pOiiTi5">())
               ? var2.get(IlIillIiilIi<"IlIillIiilIi","CaRVcIiOEwhvpx88xjH453cIb6ITB8049pOiiTi5">()).getAsString()
               : null;
         } else {
            return null;
         }
      } catch (Throwable var3) {
         return null;
      }
   }

   private static String IliIlllilIi(String name) {
      return name == null ? "" : name.toLowerCase(Locale.ROOT);
   }
}
