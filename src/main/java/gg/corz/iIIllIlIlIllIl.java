package gg.corz;

import com.google.gson.JsonObject;
import java.util.Locale;

public record iIIllIlIlIllIl(
   int protocolVersion, String minecraftVersion, String plannerGeneration, String gitCommit, String buildDigest, String schematicDigest, String transformDigest
) {
   private final String lIiillIlliIiillIll;
   public static final int iliillIllIiiillIll = 2;
   private final String IilillIlllilillIll;
   private final String IliillIlllliillIll;
   private final String iilillIllIIiillIll;
   private final String lllillIllillillIll;
   private final String iIlillIllIllillIll;
   private final int IIlillIlllIlillIll;

   public String IilliliilIIi(iIIllIlIlIllIl peer, liiiiilliiiiiill v) {
      if (v == liiiiilliiiiiill.IiillIIIil) {
         return IlIillIiilIi<"IlIillIiilIi","tLh040nfB3EOm4H/oB4RoJ/RJFrbT/vA3zN3lWoZFdTjzm7EaB0=">();
      } else {
         String var3;
         String var4;
         switch (v) {
            case liillIIIil:
               var3 = String.valueOf(this.IIlillIlllIlillIll);
               var4 = peer == null
                  ? IlIillIiilIi<"IlIillIiilIi","DV2PYnZI73hCBM4ulJZfjLXcmTYg+Rib5z+U8l2gdnqfeIw=">()
                  : String.valueOf(peer.IIlillIlllIlillIll);
               break;
            case iIIilIIIil:
               var3 = this.iIlillIllIllillIll;
               var4 = peer.iIlillIllIllillIll;
               break;
            case iiillIIIil:
               var3 = this.lllillIllillillIll;
               var4 = peer.lllillIllillillIll;
               break;
            case IiillIIIil:
               var3 = this.iilillIllIIiillIll;
               var4 = peer.iilillIllIIiillIll;
               break;
            default:
               var3 = this.lIiillIlliIiillIll;
               var4 = peer.lIiillIlliIiillIll;
         }

         return IlIillIiilIi<"IlIillIiilIi","o+2ZVx3s9disbepl34JlZ95cRDVO1nbEyxZlnEpYqr+Pnb9Wi5JOiOJNVhlCn769haAr/U9U8lCFHvM=">()
            + v
            + IlIillIiilIi<"IlIillIiilIi","QXgdgafAbShZ8I3k5qALdSzrsXUEDACwRz0LTcvwZGYrw40yEac=">()
            + var3
            + IlIillIiilIi<"IlIillIiilIi","Zq6J5L+UyO7IxVu/Gk3SuyV7Vd21Z/+1bOKiP9epxmxWrkV0Yw==">()
            + var4;
      }
   }

   public boolean liiiIIllIl(iIIllIlIlIllIl peer) {
      return peer != null && !lIiiIiIlilli(this.IliillIlllliillIll, peer.IliillIlllliillIll);
   }

   public String Ililllililil() {
      return this.iilillIllIIiillIll;
   }

   public iIIllIlIlIllIl(
      int protocolVersion,
      String minecraftVersion,
      String plannerGeneration,
      String gitCommit,
      String buildDigest,
      String schematicDigest,
      String transformDigest
   ) {
      this.IIlillIlllIlillIll = protocolVersion;
      this.iIlillIllIllillIll = minecraftVersion;
      this.lllillIllillillIll = plannerGeneration;
      this.IilillIlllilillIll = gitCommit;
      this.iilillIllIIiillIll = buildDigest;
      this.lIiillIlliIiillIll = schematicDigest;
      this.IliillIlllliillIll = transformDigest;
   }

   public boolean iIlIlllllill(iIIllIlIlIllIl peer) {
      return this.IliIlllilIi(peer) == liiiiilliiiiiill.IiillIIIil;
   }

   public String Iiilliiliiil() {
      return this.lIiillIlliIiillIll;
   }

   public static iIIllIlIlIllIl IIIllIIliIIl(JsonObject o) {
      if (o != null
         && o.has(IlIillIiilIi<"IlIillIiilIi","duUf0CABZ+Nd8D41LXA9kk1uTVnyLYwPZ8r5h0YMoYeB">())
         && o.has(IlIillIiilIi<"IlIillIiilIi","EbKg/1FKUALDJSoZC0rvSOyS3Sz7LrnKmibe9+936U8T">())) {
         try {
            return new iIIllIlIlIllIl(
               o.get(IlIillIiilIi<"IlIillIiilIi","duUf0CABZ+Nd8D41LXA9kk1uTVnyLYwPZ8r5h0YMoYeB">()).getAsInt(),
               IlIlllIlilIl(o, IlIillIiilIi<"IlIillIiilIi","ITNg5fYmlFFCdSlt74aKRXNhW45SFWv1zcCm6vxT">()),
               IlIlllIlilIl(o, IlIillIiilIi<"IlIillIiilIi","TN4A+Gdh3wu73NoWoEPJ2MqIY7RZgOWOy1kP7XhimQ==">()),
               IlIlllIlilIl(o, IlIillIiilIi<"IlIillIiilIi","P3Sg/pjS3/WwafiUsXXu7l4yuofuFBJqezLbzLILAzyCJA==">()),
               IlIlllIlilIl(o, IlIillIiilIi<"IlIillIiilIi","EbKg/1FKUALDJSoZC0rvSOyS3Sz7LrnKmibe9+936U8T">()),
               IlIlllIlilIl(o, IlIillIiilIi<"IlIillIiilIi","XN5BEchM8HkZSAjBpkb9cfeqOWmo5zfJL9iAUxuxOwvX">()),
               IlIlllIlilIl(o, IlIillIiilIi<"IlIillIiilIi","m2UKlsWlxAhr4eMNRJ83yuJFTnZV1b2s/02bVRdJft58">())
            );
         } catch (Exception var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String IlIlllIlilIl(JsonObject k, String o) {
      return k.has(o) ? k.get(o).getAsString() : "";
   }

   private static boolean lIiiIiIlilli(String a, String b) {
      return a == null ? b == null : a.equals(b);
   }

   public String IiIlliIliiIl() {
      return String.format(
         Locale.ROOT,
         IlIillIiilIi<"IlIillIiilIi","WA3nnBUC2rA8pciCL1Z86R0BYhlPTXsomxhDiK9Qlj3GqxFke+gs/TqOSBWoyVBBB7AmOEu1bC8/2NFLe980ZQKaCQZ5hZmHauGVQM3PLLZF1MrMlPpdSHYTAmhlyH9lcmdhAOAh6Ho=">(),
         this.IIlillIlllIlillIll,
         this.iIlillIllIllillIll,
         this.lllillIllillillIll,
         this.IilillIlllilillIll,
         this.iilillIllIIiillIll,
         this.lIiillIlliIiillIll,
         this.IliillIlllliillIll
      );
   }

   public String Illlllllilll() {
      return this.iIlillIllIllillIll;
   }

   public JsonObject iliIiiliiiii() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","duUf0CABZ+Nd8D41LXA9kk1uTVnyLYwPZ8r5h0YMoYeB">(), this.IIlillIlllIlillIll);
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","ITNg5fYmlFFCdSlt74aKRXNhW45SFWv1zcCm6vxT">(), this.iIlillIllIllillIll);
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","TN4A+Gdh3wu73NoWoEPJ2MqIY7RZgOWOy1kP7XhimQ==">(), this.lllillIllillillIll);
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","P3Sg/pjS3/WwafiUsXXu7l4yuofuFBJqezLbzLILAzyCJA==">(), this.IilillIlllilillIll);
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","EbKg/1FKUALDJSoZC0rvSOyS3Sz7LrnKmibe9+936U8T">(), this.iilillIllIIiillIll);
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","XN5BEchM8HkZSAjBpkb9cfeqOWmo5zfJL9iAUxuxOwvX">(), this.lIiillIlliIiillIll);
      var1.addProperty(IlIillIiilIi<"IlIillIiilIi","m2UKlsWlxAhr4eMNRJ83yuJFTnZV1b2s/02bVRdJft58">(), this.IliillIlllliillIll);
      return var1;
   }

   public String IIillIiliIil() {
      return this.IilillIlllilillIll;
   }

   public String Iilllilliill() {
      return this.lllillIllillillIll;
   }

   public int IIlllIlliIll() {
      return this.IIlillIlllIlillIll;
   }

   public liiiiilliiiiiill IliIlllilIi(iIIllIlIlIllIl peer) {
      if (peer == null) {
         return liiiiilliiiiiill.liillIIIil;
      } else if (peer.IIlillIlllIlillIll != this.IIlillIlllIlillIll) {
         return liiiiilliiiiiill.liillIIIil;
      } else if (!lIiiIiIlilli(this.iIlillIllIllillIll, peer.iIlillIllIllillIll)) {
         return liiiiilliiiiiill.iiillIIIil;
      } else if (!lIiiIiIlilli(this.lllillIllillillIll, peer.lllillIllillillIll)) {
         return liiiiilliiiiiill.IIIilIIIil;
      } else if (!lIiiIiIlilli(this.iilillIllIIiillIll, peer.iilillIllIIiillIll)) {
         return liiiiilliiiiiill.lIIilIIIil;
      } else {
         return !lIiiIiIlilli(this.lIiillIlliIiillIll, peer.lIiillIlliIiillIll) ? liiiiilliiiiiill.iIIilIIIil : liiiiilliiiiiill.IiillIIIil;
      }
   }

   public String IIIilIIiiIIi() {
      return this.IliillIlllliillIll;
   }
}
