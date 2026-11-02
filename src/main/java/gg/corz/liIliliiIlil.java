package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class liIliliiIlil {
   public boolean IIIIIililIIIIili;
   public final String llliilliilliilli;
   public lIliIliIliIl Iliiillilliiilli;
   public IIlIiIilIlIiIi lIiiilliiIiiilli = IIlIiIilIlIiIi.illillliiIililllii;
   public final int iiIIIiliIIlIIili;
   private final Map<String, IiiiIiIlliiiIiIl> IllIIililllIIili;
   private final Map<String, IIliIiIilIliIiIi> lIlIIiliiIlIIili;
   public String liiiilliiiiiilli;
   private final Map<Long, IiiiIiIlliiiIiIl> illIIiliIilIIili;
   public final int IiIIIililiIIIili;
   public final int llIIIiliilIIIili;
   public final lliIlilliliIlill Iiliillililiilli;
   public String iiliilliIIiiilli;
   public llIIliIiilIIliIi iliiilliIiiiilli;
   public final int iIIIIiliIlIIIili;

   public List<IIliIiIilIliIiIi> IIIllIIliIIl() {
      ArrayList var1 = new ArrayList();

      for (IIliIiIilIliIiIi var3 : this.lIlIIiliiIlIIili.values()) {
         if (var3.iliilIiIIi && var3.liiilIiIIi && var3.IliIlllilIi() && var3.IIIIiIiIIi) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public IIliIiIilIliIiIi iIlIlllllill(String id) {
      return this.lIlIIiliiIlIIili.get(id);
   }

   public List<IiiiIiIlliiiIiIl> IIIilIIiiIIi() {
      ArrayList var1 = new ArrayList();

      for (IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         if (this.llliilliilliilli.equals(var3.IlIIiliIll)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public List<IIliIiIilIliIiIi> iliIiiliiiii() {
      ArrayList var1 = new ArrayList();

      for (IIliIiIilIliIiIi var3 : this.lIlIIiliiIlIIili.values()) {
         if (var3.iliilIiIIi) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public IiiiIiIlliiiIiIl IIillIiliIil(String id) {
      return this.IllIIililllIIili.get(id);
   }

   public boolean Iiilliiliiil(int z, int y, int x) {
      IiiiIiIlliiiIiIl var4 = this.Ililllililil(z, y, x);
      return var4 != null && this.llliilliilliilli.equals(var4.IlIIiliIll);
   }

   public void IIlllIlliIll(List<IiiiIiIlliiiIiIl> jobs) {
      this.IllIIililllIIili.clear();
      this.illIIiliIilIIili.clear();

      for (IiiiIiIlliiiIiIl var3 : jobs) {
         this.IllIIililllIIili.put(var3.iililliIll, var3);
         this.illIIiliIilIIili.put(iilIIIllIIiIIIll.iIlIlllllill(var3.IIiilliIll, var3.lIiilliIll, var3.iIiilliIll), var3);
      }
   }

   public void liiiIIllIl(IIliIiIilIliIiIi p) {
      if (p != null && !p.lIiilIiIIi.isEmpty()) {
         this.lIlIIiliiIlIIili.put(p.lIiilIiIIi, p);
      }
   }

   public int Illillliilli() {
      return Math.max(0, this.IiIiliIiiiIi() - this.IIlilIliiIli());
   }

   private void iIIIlIlIIl(JsonObject doc) {
      if (doc.has(llIIlilIIl<"llIIlilIIl","rITEgGRQCZ6Bq3IOxtsz8rNUgvj8hqeccg0NBBLwOMo=">())) {
         this.iiliilliIIiiilli = doc.get(llIIlilIIl<"llIIlilIIl","rITEgGRQCZ6Bq3IOxtsz8rNUgvj8hqeccg0NBBLwOMo=">()).getAsString();
      }

      if (doc.has(llIIlilIIl<"llIIlilIIl","8TqvzIRnggSbEG0unQv8ibzWf/Hsrrt3PdC/qNWJaDg=">())) {
         try {
            this.lIiiilliiIiiilli = IIlIiIilIlIiIi.valueOf(doc.get(llIIlilIIl<"llIIlilIIl","8TqvzIRnggSbEG0unQv8ibzWf/Hsrrt3PdC/qNWJaDg=">()).getAsString());
         } catch (Exception var6) {
         }
      }

      for (IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         var3.IlIIiliIll = null;
         var3.llIIiliIll = IliilIillliilIil.IIilIllIil;
         var3.ilIIiliIll = 0;
         var3.IiIIiliIll = 0;
         var3.iiIIiliIll = 0L;
         var3.liIIiliIll = 0L;
         var3.IIlIiliIll = 0L;
      }

      if (doc.has(llIIlilIIl<"llIIlilIIl","z7vKGRG23OxUKcXAVY1XAC+Ahmnu0kMGG0MC4zODJ2k=">())
         && doc.get(llIIlilIIl<"llIIlilIIl","z7vKGRG23OxUKcXAVY1XAC+Ahmnu0kMGG0MC4zODJ2k=">()).isJsonArray()) {
         for (JsonElement var8 : doc.getAsJsonArray(llIIlilIIl<"llIIlilIIl","z7vKGRG23OxUKcXAVY1XAC+Ahmnu0kMGG0MC4zODJ2k=">())) {
            if (var8.isJsonObject()) {
               JsonObject var4 = var8.getAsJsonObject();
               if (var4.has(llIIlilIIl<"llIIlilIIl","OjaeBTtIuesGhONHTvhIAwLYLe2txrs6JRHEFfn3">())) {
                  IiiiIiIlliiiIiIl var5 = this.IllIIililllIIili
                     .get(var4.get(llIIlilIIl<"llIIlilIIl","OjaeBTtIuesGhONHTvhIAwLYLe2txrs6JRHEFfn3">()).getAsString());
                  if (var5 != null) {
                     var5.IiIlliIliiIl(var4);
                  }
               }
            }
         }
      }
   }

   public Collection<IIliIiIilIliIiIi> IilliliilIIi() {
      return this.lIlIIiliiIlIIili.values();
   }

   public JsonObject Iiiiliiiiiii() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(llIIlilIIl<"llIIlilIIl","rITEgGRQCZ6Bq3IOxtsz8rNUgvj8hqeccg0NBBLwOMo=">(), this.iiliilliIIiiilli == null ? "" : this.iiliilliIIiiilli);
      var1.addProperty(llIIlilIIl<"llIIlilIIl","8TqvzIRnggSbEG0unQv8ibzWf/Hsrrt3PdC/qNWJaDg=">(), this.lIiiilliiIiiilli.name());
      var1.addProperty(llIIlilIIl<"llIIlilIIl","QNufWlWR7QY32ZdkoUup/3zJ52Xoor6yU64VIwJA+w==">(), this.Iliiillilliiilli.iiilililIIIiilil);
      var1.addProperty(llIIlilIIl<"llIIlilIIl","KeCKr+G26E/Y5u7GXx5Ink70QHAhaMtKxW+LpDN2UA==">(), this.Iliiillilliiilli.lIIiililiIIiilil);
      if (this.iliiilliIiiiilli != null && this.iliiilliIiiiilli.IliIlllilIi()) {
         var1.add(llIIlilIIl<"llIIlilIIl","mcUhJ9ISTnpLwpjtCN95Ea2UPqFIfRxIJ8gGwATihQ==">(), this.iliiilliIiiiilli.IilliliilIIi());
         var1.addProperty(llIIlilIIl<"llIIlilIIl","oU7KOyeGI/q/Co6i8tWlmuBxJ5+MSTZPWrcHBC01W9RD">(), this.liiiilliiiiiilli == null ? "" : this.liiiilliiiiiilli);
         var1.addProperty(llIIlilIIl<"llIIlilIIl","q/UJAcD18otawCnNgz5JoVudpaIQgn3NB/ZaBByxEvyFaCQ=">(), this.IIIIIililIIIIili);
      }

      JsonArray var2 = new JsonArray();

      for (IiiiIiIlliiiIiIl var4 : this.IllIIililllIIili.values()) {
         if (var4.IlIIiliIll != null || var4.llIIiliIll != IliilIillliilIil.IIilIllIil || var4.IiIIiliIll > 0) {
            var2.add(var4.IlIlllIlilIl());
         }
      }

      var1.add(llIIlilIIl<"llIIlilIIl","z7vKGRG23OxUKcXAVY1XAC+Ahmnu0kMGG0MC4zODJ2k=">(), var2);
      return var1;
   }

   public boolean Illlllllilll() {
      return !this.IllIIililllIIili.isEmpty();
   }

   public liIliliiIlil(String originZ, lliIlilliliIlill originY, int originX, int identity, int myId, int cubeSide) {
      this.Iliiillilliiilli = lIliIliIliIl.IliIlllilIi();
      this.liiiilliiiiiilli = "";
      this.lIlIIiliiIlIIili = new LinkedHashMap<>();
      this.IllIIililllIIili = new LinkedHashMap<>();
      this.illIIiliIilIIili = new HashMap<>();
      this.llliilliilliilli = originZ;
      this.Iiliillililiilli = originY;
      this.iIIIIiliIlIIIili = originX;
      this.llIIIiliilIIIili = identity;
      this.IiIIIililiIIIili = myId;
      this.iiIIIiliIIlIIili = cubeSide;
   }

   public boolean IliIlllilIi() {
      return this.llliilliilliilli != null && this.llliilliilliilli.equals(this.iiliilliIIiiilli);
   }

   public int IiIiliIiiiIi() {
      return this.Iiliillililiilli == null ? 0 : this.Iiliillililiilli.iIllIIiill;
   }

   public int Iliilliiilii() {
      long var4 = -1588624690049579522L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         if (var3.IilliliilIIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public void lIiiIiIlilli() {
      this.lIlIIiliiIlIIili.clear();
   }

   public lIiilliiIiilli IIIIllIIIl(JsonObject doc, boolean fromLiveCoordinator) {
      if (doc == null) {
         return lIiilliiIiilli.illiliIIIl;
      } else {
         String var3 = doc.has(llIIlilIIl<"llIIlilIIl","QNufWlWR7QY32ZdkoUup/3zJ52Xoor6yU64VIwJA+w==">())
            ? doc.get(llIIlilIIl<"llIIlilIIl","QNufWlWR7QY32ZdkoUup/3zJ52Xoor6yU64VIwJA+w==">()).getAsString()
            : "";
         long var4 = doc.has(llIIlilIIl<"llIIlilIIl","KeCKr+G26E/Y5u7GXx5Ink70QHAhaMtKxW+LpDN2UA==">())
            ? doc.get(llIIlilIIl<"llIIlilIIl","KeCKr+G26E/Y5u7GXx5Ink70QHAhaMtKxW+LpDN2UA==">()).getAsLong()
            : 0L;
         lIiilliiIiilli var6 = lIiilliiIiilli.lIliliIIIl;
         if (var3 != null && !var3.isEmpty()) {
            if (!this.Iliiillilliiilli.IilliliilIIi()) {
               this.Iliiillilliiilli = new lIliIliIliIl(this.Iliiillilliiilli.Iiilililliililil, var3, var4);
               var6 = lIiilliiIiilli.iIliliIIIl;
            } else if (!this.Iliiillilliiilli.iiilililIIIiilil.equals(var3)) {
               if (!fromLiveCoordinator) {
                  return lIiilliiIiilli.illiliIIIl;
               }

               this.Iliiillilliiilli = new lIliIliIliIl(this.Iliiillilliiilli.Iiilililliililil, var3, var4);
               var6 = lIiilliiIiilli.IlliliIIIl;
            } else {
               if (var4 < this.Iliiillilliiilli.lIIiililiIIiilil) {
                  return lIiilliiIiilli.llliliIIIl;
               }

               if (var4 > this.Iliiillilliiilli.lIIiililiIIiilil) {
                  this.Iliiillilliiilli = new lIliIliIliIl(this.Iliiillilliiilli.Iiilililliililil, var3, var4);
               }
            }

            this.iIIIlIlIIl(doc);
            return var6;
         } else {
            return lIiilliiIiilli.illiliIIIl;
         }
      }
   }

   public Collection<IiiiIiIlliiiIiIl> Iilllilliill() {
      return this.IllIIililllIIili.values();
   }

   public int IlIlllIlilIl() {
      long var4 = -3504201123461760870L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IIliIiIilIliIiIi var3 : this.lIlIIiliiIlIIili.values()) {
         if (var3.iliilIiIIi) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public int IIlilIliiIli() {
      long var4 = 2502939253638421819L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         var4 ^= ((long)((int)(var4 >>> 32) + (var3.IilliliilIIi() ? var3.IIIIiliIll : Math.min(var3.IiIIiliIll, var3.IIIIiliIll))) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public boolean IIiilIiiiIii() {
      if (this.IllIIililllIIili.isEmpty()) {
         return false;
      } else {
         for (IiiiIiIlliiiIiIl var2 : this.IllIIililllIIili.values()) {
            if (!var2.IilliliilIIi()) {
               return false;
            }
         }

         return true;
      }
   }

   public IiiiIiIlliiiIiIl Ililllililil(int y, int x, int z) {
      long var7 = -9015467525765937349L;
      long var9 = -192490085022411809L;
      var7 ^= ((long)iilIIIllIIiIIIll.liiiIIllIl(y, this.iIIIIiliIlIIIili, this.iiIIIiliIIlIIili) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)iilIIIllIIiIIIll.liiiIIllIl(x, this.llIIIiliilIIIili, this.iiIIIiliIIlIIili) ^ var7) & -1L >>> 32;
      var9 ^= ((long)iilIIIllIIiIIIll.liiiIIllIl(z, this.IiIIIililiIIIili, this.iiIIIiliIIlIIili) << 32 ^ var9) & -1L << 32;
      return this.illIIiliIilIIili.get(iilIIIllIIiIIIll.iIlIlllllill((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32)));
   }

   public int IiIlliIliiIl() {
      long var6 = -4660596685842062927L;
      long var1 = System.currentTimeMillis();
      var6 ^= (0L ^ var6) & -1L << 32;

      for (IIliIiIilIliIiIi var5 : this.lIlIIiliiIlIIili.values()) {
         if (var5.iliilIiIIi || var5.IiiilIiIIi > 0L && var1 - var5.IiiilIiIIi < 30000L) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   public float Iilililiiili() {
      long var2 = -5416507860566020985L;
      var2 ^= ((long)this.IiIiliIiiiIi() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) <= 0 ? 0.0F : Math.min(1.0F, (float)this.IIlilIliiIli() / (float)((int)(var2 >>> 32)));
   }

   public int IlIillIiilIi() {
      long var4 = -1275172169418492347L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IiiiIiIlliiiIiIl var3 : this.IllIIililllIIili.values()) {
         if (this.llliilliilliilli.equals(var3.IlIIiliIll)) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }
}
