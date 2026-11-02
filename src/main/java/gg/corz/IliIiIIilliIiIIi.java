package gg.corz;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Locale;

public final class IliIiIIilliIiIIi {
   public static String liiiIIllIl(String content, IIIIliilIIIlii teamCode) {
      long var8 = 250247331330346469L;
      String var2 = IliIlllilIi(content);
      String var3 = var2.isEmpty()
         ? IilliliilIIi<"IilliliilIIi","rNYpKP9B7F8VclV9bk+tkL17MQper2pGji8Anf0S5AHctzb8VlLg">() + (teamCode == null ? "" : teamCode.Ililllililil())
         : IilliliilIIi<"IilliliilIIi","przYfrIfJm3z9NiO5xaItB83W+0g2x6ciiYSjdsAwNewcJ0csNA=">() + var2;

      try {
         MessageDigest var4 = MessageDigest.getInstance(IilliliilIIi<"IilliliilIIi","9BThHDPM0ZrIWEMTnPb3PwYJ8s/nnMtgjSaNt+/2uLNe4sM=">());
         byte[] var5 = var4.digest(var3.getBytes(StandardCharsets.UTF_8));
         StringBuilder var6 = new StringBuilder(24);

         for (long var11 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var11 >>> 32) < 12; var11 += 4294967296L) {
            var6.append(Character.forDigit(var5[(int)(var11 >>> 32)] >> 4 & 15, 16)).append(Character.forDigit(var5[(int)(var11 >>> 32)] & 15, 16));
         }

         return var6.toString();
      } catch (Exception var10) {
         return Integer.toHexString(var3.hashCode()).toLowerCase(Locale.ROOT);
      }
   }

   public static String iIlIlllllill(String teamCode) {
      return IliIlllilIi(teamCode);
   }

   private IliIiIIilliIiIIi() {
   }

   public static String IliIlllilIi(String teamCode) {
      long var4 = -8989697476517182061L;
      if (teamCode == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(teamCode.length());
         var4 ^= (0L ^ var4) & -1L << 32;

         while ((int)(var4 >>> 32) < teamCode.length()) {
            var4 ^= ((long)Character.toUpperCase(teamCode.charAt((int)(var4 >>> 32))) ^ var4) & -1L >>> 32;
            if ((int)var4 >= 65 && (int)var4 <= 90 || (int)var4 >= 48 && (int)var4 <= 57) {
               var1.append((char)((int)var4));
            }

            var4 += 4294967296L;
         }

         return var1.toString();
      }
   }
}
