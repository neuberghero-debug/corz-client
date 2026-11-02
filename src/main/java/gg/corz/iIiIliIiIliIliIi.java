package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class iIiIliIiIliIliIi {
   private JsonObject llIilliIIi;
   private volatile long iIillliIIi;
   private static final int IIlllliIIi = 64;
   private long liIilliIIi;
   private volatile IiiIiIilliiIiIil lllllliIIi = IiiIiIilliiIiIil.iIIIIilIil;
   private volatile long iIlilliIIi;
   private volatile String ilillliIIi;
   private volatile String lIillliIIi;
   private volatile long lIIilliIIi;
   private volatile Thread iIlllliIIi;
   private volatile boolean IilllliIIi;
   private volatile long IIIilliIIi;
   private final ConcurrentLinkedQueue<ilIllIiIiIllIi> lllilliIIi;
   private volatile String IlillliIIi;
   private static final long iiIllliIIi = 3000L;
   private volatile JsonObject liillliIIi;
   private JsonArray IlIilliIIi;
   private volatile String IiillliIIi;
   private volatile JsonObject iiillliIIi;
   private long iiIilliIIi;
   private final Object iIIilliIIi;
   private volatile String illllliIIi = "";
   private final IIiliIlllIiliIll lIlllliIIi;
   private long IiIilliIIi;
   private volatile boolean IIlilliIIi;
   private volatile String iilllliIIi;
   private volatile int lIlilliIIi;
   private volatile String lilllliIIi;
   private long ilIilliIIi;
   private volatile boolean IllllliIIi;
   private volatile String llillliIIi;
   private final ConcurrentLinkedQueue<ilIllIiIiIllIi> IllilliIIi;
   private volatile String IIillliIIi;
   private static final long liIllliIIi = 900L;

   public long Iiilliiliiil() {
      return Math.max(0L, this.iIlilliIIi);
   }

   public boolean Ililllililil() {
      return this.IIlilliIIi;
   }

   private void IiIiliIiiiIi() {
      long var17 = -1257947695421203050L;
      long var15 = -756025025599294005L;
      ArrayList var1 = new ArrayList();

      ilIllIiIiIllIi var2;
      while (var1.size() < 64 && (var2 = this.lllilliIIi.poll()) != null) {
         var1.add(var2);
      }

      JsonArray var3 = new JsonArray();

      for (ilIllIiIiIllIi var5 : var1) {
         var3.add(var5.liiiIIllIl());
      }

      var15 ^= ((long)(this.iilllliIIi != null && this.iilllliIIi.equals(this.IIillliIIi) ? 1 : 0) << 32 ^ var15) & -1L << 32;
      JsonObject var20 = (int)(var15 >>> 32) != 0 ? this.iiillliIIi : null;
      iIIlIiIlIlIi var6 = this.lIlllliIIi
         .liiiIIllIl(this.lilllliIIi, this.iilllliIIi, this.liillliIIi, var3, this.liIilliIIi, var20, this.IIIilliIIi, this.lIIilliIIi);
      if (!var6.iiiliiiiIIIiiiii) {
         for (ilIllIiIiIllIi var8 : var1) {
            this.lllilliIIi.offer(var8);
         }

         if (!Illillliilli<"Illillliilli","Ccx14I8F6qe+EU5bwlGIcF1fIblQMNF+CnAYFtrc3FKi64xrVw==">().equals(var6.IlIiiiiillIiiiii)
            && !Illillliilli<"Illillliilli","iE3Hq89s41//hNLvKZEWOoOPBpJ9tm61nDGclbVzzSVx+g==">().equals(var6.IlIiiiiillIiiiii)) {
            this.IilllliIIi = true;
            this.illllliIIi = var6.IlIiiiiillIiiiii;
         } else {
            this.lllllliIIi = IiiIiIilliiIiIil.ilIIIilIil;
         }
      } else {
         this.IilllliIIi = false;
         this.illllliIIi = "";
         ilIillIiIiIillIi var7 = (ilIillIiIiIillIi)var6.lIIiiiiiiIIiiiii;
         if (var7.lIiIIIlIIi) {
            this.lllllliIIi = IiiIiIilliiIiIil.ilIIIilIil;
         } else {
            this.IIillliIIi = var7.iilIIIlIIi != null ? var7.iilIIIlIIi : this.IIillliIIi;
            this.lIillliIIi = var7.IIiIIIlIIi != null ? var7.IIiIIIlIIi : this.lIillliIIi;
            this.iIillliIIi = var7.iIiIIIlIIi;
            var15 ^= ((long)this.IIlilliIIi ^ var15) & -1L >>> 32;
            if ((int)var15 != 0) {
               this.IIlilliIIi = false;
               long var9 = var7.lliIIIlIIi != null && var7.lliIIIlIIi.has(Illillliilli<"Illillliilli","CaYcj+gwEvr8ixb3TXmoQHuwlaANvCe/sf3KOFPkTHoQ9+s=">())
                  ? var7.lliIIIlIIi.get(Illillliilli<"Illillliilli","CaYcj+gwEvr8ixb3TXmoQHuwlaANvCe/sf3KOFPkTHoQ9+s=">()).getAsLong()
                  : 0L;
               this.iIlilliIIi = var9;
               var17 ^= (0L ^ var17) & -1L << 32;
               if (var7.iliIIIlIIi != null) {
                  for (JsonElement var13 : var7.iliIIIlIIi) {
                     if (var13.isJsonObject()) {
                        var17 += 4294967296L;
                     }
                  }
               }

               this.lIlilliIIi = (int)(var17 >>> 32);
            }

            synchronized (this.iIIilliIIi) {
               if (var7.IliIIIlIIi != null) {
                  this.IlIilliIIi = var7.IliIIIlIIi;
               }

               if (var7.lliIIIlIIi != null && var7.lliIIIlIIi.has(Illillliilli<"Illillliilli","CaYcj+gwEvr8ixb3TXmoQHuwlaANvCe/sf3KOFPkTHoQ9+s=">())) {
                  long var10 = var7.lliIIIlIIi.get(Illillliilli<"Illillliilli","CaYcj+gwEvr8ixb3TXmoQHuwlaANvCe/sf3KOFPkTHoQ9+s=">()).getAsLong();
                  if (var10 > this.ilIilliIIi && var10 > this.iIlilliIIi) {
                     this.llIilliIIi = var7.lliIIIlIIi;
                     this.ilIilliIIi = var10;
                  }
               }

               this.iiIilliIIi = Math.max(this.iiIilliIIi, var7.IiiIIIlIIi);
            }

            if ((int)var15 != 0) {
               this.liIilliIIi = Math.max(this.liIilliIIi, var7.IiiIIIlIIi);
            } else if (var7.iliIIIlIIi != null) {
               long var23 = this.liIilliIIi;

               for (JsonElement var24 : var7.iliIIIlIIi) {
                  if (var24.isJsonObject()) {
                     ilIllIiIiIllIi var25 = ilIllIiIiIllIi.iIlIlllllill(var24.getAsJsonObject());
                     if (var25 != null && (var25.llilllIiiililllIii < 0L || var25.llilllIiiililllIii > this.liIilliIIi)) {
                        if (this.iilllliIIi != null && this.iilllliIIi.equals(var25.iIilllIiiIlilllIii)) {
                           var23 = Math.max(var23, var25.llilllIiiililllIii);
                        } else {
                           this.IllilliIIi.offer(var25);
                           if (var25.llilllIiiililllIii > var23) {
                              var23 = var25.llilllIiiililllIii;
                           }
                        }
                     }
                  }
               }

               this.liIilliIIi = Math.max(this.liIilliIIi, Math.max(var23, var7.IiiIIIlIIi));
            }
         }
      }
   }

   public void lIiiIiIlilli(ilIllIiIiIllIi m) {
      if (m != null) {
         this.lllilliIIi.offer(m);
      }
   }

   public iIiIliIiIliIliIi(IIiliIlllIiliIll transport) {
      this.liillliIIi = new JsonObject();
      this.iIIilliIIi = new Object();
      this.IlIilliIIi = new JsonArray();
      this.ilIilliIIi = -1L;
      this.IiIilliIIi = -1L;
      this.iIlilliIIi = -1L;
      this.IllilliIIi = new ConcurrentLinkedQueue<>();
      this.lllilliIIi = new ConcurrentLinkedQueue<>();
      this.lIlllliIIi = transport;
   }

   public void liiiIIllIl() {
      this.IllllliIIi = false;
      Thread var1 = this.iIlllliIIi;
      if (var1 != null) {
         var1.interrupt();
      }

      this.iIlllliIIi = null;
      String var2 = this.lilllliIIi;
      String var3 = this.iilllliIIi;
      if (var2 != null && var3 != null) {
         Thread var4 = new Thread(() -> {
            try {
               this.lIlllliIIi.iIlIlllllill(var2, var3);
            } catch (Exception var4x) {
            }
         }, Illillliilli<"Illillliilli","K68B+Gyk1Z0m26qWFDJWFTii0qImd5c7aPY2f8XtA8qb8c/Rex3drz0lHWo=">());
         var4.setDaemon(true);
         var4.start();
      }

      this.lllllliIIi = IiiIiIilliiIiIil.iIIIIilIil;
   }

   public String Illlllllilll() {
      return this.IIillliIIi;
   }

   public void iliIiiliiiii(iiiIIilIIIlIil c) {
      JsonObject var3 = null;
      long var4 = -1L;
      JsonArray var2;
      synchronized (this.iIIilliIIi) {
         var2 = this.IlIilliIIi;
         if (this.llIilliIIi != null && this.ilIilliIIi > this.IiIilliIIi) {
            var3 = this.llIilliIIi;
            var4 = this.ilIilliIIi;
            this.IiIilliIIi = this.ilIilliIIi;
            this.lIIilliIIi = this.ilIilliIIi;
         }
      }

      if (var2 != null) {
         c.IliIlllilIi(var2, this.IIillliIIi, this.iIillliIIi);
      }

      if (var3 != null
         && var3.has(Illillliilli<"Illillliilli","g4uOzbUQ2/tQobtybttLazWWTxwW40VURL8xbwOgwg==">())
         && var3.get(Illillliilli<"Illillliilli","g4uOzbUQ2/tQobtybttLazWWTxwW40VURL8xbwOgwg==">()).isJsonObject()) {
         c.liiiIIllIl(var4, var3.getAsJsonObject(Illillliilli<"Illillliilli","g4uOzbUQ2/tQobtybttLazWWTxwW40VURL8xbwOgwg==">()));
      }

      ilIllIiIiIllIi var9;
      while ((var9 = this.IllilliIIi.poll()) != null) {
         c.iIlIlllllill(var9);
      }
   }

   public void IilliliilIIi(JsonObject doc, long version) {
      this.iiillliIIi = doc;
      this.IIIilliIIi = version;
   }

   public IiiIiIilliiIiIil IIIllIIliIIl() {
      return this.lllllliIIi;
   }

   private void IIIilIIiiIIi() {
      while (this.IllllliIIi) {
         try {
            switch (this.lllllliIIi) {
               case llIIIilIil:
                  this.IlIillIiilIi();
                  break;
               case ilIIIilIil:
                  this.IiIiliIiiiIi();
                  break;
               default:
                  return;
            }
         } catch (Exception var3) {
            this.illllliIIi = Illillliilli<"Illillliilli","POr4d6CY7at4cEctWg3ToigZc5UaOOZZ7P1Z+tRDMYb6ZKbcPJc=">();
         }

         try {
            Thread.sleep(this.IilllliIIi ? 3000L : 900L);
         } catch (InterruptedException var2) {
            return;
         }
      }
   }

   public String Iilllilliill() {
      return this.lIillliIIi;
   }

   private void IlIillIiilIi() {
      iIIlIiIlIlIi var1 = this.lIlllliIIi.IliIlllilIi(this.IlillliIIi, this.llillliIIi, this.ilillliIIi, this.IiillliIIi);
      if (!var1.iiiliiiiIIIiiiii) {
         this.IilllliIIi = Illillliilli<"Illillliilli","1UM3s+nlmFwYG7BrYM58vT7blCJXZ5QNi/ELEJIMkEnLsYM=">().equals(var1.IlIiiiiillIiiiii);
         this.illllliIIi = var1.IlIiiiiillIiiiii;
         if (!this.IilllliIIi) {
            this.lllllliIIi = IiiIiIilliiIiIil.IiIIIilIil;
         }
      } else {
         iiIilllIIlilll var2 = (iiIilllIIlilll)var1.lIIiiiiiiIIiiiii;
         this.lilllliIIi = var2.lIIIllIIiiIIIllIIi;
         this.iilllliIIi = var2.IlIIllIIillIIllIIi;
         this.IIillliIIi = var2.ilIIllIIiIiIIllIIi;
         this.lIillliIIi = var2.liIIllIIiiiIIllIIi;
         this.IilllliIIi = false;
         this.illllliIIi = "";
         this.lllllliIIi = IiiIiIilliiIiIil.llIIIilIil;
      }
   }

   public String IIlllIlliIll() {
      return this.iilllliIIi;
   }

   public String IiIlliIliiIl() {
      return this.illllliIIi;
   }

   public void iIlIlllllill(JsonObject s) {
      if (s != null) {
         this.liillliIIi = s;
      }
   }

   public void IliIlllilIi(String uuid, String roomId, String buildHash, String displayName) {
      this.liiiIIllIl();
      this.IlillliIIi = uuid;
      this.llillliIIi = roomId;
      this.ilillliIIi = buildHash;
      this.IiillliIIi = displayName;
      this.lilllliIIi = null;
      this.iilllliIIi = null;
      this.IIillliIIi = null;
      this.lIillliIIi = null;
      this.illllliIIi = "";
      this.IilllliIIi = false;
      this.iiillliIIi = null;
      this.IIIilliIIi = 0L;
      this.lIIilliIIi = 0L;
      synchronized (this.iIIilliIIi) {
         this.IlIilliIIi = new JsonArray();
         this.llIilliIIi = null;
         this.ilIilliIIi = -1L;
         this.IiIilliIIi = -1L;
         this.liIilliIIi = 0L;
         this.iiIilliIIi = 0L;
         this.IIlilliIIi = true;
         this.lIlilliIIi = 0;
         this.iIlilliIIi = -1L;
         this.IllilliIIi.clear();
         this.lllilliIIi.clear();
      }

      this.lllllliIIi = IiiIiIilliiIiIil.IlIIIilIil;
      this.IllllliIIi = true;
      Thread var8 = new Thread(this::IIIilIIiiIIi, Illillliilli<"Illillliilli","U3+toWCmeMwBmJRmkT9XurCiBuQ24QySAnliWc6ppBJ8/1DFsKtMmApx">());
      var8.setDaemon(true);
      this.iIlllliIIi = var8;
      var8.start();
   }

   public int IIillIiliIil() {
      return this.lIlilliIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.IilllliIIi;
   }
}
