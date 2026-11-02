package gg.corz;

public final class ililiIilIiiliIil {
   private final int iiIIlilIil;
   private final int[] llIIlilIil;
   private static final int IlIIlilIil = 4;
   private final int IiIIlilIil;
   public final int lIlIlilIil;
   public final int IIlIlilIil;
   private final int liIIlilIil;
   private final boolean ilIIlilIil;

   public ililiIilIiiliIil Iilllilliill(float c, float y0, float x0, float x1, float cx, float width, float y1, int cy) {
      long var15 = -2356420433445377780L;
      var15 ^= (103079215104L ^ var15) & -1L << 32;
      float[] var10 = new float[(int)(var15 >>> 32) + 1];
      float[] var11 = new float[(int)(var15 >>> 32) + 1];

      for (long var18 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var18 <= (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         float var13 = (float)((int)var18) / (float)((int)(var18 >>> 32));
         float var14 = 1.0F - var13;
         var10[(int)var18] = var14 * var14 * c + 2.0F * var14 * var13 * x0 + var13 * var13 * cx;
         var11[(int)var18] = var14 * var14 * y0 + 2.0F * var14 * var13 * x1 + var13 * var13 * width;
      }

      return this.IIillIiliIil(var10, var11, y1, cy);
   }

   public ililiIilIiiliIil lIiiIiIlilli(int top, int bottom) {
      long var6 = -6418550842459085864L;
      long var8 = -4861057286019665160L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var6 ^= (0L ^ var6) & -1L << 32;

         while ((int)(var6 >>> 32) < this.lIlIlilIil) {
            var6 ^= ((long)iiiIIIliIIIlIIli.IiIlliIliiIl(top, bottom, ((float)((int)(var6 >>> 32)) + 0.5F) / (float)this.lIlIlilIil) ^ var6) & -1L >>> 32;

            for (var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < this.IIlIlilIil; var8 += 4294967296L) {
               this.llIIlilIil[(this.iiIIlilIil + (int)(var6 >>> 32)) * this.IiIIlilIil + this.liIIlilIil + (int)(var8 >>> 32)] = (int)var6;
            }

            var6 += 4294967296L;
         }

         return this;
      }
   }

   public ililiIilIiiliIil IlIlllIlilIl(float y1, float x0, float y0, float x1, int c) {
      float var6 = Math.min(y1, y0);
      float var7 = Math.max(y1, y0);
      float var8 = Math.min(x0, x1);
      float var9 = Math.max(x0, x1);
      return this.IIIllIIliIIl(var6, var8, var7, var9, c, (x, bx) -> x >= var6 && x <= var7 && bx >= var8 && bx <= var9);
   }

   public int IliIlllilIi(int y, int x) {
      if (this.ilIIlilIil) {
         return 0;
      } else {
         y = Math.max(0, Math.min(this.IIlIlilIil - 1, y));
         x = Math.max(0, Math.min(this.lIlIlilIil - 1, x));
         return this.llIIlilIil[(this.iiIIlilIil + x) * this.IiIIlilIil + this.liIIlilIil + y];
      }
   }

