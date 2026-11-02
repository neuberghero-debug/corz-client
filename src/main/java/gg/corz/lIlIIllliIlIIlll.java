package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_4076;
import net.minecraft.class_638;
import net.minecraft.class_2902.class_2903;

public final class lIlIIllliIlIIlll implements iiIIIlllIIlIIlll {
   private int llIiiiilll;
   private final Long2ObjectOpenHashMap<iiIlliilIIllliil> liIiiiilll = new Long2ObjectOpenHashMap();
   private int ilIiiiilll;
   private int IlIiiiilll;
   private int IiIiiiilll;
   private class_2818 lIliiiilll;
   private byte[] IIliiiilll;
   private final iIiiIiIlIliiIiIl iiIiiiilll = new iIiiIiIlIliiIiIl();
   private static final int IIIiiiilll = 1024;
   private boolean llliiiilll;
   private int Illiiiilll;
   private int iIliiiilll;
   private static final long lIIiiiilll = 6000000000L;
   private class_638 iIIiiiilll;

   public int Ililllililil() {
      return this.liIiiiilll.size();
   }

   @Override
   public byte[] IliIlllilIi(int sectionY, int sectionX, int sectionZ) {
      long var13 = -6488198523418539137L;
      class_2818 var4 = this.Iiilliiliiil(sectionY, sectionZ);
      if (var4 == null) {
         return null;
      } else {
         var13 ^= ((long)(sectionX - this.IlIiiiilll) << 32 ^ var13) & -1L << 32;
         if ((int)(var13 >>> 32) < 0) {
            return illliillIilliill.llIiliiill;
         } else {
            class_2826[] var6 = var4.method_12006();
            if ((int)(var13 >>> 32) >= var6.length) {
               return illliillIilliill.ilIiliiill;
            } else {
               class_2826 var7 = var6[(int)(var13 >>> 32)];
               if (var7 != null && !var7.method_38292()) {
                  long var8 = class_4076.method_18685(sectionY, sectionX, sectionZ);
                  long var10 = System.nanoTime();
                  iiIlliilIIllliil var12 = (iiIlliilIIllliil)this.liIiiiilll.get(var8);
                  if (var12 != null && var12.iliIIiilil == var7 && var10 - var12.IiiIIiilil < 6000000000L) {
                     return var12.liiIIiilil;
                  } else {
                     if (var12 == null) {
                        if (this.liIiiiilll.size() >= 1024) {
                           this.liIiiiilll.clear();
                           this.llliiiilll = false;
                           var4 = this.Iiilliiliiil(sectionY, sectionZ);
                           if (var4 == null) {
                              return null;
                           }
                        }

                        var12 = new iiIlliilIIllliil();
                        this.liIiiiilll.put(var8, var12);
                     }

                     this.IIIilIIiiIIi(var7, var12.liiIIiilil);
                     var12.iliIIiilil = var7;
                     var12.IiiIIiilil = var10;
                     return var12.liiIIiilil;
                  }
               } else {
                  return illliillIilliill.ilIiliiill;
               }
            }
         }
      }
   }

   @Override
   public int IilliliilIIi() {
      return this.IiIiiiilll;
   }

   private class_2818 Iiilliiliiil(int chunkX, int chunkZ) {
      if (this.llliiiilll && this.iIliiiilll == chunkX && this.Illiiiilll == chunkZ) {
         return this.lIliiiilll;
      } else {
         class_2818 var3 = this.iIIiiiilll == null ? null : this.iIIiiiilll.method_2935().method_21730(chunkX, chunkZ);
         this.lIliiiilll = var3;
         this.iIliiiilll = chunkX;
         this.Illiiiilll = chunkZ;
         this.llliiiilll = true;
         return var3;
      }
   }

   @Override
   public int iIlIlllllill() {
      return this.ilIiiiilll;
   }

   public void Iilllilliill(int x, int y, int z) {
      this.liIiiiilll.remove(class_4076.method_18685(x >> 4, y >> 4, z >> 4));
   }

   public void IIillIiliIil(int chunkX, int chunkZ) {
      long var4 = 1653836626254137056L;

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < this.llIiiiilll; var6 += 4294967296L) {
         this.liIiiiilll.remove(class_4076.method_18685(chunkX, this.IlIiiiilll + (int)(var6 >>> 32), chunkZ));
      }

      this.llliiiilll = false;
   }

   private void IIIilIIiiIIi(class_2826 sec, byte[] out) {
      long var7 = 3625428711487532326L;
      long var9 = 8929322960137324019L;
      this.iiIiiiilll.iIlIlllllill(sec);
      var7 ^= ((long)this.iiIiiiilll.iIlilliIll << 32 ^ var7) & -1L << 32;
      if (this.IIliiiilll.length < (int)(var7 >>> 32)) {
         this.IIliiiilll = new byte[Math.max((int)(var7 >>> 32), this.IIliiiilll.length * 2)];
      }

      class_2680[] var4 = this.iiIiiiilll.lIlilliIll;

      for (long var12 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         this.IIliiiilll[(int)var12] = iiiliIIiIIIiiIIi.IliIlllilIi(var4[(int)var12]);
      }

      int[] var5 = this.iiIiiiilll.IIlilliIll;

      for (long var13 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var13 >>> 32) < 4096; var13 += 4294967296L) {
         out[(int)(var13 >>> 32)] = this.IIliiiilll[var5[(int)(var13 >>> 32)]];
      }
   }

   public void Illlllllilll() {
      this.liIiiiilll.clear();
      this.llliiiilll = false;
      this.lIliiiilll = null;
   }

   public lIlIIllliIlIIlll() {
      this.IIliiiilll = new byte[64];
   }

   public void IIlllIlliIll(class_638 w) {
      if (w != this.iIIiiiilll) {
         this.iIIiiiilll = w;
         this.Illlllllilll();
      }

      if (w != null) {
         this.IlIiiiilll = w.method_32891();
         this.llIiiiilll = w.method_32890();
         this.ilIiiiilll = w.method_31607();
         this.IiIiiiilll = w.method_31600() + 1;
      }

      this.llliiiilll = false;
   }

   @Override
   public int liiiIIllIl(int x, int z) {
      class_2818 var3 = this.Iiilliiliiil(x >> 4, z >> 4);
      return var3 == null ? Integer.MIN_VALUE : var3.method_12005(class_2903.field_13202, x, z) + 1;
   }
}
