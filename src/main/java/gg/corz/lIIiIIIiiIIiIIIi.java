package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_2338;

public final class lIIiIIIiiIIiIIIi {
   private final boolean iliilIliil;
   private boolean IiIIiIliil;
   private iIlililIllilil IlIIiIliil;
   private boolean IllIiIliil;
   private int lIiIiIliil;
   private boolean illliIliil;
   private long liIIiIliil;
   private static final long IliilIliil = 30000L;
   private llIIliIiilIIliIi lIIliIliil;
   private final Map<String, Long> lliliIliil;
   private final iIiIliIiIliIliIi IiiilIliil;
   private final Set<String> lIiliIliil;
   private long lIlIiIliil;
   private static final long iililIliil = 400L;
   private final Set<String> liiIiIliil;
   private int iIiIiIliil;
   private liIliliiIlil iIIIiIliil;
   private int IilIiIliil;
   public static final String ililiIliil = "blocked";
   private long illIiIliil;
   private long iiIIiIliil;
   private long lilliIliil;
   private volatile Set<Long> IiiIiIliil;
   private int IIIIiIliil;
   private lIliIliIliIl IilliIliil;
   private static final long lililIliil = 500L;
   private String liIliIliil;
   private static final long iilliIliil = 5000L;
   private String ilIIiIliil;
   private List<IiiiIiIlliiiIiIl> iiiilIliil = List.of();
   private llIIliIiilIIliIi iIIliIliil;
   private String llIIiIliil;
   private static final long IIiilIliil = 700L;
   private boolean iIlIiIliil;
   private final llIillIlilIillIl lliilIliil;
   private static final int lilIiIliil = 3;
   private String IIlliIliil;
   private String iiIliIliil;
   private int iIiliIliil;
   private final iIiiiiIlIliiiiIl lIlliIliil;
   private lliIlilliliIlill liiilIliil;
   private String IlIliIliil;
   private int IliliIliil;
   private String iIlliIliil;
   private int IIiIiIliil;
   private int IliIiIliil;
   private static final long lIiilIliil = 4000L;
   private int iilIiIliil;
   private final Map<String, String> IllliIliil;
   private int lliIiIliil;
   private final IIIIliilIIIlii iiiIiIliil;
   private final String IIIliIliil;
   private final Map<String, liiiiilliiiiiill> IIiliIliil;
   private final Map<Long, Long> iliIiIliil;
   private boolean IiIliIliil;
   private boolean llIliIliil;
   private iIlIlIilIllIlIil lllliIliil;
   private final Map<String, iIlIlIilIllIlIil> ilIliIliil;
   private boolean lllIiIliil;
   private final String lIIIiIliil;
   private long IIlIiIliil;

   private void IIiilIiiiIii(JsonArray members, String hostId) {
      if (this.iIIIiIliil != null) {
         Set var3 = this.lliilIliil.lIlIliIlIl();
         String var4 = this.IiiilIliil.IIlllIlliIll();
         HashSet var5 = new HashSet();
         if (members != null) {
            for (JsonElement var7 : members) {
               if (var7.isJsonObject()) {
                  IIliIiIilIliIiIi var8 = IIliIiIilIliIiIi.iIlIlllllill(var7.getAsJsonObject());
                  if (var8 != null) {
                     var8.liiilIiIIi = var3 == null
                        || var3.isEmpty()
                        || var8.lIiilIiIIi.equals(var4)
                        || var8.iIiilIiIIi != null && var3.contains(var8.iIiilIiIIi.toLowerCase(Locale.ROOT));
                     if (var8.lIiilIiIIi.equals(var4)) {
                        var8.IIIIiIiIIi = this.lliilIliil.IIIilIIiiIIi();
                     }

                     var5.add(var8.lIiilIiIIi);
                     IIliIiIilIliIiIi var9 = this.iIIIiIliil.iIlIlllllill(var8.lIiilIiIIi);
                     if (!var8.iliilIiIIi) {
                        var8.IiiilIiIIi = var9 != null && var9.IiiilIiIIi > 0L ? var9.IiiilIiIIi : System.currentTimeMillis();
                     }

                     var8.iiiilIiIIi = this.IIiliIliil.get(var8.lIiilIiIIi);
                     this.iIIIiIliil.liiiIIllIl(var8);
                  }
               }
            }

            if (!var5.isEmpty()) {
               this.IiIIiIliil = true;
            }
         }

         for (IIliIiIilIliIiIi var11 : this.iIIIiIliil.IilliliilIIi()) {
            if (!var5.contains(var11.lIiilIiIIi) && var11.iliilIiIIi) {
               var11.iliilIiIIi = false;
               var11.IiiilIiIIi = System.currentTimeMillis();
            }
         }

         if (!var5.isEmpty()) {
            this.ilIliIliil.keySet().removeIf(id -> !var5.contains(id));
         }

         if (hostId != null) {
            this.iIIIiIliil.iiliilliIIiiilli = hostId;
         }

         if (this.iIIIiIliil.lIiiilliiIiiilli != this.lliilIliil.IiIIlliIIl() && this.iIIIiIliil.IliIlllilIi()) {
            this.iIIIiIliil.lIiiilliiIiiilli = this.lliilIliil.IiIIlliIIl();
         }
      }
   }

   public void lIiiIiIlilli() {
      this.IiiilIliil.IliIlllilIi(this.lIIIiIliil, this.iiiIiIliil.Ililllililil(), this.lliilIliil.Iliilliiilii(), this.lliilIliil.Iiiiliiiiiii());
      this.llIIiIliil = this.iliilIliil
         ? llIliilIli<"llIliilIli","c/aXPXfAc8TMCEfjPg4TSyOCDCkpnIHgo2dgoPnAvZs/BvcXPC9ly6+m/kX+U2E=">()
         : llIliilIli<"llIliilIli","o5ckrCsSvdgI6iHATWqzu7LBqawhEK0EhR+gKm6fhF2l+7GlkRyQxfjYofU4Lg==">();
      this.lliilIliil
         .IllIllllIl(
            llIliilIli<"llIliilIli","NmFEqmhGdoGLLi0DMkyCJjXQTwpvstCGfdtXbpLRnvxgxnpRNWxMDcXGxpOqcz2yNw==">()
               + (
                  this.iliilIliil
                     ? llIliilIli<"llIliilIli","MGwwR9dbBGPLRe+sz3jJ0QJOQXTZnbtkp0N59+rlqPGORFY=">()
                     : llIliilIli<"llIliilIli","lun5ri1XZ6XHl2KKjAdccvvwGH8MwtuddlO3sxk1umBIbyU=">()
               )
               + llIliilIli<"llIliilIli","Fgxb62TzgBqLMk0Non+yN8yjuQRe5kVvgbDFtPujM+mucQ==">()
               + (this.IIIliIliil.isEmpty() ? llIliilIli<"llIliilIli","nujnHDrI/hU6MZDF8t/Ty5BMynRJvmmPdxiMNnX1iROlFN0oDg==">() : this.IIIliIliil)
               + llIliilIli<"llIliilIli","Lc4Q78nfEufk3u/xid3EG8uTLksD4rlZjCndUzFnVOLr">()
               + this.iiiIiIliil.IlIlllIlilIl()
         );
   }

   public boolean Iiiilliiil() {
      return this.IiiilIliil.IlIlllIlilIl();
   }

   public llIllililIllil IiIlliIliiIl() {
      long var7 = -815895253939335317L;
      if (this.iIIIiIliil == null) {
         return llIllililIllil.lliIIIIliiliIIIIli;
      } else {
         long var1 = System.currentTimeMillis();
         ArrayList var3 = new ArrayList();

         for (IIliIiIilIliIiIi var5 : this.iIIIiIliil.IilliliilIIi()) {
            var7 ^= ((long)(!var5.iliilIiIIi && (var5.IiiilIiIIi <= 0L || var1 - var5.IiiilIiIIi >= 30000L) ? 0 : 1) << 32 ^ var7) & -1L << 32;
            var3.add(new lIIilllliIIillll(var5.lIiilIiIIi, var5.liiiIIllIl(), (boolean)((int)(var7 >>> 32))));
         }

         return this.lIlliIliil.iIlIlllllill(var3, this.IiiilIliil.IIlllIlliIll());
      }
   }

