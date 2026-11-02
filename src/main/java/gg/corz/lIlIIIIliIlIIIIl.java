package gg.corz;

import java.util.Arrays;

public final class lIlIIIIliIlIIIIl {
   private int liiiIiIlIl;
   private final long[] iliiIiIlIl = new long[8];
   public static final int lliiIiIlIl = 8;
   private final int[] IiiiIiIlIl = new int[8];
   private int lIIIliIlIl;
   private int IIIIliIlIl;
   private int iiiiIiIlIl = Integer.MIN_VALUE;
   public static final int IliiIiIlIl = 2;
   public static final int iIiiIiIlIl = 2;

   public boolean liiiIIllIl(int z, int x, int y, int confirms) {
      long var8 = 3606171729490957890L;
      if (confirms != this.iiiiIiIlIl) {
         this.iiiiIiIlIl = confirms;
         Arrays.fill(this.iliiIiIlIl, Long.MIN_VALUE);
         Arrays.fill(this.IiiiIiIlIl, 0);
         this.liiiIiIlIl = 0;
      }

      long var5 = IliIlllilIi(z, x, y);

      for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < 8; var10 += 4294967296L) {
         if (this.iliiIiIlIl[(int)(var10 >>> 32)] == var5) {
            if (this.IiiiIiIlIl[(int)(var10 >>> 32)] >= 2) {
               this.IIIIliIlIl++;
               return false;
            }

            this.IiiiIiIlIl[(int)(var10 >>> 32)]++;
            this.lIIIliIlIl++;
            return true;
         }
      }

      this.iliiIiIlIl[this.liiiIiIlIl] = var5;
      this.IiiiIiIlIl[this.liiiIiIlIl] = 1;
      this.liiiIiIlIl = (this.liiiIiIlIl + 1) % 8;
      this.lIIIliIlIl++;
      return true;
   }

   public int lIiiIiIlilli(int x, int y, int z) {
      long var7 = 6957544753502299219L;
      long var4 = IliIlllilIi(x, y, z);

      for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < 8; var9 += 4294967296L) {
         if (this.iliiIiIlIl[(int)(var9 >>> 32)] == var4) {
            return this.IiiiIiIlIl[(int)(var9 >>> 32)];
         }
      }

      return 0;
   }

   public int iIlIlllllill() {
      return this.IIIIliIlIl;
   }

   public void iliIiiliiiii() {
      Arrays.fill(this.iliiIiIlIl, Long.MIN_VALUE);
      Arrays.fill(this.IiiiIiIlIl, 0);
      this.liiiIiIlIl = 0;
      this.iiiiIiIlIl = Integer.MIN_VALUE;
      this.IIIIliIlIl = this.lIIIliIlIl = 0;
   }

   public int IilliliilIIi() {
      return this.lIIIliIlIl;
   }

   private static long IliIlllilIi(int y, int z, int x) {
      return (long)Math.floorDiv(y, 2) * 73856093L ^ (long)Math.floorDiv(z, 2) * 19349663L ^ (long)Math.floorDiv(x, 2) * 83492791L;
   }

   public lIlIIIIliIlIIIIl() {
      this.iliIiiliiiii();
   }
}
