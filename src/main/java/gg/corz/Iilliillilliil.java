package gg.corz;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.fabricmc.loader.api.FabricLoader;

public final class Iilliillilliil {
   static final String IIIIIlllilIIIIllli = "corz";
   private static final String iIIIIllliIlIIIllli = "Loading ";
   private static final String llIIIllliilIIIllli = " mods:";

   static boolean liiiIIllIl(String line) {
      return line.toLowerCase(Locale.ROOT).contains(lIiiIiIlilli<"lIiiIiIlilli","dYDXwCk17mqIg2LPDcd4vMd+qgwU+tJ4Sw/ETKlmv0w=">());
   }

   public static boolean IilliliilIIi() {
      try {
         Path var0 = FabricLoader.getInstance()
            .getGameDir()
            .resolve(lIiiIiIlilli<"lIiiIiIlilli","wj6KgrbX6RxU8jmKINSXWNyUNn4LKX4SBV5jn39V2j8=">())
            .resolve(lIiiIiIlilli<"lIiiIiIlilli","BmxS9kaxkT0QgFsLhy7/SvcfaENQzH9RgRjSmyZ9DJHVMbgRTug=">());
         if (!Files.exists(var0)) {
            return false;
         } else {
            List var1 = IliIlllilIi(Files.readAllLines(var0, StandardCharsets.UTF_8));
            Files.write(var0, var1, StandardCharsets.UTF_8);
            return true;
         }
      } catch (Exception var2) {
         return false;
      }
   }

   private Iilliillilliil() {
   }

   static String iIlIlllllill(String line) {
      long var7 = 5511359555434457782L;
      long var9 = 9091786877252121853L;
      long var11 = -2168373132838334946L;
      var7 ^= ((long)line.indexOf(lIiiIiIlilli<"lIiiIiIlilli","37F/7B1wsM80BV8GEgfduu9veDz9hZuk1pDavaeIOqzoD36g">()) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) < 0) {
         return null;
      } else {
         var7 ^= ((long)((int)(var7 >>> 32) + lIiiIiIlilli<"lIiiIiIlilli","37F/7B1wsM80BV8GEgfduu9veDz9hZuk1pDavaeIOqzoD36g">().length()) ^ var7) & -1L >>> 32;
         var9 ^= ((long)line.indexOf(lIiiIiIlilli<"lIiiIiIlilli","lag6XUdr5dI8x82wPXHF0XEikjXegww8COZSU8f6C9nG9Q==">(), (int)var7) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) < 0) {
            return null;
         } else {
            String var4 = line.substring((int)var7, (int)(var9 >>> 32)).trim();

            try {
               var9 ^= ((long)Integer.parseInt(var4) ^ var9) & -1L >>> 32;
            } catch (NumberFormatException var13) {
               return null;
            }

            var11 ^= ((long)Math.max(0, (int)var9 - 1) << 32 ^ var11) & -1L << 32;
            return line.substring(0, (int)var7) + (int)(var11 >>> 32) + line.substring((int)(var9 >>> 32));
         }
      }
   }

   public static List<String> IliIlllilIi(List<String> lines) {
      ArrayList var1 = new ArrayList(lines.size());

      for (String var3 : lines) {
         String var4 = iIlIlllllill(var3);
         if (var4 != null) {
            var1.add(var4);
         } else if (!liiiIIllIl(var3)) {
            var1.add(var3);
         }
      }

      return var1;
   }
}
