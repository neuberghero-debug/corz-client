package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class lIiiIIiiIiiIIi {
   private long IiilIIIiiliilIIIii;
   private int IlIiIIIiillIiIIIii;
   private int iiilIIIiiIIIiIIIii;
   public static final int IIilIIIiilIilIIIii = 256;
   private int lIIiIIIiiiIIiIIIii;
   private final LinkedHashMap<Long, iIlIliIlIllIliIl> iIilIIIiiIlilIIIii = new LinkedHashMap<>();
   private final HashMap<Long, Long> llilIIIiiililIIIii = new HashMap<>();

   public List<liiililiiiilil> Iilililiiili() {
      ArrayList var1 = new ArrayList(this.iIilIIIiiIlilIIIii.size());

      for (iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public int Iiilliiliiil() {
      return this.iiilIIIiiIIIiIIIii;
   }

   public void IiIlliIliiIl(long cell) {
      Long var3 = this.llilIIIiiililIIIii.remove(cell);
      if (var3 != null) {
         this.lIIiIIIiiiIIiIIIii++;
         iIlIliIlIllIliIl var4 = this.iIilIIIiiIlilIIIii.get(var3);
         if (var4 != null) {
            if (var4.IliIlllilIi()) {
               this.iiilIIIiiIIIiIIIii++;
            }

            var4.lIliiliIll.remove(Long.valueOf(cell));
            if (var4.lIliiliIll.isEmpty()) {
               var4.IIliiliIll = llliillilliill.iiIIlllIiIIlIlllIi;
            }
         }
      }
   }

   public lIiiIIiiIiiIIi() {
      this.IiilIIIiiliilIIIii = 1L;
   }

   public int IIillIiliIil(llliillilliill s) {
      long var5 = -8707627282194286701L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (iIlIliIlIllIliIl var4 : this.iIilIIIiiIlilIIIii.values()) {
         if (var4.IIliiliIll == s) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public long IilliliilIIi(long cell) {
      return this.llilIIIiiililIIIii.getOrDefault(cell, 0L);
   }

   public void IIIllIIliIIl(long networkId, long feetCell) {
      iIlIliIlIllIliIl var5 = this.iIilIIIiiIlilIIIii.get(networkId);
      if (var5 != null && var5.IIliiliIll == llliillilliill.llIIlllIiilIIlllIi) {
         if (!var5.lIliiliIll.contains(Long.valueOf(feetCell)) && !var5.lIliiliIll.contains(Long.valueOf(IIIIllIIIl(feetCell)))) {
            var5.IIliiliIll = llliillilliill.IiIIlllIiliIIlllIi;
         }
      }
   }

   public void IlIlllIlilIl(long ownerKey, long networkId) {
      iIlIliIlIllIliIl var5 = this.iIilIIIiiIlilIIIii.get(ownerKey);
      if (var5 != null && var5.IIliiliIll != llliillilliill.iiIIlllIiIIlIlllIi) {
         var5.IIliiliIll = llliillilliill.iIIIlllIiIlIIlllIi;
         var5.iiIiiliIll = networkId;
      }
   }

   public long[] Illillliilli(llliillilliill s) {
      long var7 = 5593966621671252770L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for (iIlIliIlIllIliIl var4 : this.iIilIIIiiIlilIIIii.values()) {
         if (var4.IIliiliIll == s) {
            var7 += 4294967296L;
         }
      }

      long[] var9 = new long[(int)(var7 >>> 32)];
      var7 ^= (0L ^ var7) & -1L >>> 32;

      for (iIlIliIlIllIliIl var6 : this.iIilIIIiiIlilIIIii.values()) {
         if (var6.IIliiliIll == s) {
            int var10001 = (int)var7;
            var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
            var9[var10001] = var6.IiIiiliIll;
         }
      }

      return var9;
   }

   public void IIiilIiiiIii() {
      this.iIilIIIiiIlilIIIii.clear();
      this.llilIIIiiililIIIii.clear();
      this.IiilIIIiiliilIIIii = 1L;
      this.iiilIIIiiIIIiIIIii = 0;
      this.lIIiIIIiiiIIiIIIii = 0;
      this.IlIiIIIiillIiIIIii = 0;
   }

   public String Iliilliiilii() {
      return iIIIlIlIIl<"iIIIlIlIIl","WTpmPku0l5cbGbiojsStU+DIHN0TUdZH1TrFzpwH8jtO1X3eGQ==">()
         + this.iIilIIIiiIlilIIIii.size()
         + iIIIlIlIIl<"iIIIlIlIIl","eMxGDyEzGGrPsxtx5G5p2RJOKE3XqrftDjM2IWdYLmVRjgrb">()
         + this.IIillIiliIil(llliillilliill.iIIIlllIiIlIIlllIi)
         + iIIIlIlIIl<"iIIIlIlIIl","3KbwMWs2TmJv+E6JTm8Mnt58OSkHh6gLo9pBdqAS7P1Ltj9k">()
         + this.IIillIiliIil(llliillilliill.llIIlllIiilIIlllIi)
         + iIIIlIlIIl<"iIIIlIlIIl","IN6Akc+Jf57kG0oUIbS+Av7ZjXg8dieVK68wSgkm5WYW0bhxHWbr/og=">()
         + this.IIillIiliIil(llliillilliill.IiIIlllIiliIIlllIi)
         + iIIIlIlIIl<"iIIIlIlIIl","F+H5eJJ1M1flCZjou61No5yzOAgOBJbKCkHw3H0hbqlimJrGog==">()
         + this.IIillIiliIil(llliillilliill.iiIIlllIiIIlIlllIi)
         + iIIIlIlIIl<"iIIIlIlIIl","NpFp39jVAuo5vNrGmB3SEZj8sIxILnurs0C81GCQQUQeczTMkOM=">()
         + this.Iilllilliill()
         + iIIIlIlIIl<"iIIIlIlIIl","pj9uk8N8m2eelHWS8+XAU6O/CT0s/NYIEIxwnQngK4FnRYgKrMnTW7T7">()
         + this.IIlllIlliIll().size()
         + iIIIlIlIIl<"iIIIlIlIIl","sc2o4mRGgr7ieCMk5umqECrwGWdnlFaUSuyiAhpy6f0DR+e7/nUlpYRm">()
         + this.lIIiIIIiiiIIiIIIii
         + iIIIlIlIIl<"iIIIlIlIIl","dhWcdTl8upIdryMfRm3qqvXxD2uFAx3FXhn863zhUq9ZHwrHTc+WNroXNy6gut+G">()
         + this.iiilIIIiiIIIiIIIii
         + iIIIlIlIIl<"iIIIlIlIIl","83z0KseHFg9dwq+jxqUCXawxoNpxxGn8qYZGRsFEIZsCIV1Mag==">()
         + this.IlIiIIIiillIiIIIii;
   }

   public int IlIillIiilIi() {
      return this.IlIiIIIiillIiIIIii;
   }

   public void iliIiiliiiii(long networkId) {
      iIlIliIlIllIliIl var3 = this.iIilIIIiiIlilIIIii.get(networkId);
      if (var3 != null && var3.IIliiliIll == llliillilliill.iIIIlllIiIlIIlllIi) {
         var3.IIliiliIll = llliillilliill.llIIlllIiilIIlllIi;
      }
   }

   public liiililiiiilil IIlilIliiIli(long networkId) {
      iIlIliIlIllIliIl var3 = this.iIilIIIiiIlilIIIii.get(networkId);
      return var3 == null ? null : var3.liiiIIllIl();
   }

   public int IiIiliIiiiIi() {
      return this.iIilIIIiiIlilIIIii.size();
   }

   public Set<Long> Ililllililil(Collection<Long> ownedTempCells) {
      LinkedHashSet var2 = new LinkedHashSet();
      if (ownedTempCells == null) {
         return var2;
      } else {
         for (Long var4 : ownedTempCells) {
            if (var4 != null && !this.llilIIIiiililIIIii.containsKey(var4)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public Set<Long> IIlllIlliIll() {
      LinkedHashSet var1 = new LinkedHashSet();

      for (iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         if (var3.IIliiliIll == llliillilliill.IiIIlllIiliIIlllIi) {
            var1.addAll(var3.lIliiliIll);
         }
      }

      return Collections.unmodifiableSet(var1);
   }

   public int IIIilIIiiIIi() {
      return this.lIIiIIIiiiIIiIIIii;
   }

   public void liiiIIllIl(long networkId, long cell) {
      iIlIliIlIllIliIl var5 = this.iIilIIIiiIlilIIIii.get(networkId);
      if (var5 != null && var5.IIliiliIll != llliillilliill.iiIIlllIiIIlIlllIi) {
         Long var6 = this.llilIIIiiililIIIii.put(cell, networkId);
         if (var6 != null && var6 != networkId) {
            iIlIliIlIllIliIl var7 = this.iIilIIIiiIlilIIIii.get(var6);
            if (var7 != null) {
               var7.lIliiliIll.remove(Long.valueOf(cell));
            }
         }

         var5.lIliiliIll.add(Long.valueOf(cell));
      }
   }

   private static long IIIIllIIIl(long cell) {
      return llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(cell), llIiIiililIiIiil.IIlllIlliIll(cell) - 1, llIiIiililIiIiil.Illlllllilll(cell));
   }

   public long IliIlllilIi(long tick, int ownerKey) {
      while (this.iIilIIIiiIlilIIIii.size() >= 256) {
         this.Iiiiliiiiiii();
      }

      long var4 = this.IiilIIIiiliilIIIii++;
      this.iIilIIIiiIlilIIIii.put(Long.valueOf(var4), new iIlIliIlIllIliIl(var4, tick, ownerKey));
      return var4;
   }

   public int Iilllilliill() {
      long var4 = 2117953152477494070L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         if (var3.IIliiliIll != llliillilliill.iiIIlllIiIIlIlllIi) {
            var4 ^= ((long)((int)(var4 >>> 32) + var3.lIliiliIll.size()) << 32 ^ var4) & -1L << 32;
         }
      }

      return (int)(var4 >>> 32);
   }

   private void Iiiiliiiiiii() {
      iIlIliIlIllIliIl var1 = null;

      for (iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         if (var3.IIliiliIll == llliillilliill.iiIIlllIiIIlIlllIi) {
            var1 = var3;
            break;
         }
      }

      if (var1 == null) {
         var1 = this.iIilIIIiiIlilIIIii.values().iterator().next();
      }

      this.iIilIIIiiIlilIIIii.remove(Long.valueOf(var1.IiIiiliIll));

      for (Long var5 : var1.lIliiliIll) {
         this.llilIIIiiililIIIii.remove(var5, var1.IiIiiliIll);
      }

      this.IlIiIIIiillIiIIIii++;
   }

   public void iIlIlllllill(long networkId, long target) {
      iIlIliIlIllIliIl var5 = this.iIilIIIiiIlilIIIii.get(networkId);
      if (var5 != null) {
         var5.iIliiliIll.add(Long.valueOf(target));
      }
   }

   public boolean Illlllllilll(long cell) {
      Long var3 = this.llilIIIiiililIIIii.get(cell);
      if (var3 == null) {
         return false;
      } else {
         iIlIliIlIllIliIl var4 = this.iIilIIIiiIlilIIIii.get(var3);
         return var4 != null && var4.IliIlllilIi();
      }
   }

   public llliillilliill lIiiIiIlilli(long networkId) {
      iIlIliIlIllIliIl var3 = this.iIilIIIiiIlilIIIii.get(networkId);
      return var3 == null ? null : var3.IIliiliIll;
   }
}
