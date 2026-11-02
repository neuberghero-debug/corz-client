package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class IIIililllIIilill {
   private final String lIiIIliill;
   public final boolean iilIIliill;
   private final String IIiIIliill;
   private final Map<Integer, iIlIlIlIllIlIl> IliIIliill = new HashMap<>();
   private final boolean iIiIIliill;
   private final iIlIlIlIllIlIl iliIIliill;
   public final String lilIIliill;
   private final Map<Integer, iIlIlIlIllIlIl> lliIIliill = new HashMap<>();
   private static final Pattern IilIIliill = Pattern.compile(IiIlliIliiIl<"IiIlliIliiIl","+bXGmMQEctSPUfRcu5xLLc5OPEY8K2aRzhFRp9Gasi6FwUrlXgB8cWjQ">());

   public Set<Integer> lIiiIiIlilli() {
      LinkedHashSet var1 = new LinkedHashSet<>(this.IliIIliill.keySet());
      var1.addAll(this.lliIIliill.keySet());
      return var1;
   }

   public iIlIlIlIllIlIl liiiIIllIl(int code) {
      iIlIlIlIllIlIl var2 = this.IliIIliill.get(code);
      if (var2 != null) {
         return var2;
      } else {
         return this.iIiIIliill && code != ((-1994985092 >>> 31 | -1994985092 << 1) * -587345955 ^ -406407158)
            ? new iIlIlIlIllIlIl(iliIiiliiiii(this.IIiIIliill, code), -1, -1)
            : this.iliIIliill;
      }
   }

   public iIlIlIlIllIlIl iIlIlllllill(int code) {
      iIlIlIlIllIlIl var2 = this.lliIIliill.get(code);
      if (var2 != null) {
         return var2;
      } else {
         return !this.iilIIliill && this.lIiIIliill != null ? new iIlIlIlIllIlIl(iliIiiliiiii(this.lIiIIliill, code), -1, -1) : null;
      }
   }

   public static IIIililllIIilill IliIlllilIi(String json) {
      return new IIIililllIIilill(JsonParser.parseString(json).getAsJsonObject());
   }

   private iIlIlIlIllIlIl IIIllIIliIIl(JsonElement v) {
      long var5 = -4493449045274481155L;
      if (v == null || v.isJsonNull()) {
         return null;
      } else if (this.iilIIliill) {
         if (v.isJsonArray() && this.IIiIIliill != null) {
            JsonArray var7 = v.getAsJsonArray();
            if (var7.size() < (~(((1576445179 << 13 | 1576445179 >>> 19) << 3 | (1576445179 << 13 | 1576445179 >>> 19) >>> 29) - -31) ^ 1527030248)) {
               return null;
            } else {
               var5 ^= ((long)((int)Math.round(var7.get(0).getAsDouble())) << 32 ^ var5) & -1L << 32;
               var5 ^= ((long)((int)Math.round(var7.get(1).getAsDouble())) ^ var5) & -1L >>> 32;
               return (int)(var5 >>> 32) >= 0 && (int)var5 > 0 ? new iIlIlIlIllIlIl(this.IIiIIliill, (int)(var5 >>> 32), (int)var5) : null;
            }
         } else {
            return null;
         }
      } else if (!v.isJsonPrimitive()) {
         return null;
      } else {
         String var2 = v.getAsString();
         return var2.isEmpty() ? null : new iIlIlIlIllIlIl(var2, -1, -1);
      }
   }

   private IIIililllIIilill(JsonObject root) {
      this.lilIIliill = IlIlllIlilIl(
         root,
         IiIlliIliiIl<"IiIlliIliiIl","fcLiAWpEjlSTB2XU0oAsdpKEbdUHzFfDcbVyoX46Tvs=">(),
         IiIlliIliiIl<"IiIlliIliiIl","Gz4pWtnNmKx8t2iOTwujVkNiWQtYpbOE90bb55lJ/m9kg4ii">()
      );
      this.iilIIliill = IiIlliIliiIl<"IiIlliIliiIl","ArTEMrAnLv17uR0bGI4FKPuTPwvTcAUGUBarnuMjQwbbqw==">()
         .equals(
            IlIlllIlilIl(
               root,
               IiIlliIliiIl<"IiIlliIliiIl","wd7/h2v3WDiZFzxIbjgPxjn7DbL9wkeEMP+/ejTmjcOtQur1QfSnFANzoA==">(),
               IiIlliIliiIl<"IiIlliIliiIl","C4xzXwIMLyFdCjbb8y6MNxCXbBH9maXA5AKolzoOJTW8">()
            )
         );
      this.IIiIIliill = IlIlllIlilIl(root, IiIlliIliiIl<"IiIlliIliiIl","9gwL133mPOKGkfb/e7XX8q95BYPMuqPOLJVN5UvVGlKO">(), null);
      this.lIiIIliill = IlIlllIlilIl(root, IiIlliIliiIl<"IiIlliIliiIl","IZpJag28H2qr7b8OFNmHgr6nhyUgMi3c2p30J5RlrJOpWUk=">(), null);
      this.iIiIIliill = !this.iilIIliill
         && root.has(IiIlliIliiIl<"IiIlliIliiIl","/u1xb6fpxmtG53vNMI3NgtWX6JoDozXqhKqMNxmQ9Lf69SI=">())
         && root.get(IiIlliIliiIl<"IiIlliIliiIl","/u1xb6fpxmtG53vNMI3NgtWX6JoDozXqhKqMNxmQ9Lf69SI=">()).getAsInt() >= 2
         && this.IIiIIliill != null;
      JsonObject var2 = root.has(IiIlliIliiIl<"IiIlliIliiIl","+HOCEJwMJx4pT5P0PPPT8IJ5n5QLg2I/5nw9rgykpS15+Tc=">())
            && root.get(IiIlliIliiIl<"IiIlliIliiIl","+HOCEJwMJx4pT5P0PPPT8IJ5n5QLg2I/5nw9rgykpS15+Tc=">()).isJsonObject()
         ? root.getAsJsonObject(IiIlliIliiIl<"IiIlliIliiIl","+HOCEJwMJx4pT5P0PPPT8IJ5n5QLg2I/5nw9rgykpS15+Tc=">())
         : new JsonObject();

      for (Entry var4 : var2.entrySet()) {
         String var5 = (String)var4.getKey();
         boolean var6 = var5.endsWith(IiIlliIliiIl<"IiIlliIliiIl","irt14Q3y5WYe+O6k9Bj3BwgCLSoYkEeTc94GiTlmmg==">());

         int var7;
         try {
            var7 = Integer.parseInt(var6 ? var5.substring(0, var5.length() - 3) : var5);
         } catch (NumberFormatException var9) {
            continue;
         }

         iIlIlIlIllIlIl var8 = this.IIIllIIliIIl((JsonElement)var4.getValue());
         if (var8 != null) {
            (var6 ? this.lliIIliill : this.IliIIliill).put(var7, var8);
         }
      }

      iIlIlIlIllIlIl var10 = this.IliIIliill.get(30);
      if (var10 == null && this.iIiIIliill) {
         var10 = new iIlIlIlIllIlIl(iliIiiliiiii(this.IIiIIliill, 30), -1, -1);
      }

      if (var10 == null && !this.IliIIliill.isEmpty()) {
         var10 = this.IliIIliill.get(this.IliIIliill.keySet().stream().min(Integer::compare).orElseThrow());
      }

      this.iliIIliill = var10;
   }

   private static String IlIlllIlilIl(JsonObject def, String o, String key) {
      JsonElement var3 = def.get(o);
      return var3 != null && var3.isJsonPrimitive() ? var3.getAsString() : key;
   }

   static String iliIiiliiiii(String code, int pattern) {
      long var6 = 696310424621711238L;
      long var8 = -3232167835598691579L;
      Matcher var2 = IilIIliill.matcher(code);
      if (!var2.find()) {
         return code;
      } else {
         var6 ^= ((long)Integer.parseInt(var2.group(1)) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)Integer.parseInt(var2.group(2)) ^ var6) & -1L >>> 32;
         if ((int)var6 < (int)(var6 >>> 32)) {
            var8 ^= ((long)((int)(var6 >>> 32)) << 32 ^ var8) & -1L << 32;
            var6 ^= ((long)((int)var6) << 32 ^ var6) & -1L << 32;
            var6 ^= ((long)((int)(var8 >>> 32)) ^ var6) & -1L >>> 32;
         }

         var8 ^= (
               (long)(
                        (int)(var6 >>> 32)
                           + Math.floorMod(pattern == ((--424423576 >>> 27 | --424423576 << 5) ^ -696652548) ? 0 : pattern, (int)var6 - (int)(var6 >>> 32) + 1)
                     )
                     << 32
                  ^ var8
            )
            & -1L << 32;
         return code.substring(0, var2.start()) + (int)(var8 >>> 32) + code.substring(var2.end());
      }
   }

   public boolean IilliliilIIi() {
      return !this.lliIIliill.isEmpty() || !this.iilIIliill && this.lIiIIliill != null;
   }
}