   public ililiIilIiiliIil IIIllIIliIIl(float f, float y0, float y1, float x1, int c, lliiiiililiiiiil x0) {
      long var17 = -8212936623491281019L;
      long var19 = 903924634741209529L;
      long var21 = 1386018309689632531L;
      long var23 = -39385232706260994L;
      long var25 = -9025049800575153187L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var17 ^= ((long)Math.max(0, (int)Math.floor((double)Math.min(f, y1))) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)Math.max(0, (int)Math.floor((double)Math.min(y0, x1))) ^ var17) & -1L >>> 32;
         var19 ^= ((long)Math.min(this.IIlIlilIil - 1, (int)Math.ceil((double)Math.max(f, y1))) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)Math.min(this.lIlIlilIil - 1, (int)Math.ceil((double)Math.max(y0, x1))) ^ var19) & -1L >>> 32;
         float var11 = 0.25F;
         var21 ^= ((long)((int)var17) << 32 ^ var21) & -1L << 32;

         while ((int)(var21 >>> 32) <= (int)var19) {
            for (var21 ^= ((long)((int)(var17 >>> 32)) ^ var21) & -1L >>> 32;
               (int)var21 <= (int)(var19 >>> 32);
               var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32
            ) {
               var23 ^= (0L ^ var23) & -1L << 32;

               for (var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 < 4; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
                  for (var25 ^= (0L ^ var25) & -1L << 32; (int)(var25 >>> 32) < 4; var25 += 4294967296L) {
                     if (x0.at(
                        (float)((int)var21) + ((float)((int)(var25 >>> 32)) + 0.5F) * var11,
                        (float)((int)(var21 >>> 32)) + ((float)((int)var23) + 0.5F) * var11
                     )) {
                        var23 += 4294967296L;
                     }
                  }
               }

               if ((int)(var23 >>> 32) > 0) {
                  this.iIlIlllllill((int)var21, (int)(var21 >>> 32), c, (float)((int)(var23 >>> 32)) / 16.0F);
               }
            }

            var21 += 4294967296L;
         }

         return this;
      }
   }

   public ililiIilIiiliIil IIlilIliiIli(int wave, float lines, float seed, float c, int strength) {
      long var17 = -4574077569263107455L;
      long var15 = 7072539217937004774L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var15 ^= ((long)Math.max(1, Math.round(lines)) << 32 ^ var15) & -1L << 32;

         for (long var20 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var20 < this.lIlIlilIil; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            for (var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < this.IIlIlilIil; var17 += 4294967296L) {
               float var9 = (float)((int)(var17 >>> 32)) / (float)this.IIlIlilIil * lines;
               float var10 = (Iiiiliiiiiii(var9 * 0.5F, (float)((int)var20) / 24.0F, Math.max(1, (int)(var20 >>> 32) / 2), strength) - 0.5F) * 2.0F * seed;
               float var11 = 0.5F + 0.5F * (float)Math.sin((double)((float) (Math.PI * 2) * (var9 + var10)));
               float var12 = 0.5F + 0.5F * (float)Math.sin((double)((float) (Math.PI * 2) * (var9 * 3.1F + var10 * 1.7F + 0.37F)));
               float var13 = (float)Math.pow((double)var11, 10.0) * c + (float)Math.pow((double)var12, 14.0) * c * 0.45F;
               if (var13 > 0.004F) {
                  var17 ^= ((long)((this.iiIIlilIil + (int)var20) * this.IiIIlilIil + this.liIIlilIil + (int)(var17 >>> 32)) ^ var17) & -1L >>> 32;
                  this.llIIlilIil[(int)var17] = iiiIIIliIIIlIIli.Illlllllilll(this.llIIlilIil[(int)var17], wave, Math.min(1.0F, var13));
               }
            }
         }

         return this;
      }
   }

   public ililiIilIiiliIil IIIilIIiiIIi(int c, float period, float angleDeg, float width) {
      float var5 = (float)Math.toRadians((double)width);
      float var6 = (float)Math.cos((double)var5);
      float var7 = (float)Math.sin((double)var5);
      return this.IIIllIIliIIl(0.0F, 0.0F, (float)this.IIlIlilIil, (float)this.lIlIlilIil, c, (ca, y) -> {
         float var6x = ca * var6 + y * var7;
         float var7x = var6x - (float)Math.floor((double)(var6x / period)) * period;
         return var7x < angleDeg;
      });
   }

   private static float Iilililiiili(float x1, float x0, float y1, float x, float y, float y0) {
      float var6 = y - y1;
      float var7 = y0 - x;
      float var8 = var6 * var6 + var7 * var7;
      float var9 = var8 > 0.0F ? ((x1 - y1) * var6 + (x0 - x) * var7) / var8 : 0.0F;
      var9 = var9 < 0.0F ? 0.0F : (var9 > 1.0F ? 1.0F : var9);
      float var10 = y1 + var9 * var6 - x1;
      float var11 = x + var9 * var7 - x0;
      return var10 * var10 + var11 * var11;
   }

   private void iIlIlllllill(int y, int coverage, int x, float c) {
      long var6 = -1319838394374297704L;
      if (y >= 0 && coverage >= 0 && y < this.IIlIlilIil && coverage < this.lIlIlilIil) {
         var6 ^= ((long)((this.iiIIlilIil + coverage) * this.IiIIlilIil + this.liIIlilIil + y) << 32 ^ var6) & -1L << 32;
         this.llIIlilIil[(int)(var6 >>> 32)] = iiiIIIliIIIlIIli.Illlllllilll(this.llIIlilIil[(int)(var6 >>> 32)], x, c);
      }
   }

   public ililiIilIiiliIil IIillIiliIil(float[] xs, float[] ys, float c, int width) {
      long var11 = -3844755288227585052L;
      float var5 = c * 0.5F;
      float var6 = Float.MAX_VALUE;
      float var7 = Float.MAX_VALUE;
      float var8 = -Float.MAX_VALUE;
      float var9 = -Float.MAX_VALUE;

      for (long var13 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var13 >>> 32) < xs.length; var13 += 4294967296L) {
         var6 = Math.min(var6, xs[(int)(var13 >>> 32)]);
         var8 = Math.max(var8, xs[(int)(var13 >>> 32)]);
         var7 = Math.min(var7, ys[(int)(var13 >>> 32)]);
         var9 = Math.max(var9, ys[(int)(var13 >>> 32)]);
      }

      return this.IIIllIIliIIl(
         var6 - var5,
         var7 - var5,
         var8 + var5,
         var9 + var5,
         width,
         (xsx, ysx) -> {
            long var6x = 4119958123816952288L;

            for (long var8x = var6x ^ (0L ^ var6x) & -1L << 32; (int)(var8x >>> 32) + 1 < xs.length; var8x += 4294967296L) {
               if (Iilililiiili(xsx, ysx, xs[(int)(var8x >>> 32)], ys[(int)(var8x >>> 32)], xs[(int)(var8x >>> 32) + 1], ys[(int)(var8x >>> 32) + 1])
                  <= var5 * var5) {
                  return true;
               }
            }

            return false;
         }
      );
   }

   public ililiIilIiiliIil iliIiiliiiii(int left, int right) {
      long var6 = 8538222185126846230L;
      long var8 = -2007728773682446944L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var6 ^= (0L ^ var6) & -1L << 32;

         while ((int)(var6 >>> 32) < this.IIlIlilIil) {
            var6 ^= ((long)iiiIIIliIIIlIIli.IiIlliIliiIl(left, right, ((float)((int)(var6 >>> 32)) + 0.5F) / (float)this.IIlIlilIil) ^ var6) & -1L >>> 32;

            for (var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < this.lIlIlilIil; var8 += 4294967296L) {
               this.llIIlilIil[(this.iiIIlilIil + (int)(var8 >>> 32)) * this.IiIIlilIil + this.liIIlilIil + (int)(var6 >>> 32)] = (int)var6;
            }

            var6 += 4294967296L;
         }

         return this;
      }
   }

   static float Iiiiliiiiiii(float period, float seed, int x, int y) {
      long var8 = 2249500580185927839L;
      float var4 = 0.0F;
      float var5 = 0.5F;
      float var6 = 0.0F;

      for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < 3; var10 += 4294967296L) {
         var4 += Iliilliiilii(period, seed, x, y + (int)(var10 >>> 32) * 101) * var5;
         var6 += var5;
         var5 *= 0.5F;
         period *= 2.0F;
         seed *= 2.0F;
         x *= 2;
      }

      return var4 / var6;
   }

   public ililiIilIiiliIil IiIiliIiiiIi(int seed, float amount, float c, int scale) {
      long var11 = -7281299198055558306L;
      long var13 = 7317569485839448710L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var11 ^= ((long)Math.max(1, Math.round((float)this.IIlIlilIil / Math.max(1.0F, c))) << 32 ^ var11) & -1L << 32;

         for (long var16 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var16 < this.lIlIlilIil; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            var13 ^= (0L ^ var13) & -1L << 32;

            while ((int)(var13 >>> 32) < this.IIlIlilIil) {
               float var8 = Iiiiliiiiiii(
                  (float)((int)(var13 >>> 32) * (int)(var16 >>> 32)) / (float)this.IIlIlilIil,
                  (float)((int)var16) / Math.max(1.0F, c),
                  (int)(var16 >>> 32),
                  scale
               );
               float var9 = Math.max(0.0F, Math.min(1.0F, (var8 - 0.5F) * 2.0F * amount + amount * 0.5F));
               var13 ^= ((long)((this.iiIIlilIil + (int)var16) * this.IiIIlilIil + this.liIIlilIil + (int)(var13 >>> 32)) ^ var13) & -1L >>> 32;
               this.llIIlilIil[(int)var13] = iiiIIIliIIIlIIli.Illlllllilll(this.llIIlilIil[(int)var13], seed, var9);
               var13 += 4294967296L;
            }
         }

         return this;
      }
   }

   ililiIilIiiliIil(iIlIliilIllIliil r) {
      this.llIIlilIil = r.iililIilil.IIliilIIllIliilIIl;
      this.ilIIlilIil = r.iililIilil.iIliilIIlIlliilIIl;
      this.IiIIlilIil = r.iililIilil.ilIiilIIlIiIiilIIl;
      this.liIIlilIil = r.IIiilIilil;
      this.iiIIlilIil = r.lIiilIilil;
      this.IIlIlilIil = r.iIiilIilil;
      this.lIlIlilIil = r.IliilIilil;
   }

   public ililiIilIiiliIil Illillliilli(int density, float size, float c, int seed) {
      long var10 = 2762435815227387499L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var10 ^= ((long)Math.max(1, Math.round(size * (float)this.IIlIlilIil * (float)this.lIlIlilIil / 100.0F)) << 32 ^ var10) & -1L << 32;

         for (long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            float var7 = IIiilIiiiIii((int)var13, 1, seed) * (float)this.IIlIlilIil;
            float var8 = IIiilIiiiIii((int)var13, 2, seed) * (float)this.lIlIlilIil;
            float var9 = c * (0.6F + 0.8F * IIiilIiiiIii((int)var13, 3, seed));
            this.IiIlliIliiIl(var7, var8, var9, var9, density);
         }

         return this;
      }
   }

   public ililiIilIiiliIil Illlllllilll(float x1, float x0, float y1, float width, float y0, int c) {
      float var7 = y0 * 0.5F;
      return this.IIIllIIliIIl(
         Math.min(x1, y1) - var7,
         Math.min(x0, width) - var7,
         Math.max(x1, y1) + var7,
         Math.max(x0, width) + var7,
         c,
         (y, x) -> Iilililiiili(y, x, x1, x0, y1, width) <= var7 * var7
      );
   }

   public ililiIilIiiliIil Iiilliiliiil(float cy, float c, float wobble, float seed, int cx, int r) {
      long var9 = -123673221172500479L;
      float[] var7 = new float[5];

      for (long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < var7.length; var11 += 4294967296L) {
         var7[(int)(var11 >>> 32)] = IIiilIiiiIii((int)(var11 >>> 32), 7, cx) * (float) (Math.PI * 2);
      }

      return this.IIIllIIliIIl(
         cy - wobble * (1.0F + seed),
         c - wobble * (1.0F + seed),
         cy + wobble * (1.0F + seed),
         c + wobble * (1.0F + seed),
         r,
         (wobblex, k) -> {
            float var7x = wobblex - cy;
            float var8 = k - c;
            float var9x = (float)Math.atan2((double)var8, (double)var7x);
            float var10 = 1.0F
               + seed
                  * (
                     0.5F * (float)Math.sin((double)(2.0F * var9x + var7[0]))
                        + 0.3F * (float)Math.sin((double)(3.0F * var9x + var7[1]))
                        + 0.2F * (float)Math.sin((double)(5.0F * var9x + var7[2]))
                  );
            return var7x * var7x + var8 * var8 <= wobble * wobble * var10 * var10;
         }
      );
   }

   public ililiIilIiiliIil IilliliilIIi(int c) {
      long var4 = -2624566958920670894L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var4 ^= (0L ^ var4) & -1L << 32;

         while ((int)(var4 >>> 32) < this.lIlIlilIil) {
            for (var4 ^= (0L ^ var4) & -1L >>> 32; (int)var4 < this.IIlIlilIil; var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
               this.llIIlilIil[(this.iiIIlilIil + (int)(var4 >>> 32)) * this.IiIIlilIil + this.liIIlilIil + (int)var4] = c;
            }

            var4 += 4294967296L;
         }

         return this;
      }
   }

   public ililiIilIiiliIil liiiIIllIl(int y, int c, int x) {
      if (!this.ilIIlilIil && y >= 0 && c >= 0 && y < this.IIlIlilIil && c < this.lIlIlilIil) {
         this.llIIlilIil[(this.iiIIlilIil + c) * this.IiIIlilIil + this.liIIlilIil + y] = x;
      }

      return this;
   }

   static float IIiilIiiiIii(int x, int seed, int y) {
      long var4 = 8231690889140919284L;
      var4 ^= ((long)(x * 374761393 + seed * 668265263 + y * 1442695041) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 13) * 1274126177) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 16) << 32 ^ var4) & -1L << 32;
      return (float)((int)(var4 >>> 32) & 16777215) / 1.6777215E7F;
   }

   public ililiIilIiiliIil IiIlliIliiIl(float c, float cx, float rx, float cy, int ry) {
      return !(rx <= 0.0F) && !(cy <= 0.0F) ? this.IIIllIIliIIl(c - rx, cx - cy, c + rx, cx + cy, ry, (ryx, rxx) -> {
         float var6 = (ryx - c) / rx;
         float var7 = (rxx - cx) / cy;
         return var6 * var6 + var7 * var7 <= 1.0F;
      }) : this;
   }

   public ililiIilIiiliIil IlIillIiilIi(float amount, float scale, int seed) {
      long var10 = 7275379488854309778L;
      long var12 = -6108933015417572842L;
      if (this.ilIIlilIil) {
         return this;
      } else {
         var10 ^= ((long)Math.max(1, Math.round((float)this.IIlIlilIil / Math.max(1.0F, scale))) << 32 ^ var10) & -1L << 32;

         for (long var15 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var15 < this.lIlIlilIil; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            var12 ^= (0L ^ var12) & -1L << 32;

            while ((int)(var12 >>> 32) < this.IIlIlilIil) {
               float var7 = Iiiiliiiiiii(
                  (float)((int)(var12 >>> 32) * (int)(var15 >>> 32)) / (float)this.IIlIlilIil,
                  (float)((int)var15) / Math.max(1.0F, scale),
                  (int)(var15 >>> 32),
                  seed
               );
               float var8 = 1.0F + amount * (2.0F * var7 - 1.0F);
               var12 ^= ((long)((this.iiIIlilIil + (int)var15) * this.IiIIlilIil + this.liIIlilIil + (int)(var12 >>> 32)) ^ var12) & -1L >>> 32;
               this.llIIlilIil[(int)var12] = iiiIIIliIIIlIIli.IIlllIlliIll(this.llIIlilIil[(int)var12], var8);
               var12 += 4294967296L;
            }
         }

         return this;
      }
   }

   private static float Iliilliiilii(float x, float y, int period, int seed) {
      long var16 = -7484539710776417245L;
      long var14 = 9103639620788899015L;
      var14 ^= ((long)((int)Math.floor((double)x)) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)Math.floor((double)y)) ^ var14) & -1L >>> 32;
      float var6 = x - (float)((int)(var14 >>> 32));
      float var7 = y - (float)((int)var14);
      var6 = var6 * var6 * (3.0F - 2.0F * var6);
      var7 = var7 * var7 * (3.0F - 2.0F * var7);
      var16 ^= ((long)Math.floorMod((int)(var14 >>> 32), period) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)Math.floorMod((int)(var14 >>> 32) + 1, period) ^ var16) & -1L >>> 32;
      float var10 = IIiilIiiiIii((int)(var16 >>> 32), (int)var14, seed);
      float var11 = IIiilIiiiIii((int)var16, (int)var14, seed);
      float var12 = IIiilIiiiIii((int)(var16 >>> 32), (int)var14 + 1, seed);
      float var13 = IIiilIiiiIii((int)var16, (int)var14 + 1, seed);
      return var10 + (var11 - var10) * var6 + (var12 + (var13 - var12) * var6 - (var10 + (var11 - var10) * var6)) * var7;
   }

   public ililiIilIiiliIil IIlllIlliIll(float ry, float c, float rx, float cy, float t, int cx) {
      float var7 = rx - t;
      float var8 = cy - t;
      return this.IIIllIIliIIl(ry - rx, c - cy, ry + rx, c + cy, cx, (y, iry) -> {
         float var8x = (y - ry) / rx;
         float var9 = (iry - c) / cy;
         if (var8x * var8x + var9 * var9 > 1.0F) {
            return false;
         } else if (!(var7 <= 0.0F) && !(var8 <= 0.0F)) {
            float var10 = (y - ry) / var7;
            float var11 = (iry - c) / var8;
            return var10 * var10 + var11 * var11 > 1.0F;
         } else {
            return true;
         }
      });
   }

   public ililiIilIiiliIil Ililllililil(int xy, float... c) {
      long var8 = -251470443332713932L;
      float var3 = Float.MAX_VALUE;
      float var4 = Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;
      float var6 = -Float.MAX_VALUE;

      for (var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) + 1 < c.length; var8 += 8589934592L) {
         var3 = Math.min(var3, c[(int)(var8 >>> 32)]);
         var5 = Math.max(var5, c[(int)(var8 >>> 32)]);
         var4 = Math.min(var4, c[(int)(var8 >>> 32) + 1]);
         var6 = Math.max(var6, c[(int)(var8 >>> 32) + 1]);
      }

      var8 ^= ((long)(c.length / 2) << 32 ^ var8) & -1L << 32;
      return this.IIIllIIliIIl(var3, var4, var5, var6, xy, (n, x) -> {
         long var11x = -8419922466391346872L;
         long var13 = -3240849317029811627L;
         var11x ^= (0L ^ var11x) & -1L << 32;
         var11x ^= (0L ^ var11x) & -1L >>> 32;
         var13 ^= ((long)(xyx - 1) << 32 ^ var13) & -1L << 32;

         while ((int)var11x < xyx) {
            float var7 = c[2 * (int)var11x];
            float var8x = c[2 * (int)var11x + 1];
            float var9 = c[2 * (int)(var13 >>> 32)];
            float var10x = c[2 * (int)(var13 >>> 32) + 1];
            if (var8x > x != var10x > x && n < (var9 - var7) * (x - var8x) / (var10x - var8x) + var7) {
               var11x ^= ((long)((int)(var11x >>> 32) == 0 ? 1 : 0) << 32 ^ var11x) & -1L << 32;
            }

            int var10000 = (int)var11x;
            var11x ^= (var11x ^ var11x + (long)1) & -1L >>> 32;
            var13 ^= ((long)var10000 << 32 ^ var13) & -1L << 32;
         }

         return (boolean)((int)(var11x >>> 32));
      });
   }
}
