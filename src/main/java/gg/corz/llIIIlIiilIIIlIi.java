package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class llIIIlIiilIIIlIi {
   public static final int liIIiiiiil = 64;
   public static final int iiIIiiiiil = 24;
   private String lIlIiiiiil;
   private final List<illiiIIlIiliiIIl> IIlIiiiiil = new ArrayList<>();
   private boolean iIlIiiiiil;

   public synchronized String IlIillIiilIi() {
      return String.format(
         Locale.ROOT,
         IiIiliIiiiIi<"IiIiliIiiiIi","r0vP6BJ+4Bbzhh3jXIJRYWPYKN1bqayGOvuEFw2V/HdR0OOh+W9s0ggOu4zGw/mHGDn4eLNyl1/RMFDuozYM">(),
         this.IIlIiiiiil.size(),
         this.lIlIiiiiil,
         this.iIlIiiiiil
      );
   }

   public synchronized int liiiIIllIl() {
      return this.IIlIiiiiil.size();
   }

   public synchronized boolean Illlllllilll(String from, String to) {
      String var3 = IiIlliIliiIl(to);
      if (var3.isEmpty()) {
         return false;
      } else {
         illiiIIlIiliiIIl var4 = this.iliIiiliiiii(from);
         if (var4 == null) {
            return false;
         } else if (!var3.equalsIgnoreCase(from) && this.iliIiiliiiii(var3) != null) {
            return false;
         } else {
            this.IIlIiiiiil.set(this.IIlIiiiiil.indexOf(var4), new illiiIIlIiliiIIl(var3, var4.iIlIlllllill()));
            if (from.equalsIgnoreCase(this.lIlIiiiiil)) {
               this.lIlIiiiiil = var3;
            }

            return true;
         }
      }
   }

   public synchronized boolean IIillIiliIil(String name) {
      if (name == null) {
         this.lIlIiiiiil = null;
         return true;
      } else {
         illiiIIlIiliiIIl var2 = this.iliIiiliiiii(name);
         if (var2 == null) {
            return false;
         } else {
            this.lIlIiiiiil = var2.liiiIIllIl();
            return true;
         }
      }
   }

   public synchronized List<illiiIIlIiliiIIl> IliIlllilIi() {
      return Collections.unmodifiableList(new ArrayList<>(this.IIlIiiiiil));
   }

   public synchronized boolean IIlllIlliIll(String name, int mask) {
      long var6 = -520524222407270621L;
      String var3 = IiIlliIliiIl(name);
      if (var3.isEmpty()) {
         return false;
      } else {
         var6 ^= ((long)(mask & 511) << 32 ^ var6) & -1L << 32;

         for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < this.IIlIiiiiil.size(); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            if (this.IIlIiiiiil.get((int)var6).liiiIIllIl().equalsIgnoreCase(var3)) {
               this.IIlIiiiiil.set((int)var6, new illiiIIlIiliiIIl(var3, (int)(var6 >>> 32)));
               return true;
            }
         }

         if (this.IIlIiiiiil.size() >= 64) {
            return false;
         } else {
            this.IIlIiiiiil.add(new illiiIIlIiliiIIl(var3, (int)(var6 >>> 32)));
            if (this.lIlIiiiiil == null) {
               this.lIlIiiiiil = var3;
            }

            return true;
         }
      }
   }

   public synchronized illiiIIlIiliiIIl IIIllIIliIIl() {
      return this.iliIiiliiiii(this.lIlIiiiiil);
   }

   public static String IiIlliIliiIl(String name) {
      if (name == null) {
         return "";
      } else {
         String var1 = name.strip()
            .replaceAll(
               IiIiliIiiiIi<"IiIiliIiiiIi","8lkEMTGCyLhIMNSLp/rikAksmKvRgYaQ7PvAyZ/kgDyjMmDa">(),
               IiIiliIiiiIi<"IiIiliIiiiIi","w1R4DXLIEmgq0+4pH3yBB0077OZMKacdojUoDAc=">()
            );
         return var1.length() > 24 ? var1.substring(0, 24) : var1;
      }
   }

   public synchronized illiiIIlIiliiIIl iliIiiliiiii(String name) {
      if (name == null) {
         return null;
      } else {
         for (illiiIIlIiliiIIl var3 : this.IIlIiiiiil) {
            if (var3.liiiIIllIl().equalsIgnoreCase(name)) {
               return var3;
            }
         }

         return null;
      }
   }

   public synchronized void IIIilIIiiIIi(JsonElement el) {
      long var8 = 2292810964899340787L;
      this.IIlIiiiiil.clear();
      this.lIlIiiiiil = null;
      this.iIlIiiiiil = false;
      if (el != null && el.isJsonObject()) {
         JsonObject var2 = el.getAsJsonObject();
         if (var2.has(IiIiliIiiiIi<"IiIiliIiiiIi","3QIYf0PqxYjTGcfiL+K6l4MO9KFITUNHRT/Mkh1QAb3aDQw=">())
            && var2.get(IiIiliIiiiIi<"IiIiliIiiiIi","3QIYf0PqxYjTGcfiL+K6l4MO9KFITUNHRT/Mkh1QAb3aDQw=">()).isJsonArray()) {
            for (JsonElement var4 : var2.getAsJsonArray(IiIiliIiiiIi<"IiIiliIiiiIi","3QIYf0PqxYjTGcfiL+K6l4MO9KFITUNHRT/Mkh1QAb3aDQw=">())) {
               if (var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();
                  String var6 = var5.has(IiIiliIiiiIi<"IiIiliIiiiIi","nXMjm74OPyvIrMM2ODSOHeXw/MqGnjG7skcQ8FOFNPo=">())
                     ? IiIlliIliiIl(var5.get(IiIiliIiiiIi<"IiIiliIiiiIi","nXMjm74OPyvIrMM2ODSOHeXw/MqGnjG7skcQ8FOFNPo=">()).getAsString())
                     : "";
                  var8 ^= (
                        (long)(
                                 var5.has(IiIiliIiiiIi<"IiIiliIiiiIi","tAWKXSm4bCPv/AaxqsQJiZsb9ctNYjLBIlmlGK2KEz0=">())
                                    ? var5.get(IiIiliIiiiIi<"IiIiliIiiiIi","tAWKXSm4bCPv/AaxqsQJiZsb9ctNYjLBIlmlGK2KEz0=">()).getAsInt() & 511
                                    : 0
                              )
                              << 32
                           ^ var8
                     )
                     & -1L << 32;
                  if (!var6.isEmpty() && this.iliIiiliiiii(var6) == null && this.IIlIiiiiil.size() < 64) {
                     this.IIlIiiiiil.add(new illiiIIlIiliiIIl(var6, (int)(var8 >>> 32)));
                  }
               }
            }
         }

         if (var2.has(IiIiliIiiiIi<"IiIiliIiiiIi","8NEE+eCVTFkv5sr0a46C94D7g2X9r9kxNdJAGFyhfk/xE+F1">())
            && this.iliIiiliiiii(var2.get(IiIiliIiiiIi<"IiIiliIiiiIi","8NEE+eCVTFkv5sr0a46C94D7g2X9r9kxNdJAGFyhfk/xE+F1">()).getAsString()) != null) {
            this.lIlIiiiiil = this.iliIiiliiiii(var2.get(IiIiliIiiiIi<"IiIiliIiiiIi","8NEE+eCVTFkv5sr0a46C94D7g2X9r9kxNdJAGFyhfk/xE+F1">()).getAsString())
               .liiiIIllIl();
         }

         if (var2.has(IiIiliIiiiIi<"IiIiliIiiiIi","Us/ngR854HIHLr1kvhZp45NRC/AEE/kyYu67qJQgo84YhlaHUQ==">())) {
            this.iIlIiiiiil = var2.get(IiIiliIiiiIi<"IiIiliIiiiIi","Us/ngR854HIHLr1kvhZp45NRC/AEE/kyYu67qJQgo84YhlaHUQ==">()).getAsBoolean();
         }
      }
   }

   public synchronized Integer IlIlllIlilIl() {
      if (!this.iIlIiiiiil) {
         return null;
      } else {
         illiiIIlIiliiIIl var1 = this.IIIllIIliIIl();
         return var1 == null ? null : var1.iIlIlllllill();
      }
   }

   public synchronized boolean IilliliilIIi() {
      return this.iIlIiiiiil;
   }

   public synchronized String iIlIlllllill() {
      return this.lIlIiiiiil;
   }

   public synchronized JsonElement Iiilliiliiil() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (illiiIIlIiliiIIl var4 : this.IIlIiiiiil) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(IiIiliIiiiIi<"IiIiliIiiiIi","nXMjm74OPyvIrMM2ODSOHeXw/MqGnjG7skcQ8FOFNPo=">(), var4.liiiIIllIl());
         var5.addProperty(IiIiliIiiiIi<"IiIiliIiiiIi","tAWKXSm4bCPv/AaxqsQJiZsb9ctNYjLBIlmlGK2KEz0=">(), var4.iIlIlllllill());
         var2.add(var5);
      }

      var1.add(IiIiliIiiiIi<"IiIiliIiiiIi","3QIYf0PqxYjTGcfiL+K6l4MO9KFITUNHRT/Mkh1QAb3aDQw=">(), var2);
      if (this.lIlIiiiiil != null) {
         var1.addProperty(IiIiliIiiiIi<"IiIiliIiiiIi","8NEE+eCVTFkv5sr0a46C94D7g2X9r9kxNdJAGFyhfk/xE+F1">(), this.lIlIiiiiil);
      }

      var1.addProperty(IiIiliIiiiIi<"IiIiliIiiiIi","Us/ngR854HIHLr1kvhZp45NRC/AEE/kyYu67qJQgo84YhlaHUQ==">(), this.iIlIiiiiil);
      return var1;
   }

   public synchronized boolean Iilllilliill(String name) {
      illiiIIlIiliiIIl var2 = this.iliIiiliiiii(name);
      if (var2 == null) {
         return false;
      } else {
         this.IIlIiiiiil.remove(var2);
         if (var2.liiiIIllIl().equalsIgnoreCase(this.lIlIiiiiil)) {
            this.lIlIiiiiil = this.IIlIiiiiil.isEmpty() ? null : this.IIlIiiiiil.get(0).liiiIIllIl();
         }

         return true;
      }
   }

   public synchronized boolean Ililllililil(String delta, int name) {
      long var6 = -1433298962616053933L;
      illiiIIlIiliiIIl var3 = this.iliIiiliiiii(delta);
      if (var3 == null) {
         return false;
      } else {
         var6 ^= ((long)this.IIlIiiiiil.indexOf(var3) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)((int)(var6 >>> 32) + Integer.signum(name)) ^ var6) & -1L >>> 32;
         if ((int)var6 >= 0 && (int)var6 < this.IIlIiiiiil.size()) {
            Collections.swap(this.IIlIiiiiil, (int)(var6 >>> 32), (int)var6);
            return true;
         } else {
            return false;
         }
      }
   }

   public synchronized void lIiiIiIlilli(boolean on) {
      this.iIlIiiiiil = on;
   }
}
