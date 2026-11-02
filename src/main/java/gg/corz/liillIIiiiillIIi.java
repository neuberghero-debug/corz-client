package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class liillIIiiiillIIi {
   private final iiIiIiilIIliIiil iliIIIiiil;
   private final ArrayList<iIIiliIlIili> IiiIIIiiil;
   private int iIIlIIiiil;
   private long[] IIIlIIiiil;
   private int IlIlIIiiil;
   private int lIIlIIiiil;
   private final int[] iiiIIIiiil;
   private final IIIiiIIllIIiiIIl IliIIIiiil = new IIIiiIIllIIiiIIl();
   private final iilIIiIiIIiIIiIi lliIIIiiil = new iilIIiIiIIiIIiIi(4096);
   private final int[] liiIIIiiil;

   public int liiiIIllIl() {
      return this.lIIlIIiiil;
   }

   public int IilliliilIIi() {
      return this.iIIlIIiiil;
   }

   public List<iIIiliIlIili> IliIlllilIi() {
      return this.IiiIIIiiil;
   }

   private boolean IIlllIlliIll(byte[] y, int lx, int x, int sec, int minY, int ly, int z, int lz) {
      long var10 = 7774926184703642954L;
      if (minY > 0 && minY < 15 && ly > 0 && ly < 15 && z > 0 && z < 15) {
         var10 ^= ((long)(ly << 8 | z << 4 | minY) << 32 ^ var10) & -1L << 32;
         return (y[(int)(var10 >>> 32) + 1] & 3) != 1
            || (y[(int)(var10 >>> 32) - 1] & 3) != 1
            || (y[(int)(var10 >>> 32) + 16] & 3) != 1
            || (y[(int)(var10 >>> 32) - 16] & 3) != 1
            || (y[(int)(var10 >>> 32) + 256] & 3) != 1
            || (y[(int)(var10 >>> 32) - 256] & 3) != 1;
      } else {
         return x - 1 < lz
            ? true
            : !illliillIilliill.IilliliilIIi(this.IliIIIiiil.Ililllililil(lx + 1, x, sec))
               || !illliillIilliill.IilliliilIIi(this.IliIIIiiil.Ililllililil(lx - 1, x, sec))
               || !illliillIilliill.IilliliilIIi(this.IliIIIiiil.Ililllililil(lx, x + 1, sec))
               || !illliillIilliill.IilliliilIIi(this.IliIIIiiil.Ililllililil(lx, x - 1, sec))
               || !illliillIilliill.IilliliilIIi(this.IliIIIiiil.Ililllililil(lx, x, sec + 1))
               || !illliillIilliill.IilliliilIIi(this.IliIIIiiil.Ililllililil(lx, x, sec - 1));
      }
   }

   private void Illlllllilll(long chunkKey) {
      long var4 = -315732990375544781L;
      if (chunkKey != Long.MIN_VALUE) {
         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < this.lIIlIIiiil; var6 += 4294967296L) {
            if (this.IIIlIIiiil[(int)(var6 >>> 32)] == chunkKey) {
               return;
            }
         }

         if (this.lIIlIIiiil == this.IIIlIIiiil.length) {
            this.IIIlIIiiil = Arrays.copyOf(this.IIIlIIiiil, this.lIIlIIiiil * 2);
         }

         this.IIIlIIiiil[this.lIIlIIiiil++] = chunkKey;
      }
   }

   public void IIIllIIliIIl() {
      Arrays.fill(this.iiiIIIiiil, 0);
   }

   public liillIIiiiillIIi() {
      this.iliIIIiiil = (y, z, x) -> this.lliIIIiiil.IilliliilIIi(iiIIIlllIIlIIlll.IiIlliIliiIl(y, z, x));
      this.IiiIIIiiil = new ArrayList<>();
      this.liiIIIiiil = new int[256];
      this.iiiIIIiiil = new int[16];
      this.IIIlIIiiil = new long[8];
   }

   public int lIiiIiIlilli() {
      return this.IlIlIIiiil;
   }

   public IIIiiIIllIIiiIIl IlIlllIlilIl() {
      return this.IliIIIiiil;
   }

   public boolean IiIlliIliiIl(iiIIIlllIIlIIlll world, int chunkX, int params, IiIiliIiliIiliIi chunkZ) {
      long var33 = -1894707999661127096L;
      long var35 = 4593360142850318147L;
      long var37 = -5891791054985789242L;
      long var23 = -6546246682475481842L;
      long var39 = 1165105592641576229L;
      long var25 = 6653285461506382920L;
      long var27 = -2560766675863374944L;
      long var29 = 8652811122385659610L;
      long var31 = 2731130757234746721L;
      this.IiiIIIiiil.clear();
      this.lliIIIiiil.liiiIIllIl();
      this.lIIlIIiiil = 0;
      this.iIIlIIiiil = 0;
      this.IlIlIIiiil = 0;
      this.IliIIIiiil.IliIlllilIi(world);
      var23 ^= ((long)world.iIlIlllllill() << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)(chunkX << 4) ^ var23) & -1L >>> 32;
      var25 ^= ((long)(params << 4) << 32 ^ var25) & -1L << 32;
      var25 ^= (-2147483648L ^ var25) & -1L >>> 32;
      var27 ^= (0L ^ var27) & -1L << 32;

      while ((int)(var27 >>> 32) < 16) {
         for (var27 ^= (0L ^ var27) & -1L >>> 32; (int)var27 < 16; var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
            var29 ^= ((long)world.liiiIIllIl((int)var23 + (int)var27, (int)(var25 >>> 32) + (int)(var27 >>> 32)) << 32 ^ var29) & -1L << 32;
            if ((int)(var29 >>> 32) == Integer.MIN_VALUE) {
               return false;
            }

            this.liiIIIiiil[(int)(var27 >>> 32) << 4 | (int)var27] = (int)(var29 >>> 32);
            if ((int)(var29 >>> 32) > (int)var25) {
               var25 ^= ((long)((int)(var29 >>> 32)) ^ var25) & -1L >>> 32;
            }
         }

         var27 += 4294967296L;
      }

      var27 ^= ((long)(Math.min((int)var25, world.IilliliilIIi()) - 1) << 32 ^ var27) & -1L << 32;
      if ((int)(var27 >>> 32) < (int)(var23 >>> 32)) {
         return true;
      } else {
         for (long var48 = var27 ^ ((long)((int)(var23 >>> 32) >> 4) ^ var27) & -1L >>> 32;
            (int)var48 <= (int)(var48 >>> 32) >> 4;
            var48 ^= (var48 ^ var48 + (long)1) & -1L >>> 32
         ) {
            byte[] var11 = world.IliIlllilIi(chunkX, (int)var48, params);
            if (var11 == null) {
               return false;
            }

            if (var11 != illliillIilliill.llIiliiill && var11 != illliillIilliill.ilIiliiill) {
               var29 ^= ((long)((int)var48 << 4) ^ var29) & -1L >>> 32;

               for (var31 ^= (0L ^ var31) & -1L << 32; (int)(var31 >>> 32) < 4096; var31 += 4294967296L) {
                  if ((var11[(int)(var31 >>> 32)] & 3) == 1) {
                     var31 ^= ((long)((int)(var31 >>> 32) >> 8) ^ var31) & -1L >>> 32;
                     var33 ^= ((long)((int)(var31 >>> 32) >> 4 & 15) << 32 ^ var33) & -1L << 32;
                     var33 ^= ((long)((int)(var31 >>> 32) & 15) ^ var33) & -1L >>> 32;
                     var35 ^= ((long)((int)var29 + (int)var31) << 32 ^ var35) & -1L << 32;
                     if ((int)(var35 >>> 32) >= (int)(var23 >>> 32) && (int)(var35 >>> 32) < this.liiIIIiiil[(int)(var33 >>> 32) << 4 | (int)var33]) {
                        var35 ^= ((long)((int)var23 + (int)var33) ^ var35) & -1L >>> 32;
                        var37 ^= ((long)((int)(var25 >>> 32) + (int)(var33 >>> 32)) << 32 ^ var37) & -1L << 32;
                        if (this.IIlllIlliIll(
                              var11, (int)var35, (int)(var35 >>> 32), (int)(var37 >>> 32), (int)var33, (int)var31, (int)(var33 >>> 32), (int)(var23 >>> 32)
                           )
                           && !this.lliIIIiiil.IilliliilIIi(iiIIIlllIIlIIlll.IiIlliIliiIl((int)var35, (int)(var35 >>> 32), (int)(var37 >>> 32)))) {
                           var37 ^= ((long)this.IliIIIiiil.IIIilIIiiIIi((int)var35, (int)(var35 >>> 32), (int)(var37 >>> 32), chunkZ, this.iliIIIiiil) ^ var37)
                              & -1L >>> 32;
                           this.iIIlIIiiil++;
                           this.iiiIIIiiil[(int)var37]++;
                           var39 ^= ((long)this.IliIIIiiil.IIIllIIliIIl() << 32 ^ var39) & -1L << 32;
                           this.IlIlIIiiil += (int)(var39 >>> 32);

                           for (var39 ^= (0L ^ var39) & -1L >>> 32; (int)var39 < (int)(var39 >>> 32); var39 ^= (var39 ^ var39 + (long)1) & -1L >>> 32) {
                              this.lliIIIiiil
                                 .lIiiIiIlilli(
                                    iiIIIlllIIlIIlll.IiIlliIliiIl(
                                       this.IliIIIiiil.IlIlllIlilIl((int)var39),
                                       this.IliIIIiiil.IiIlliIliiIl((int)var39),
                                       this.IliIIIiiil.IIlllIlliIll((int)var39)
                                    )
                                 );
                           }

                           if ((int)var37 == 0) {
                              this.IiiIIIiiil.add(this.IliIIIiiil.lIiiIiIlilli());
                           } else if ((int)var37 == 4) {
                              this.Illlllllilll(this.IliIIIiiil.iliIiiliiiii());
                           }
                        }
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   public int iliIiiliiiii(int reason) {
      return this.iiiIIIiiil[reason];
   }

   public long iIlIlllllill(int i) {
      return this.IIIlIIiiil[i];
   }
}
