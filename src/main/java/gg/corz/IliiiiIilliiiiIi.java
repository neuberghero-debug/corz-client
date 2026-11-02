package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_6880;

public final class IliiiiIilliiiiIi {
   private static final Map<String, class_5321<class_1887>> liiliIIlIi = new LinkedHashMap<>();
   public static final String iiiliIIlIi = "Any";

   public static class_5321<class_1887> liiiIIllIl(String displayName) {
      return displayName == null ? null : liiliIIlIi.get(displayName);
   }

   public static String[] IliIlllilIi() {
      long var4 = -5246243590002295972L;
      String[] var0 = new String[liiliIIlIi.size() + 1];
      var0[0] = IiIlliIliiIl<"IiIlliIliiIl","qIHso3loNqqZA1Vcbz0/5QdAXXwQub0J2myUpg9+xg==">();
      var4 ^= (4294967296L ^ var4) & -1L << 32;

      for (String var3 : liiliIIlIi.keySet()) {
         int var10001 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var10001] = var3;
      }

      return var0;
   }

   private IliiiiIilliiiiIi() {
   }

   private static String IIIllIIliIIl(String path) {
      long var7 = -8540118814790326136L;
      if (path != null && !path.isEmpty()) {
         String[] var1 = path.replace('_', ' ').split(IiIlliIliiIl<"IiIlliIliiIl","lH/XUDN5QxThWmvCmirBJRrC3yS3jW8n888ZlRQ=">());
         StringBuilder var2 = new StringBuilder();
         String[] var3 = var1;
         var7 ^= ((long)var1.length << 32 ^ var7) & -1L << 32;

         for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            String var6 = var3[(int)var10];
            if (!var6.isEmpty()) {
               if (var2.length() > 0) {
                  var2.append(' ');
               }

               var2.append(Character.toUpperCase(var6.charAt(0))).append(var6.substring(1));
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static boolean iIlIlllllill(class_6880<class_1887> displayName, String entry) {
      if (entry == null || entry.equals(IiIlliIliiIl<"IiIlliIliiIl","qIHso3loNqqZA1Vcbz0/5QdAXXwQub0J2myUpg9+xg==">())) {
         return true;
      } else if (displayName == null) {
         return false;
      } else {
         class_5321 var2 = liiliIIlIi.get(entry);
         if (var2 == null) {
            return false;
         } else if (displayName.method_40225(var2)) {
            return true;
         } else {
            class_2960 var3 = displayName.method_40230().<class_2960>map(class_5321::method_29177).orElse(null);
            return var3 != null && var3.equals(var2.method_29177());
         }
      }
   }

   public static String lIiiIiIlilli(class_6880<class_1887> entry) {
      if (entry == null) {
         return "";
      } else {
         String var1 = IilliliilIIi(entry);

         for (Entry var3 : liiliIIlIi.entrySet()) {
            if (((class_5321)var3.getValue()).method_29177().method_12832().equals(var1)) {
               return (String)var3.getKey();
            }
         }

         return IIIllIIliIIl(var1);
      }
   }

   public static String iliIiiliiiii(int level) {
      return switch (level) {
         case 1 -> IiIlliIliiIl<"IiIlliIliiIl","LUBVk0pXwFIXTf7ib6mateN94SmeG/FPdVCZ7iA=">();
         case 2 -> IiIlliIliiIl<"IiIlliIliiIl","a7GzaEZ7bD0zhFx21T41UIjKMAuagBbKLjUeoVcq">();
         case 3 -> IiIlliIliiIl<"IiIlliIliiIl","tIRr1Vys12x8JvX7CwHZrDDa3qzJZ4C48y/jSlTc5A==">();
         case 4 -> IiIlliIliiIl<"IiIlliIliiIl","LZTLNguDJOvu0Hd9R5xusq7j/2ncufUB66UJaJf7">();
         case 5 -> IiIlliIliiIl<"IiIlliIliiIl","NngeGlcDiph3N0PHXlQpInJOtvn64TmnQcOIRvs=">();
         case 6 -> IiIlliIliiIl<"IiIlliIliiIl","8Zxp1lj1VBtl1AMmOm6F5SGixAtB9/8grl/J6Rht">();
         case 7 -> IiIlliIliiIl<"IiIlliIliiIl","WNUcsJ4X5Z4ZVB8yH5WTv86msr5z/ZWx2nHfNazBCw==">();
         case 8 -> IiIlliIliiIl<"IiIlliIliiIl","xPPivli3Mwa351y2YmtRdXfsVYjuQYPzqku4rv1NHIw=">();
         case 9 -> IiIlliIliiIl<"IiIlliIliiIl","DjLkOlrAzvZ191ZV7EcI6Sqq+Y6AQx0BIrtiGNNm">();
         case 10 -> IiIlliIliiIl<"IiIlliIliiIl","rCZuqXrE1Uu/1nwgD9Ctj3c3rK6EFzIheQT+YYI=">();
         default -> Integer.toString(level);
      };
   }

   public static String IilliliilIIi(class_6880<class_1887> entry) {
      return entry == null ? "" : entry.method_40230().map(k -> k.method_29177().method_12832()).orElse("");
   }

   static {
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","h9Z5Go2JSXj/tXm6t/XUYNDcLxPksOER+nwJye7LljHNE+w=">(), class_1893.field_9101);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","GQePiOc1T/+QYiI7GgnRgD0ypmH04BNPhj/8BKvAPItHWhDxvhI=">(), class_1893.field_9119);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","aVdSywyMdo3zNekezmnNhH7VIqdfZA46BEpCz+Z78d3llKxkzgw=">(), class_1893.field_9131);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","40qkw+lycS4bPLvHOBRd3PbHMf/NFjOrN1rkJUd0g7RUhrs=">(), class_1893.field_9130);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","EiQrlRZCOmT6o0tKdGhtjWeznuSfNeLnILpw7OdDk6dy6YDLEK8=">(), class_1893.field_9099);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","tN7XSJPOzyKLIX6ONX769YJ6fiHGFBT3aFxWIDgip/bg5YeONA==">(), class_1893.field_9118);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","AmcVmC5ldUn7NfeyGAo5Xw2/0hHh+bVhxFwWZNWlImS0">(), class_1893.field_9123);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","0FbpG72epZVRjBykYv41AxZvTqgmeBhoSCrbT4/mQzCuZSP1+Ze1K84Lp+Osjg==">(), class_1893.field_9112);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","yAjkNQi/mDa3pHhdens6uRxpCBusBpzlesL7Pt3naMalFH8=">(), class_1893.field_9110);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","VrEqYjHTKuycX+/9D4Xu470vhygXlL9nMGz8a5amxDxnA3RhmkXD3zs=">(), class_1893.field_9115);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","eD7wLCxYcsn6iGWPXH46+9SErb2MlsoJeychWTR8v1R9mTOlwPzw">(), class_1893.field_9124);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","a4oQIneNMLK64cJFLNYzaD43YE0jEWC1GZ2Zj7tyKyl6agy30w==">(), class_1893.field_9121);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","D/NoIosfsiMNegpN45BsNfgA+ghY+XMl5LTaUz+/m1eTOsw1P18=">(), class_1893.field_9111);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","Yb1doBhgGPPfUYUygHvs4NaaNtCwA9zHsS8irt8D7pvCXHO7/50HbyhCqg==">(), class_1893.field_9095);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","+P9qnf5i7rIhS5QHmyYQ2VrAcQzFip2j1pLpqu4NgCNBxA/NmXExfgrkc4o=">(), class_1893.field_9107);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","3kI3QcHcXmdEGQqeSZOd4i5YOFtVb4flDlkNw0pDqbJF6QXS3+NAlcYqo5xTqP/9Pg==">(), class_1893.field_9096);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","/UkD+Zaki5IsMa0L1Km83syoQ9B26+DRDzT6OJZi14Xt41GVU3Pq5RAcqA==">(), class_1893.field_9129);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","26tCmwPCfeeq4Kw0pgxCgiFhOOfbL5KyXb3llAAXnW0qWg==">(), class_1893.field_9097);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","yigak52ohEm9QX7LugUy9LUChLWVhjd/JDksEfo87XP06p4TPgTS">(), class_1893.field_9127);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","ULJhnKK7RM1QMNwKuYuI9oIyLe9RwAAkv//bnggXW33O+jDgkLkYhL0=">(), class_1893.field_9105);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","95j9DQEPQVzTqQmnV62ZCgo66tONIGEzDb2/ra4DwTLzh6EvtsrSzOU=">(), class_1893.field_9128);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","05JZVDPf4T3127pr+VWtrigOIM5B/p/6GhPz8mC5Yswt8rIaP6lSyA==">(), class_1893.field_9122);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","uwWAxh5SuCvMJMgLMGkLD6FhhrQoCpAesEl0V0nu8IN7rQrFsCs=">(), class_1893.field_23071);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","cbI/CKZUMvokFticTXEgGewzo3FRQvyspjoXNa/lap00fGxoJBf8">(), class_1893.field_38223);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","5IvLXDC8L4dZ9V/ieCZ8MDesb94B/UyupLA1kD587xrQ">(), class_1893.field_9103);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","bjBJrQ7hP0wMHggkHtKU8c6G9fR4sqET/mHdl4l59Dcx">(), class_1893.field_9116);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","0nVJL/BdwmqAQZFyTJ6lkkDYbdDkIrQsvGx5BdBkqdWU">(), class_1893.field_9126);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","1CXyAxLhDPsJR9i8Kv4TLX2QzY9Hhz5pU5A+gD/vqbyimi+v">(), class_1893.field_9125);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","XSUNra8XZeIwCt/JX8CYdG/1/HETelOkp+JEggGpTmscVAMu6w==">(), class_1893.field_9108);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","45gD6ddh82XJNF+5FvwzKWIs+b39ZmpIGQ4MjWJ4ce8uWAif">(), class_1893.field_9132);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","KfKo0sRJ+cATROmdady4NFwMBQv8RoHgodbzAmnSGLaxTpuZmC9Tsw==">(), class_1893.field_9098);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","i+oHrHu3GPQCiUJUg6HU7DwXPFDHa5JZXShkjYtj7U3xc7w=">(), class_1893.field_9120);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","LEBJ6vJvPP1OmboELpM+9dQZ9AmvF1ThiMYUloSwjwvZPPPW">(), class_1893.field_9106);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","8nPW/M5Ig1EZfEBj82fa4M6ZMzgw5XUHfyDwVMechugbct4=">(), class_1893.field_9104);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","sdAp8ehwAPKXQYM+Evja3DrtODphCNrbcsKzirToTgPXurzb5PU=">(), class_1893.field_9117);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","I9W3+DiFDV9WNrOiEEYyVt2aGQRHA5a5jEV4jT6BBa8WTu2ns1GbnvSNng==">(), class_1893.field_9114);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","dyRHjMM+i05jTxJHTkzTCpOSsqdJpHLSW6rk//5P+a8=">(), class_1893.field_9100);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","PiE2uzuJlYyr5CMeu4+tD+g3pF4A0pMcH6PoQR2qoNtI/lU=">(), class_1893.field_50157);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","1gGOpSoHs7DKZnwHqr213H/BTsUZFFgQJ9PbnSq1L9mWmg==">(), class_1893.field_50158);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","8YwzMYcWbLspBXe5JDqk1PCY/svjnwMsQmNEB8/nACVaQNPJTcU=">(), class_1893.field_50159);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","Cpm6F4rt8PRbEsCUpulmN1jxCiJf4/YZQnAuhqrvIe7f18LxYRW5qN3sGnamNA==">(), class_1893.field_9109);
      liiliIIlIi.put(IiIlliIliiIl<"IiIlliIliiIl","96jwBWOUysM8a0+LcMFOY7OETCn33epd1rSJkg9m7PHJZ4BMxszlxAv+/jo=">(), class_1893.field_9113);
   }
}
