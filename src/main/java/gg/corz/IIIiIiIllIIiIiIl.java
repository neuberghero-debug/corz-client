package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class IIIiIiIllIIiIiIl {
   public static final int iliiIliIll = 4096;
   private final LinkedHashMap<Long, lliliillililiill> iiiiIliIll;
   private boolean iIIIlliIll;
   private int IlIIlliIll;
   private final LinkedHashMap<String, LinkedHashMap<Long, lliliillililiill>> lIIIlliIll;
   private final Map<Long, Set<Long>> IIIIlliIll;
   public static final int IiiiIliIll = 32;
   private long llIIlliIll;
   private String liiiIliIll = "";

   public void Ililllililil() {
      this.iiiiIliIll.clear();
      this.IIIIlliIll.clear();
      this.lIIIlliIll.clear();
      this.IlIIlliIll++;
   }

   public int IIlilIliiIli() {
      long var4 = 8908479171505005903L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (lliliillililiill var3 : this.iiiiIliIll.values()) {
         if (var3.IilliliilIIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public boolean IIIllIIliIIl(int y, int x, int z) {
      return this.iIIIlIlIIl(iIiIiiIlIliIiiIl.lIiiIiIlilli(y, x, z));
   }

   public int liiiIIllIl() {
      return this.IlIIlliIll;
   }

   public Map<String, List<lliliillililiill>> IIiilIiiiIii() {
      LinkedHashMap var1 = new LinkedHashMap();

      for (Entry var3 : this.lIIIlliIll.entrySet()) {
         var1.put((String)var3.getKey(), new ArrayList(((LinkedHashMap)var3.getValue()).values()));
      }

      if (!this.liiiIliIll.isEmpty() && !this.iiiiIliIll.isEmpty()) {
         var1.put(this.liiiIliIll, new ArrayList<>(this.iiiiIliIll.values()));
      }

      return var1;
   }

   public boolean IiIlliIliiIl(int mobId, int spawnerNow, int z, boolean x, String y) {
      return x ? this.iliIiiliiiii(mobId, spawnerNow, z, y) : this.IIIllIIliIIl(mobId, spawnerNow, z);
   }

   private void Iiiiliiiiiii(lliliillililiill e) {
      this.IIIIlliIll.computeIfAbsent(e.IIiiliiill, k -> new HashSet<>()).add(e.iililiiill);
   }

   public void IIillIiliIil() {
      long var4 = 2929345379414243486L;
      var4 ^= ((long)(!this.lIIIlliIll.isEmpty() ? 1 : 0) << 32 ^ var4) & -1L << 32;
      this.lIIIlliIll.clear();
      Iterator var2 = this.iiiiIliIll.values().iterator();

      while (var2.hasNext()) {
         lliliillililiill var3 = (lliliillililiill)var2.next();
         if (!var3.IilliliilIIi()) {
            var2.remove();
            this.IIIIllIIIl(var3);
            var4 ^= (4294967296L ^ var4) & -1L << 32;
         }
      }

      if ((int)(var4 >>> 32) != 0) {
         this.IlIIlliIll++;
      }
   }

   public void IilliliilIIi(boolean on) {
      if (this.iIIIlliIll != on) {
         this.iIIIlliIll = on;
         this.IlIIlliIll++;
      }
   }

   public boolean IIIilIIiiIIi(int x, int z, int y) {
      return this.iiiiIliIll.containsKey(Long.valueOf(iIiIiiIlIliIiiIl.lIiiIiIlilli(x, z, y)));
   }

   public String IliIlllilIi() {
      return this.liiiIliIll;
   }

   private boolean llIIlilIIl(long key) {
      lliliillililiill var3 = this.iiiiIliIll.remove(Long.valueOf(key));
      if (var3 == null) {
         return false;
      } else {
         this.IIIIllIIIl(var3);
         return true;
      }
   }

   private boolean iIIIlIlIIl(long key) {
      long var4 = -105405298699657499L;
      var4 ^= ((long)this.llIIlilIIl(key) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != 0) {
         this.IlIIlliIll++;
      }

      return (boolean)((int)(var4 >>> 32));
   }

   public void Illlllllilll(long chunkKey) {
      long var8 = 880005708493597228L;
      Set var3 = this.IIIIlliIll.get(chunkKey);
      if (var3 != null && !var3.isEmpty()) {
         var8 ^= (0L ^ var8) & -1L << 32;

         for (Long var6 : new ArrayList(var3)) {
            lliliillililiill var7 = this.iiiiIliIll.get(var6);
            if (var7 != null && var7.IilliliilIIi()) {
               if (this.iIIIlliIll) {
                  var7.iliIiiliiiii(iIiIIIIlIliIIIIl.illIliIlIl);
               } else {
                  this.llIIlilIIl(var6);
               }

               var8 ^= (4294967296L ^ var8) & -1L << 32;
            }
         }

         if ((int)(var8 >>> 32) != 0) {
            this.IiIIlliIIl();
            this.IlIIlliIll++;
         }
      }
   }

   public List<lliliillililiill> IlIillIiilIi() {
      ArrayList var1 = new ArrayList(this.iiiiIliIll.size());

      for (lliliillililiill var3 : this.iiiiIliIll.values()) {
         if (var3.IilliliilIIi() || this.iIIIlliIll) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public IIIiIiIllIIiIiIl() {
      this.iiiiIliIll = new LinkedHashMap<>();
      this.IIIIlliIll = new HashMap<>();
      this.lIIIlliIll = new LinkedHashMap<>();
      this.iIIIlliIll = true;
      this.IlIIlliIll = 1;
   }

   public lliliillililiill Iiilliiliiil(long posKey) {
      return this.iiiiIliIll.get(posKey);
   }

   public int Illillliilli() {
      long var4 = -5371091923644889348L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (lliliillililiill var3 : this.iiiiIliIll.values()) {
         if (!var3.IilliliilIIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   private void iiIIlIIlIl() {
      while (this.lIIIlliIll.size() > 32) {
         String var1 = this.lIIIlliIll.keySet().iterator().next();
         this.lIIIlliIll.remove(var1);
      }
   }

   public void lIiiIiIlilli(String newScope) {
      String var2 = newScope == null ? "" : newScope;
      if (!var2.equals(this.liiiIliIll)) {
         LinkedHashMap var3 = new LinkedHashMap();

         for (lliliillililiill var5 : this.iiiiIliIll.values()) {
            if (var5.IilliliilIIi()) {
               if (!this.iIIIlliIll) {
                  continue;
               }

               var5.iliIiiliiiii(iIiIIIIlIliIIIIl.illIliIlIl);
            }

            var3.put(Long.valueOf(var5.iililiiill), var5);
         }

         if (!this.liiiIliIll.isEmpty() && !var3.isEmpty()) {
            this.lIIIlliIll.remove(this.liiiIliIll);
            this.lIIIlliIll.put(this.liiiIliIll, var3);
            this.iiIIlIIlIl();
         }

         this.iiiiIliIll.clear();
         this.IIIIlliIll.clear();
         this.liiiIliIll = var2;
         LinkedHashMap var7 = this.lIIIlliIll.remove(var2);
         if (var7 != null) {
            for (lliliillililiill var6 : var7.values()) {
               var6.iliIiiliiiii(iIiIIIIlIliIIIIl.illIliIlIl);
               this.iiiiIliIll.put(Long.valueOf(var6.iililiiill), var6);
               this.Iiiiliiiiiii(var6);
            }
         }

         this.IiIIlliIIl();
         this.IlIIlliIll++;
      }
   }

   public boolean IIlllIlliIll(long mobId, String posKey) {
      String var4 = lIIlilIiiIIlilIi.IliIlllilIi(posKey);
      if (var4 == null) {
         return false;
      } else {
         lliliillililiill var5 = this.iiiiIliIll.get(mobId);
         if (var5 != null && !var4.equals(var5.IliIlllilIi())) {
            var5.lIiiIiIlilli(var4);
            this.IlIIlliIll++;
            return true;
         } else {
            return false;
         }
      }
   }

   private void IIIIllIIIl(lliliillililiill e) {
      Set var2 = this.IIIIlliIll.get(e.IIiiliiill);
      if (var2 != null) {
         var2.remove(e.iililiiill);
         if (var2.isEmpty()) {
            this.IIIIlliIll.remove(e.IIiiliiill);
         }
      }
   }

   private void IiIIlliIIl() {
      long var5 = -3971275211436738345L;
      var5 ^= ((long)this.Illillliilli() << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) > 4096) {
         var5 ^= ((long)((int)(var5 >>> 32) - 4096) ^ var5) & -1L >>> 32;
         Iterator var3 = this.iiiiIliIll.values().iterator();

         while (var3.hasNext() && (int)var5 > 0) {
            lliliillililiill var4 = (lliliillililiill)var3.next();
            if (!var4.IilliliilIIi()) {
               var3.remove();
               this.IIIIllIIIl(var4);
               var5 ^= (var5 ^ var5 + (long)-1) & -1L >>> 32;
            }
         }
      }
   }

   public boolean iliIiiliiiii(int x, int z, int mobId, String y) {
      long var10 = -7593930160876677526L;
      long var5 = iIiIiiIlIliIiiIl.lIiiIiIlilli(x, z, mobId);
      lliliillililiill var7 = this.iiiiIliIll.get(var5);
      var10 ^= (0L ^ var10) & -1L << 32;
      if (var7 == null) {
         var7 = new lliliillililiill(x, z, mobId, lIIlilIiiIIlilIi.IliIlllilIi(y), iIiIIIIlIliIIIIl.lllIliIlIl, ++this.llIIlliIll);
         this.iiiiIliIll.put(Long.valueOf(var5), var7);
         this.Iiiiliiiiiii(var7);
         var10 ^= (4294967296L ^ var10) & -1L << 32;
      } else {
         if (!var7.IilliliilIIi()) {
            var7.iliIiiliiiii(iIiIIIIlIliIIIIl.lllIliIlIl);
            var10 ^= (4294967296L ^ var10) & -1L << 32;
         }

         String var9 = lIIlilIiiIIlilIi.IliIlllilIi(y);
         if (var9 != null && !var9.equals(var7.IliIlllilIi())) {
            var7.lIiiIiIlilli(var9);
            var10 ^= (4294967296L ^ var10) & -1L << 32;
         }
      }

      if ((int)(var10 >>> 32) != 0) {
         this.IlIIlliIll++;
      }

      return (boolean)((int)(var10 >>> 32));
   }

   public void IlIlllIlilIl(long found, Map<Long, String> chunkKey) {
      Set var4 = this.IIIIlliIll.get(found);
      if (var4 != null && !var4.isEmpty()) {
         for (Long var6 : new ArrayList(var4)) {
            if (!chunkKey.containsKey(var6)) {
               this.iIIIlIlIIl(var6);
            }
         }
      }

      for (Entry var10 : chunkKey.entrySet()) {
         long var7 = (Long)var10.getKey();
         this.iliIiiliiiii(
            iIiIiiIlIliIiiIl.iliIiiliiiii(var7), iIiIiiIlIliIiiIl.IIIllIIliIIl(var7), iIiIiiIlIliIiiIl.IlIlllIlilIl(var7), (String)var10.getValue()
         );
      }
   }

   public int Iilililiiili() {
      return this.lIIIlliIll.size();
   }

   public void Iliilliiilii(String positions, List<int[]> importScope, List<String> mobIds) {
      long var10 = -7499676377232045992L;
      if (positions != null && !positions.isEmpty() && importScope != null) {
         if (positions.equals(this.liiiIliIll)) {
            for (long var14 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var14 >>> 32) < importScope.size(); var14 += 4294967296L) {
               int[] var5 = (int[])importScope.get((int)(var14 >>> 32));
               long var6 = iIiIiiIlIliIiiIl.lIiiIiIlilli(var5[0], var5[1], var5[2]);
               if (!this.iiiiIliIll.containsKey(Long.valueOf(var6))) {
                  String var8 = mobIds != null && (int)(var14 >>> 32) < mobIds.size() ? (String)mobIds.get((int)(var14 >>> 32)) : null;
                  lliliillililiill var9 = new lliliillililiill(
                     var5[0], var5[1], var5[2], lIIlilIiiIIlilIi.IliIlllilIi(var8), iIiIIIIlIliIIIIl.illIliIlIl, ++this.llIIlliIll
                  );
                  this.iiiiIliIll.put(Long.valueOf(var6), var9);
                  this.Iiiiliiiiiii(var9);
               }
            }

            this.IiIIlliIIl();
         } else {
            LinkedHashMap var4 = this.lIIIlliIll.computeIfAbsent(positions, k -> new LinkedHashMap<>());

            for (long var15 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var15 < importScope.size(); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
               int[] var12 = (int[])importScope.get((int)var15);
               long var7 = iIiIiiIlIliIiiIl.lIiiIiIlilli(var12[0], var12[1], var12[2]);
               if (!var4.containsKey(Long.valueOf(var7))) {
                  if (var4.size() >= 4096) {
                     break;
                  }

                  String var13 = mobIds != null && (int)var15 < mobIds.size() ? (String)mobIds.get((int)var15) : null;
                  var4.put(
                     Long.valueOf(var7),
                     new lliliillililiill(var12[0], var12[1], var12[2], lIIlilIiiIIlilIi.IliIlllilIi(var13), iIiIIIIlIliIIIIl.illIliIlIl, ++this.llIIlliIll)
                  );
               }
            }

            if (var4.isEmpty()) {
               this.lIIIlliIll.remove(positions);
            }

            this.iiIIlIIlIl();
         }

         this.IlIIlliIll++;
      }
   }

   public List<lliliillililiill> IiIiliIiiiIi(int limit) {
      ArrayList var2 = new ArrayList();

      for (lliliillililiill var4 : this.iiiiIliIll.values()) {
         if (var4.IilliliilIIi() && !var4.liiiIIllIl()) {
            var2.add(var4);
            if (var2.size() >= limit) {
               break;
            }
         }
      }

      return var2;
   }

   public void Iilllilliill() {
      long var4 = -5622736677903698351L;
      var4 ^= (0L ^ var4) & -1L << 32;
      Iterator var2 = this.iiiiIliIll.values().iterator();

      while (var2.hasNext()) {
         lliliillililiill var3 = (lliliillililiill)var2.next();
         if (var3.IilliliilIIi()) {
            if (this.iIIIlliIll) {
               var3.iliIiiliiiii(iIiIIIIlIliIIIIl.illIliIlIl);
            } else {
               var2.remove();
               this.IIIIllIIIl(var3);
            }

            var4 ^= (4294967296L ^ var4) & -1L << 32;
         }
      }

      if ((int)(var4 >>> 32) != 0) {
         this.IiIIlliIIl();
         this.IlIIlliIll++;
      }
   }

   public boolean iIlIlllllill() {
      return this.iIIIlliIll;
   }
}
