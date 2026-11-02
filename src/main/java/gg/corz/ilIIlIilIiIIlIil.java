package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.LongPredicate;

public final class ilIIlIilIiIIlIil implements IlIIlIilllIIlIil {
   private final IlIIlIilllIIlIil lIIIiiIIil;
   private boolean[] IIIliiIIil;
   private int IllliiIIil;
   private float[] liiIiiIIil;
   private int lIlliiIIil;
   private int[] iIIliiIIil;
   private int[] iilIiiIIil;
   private final lIiiiIlliIiiiIll IlIIiiIIil;
   private final Long2DoubleOpenHashMap iIlIiiIIil;
   private final iilIiiIIiIii llIIiiIIil;
   private IliIIilliIIi IilliiIIil;
   private final int iiIIiiIIil;
   private double[] llIliiIIil;
   private int illliiIIil;
   private ilIilIilIiIilIil lilliiIIil;
   private final liiIIlliiiIIll iIIIiiIIil;
   private double[] IliIiiIIil;
   private double[] iliIiiIIil;
   private double[] IiiIiiIIil;
   private int[] iIiIiiIIil;
   private int iIlliiIIil;
   private final LongPredicate ilIIiiIIil;
   private final Long2FloatOpenHashMap illIiiIIil;
   private boolean[] lIIliiIIil;
   private int[] IlIliiIIil;
   private int[] IIiIiiIIil;
   private int lilIiiIIil;
   private int IiIliiIIil;
   private final int liIIiiIIil;
   private int[] lIiIiiIIil;
   private int IIlliiIIil;
   private final Long2IntOpenHashMap IilIiiIIil;
   private final Long2IntOpenHashMap IllIiiIIil;
   private double[] lliIiiIIil;
   private double lllliiIIil;
   private final Long2DoubleOpenHashMap lllIiiIIil;
   private final double IIlIiiIIil;
   private final int IiIIiiIIil;
   private final double[] iiIliiIIil;
   private int liIliiIIil;
   private double[] ilIliiIIil;
   private byte[] iiiIiiIIil;
   private final Long2ByteOpenHashMap lIlIiiIIil;

   private int Iilililiiili(int x, int y, int z, double key, long g) {
      long var11 = -5178053147450151669L;
      if (this.lilIiiIIil == this.iilIiiIIil.length) {
         this.IIiilIiiiIii(this.lilIiiIIil * 2);
      }

      var11 ^= ((long)(this.lilIiiIIil++) << 32 ^ var11) & -1L << 32;
      this.iilIiiIIil[(int)(var11 >>> 32)] = x;
      this.IIiIiiIIil[(int)(var11 >>> 32)] = y;
      this.lIiIiiIIil[(int)(var11 >>> 32)] = z;
      this.IliIiiIIil[(int)(var11 >>> 32)] = key;
      this.lliIiiIIil[(int)(var11 >>> 32)] = Double.MAX_VALUE;
      double var9 = this.iIIIiiIIil == null ? 0.0 : this.iIIIiiIIil.liiiIIllIl(x, key, z);
      this.iliIiiIIil[(int)(var11 >>> 32)] = Double.isFinite(var9) ? Math.max(0.0, var9) : 0.0;
      this.IiiIiiIIil[(int)(var11 >>> 32)] = 0.0;
      this.iIiIiiIIil[(int)(var11 >>> 32)] = -1;
      this.IilIiiIIil.put(g, (int)(var11 >>> 32));
      return (int)(var11 >>> 32);
   }

   private boolean IIIilIIiiIIi(int h, int x, double z) {
      long var6 = 538365067621878208L;
      if (this.Iiilliiliiil(h, x, z, z + 1.8)) {
         return false;
      } else {
         var6 ^= ((long)this.iIlIlllllill(h, IIIiIllIIiIl.lIiiIiIlilli(z), x) << 32 ^ var6) & -1L << 32;
         return ((int)(var6 >>> 32) & 1311) == 0;
      }
   }

   @Override
   public double liiiIIllIl(int y, int z, int x) {
      long var4 = IIIiIllIIiIl.iIlIlllllill(y, z, x);
      double var6 = this.iIlIiiIIil.get(var4);
      if (var6 == Double.NEGATIVE_INFINITY) {
         var6 = this.lIIIiiIIil.liiiIIllIl(y, z, x);
         this.iIlIiiIIil.put(var4, var6);
      }

      return var6;
   }

