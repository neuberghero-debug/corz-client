package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public final class lllililillilil {
   public long iIIlilIliIlIlilIli;
   public int iilIilIliIIiIilIli;
   public boolean IlllilIlillllilIli;
   public String ilIIilIliIiIIilIli;
   public long IiIlilIliliIlilIli;
   public String IliIilIlilliIilIli;
   public String IlIIilIlillIIilIli;
   public String lIiIilIliiIiIilIli;
   public long llIlilIliilIlilIli;
   public String lllIilIliillIilIli;
   public boolean liiIilIliiiiIilIli;
   public boolean iliIilIliIiiIilIli;
   public boolean lIllilIliiIllilIli;
   public long iiIlilIliIIllilIli;
   public List<String> iIlIilIliIllIilIli = new ArrayList<>();
   public String IilIilIlililIilIli;
   public String IIlIilIlilIlIilIli;
   public String liIIilIliiiIIilIli;
   public long IIIlilIlilIIlilIli;

   private static String liiiIIllIl(JsonObject o, String k) {
      return o.has(k) && o.get(k).isJsonPrimitive() ? o.get(k).getAsString() : null;
   }

   private static int iIlIlllllill(JsonObject k, String o, int d) {
      try {
         return k.has(o) && k.get(o).isJsonPrimitive() ? k.get(o).getAsInt() : d;
      } catch (Exception var4) {
         return d;
      }
   }

   private static long IilliliilIIi(JsonObject d, String o, long k) {
      try {
         return d.has(o) && d.get(o).isJsonPrimitive() ? d.get(o).getAsLong() : k;
      } catch (Exception var5) {
         return k;
      }
   }

   private static boolean lIiiIiIlilli(JsonObject o, String k, boolean d) {
      try {
         return o.has(k) && o.get(k).isJsonPrimitive() ? o.get(k).getAsBoolean() : d;
      } catch (Exception var4) {
         return d;
      }
   }

   public static lllililillilil IliIlllilIi(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         lllililillilil var1 = new lllililillilil();
         var1.IlIIilIlillIIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","baRvtScZ+FztQbJq673apOWKNyDfxnP3oqknotot">());
         var1.ilIIilIliIiIIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","Kak2/v9rTcNEMkl7rbPs1cRiI72pVT81e+RvssiGYF8=">());
         var1.liIIilIliiiIIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","9eGFM/zhEjmHrN0NAggdB4eLnJvrnjXfTYmzJ6lIGrWROwS6NGRv">());
         var1.IIlIilIlilIlIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","yHWRlqAAQG5k+bH7r8riohBWdWWi3fDpRiIicpSP9q4JOA==">());
         if (o.has(iliIiiliiiii<"iliIiiliiiii","Mg3Ddretd4FTjajCd5kTw6svGvKBY+t7zk9+pJNuqbo=">())
            && o.get(iliIiiliiiii<"iliIiiliiiii","Mg3Ddretd4FTjajCd5kTw6svGvKBY+t7zk9+pJNuqbo=">()).isJsonArray()) {
            for (JsonElement var3 : o.getAsJsonArray(iliIiiliiiii<"iliIiiliiiii","Mg3Ddretd4FTjajCd5kTw6svGvKBY+t7zk9+pJNuqbo=">())) {
               if (var3.isJsonPrimitive()) {
                  var1.iIlIilIliIllIilIli.add(var3.getAsString());
               }
            }
         }

         var1.lllIilIliillIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","n3JG8ms/et15HVnGPtQgckd8EyP4DMQ869yUjXCrdgQRmA38O+5cGEpblg0=">());
         var1.IilIilIlililIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","xp++jfcEJSrKLfnonZkwSh2kk+TzZxGGu69hRbvyPB6k+CTd6cJT">());
         var1.iilIilIliIIiIilIli = iIlIlllllill(o, iliIiiliiiii<"iliIiiliiiii","gEYmyJh3mBllsE1nJf0IThoscZBk0Bsxs6fCIo6ao+U/IrCrU683vhE=">(), 1);
         var1.lIiIilIliiIiIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","NakSvVCclGgI3ZbHaBNiqi+0TvDYSNVPb2NS7kwBUXfN8A==">());
         var1.IliIilIlilliIilIli = liiiIIllIl(o, iliIiiliiiii<"iliIiiliiiii","zlNUDBqL7YzHrCHXB0pTVlAQyhq2PeIWMLYB7JQ3A9rCH7a4bsXHJ1DlrrI=">());
         var1.iliIilIliIiiIilIli = lIiiIiIlilli(o, iliIiiliiiii<"iliIiiliiiii","rsGy9j5iLQGk7Lc86a2Oj+FYtwE3fqVrTcEuBZj8HkYi8qU/">(), false);
         var1.liiIilIliiiiIilIli = lIiiIiIlilli(o, iliIiiliiiii<"iliIiiliiiii","xosaanV7DNc88hAJJWvP+dicvCReZKdcEXCHBzb1AiDwlFIF">(), false);
         var1.IIIlilIlilIIlilIli = IilliliilIIi(o, iliIiiliiiii<"iliIiiliiiii","5aGst+IfHpsd78Zn4ICiaJXmBq6BNXJq99uIWqZH+tzfNzuMCEWUnm4=">(), 0L);
         var1.iIIlilIliIlIlilIli = IilliliilIIi(o, iliIiiliiiii<"iliIiiliiiii","fM7RGKa3/MgIsNNfMt9umyjMH9G+sR7UBbsV1nCTT8tPEAxufq2oko9gE18GZqI=">(), 0L);
         var1.llIlilIliilIlilIli = IilliliilIIi(o, iliIiiliiiii<"iliIiiliiiii","oTBgwL9iBd7WS97kd3yYeaUluVv/koGAi3Ne/KAOZv7WGCWe8Q==">(), 0L);
         var1.IiIlilIliliIlilIli = IilliliilIIi(o, iliIiiliiiii<"iliIiiliiiii","JQgbBiLcMPsrlbXeJ75AbCx/Zth5FQJ3rCr61SMJIx0EDwxIEw==">(), 0L);
         var1.iiIlilIliIIllilIli = IilliliilIIi(o, iliIiiliiiii<"iliIiiliiiii","fZJYD5V6AfJgPfyye7WT2cwGx15Omu0AUongNfziHSzilKwEVg==">(), 0L);
         var1.lIllilIliiIllilIli = lIiiIiIlilli(o, iliIiiliiiii<"iliIiiliiiii","ludDhJbdw8F/TCDndvufVMVdyFtKTa3w+aOSQ/svMVHy">(), false);
         var1.IlllilIlillllilIli = lIiiIiIlilli(o, iliIiiliiiii<"iliIiiliiiii","YqWOpCytGLrB6GtS7ewdxw2fa4zTxGptS+h1u36UDK2a">(), false);
         return var1;
      }
   }
}
