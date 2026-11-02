package gg.corz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class IilIllIililIllIi {
   private final Set<Long> IlIlIiIIIi;
   private int IliIIiIIIi;
   private int ilIlIiIIIi;
   private int iiiIIiIIIi;
   private int llIlIiIIIi;
   private int lIiIIiIIIi;
   private final Set<Long> IIIlIiIIIi;
   private int llllIiIIIi;
   public static final int lllIIiIIIi = 10;
   private long illlIiIIIi;
   private int liIlIiIIIi;
   private int IlllIiIIIi;
   public static final int illIIiIIIi = 4;
   private int iIiIIiIIIi;
   private long iilIIiIIIi;
   private long IIiIIiIIIi;
   private final Set<Long> lIIlIiIIIi;
   private int IiiIIiIIIi;
   private IliiIiIilliiIiIi iIllIiIIIi;
   private int iiIlIiIIIi;
   private int liiIIiIIIi;
   private boolean lIllIiIIIi;
   private int iliIIiIIIi;
   public static final int IilIIiIIIi = 3;
   private final Set<Long> iIIlIiIIIi;
   private int IIllIiIIIi;
   private int lliIIiIIIi;
   private long lilIIiIIIi = 1L;
   private int IiIlIiIIIi;
   private long IillIiIIIi;

   public boolean liiiIIllIl() {
      return this.lIllIiIIIi;
   }

   public iilIlIlIIiIlIl IIlilIliiIli(int tick) {
      if (!this.lIllIiIIIi) {
         return null;
      } else {
         this.lIllIiIIIi = false;
         this.iIllIiIIIi = IliiIiIilliiIiIi.iIIiiIiIIi;
         this.IlllIiIIIi++;
         this.illlIiIIIi = this.illlIiIIIi + (long)this.iIiIIiIIIi;
         this.IillIiIIIi = this.IillIiIIIi + (long)this.IliIIiIIIi;
         this.llllIiIIIi = this.llllIiIIIi + this.iiiIIiIIIi;
         return new iilIlIlIIiIlIl(
            this.iilIIiIIIi,
            this.IIiIIiIIIi,
            this.iIiIIiIIIi,
            this.IliIIiIIIi,
            this.IIIlIiIIIi.size(),
            this.lliIIiIIIi,
            this.iliIIiIIIi,
            this.IiiIIiIIIi,
            tick - this.lIiIIiIIIi,
            this.liiIIiIIIi,
            this.iiiIIiIIIi,
            this.iIIlIiIIIi.size()
         );
      }
   }

   public long iIlIlllllill() {
      return this.IIiIIiIIIi;
   }

   public int Iliilliiilii() {
      return this.iIiIIiIIIi;
   }

   public iilIlIlIIiIlIl Iilllilliill(int sy, int sz, int usefulBlocks, int tick, int sx) {
      return this.Illlllllilll(sy, sz, usefulBlocks, null, tick, 0L, false, sx);
   }

   public void IiIiliIiiiIi(long assetKey) {
      if (this.lIllIiIIIi && assetKey != 0L) {
         this.IlIlIiIIIi.add(assetKey);
      }
   }

   public int iliIiiliiiii() {
      return this.iiiIIiIIIi;
   }

   public void IlIillIiilIi() {
      if (this.lIllIiIIIi) {
         this.IiiIIiIIIi++;
      }
   }

   public long IilliliilIIi() {
      return this.iilIIiIIIi;
   }

   public void IIIilIIiiIIi() {
      if (this.lIllIiIIIi) {
         this.iliIIiIIIi++;
      }
   }

   public iilIlIlIIiIlIl Illlllllilll(int supersede, int usefulBlocks, int targets, List<Long> sz, int sy, long tick, boolean assetKey, int sx) {
      long var17 = -2406263573243768765L;
      long var19 = 1092636063147242068L;
      iilIlIlIIiIlIl var10 = null;
      if (this.lIllIiIIIi && !this.IiIlliIliiIl(supersede, usefulBlocks, targets, sz, tick)) {
         var10 = this.IIlilIliiIli(sx);
      }

      if (!this.lIllIiIIIi) {
         this.lIllIiIIIi = true;
         this.iilIIiIIIi = this.lilIIiIIIi++;
         this.IIiIIiIIIi = IliIlllilIi(supersede, usefulBlocks, targets);
         this.lIiIIiIIIi = sx;
         this.iIiIIiIIIi = 0;
         this.IliIIiIIIi = 0;
         this.lliIIiIIIi = 0;
         this.iliIIiIIIi = 0;
         this.IiiIIiIIIi = 0;
         this.liiIIiIIIi = 0;
         this.iiiIIiIIIi = 0;
         this.IIIlIiIIIi.clear();
         this.lIIlIiIIIi.clear();
         this.iIIlIiIIIi.clear();
         this.IlIlIiIIIi.clear();
         this.llIlIiIIIi = this.ilIlIiIIIi = this.IiIlIiIIIi = Integer.MAX_VALUE;
         this.liIlIiIIIi = this.iiIlIiIIIi = this.IIllIiIIIi = Integer.MIN_VALUE;
         this.iIllIiIIIi = IliiIiIilliiIiIi.iiiliIiIIi;
      } else {
         this.iIllIiIIIi = assetKey ? IliiIiIilliiIiIi.lIIiiIiIIi : IliiIiIilliiIiIi.IIIiiIiIIi;
         if (assetKey) {
            this.iiiIIiIIIi++;
         }
      }

      this.IliIIiIIIi = this.IliIIiIIIi + Math.max(0, sy);
      this.liiIIiIIIi++;
      this.lIIlIiIIIi.add(llIiIiililIiIiil.IIIllIIliIIl(supersede, usefulBlocks, targets));
      if (tick != 0L) {
         this.IlIlIiIIIi.add(tick);
      }

      if (sz != null) {
         for (long var12 : sz) {
            if (this.iIIlIiIIIi.add(var12)) {
               long var21 = var17 ^ ((long)llIiIiililIiIiil.IiIlliIliiIl(var12) << 32 ^ var17) & -1L << 32;
               var17 = var21 ^ ((long)llIiIiililIiIiil.IIlllIlliIll(var12) ^ var21) & -1L >>> 32;
               var19 ^= ((long)llIiIiililIiIiil.Illlllllilll(var12) << 32 ^ var19) & -1L << 32;
               this.llIlIiIIIi = Math.min(this.llIlIiIIIi, (int)(var17 >>> 32));
               this.ilIlIiIIIi = Math.min(this.ilIlIiIIIi, (int)var17);
               this.IiIlIiIIIi = Math.min(this.IiIlIiIIIi, (int)(var19 >>> 32));
               this.liIlIiIIIi = Math.max(this.liIlIiIIIi, (int)(var17 >>> 32));
               this.iiIlIiIIIi = Math.max(this.iiIlIiIIIi, (int)var17);
               this.IIllIiIIIi = Math.max(this.IIllIiIIIi, (int)(var19 >>> 32));
            }
         }
      }

      return var10;
   }

   public int IIIllIIliIIl() {
      return this.llllIiIIIi + (this.lIllIiIIIi ? this.iiiIIiIIIi : 0);
   }

   public void Ililllililil(long standKey) {
      if (this.lIllIiIIIi) {
         this.iIiIIiIIIi++;
         this.IIIlIiIIIi.add(standKey);
      }
   }

   public int Iiiiliiiiiii() {
      return this.liiIIiIIIi;
   }

   public int Illillliilli() {
      return this.IlllIiIIIi;
   }

   public double IIiilIiiiIii() {
      return this.IillIiIIIi == 0L ? 0.0 : (double)this.illlIiIIIi / (double)this.IillIiIIIi;
   }

   public double Iilililiiili() {
      return this.IlllIiIIIi == 0 ? 0.0 : (double)this.illlIiIIIi / (double)this.IlllIiIIIi;
   }

   public void Iiilliiliiil() {
      if (this.lIllIiIIIi) {
         this.lliIIiIIIi++;
      }
   }

   public static long IliIlllilIi(int x, int y, int z) {
      return llIiIiililIiIiil.IIIllIIliIIl(x >> 3, y >> 2, z >> 3);
   }

   public int IlIlllIlilIl() {
      return this.iIIlIiIIIi.size();
   }

   public iilIlIlIIiIlIl IIillIiliIil(int sy, int sx, int sz, int tick, long expectedBlocks, int assetKey) {
      iilIlIlIIiIlIl var8 = this.IIlilIliiIli(assetKey);
      this.Illlllllilll(sy, sx, sz, null, tick, expectedBlocks, false, assetKey);
      return var8;
   }

   public IliiIiIilliiIiIi lIiiIiIlilli() {
      return this.iIllIiIIIi;
   }

   public boolean IiIlliIliiIl(int sy, int sx, int sz, List<Long> targets, long assetKey) {
      long var13 = 3019729848581631767L;
      long var15 = 2715002582077259776L;
      if (!this.lIllIiIIIi) {
         return false;
      } else if (assetKey != 0L && this.IlIlIiIIIi.contains(assetKey)) {
         return true;
      } else {
         for (long var8 : this.lIIlIiIIIi) {
            if (IIlllIlliIll(var8, sy, sx, sz)) {
               return true;
            }
         }

         for (long var19 : this.IIIlIiIIIi) {
            if (IIlllIlliIll(var19, sy, sx, sz)) {
               return true;
            }
         }

         if (targets != null && !this.iIIlIiIIIi.isEmpty()) {
            for (long var20 : targets) {
               var13 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var20) << 32 ^ var13) & -1L << 32;
               var13 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var20) ^ var13) & -1L >>> 32;
               var15 ^= ((long)llIiIiililIiIiil.Illlllllilll(var20) << 32 ^ var15) & -1L << 32;
               if ((int)(var13 >>> 32) >= this.llIlIiIIIi - 3
                  && (int)(var13 >>> 32) <= this.liIlIiIIIi + 3
                  && (int)var13 >= this.ilIlIiIIIi - 3
                  && (int)var13 <= this.iiIlIiIIIi + 3
                  && (int)(var15 >>> 32) >= this.IiIlIiIIIi - 3
                  && (int)(var15 >>> 32) <= this.IIllIiIIIi + 3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean IIlllIlliIll(long stand, int z, int x, int y) {
      return Math.abs(llIiIiililIiIiil.IiIlliIliiIl(stand) - z) <= 10
         && Math.abs(llIiIiililIiIiil.Illlllllilll(stand) - y) <= 10
         && Math.abs(llIiIiililIiIiil.IIlllIlliIll(stand) - x) <= 4;
   }

   public IilIllIililIllIi() {
      this.IIiIIiIIIi = Long.MIN_VALUE;
      this.IIIlIiIIIi = new HashSet<>();
      this.lIIlIiIIIi = new HashSet<>();
      this.iIIlIiIIIi = new HashSet<>();
      this.IlIlIiIIIi = new HashSet<>();
      this.iIllIiIIIi = IliiIiIilliiIiIi.iIIiiIiIIi;
   }
}
