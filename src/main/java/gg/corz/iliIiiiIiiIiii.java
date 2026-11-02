package gg.corz;

public final class iliIiiiIiiIiii {
   public int lillliiIIl;
   private final int[] iIllliiIIl = new int[148];
   private int illlliiIIl;
   public int IlilliiIIl;
   public int lIilliiIIl;
   public int iIilliiIIl;
   public int iillliiIIl;
   private final int[] IlllliiIIl = new int[27];
   private final boolean[] llllliiIIl = new boolean[148];
   public int IillliiIIl;
   public int IIilliiIIl;

   public static boolean liiiIIllIl(int family) {
      switch (family) {
         case 114:
         case 115:
         case 118:
         case 121:
         case 122:
         case 125:
         case 126:
         case 129:
         case 130:
         case 131:
         case 137:
         case 145:
            return true;
         case 116:
         case 117:
         case 119:
         case 120:
         case 123:
         case 124:
         case 127:
         case 128:
         case 132:
         case 133:
         case 134:
         case 135:
         case 136:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         default:
            return false;
      }
   }

   public boolean IiIiliIiiiIi() {
      long var2 = 5095803968159286004L;
      if (this.iIllliiIIl[34] > 0) {
         return true;
      } else {
         for (long var4 = var2 ^ (485331304448L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 148; var4 += 4294967296L) {
            if (this.iIllliiIIl[(int)(var4 >>> 32)] > 0) {
               return true;
            }
         }

         return false;
      }
   }

   public int IIIilIIiiIIi() {
      long var4 = -3434808328073900573L;
      long var6 = -2497818454198745834L;
      var4 ^= (0L ^ var4) & -1L << 32;
      var4 ^= (0L ^ var4) & -1L >>> 32;

      for (long var11 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var11 >>> 32) < this.IlllliiIIl.length; var11 += 4294967296L) {
         if (this.IlllliiIIl[(int)(var11 >>> 32)] > (int)var4) {
            var4 ^= ((long)this.IlllliiIIl[(int)(var11 >>> 32)] ^ var4) & -1L >>> 32;
            var4 ^= ((long)((int)(var11 >>> 32)) << 32 ^ var4) & -1L << 32;
         }
      }

      return (int)(var4 >>> 32);
   }

   public double Iiilliiliiil(int... classes) {
      long var7 = -1636598108045811353L;
      long var9 = -5033595138975285866L;
      if (this.illlliiIIl == 0) {
         return 0.0;
      } else {
         var7 ^= (0L ^ var7) & -1L << 32;
         int[] var3 = classes;
         var7 ^= ((long)classes.length ^ var7) & -1L >>> 32;
         var9 ^= (0L ^ var9) & -1L << 32;

         while ((int)(var9 >>> 32) < (int)var7) {
            var9 ^= ((long)var3[(int)(var9 >>> 32)] ^ var9) & -1L >>> 32;
            var7 ^= ((long)((int)(var7 >>> 32) + this.IIillIiliIil((int)var9)) << 32 ^ var7) & -1L << 32;
            var9 += 4294967296L;
         }

         return (double)((int)(var7 >>> 32)) / (double)this.illlliiIIl;
      }
   }

   public static iliIiiiIiiIiii IliIlllilIi(Iterable<ilIlIIilIiIlIIil> dimension, int cells) {
      iliIiiiIiiIiii var2 = new iliIiiiIiiIiii();
      var2.IillliiIIl = cells;

      for (ilIlIIilIiIlIIil var4 : dimension) {
         var2.IilliliilIIi(var4.IlliIlIIil);
         var2.iliIiiliiiii(var4.illiIlIIil);
         var2.IIIllIIliIIl(var4.llIiIlIIil);
      }

      return var2;
   }

   public double Ililllililil(int biomeClass) {
      return this.illlliiIIl == 0 ? 0.0 : (double)this.IIillIiliIil(biomeClass) / (double)this.illlliiIIl;
   }

   public void IlIlllIlilIl(int family) {
      if (family > 0 && family < 148) {
         this.llllliiIIl[family] = true;
      }
   }

