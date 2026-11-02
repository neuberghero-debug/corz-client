package gg.corz;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public record IIIIliilIIIlii(String schematicName, int width, int height, int length, int contentCells, long contentDigest, String hash) {
   private final int IililIiIIl;
   private final long IIiilIiIIl;
   private final String lllilIiIIl;
   private final String lIiilIiIIl;
   private final int iililIiIIl;
   private final int lililIiIIl;
   private final int illilIiIIl;

   public String IilliliilIIi(IIIIliilIIIlii other) {
      if (other == null) {
         return Iiilliiliiil<"Iiilliiliiil","DSW452tjZ9Z9sBDvsQJlJeQN2iI/G7K5ww+FY7v3PpbOiEuSE+LaCZUfIb7KCd7KZf8tlX2VDxqy">();
      } else if (this.lIiilIiIIl.equals(other.lIiilIiIIl)) {
         return null;
      } else if (!this.lllilIiIIl.equals(other.lllilIiIIl)) {
         return Iiilliiliiil<"Iiilliiliiil","iKkj19yxN6+vTpjjmW+6BZRw14ZDw7z1DuFr//7Ircr/rhewjdHngRRvTRm7HG2K5vsR">()
            + other.lllilIiIIl
            + Iiilliiliiil<"Iiilliiliiil","GWvLsf2Rw9qVUzuiIUWyt5BxzoNtDyKvE9AfnLd3URakJbuBIA==">()
            + this.lllilIiIIl
            + Iiilliiliiil<"Iiilliiliiil","AKffu1xONmBygll3FUBW223Bp5pcKgPBKJq3sAc=">();
      } else {
         return this.illilIiIIl == other.illilIiIIl && this.IililIiIIl == other.IililIiIIl && this.lililIiIIl == other.lililIiIIl
            ? Iiilliiliiil<"Iiilliiliiil","OH7T/o34qpQOqxc7RvJjEU462NZ4wxpFy5HgZeEaPoDp1xQXzCLSPyhEZIfy37o6Rfel3IPZBnwVeN4kKZPVvX7gpO+znlvYavS1wZvyDdBVn67IKgyUt60nHUH5H9U9D1W3Q+Rnft+yvK8=">()
            : Iiilliiliiil<"Iiilliiliiil","FKSRbPl/rbwaTR5qVYHAq9I536Uv0FUo0UX4+7PU/NBcQX3fWdLeQDM7q30nDvvgHLE6bPy5U1isZ6YCIVAm">()
               + other.illilIiIIl
               + Iiilliiliiil<"Iiilliiliiil","tDV3UV4F/GYKX1SuZ/seWEeYP80sG9ZOQp9J/w8=">()
               + other.IililIiIIl
               + Iiilliiliiil<"Iiilliiliiil","tDV3UV4F/GYKX1SuZ/seWEeYP80sG9ZOQp9J/w8=">()
               + other.lililIiIIl
               + Iiilliiliiil<"Iiilliiliiil","GWvLsf2Rw9qVUzuiIUWyt5BxzoNtDyKvE9AfnLd3URakJbuBIA==">()
               + this.illilIiIIl
               + Iiilliiliiil<"Iiilliiliiil","tDV3UV4F/GYKX1SuZ/seWEeYP80sG9ZOQp9J/w8=">()
               + this.IililIiIIl
               + Iiilliiliiil<"Iiilliiliiil","tDV3UV4F/GYKX1SuZ/seWEeYP80sG9ZOQp9J/w8=">()
               + this.lililIiIIl
               + Iiilliiliiil<"Iiilliiliiil","AKffu1xONmBygll3FUBW223Bp5pcKgPBKJq3sAc=">();
      }
   }

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","mQi/zldSX+6CSuhftAxWkNs6DeRRDzkHEyXtugh3+wG/gJcj/w==">(), this.lllilIiIIl);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","WsCm8V5yxPaYoCobaOvryj91MKM0upVAkkdDM08=">(), this.illilIiIIl);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","9EQgpjOKrqqpPHwdKtqkfvALpChKVORZmMhv4+w=">(), this.IililIiIIl);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","TvmoAjfPtGansgTKep9vH4IdJVMZCrhEAujzYeI=">(), this.lililIiIIl);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","UaolcnbEv/C7sbtT6hEEeB9I66AkHLiwi8ssFGF6+QpnnA==">(), this.iililIiIIl);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","SWkYNLL/+bCBwl5lJHYVZUfDRi7rwxKLzsPIP4JBfEAM+MU=">(), Long.toHexString(this.IIiilIiIIl));
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","OGWVXfsRmzQHs6cIZmQ12Zr/wHQdtTuBlLQZbMcPLvkj">(), this.lIiilIiIIl);
      return var1;
   }

   public static IIIIliilIIIlii iliIiiliiiii(JsonObject o) {
      if (o != null && o.has(Iiilliiliiil<"Iiilliiliiil","OGWVXfsRmzQHs6cIZmQ12Zr/wHQdtTuBlLQZbMcPLvkj">())) {
         try {
            long var1 = 0L;
            if (o.has(Iiilliiliiil<"Iiilliiliiil","SWkYNLL/+bCBwl5lJHYVZUfDRi7rwxKLzsPIP4JBfEAM+MU=">())) {
               try {
                  var1 = Long.parseUnsignedLong(o.get(Iiilliiliiil<"Iiilliiliiil","SWkYNLL/+bCBwl5lJHYVZUfDRi7rwxKLzsPIP4JBfEAM+MU=">()).getAsString(), 16);
               } catch (Exception var4) {
               }
            }

            return new IIIIliilIIIlii(
               o.has(Iiilliiliiil<"Iiilliiliiil","mQi/zldSX+6CSuhftAxWkNs6DeRRDzkHEyXtugh3+wG/gJcj/w==">())
                  ? o.get(Iiilliiliiil<"Iiilliiliiil","mQi/zldSX+6CSuhftAxWkNs6DeRRDzkHEyXtugh3+wG/gJcj/w==">()).getAsString()
                  : "",
               IIIllIIliIIl(o, Iiilliiliiil<"Iiilliiliiil","WsCm8V5yxPaYoCobaOvryj91MKM0upVAkkdDM08=">()),
               IIIllIIliIIl(o, Iiilliiliiil<"Iiilliiliiil","9EQgpjOKrqqpPHwdKtqkfvALpChKVORZmMhv4+w=">()),
               IIIllIIliIIl(o, Iiilliiliiil<"Iiilliiliiil","TvmoAjfPtGansgTKep9vH4IdJVMZCrhEAujzYeI=">()),
               IIIllIIliIIl(o, Iiilliiliiil<"Iiilliiliiil","UaolcnbEv/C7sbtT6hEEeB9I66AkHLiwi8ssFGF6+QpnnA==">()),
               var1,
               o.get(Iiilliiliiil<"Iiilliiliiil","OGWVXfsRmzQHs6cIZmQ12Zr/wHQdtTuBlLQZbMcPLvkj">()).getAsString()
            );
         } catch (Exception var5) {
            return null;
         }
      } else {
         return null;
      }
   }

   public String Ililllililil() {
      return this.lIiilIiIIl;
   }

   public boolean iIlIlllllill(IIIIliilIIIlii o) {
      return o != null && this.lIiilIiIIl.equals(o.lIiilIiIIl);
   }

   public int Illlllllilll() {
      return this.lililIiIIl;
   }

   public String IlIlllIlilIl() {
      return this.lllilIiIIl;
   }

   public int IIlllIlliIll() {
      return this.IililIiIIl;
   }

   public IIIIliilIIIlii(String schematicName, int width, int height, int length, int contentCells, long contentDigest, String hash) {
      this.lllilIiIIl = schematicName;
      this.illilIiIIl = width;
      this.IililIiIIl = height;
      this.lililIiIIl = length;
      this.iililIiIIl = contentCells;
      this.IIiilIiIIl = contentDigest;
      this.lIiilIiIIl = hash;
   }

   public int Iilllilliill() {
      return this.iililIiIIl;
   }

   public static IIIIliilIIIlii IliIlllilIi(String width, int contentCells, int contentDigest, int height, int length, long schematicName) {
      String var7 = width == null ? "" : width;
      String var8 = var7 + '|' + contentCells + 'x' + contentDigest + 'x' + height + '|' + length + '|' + Long.toHexString(schematicName);
      return new IIIIliilIIIlii(var7, contentCells, contentDigest, height, length, schematicName, liiiIIllIl(var8));
   }

   private static int IIIllIIliIIl(JsonObject k, String o) {
      return k.has(o) ? k.get(o).getAsInt() : 0;
   }

   public int IiIlliIliiIl() {
      return this.illilIiIIl;
   }

   private static String liiiIIllIl(String seed) {
      long var5 = -5972881049646595492L;

      try {
         MessageDigest var1 = MessageDigest.getInstance(Iiilliiliiil<"Iiilliiliiil","YhvfLx80k5pUAqoTnTjA2o6EUlFsNPC6CCFP+UyLs2eKkrY=">());
         byte[] var2 = var1.digest(seed.getBytes(StandardCharsets.UTF_8));
         StringBuilder var3 = new StringBuilder(16);

         for (long var8 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var8 >>> 32) < 8; var8 += 4294967296L) {
            var3.append(Character.forDigit(var2[(int)(var8 >>> 32)] >> 4 & 15, 16)).append(Character.forDigit(var2[(int)(var8 >>> 32)] & 15, 16));
         }

         return var3.toString();
      } catch (Exception var7) {
         return Integer.toHexString(seed.hashCode());
      }
   }

   public long IIillIiliIil() {
      return this.IIiilIiIIl;
   }
}
