package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public final class iIiliIllIliliIll implements IIiliIlllIiliIll {
   private static final int IillIiilll = 8000;
   private static final String lillIiilll = "/build/sessions";
   private static final int illlIiilll = 6000;

   @Override
   public void iIlIlllllill(String memberId, String sessionId) {
      JsonObject var3 = new JsonObject();
      var3.addProperty(IIlllIlliIll<"IIlllIlliIll","j0BQTvAlosoA0knRiDPsdjAkfGaqxQyyID8axpMgoI6P/T0R">(), sessionId);

      try {
         this.lIiiIiIlilli(
            IIlllIlliIll<"IIlllIlliIll","6kVaiso9U9hkTQmh+DG7TMF4+clMDZi/rJq+SN7pW44=">(),
            IIlllIlliIll<"IIlllIlliIll","GXP8b1sPGmo8ioSra4ZIl+svLTpmRYGhBGLV5FazpjFdrg2Nlhul9BE45OU=">()
               + IiIlliIliiIl(memberId)
               + IIlllIlliIll<"IIlllIlliIll","uw3sOhY3X9mnfGPREeXpK4Jjq7Kw3mawqzB7Bd/iDAD5bA==">(),
            var3
         );
      } catch (Exception var5) {
      }
   }

   private static String iliIiiliiiii(InputStream in) {
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

   @Override
   public iIIlIiIlIlIi<iiIilllIIlilll> IliIlllilIi(String displayName, String buildHash, String uuid, String roomId) {
      JsonObject var5 = new JsonObject();
      var5.addProperty(IIlllIlliIll<"IIlllIlliIll","ZNqVMXnSMBINZcTmAZJlmpI+0coM9QmOp5YpRtsMClPkGu4PJw==">(), buildHash);
      var5.addProperty(IIlllIlliIll<"IIlllIlliIll","RZnEW4jkDKZpqe8IcfVBSniMDPwe8Qy9ekbZlXlBCdg=">(), uuid);
      if (roomId != null) {
         var5.addProperty(IIlllIlliIll<"IIlllIlliIll","4/KCH8imdj1QStWNyCdLLPVbC9ZWUpF5EmJloEqwXjU=">(), roomId);
      }

      lliiIIliiliiIIli var6 = this.lIiiIiIlilli(
         IIlllIlliIll<"IIlllIlliIll","6kVaiso9U9hkTQmh+DG7TMF4+clMDZi/rJq+SN7pW44=">(),
         IIlllIlliIll<"IIlllIlliIll","GXP8b1sPGmo8ioSra4ZIl+svLTpmRYGhBGLV5FazpjFdrg2Nlhul9BE45OU=">()
            + IiIlliIliiIl(displayName)
            + IIlllIlliIll<"IIlllIlliIll","+G/mCHXrpW0qG8s8mmA4wsEq7n3eWskEiy6QYo4rKh7lFw==">(),
         var5
      );
      if (var6 == null) {
         return iIIlIiIlIlIi.liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","WGdgO4OelD0G+pjnvne9Jq7L5XES/Vc/Fox9IovBuWJ4HaQ=">());
      } else if (var6.lIiiIiIlIi == 409) {
         return iIIlIiIlIlIi.liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","O3OCxrCOY3/HWmgzUclrDOUT0y4rGKjoXRo3SbbHgPZglvrn">());
      } else {
         return var6.lIiiIiIlIi >= 400 ? iIIlIiIlIlIi.liiiIIllIl(IlIlllIlilIl(var6)) : iIIlIiIlIlIi.IliIlllilIi(IIIllIIliIIl(var6.iIiiIiIlIi));
      }
   }

   private static iiIilllIIlilll IIIllIIliIIl(JsonObject j) {
      return new iiIilllIIlilll(
         j.has(IIlllIlliIll<"IIlllIlliIll","yK74acyw8M0BHbeHBMPOEmws1PMqvYZD2LEFnSTtxIvi5y1bkQ==">())
            ? j.get(IIlllIlliIll<"IIlllIlliIll","yK74acyw8M0BHbeHBMPOEmws1PMqvYZD2LEFnSTtxIvi5y1bkQ==">()).getAsString()
            : null,
         j.has(IIlllIlliIll<"IIlllIlliIll","j0BQTvAlosoA0knRiDPsdjAkfGaqxQyyID8axpMgoI6P/T0R">())
            ? j.get(IIlllIlliIll<"IIlllIlliIll","j0BQTvAlosoA0knRiDPsdjAkfGaqxQyyID8axpMgoI6P/T0R">()).getAsString()
            : null,
         j.has(IIlllIlliIll<"IIlllIlliIll","6iB9IU7ktDyBdXhBQr/7h7DpbDCVgFM8mjJxmCM+X4oBcw==">())
            ? j.get(IIlllIlliIll<"IIlllIlliIll","6iB9IU7ktDyBdXhBQr/7h7DpbDCVgFM8mjJxmCM+X4oBcw==">()).getAsString()
            : null,
         j.has(IIlllIlliIll<"IIlllIlliIll","ZNqVMXnSMBINZcTmAZJlmpI+0coM9QmOp5YpRtsMClPkGu4PJw==">())
            ? j.get(IIlllIlliIll<"IIlllIlliIll","ZNqVMXnSMBINZcTmAZJlmpI+0coM9QmOp5YpRtsMClPkGu4PJw==">()).getAsString()
            : null
      );
   }

   @Override
   public iIIlIiIlIlIi<ilIillIiIiIillIi> liiiIIllIl(
      String retainedDoc,
      String selfState,
      JsonObject outbox,
      JsonArray sessionId,
      long memberId,
      JsonObject sinceSeq,
      long knownRetainedVersion,
      long retainedVersion
   ) {
      JsonObject var12 = new JsonObject();
      var12.addProperty(IIlllIlliIll<"IIlllIlliIll","j0BQTvAlosoA0knRiDPsdjAkfGaqxQyyID8axpMgoI6P/T0R">(), selfState);
      if (outbox != null) {
         var12.add(IIlllIlliIll<"IIlllIlliIll","tSMqt8VXeO05fouPdI5MaS0Mgulwl+RPU2jegiOLe9g3">(), outbox);
      }

      if (sessionId != null && !sessionId.isEmpty()) {
         var12.add(IIlllIlliIll<"IIlllIlliIll","PJh1VOokl24oK9+hDhyjhkYP17K1/oPB2cBIH20NKmKGQA==">(), sessionId);
      }

      var12.addProperty(IIlllIlliIll<"IIlllIlliIll","UgrS3cZZog9pa1jiQ8ZuYhZeDOSjyf8S1fn/tuQsYtwiNYeL">(), memberId);
      var12.addProperty(IIlllIlliIll<"IIlllIlliIll","spkP7rC6XFPz5/lGn+8tzB7xYsY2j2fevB+m/mmsRbNe2/mXAoOLYYqytSKmdNL4">(), retainedVersion);
      if (sinceSeq != null) {
         JsonObject var13 = new JsonObject();
         var13.addProperty(IIlllIlliIll<"IIlllIlliIll","dOW8hXRWkHqVe+ECWcDHZJwiUhlsshlnqugFudkrStP1nTw=">(), knownRetainedVersion);
         var13.add(IIlllIlliIll<"IIlllIlliIll","LXe+yy8J1nTcQYX7wy8qPp65reDeONMNh8ReyxLIvA==">(), sinceSeq);
         var12.add(IIlllIlliIll<"IIlllIlliIll","R0tqqs80aj9l7PKebRfRtuFPJ8FpJW0zUvBDGFwvhtUAReb6">(), var13);
      }

      lliiIIliiliiIIli var17 = this.lIiiIiIlilli(
         IIlllIlliIll<"IIlllIlliIll","6kVaiso9U9hkTQmh+DG7TMF4+clMDZi/rJq+SN7pW44=">(),
         IIlllIlliIll<"IIlllIlliIll","GXP8b1sPGmo8ioSra4ZIl+svLTpmRYGhBGLV5FazpjFdrg2Nlhul9BE45OU=">()
            + IiIlliIliiIl(retainedDoc)
            + IIlllIlliIll<"IIlllIlliIll","DBDVVcQNvMHWs0mLSddqj7MZOVRDsgIGfRBBWbjJO9n1">(),
         var12
      );
      if (var17 == null) {
         return iIIlIiIlIlIi.liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","WGdgO4OelD0G+pjnvne9Jq7L5XES/Vc/Fox9IovBuWJ4HaQ=">());
      } else if (var17.lIiiIiIlIi == 404) {
         return iIIlIiIlIlIi.liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","hhFZr28bKo8OI6Nnk7U4AVjmpWhgoso2gG0Z9pEsXhzb3BaPkA==">());
      } else if (var17.lIiiIiIlIi >= 400) {
         return iIIlIiIlIlIi.liiiIIllIl(IlIlllIlilIl(var17));
      } else {
         JsonObject var14 = var17.iIiiIiIlIi;
         JsonObject var15 = null;
         if (var14.has(IIlllIlliIll<"IIlllIlliIll","R0tqqs80aj9l7PKebRfRtuFPJ8FpJW0zUvBDGFwvhtUAReb6">())
            && var14.get(IIlllIlliIll<"IIlllIlliIll","R0tqqs80aj9l7PKebRfRtuFPJ8FpJW0zUvBDGFwvhtUAReb6">()).isJsonObject()) {
            var15 = var14.getAsJsonObject(IIlllIlliIll<"IIlllIlliIll","R0tqqs80aj9l7PKebRfRtuFPJ8FpJW0zUvBDGFwvhtUAReb6">());
         }

         ilIillIiIiIillIi var16 = new ilIillIiIiIillIi(
            var14.has(IIlllIlliIll<"IIlllIlliIll","6iB9IU7ktDyBdXhBQr/7h7DpbDCVgFM8mjJxmCM+X4oBcw==">())
               ? var14.get(IIlllIlliIll<"IIlllIlliIll","6iB9IU7ktDyBdXhBQr/7h7DpbDCVgFM8mjJxmCM+X4oBcw==">()).getAsString()
               : null,
            var14.has(IIlllIlliIll<"IIlllIlliIll","ZNqVMXnSMBINZcTmAZJlmpI+0coM9QmOp5YpRtsMClPkGu4PJw==">())
               ? var14.get(IIlllIlliIll<"IIlllIlliIll","ZNqVMXnSMBINZcTmAZJlmpI+0coM9QmOp5YpRtsMClPkGu4PJw==">()).getAsString()
               : null,
            var14.has(IIlllIlliIll<"IIlllIlliIll","iuz1sUHunoTKWTqUnmYQwwQ+Zgpzvq6G/QBTXk9GBQBRsQ==">())
               && var14.get(IIlllIlliIll<"IIlllIlliIll","iuz1sUHunoTKWTqUnmYQwwQ+Zgpzvq6G/QBTXk9GBQBRsQ==">()).getAsBoolean(),
            var14.has(IIlllIlliIll<"IIlllIlliIll","Emhda86AtPy8vc7Qy634n8onX+fYKEIdzHLqf0mHwg==">())
               ? var14.get(IIlllIlliIll<"IIlllIlliIll","Emhda86AtPy8vc7Qy634n8onX+fYKEIdzHLqf0mHwg==">()).getAsLong()
               : System.currentTimeMillis(),
            var14.has(IIlllIlliIll<"IIlllIlliIll","3WvmTaqAhzaeeuZgrccEmIXccNNT+s2QmwLctb1aPFgH0JU=">())
                  && var14.get(IIlllIlliIll<"IIlllIlliIll","3WvmTaqAhzaeeuZgrccEmIXccNNT+s2QmwLctb1aPFgH0JU=">()).isJsonArray()
               ? var14.getAsJsonArray(IIlllIlliIll<"IIlllIlliIll","3WvmTaqAhzaeeuZgrccEmIXccNNT+s2QmwLctb1aPFgH0JU=">())
               : new JsonArray(),
            var15,
            var14.has(IIlllIlliIll<"IIlllIlliIll","l7jnKI3L6+otne22TAQjSLekHScqVcyST9aR5Pm/URlOcfIw">())
                  && var14.get(IIlllIlliIll<"IIlllIlliIll","l7jnKI3L6+otne22TAQjSLekHScqVcyST9aR5Pm/URlOcfIw">()).isJsonArray()
               ? var14.getAsJsonArray(IIlllIlliIll<"IIlllIlliIll","l7jnKI3L6+otne22TAQjSLekHScqVcyST9aR5Pm/URlOcfIw">())
               : new JsonArray(),
            var14.has(IIlllIlliIll<"IIlllIlliIll","BHcxY1Z5mpvhPzfq/zzthhHtpwfays4GMokrtY3H803uAA==">())
               ? var14.get(IIlllIlliIll<"IIlllIlliIll","BHcxY1Z5mpvhPzfq/zzthhHtpwfays4GMokrtY3H803uAA==">()).getAsLong()
               : memberId
         );
         return iIIlIiIlIlIi.IliIlllilIi(var16);
      }
   }

   private static String IlIlllIlilIl(lliiIIliiliiIIli r) {
      return r.iIiiIiIlIi != null && r.iIiiIiIlIi.has(IIlllIlliIll<"IIlllIlliIll","RNy2ihiiTndPjWBIKohkZGBuK/Fck9ohZN8Vj5OAX57y">())
         ? r.iIiiIiIlIi.get(IIlllIlliIll<"IIlllIlliIll","RNy2ihiiTndPjWBIKohkZGBuK/Fck9ohZN8Vj5OAX57y">()).getAsString()
         : IIlllIlliIll<"IIlllIlliIll","K9BLmzUZAbHV+Sqks443iywjx8kTGPmz3vHc3ay5vIPj">();
   }

   private boolean IilliliilIIi() {
      return IIIIIllllIIIIlll.iiIIiiilll != null && !IIIIIllllIIIIlll.iiIIiiilll.isBlank();
   }

   private static String IiIlliIliiIl(String s) {
      return URLEncoder.encode(s == null ? "" : s, StandardCharsets.UTF_8);
   }

   private lliiIIliiliiIIli lIiiIiIlilli(String path, String method, JsonObject body) {
      long var11 = -4055043261926601986L;
      if (!this.IilliliilIIi()) {
         return null;
      } else {
         HttpURLConnection var4 = null;

         Object var6;
         try {
            var4 = (HttpURLConnection)URI.create(IIIIIllllIIIIlll.iiIIiiilll + method).toURL().openConnection();
            var4.setRequestMethod(path);
            var4.setRequestProperty(
               IIlllIlliIll<"IIlllIlliIll","qr6WDd4a6pay9e6KIGTThnspQTuWdLwkcKI85dU+LIaGEg==">(),
               IIlllIlliIll<"IIlllIlliIll","RXHkgufFFJfLChKvF8aSF1+G1/i9yCJWByuwC3ze3/eRdNPRpJY+kk0OQDk=">()
            );
            var4.setConnectTimeout(6000);
            var4.setReadTimeout(8000);
            String var5 = IIIIIllllIIIIlll.Ililllililil();
            if (var5 != null) {
               var4.setRequestProperty(
                  IIlllIlliIll<"IIlllIlliIll","uUCYDtvYkvzaaicnjZYpkuxXa8V17zQeOWztREy96UM4fQqrj1N2TdQ=">(),
                  IIlllIlliIll<"IIlllIlliIll","DTag48dwy5YbjUZYoKYJwovm0Fp0/CLJGNgCEoLMmrcwlsc=">() + var5
               );
            }

            if (body != null) {
               var4.setRequestProperty(
                  IIlllIlliIll<"IIlllIlliIll","z4yv8WtYWAInBmdTDQ3iww8bestL2xTBw86vkBC4arGGv3wANlA5zg==">(),
                  IIlllIlliIll<"IIlllIlliIll","RXHkgufFFJfLChKvF8aSF1+G1/i9yCJWByuwC3ze3/eRdNPRpJY+kk0OQDk=">()
               );
               var4.setDoOutput(true);

               try (OutputStream var23 = var4.getOutputStream()) {
                  var23.write(body.toString().getBytes(StandardCharsets.UTF_8));
               }
            }

            var11 ^= ((long)var4.getResponseCode() << 32 ^ var11) & -1L << 32;
            String var7 = iliIiiliiiii((int)(var11 >>> 32) < 400 ? var4.getInputStream() : var4.getErrorStream());

            JsonObject var8;
            try {
               var8 = JsonParser.parseString(var7).getAsJsonObject();
            } catch (Exception var19) {
               var8 = new JsonObject();
            }

            return new lliiIIliiliiIIli((int)(var11 >>> 32), var8);
         } catch (Exception var21) {
            var6 = null;
         } finally {
            if (var4 != null) {
               var4.disconnect();
            }
         }

         return (lliiIIliiliiIIli)var6;
      }
   }
}
