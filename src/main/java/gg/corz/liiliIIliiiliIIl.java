package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class liiliIIliiiliIIl {
   private static final Properties ilIliIilIl = IliIlllilIi();

   private static Properties IliIlllilIi() {
      Properties var0 = new Properties();

      try {
         try (InputStream var1 = liiliIIliiiliIIl.class
               .getResourceAsStream(iIlIlllllill<"iIlIlllllill","dVuLjJkDCzM/EN8UBepUFHJ9SrK0kdD+4o+IfYUPpwTaKffMMbU4LAM/wl8bT4ey+QHwo6BvGu2b0TmzPECSIQ==">())) {
            if (var1 != null) {
               var0.load(var1);
            }
         }

         return var0;
      } catch (IOException var6) {
         throw new IllegalStateException(
            iIlIlllllill<"iIlIlllllill","oPpHvSqU2J9S6G8PkZBKypC2/kjp7JTuXfQRiFA+sht4BWW4cXzCWnlU9FpnzZvIQrZeonyFdslzxox3">(), var6
         );
      }
   }

   private liiliIIliiiliIIl() {
   }

   public static String liiiIIllIl(Class<?> type) {
      return ilIliIilIl.getProperty(type.getName(), type.getSimpleName());
   }
}