   private void Ililllililil(int d, int len, int leave, double i) {
      long var23 = -8943882768212932911L;
      long var25 = -7611930328102381822L;
      long var27 = -4898380334031165299L;
      var23 ^= ((long)this.iilIiiIIil[d] << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)this.lIiIiiIIil[d] ^ var23) & -1L >>> 32;
      double var8 = this.IliIiiIIil[d];
      if (leave > 1) {
         var25 ^= ((long)this.iIiIiiIIil[d] << 32 ^ var25) & -1L << 32;
         if ((int)(var25 >>> 32) < 0
            || this.iilIiiIIil[(int)(var25 >>> 32)] != (int)(var23 >>> 32) - IIIiIllIIiIl.IIilIilllIilIill[len]
            || this.lIiIiiIIil[(int)(var25 >>> 32)] != (int)var23 - IIIiIllIIiIl.iIilIillIlilIill[len]) {
            return;
         }
      }

      double var10 = var8 + 3.05;
      if (!this.Iiilliiliiil((int)(var23 >>> 32), (int)var23, var8, var10)) {
         for (var25 ^= (1L ^ var25) & -1L >>> 32; (int)var25 <= leave; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            var27 ^= ((long)((int)(var23 >>> 32) + IIIiIllIIiIl.IIilIilllIilIill[len] * (int)var25) << 32 ^ var27) & -1L << 32;
            var27 ^= ((long)((int)var23 + IIIiIllIIiIl.iIilIillIlilIill[len] * (int)var25) ^ var27) & -1L >>> 32;
            if ((int)var25 > 1) {
               double var15 = IIIiIllIIiIl.IIIllIIliIIl(this, (int)(var27 >>> 32), (int)var27, var8, 1.25, Math.max(0, this.IlIIiiIIil.IliIlllilIi()));
               if (var15 == Double.POSITIVE_INFINITY || !this.IIillIiliIil((int)(var27 >>> 32), (int)var27, var15, var8)) {
                  return;
               }
            }

            if (this.Iiilliiliiil((int)(var27 >>> 32), (int)var27, var8, var10)) {
               return;
            }
         }

         var25 ^= ((long)((int)(var23 >>> 32) + IIIiIllIIiIl.IIilIilllIilIill[len] * (leave + 1)) ^ var25) & -1L >>> 32;
         var27 ^= ((long)((int)var23 + IIIiIllIIiIl.iIilIillIlilIill[len] * (leave + 1)) << 32 ^ var27) & -1L << 32;
         double var14 = IIIiIllIIiIl.IIIllIIliIIl(this, (int)var25, (int)(var27 >>> 32), var8, 0.6, 2);
         if (Double.isFinite(var14)) {
            double var16 = var14 - var8;
            double var18 = leave == 1 ? 0.6 : 0.0;
            if (!(var16 < -1.501) && !(var16 > var18 + 0.001)) {
               if (!this.Iiilliiliiil((int)var25, (int)(var27 >>> 32), Math.max(var8, var14), var10)) {
                  iIIIliIlIIli var20 = leave == 1 ? iIIIliIlIIli.IiililIIlliililIIl : iIIIliIlIIli.iiililIIlIIIiilIIl;
                  double var21 = (double)(leave + 1) * 3.6 + (leave == 1 ? 3.0 : 5.0) + i;
                  this.IiIiliIiiiIi(d, (int)var25, var14, (int)(var27 >>> 32), var20, var21, 0.0F);
               }
            }
         }
      }
   }

   public boolean lIiiIiIlilli(int budget) {
      long var13 = 8533506171992095760L;
      long var15 = -3560635763210988246L;
      if (this.IilliiIIil != IliIIilliIIi.lllIiiiiillIiiii) {
         return true;
      } else {
         var13 ^= (0L ^ var13) & -1L << 32;

         while ((int)(var13 >>> 32) < budget) {
            if (this.IiIliiIIil == 0) {
               this.IIlllIlliIll(IliIIilliIIi.lIiIiiiiiIiIiiii, this.iIlliiIIil);
               return true;
            }

            var13 ^= ((long)this.iIIliiIIil[0] ^ var13) & -1L >>> 32;
            double var4 = this.llIliiIIil[0];
            this.iIIIlIlIIl();
            var13 += 4294967296L;
            this.lIlliiIIil++;
            if ((int)var13 < 0) {
               var15 ^= ((long)(-((int)var13) - 1) << 32 ^ var15) & -1L << 32;
               if (var4 == this.lliIiiIIil[(int)(var15 >>> 32)] + this.IiiIiiIIil[(int)(var15 >>> 32)]) {
                  this.IIlllIlliIll(IliIIilliIIi.IilIiiiililIiiii, (int)(var15 >>> 32));
                  return true;
               }
            } else {
               var15 ^= ((long)((int)var13) << 32 ^ var15) & -1L << 32;
               if (!this.IIIliiIIil[(int)(var15 >>> 32)] && var4 == this.lliIiiIIil[(int)(var15 >>> 32)] + this.iliIiiIIil[(int)(var15 >>> 32)]) {
                  if (this.IIlliiIIil >= this.IlIIiiIIil.Illlllllilll()) {
                     if (this.IllliiIIil >= 0) {
                        this.IIlllIlliIll(IliIIilliIIi.IilIiiiililIiiii, this.IllliiIIil);
                     } else {
                        this.IIlllIlliIll(IliIIilliIIi.iilIiiiiIIiIiiii, this.iIlliiIIil);
                     }

                     return true;
                  }

                  this.IIIliiIIil[(int)(var15 >>> 32)] = true;
                  this.IIlliiIIil++;
                  double var7 = this.iIIIiiIIil
                     .IilliliilIIi(this.iilIiiIIil[(int)(var15 >>> 32)], this.IliIiiIIil[(int)(var15 >>> 32)], this.lIiIiiIIil[(int)(var15 >>> 32)]);
                  if (!Double.isFinite(var7)) {
                     var7 = this.iliIiiIIil[(int)(var15 >>> 32)];
                  }

                  if (this.iIlliiIIil < 0
                     || var7 < this.lllliiIIil - 1.0E-9
                     || Math.abs(var7 - this.lllliiIIil) <= 1.0E-9 && this.lliIiiIIil[(int)(var15 >>> 32)] < this.lliIiiIIil[this.iIlliiIIil]) {
                     this.iIlliiIIil = (int)(var15 >>> 32);
                     this.lllliiIIil = var7;
                  }

                  if (this.iIIIiiIIil
                     .IliIlllilIi(this.iilIiiIIil[(int)(var15 >>> 32)], this.IliIiiIIil[(int)(var15 >>> 32)], this.lIiIiiIIil[(int)(var15 >>> 32)])) {
                     double var9 = this.iIIIiiIIil
                        .iIlIlllllill(this.iilIiiIIil[(int)(var15 >>> 32)], this.IliIiiIIil[(int)(var15 >>> 32)], this.lIiIiiIIil[(int)(var15 >>> 32)]);
                     this.IiiIiiIIil[(int)(var15 >>> 32)] = Double.isFinite(var9) ? Math.max(0.0, var9) : 0.0;
                     double var11 = this.lliIiiIIil[(int)(var15 >>> 32)] + this.IiiIiiIIil[(int)(var15 >>> 32)];
                     if (this.IllliiIIil < 0 || var11 < this.lliIiiIIil[this.IllliiIIil] + this.IiiIiiIIil[this.IllliiIIil]) {
                        this.IllliiIIil = (int)(var15 >>> 32);
                     }

                     this.IIIIllIIIl(-((int)(var15 >>> 32)) - 1, var11, -1.0);
                  }

                  this.Iilllilliill((int)(var15 >>> 32));
               }
            }
         }

         return false;
      }
   }

   private void IIlllIlliIll(IliIIilliIIi st, int i) {
      this.IilliiIIil = st;
      if (i < 0) {
         this.lilliiIIil = new ilIilIilIiIilIil(st, List.of(), 0.0, 0.0F, this.IIlliiIIil);
      } else {
         List var3 = this.Illlllllilll(i);
         float var4 = 0.0F;

         for (iillIilIIilIil var6 : var3) {
            var4 += var6.IlIlllIlilIl();
         }

         this.lilliiIIil = new ilIilIilIiIilIil(st, var3, this.lliIiiIIil[i], var4, this.IIlliiIIil);
      }
   }

   private void Iiiiliiiiiii(int b, int a) {
      long var9 = -971890257836708148L;
      var9 ^= ((long)this.iIIliiIIil[b] << 32 ^ var9) & -1L << 32;
      this.iIIliiIIil[b] = this.iIIliiIIil[a];
      this.iIIliiIIil[a] = (int)(var9 >>> 32);
      var9 ^= ((long)this.IlIliiIIil[b] ^ var9) & -1L >>> 32;
      this.IlIliiIIil[b] = this.IlIliiIIil[a];
      this.IlIliiIIil[a] = (int)var9;
      double var5 = this.llIliiIIil[b];
      this.llIliiIIil[b] = this.llIliiIIil[a];
      this.llIliiIIil[a] = var5;
      double var7 = this.ilIliiIIil[b];
      this.ilIliiIIil[b] = this.ilIliiIIil[a];
      this.ilIliiIIil[a] = var7;
   }

   @Override
   public boolean IliIlllilIi(int y, int x, int z) {
      long var7 = 7046920232261257833L;
      long var4 = IIIiIllIIiIl.iIlIlllllill(y, x, z);
      var7 ^= ((long)this.lIlIiiIIil.get(var4) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) == 0) {
         var7 ^= ((long)(this.lIIIiiIIil.IliIlllilIi(y, x, z) ? 2 : 1) << 32 ^ var7) & -1L << 32;
         this.lIlIiiIIil.put(var4, (byte)((int)(var7 >>> 32)));
      }

      return (int)(var7 >>> 32) == 2;
   }

   public int IlIlllIlilIl() {
      return this.IIlliiIIil;
   }

   public int IiIlliIliiIl() {
      return this.lIlliiIIil;
   }

   private void IIiilIiiiIii(int c) {
      this.iilIiiIIil = Arrays.copyOf(this.iilIiiIIil, c);
      this.IIiIiiIIil = Arrays.copyOf(this.IIiIiiIIil, c);
      this.lIiIiiIIil = Arrays.copyOf(this.lIiIiiIIil, c);
      this.iIiIiiIIil = Arrays.copyOf(this.iIiIiiIIil, c);
      this.IliIiiIIil = Arrays.copyOf(this.IliIiiIIil, c);
      this.lliIiiIIil = Arrays.copyOf(this.lliIiiIIil, c);
      this.iliIiiIIil = Arrays.copyOf(this.iliIiiIIil, c);
      this.IiiIiiIIil = Arrays.copyOf(this.IiiIiiIIil, c);
      this.liiIiiIIil = Arrays.copyOf(this.liiIiiIIil, c);
      this.iiiIiiIIil = Arrays.copyOf(this.iiiIiiIIil, c);
      this.IIIliiIIil = Arrays.copyOf(this.IIIliiIIil, c);
      this.lIIliiIIil = Arrays.copyOf(this.lIIliiIIil, c);
   }

   private boolean IlIillIiilIi(int z, double x, int f) {
      long var6 = 3907144419999813671L;
      var6 ^= ((long)IIIiIllIIiIl.lIiiIiIlilli(x) << 32 ^ var6) & -1L << 32;
      return this.IliIlllilIi(z, (int)(var6 >>> 32) + 2, f) ? false : !(x - Math.floor(x) > 0.201) || !this.IliIlllilIi(z, (int)(var6 >>> 32) + 3, f);
   }

   public IliIIilliIIi IIIllIIliIIl() {
      return this.IilliiIIil;
   }

   private double IIlilIliiIli(int y, int z, int fl, double x, long g, int key) {
      long var12 = -1669100620671260890L;
      double var9 = this.lllIiiIIil.get(g);
      if (!Double.isNaN(var9)) {
         return var9;
      } else {
         var9 = 0.0;
         if ((key & 4) != 0) {
            var9 += 20.0;
         }

         if ((key & 512) != 0) {
            var9 += 12.0;
         }

         if ((key & 1048576) != 0) {
            var9 += 20.0;
         }

         if ((key & 32) != 0) {
            var9 += 6.5;
         }

         for (long var16 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var16 >>> 32) < 4; var16 += 4294967296L) {
            if ((this.iIlIlllllill(y + IIIiIllIIiIl.IIilIilllIilIill[(int)(var16 >>> 32)], z, fl + IIIiIllIIiIl.iIilIillIlilIill[(int)(var16 >>> 32)]) & 1)
               != 0) {
               var9 += 30.0;
               break;
            }
         }

         if (this.ilIIiiIIil != null && this.ilIIiiIIil.test(g)) {
            var9 += 40.0;
         }

         var9 += this.Illillliilli(y, x, fl, g);
         this.lllIiiIIil.put(g, var9);
         return var9;
      }
   }

   private void Iilllilliill(int i) {
      long var20 = -1999466017364856400L;
      long var22 = 7721781683441672017L;
      long var24 = 9085618737889701131L;
      long var26 = -1552813291231250934L;
      var20 ^= ((long)this.iilIiiIIil[i] << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)this.lIiIiiIIil[i] ^ var20) & -1L >>> 32;
      double var4 = this.IliIiiIIil[i];
      var22 ^= ((long)Math.max(0, this.IlIIiiIIil.IliIlllilIi()) << 32 ^ var22) & -1L << 32;
      double var7 = 0.0;

      for (var22 ^= (0L ^ var22) & -1L >>> 32; (int)var22 < 4; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         this.iiIliiIIil[(int)var22] = IIIiIllIIiIl.IIIllIIliIIl(
            this,
            (int)(var20 >>> 32) + IIIiIllIIiIl.IIilIilllIilIill[(int)var22],
            (int)var20 + IIIiIllIIiIl.iIilIillIlilIill[(int)var22],
            var4,
            1.25,
            (int)(var22 >>> 32)
         );
         if (Double.isNaN(this.iiIliiIIil[(int)var22])) {
            var7 = 2.0;
         }
      }

      for (var22 ^= (0L ^ var22) & -1L >>> 32; (int)var22 < 4; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         var24 ^= ((long)((int)(var20 >>> 32) + IIIiIllIIiIl.IIilIilllIilIill[(int)var22]) << 32 ^ var24) & -1L << 32;
         var24 ^= ((long)((int)var20 + IIIiIllIIiIl.iIilIillIlilIill[(int)var22]) ^ var24) & -1L >>> 32;
         double var12 = this.iiIliiIIil[(int)var22];
         if (var12 != Double.POSITIVE_INFINITY) {
            if (this.IlIIiiIIil.iliIiiliiiii() && this.IIillIiliIil((int)(var24 >>> 32), (int)var24, var12, var4)) {
               this.Ililllililil(i, (int)var22, 1, var7);
               if (this.IlIIiiIIil.IIIllIIliIIl()) {
                  this.Ililllililil(i, (int)var22, 2, var7);
               }
            }

            if (!Double.isNaN(var12)) {
               double var14 = var12 - var4;
               if (var14 > 0.601) {
                  if (var14 <= 1.251 && this.IlIillIiilIi((int)(var20 >>> 32), var4, (int)var20)) {
                     this.IiIiliIiiiIi(i, (int)(var24 >>> 32), var12, (int)var24, iIIIliIlIIli.iIililIIlIlililIIl, 7.6 + var7, 0.0F);
                  }
               } else if (var14 >= -0.601) {
                  var26 ^= ((long)(var14 > 0.001 ? 1 : 0) << 32 ^ var26) & -1L << 32;
                  this.IiIiliIiiiIi(
                     i,
                     (int)(var24 >>> 32),
                     var12,
                     (int)var24,
                     (int)(var26 >>> 32) != 0 ? iIIIliIlIIli.IIililIIllIililIIl : iIIIliIlIIli.illlilIIlIillilIIl,
                     3.6 + ((int)(var26 >>> 32) != 0 ? 0.6 : 0.0) + var7,
                     0.0F
                  );
               } else {
                  double var16 = -var14;
                  if (!(var16 > (double)((int)(var22 >>> 32)) + 0.001)) {
                     var26 ^= ((long)((this.iIlIlllllill((int)(var24 >>> 32), IIIiIllIIiIl.lIiiIiIlilli(var12), (int)var24) & 32) != 0 ? 1 : 0) ^ var26)
                        & -1L >>> 32;
                     float var19 = lllllillillllill.IliIlllilIi(var16, this.IlIIiiIIil.iIlIlllllill(), this.IlIIiiIIil.IilliliilIIi(), (boolean)((int)var26));
                     if (lllllillillllill.IilliliilIIi(var19, this.IlIIiiIIil.liiiIIllIl())) {
                        this.IiIiliIiiiIi(
                           i,
                           (int)(var24 >>> 32),
                           var12,
                           (int)var24,
                           iIIIliIlIIli.llililIIlilililIIl,
                           3.6 + var16 * 0.8 + 1.0 + (double)var19 * this.IIlIiiIIil + var7,
                           var19
                        );
                     }
                  }
               }
            }
         }
      }

      for (long var35 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var35 < 4; var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
         long var37 = var24 ^ ((long)((int)(var20 >>> 32) + IIIiIllIIiIl.llilIillililIill[(int)var35]) << 32 ^ var24) & -1L << 32;
         var24 = var37 ^ ((long)((int)var20 + IIIiIllIIiIl.IiilIillliilIill[(int)var35]) ^ var37) & -1L >>> 32;
         double var28 = IIIiIllIIiIl.IIIllIIliIIl(this, (int)(var24 >>> 32), (int)var24, var4, 0.6, 1);
         if (Double.isFinite(var28) && !(Math.abs(var28 - var4) > 0.601)) {
            double var29 = Math.max(var4, var28);
            if (this.IIIilIIiiIIi((int)(var24 >>> 32), (int)var20, var29) && this.IIIilIIiiIIi((int)(var20 >>> 32), (int)var24, var29)) {
               this.IiIiliIiiiIi(i, (int)(var24 >>> 32), var28, (int)var24, iIIIliIlIIli.lillilIIliillilIIl, 5.1 + var7, 0.0F);
            }
         }
      }
   }

   ilIIlIilIiIIlIil(IlIIlIilllIIlIil feetY, int danger, int lim, double goal, liiIIlliiiIIll sz, lIiiiIlliIiiiIll penalized, iilIiiIIiIii w, LongPredicate sx) {
      long var11 = 2251781855066151355L;
      super();
      this.lIlIiiIIil = new Long2ByteOpenHashMap(4096);
      this.iIlIiiIIil = new Long2DoubleOpenHashMap(1024);
      this.IllIiiIIil = new Long2IntOpenHashMap(1024);
      this.lllIiiIIil = new Long2DoubleOpenHashMap(1024);
      this.illIiiIIil = new Long2FloatOpenHashMap();
      this.IilIiiIIil = new Long2IntOpenHashMap(1024);
      this.iilIiiIIil = new int[512];
      this.IIiIiiIIil = new int[512];
      this.lIiIiiIIil = new int[512];
      this.iIiIiiIIil = new int[512];
      this.IliIiiIIil = new double[512];
      this.lliIiiIIil = new double[512];
      this.iliIiiIIil = new double[512];
      this.IiiIiiIIil = new double[512];
      this.liiIiiIIil = new float[512];
      this.iiiIiiIIil = new byte[512];
      this.IIIliiIIil = new boolean[512];
      this.lIIliiIIil = new boolean[512];
      this.iIIliiIIil = new int[512];
      this.IlIliiIIil = new int[512];
      this.llIliiIIil = new double[512];
      this.ilIliiIIil = new double[512];
      this.iiIliiIIil = new double[4];
      this.iIlliiIIil = -1;
      this.IllliiIIil = -1;
      this.lllliiIIil = Double.MAX_VALUE;
      this.illliiIIil = 48;
      this.IilliiIIil = IliIIilliIIi.lllIiiiiillIiiii;
      this.lIIIiiIIil = feetY;
      this.iIIIiiIIil = sz;
      this.IlIIiiIIil = penalized;
      this.llIIiiIIil = w == null ? iilIiiIIiIii.liIiIilIliiIiIilIl : w;
      this.ilIIiiIIil = sx;
      this.IiIIiiIIil = danger;
      this.iiIIiiIIil = lim;
      this.liIIiiIIil = IIIiIllIIiIl.lIiiIiIlilli(goal);
      this.IIlIiiIIil = Double.isFinite(penalized.IlIlllIlilIl()) ? Math.max(0.0, penalized.IlIlllIlilIl()) : 0.0;
      this.IilIiiIIil.defaultReturnValue(-1);
      this.IllIiiIIil.defaultReturnValue(-1);
      this.iIlIiiIIil.defaultReturnValue(Double.NEGATIVE_INFINITY);
      this.lllIiiIIil.defaultReturnValue(Double.NaN);
      this.illIiiIIil.defaultReturnValue(Float.NaN);
      if (feetY != null && sz != null && Double.isFinite(goal)) {
         var11 ^= ((long)this.Iilililiiili(danger, this.liIIiiIIil, lim, goal, IIIiIllIIiIl.iIlIlllllill(danger, this.liIIiiIIil, lim)) << 32 ^ var11)
            & -1L << 32;
         this.lliIiiIIil[(int)(var11 >>> 32)] = 0.0;
         this.iIiIiiIIil[(int)(var11 >>> 32)] = -1;
         this.iiiIiiIIil[(int)(var11 >>> 32)] = (byte)iIIIliIlIIli.IlllilIIlllllilIIl.ordinal();
         this.IIIIllIIIl((int)(var11 >>> 32), this.lliIiiIIil[(int)(var11 >>> 32)] + this.iliIiiIIil[(int)(var11 >>> 32)], this.iliIiiIIil[(int)(var11 >>> 32)]);
      } else {
         this.IilliiIIil = IliIIilliIIi.lIiIiiiiiIiIiiii;
         this.lilliiIIil = new ilIilIilIiIilIil(IliIIilliIIi.lIiIiiiiiIiIiiii, List.of(), 0.0, 0.0F, 0);
      }
   }

   private List<iillIilIIilIil> Illlllllilll(int i) {
      long var4 = -3698350803814893378L;
      ArrayList var2 = new ArrayList();
      var4 ^= ((long)i << 32 ^ var4) & -1L << 32;

      while ((int)(var4 >>> 32) >= 0) {
         var2.add(
            new iillIilIIilIil(
               this.iilIiiIIil[(int)(var4 >>> 32)],
               this.IIiIiiIIil[(int)(var4 >>> 32)],
               this.lIiIiiIIil[(int)(var4 >>> 32)],
               this.IliIiiIIil[(int)(var4 >>> 32)],
               IIIiIllIIiIl.iiilIillIIIiIill[this.iiiIiiIIil[(int)(var4 >>> 32)]],
               this.liiIiiIIil[(int)(var4 >>> 32)],
               this.lliIiiIIil[(int)(var4 >>> 32)]
            )
         );
         var4 ^= ((long)this.iIiIiiIIil[(int)(var4 >>> 32)] << 32 ^ var4) & -1L << 32;
      }

      Collections.reverse(var2);
      return List.copyOf(var2);
   }

   private boolean Iliilliiilii(int a, int b) {
      if (this.llIliiIIil[a] != this.llIliiIIil[b]) {
         return this.llIliiIIil[a] < this.llIliiIIil[b];
      } else {
         return this.ilIliiIIil[a] != this.ilIliiIIil[b] ? this.ilIliiIIil[a] < this.ilIliiIIil[b] : this.IlIliiIIil[a] < this.IlIliiIIil[b];
      }
   }

   private boolean Iiilliiliiil(int from, int z, double x, double to) {
      long var12 = 50365523946280129L;
      long var14 = 3367327808560662965L;
      var12 ^= ((long)((int)Math.floor(x + 0.001)) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)((int)Math.floor(to - 0.001)) ^ var12) & -1L >>> 32;

      for (long var18 = var14 ^ ((long)((int)(var12 >>> 32)) << 32 ^ var14) & -1L << 32; (int)(var18 >>> 32) <= (int)var12; var18 += 4294967296L) {
         if (this.IliIlllilIi(from, (int)(var18 >>> 32), z)) {
            double var10 = this.liiiIIllIl(from, (int)(var18 >>> 32), z);
            if (Double.isNaN(var10) || var10 > x + 0.001) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean IIillIiliIil(int z, int f, double g, double x) {
      long var8 = 5398245689437590960L;
      if (Double.isNaN(g)) {
         return true;
      } else if (!Double.isFinite(g)) {
         return false;
      } else if (g < x - 1.5 - 0.001) {
         return true;
      } else {
         var8 ^= ((long)this.iIlIlllllill(z, IIIiIllIIiIl.lIiiIiIlilli(g), f) << 32 ^ var8) & -1L << 32;
         return ((int)(var8 >>> 32) & 1024) != 0 ? false : IIIiIllIIiIl.iliIiiliiiii((int)(var8 >>> 32), this.IlIIiiIIil.lIiiIiIlilli());
      }
   }

   @Override
   public int IilliliilIIi() {
      return this.lIIIiiIIil.IilliliilIIi();
   }

   @Override
   public int iIlIlllllill(int x, int y, int z) {
      long var7 = -8967729901815137242L;
      long var4 = IIIiIllIIiIl.iIlIlllllill(x, y, z);
      var7 ^= ((long)this.IllIiiIIil.get(var4) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) < 0) {
         var7 ^= ((long)Math.max(0, this.lIIIiiIIil.iIlIlllllill(x, y, z)) << 32 ^ var7) & -1L << 32;
         this.IllIiiIIil.put(var4, (int)(var7 >>> 32));
      }

      return (int)(var7 >>> 32);
   }

   private void IiIiliIiiiIi(int x, int g, double z, int cost, iIIIliIlIIli hp, double mv, float from) {
      long var21 = -5601741059318735398L;
      long var23 = 1307035129426551352L;
      if (Math.abs(g - this.IiIIiiIIil) <= this.IlIIiiIIil.IiIlliIliiIl() && Math.abs(cost - this.iiIIiiIIil) <= this.IlIIiiIIil.IiIlliIliiIl()) {
         var21 ^= ((long)IIIiIllIIiIl.lIiiIiIlilli(z) << 32 ^ var21) & -1L << 32;
         if (Math.abs((int)(var21 >>> 32) - this.liIIiiIIil) <= this.IlIIiiIIil.IIlllIlliIll()) {
            var21 ^= ((long)this.iIlIlllllill(g, (int)(var21 >>> 32), cost) ^ var21) & -1L >>> 32;
            if (!IIIiIllIIiIl.iliIiiliiiii((int)var21, this.IlIIiiIIil.lIiiIiIlilli())) {
               long var12 = IIIiIllIIiIl.iIlIlllllill(g, (int)(var21 >>> 32), cost);
               double var14 = mv + this.IIlilIliiIli(g, (int)(var21 >>> 32), cost, z, var12, (int)var21);
               float var16 = from;
               var23 ^= ((long)this.lIIliiIIil[x] << 32 ^ var23) & -1L << 32;
               if (((int)var21 & 2) != 0) {
                  var14 += 6.0;
                  if (!this.IlIIiiIIil.lIiiIiIlilli() && (int)(var23 >>> 32) == 0) {
                     var14 += 3.2F * this.IIlIiiIIil;
                     var16 = from + 3.2F;
                  }

                  var23 ^= (4294967296L ^ var23) & -1L << 32;
               }

               double var18 = this.lliIiiIIil[x] + var14;
               var23 ^= ((long)this.IilIiiIIil.get(var12) ^ var23) & -1L >>> 32;
               if ((int)var23 < 0) {
                  var23 ^= ((long)this.Iilililiiili(g, (int)(var21 >>> 32), cost, z, var12) ^ var23) & -1L >>> 32;
               } else if (var18 >= this.lliIiiIIil[(int)var23] - 1.0E-9) {
                  return;
               }

               this.lliIiiIIil[(int)var23] = var18;
               this.IliIiiIIil[(int)var23] = z;
               this.iIiIiiIIil[(int)var23] = x;
               this.iiiIiiIIil[(int)var23] = (byte)hp.ordinal();
               this.liiIiiIIil[(int)var23] = var16;
               this.lIIliiIIil[(int)var23] = (boolean)((int)(var23 >>> 32));
               this.IIIliiIIil[(int)var23] = false;
               this.IIIIllIIIl((int)var23, this.lliIiiIIil[(int)var23] + this.iliIiiIIil[(int)var23], this.iliIiiIIil[(int)var23]);
            }
         }
      }
   }

   private void iIIIlIlIIl() {
      long var6 = -3508253030492374834L;
      long var8 = -5024186895905107102L;
      long var10 = -192717574740197253L;
      var6 ^= ((long)(--this.IiIliiIIil) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) != 0) {
         this.iIIliiIIil[0] = this.iIIliiIIil[(int)(var6 >>> 32)];
         this.IlIliiIIil[0] = this.IlIliiIIil[(int)(var6 >>> 32)];
         this.llIliiIIil[0] = this.llIliiIIil[(int)(var6 >>> 32)];
         this.ilIliiIIil[0] = this.ilIliiIIil[(int)(var6 >>> 32)];
         var6 ^= (0L ^ var6) & -1L >>> 32;

         while (true) {
            var8 ^= ((long)(2 * (int)var6 + 1) << 32 ^ var8) & -1L << 32;
            var8 ^= ((long)((int)(var8 >>> 32) + 1) ^ var8) & -1L >>> 32;
            var10 ^= ((long)((int)var6) << 32 ^ var10) & -1L << 32;
            if ((int)(var8 >>> 32) < this.IiIliiIIil && this.Iliilliiilii((int)(var8 >>> 32), (int)(var10 >>> 32))) {
               var10 ^= ((long)((int)(var8 >>> 32)) << 32 ^ var10) & -1L << 32;
            }

            if ((int)var8 < this.IiIliiIIil && this.Iliilliiilii((int)var8, (int)(var10 >>> 32))) {
               var10 ^= ((long)((int)var8) << 32 ^ var10) & -1L << 32;
            }

            if ((int)(var10 >>> 32) == (int)var6) {
               return;
            }

            this.Iiiiliiiiiii((int)var6, (int)(var10 >>> 32));
            var6 ^= ((long)((int)(var10 >>> 32)) ^ var6) & -1L >>> 32;
         }
      }
   }

   public ilIilIilIiIilIil iliIiiliiiii() {
      return this.lilliiIIil;
   }

   private void IIIIllIIIl(int entry, double f, double h) {
      long var8 = 2248856179870021186L;
      if (this.IiIliiIIil == this.iIIliiIIil.length) {
         var8 ^= ((long)(this.IiIliiIIil * 2) << 32 ^ var8) & -1L << 32;
         this.iIIliiIIil = Arrays.copyOf(this.iIIliiIIil, (int)(var8 >>> 32));
         this.IlIliiIIil = Arrays.copyOf(this.IlIliiIIil, (int)(var8 >>> 32));
         this.llIliiIIil = Arrays.copyOf(this.llIliiIIil, (int)(var8 >>> 32));
         this.ilIliiIIil = Arrays.copyOf(this.ilIliiIIil, (int)(var8 >>> 32));
      }

      var8 ^= ((long)(this.IiIliiIIil++) << 32 ^ var8) & -1L << 32;
      this.iIIliiIIil[(int)(var8 >>> 32)] = entry;
      this.IlIliiIIil[(int)(var8 >>> 32)] = this.liIliiIIil++;
      this.llIliiIIil[(int)(var8 >>> 32)] = f;
      this.ilIliiIIil[(int)(var8 >>> 32)] = h;

      while ((int)(var8 >>> 32) > 0) {
         var8 ^= ((long)((int)(var8 >>> 32) - 1 >>> 1) ^ var8) & -1L >>> 32;
         if (!this.Iliilliiilii((int)(var8 >>> 32), (int)var8)) {
            break;
         }

         this.Iiiiliiiiiii((int)(var8 >>> 32), (int)var8);
         var8 ^= ((long)((int)var8) << 32 ^ var8) & -1L << 32;
      }
   }

   private double Illillliilli(int x, double key, int z, long g) {
      if (this.llIIiiIIil == iilIiiIIiIii.liIiIilIliiIiIilIl) {
         return 0.0;
      } else {
         float var7 = this.illIiiIIil.get(g);
         if (Float.isNaN(var7)) {
            if (this.illliiIIil <= 0) {
               return 0.0;
            }

            if (this.iIIIiiIIil.liiiIIllIl(x, key, z) > 21.6) {
               return 0.0;
            }

            this.illliiIIil--;
            var7 = this.llIIiiIIil.hpAt((double)x + 0.5, key, (double)z + 0.5);
            if (!Float.isFinite(var7)) {
               var7 = 0.0F;
            }

            this.illIiiIIil.put(g, var7);
         }

         return Math.max(0.0, (double)var7 - 0.5) * this.IIlIiiIIil;
      }
   }
}
