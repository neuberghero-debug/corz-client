package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class lliIIIliliIIIl {
   private final Map<Long, iiliIiiIIiiIii> iilIIliIlIIiIIliIl = new HashMap<>();
   public static final double IilIIliIllilIIliIl = 4096.0;
   public static final int lllIIliIlillIIliIl = 320;
   public static final int iIlIIliIlIllIIliIl = 24;
   private final Set<String> iliIIliIlIiiIIliIl;
   private final Map<String, iiliIiiIIiiIii> lIiIIliIliIiIIliIl = new HashMap<>();
   private final List<int[]> IIIlIliIllIIlIliIl;
   private long liiIIliIliiiIIliIl;
   private final Map<Long, Set<String>> IliIIliIllliIIliIl = new HashMap<>();

   public void IIillIiliIil(String key) {
      iiliIiiIIiiIii var2 = this.lIiIIliIliIiIIliIl.remove(key);
      if (var2 != null) {
         IiIlililliIlilil var3 = var2.IiiIlIiIIl.remove(key);
         if (var3 != null) {
            this.IiIiliIiiiIi(var3);
         }

         var2.lIlllIiIIl = true;
         if (var2.IiiIlIiIIl.isEmpty()) {
            this.iilIIliIlIIiIIliIl.remove(var2.iliIlIiIIl);
         }
      }
   }

   private void IIlilIliiIli(double px, double pz) {
      ArrayList var5 = new ArrayList<>(this.iilIIliIlIIiIIliIl.values());
      var5.sort((pxx, a) -> {
         long var7 = 1832578466927094882L;
         var7 ^= ((long)Integer.compare(pxx.lIIllIiIIl, a.lIIllIiIIl) << 32 ^ var7) & -1L << 32;
         return (int)(var7 >>> 32) != 0 ? (int)(var7 >>> 32) : Double.compare(a.IIlilIliiIli(px, pz), pxx.IIlilIliiIli(px, pz));
      });

      for (int var6 = 0; var6 < var5.size() - 320; var6++) {
         this.IlIillIiilIi((iiliIiiIIiiIii)var5.get(var6));
      }
   }

   public boolean lIiiIiIlilli(lIilllliIillll z, int clue, int y, int key, String now, long x) {
      return this.iliIiiliiiii(z, clue, y, key, now, z.IlIIIIIIillIIIIIIi, null, x);
   }

   private static boolean Iiilliiliiil(iiliIiiIIiiIii s, long now) {
      for (IiIlililliIlilil var4 : s.IiiIlIiIIl.values()) {
         if (var4.iIlIlllllill(now)) {
            return true;
         }
      }

      return false;
   }

   private void IiIiliIiiiIi(IiIlililliIlilil h) {
      Set var2 = this.IliIIliIllliIIliIl.get(h.lIliIlIlil);
      if (var2 != null && var2.remove(h.ilIiIlIlil) && var2.isEmpty()) {
         this.IliIIliIllliIIliIl.remove(h.lIliIlIlil);
      }
   }

   private void Illillliilli(long now) {
      if (this.iilIIliIlIIiIIliIl.size() >= 2) {
         ArrayList var3 = new ArrayList<>(this.iilIIliIlIIiIIliIl.values());
         double var4 = 576.0;

         for (int var6 = 0; var6 < var3.size(); var6++) {
            iiliIiiIIiiIii var7 = (iiliIiiIIiiIii)var3.get(var6);
            if (this.iilIIliIlIIiIIliIl.containsKey(var7.iliIlIiIIl)) {
               for (int var8 = var6 + 1; var8 < var3.size(); var8++) {
                  iiliIiiIIiiIii var9 = (iiliIiiIIiiIii)var3.get(var8);
                  if (this.iilIIliIlIIiIIliIl.containsKey(var9.iliIlIiIIl)) {
                     double var10 = var7.liiIlIiIIl - var9.liiIlIiIIl;
                     double var12 = var7.IIIllIiIIl - var9.IIIllIiIIl;
                     if (!(var10 * var10 + var12 * var12 > var4)) {
                        iiliIiiIIiiIii var14 = var7.iIlllIiIIl <= var9.iIlllIiIIl ? var7 : var9;
                        iiliIiiIIiiIii var15 = var14 == var7 ? var9 : var7;

                        for (IiIlililliIlilil var17 : var15.IiiIlIiIIl.values()) {
                           var14.IiiIlIiIIl.put(var17.ilIiIlIlil, var17);
                           this.lIiIIliIliIiIIliIl.put(var17.ilIiIlIlil, var14);
                        }

                        var15.IiiIlIiIIl.clear();
                        var14.IilllIiIIl = var14.IilllIiIIl | var15.IilllIiIIl;
                        var14.iIlllIiIIl = Math.min(var14.iIlllIiIIl, var15.iIlllIiIIl);
                        this.iilIIliIlIIiIIliIl.remove(var15.iliIlIiIIl);
                        var14.Illillliilli(now);
                        if (var15 == var7) {
                           break;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public lliIIIliliIIIl() {
      this.iliIIliIlIiiIIliIl = new HashSet<>();
      this.liiIIliIliiiIIliIl = 1L;
      this.IIIlIliIllIIlIliIl = new ArrayList<>();
   }

   public void IIlllIlliIll(int x, int z) {
      if (this.IIIlIliIllIIlIliIl.size() < ((-15179176 << 5 | -15179176 >>> 27) * -1594008481 ^ 15 ^ 1244792270) && !this.Illlllllilll((double)x, (double)z)) {
         this.IIIlIliIllIIlIliIl.add(new int[]{x, z});
      }
   }

   public void IiIlliIliiIl(int y, int reasons, int score, int z, List<String> firstSeen, long now, long x) {
      String var10 = IllIllllIl<"IllIllllIl","Or5znqVPgbxAaRywsLAoVYTWm8tT69I6aoH4oSDOjoM=">()
         + y
         + IllIllllIl<"IllIllllIl","hdM0inJvAsdnwHfQ/4nIBFrugM9AuBa/9z+bS/g=">()
         + reasons
         + IllIllllIl<"IllIllllIl","hdM0inJvAsdnwHfQ/4nIBFrugM9AuBa/9z+bS/g=">()
         + score;
      this.iliIiiliiiii(
         lIilllliIillll.iiiiiiiilIIIIIIIIi,
         y,
         reasons,
         score,
         var10,
         Math.max(0, Math.min(((1231851318 - 95) * 750576809 >>> 23 | (1231851318 - 95) * 750576809 << 9) ^ 69 ^ -1953505758, z)),
         String.join(IllIllllIl<"IllIllllIl","ywYo8Is6inQt2Uh5dVSguMm/ogQZb0ECO09R86c=">(), firstSeen),
         x
      );
      iiliIiiIIiiIii var11 = this.lIiIIliIliIiIIliIl.get(var10);
      if (var11 != null) {
         var11.IilllIiIIl = true;
         var11.ilIllIiIIl = true;
         var11.iIlllIiIIl = Math.min(var11.iIlllIiIIl, now);
      }

      this.IIlllIlliIll(y, score);
   }

   public boolean iliIiiliiiii(lIilllliIillll clue, int weight, int y, int z, String key, int x, String detail, long now) {
      iiliIiiIIiiIii var10 = this.lIiIIliIliIiIIliIl.get(key);
      if (var10 != null) {
         IiIlililliIlilil var11 = var10.IiiIlIiIIl.get(key);
         if (var11 != null && (var11.liIiIlIlil != weight || var11.iiIiIlIlil != y || var11.IIliIlIlil != z)) {
            double var12 = var10.liiIlIiIIl - (double)weight;
            double var14 = var10.IIIllIiIIl - (double)z;
            if (!(var12 * var12 + var14 * var14 > 576.0)) {
               long var16 = IliIlllilIi(weight >> 4, z >> 4);
               var10.IiiIlIiIIl.put(key, new IiIlililliIlilil(key, clue, weight, y, z, var16, x, detail, now));
               var10.IllllIiIIl = now;
               var10.lIlllIiIIl = true;
               return false;
            }

            this.IIillIiliIil(key);
            var11 = null;
            var10 = null;
         }

         if (var11 != null) {
            var11.illiIlIlil = now;
            if (var11.iIliIlIlil != x || !Objects.equals(var11.IlliIlIlil, detail)) {
               var11.iIliIlIlil = x;
               var11.IlliIlIlil = detail;
               var10.lIlllIiIIl = true;
            }

            var10.IllllIiIIl = now;
            return false;
         }

         if (var10 != null) {
            this.lIiIIliIliIiIIliIl.remove(key);
         }
      }

      iiliIiiIIiiIii var18 = this.Iilililiiili(weight, z, 24);
      if (var18 == null) {
         var18 = new iiliIiiIIiiIii(this.liiIIliIliiiIIliIl++, (double)weight, (double)y, (double)z, now);
         this.iilIIliIlIIiIIliIl.put(var18.iliIlIiIIl, var18);
      }

      long var19 = IliIlllilIi(weight >> 4, z >> 4);
      var18.IiiIlIiIIl.put(key, new IiIlililliIlilil(key, clue, weight, y, z, var19, x, detail, now));
      var18.IllllIiIIl = now;
      var18.lIlllIiIIl = true;
      this.lIiIIliIliIiIIliIl.put(key, var18);
      return true;
   }

   public void IlIlllIlilIl(List<IllllIIllllllIIl> now, Set<Long> scannedChunks, long fresh) {
      HashSet var5 = new HashSet();

      for (IllllIIllllllIIl var7 : now) {
         var5.add(var7.iIlIiillIl);
      }

      Iterator var12 = this.iliIIliIlIiiIIliIl.iterator();

      while (var12.hasNext()) {
         String var15 = (String)var12.next();
         if (!var5.contains(var15)) {
            iiliIiiIIiiIii var8 = this.lIiIIliIliIiIIliIl.get(var15);
            IiIlililliIlilil var9 = var8 == null ? null : var8.IiiIlIiIIl.get(var15);
            if (var9 == null || scannedChunks.contains(var9.lIliIlIlil)) {
               this.IIillIiliIil(var15);
               var12.remove();
            }
         }
      }

      for (IllllIIllllllIIl var16 : now) {
         this.iliIiiliiiii(var16.IiIIiillIl, var16.liIIiillIl, var16.iiIIiillIl, var16.IIlIiillIl, var16.iIlIiillIl, var16.lIlIiillIl, var16.IllIiillIl, fresh);
         this.iliIIliIlIiiIIliIl.add(var16.iIlIiillIl);
         iiliIiiIIiiIii var18 = this.lIiIIliIliIiIIliIl.get(var16.iIlIiillIl);
         if (var18 != null) {
            for (String var10 : new ArrayList<>(var18.IiiIlIiIIl.keySet())) {
               if (var10.startsWith(IllIllllIl<"IllIllllIl","Or5znqVPgbxAaRywsLAoVYTWm8tT69I6aoH4oSDOjoM=">())) {
                  this.IIillIiliIil(var10);
               }
            }
         }
      }

      for (iiliIiiIIiiIii var17 : new ArrayList<>(this.iilIIliIlIIiIIliIl.values())) {
         boolean var19 = false;
         ArrayList var21 = new ArrayList();

         for (IiIlililliIlilil var11 : var17.IiiIlIiIIl.values()) {
            if (var11.IiIiIlIlil == lIilllliIillll.iiiiiiiilIIIIIIIIi) {
               if (scannedChunks.contains(var11.lIliIlIlil)) {
                  var21.add(var11.ilIiIlIlil);
               }
            } else if (var11.IiIiIlIlil.lIIIIIIIiiIIIIIIIi == lIiiIlliIiiIll.liIIllliliiIIlllil
               || var11.IiIiIlIlil.lIIIIIIIiiIIIIIIIi == lIiiIlliIiiIll.IIlIlllillIlIlllil) {
               var19 = true;
            }
         }

         if (!var19) {
            for (String var24 : var21) {
               this.IIillIiliIil(var24);
            }
         }
      }
   }

   public List<iiliIiiIIiiIii> Iilllilliill(int limit, int minScore) {
      ArrayList var3 = new ArrayList();

      for (iiliIiiIIiiIii var5 : this.iilIIliIlIIiIIliIl.values()) {
         if (var5.lIIllIiIIl >= limit) {
            var3.add(var5);
         }
      }

      var3.sort((a, b) -> Integer.compare(b.lIIllIiIIl, a.lIIllIiIIl));
      return var3.size() > minScore ? new ArrayList<>(var3.subList(0, minScore)) : var3;
   }

   public List<iiliIiiIIiiIii> Iliilliiilii(double px, double nearRadius, int pz, int limit, double farSlots, int minScore) {
      return this.Iiiiliiiiiii(px, nearRadius, pz, limit, farSlots, minScore, (-1932073158 * -123 >>> 27 | -1932073158 * -123 << 5) * 75 ^ 38346321);
   }

   public List<iiliIiiIIiiIii> IIiilIiiiIii(double minScore, double limit, int pz, int px) {
      ArrayList var7 = new ArrayList();

      for (iiliIiiIIiiIii var9 : this.iilIIliIlIIiIIliIl.values()) {
         if (!var9.lIlllIiIIl && var9.lIIllIiIIl >= pz) {
            var7.add(var9);
         }
      }

      var7.sort((a, pxx) -> {
         long var7x = -184950850110443612L;
         var7x ^= ((long)Integer.compare(pxx.lIIllIiIIl, a.lIIllIiIIl) << 32 ^ var7x) & -1L << 32;
         return (int)(var7x >>> 32) != 0 ? (int)(var7x >>> 32) : Double.compare(a.IIlilIliiIli(minScore, limit), pxx.IIlilIliiIli(minScore, limit));
      });
      return var7.size() > px ? new ArrayList<>(var7.subList(0, px)) : var7;
   }

   public iiliIiiIIiiIii IIIIllIIIl(double minScore, double pz, int px) {
      List var6 = this.IIiilIiiiIii(minScore, pz, px, 1);
      return var6.isEmpty() ? null : (iiliIiiIIiiIii)var6.get(0);
   }

   private void IlIillIiilIi(iiliIiiIIiiIii s) {
      this.iilIIliIlIIiIIliIl.remove(s.iliIlIiIIl);

      for (IiIlililliIlilil var3 : s.IiiIlIiIIl.values()) {
         this.lIiIIliIliIiIIliIl.remove(var3.ilIiIlIlil);
         this.iliIIliIlIiiIIliIl.remove(var3.ilIiIlIlil);
         this.IiIiliIiiiIi(var3);
      }
   }

   public void IIIllIIliIIl(int now, int fresh, List<IllllIIllllllIIl> cz, long cx) {
      long var6 = IliIlllilIi(now, fresh);
      Set var8 = this.IliIIliIllliIIliIl.remove(var6);
      HashSet var9 = new HashSet();

      for (IllllIIllllllIIl var11 : cz) {
         var9.add(var11.iIlIiillIl);
      }

      if (var8 != null) {
         for (String var15 : var8) {
            if (!var9.contains(var15)) {
               this.IIillIiliIil(var15);
            }
         }
      }

      if (!cz.isEmpty()) {
         HashSet var14 = new HashSet();

         for (IllllIIllllllIIl var12 : cz) {
            this.iliIiiliiiii(var12.IiIIiillIl, var12.liIIiillIl, var12.iiIIiillIl, var12.IIlIiillIl, var12.iIlIiillIl, var12.lIlIiillIl, var12.IllIiillIl, cx);
            var14.add(var12.iIlIiillIl);
         }

         this.IliIIliIllliIIliIl.put(var6, var14);
      }
   }

   private void IIIilIIiiIIi(iiliIiiIIiiIii s, long now) {
      this.lIiIIliIliIiIIliIl.values().removeIf(v -> v == s);

      for (String var5 : s.IiiIlIiIIl.keySet()) {
         this.lIiIIliIliIiIIliIl.put(var5, s);
      }
   }

   public void IilliliilIIi() {
      this.IIIlIliIllIIlIliIl.clear();
      this.iilIIliIlIIiIIliIl.clear();
      this.lIiIIliIliIiIIliIl.clear();
      this.IliIIliIllliIIliIl.clear();
      this.iliIIliIlIiiIIliIl.clear();
   }

   public boolean Illlllllilll(double z, double x) {
      double var5 = 576.0;

      for (int[] var8 : this.IIIlIliIllIIlIliIl) {
         double var9 = (double)var8[0] - z;
         double var11 = (double)var8[1] - x;
         if (var9 * var9 + var11 * var11 <= var5) {
            return true;
         }
      }

      return false;
   }

   public static long IliIlllilIi(int cx, int cz) {
      return (long)cz
            << (((1333810840 << 1 | 1333810840 >>> 31) * 1041204193 + -87 >>> 25 | (1333810840 << 1 | 1333810840 >>> 31) * 1041204193 + -87 << 7) ^ 65236175)
         | (long)cx & (4204042040457246277L ^ 4204042042797246906L);
   }

   public void Ililllililil(long pz, double now, double px) {
      ArrayList var7 = new ArrayList();

      for (iiliIiiIIiiIii var9 : this.iilIIliIlIIiIIliIl.values()) {
         int var10 = var9.IiiIlIiIIl.size();
         if (var9.lIlllIiIIl || Iiilliiliiil(var9, pz)) {
            var9.Illillliilli(pz);
         }

         if (var9.IiiIlIiIIl.size() != var10) {
            this.IIIilIIiiIIi(var9, pz);
         }

         if (var9.IiiIlIiIIl.isEmpty()) {
            var7.add(var9);
         }
      }

      for (iiliIiiIIiiIii var15 : var7) {
         this.iilIIliIlIIiIIliIl.remove(var15.iliIlIiIIl);
      }

      this.Illillliilli(pz);
      if (this.iilIIliIlIIiIIliIl.size() > 320) {
         this.IIlilIliiIli(now, px);
      }

      double var14 = 1.6777216E7;
      ArrayList var16 = new ArrayList();

      for (iiliIiiIIiiIii var12 : this.iilIIliIlIIiIIliIl.values()) {
         if (var12.IIlilIliiIli(now, px) > var14 && var12.lIIllIiIIl < 40) {
            var16.add(var12);
         }
      }

      for (iiliIiiIIiiIii var18 : var16) {
         this.IlIillIiilIi(var18);
      }
   }

   private iiliIiiIIiiIii Iilililiiili(int radius, int z, int x) {
      iiliIiiIIiiIii var4 = null;
      double var5 = (double)x * (double)x;

      for (iiliIiiIIiiIii var8 : this.iilIIliIlIIiIIliIl.values()) {
         double var9 = var8.IIlilIliiIli((double)radius, (double)z);
         if (var9 <= var5) {
            var5 = var9;
            var4 = var8;
         }
      }

      return var4;
   }

   public Collection<iiliIiiIIiiIii> iIlIlllllill() {
      return this.iilIIliIlIIiIIliIl.values();
   }

   public List<iiliIiiIIiiIii> Iiiiliiiiiii(double farSlots, double limit, int nearRadius, int minScore, double pz, int px, int memoryMaxY) {
      ArrayList var11 = new ArrayList();
      ArrayList var12 = new ArrayList();
      double var13 = pz * pz;

      for (iiliIiiIIiiIii var16 : this.iilIIliIlIIiIIliIl.values()) {
         if (!var16.lIlllIiIIl && var16.lIIllIiIIl >= nearRadius && (var16.llIllIiIIl || !(var16.iiiIlIiIIl > (double)memoryMaxY))) {
            (var16.IIlilIliiIli(farSlots, limit) <= var13 ? var11 : var12).add(var16);
         }
      }

      Comparator var19 = (pzx, b) -> {
         long var7 = -4677819090088923011L;
         var7 ^= ((long)Integer.compare(b.lIIllIiIIl, pzx.lIIllIiIIl) << 32 ^ var7) & -1L << 32;
         return (int)(var7 >>> 32) != 0 ? (int)(var7 >>> 32) : Double.compare(pzx.IIlilIliiIli(farSlots, limit), b.IIlilIliiIli(farSlots, limit));
      };
      var11.sort(var19);
      var12.sort(var19);
      int var20 = Math.min(var11.size(), Math.max(0, minScore - Math.min(px, var12.size())));
      ArrayList var17 = new ArrayList(var11.subList(0, var20));

      for (int var18 = 0; var18 < var12.size() && var17.size() < minScore; var18++) {
         var17.add((iiliIiiIIiiIii)var12.get(var18));
      }

      return var17;
   }

   public int liiiIIllIl() {
      return this.iilIIliIlIIiIIliIl.size();
   }
}
