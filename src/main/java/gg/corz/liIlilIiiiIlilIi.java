package gg.corz;

import java.util.List;

public final class liIlilIiiiIlilIi {
   public final float IililllIIi;
   public final float lililllIIi;
   public final int[] iiIilllIIi;
   public final float illilllIIi;
   public static final int IIIilllIIi = 21;
   public final int iIlilllIIi;
   public final float iililllIIi;
   public final int[] llIilllIIi;
   public final float[] IIlilllIIi;
   public final String lIIilllIIi;
   public final String[] liIilllIIi;
   public final float lllilllIIi;
   public final int iIIilllIIi;
   public final int IlIilllIIi;
   public final int ilIilllIIi;
   public final int IiIilllIIi;
   public final float[][] lIlilllIIi;
   public final int IllilllIIi;
   public final float IIiilllIIi;

   public boolean IilliliilIIi(int ancestor, int bone) {
      long var4 = 957589632451029098L;
      var4 ^= ((long)ancestor << 32 ^ var4) & -1L << 32;

      while ((int)(var4 >>> 32) >= 0) {
         if ((int)(var4 >>> 32) == bone) {
            return true;
         }

         var4 ^= ((long)this.iiIilllIIi[(int)(var4 >>> 32)] << 32 ^ var4) & -1L << 32;
      }

      return false;
   }

   private static iIIiiiilIlIiiiil IIIllIIliIIl(float[] o, int into, iIIiiiilIlIiiiil m) {
      m.iIIIIiIiil = o[into];
      m.IlIIIiIiil = o[into + 1];
      m.llIIIiIiil = o[into + 2];
      m.ilIIIiIiil = o[into + 3];
      m.IiIIIiIiil = o[into + 4];
      m.liIIIiIiil = o[into + 5];
      m.iiIIIiIiil = o[into + 6];
      m.IIlIIiIiil = o[into + 7];
      m.lIlIIiIiil = o[into + 8];
      m.iIlIIiIiil = o[into + 9];
      m.IllIIiIiil = o[into + 10];
      m.lllIIiIiil = o[into + 11];
      return m;
   }

   public float lIiiIiIlilli() {
      long var6 = -7052056532662460474L;
      if (this.IllilllIIi < 0) {
         return 0.0F;
      } else {
         float var1 = this.IIlilllIIi[3 * this.IllilllIIi + 1];
         float var2 = 0.0F;

         for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.IiIilllIIi; var8 += 4294967296L) {
            if (this.IilliliilIIi((int)(var8 >>> 32), this.IllilllIIi)) {
               float[] var4 = this.lIlilllIIi[(int)(var8 >>> 32)];

               for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < var4.length; var8 ^= (var8 ^ var8 + (long)9) & -1L >>> 32) {
                  var2 = Math.max(var2, var1 - var4[(int)var8 + 1]);
               }
            }
         }

