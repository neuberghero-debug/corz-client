package gg.corz;

import net.minecraft.class_11515;
import net.minecraft.class_2338;
import net.minecraft.class_238;

final class IlilIlIillilIlIi implements AutoCloseable {
   Iililllllilillll lIIIlIIIIi;
   int IliiIIIIIi;
   final int lIliIIIIIi;
   int liliIIIIIi;
   int[] IiliIIIIIi;
   Iililllllilillll IIIIlIIIIi;
   Iililllllilillll iIIIlIIIIi;
   double llIIlIIIIi;
   final long iiIiIIIIIi;
   private static final byte[] IiIIlIIIIi = new byte[0];
   long[] iiliIIIIIi;
   int iliiIIIIIi;
   final int iIliIIIIIi;
   int[] llliIIIIIi;
   final int IIliIIIIIi;
   boolean IlIIlIIIIi;
   byte[] illiIIIIIi;
   private static final int[] ilIIlIIIIi = new int[0];
   int IIiiIIIIIi;
   boolean liiiIIIIIi;
   boolean IiiiIIIIIi;
   final class_238 IlliIIIIIi;
   final Iililllllilillll[] iiiiIIIIIi;
   int iIiiIIIIIi;
   static final long[] liIIlIIIIi = new long[0];
   int lIiiIIIIIi;
   int lliiIIIIIi;

   Iililllllilillll lIiiIiIlilli() {
      if (this.lIIIlIIIIi == null) {
         this.lIIIlIIIIi = new Iililllllilillll(IlIlllIlilIl<"IlIlllIlilIl","98VCbJAp5U7Y8NWIm6CYeDD+UyJDnnfQGY3BGCBhUeAUlh753COVFXO79AzFEw==">());
      }

      return this.lIIIlIIIIi;
   }

   double liiiIIllIl(double camX, double camY, double camZ) {
      double var7 = (double)this.IIliIIIIIi + 8.0 - camX;
      double var9 = (double)this.lIliIIIIIi + 8.0 - camY;
      double var11 = (double)this.iIliIIIIIi + 8.0 - camZ;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   @Override
   public void close() {
      long var2 = 2882074506325240643L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.iiiiIIIIIi.length; var4 += 4294967296L) {
         if (this.iiiiIIIIIi[(int)(var4 >>> 32)] != null) {
            this.iiiiIIIIIi[(int)(var4 >>> 32)].close();
            this.iiiiIIIIIi[(int)(var4 >>> 32)] = null;
         }
      }

      if (this.IIIIlIIIIi != null) {
         this.IIIIlIIIIi.close();
         this.IIIIlIIIIi = null;
      }

      if (this.lIIIlIIIIi != null) {
         this.lIIIlIIIIi.close();
         this.lIIIlIIIIi = null;
      }

      if (this.iIIIlIIIIi != null) {
         this.iIIIlIIIIi.close();
         this.iIIIlIIIIi = null;
      }
   }

   Iililllllilillll IilliliilIIi() {
      if (this.IIIIlIIIIi == null) {
         this.IIIIlIIIIi = new Iililllllilillll(IlIlllIlilIl<"IlIlllIlilIl","NsyOFX7ZZRk533O9VCzquO32MNOEXkAB5oW/JgqtDFCWtyE84G0JzkXs83yC5XoLPW8=">());
      }

      return this.IIIIlIIIIi;
   }

   Iililllllilillll iIlIlllllill(class_11515 layer) {
      long var4 = 8659254308873050927L;
      var4 ^= ((long)layer.ordinal() << 32 ^ var4) & -1L << 32;
      Iililllllilillll var3 = this.iiiiIIIIIi[(int)(var4 >>> 32)];
      if (var3 == null) {
         var3 = new Iililllllilillll(IlIlllIlilIl<"IlIlllIlilIl","Q1gGqlKcoW4L9XDfzJbGF/R/WH6HlolOe7ydDCDAuBhb/cQ330CAvCQ5CWuJ">() + layer.method_72022());
         this.iiiiIIIIIi[(int)(var4 >>> 32)] = var3;
      }

      return var3;
   }

   IlilIlIillilIlIi(long originX, int key, int originZ, int originY) {
      this.llliIIIIIi = ilIIlIIIIi;
      this.illiIIIIIi = IiIIlIIIIi;
      this.IiliIIIIIi = ilIIlIIIIi;
      this.iiliIIIIIi = liIIlIIIIi;
      this.IiiiIIIIIi = true;
      this.iiiiIIIIIi = new Iililllllilillll[class_11515.values().length];
      this.iiIiIIIIIi = originX;
      this.IIliIIIIIi = key;
      this.lIliIIIIIi = originZ;
      this.iIliIIIIIi = originY;
      this.IlliIIIIIi = new class_238((double)key, (double)originZ, (double)originY, (double)(key + 16), (double)(originZ + 16), (double)(originY + 16));
   }

   static long IliIlllilIi(int z, int y, int x) {
      return class_2338.method_10064(z >> 4, y >> 4, x >> 4);
   }

   boolean IIIllIIliIIl() {
      long var5 = 9170742083092853430L;
      Iililllllilillll[] var1 = this.iiiiIIIIIi;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         Iililllllilillll var4 = var1[(int)var8];
         if (var4 != null && !var4.IliIlllilIi()) {
            return false;
         }
      }

      return this.IIIIlIIIIi != null && !this.IIIIlIIIIi.IliIlllilIi()
         ? false
         : (this.lIIIlIIIIi == null || this.lIIIlIIIIi.IliIlllilIi()) && (this.iIIIlIIIIi == null || this.iIIIlIIIIi.IliIlllilIi());
   }

   Iililllllilillll iliIiiliiiii() {
      if (this.iIIIlIIIIi == null) {
         this.iIIIlIIIIi = new Iililllllilillll(IlIlllIlilIl<"IlIlllIlilIl","c9bXOcT8L4Yk16yX3DE9tbvdIcOqoKlEjn7yBuSlxIPRbOd58za4XGO/Lcvg0A==">());
      }

      return this.iIIIlIIIIi;
   }
}