   private void Iliilliiilii(JsonObject doc) {
      long var6 = -3315834963837194233L;
      this.Iiilliiliiil(doc);
      if (this.iIIliIliil != null && this.lIIliIliil != null && !this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) {
         this.IIlilIliiIli(this.iIIliIliil);
         if (this.lIIliIliil == null || !this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) {
            return;
         }
      }

      String var2 = doc != null && doc.has(llIliilIli<"llIliilIli","kNvk7zqL3cNr3heoCKlcGLwOrm7otfdQMqljybhaaOw=">())
         ? doc.get(llIliilIli<"llIliilIli","kNvk7zqL3cNr3heoCKlcGLwOrm7otfdQMqljybhaaOw=">()).getAsString()
         : "";
      var6 ^= ((long)(!var2.isEmpty() && var2.equals(this.IiiilIliil.Illlllllilll()) && !var2.equals(this.IiiilIliil.IIlllIlliIll()) ? 1 : 0) << 32 ^ var6)
         & -1L << 32;
      lIliIliIliIl var4 = this.iIIIiIliil.Iliiillilliiilli;
      lIiilliiIiilli var5 = this.iIIIiIliil.IIIIllIIIl(doc, (boolean)((int)(var6 >>> 32)));
      if (!this.iIIIiIliil.Iliiillilliiilli.equals(var4)) {
         this.IiIIlliIIl();
      }

      switch (var5) {
         case iIliliIIIl:
            this.lliilIliil
               .IllIllllIl(
                  llIliilIli<"llIliilIli","u/t+qH0hqLZIggRqNE50AS5zNT3fz7/Y9GQyT8Ei0BM0Qeuj8NuaJU7WwwRY16EQRXCQN4rh9Zk=">()
                     + this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl()
               );
            break;
         case IlliliIIIl:
            this.lliilIliil
               .IllIllllIl(
                  llIliilIli<"llIliilIli","sd1RsqwdUHAoPCf/EZcr24lX1+dTfanRCwFpLMBNoz9ENd6oNYTnXG73oMpcPDzN8SIRtMulqcGaV+cSi0hjjh2xLlwsyk5Yb7WxKTRtwFGU">()
                     + this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl()
               );
            break;
         case illiliIIIl:
            this.iilIiIliil++;
            if (this.IilIiIliil++ == 3) {
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","jKYAlneOLnjgYCtP5me9/LjtoRGfu45HmOKwpKCvpW0uKcHA2QLHyQBoip4gDc9Gxoe4jvxCmlJG3qJVh/agxGm90hWEoaWHoQTtUOs3jF91uahg57RPkzgzemqvh8bP9zVx5pfRBCs4aMIutu13hAdexh6pmiMQtDdM8EO/Q8ascjHUctM5cKTxawVJHeaSDABJZ72tUTN2tcfR4vB8vETUun6+JxcZGWmmdw==">()
                  );
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","ubcbOG8NEMvEAgEVA4l9ukutcHjtMl+JEAmEbo/feoWzjQyYFLWoTvSqgMwF8GbwEoxnvLUANkK8Fe/CdkOz">()
                        + this.lliilIliil.IiIiliIiiiIi().Iilllilliill()
                        + llIliilIli<"llIliilIli","qveUTSF2/Sd9leyeoq8tfXVyjRD2PPFhX/cgns8A">()
                  );
               this.llIIiIliil = llIliilIli<"llIliilIli","XlYyjjeYrr8qqeAr6CyYFTlnDzr+yusO/NycCwbP2phdymJ5yRuXHgbBbnAW9YIYw1EtUS4=">();
            }
            break;
         case llliliIIIl:
            this.iilIiIliil++;
      }
   }

   public void IIIllIIliIIl(llIillIlilIillIl liveCtx) {
      long var7 = 2972173748263648078L;
      IiiIiIilliiIiIil var2 = this.IiiilIliil.IIIllIIliIIl();
      if (var2 == IiiIiIilliiIiIil.llIIIilIil && this.IlIIiIliil == iIlililIllilil.IIiillIlilIiillIli) {
         this.IlIlllIlilIl();
      }

      if (var2 == IiiIiIilliiIiIil.ilIIIilIil) {
         this.iIlIiIllIi(llIliilIli<"llIliilIli","2ktH+BbGB1eoaEEvNZX7bfkhllo33NxXzyTw8LIHFagwwQ0TEdkrZNCt">());
      } else if (var2 == IiiIiIilliiIiIil.IiIIIilIil) {
         this.lllIiillIi(this.IiiilIliil.IiIlliIliiIl());
      } else if (this.IlIIiIliil == iIlililIllilil.IIiillIlilIiillIli) {
         this.llIIiIliil = this.IiiilIliil.IlIlllIlilIl()
            ? llIliilIli<"llIliilIli","gNMQxXeJnEo6pbshHpDG8WkTxeafx/4UFrXk6mxoP8BP2NPfrUwToUDEQRatJahg2PvKcEW2+VgWkNMBoxQ=">()
            : this.llIIiIliil;
      } else {
         long var3 = System.currentTimeMillis();
         if (this.iIIIiIliil == null) {
            this.IiiilIliil.iliIiiliiiii(new iiiIIilIIIlIil() {
               @Override
               public void liiiIIllIl(long doc, JsonObject version) {
                  lIIiIIIiiIIiIIIi.this.Iiilliiliiil(version);
               }

               @Override
               public void IliIlllilIi(JsonArray members, String serverTimeMs, long hostId) {
                  lIIiIIIiiIIiIIIi.this.Illlllllilll(members, serverTimeMs);
               }

               @Override
               public void iIlIlllllill(ilIllIiIiIllIi m) {
                  if (m.IIilllIiilIilllIii == IlIiIlIlllIiIlIl.llllIIIiIl) {
                     lIIiIIIiiIIiIIIi.this.Iilllilliill(m);
                  }
               }
            });
            this.Ililllililil(var3);
            this.IIIilIIiiIIi();
            this.IIiIllIiIl(liveCtx);
            if (this.iIIIiIliil == null) {
               return;
            }
         }

         String var5 = this.IiiilIliil.Illlllllilll();
         if (var5 != null && !var5.isEmpty()) {
            this.iIIIiIliil.iiliilliIIiiilli = var5;
         }

         var7 ^= ((long)this.iIIIiIliil.IliIlllilIi() << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) != this.iIlIiIliil) {
            this.lliilIliil
               .IllIllllIl(
                  (int)(var7 >>> 32) != 0
                     ? llIliilIli<"llIliilIli","qubMFclQoZY+ud7ynNINf0sPjPQ3lOELzn4N4mo0ggmAd7vH223sjx6hJg1go1eyzhnOsVBZfBG8XiPeKCqUsqztChsodAhGOwyjyw==">()
                     : llIliilIli<"llIliilIli","S9N6A1a7ItklafYOmnA7rS+hV8P6lLjFFFkgti/4Hx9PJZJdEAj0fJI4KXw1bN3f7niMNbk+NfgxruK3Y6SPSfVCWYs=">()
               );
            if ((int)(var7 >>> 32) != 0) {
               this.iIIIiIliil.Iliiillilliiilli = this.iIIIiIliil.Iliiillilliiilli.IilliliilIIi()
                  ? this.iIIIiIliil.Iliiillilliiilli.iIlIlllllill()
                  : lIliIliIliIl.liiiIIllIl(this.liiilIliil.liiiIIllIl(), this.IiiilIliil.IIlllIlliIll(), var3);
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","naPk9oykSQ9w0/uOuiq5GpU7IEEt7805dmInv6Wkx0GnbO3l3jIG6T2B8onczkNbWA==">()
                        + this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl()
                        + llIliilIli<"llIliilIli","rZz3zE/w/m3Gzc8LKLYGnO9UKo2mnfQb8FrmNsEpHsGhpBY61pasaHOlCG+aa8uF6w==">()
                  );
            }

            this.iIlIiIliil = (boolean)((int)(var7 >>> 32));
         }

         if ((int)(var7 >>> 32) != 0) {
            this.iiIIlIIlIl();
         }

         this.IiiilIliil.iliIiiliiiii(new iiiIIilIIIlIil() {
            @Override
            public void iIlIlllllill(ilIllIiIiIllIi m) {
               lIIiIIIiiIIiIIIi.this.IIIIllIIIl(m);
            }

            @Override
            public void liiiIIllIl(long version, JsonObject doc) {
               if (!lIIiIIIiiIIiIIIi.this.iIIIiIliil.IliIlllilIi()) {
                  lIIiIIIiiIIiIIIi.this.Iliilliiilii(doc);
               }
            }

            @Override
            public void IliIlllilIi(JsonArray members, String serverTimeMs, long hostId) {
               lIIiIIIiiIIiIIIi.this.IIiilIiiiIii(members, serverTimeMs);
            }
         });
         var7 ^= ((long)this.iIIIiIliil.IliIlllilIi() << 32 ^ var7) & -1L << 32;
         this.Ililllililil(var3);
         if (var3 - this.IIlIiIliil >= 500L) {
            this.IIlIiIliil = var3;
            this.lilIliilIl(var3);
         }

         if ((int)(var7 >>> 32) != 0 && this.IiIIiIliil && !this.IiiilIliil.IlIlllIlilIl() && var3 - this.iiIIiIliil >= 400L) {
            this.iiIIiIliil = var3;
            this.illIlIilIl(var3);
         }

         if (var3 - this.lIlIiIliil >= 700L) {
            this.lIlIiIliil = var3;
            this.IIiIllIiIl(liveCtx);
         }

         this.iIiIlIliIl(liveCtx);
         this.iliIiIliil.entrySet().removeIf(now -> now.getValue() < var3);
         if (var3 - this.illIiIliil >= 30000L) {
            this.illIiIliil = var3;
            this.lliilIliil
               .IllIllllIl(
                  llIliilIli<"llIliilIli","NTscEJjV26fWBOAHRvY8TRZ1CxUBdJBGQEurv7y/XqVkiPD7Gcqk27aKx0CVRA==">()
                     + this.iiiilIIIIi()
                     + llIliilIli<"llIliilIli","Xis5Wx54ah/blWjg122usBMdM836k70UbWsv8hgrY3j34Q==">()
                     + this.iIIIiIliil.Iliilliiilii()
                     + llIliilIli<"llIliilIli","2NCR8KgY1r93hI3KxmORzLuYpzZAVVhrClwFAp8=">()
                     + this.iIIIiIliil.Iilllilliill().size()
                     + llIliilIli<"llIliilIli","yYFdzTqig1luI+Guk6no9P0pGbU8iQYvabwWLI2Aa2pB+no=">()
                     + this.iIIIiIliil.IIlilIliiIli()
                     + llIliilIli<"llIliilIli","2NCR8KgY1r93hI3KxmORzLuYpzZAVVhrClwFAp8=">()
                     + this.iIIIiIliil.IiIiliIiiiIi()
               );
         }

         this.llIIiIliil = (int)(var7 >>> 32) != 0
            ? llIliilIli<"llIliilIli","95eNarM9prpPFpv/smtvIG2m50cqYcUm7lPetdPdmOPDbsae3P5PUA==">()
            : llIliilIli<"llIliilIli","iqnZMI+Y6xEmdb+pRqbMqra5cGw+hABBFR13HKTWtdHmHLat">();
      }
   }

   public boolean Ilillllill() {
      return this.IlIIiIliil == iIlililIllilil.IiiillIliliiillIli || this.IlIIiIliil == iIlililIllilil.iiiillIliIIIIilIli;
   }

   private void Illillliilli(llIIliIiilIIliIi a) {
      String var2 = this.IiiilIliil.IIlllIlliIll();
      iIliIlIlIlliIlIl var3 = a.IIIllIIliIIl();
      this.liiilIliil = new lliIlilliliIlill(
         this.iiiIiIliil.IlIlllIlilIl(),
         this.iiiIiIliil.IiIlliIliiIl(),
         this.iiiIiIliil.IIlllIlliIll(),
         this.iiiIiIliil.Illlllllilll(),
         this.lliilIliil.iliIiiliiiii(),
         var3.iliIiiliiiii(),
         var3.IIIllIIliIIl(),
         var3.IlIlllIlilIl(),
         var3.IiIlliIliiIl(),
         var3.IIlllIlliIll(),
         this.iiiIiIliil.IIillIiliIil()
      );
      this.IIIIiIliil = iilIIIllIIiIIIll.IliIlllilIi(this.iiiIiIliil.IiIlliIliiIl(), this.iiiIiIliil.IIlllIlliIll(), this.iiiIiIliil.Illlllllilll());
      this.iiiilIliil = iilIIIllIIiIIIll.lIiiIiIlilli(
         var3.iliIiiliiiii(), var3.IIIllIIliIIl(), var3.IlIlllIlilIl(), this.IIIIiIliil, c -> this.lliilIliil.Iilllilliill(c)
      );
      lIliIliIliIl var4 = this.iIIIiIliil != null ? this.iIIIiIliil.Iliiillilliiilli : null;
      LinkedHashMap var5 = new LinkedHashMap();
      String var6 = this.IiiilIliil.Illlllllilll();
      if (this.iIIIiIliil != null) {
         for (IIliIiIilIliIiIi var8 : this.iIIIiIliil.IilliliilIIi()) {
            var5.put(var8.lIiilIiIIi, var8);
         }

         var6 = this.iIIIiIliil.iiliilliIIiiilli;
      }

      this.iIIIiIliil = new liIliliiIlil(var2, this.liiilIliil, var3.iliIiiliiiii(), var3.IIIllIIliIIl(), var3.IlIlllIlilIl(), this.IIIIiIliil);
      this.iIIIiIliil.iiliilliIIiiilli = var6;
      this.iIIIiIliil.lIiiilliiIiiilli = this.lliilIliil.IiIIlliIIl();

      for (IIliIiIilIliIiIi var12 : var5.values()) {
         this.iIIIiIliil.liiiIIllIl(var12);
      }

      this.iIIIiIliil.Iliiillilliiilli = var4 != null && var4.IilliliilIIi()
         ? var4
         : (
            this.iIIIiIliil.IliIlllilIi()
               ? lIliIliIliIl.liiiIIllIl(this.liiilIliil.liiiIIllIl(), var2, System.currentTimeMillis())
               : new lIliIliIliIl(this.liiilIliil.liiiIIllIl(), "", 0L)
         );
      this.IilliIliil = this.iIIIiIliil.Iliiillilliiilli;
      ArrayList var11 = new ArrayList(this.iiiilIliil.size());

      for (IiiiIiIlliiiIiIl var9 : this.iiiilIliil) {
         var11.add(
            new IiiiIiIlliiiIiIl(
               var9.iililliIll,
               var9.IIiilliIll,
               var9.lIiilliIll,
               var9.iIiilliIll,
               var9.IliilliIll,
               var9.lliilliIll,
               var9.iliilliIll,
               var9.IiiilliIll,
               var9.liiilliIll,
               var9.iiiilliIll,
               var9.IIIIiliIll,
               var9.lIIIiliIll,
               var9.iIIIiliIll
            )
         );
      }

      this.iIIIiIliil.IIlllIlliIll(var11);
      this.iIIIiIliil.iliiilliIiiiilli = a;
      this.iIIIiIliil.liiiilliiiiiilli = this.IlIliIliil;
      this.iIIIiIliil.IIIIIililIIIIili = this.llIliIliil;
      this.lIIliIliil = a;
      this.liIliIliil = null;
      this.IlIIiIliil = iIlililIllilil.lliillIliiliillIli;
      this.iIlIiIliil = this.iIIIiIliil.IliIlllilIi();
      this.lIlliIliil.IliIlllilIi();
      this.lliliIliil.clear();
      this.iliIiIliil.clear();
      this.liiIiIliil.clear();
      this.iIiliIliil = -1;
      this.lliilIliil
         .IllIllllIl(
            llIliilIli<"llIliilIli","ppa3ycZxI8JmRA033j/+y/u2kvlCHnZ7tAcEtxhYute4dOALlg8e2fAUFcPjf0THp1a4T0FC">()
               + (this.IIIliIliil.isEmpty() ? this.liiilIliil.liiiIIllIl() : this.IIIliIliil)
               + llIliilIli<"llIliilIli","9RKmox/6aBRg+1Em3eb/BCUQF5UDa2rvGIFWh4TXo01+7pTEtQ==">()
               + var11.size()
               + llIliilIli<"llIliilIli","IJl8XSLiCBuUoIB5u1gXDdYqBQ4Knvkv9WA92kop8MreQYo=">()
               + this.lliilIliil.iliIiiliiiii()
               + llIliilIli<"llIliilIli","O3tFIhKoO1Dkus7KT4H8vJjt/KEHJV4fgwQYhwSh7T9IbZkYssRe">()
               + var3.lIiiIiIlilli()
               + (
                  this.iIIIiIliil.IliIlllilIi()
                     ? llIliilIli<"llIliilIli","MJyrloSPnQuAlyXCJMQzkwdi1kZF7wH1IYyduKmdVgVlJwi+MiaxavgI1aZsQdDlxg==">()
                     : llIliilIli<"llIliilIli","f05/pVMPG2Bv+AFGG+9PKIcf6XUbk17lQBbrtlNcj3PS14pv78lp+kcz">() + lIiIiiIiIi(this.iIIIiIliil.iiliilliIIiiilli)
               )
         );
   }

   public String iIlIlllllill() {
      return this.IIIliIliil;
   }

   private void Iilllilliill(ilIllIiIiIllIi m) {
      if (m.iIilllIiiIlilllIii != null && !m.iIilllIiiIlilllIii.equals(this.IiiilIliil.IIlllIlliIll())) {
         iIIllIlIlIllIl var2 = iIIllIlIlIllIl.IIIllIIliIIl(m.iiilllIiiIIIillIii);
         liiiiilliiiiiill var3 = this.lliilIliil.IiIiliIiiiIi().IliIlllilIi(var2);
         this.IIiliIliil.put(m.iIilllIiiIlilllIii, var3);
         if (var3 != liiiiilliiiiiill.IiillIIIil) {
            if (this.lIiliIliil.add(m.iIilllIiiIlilllIii)) {
               this.lliIiIliil++;
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","a5jDVL8mT5R5T35ZilA8kBnf1rjOQ4+mAM4f91kvNB9YCQTn7bc/qy6JIXd5Zy1Xhg==">()
                        + this.IllliIliil.getOrDefault(m.iIilllIiiIlilllIii, lIiIiiIiIi(m.iIilllIiiIlilllIii))
                        + llIliilIli<"llIliilIli","uiKlfuevGu3JoLZ9WZ42aYy3nBVIHLXAAgv0GnhPVMHI72+JJGdjO3HGgT2yM7Ijb0f64jeIFNikRwUirYspmGVYFg0kmKSPhwjfE3xgII3KzuMJtxr1mA==">()
                  );
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","h6OvRkeToyKC8hx094Rta+nRf4xLv9wMm3XAmPefHA==">()
                        + this.lliilIliil
                           .IiIiliIiiiIi()
                           .IilliliilIIi(var2, var3)
                           .replace(
                              llIliilIli<"llIliilIli","Q6GVP6LzAY0mbYo9lZhdaBrGf7hHQ6lh3HJYqYo=">(),
                              llIliilIli<"llIliilIli","7oSp4Oypj1bMIs7rrrP4tknXqsYl3bv+IzGTwJpr7kE=">()
                           )
                  );
            }
         } else {
            this.IIillIiliIil(m);
         }
      }
   }

   public boolean lililiilil() {
      return this.iIIIiIliil != null && this.iIIIiIliil.IlIillIiilIi() > 0 && this.iIiliIliil != 0;
   }

   private void IIiIllIiIl(llIillIlilIillIl liveCtx) {
      IIliIiIilIliIiIi var2 = new IIliIiIilIliIiIi(this.IiiilIliil.IIlllIlliIll());
      var2.iIiilIiIIi = liveCtx.Iliilliiilii();
      var2.IliilIiIIi = liveCtx.Iiiiliiiiiii();
      var2.iIIIiIiIIi = liveCtx.llIIlilIIl();
      var2.IlIIiIiIIi = true;
      var2.llIIiIiIIi = liveCtx.IIlilIliiIli();
      var2.IiIIiIiIIi = liveCtx.Illillliilli();
      var2.liIIiIiIIi = liveCtx.Iilililiiili();
      var2.iiIIiIiIIi = liveCtx.IIiilIiiiIii();
      var2.IIlIiIiIIi = this.iIiliIliil;
      var2.lIlIiIiIIi = this.IliliIliil;
      var2.lIIIiIiIIi = this.iIIIiIliil != null && this.iIIIiIliil.IliIlllilIi() ? iliiiIIiIiiiiIIi.Illiliiiil : iliiiIIiIiiiiIIi.llliliiiil;
      var2.IIIIiIiIIi = liveCtx.IIIilIIiiIIi();
      if (liveCtx.IIIIllIIIl()) {
         var2.iIlIiIiIIi = liveCtx.iIIIlIlIIl();
      }

      this.IiiilIliil.iIlIlllllill(var2.lIiiIiIlilli());
   }

   public void iliIiiliiiii() {
      try {
         this.IiiilIliil.liiiIIllIl();
      } catch (Exception var2) {
      }

      this.IlIIiIliil = iIlililIllilil.IiiillIliliiillIli;
   }

   public liIliliiIlil iIiilIliil() {
      return this.iIIIiIliil;
   }

   public int lIIIiiIIIi() {
      return this.iilIiIliil;
   }

   private boolean Iiiiliiiiiii(ilIllIiIiIllIi m) {
      if (m.IIilllIiilIilllIii == IlIiIlIlllIiIlIl.llllIIIiIl) {
         return true;
      } else if (!this.iIIIiIliil.Iliiillilliiilli.IilliliilIIi()) {
         this.iilIiIliil++;
         return false;
      } else {
         IiIliliIli var2 = this.iIIIiIliil
            .Iliiillilliiilli
            .iliIiiliiiii(
               m.IilliliilIIi(llIliilIli<"llIliilIli","T6Sq3QciBgEd8cQacRuCMpeiDGbb5ukhpwYc6RFI1g==">()),
               m.IIIllIIliIIl(llIliilIli<"llIliilIli","cRERPwdztDSyVZNslCWOKlqMPp9/EWQY6oixOUFE0A==">(), -1L)
            );
         if (var2 == IiIliliIli.IiillIIlliillIIl) {
            return true;
         } else {
            this.iilIiIliil++;
            return false;
         }
      }
   }

   private void llIIlilIIl(IiiiIiIlliiiIiIl mine, llliiiIiilliiiIi j, llliiiIiilliiiIi theirs) {
      lIllIlliIllIll var4 = IIlillIilIlillIi.IliIlllilIi(mine.iililliIll, mine.IIIIiliIll, mine.IIlIiliIll, j, theirs);
      mine.IiIIiliIll = j != null && j.liiiIIllIl() ? var4.iIlIlllllill() : Math.max(mine.IiIIiliIll, var4.iIlIlllllill());
      if (var4.IliIlllilIi()) {
         mine.llIIiliIll = IliilIillliilIil.ililIllIil;
         if (var4.liiiIIllIl() == liiilliiiiilli.IilIiiIIIl) {
            this.IliIiIliil++;
         }
      } else {
         this.iIiIiIliil++;
         if (mine.IilliliilIIi()) {
            mine.llIIiliIll = IliilIillliilIil.lIilIllIil;
            mine.liIIiliIll = System.currentTimeMillis();
            this.lliilIliil
               .IllIllllIl(
                  llIliilIli<"llIliilIli","mRvQ/fTPlYemSXs5LATUygexOXEC6D6qYkrvh7GSgUMtZuoxkOBzsWHpVG+2spZjwd4XcUs=">()
                     + mine.iililliIll
                     + llIliilIli<"llIliilIli","pIVHe4jNOIxnMoaB3d2appt+bo3bwiHASAPayrppStAm2TdaSFlxn8FQe3x21qTN+QVnrzUgoRM9OsXKQ41c0Dv/tE5qLb7KPwrcO6hE2n16og==">()
               );
         }
      }
   }

   public void IiIilliIil(String reason) {
      long var6 = 1073888802955159692L;
      if (this.iIIIiIliil != null) {
         var6 ^= (
               (long)(reason != null && reason.startsWith(llIliilIli<"llIliilIli","Co+xLMRKZMkLHPbEKSXjingrxVtaOintMl7i/YiMebhkTaU=">()) ? 1 : 0) << 32 ^ var6
            )
            & -1L << 32;

         for (IiiiIiIlliiiIiIl var4 : this.iIIIiIliil.IIIilIIiiIIi()) {
            if (!var4.IilliliilIIi()) {
               if (this.iIIIiIliil.IliIlllilIi()) {
                  var4.iliIiiliiiii(IliilIillliilIil.IlilIllIil);
                  if ((int)(var6 >>> 32) != 0) {
                     var4.ilIIiliIll++;
                  }
               } else {
                  JsonObject var5 = new JsonObject();
                  var5.addProperty(llIliilIli<"llIliilIli","pA8TeunpbvX7Dz70gv6dDJrK/TRFrXz5VbaX6n6O9g==">(), reason == null ? "" : reason);
                  this.iilIiIIiIi(IlIiIlIlllIiIlIl.lillIIIiIl, var4, var5);
               }
            }
         }
      }
   }

   public int IIlIilIlIi() {
      return this.lliIiIliil;
   }

   public String IilliliilIIi() {
      return this.lIIIiIliil;
   }

   private void IlIlllIlilIl() {
      String var1 = this.IiiilIliil.IIlllIlliIll();
      String var2 = this.IiiilIliil.Iilllilliill();
      if (var2 != null && !var2.isEmpty() && !var2.equals(this.iiiIiIliil.Ililllililil())) {
         this.iiIliIliil = llIliilIli<"llIliilIli","NbKnxlGF9XyZqcX8pl17PSOhIir1OjC6q31D3FmZUuvsyCb4O5HIn1qDrMWUF3ocLNc/K+xBNqnDdQ==">()
            + this.iiiIiIliil.IlIlllIlilIl();
         this.lliilIliil
            .IllIllllIl(
               llIliilIli<"llIliilIli","Ej31o3v161GuZn8oSDjRWb6WNfyWRfNVCg72aO4LmABLbAngU0woS57rVMUdnRR6R3nk7qQ6BadTdOiypN0VvLUcPcif+KLBLvMW5w17MmhHHiteO93JgHqytAJ6YLv5NXWXrpj+dCsXfomHGOtN">()
            );
         this.lllIiillIi(llIliilIli<"llIliilIli","anF1DBCW7ETgUoKZF4/OXVshaQXAoarbadxGChQmGyJlu4940BP6AAIqgdnPNpY=">());
      } else {
         this.IIlliIliil = var1;
         this.IllIiIliil = true;
         this.IiIIiIliil = false;
         this.IlIIiIliil = iIlililIllilil.iIiillIliIliillIli;
         this.llIIiIliil = llIliilIli<"llIliilIli","GBBAlmk/4xAJ1dwe/jLYavle4M2M0+fSqtvExW57szfRx1YwcvvX2cXneTgp6TgR3bZcWd6/F4yutZjd">();
         llIIliIiilIIliIi var3 = this.lliilIliil.Ililllililil();
         if (var3 != null && var3.IliIlllilIi()) {
            this.ilIliIliil.put(var1, new iIlIlIilIllIlIil(var1, var3, this.iliilIliil));
         }
      }
   }

   public boolean IIIillIIil() {
      return this.IllIiIliil;
   }

   private boolean lIlIliIlIl() {
      if (this.iIIIiIliil == null) {
         return false;
      } else {
         String var1 = this.IiiilIliil.IIlllIlliIll();

         for (IIliIiIilIliIiIi var3 : this.iIIIiIliil.iliIiiliiiii()) {
            if (!var3.lIiilIiIIi.equals(var1) && !this.IIiliIliil.containsKey(var3.lIiilIiIIi)) {
               return true;
            }
         }

         return false;
      }
   }

   private void iIiIlIliIl(llIillIlilIillIl liveCtx) {
      long var10 = -8367817559749093503L;
      long var12 = 3542763316654901964L;
      if (this.iIIIiIliil == null) {
         this.IiiIiIliil = Collections.emptySet();
      } else {
         String var2 = liveCtx.IIiilIiiiIii();
         String var3 = this.IiiilIliil.IIlllIlliIll();
         HashSet var4 = new HashSet();

         for (IIliIiIilIliIiIi var6 : this.iIIIiIliil.iliIiiliiiii()) {
            if (!var6.lIiilIiIIi.equals(var3)
               && var6.IlIIiIiIIi
               && (var6.iiIIiIiIIi == null || var6.iiIIiIiIIi.isEmpty() || var2 == null || var6.iiIIiIiIIi.equals(var2))) {
               long var14 = var10 ^ ((long)((int)Math.floor(var6.llIIiIiIIi)) << 32 ^ var10) & -1L << 32;
               var10 = var14 ^ ((long)((int)Math.floor(var6.IiIIiIiIIi)) ^ var14) & -1L >>> 32;
               var12 ^= ((long)((int)Math.floor(var6.liIIiIiIIi)) << 32 ^ var12) & -1L << 32;
               var4.add(IliIilliIi((int)(var10 >>> 32), (int)var10, (int)(var12 >>> 32)));
               var4.add(IliIilliIi((int)(var10 >>> 32), (int)var10 + 1, (int)(var12 >>> 32)));
            }
         }

         this.IiiIiIliil = var4;
      }
   }

   public String liilliiill() {
      return this.ilIIiIliil;
   }

   public boolean IIlllIlliIll() {
      return this.iIIIiIliil != null && this.iIIIiIliil.IliIlllilIi();
   }

   private static long IliIilliIi(int x, int y, int z) {
      return class_2338.method_10064(x, y, z);
   }

   public int ilIIiIiIIi() {
      return this.IIiIiIliil;
   }

   private ilIllIiIiIllIi IilIililIi(ilIllIiIiIllIi m) {
      if (this.iIIIiIliil != null) {
         m.iiilllIiiIIIillIii
            .addProperty(llIliilIli<"llIliilIli","T6Sq3QciBgEd8cQacRuCMpeiDGbb5ukhpwYc6RFI1g==">(), this.iIIIiIliil.Iliiillilliiilli.iiilililIIIiilil);
         m.iiilllIiiIIIillIii
            .addProperty(llIliilIli<"llIliilIli","cRERPwdztDSyVZNslCWOKlqMPp9/EWQY6oixOUFE0A==">(), this.iIIIiIliil.Iliiillilliiilli.lIIiililiIIiilil);
      }

      return m;
   }

   public String iiIilIIlil(int z, int x, int y) {
      if (this.iIIIiIliil == null) {
         return null;
      } else {
         IiiiIiIlliiiIiIl var4 = this.iIIIiIliil.Ililllililil(z, x, y);
         if (var4 == null) {
            return null;
         } else {
            return var4.IlIIiliIll == null ? llIliilIli<"llIliilIli","s/ZCbjvdyyQunOu6z8+jMynZdxTIDqaK22otSrbD5gQ=">() : this.lIliliIlil(var4.IlIIiliIll);
         }
      }
   }

   public String iiiilIIIIi() {
      return llIliilIli<"llIliilIli","EHHUd3ZaRjVI4UnvqwIh0uq/GQg11OzaEKW3+7QAWwKF6cfU">()
         + (
            this.iIIIiIliil == null
               ? llIliilIli<"llIliilIli","77c9tQBm5pDww/nsdxBKz3ipc/TeEPLneVqHjD4Y4Z8=">()
               : this.iIIIiIliil.Iliiillilliiilli.IIIllIIliIIl()
         )
         + llIliilIli<"llIliilIli","+p436S5hJPPxBzKtsFNqtF7CoUOZR5r4bKX6PYtgdWZW/H6tNnWSBs11kY57+nKkGTo=">()
         + this.iilIiIliil
         + llIliilIli<"llIliilIli","EWdgc+RrDKzCC/ZT2VytYaNuc9STLUEFdFxQ2P3MM7SLLGO9ipCJvUem7zF+Ce6VpLmcdGI=">()
         + this.IiiilIliil.IIillIiliIil()
         + llIliilIli<"llIliilIli","A0z3dn1zDoHp1W0bLEwDdFAvtZuoTtXv56wYC4wkzsx0mHfQlVnbZ9EgiZlUsP4Oq67FoHiK">()
         + this.IIiIiIliil
         + llIliilIli<"llIliilIli","TSI3DdyPV9UYnWVdJdnPsjF8MWe3QOYbKBdp6BQTEpS6ha2X9rqhAfmZJo+NgZ2n">()
         + this.lIiIiIliil
         + llIliilIli<"llIliilIli","VANdl+FajTXCDSuU2IFzPVeyzucpc4nqouq1jkKNhRE/ZlfkBKOEjj/sgCKMQ4txCNNYWr4=">()
         + this.iIiIiIliil
         + llIliilIli<"llIliilIli","C3gV8anlLWxnw8ThV7C11a9N6ZEDDpC/NODtocMeoVuvjkI/rKFfEgnu8xoqQEjzSIkC1WU=">()
         + this.IliIiIliil
         + llIliilIli<"llIliilIli","ReNkQcermopDFVQAgJqOZSMt3m/I8m+H0RLul5XqlhH2tF9M46M+MyYiIEpUdhjGrgziyxJ8">()
         + this.lliIiIliil;
   }

   private void IIillIiliIil(ilIllIiIiIllIi m) {
      long var4 = -7589289154999754884L;
      if (m.iiilllIiiIIIillIii.has(llIliilIli<"llIliilIli","E02EeZB93esWFW9cYfNSEtHeKJy2MqaLhQUNrxHhWzJe7g==">())
         && m.iiilllIiiIIIillIii.get(llIliilIli<"llIliilIli","E02EeZB93esWFW9cYfNSEtHeKJy2MqaLhQUNrxHhWzJe7g==">()).isJsonObject()) {
         llIIliIiilIIliIi var2 = llIIliIiilIIliIi.lIiiIiIlilli(
            m.iiilllIiiIIIillIii.getAsJsonObject(llIliilIli<"llIliilIli","E02EeZB93esWFW9cYfNSEtHeKJy2MqaLhQUNrxHhWzJe7g==">())
         );
         if (var2 != null) {
            var4 ^= (
                  (long)(
                           m.iiilllIiiIIIillIii.has(llIliilIli<"llIliilIli","SukdDZg0axJjGNeV93yAaKwb+btsEt3w8RM/joVmme1gktGvM6E=">())
                                 && m.iiilllIiiIIIillIii.get(llIliilIli<"llIliilIli","SukdDZg0axJjGNeV93yAaKwb+btsEt3w8RM/joVmme1gktGvM6E=">()).getAsBoolean()
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var4
               )
               & -1L << 32;
            this.ilIliIliil.put(m.iIilllIiiIlilllIii, new iIlIlIilIllIlIil(m.iIilllIiiIlilllIii, var2, (boolean)((int)(var4 >>> 32))));
         }
      }
   }

   public int liIIiiiIIi() {
      return this.lIiIiIliil;
   }

   private void Iiilliiliiil(JsonObject doc) {
      long var4 = -6675534804356134126L;
      if (doc != null
         && doc.has(llIliilIli<"llIliilIli","/66t4LVT6UCGP0LqQaMlUbfPCFndH03Gl51itFx3Nw==">())
         && doc.get(llIliilIli<"llIliilIli","/66t4LVT6UCGP0LqQaMlUbfPCFndH03Gl51itFx3Nw==">()).isJsonObject()) {
         llIIliIiilIIliIi var2 = llIIliIiilIIliIi.lIiiIiIlilli(doc.getAsJsonObject(llIliilIli<"llIliilIli","/66t4LVT6UCGP0LqQaMlUbfPCFndH03Gl51itFx3Nw==">()));
         if (var2 != null) {
            var4 ^= ((long)(this.iIIliIliil != null && this.iIIliIliil.liiiIIllIl(var2) ? 0 : 1) << 32 ^ var4) & -1L << 32;
            this.iIIliIliil = var2;
            this.IlIliIliil = doc.has(llIliilIli<"llIliilIli","U6utvUr6XdKRm5DjO9mNr8Q7bl2HJZP02hztjyUqPB3I">())
               ? doc.get(llIliilIli<"llIliilIli","U6utvUr6XdKRm5DjO9mNr8Q7bl2HJZP02hztjyUqPB3I">()).getAsString()
               : "";
            this.llIliIliil = doc.has(llIliilIli<"llIliilIli","IK2+7pNO4Q38ReGbUK7zpgdzgJ5t1SKf7wUZmPNKe9jbgTA=">())
               && doc.get(llIliilIli<"llIliilIli","IK2+7pNO4Q38ReGbUK7zpgdzgJ5t1SKf7wUZmPNKe9jbgTA=">()).getAsBoolean();
            if ((int)(var4 >>> 32) != 0) {
               this.IiIliIliil = false;
            }
         }
      }
   }

   public lIIiIIIiiIIiIIIi(llIillIlilIillIl transport, boolean expectHost, IIiliIlllIiliIll ctx) {
      this.IlIIiIliil = iIlililIllilil.IIiillIlilIiillIli;
      this.llIIiIliil = llIliilIli<"llIliilIli","+/iE64fzVfvIyCsdQfgy5A2+0zz0wHXJF7Ze0HLd24iy8b3n1QpXE9o=">();
      this.ilIIiIliil = "";
      this.iliIiIliil = new HashMap<>();
      this.IiiIiIliil = Collections.emptySet();
      this.liiIiIliil = new HashSet<>();
      this.IlIliIliil = "";
      this.ilIliIliil = new HashMap<>();
      this.IIlliIliil = "";
      this.lIlliIliil = new iIiiiiIlIliiiiIl();
      this.iIlliIliil = "";
      this.IllliIliil = new HashMap<>();
      this.IilliIliil = lIliIliIliIl.IliIlllilIi();
      this.IIiliIliil = new HashMap<>();
      this.lIiliIliil = new HashSet<>();
      this.iIiliIliil = -1;
      this.lliliIliil = new HashMap<>();
      this.lliilIliil = transport;
      this.iliilIliil = expectHost;
      this.IiiilIliil = new iIiIliIiIliIliIi(ctx);
      this.iiiIiIliil = transport.IIillIiliIil();
      this.IIIliIliil = IliIiIIilliIiIIi.iIlIlllllill(transport.iiIIlIIlIl());
      this.lIIIiIliil = IliIiIIilliIiIIi.liiiIIllIl(transport.iiIIlIIlIl(), this.iiiIiIliil);
   }

   private void IiIiliIiiiIi() {
      long var6 = 4124882827556298598L;
      if (this.iIIIiIliil != null && this.iIIIiIliil.IIlilIliiIli() > 0) {
         this.illliIliil = true;
      }

      if (!this.illliIliil) {
         this.IlIillIiilIi();
         iIlIlIilIllIlIil var1 = liiiIiiiiiiIii.liiiIIllIl(this.ilIliIliil.values());
         if (liiiIiiiiiiIii.IliIlllilIi(this.lllliIliil, var1)) {
            iIlIlIilIllIlIil var2 = this.lllliIliil;
            llIIliIiilIIliIi var3 = this.iIIliIliil;
            String var4 = this.IlIliIliil;
            var6 ^= ((long)this.llIliIliil << 32 ^ var6) & -1L << 32;
            this.lllliIliil = var1;
            this.iIIliIliil = var1.iIlIlllllill();
            this.IlIliIliil = var1.liiiIIllIl();
            this.llIliIliil = var1.IilliliilIIi();
            this.IIlilIliiIli(this.iIIliIliil);
            if (this.lIIliIliil == null || !this.lIIliIliil.liiiIIllIl(this.iIIliIliil)) {
               this.lllliIliil = var2;
               this.iIIliIliil = var3;
               this.IlIliIliil = var4;
               this.llIliIliil = (boolean)((int)(var6 >>> 32));
            }
         }
      }
   }

   public lliIlilliliIlill IliIlllilIi() {
      return this.liiilIliil;
   }

   public boolean Iillllilll(llIillIlilIillIl host, boolean other) {
      return host == null ? false : other == this.iliilIliil && this.lIIIiIliil.equals(IliIiIIilliIiIIi.liiiIIllIl(host.iiIIlIIlIl(), host.IIillIiliIil()));
   }

   public void lIilliIill() {
      if (this.lIIliIliil != null) {
         if (this.IiiilIliil.IIlllIlliIll() != null && this.IiiilIliil.IIlllIlliIll().equals(this.IlIliIliil)) {
            llIIliIiilIIliIi var1 = this.lliilIliil.Ililllililil();
            if (var1 != null && var1.IliIlllilIi()) {
               this.lllliIliil = new iIlIlIilIllIlIil(this.IiiilIliil.IIlllIlliIll(), var1, this.iliilIliil);
               this.iIIliIliil = var1;
               this.Iilililiiili(var1, llIliilIli<"llIliilIli","GIALTCZGPofJ5Jzmayl6Yucseg2yvWyNLfu07jGvFaioRjKEiFTVzwu0fGKJD+U=">());
            }
         } else {
            this.IiIliIliil = true;
         }
      }
   }

   private void iiIIlIIlIl() {
      if (!this.iIIIiIliil.Iliiillilliiilli.equals(this.IilliIliil)) {
         this.IilliIliil = this.iIIIiIliil.Iliiillilliiilli;
         this.IiIIlliIIl();
      }
   }

   public boolean Illillllil(int staleMs, int z, int x, long y) {
      if (this.iIIIiIliil == null) {
         return false;
      } else {
         IiiiIiIlliiiIiIl var6 = this.iIIIiIliil.Ililllililil(staleMs, z, x);
         if (var6 == null || var6.IilliliilIIi() || this.IiiilIliil.IIlllIlliIll().equals(var6.IlIIiliIll)) {
            return false;
         } else if (!this.iIIIiIliil.IliIlllilIi() && !this.iIIIiIliil.Iliiillilliiilli.IilliliilIIi()) {
            return false;
         } else if (this.iIIIiIliil.IliIlllilIi()) {
            String var8 = var6.IlIIiliIll;
            if (!iilIIIllIIiIIIll.IIiilIiiiIii(var6, this.IiiilIliil.IIlllIlliIll(), System.currentTimeMillis(), y)) {
               return false;
            } else {
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","vlVDdF24NZ0s+dj5so+825Eky50H3er+zdgx4eEnqFzN5aQ/Lp5qu0swXwiPOFGZlFIlMjx0E0SPn3VrDEfV">()
                        + var6.iililliIll
                        + (
                           var8 == null
                              ? llIliilIli<"llIliilIli","qxrBkKBjq8DVmRIrKmHXND/6Wl28Un4+RASmwvYiTEyaQFtbLL5qmGmo">()
                              : llIliilIli<"llIliilIli","njegLpt//dwqgdB72nGpHyYNxCRJW7YDgziuciW/IwC+QQ==">()
                                 + this.lIliliIlil(var8)
                                 + llIliilIli<"llIliilIli","szABM7c6ri2EldO8oDCNah7Tv2qvMVdkgF+8ELxXu9yVt8vRTzWqWBA=">()
                        )
                        + llIliilIli<"llIliilIli","OcnooXKr9uq8B20FnJxrOTyufLFegqM47b5q7LcA7jfoFEbCfJAgz+ZnWRGgN7DbZ2p33D4kExi4ChBGUjnsCQ==">()
                  );
               return true;
            }
         } else {
            JsonObject var7 = new JsonObject();
            var7.addProperty(llIliilIli<"llIliilIli","8A+klwzOyGHmMoKTMAhkMFCsJM3UBF91GfjS8wpudG53">(), y);
            this.iilIiIIiIi(IlIiIlIlllIiIlIl.IillIIIiIl, var6, var7);
            return true;
         }
      }
   }

   private void iilIiIIiIi(IlIiIlIlllIiIlIl j, IiiiIiIlliiiIiIl extra, JsonObject type) {
      JsonObject var4 = type == null ? new JsonObject() : type;
      var4.addProperty(llIliilIli<"llIliilIli","14Q8E+FLbYW/AbAv2sowv5TlRTDHJiQpzgslgs8atg==">(), extra.iililliIll);
      var4.addProperty(llIliilIli<"llIliilIli","x33dzgRN+wbI87etRhOygk9++Wi12ogiV65RrYUhHg==">(), extra.IIlIiliIll);
      this.IiiilIliil.lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(j, this.IiiilIliil.IIlllIlliIll(), var4)));
   }

   private void lilIliilIl(long now) {
      long var12 = -6331755047762528270L;
      long var14 = -5738260567619554427L;
      if (this.iIIIiIliil != null) {
         var12 ^= (0L ^ var12) & -1L << 32;
         var12 ^= (0L ^ var12) & -1L >>> 32;

         for (IiiiIiIlliiiIiIl var6 : this.iIIIiIliil.IIIilIIiiIIi()) {
            llliiiIiilliiiIi var7 = this.lliilIliil.IlIillIiilIi(var6, var6.IIlIiliIll);
            var14 ^= ((long)(var7.IIillIiliIil() + var7.Ililllililil() + var7.Iiilliiliiil()) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)Math.min(var7.lIiiIiIlilli(), var6.IIIIiliIll) ^ var14) & -1L >>> 32;
            if ((int)var14 > var6.IiIIiliIll) {
               var6.liIIiliIll = now;
               if (!this.iIIIiIliil.IliIlllilIi()) {
                  JsonObject var10 = new JsonObject();
                  var10.addProperty(llIliilIli<"llIliilIli","myhkk96shh9BDljjFwfIFyiq4L6E6soo4LlT2rFjya+Qcg==">(), (int)var14);
                  this.iilIiIIiIi(IlIiIlIlllIiIlIl.llilIIIiIl, var6, var10);
               }
            }

            var6.IiIIiliIll = var7.liiiIIllIl() ? (int)var14 : Math.max(var6.IiIIiliIll, (int)var14);
            var12 ^= ((long)((int)var12 + var6.IiIIiliIll) ^ var12) & -1L >>> 32;
            var12 ^= ((long)((int)(var12 >>> 32) + (int)(var14 >>> 32)) << 32 ^ var12) & -1L << 32;
            if (var7.IliIlllilIi()) {
               Long var16 = this.lliliIliil.get(var6.iililliIll);
               if (var16 == null || var16 != var6.IIlIiliIll) {
                  this.lliliIliil.put(var6.iililliIll, var6.IIlIiliIll);
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     this.llIIlilIIl(var6, var7, var7);
                  } else {
                     JsonObject var11 = new JsonObject();
                     var7.IIIllIIliIIl(var11);
                     this.IiiilIliil
                        .lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(IlIiIlIlllIiIlIl.iillIIIiIl, this.IiiilIliil.IIlllIlliIll(), var11)));
                  }
               }
            } else {
               this.lliliIliil.remove(var6.iililliIll);
               if (var6.IilliliilIIi() && var7.liiiIIllIl()) {
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     var6.llIIiliIll = IliilIillliilIil.lIilIllIil;
                     var6.IlIIiliIll = this.IiiilIliil.IIlllIlliIll();
                     var6.IiIIiliIll = (int)var14;
                     var6.liIIiliIll = now;
                  } else {
                     JsonObject var17 = new JsonObject();
                     var7.IIIllIIliIIl(var17);
                     this.IiiilIliil
                        .lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(IlIiIlIlllIiIlIl.iillIIIiIl, this.IiiilIliil.IIlllIlliIll(), var17)));
                  }
               }
            }
         }

         this.liiIiIliil.clear();
         this.iIiliIliil = (int)(var12 >>> 32);
         this.IliliIliil = (int)var12;
      }
   }

   private void IlIillIiilIi() {
      if (this.lllliIliil == null && this.iIIliIliil != null) {
         this.lllliIliil = new iIlIlIilIllIlIil(this.IlIliIliil, this.iIIliIliil, this.llIliIliil);
      }
   }

   public boolean ilIllIiIll() {
      return this.IlIIiIliil == iIlililIllilil.iiiillIliIIIIilIli && !this.ilIIiIliil.isEmpty();
   }

   public boolean IiiIlliiIl() {
      return this.IlIIiIliil == iIlililIllilil.IIiillIlilIiillIli;
   }

   public String iIlllIllll() {
      return this.IlIliIliil;
   }

   private void iIIIlIlIIl(ilIllIiIiIllIi m) {
      String var2 = m.IilliliilIIi(llIliilIli<"llIliilIli","14Q8E+FLbYW/AbAv2sowv5TlRTDHJiQpzgslgs8atg==">());
      if (var2 != null) {
         IiiiIiIlliiiIiIl var3 = this.iIIIiIliil.IIillIiliIil(var2);
         if (var3 != null) {
            if (!m.iIilllIiiIlilllIii.equals(var3.IlIIiliIll)) {
               this.IIiIiIliil++;
            } else {
               long var4 = m.IIIllIIliIIl(llIliilIli<"llIliilIli","x33dzgRN+wbI87etRhOygk9++Wi12ogiV65RrYUhHg==">(), -1L);
               if (var4 != var3.IIlIiliIll) {
                  this.lIiIiIliil++;
               } else {
                  this.llIIlilIIl(var3, this.lliilIliil.IlIillIiilIi(var3, var3.IIlIiliIll), llliiiIiilliiiIi.IlIlllIlilIl(m.iiilllIiiIIIillIii));
               }
            }
         }
      }
   }

   private void Iilililiiili(llIIliIiilIIliIi why, String a) {
      this.IiIilliIil(a);
      this.Illillliilli(why);
      if (this.iIIIiIliil.IliIlllilIi()) {
         this.iIIIiIliil.Iliiillilliiilli = this.iIIIiIliil.Iliiillilliiilli.iIlIlllllill();
         this.IilliIliil = this.iIIIiIliil.Iliiillilliiilli;
         this.liIIiIliil = Math.max(this.liIIiIliil + 1L, this.IiiilIliil.Iiilliiliiil() + 1L);
         this.IiiilIliil.IilliliilIIi(this.iIIIiIliil.Iiiiliiiiiii(), this.liIIiIliil);
      }

      this.IiIIlliIIl();
   }

   public void llIililIil(int z, int x, int y) {
      if (this.iIIIiIliil != null) {
         IiiiIiIlliiiIiIl var4 = this.iIIIiIliil.Ililllililil(z, x, y);
         if (var4 != null) {
            this.liiIiIliil.add(var4.iililliIll);
            this.IIlIiIliil = 0L;
         }
      }
   }

   public boolean iiiIlIIIll() {
      return this.iIIIiIliil != null && this.lIIliIliil != null;
   }

   private static String lIiIiiIiIi(String id) {
      return id == null ? llIliilIli<"llIliilIli","6Q/EBk4TQNYBLoRXwxGmra6LoVhvw6difaSY5T8=">() : id.substring(0, Math.min(6, id.length()));
   }

   private void IIIIllIIIl(ilIllIiIiIllIi m) {
      long var7 = 2597845131154211854L;
      if (this.iIIIiIliil != null && m != null) {
         if (this.Iiiiliiiiiii(m)) {
            switch (m.IIilllIiilIilllIii) {
               case llllIIIiIl:
                  this.IllIllllIl(m);
                  break;
               case iillIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     this.iIIIlIlIIl(m);
                  }
                  break;
               case IIilIIIiIl:
               case lillIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     IiiiIiIlliiiIiIl var11 = this.iIIIiIliil
                        .IIillIiliIil(m.IilliliilIIi(llIliilIli<"llIliilIli","14Q8E+FLbYW/AbAv2sowv5TlRTDHJiQpzgslgs8atg==">()));
                     if (var11 != null
                        && var11.IIIllIIliIIl(
                           m.iIilllIiiIlilllIii, m.IIIllIIliIIl(llIliilIli<"llIliilIli","x33dzgRN+wbI87etRhOygk9++Wi12ogiV65RrYUhHg==">(), -1L)
                        )) {
                        var11.iliIiiliiiii(m.IIilllIiilIilllIii == IlIiIlIlllIiIlIl.IIilIIIiIl ? IliilIillliilIil.llilIllIil : IliilIillliilIil.IIilIllIil);
                        if (m.lIiiIiIlilli(llIliilIli<"llIliilIli","pA8TeunpbvX7Dz70gv6dDJrK/TRFrXz5VbaX6n6O9g==">(), "")
                           .startsWith(llIliilIli<"llIliilIli","Co+xLMRKZMkLHPbEKSXjingrxVtaOintMl7i/YiMebhkTaU=">())) {
                           var11.ilIIiliIll++;
                        }
                     } else if (var11 != null) {
                        this.lIiIiIliil++;
                     }
                  }
                  break;
               case lIilIIIiIl:
                  long var10 = m.IIIllIIliIIl(llIliilIli<"llIliilIli","txs18ccjxX8igRA2pw10PeDtRCwcH523P+Gh/t7c5LI=">(), Long.MIN_VALUE);
                  if (var10 != Long.MIN_VALUE && !m.iIilllIiiIlilllIii.equals(this.IiiilIliil.IIlllIlliIll())) {
                     this.iliIiIliil.put(var10, System.currentTimeMillis() + 4000L);
                  }
                  break;
               case llilIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     IiiiIiIlliiiIiIl var9 = this.iIIIiIliil
                        .IIillIiliIil(m.IilliliilIIi(llIliilIli<"llIliilIli","14Q8E+FLbYW/AbAv2sowv5TlRTDHJiQpzgslgs8atg==">()));
                     var7 ^= ((long)m.iliIiiliiiii(llIliilIli<"llIliilIli","myhkk96shh9BDljjFwfIFyiq4L6E6soo4LlT2rFjya+Qcg==">(), -1) << 32 ^ var7) & -1L << 32;
                     if (var9 != null
                        && (int)(var7 >>> 32) >= 0
                        && var9.IIIllIIliIIl(
                           m.iIilllIiiIlilllIii, m.IIIllIIliIIl(llIliilIli<"llIliilIli","x33dzgRN+wbI87etRhOygk9++Wi12ogiV65RrYUhHg==">(), -1L)
                        )) {
                        if ((int)(var7 >>> 32) > var9.IiIIiliIll) {
                           var9.liIIiliIll = System.currentTimeMillis();
                        }

                        var9.IiIIiliIll = Math.max(var9.IiIIiliIll, Math.min((int)(var7 >>> 32), var9.IIIIiliIll));
                     }
                  }
                  break;
               case IillIIIiIl:
                  if (this.iIIIiIliil.IliIlllilIi()) {
                     IiiiIiIlliiiIiIl var2 = this.iIIIiIliil
                        .IIillIiliIil(m.IilliliilIIi(llIliilIli<"llIliilIli","14Q8E+FLbYW/AbAv2sowv5TlRTDHJiQpzgslgs8atg==">()));
                     IIliIiIilIliIiIi var3 = this.iIIIiIliil.iIlIlllllill(m.iIilllIiiIlilllIii);
                     long var4 = Math.max(10000L, m.IIIllIIliIIl(llIliilIli<"llIliilIli","8A+klwzOyGHmMoKTMAhkMFCsJM3UBF91GfjS8wpudG53">(), 30000L));
                     if (var2 != null && var3 != null && var3.liiilIiIIi) {
                        String var6 = var2.IlIIiliIll;
                        if (iilIIIllIIiIIIll.IIiilIiiiIii(var2, m.iIilllIiiIlilllIii, System.currentTimeMillis(), var4)) {
                           this.lliilIliil
                              .IllIllllIl(
                                 llIliilIli<"llIliilIli","UeaTviWsBZTTGHLu0jbx6ahQealPyN99/L2mukvIYIQemnFO6Jw75fn74SfViReSTMKlj7E=">()
                                    + var2.iililliIll
                                    + llIliilIli<"llIliilIli","RRqs2NMy7Pe1l4DV+s+BKQusGg9tl77PSPY+GboJKES/R3FBtYnP">()
                                    + this.lIliliIlil(m.iIilllIiiIlilllIii)
                                    + llIliilIli<"llIliilIli","uAP97A8pnP1mJataL+TORmQt1Y9/XJ0RBT0vjs4ic4y1k+dgj505mDlzYO/HRt3QgaO0qt8=">()
                                    + (
                                       var6 == null
                                          ? llIliilIli<"llIliilIli","Md5MmuvrkPCHvUsZ4h3Of3N44gJHtTlbvKifwm4PhyRHsJtKwF6Xr8AQIlSOSvgmsQ==">()
                                          : llIliilIli<"llIliilIli","6olR0OYOUOzTgBUex0ccUa6D/cGF39Jb4/W2sxC5">()
                                             + this.lIliliIlil(var6)
                                             + llIliilIli<"llIliilIli","L6g3YB7Z5I7NtqVOs1zPF1q0XvEegbjWnkL2JREpBLIhr3W4VKnnwjqHuiE=">()
                                    )
                              );
                        }
                     }
                  }
               case iIilIIIiIl:
               case IlilIIIiIl:
               case ililIIIiIl:
               case IlllIIIiIl:
               case IiilIIIiIl:
               case illlIIIiIl:
               case IIllIIIiIl:
               case lIllIIIiIl:
               case iIllIIIiIl:
               case liilIIIiIl:
            }
         }
      }
   }

   public String liIlliiIll() {
      return this.iiIliIliil;
   }

   private void IIlilIliiIli(llIIliIiilIIliIi offered) {
      long var4 = 4894009204977122906L;
      IiiiIIlliiiIIl var2 = IliIIilllliIIill.IliIlllilIi(
         this.lIIliIliil,
         this.lliilIliil.Ililllililil(),
         offered,
         this.lliilIliil.IIiilIiiiIii(),
         this.IiIliIliil,
         this.IiiilIliil.IIlllIlliIll().equals(this.IlIliIliil)
      );
      switch (var2.iIlIlllllill()) {
         case IIilIlIllIilIlIl:
            if (this.liIliIliil == null) {
               this.lliilIliil
                  .IllIllllIl(llIliilIli<"llIliilIli","JVUThKsVcT9aCSuNfa4E2nHtS1FC2oHOEPRyjuYqk9uNnLgecGzvBBfCP9OoO1PvfQ==">() + var2.lIiiIiIlilli());
            }

            this.liIliIliil = IliIIilllliIIill.liiiIIllIl(offered.IlIlllIlilIl());
            this.llIIiIliil = var2.lIiiIiIlilli();
            break;
         case iIilIlIlIlilIlIl:
            this.llIIiIliil = var2.lIiiIiIlilli();
            break;
         case lillIlIliillIlIl:
            if (this.iIIIiIliil == null) {
               this.Illillliilli(offered);
            }
            break;
         case IlllIlIlllllIlIl:
         case illlIlIlIillIlIl:
            this.liIliIliil = null;
            var4 ^= ((long)(this.lliilIliil.Ililllililil() != null && this.lliilIliil.Ililllililil().liiiIIllIl(offered) ? 0 : 1) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != 0 && !this.lliilIliil.Iiilliiliiil(offered)) {
               this.llIIiIliil = llIliilIli<"llIliilIli","mEXVALBk/TlsjvZpUhtE1xz0K9U++AZs3/dQCef74TVrYBr+J+S+yiMPg9dWvUVM7mdsEEwjkSJRFNRySpxXUSJ5Ih7IuQqaMTOe01HlYOwa">();
               return;
            }

            if (!var2.lIiiIiIlilli().isEmpty()) {
               this.lliilIliil
                  .IllIllllIl(llIliilIli<"llIliilIli","NmFEqmhGdoGLLi0DMkyCJjXQTwpvstCGfdtXbpLRnvxgxnpRNWxMDcXGxpOqcz2yNw==">() + var2.lIiiIiIlilli());
            }

            if (this.iIIIiIliil == null) {
               this.Illillliilli(offered);
            } else {
               this.Iilililiiili(offered, llIliilIli<"llIliilIli","HlTd2dDeEddDLqprab+rD2ufwaD9a2SY0+dF+/EA03WcA4IjGgDqBoVqWFgg/MOWiD27Kw==">());
            }
      }
   }

   private void IIIilIIiiIIi() {
      long var3 = -1289369142610155182L;
      var3 ^= ((long)(!this.iIlliIliil.isEmpty() && this.iIlliIliil.equals(this.IiiilIliil.IIlllIlliIll()) ? 1 : 0) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 0) {
         this.IlIillIiilIi();
         iIlIlIilIllIlIil var2 = liiiIiiiiiiIii.liiiIIllIl(this.ilIliIliil.values());
         if (var2 == null && this.lllliIliil == null) {
            return;
         }

         if (liiiIiiiiiiIii.IliIlllilIi(this.lllliIliil, var2)) {
            this.lllliIliil = var2;
         }

         if (this.lllliIliil == null) {
            return;
         }

         this.iIIliIliil = this.lllliIliil.iIlIlllllill();
         this.IlIliIliil = this.lllliIliil.liiiIIllIl();
         this.llIliIliil = this.lllliIliil.IilliliilIIi();
      }

      if (this.iIIliIliil == null) {
         this.llIIiIliil = llIliilIli<"llIliilIli","GBBAlmk/4xAJ1dwe/jLYavle4M2M0+fSqtvExW57szfRx1YwcvvX2cXneTgp6TgR3bZcWd6/F4yutZjd">();
      } else {
         this.IIlilIliiIli(this.iIIliIliil);
      }
   }

   private void Ililllililil(long now) {
      long var6 = 2514987928637813813L;
      if (!this.IiiilIliil.Ililllililil()) {
         var6 ^= (
               (long)(
                        this.lllIiIliil
                              && this.iIIliIliil != null
                              && (this.lIIliIliil == null || this.lIIliIliil.liiiIIllIl(this.iIIliIliil))
                              && !this.lIlIliIlIl()
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var6
            )
            & -1L << 32;
         if ((int)(var6 >>> 32) != 0) {
            if (!this.lllIiIliil || now - this.lilliIliil >= 5000L) {
               this.lllIiIliil = true;
               this.lilliIliil = now;
               JsonObject var4 = this.lliilIliil.IiIiliIiiiIi().iliIiiliiiii();
               llIIliIiilIIliIi var5 = this.lliilIliil.Ililllililil();
               if (var5 != null && var5.IliIlllilIi()) {
                  var4.add(llIliilIli<"llIliilIli","E02EeZB93esWFW9cYfNSEtHeKJy2MqaLhQUNrxHhWzJe7g==">(), var5.IilliliilIIi());
                  var4.addProperty(llIliilIli<"llIliilIli","SukdDZg0axJjGNeV93yAaKwb+btsEt3w8RM/joVmme1gktGvM6E=">(), this.iliilIliil);
                  var4.addProperty(
                     llIliilIli<"llIliilIli","F0o5EdR6E9QJGhn0zh2JfHDYGdQNt76X/Ctf3SYQ6PgwZQk=">(),
                     this.lIIliIliil == null ? "" : this.lIIliIliil.iIlIlllllill()
                  );
                  this.ilIliIliil.put(this.IiiilIliil.IIlllIlliIll(), new iIlIlIilIllIlIil(this.IiiilIliil.IIlllIlliIll(), var5, this.iliilIliil));
               }

               this.IiiilIliil.lIiiIiIlilli(this.IilIililIi(ilIllIiIiIllIi.IliIlllilIi(IlIiIlIlllIiIlIl.llllIIIiIl, this.IiiilIliil.IIlllIlliIll(), var4)));
            }
         }
      }
   }

   public boolean lliIliliIl() {
      return this.IlIIiIliil == iIlililIllilil.lliillIliiliillIli && this.iIIIiIliil != null && this.lIIliIliil != null;
   }

   private void IllIllllIl(ilIllIiIiIllIi m) {
      if (m.iIilllIiiIlilllIii != null && !m.iIilllIiiIlilllIii.equals(this.IiiilIliil.IIlllIlliIll())) {
         iIIllIlIlIllIl var2 = iIIllIlIlIllIl.IIIllIIliIIl(m.iiilllIiiIIIillIii);
         iIIllIlIlIllIl var3 = this.lliilIliil.IiIiliIiiiIi();
         liiiiilliiiiiill var4 = var3.IliIlllilIi(var2);
         IIliIiIilIliIiIi var5 = this.iIIIiIliil.iIlIlllllill(m.iIilllIiiIlilllIii);
         if (var5 != null) {
            var5.iiiilIiIIi = var4;
         }

         this.IIiliIliil.put(m.iIilllIiiIlilllIii, var4);
         if (var4 == liiiiilliiiiiill.IiillIIIil) {
            this.IIillIiliIil(m);
         } else {
            if (this.lIiliIliil.add(m.iIilllIiiIlilllIii)) {
               this.lliIiIliil++;
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","a5jDVL8mT5R5T35ZilA8kBnf1rjOQ4+mAM4f91kvNB9YCQTn7bc/qy6JIXd5Zy1Xhg==">()
                        + this.lIliliIlil(m.iIilllIiiIlilllIii)
                        + llIliilIli<"llIliilIli","uiKlfuevGu3JoLZ9WZ42aYy3nBVIHLXAAgv0GnhPVMHI72+JJGdjO3HGgT2yM7Ijb0f64jeIFNikRwUirYspmGVYFg0kmKSPhwjfE3xgII3KzuMJtxr1mA==">()
                  );
               this.lliilIliil
                  .IllIllllIl(
                     llIliilIli<"llIliilIli","h6OvRkeToyKC8hx094Rta+nRf4xLv9wMm3XAmPefHA==">()
                        + var3.IilliliilIIi(var2, var4)
                           .replace(
                              llIliilIli<"llIliilIli","Q6GVP6LzAY0mbYo9lZhdaBrGf7hHQ6lh3HJYqYo=">(),
                              llIliilIli<"llIliilIli","7oSp4Oypj1bMIs7rrrP4tknXqsYl3bv+IzGTwJpr7kE=">()
                           )
                  );
            }
         }
      }
   }

   public boolean lllllillll() {
      return this.llIliIliil;
   }

   public boolean IlIllllIll() {
      return this.IlIIiIliil == iIlililIllilil.iiiillIliIIIIilIli
         || this.IlIIiIliil == iIlililIllilil.IiiillIliliiillIli
         || this.IiiilIliil.IIIllIIliIIl() == IiiIiIilliiIiIil.IiIIIilIil
         || this.IiiilIliil.IIIllIIliIIl() == IiiIiIilliiIiIil.ilIIIilIil;
   }

   private void lllIiillIi(String reason) {
      if (this.IlIIiIliil != iIlililIllilil.iiiillIliIIIIilIli) {
         this.IlIIiIliil = iIlililIllilil.iiiillIliIIIIilIli;
         this.ilIIiIliil = reason == null ? llIliilIli<"llIliilIli","pAdAaB/L0YGYYbpr4oU2GbdM7CKSRzgX0xDoOyUKJb47">() : reason;
         this.llIIiIliil = llIliilIli<"llIliilIli","FcJwPkR19Xw2OHL0KFTnDWySVvV/vPHJQgeMxYob1cpLIwY=">() + this.ilIIiIliil;
         this.lliilIliil
            .IllIllllIl(llIliilIli<"llIliilIli","2asU6Kz9MVfQgaI99AZcFhp6G6QoatZciWbihSvszOSY0KPV6FO3reUwB9ptgavfQDFLvW2SEKhV6RZD9LB83Q==">() + this.ilIIiIliil);
      }

      try {
         this.IiiilIliil.liiiIIllIl();
      } catch (Exception var3) {
      }
   }

   private void illIlIilIl(long now) {
      long var6 = 8488104883475588845L;
      long var8 = 8241616178867482028L;
      this.IiIiliIiiiIi();
      var6 ^= ((long)iilIIIllIIiIIIll.IIIllIIliIIl(this.iIIIiIliil, now) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)iilIIIllIIiIIIll.IlIlllIlilIl(this.iIIIiIliil, now) ^ var6) & -1L >>> 32;
      if ((int)var6 > 0) {
         this.lliilIliil
            .IllIllllIl(
               llIliilIli<"llIliilIli","Z6uYaLKGvA/XKLM02LS7hTI04t9fODRpr0RjXdP+N7GUtd4IJC32lNDY7rN4wUeasAREn9phFXnB">()
                  + (int)var6
                  + llIliilIli<"llIliilIli","iwcppRmVbfCMhawHHehIor1cGSMimi9SyndZLlkWaQTCkT4Zy3pmCuQ/b9re89QBIYyyeRV1SEDZmffv">()
            );
      }

      var8 ^= ((long)iilIIIllIIiIIIll.IiIlliIliiIl(this.iIIIiIliil, now, this.lliilIliil.IIIIllIIIl()) << 32 ^ var8) & -1L << 32;
      this.liIIiIliil = Math.max(this.liIIiIliil + 1L, this.IiiilIliil.Iiilliiliiil() + 1L);
      this.IiiilIliil.IilliliilIIi(this.iIIIiIliil.Iiiiliiiiiii(), this.liIIiIliil);
   }

   private void IiIIlliIIl() {
      this.lliliIliil.clear();
      this.lllIiIliil = false;
   }

   public boolean illilIilil() {
      return this.iIIIiIliil != null && this.iIIIiIliil.IIiilIiiiIii();
   }

   public boolean iIIilIlIil(int y, int x, int z) {
      if (this.iIIIiIliil == null || this.lIIliIliil == null) {
         return false;
      } else if (!this.iIIIiIliil.Illlllllilll()) {
         return true;
      } else {
         Long var4 = IliIilliIi(y, x, z);
         Long var5 = this.iliIiIliil.get(var4);
         return var5 != null && var5 > System.currentTimeMillis() ? false : this.iIIIiIliil.Iiilliiliiil(y, x, z);
      }
   }

   public String lliililiil() {
      return this.IiiilIliil.IIlllIlliIll();
   }

   public String ilillIiill() {
      return this.llIIiIliil;
   }

   private void Illlllllilll(JsonArray hostId, String members) {
      if (members != null && !members.isEmpty()) {
         this.iIlliIliil = members;
      }

      if (hostId != null) {
         HashSet var3 = new HashSet();

         for (JsonElement var5 : hostId) {
            if (var5.isJsonObject()) {
               IIliIiIilIliIiIi var6 = IIliIiIilIliIiIi.iIlIlllllill(var5.getAsJsonObject());
               if (var6 != null) {
                  var3.add(var6.lIiilIiIIi);
                  this.IllliIliil.put(var6.lIiilIiIIi, var6.liiiIIllIl());
               }
            }
         }

         if (!var3.isEmpty()) {
            this.ilIliIliil.keySet().removeIf(id -> !var3.contains(id));
            this.IiIIiIliil = true;
         }
      }
   }

   public Set<Long> IIiillIiil() {
      return this.IiiIiIliil;
   }

   private String lIliliIlil(String memberId) {
      if (memberId == null) {
         return llIliilIli<"llIliilIli","6Q/EBk4TQNYBLoRXwxGmra6LoVhvw6difaSY5T8=">();
      } else if (memberId.equals(this.IiiilIliil.IIlllIlliIll())) {
         return llIliilIli<"llIliilIli","aopMYETDPxarBKMOOQVkfrIhvFvOxABVXfLOQkxm">();
      } else {
         IIliIiIilIliIiIi var2 = this.iIIIiIliil != null ? this.iIIIiIliil.iIlIlllllill(memberId) : null;
         return var2 != null && var2.iIiilIiIIi != null && !var2.iIiilIiIIi.isEmpty() ? var2.iIiilIiIIi : memberId.substring(0, Math.min(6, memberId.length()));
      }
   }

   private void iIlIiIllIi(String reason) {
      if (this.IlIIiIliil != iIlililIllilil.IiiillIliliiillIli) {
         this.IlIIiIliil = iIlililIllilil.IiiillIliliiillIli;
         this.ilIIiIliil = reason;
         this.llIIiIliil = llIliilIli<"llIliilIli","0OBhr1svplSmGqvQ0JyVWOvKSNWApNb2I5XxT4pqdIjrJZNY">() + reason;
         this.lliilIliil
            .IllIllllIl(
               llIliilIli<"llIliilIli","2xLJW42PBtaf4/EOyDFs+ryzrF2gncmp9RGa/Mfblp5yUrYXZzInm2V+sParCZ2SZZd8l09y6PTkrc8FO8s7cA==">()
                  + reason
                  + llIliilIli<"llIliilIli","9ylup9sCN2oub6FJV33W1/X8+BIdHWpwggKkhMs=">()
            );
      }
   }

   public String IIllllIlll() {
      return this.liIliIliil;
   }

   public boolean iilllIIill() {
      if (this.iIIIiIliil != null && this.lIIliIliil != null) {
         llIIliIiilIIliIi var1 = this.lliilIliil.Ililllililil();
         return var1 != null && var1.IliIlllilIi() && !var1.liiiIIllIl(this.lIIliIliil);
      } else {
         return false;
      }
   }

   public llIIliIiilIIliIi lIIlliIIll() {
      return this.lIIliIliil;
   }

   public int IlIIillIIi() {
      return this.iIiIiIliil;
   }

   public IIIIliilIIIlii liiiIIllIl() {
      return this.iiiIiIliil;
   }
}
