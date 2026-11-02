package gg.corz;

import java.util.IdentityHashMap;
import net.minecraft.class_2680;
import net.minecraft.class_5819;

public final class Iillililillili {
   final IilIiIIililIiIIi[][] iIilIIlIIl;
   final int IiilIIlIIl;
   final int[] IIilIIlIIl;
   final int[] iillIIlIIl;
   final IllliIIilllliIIi iiilIIlIIl;
   final IiliIIIililiIIIi[] lillIIlIIl;
   final boolean[] IlilIIlIIl;
   final int ililIIlIIl;
   final int llilIIlIIl;
   final int liilIIlIIl;
   final int[] lIilIIlIIl;

   private boolean IliIlllilIi(int a, int b) {
      IiliIIIililiIIIi var3 = this.lillIIlIIl[a];
      IiliIIIililiIIIi var4 = this.lillIIlIIl[b];
      return this.iillIIlIIl[a] < this.iillIIlIIl[b] + var4.IiIIIlliil
         && this.iillIIlIIl[b] < this.iillIIlIIl[a] + var3.IiIIIlliil
         && this.IIilIIlIIl[a] < this.IIilIIlIIl[b] + var4.liIIIlliil
         && this.IIilIIlIIl[b] < this.IIilIIlIIl[a] + var3.liIIIlliil
         && this.lIilIIlIIl[a] < this.lIilIIlIIl[b] + var4.iiIIIlliil
         && this.lIilIIlIIl[b] < this.lIilIIlIIl[a] + var3.iiIIIlliil;
   }

   IilIiIIililIiIIi liiiIIllIl(int wy, int wz, int wx) {
      long var6 = -4371548542533461854L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.lillIIlIIl.length; var8 += 4294967296L) {
         IilIiIIililIiIIi var5 = this.IilliliilIIi((int)(var8 >>> 32), wy, wz, wx);
         if (var5 != null && !var5.llIIlliiil) {
            return var5;
         }
      }