         return var2;
      }
   }

   public void iliIiiliiiii(IIlllilllIlllill out, float[] p) {
      long var10 = -2989612167196665683L;
      iIIiiiilIlIiiiil var3 = new iIIiiiilIlIiiiil();
      iIIiiiilIlIiiiil var4 = new iIIiiiilIlIiiiil();
      var10 ^= (0L ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) < this.IiIilllIIi) {
         float var6 = this.IIlilllIIi[3 * (int)(var10 >>> 32)];
         float var7 = this.IIlilllIIi[3 * (int)(var10 >>> 32) + 1];
         float var8 = this.IIlilllIIi[3 * (int)(var10 >>> 32) + 2];
         var4.IliIlllilIi()
            .IilliliilIIi(var6 + out.iIIIlIiill[(int)(var10 >>> 32)], var7 + out.IlIIlIiill[(int)(var10 >>> 32)], var8 + out.llIIlIiill[(int)(var10 >>> 32)])
            .IlIlllIlilIl(out.lIIIlIiill[(int)(var10 >>> 32)])
            .IIIllIIliIIl(out.IIIIlIiill[(int)(var10 >>> 32)])
            .iliIiiliiiii(out.iiiiIIiill[(int)(var10 >>> 32)])
            .lIiiIiIlilli(out.ilIIlIiill[(int)(var10 >>> 32)], out.IiIIlIiill[(int)(var10 >>> 32)], out.liIIlIiill[(int)(var10 >>> 32)])
            .IilliliilIIi(-var6, -var7, -var8);
         var10 ^= ((long)this.iiIilllIIi[(int)(var10 >>> 32)] ^ var10) & -1L >>> 32;
         if ((int)var10 < 0) {
            var3.liiiIIllIl(var4);
         } else {
            IIIllIIliIIl(p, (int)var10 * 21, var3).iIlIlllllill(var4);
         }

         var3.IIillIiliIil(p, (int)(var10 >>> 32) * 21);
         var3.Iilllilliill(p, (int)(var10 >>> 32) * 21 + 12);
         var10 += 4294967296L;
      }
   }

   public int iIlIlllllill(String name) {
      long var3 = 9077718912219695030L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiIilllIIi; var5 += 4294967296L) {
         if (this.liIilllIIi[(int)(var5 >>> 32)].equals(name)) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   liIlilIiiiIlilIi(String firstPerson, llIIliilIIli bones, int[] id, List<lIillIlliIillIll> atlas, lIillIlliIillIll sharedAtlas) {
      long var17 = -1173349435195936370L;
      long var19 = -3596551463022281042L;
      super();
      this.lIIilllIIi = firstPerson;
      this.iIIilllIIi = bones.ilIiilIIlIiIiilIIl;
      this.IlIilllIIi = bones.liIiilIIliiIiilIIl;
      this.llIilllIIi = id != null ? id : bones.IIliilIIllIliilIIl;
      this.ilIilllIIi = bones.liiiIIllIl();
      this.IiIilllIIi = atlas.size();
      this.liIilllIIi = new String[this.IiIilllIIi];
      this.iiIilllIIi = new int[this.IiIilllIIi];
      this.IIlilllIIi = new float[3 * this.IiIilllIIi];
      this.lIlilllIIi = new float[this.IiIilllIIi][];
      var17 ^= (0L ^ var17) & -1L << 32;
      float var7 = Float.MAX_VALUE;
      float var8 = Float.MAX_VALUE;
      float var9 = Float.MAX_VALUE;
      float var10 = -Float.MAX_VALUE;
      float var11 = -Float.MAX_VALUE;
      float var12 = -Float.MAX_VALUE;
      var17 ^= (0L ^ var17) & -1L >>> 32;

      while ((int)var17 < this.IiIilllIIi) {
         lIillIlliIillIll var14 = (lIillIlliIillIll)atlas.get((int)var17);
         this.liIilllIIi[(int)var17] = var14.lIlIIIilll;
         this.iiIilllIIi[(int)var17] = var14.iIlIIIilll == null ? -1 : var14.iIlIIIilll.IIlIIIilll;
         if (this.iiIilllIIi[(int)var17] >= (int)var17) {
            throw new IllegalStateException(
               IlIlllIlilIl<"IlIlllIlilIl","MgJG+ckxsqCAEknyWNldFbhuSeb4RpjvOE8UvIWv56r/">()
                  + var14.lIlIIIilll
                  + IlIlllIlilIl<"IlIlllIlilIl","X50ztzrXp0xtPUA71zw/1LmOkjtAu42QN2uC1aSgUMZp0T2rCewBvl3AoPRLlWgFmR7Yks6rmg==">()
            );
         }

         this.IIlilllIIi[3 * (int)var17] = var14.IllIIIilll;
         this.IIlilllIIi[3 * (int)var17 + 1] = var14.lllIIIilll;
         this.IIlilllIIi[3 * (int)var17 + 2] = var14.illIIIilll;
         this.lIlilllIIi[(int)var17] = var14.IilIIIilll.iIlIlllllill();
         var17 ^= ((long)((int)(var17 >>> 32) + var14.IilIIIilll.liiiIIllIl()) << 32 ^ var17) & -1L << 32;
         float[] var15 = this.lIlilllIIi[(int)var17];

         for (var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < var15.length; var19 += 38654705664L) {
            var7 = Math.min(var7, var15[(int)(var19 >>> 32)]);
            var10 = Math.max(var10, var15[(int)(var19 >>> 32)]);
            var8 = Math.min(var8, var15[(int)(var19 >>> 32) + 1]);
            var11 = Math.max(var11, var15[(int)(var19 >>> 32) + 1]);
            var9 = Math.min(var9, var15[(int)(var19 >>> 32) + 2]);
            var12 = Math.max(var12, var15[(int)(var19 >>> 32) + 2]);
         }

         var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
      }

      this.iIlilllIIi = (int)(var17 >>> 32);
      this.IllilllIIi = sharedAtlas == null ? -1 : sharedAtlas.IIlIIIilll;
      if ((int)(var17 >>> 32) == 0) {
         var12 = 0.0F;
         var11 = 0.0F;
         var10 = 0.0F;
         var9 = 0.0F;
         var8 = 0.0F;
         var7 = 0.0F;
      }

      this.lllilllIIi = var7;
      this.illilllIIi = var8;
      this.IililllIIi = var9;
      this.lililllIIi = var10;
      this.iililllIIi = var11;
      this.IIiilllIIi = var12;
   }

   public IIlllilllIlllill IliIlllilIi() {
      return new IIlllilllIlllill(this.IiIilllIIi);
   }

   public float[] liiiIIllIl() {
      return new float[this.IiIilllIIi * 21];
   }
}