   public void iIlIlllllill(iliIiiiIiiIiii chunk) {
      long var3 = 1851349405933622231L;

      for (long var5 = var3 ^ (4294967296L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 148; var5 += 4294967296L) {
         if (liiiIIllIl((int)(var5 >>> 32))) {
            this.iIllliiIIl[(int)(var5 >>> 32)] = this.iIllliiIIl[(int)(var5 >>> 32)] + chunk.iIllliiIIl[(int)(var5 >>> 32)];
         }
      }
   }

   public int IIillIiliIil(int biomeClass) {
      return biomeClass >= 0 && biomeClass < 27 ? this.IlllliiIIl[biomeClass] : 0;
   }

   public boolean IIlilIliiIli() {
      long var5 = 5945785256448532454L;
      long var7 = 2110990396100688450L;
      int[] var1 = this.iIllliiIIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var10 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         var7 ^= ((long)var1[(int)var10] << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) != 0) {
            return false;
         }
      }

      return true;
   }

   public int IlIillIiilIi() {
      return this.illlliiIIl;
   }

   public boolean Iilllilliill(int family) {
      return family > 0 && family < 148 && this.llllliiIIl[family];
   }

   public int IIlllIlliIll(int family) {
      return family > 0 && family < 148 ? this.iIllliiIIl[family] : 0;
   }

   public iliIiiiIiiIiii() {
      this.illlliiIIl = 0;
      this.IillliiIIl = 0;
      this.lillliiIIl = Integer.MAX_VALUE;
      this.iillliiIIl = Integer.MIN_VALUE;
      this.IIilliiIIl = 0;
      this.lIilliiIIl = 0;
      this.iIilliiIIl = 0;
      this.IlilliiIIl = 0;
   }

   public void IIIllIIliIIl(int y) {
      if (y < this.lillliiIIl) {
         this.lillliiIIl = y;
      }

      if (y > this.iillliiIIl) {
         this.iillliiIIl = y;
      }
   }

   public int Illlllllilll(int... families) {
      long var7 = -1522256991786641115L;
      long var9 = 6835331119336540199L;
      var7 ^= (0L ^ var7) & -1L << 32;
      int[] var3 = families;
      var7 ^= ((long)families.length ^ var7) & -1L >>> 32;
      var9 ^= (0L ^ var9) & -1L << 32;

      while ((int)(var9 >>> 32) < (int)var7) {
         var9 ^= ((long)var3[(int)(var9 >>> 32)] ^ var9) & -1L >>> 32;
         var7 ^= ((long)((int)(var7 >>> 32) + this.IIlllIlliIll((int)var9)) << 32 ^ var7) & -1L << 32;
         var9 += 4294967296L;
      }

      return (int)(var7 >>> 32);
   }

   public void IilliliilIIi(int family) {
      if (family > 0 && family < 148) {
         this.iIllliiIIl[family]++;
      }
   }

   public void IiIlliIliiIl(iliIiiiIiiIiii o) {
      long var3 = -5590000655243030382L;

      for (var3 ^= (0L ^ var3) & -1L << 32; (int)(var3 >>> 32) < this.iIllliiIIl.length; var3 += 4294967296L) {
         this.iIllliiIIl[(int)(var3 >>> 32)] = this.iIllliiIIl[(int)(var3 >>> 32)] + o.iIllliiIIl[(int)(var3 >>> 32)];
      }

      for (var3 ^= (0L ^ var3) & -1L << 32; (int)(var3 >>> 32) < this.IlllliiIIl.length; var3 += 4294967296L) {
         this.IlllliiIIl[(int)(var3 >>> 32)] = this.IlllliiIIl[(int)(var3 >>> 32)] + o.IlllliiIIl[(int)(var3 >>> 32)];
      }

      for (long var7 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var7 >>> 32) < this.llllliiIIl.length; var7 += 4294967296L) {
         this.llllliiIIl[(int)(var7 >>> 32)] = this.llllliiIIl[(int)(var7 >>> 32)] | o.llllliiIIl[(int)(var7 >>> 32)];
      }

      this.illlliiIIl = this.illlliiIIl + o.illlliiIIl;
      this.IillliiIIl = o.IillliiIIl;
      if (o.lillliiIIl < this.lillliiIIl) {
         this.lillliiIIl = o.lillliiIIl;
      }

      if (o.iillliiIIl > this.iillliiIIl) {
         this.iillliiIIl = o.iillliiIIl;
      }
   }

   public void lIiiIiIlilli(int n, int family) {
      if (n > 0 && n < 148) {
         this.iIllliiIIl[n] = this.iIllliiIIl[n] + family;
      }
   }

   public boolean Illillliilli() {
      return this.iillliiIIl >= 40;
   }

   public void iliIiiliiiii(int biomeClass) {
      if (biomeClass >= 0 && biomeClass < 27) {
         this.IlllliiIIl[biomeClass]++;
         this.illlliiIIl++;
      }
   }
}