      return IilIiIIililIiIIi.iIIIlliiil;
   }

   Iillililillili(iIilliIlIlilliIl random, IllliIIilllliIIi s, class_5819 env) {
      long var17 = 7061401661482900302L;
      long var19 = 992402883153088334L;
      long var21 = 3171294392330580607L;
      long var23 = -7121613090003634285L;
      super();
      this.iiilIIlIIl = s;
      var17 ^= ((long)random.IIIliiiIll.size() << 32 ^ var17) & -1L << 32;
      this.lillIIlIIl = random.IIIliiiIll.toArray(new IiliIIIililiIIIi[0]);
      this.iillIIlIIl = new int[(int)(var17 >>> 32)];
      this.IIilIIlIIl = new int[(int)(var17 >>> 32)];
      this.lIilIIlIIl = new int[(int)(var17 >>> 32)];
      this.iIilIIlIIl = new IilIiIIililIiIIi[(int)(var17 >>> 32)][];
      this.IlilIIlIIl = new boolean[(int)(var17 >>> 32)];
      IdentityHashMap var5 = new IdentityHashMap();
      var17 ^= (2147483647L ^ var17) & -1L >>> 32;
      var19 ^= (9223372032559808512L ^ var19) & -1L << 32;
      var19 ^= (2147483647L ^ var19) & -1L >>> 32;
      var21 ^= (Long.MIN_VALUE ^ var21) & -1L << 32;
      var21 ^= (0L ^ var21) & -1L >>> 32;

      while ((int)var21 < (int)(var17 >>> 32)) {
         IiliIIIililiIIIi var11 = this.lillIIlIIl[(int)var21];
         this.iillIIlIIl[(int)var21] = var11.iIlIlllllill();
         this.IIilIIlIIl[(int)var21] = var11.IilliliilIIi();
         this.lIilIIlIIl[(int)var21] = var11.lIiiIiIlilli();
         var17 ^= ((long)Math.min((int)var17, this.iillIIlIIl[(int)var21]) ^ var17) & -1L >>> 32;
         var19 ^= ((long)Math.min((int)(var19 >>> 32), this.IIilIIlIIl[(int)var21]) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)Math.min((int)var19, this.lIilIIlIIl[(int)var21]) ^ var19) & -1L >>> 32;
         var21 ^= ((long)Math.max((int)(var21 >>> 32), this.IIilIIlIIl[(int)var21] + var11.liIIIlliil - 1) << 32 ^ var21) & -1L << 32;
         class_2680[] var12 = var11.IIlIIlliil;
         IilIiIIililIiIIi[] var13 = new IilIiIIililIiIIi[var12 == null ? 0 : var12.length];

         for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < var13.length; var23 += 4294967296L) {
            class_2680 var15 = var12[(int)(var23 >>> 32)];
            if (var15 != null && !var15.method_26215()) {
               IilIiIIililIiIIi var16 = (IilIiIIililIiIIi)var5.get(var15);
               if (var16 == null) {
                  var16 = new IilIiIIililIiIIi(var15, s, env);
                  var5.put(var15, var16);
               }

               var13[(int)(var23 >>> 32)] = var16;
            } else {
               var13[(int)(var23 >>> 32)] = IilIiIIililIiIIi.iIIIlliiil;
            }
         }

         this.iIilIIlIIl[(int)var21] = var13;

         for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
            if (this.IliIlllilIi((int)var21, (int)(var23 >>> 32))) {
               this.IlilIIlIIl[(int)var21] = true;
               break;
            }
         }

         var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32;
      }

      if ((int)(var17 >>> 32) == 0) {
         var19 ^= ((long)0 ^ var19) & -1L >>> 32;
         var19 ^= ((long)0 << 32 ^ var19) & -1L << 32;
         var17 ^= ((long)0 ^ var17) & -1L >>> 32;
         var21 ^= (0L ^ var21) & -1L << 32;
      }

      this.llilIIlIIl = (int)var17;
      this.ililIIlIIl = (int)(var19 >>> 32);
      this.IiilIIlIIl = (int)var19;
      this.liilIIlIIl = Math.max(1, (int)(var21 >>> 32) - (int)(var19 >>> 32) + 1);
   }

   int iIlIlllllill(int wz, int wy, int wx) {
      long var6 = -1475670947311764304L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.lillIIlIIl.length; var8 += 4294967296L) {
         IilIiIIililIiIIi var5 = this.IilliliilIIi((int)(var8 >>> 32), wz, wy, wx);
         if (var5 != null && !var5.llIIlliiil) {
            return (int)(var8 >>> 32);
         }
      }

      return -1;
   }

   boolean lIiiIiIlilli(int wz, int wx, int wy) {
      return this.liiiIIllIl(wz, wx, wy).ilIIlliiil;
   }

   private IilIiIIililIiIIi IilliliilIIi(int wx, int wy, int r, int wz) {
      long var11 = -6635759204909713366L;
      long var13 = 1672238730045976038L;
      IiliIIIililiIIIi var5 = this.lillIIlIIl[wx];
      var11 ^= ((long)(wy - this.iillIIlIIl[wx]) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(r - this.IIilIIlIIl[wx]) ^ var11) & -1L >>> 32;
      var13 ^= ((long)(wz - this.lIilIIlIIl[wx]) << 32 ^ var13) & -1L << 32;
      if ((int)(var11 >>> 32) >= 0
         && (int)var11 >= 0
         && (int)(var13 >>> 32) >= 0
         && (int)(var11 >>> 32) < var5.IiIIIlliil
         && (int)var11 < var5.liIIIlliil
         && (int)(var13 >>> 32) < var5.iiIIIlliil) {
         var13 ^= ((long)var5.iliIiiliiiii((int)(var11 >>> 32), (int)var11, (int)(var13 >>> 32)) ^ var13) & -1L >>> 32;
         IilIiIIililIiIIi[] var10 = this.iIilIIlIIl[wx];
         return (int)var13 >= 0 && (int)var13 < var10.length ? var10[(int)var13] : null;
      } else {
         return null;
      }
   }
}
